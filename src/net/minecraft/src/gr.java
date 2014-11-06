package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Queues;

/*   2:    */ import io.netty.bootstrap.Bootstrap;
/*   3:    */ import io.netty.channel.Channel;
/*   4:    */ import io.netty.channel.ChannelConfig;
/*   5:    */ import io.netty.channel.ChannelFuture;
/*   6:    */ import io.netty.channel.ChannelFutureListener;
/*   7:    */ import io.netty.channel.ChannelHandlerContext;
/*   8:    */ import io.netty.channel.ChannelPipeline;
/*   9:    */ import io.netty.channel.EventLoop;
/*  10:    */ import io.netty.channel.EventLoopGroup;
/*  11:    */ import io.netty.channel.SimpleChannelInboundHandler;
/*  12:    */ import io.netty.channel.local.LocalChannel;
/*  13:    */ import io.netty.channel.local.LocalServerChannel;
/*  14:    */ import io.netty.channel.socket.nio.NioSocketChannel;
/*  15:    */ import io.netty.util.Attribute;
/*  16:    */ import io.netty.util.AttributeKey;
/*  17:    */ import io.netty.util.concurrent.GenericFutureListener;

/*  18:    */ import java.net.InetAddress;
/*  19:    */ import java.net.SocketAddress;
/*  20:    */ import java.util.Queue;

/*  21:    */ import javax.crypto.SecretKey;

/*  22:    */ import org.apache.commons.lang3.ArrayUtils;
/*  23:    */ import org.apache.commons.lang3.Validate;
/*  24:    */ import org.apache.logging.log4j.LogManager;
/*  25:    */ import org.apache.logging.log4j.Logger;
/*  26:    */ import org.apache.logging.log4j.Marker;
/*  27:    */ import org.apache.logging.log4j.MarkerManager;
/*  28:    */ 
/*  29:    */ public class gr
/*  30:    */   extends SimpleChannelInboundHandler<id>
/*  31:    */ {
/*  32: 39 */   private static final Logger f = LogManager.getLogger();
/*  33: 40 */   public static final Marker a = MarkerManager.getMarker("NETWORK");
/*  34: 42 */   public static final Marker b = MarkerManager.getMarker("NETWORK_PACKETS", a);
/*  35: 43 */   public static final AttributeKey c = AttributeKey.valueOf("protocol");
/*  36: 44 */   public static final up d = new gs();
/*  37: 50 */   public static final up e = new gt();
/*  38:    */   private final ie g;
/*  39: 60 */   private final Queue h = Queues.newConcurrentLinkedQueue();
/*  40:    */   private Channel i;
/*  41:    */   private SocketAddress j;
/*  42:    */   private hg k;
/*  43:    */   private ho l;
/*  44:    */   private boolean m;
/*  45:    */   private boolean n;
/*  46:    */   
/*  47:    */   public gr(ie paramie)
/*  48:    */   {
/*  49: 69 */     this.g = paramie;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void channelActive(ChannelHandlerContext paramChannelHandlerContext) throws Exception
/*  53:    */   {
/*  54: 74 */     super.channelActive(paramChannelHandlerContext);
/*  55: 75 */     this.i = paramChannelHandlerContext.channel();
/*  56: 76 */     this.j = this.i.remoteAddress();
/*  57:    */     try
/*  58:    */     {
/*  59: 78 */       a(gy.a);
/*  60:    */     }
/*  61:    */     catch (Throwable localThrowable)
/*  62:    */     {
/*  63: 80 */       f.fatal(localThrowable);
/*  64:    */     }
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void a(gy paramgy)
/*  68:    */   {
/*  69: 85 */     this.i.attr(c).set(paramgy);
/*  70: 86 */     this.i.config().setAutoRead(true);
/*  71: 87 */     f.debug("Enabled auto read");
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void channelInactive(ChannelHandlerContext paramChannelHandlerContext)
/*  75:    */   {
/*  76: 92 */     a(new hz("disconnect.endOfStream", new Object[0]));
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void exceptionCaught(ChannelHandlerContext paramChannelHandlerContext, Throwable paramThrowable)
/*  80:    */   {
/*  81: 97 */     f.debug("Disconnecting " + b(), paramThrowable);
/*  82: 98 */     a(new hz("disconnect.genericReason", new Object[] { "Internal Exception: " + paramThrowable }));
/*  83:    */   }
/*  84:    */   
/*  85:    */   protected void channelRead0(ChannelHandlerContext paramChannelHandlerContext, id paramid)
/*  86:    */   {
/*  87:104 */     if (this.i.isOpen()) {
/*  88:    */       try
/*  89:    */       {
/*  90:106 */         paramid.a(this.k);
/*  91:    */       }
/*  92:    */       catch (pi localpi) {}
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void a(hg paramhg)
/*  97:    */   {
/*  98:113 */     Validate.notNull(paramhg, "packetListener", new Object[0]);
/*  99:114 */     f.debug("Set listener of {} to {}", new Object[] { this, paramhg });
/* 100:115 */     this.k = paramhg;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void a(id paramid)
/* 104:    */   {
/* 105:119 */     if ((this.i != null) && (this.i.isOpen()))
/* 106:    */     {
/* 107:120 */       m();
/* 108:121 */       a(paramid, null);
/* 109:    */     }
/* 110:    */     else
/* 111:    */     {
/* 112:123 */       this.h.add(new gx(paramid, null));
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void a(id paramid, GenericFutureListener paramGenericFutureListener, GenericFutureListener... paramVarArgs)
/* 117:    */   {
/* 118:128 */     if ((this.i != null) && (this.i.isOpen()))
/* 119:    */     {
/* 120:129 */       m();
/* 121:130 */       a(paramid, (GenericFutureListener[])ArrayUtils.add(paramVarArgs, 0, paramGenericFutureListener));
/* 122:    */     }
/* 123:    */     else
/* 124:    */     {
/* 125:132 */       this.h.add(new gx(paramid, (GenericFutureListener[])ArrayUtils.add(paramVarArgs, 0, paramGenericFutureListener)));
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   private void a(id paramid, GenericFutureListener[] paramArrayOfGenericFutureListener)
/* 130:    */   {
/* 131:137 */     gy localgy1 = gy.a(paramid);
/* 132:138 */     gy localgy2 = (gy)this.i.attr(c).get();
/* 133:140 */     if (localgy2 != localgy1)
/* 134:    */     {
/* 135:141 */       f.debug("Disabled auto read");
/* 136:142 */       this.i.config().setAutoRead(false);
/* 137:    */     }
/* 138:145 */     if (this.i.eventLoop().inEventLoop())
/* 139:    */     {
/* 140:146 */       if (localgy1 != localgy2) {
/* 141:147 */         a(localgy1);
/* 142:    */       }
/* 143:149 */       ChannelFuture localChannelFuture = this.i.writeAndFlush(paramid);
/* 144:150 */       if (paramArrayOfGenericFutureListener != null) {
/* 145:151 */         localChannelFuture.addListeners(paramArrayOfGenericFutureListener);
/* 146:    */       }
/* 147:153 */       localChannelFuture.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
/* 148:    */     }
/* 149:    */     else
/* 150:    */     {
/* 151:155 */       this.i.eventLoop().execute(new gu(this, localgy1, localgy2, paramid, paramArrayOfGenericFutureListener));
/* 152:    */     }
/* 153:    */   }
/* 154:    */   
/* 155:    */   private void m()
/* 156:    */   {
/* 157:172 */     if ((this.i == null) || (!this.i.isOpen())) {
/* 158:173 */       return;
/* 159:    */     }
/* 160:176 */     while (!this.h.isEmpty())
/* 161:    */     {
/* 162:177 */       gx localgx = (gx)this.h.poll();
/* 163:178 */       a(gx.a(localgx), gx.b(localgx));
/* 164:    */     }
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void a()
/* 168:    */   {
/* 169:184 */     m();
/* 170:186 */     if ((this.k instanceof pm)) {
/* 171:187 */       ((pm)this.k).c();
/* 172:    */     }
/* 173:190 */     this.i.flush();
/* 174:    */   }
/* 175:    */   
/* 176:    */   public SocketAddress b()
/* 177:    */   {
/* 178:194 */     return this.j;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void a(ho paramho)
/* 182:    */   {
/* 183:198 */     if (this.i.isOpen())
/* 184:    */     {
/* 185:199 */       this.i.close().awaitUninterruptibly();
/* 186:    */       
/* 187:201 */       this.l = paramho;
/* 188:    */     }
/* 189:    */   }
/* 190:    */   
/* 191:    */   public boolean c()
/* 192:    */   {
/* 193:206 */     return ((this.i instanceof LocalChannel)) || ((this.i instanceof LocalServerChannel));
/* 194:    */   }
/* 195:    */   
/* 196:    */   public static gr a(InetAddress paramInetAddress, int paramInt)
/* 197:    */   {
/* 198:218 */     gr localgr = new gr(ie.b);
/* 199:    */     
/* 200:220 */     ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)d.c())).handler(new gv(localgr))).channel(NioSocketChannel.class)).connect(paramInetAddress, paramInt).syncUninterruptibly();
/* 201:    */     
/* 202:    */ 
/* 203:    */ 
/* 204:    */ 
/* 205:    */ 
/* 206:    */ 
/* 207:    */ 
/* 208:    */ 
/* 209:    */ 
/* 210:    */ 
/* 211:    */ 
/* 212:    */ 
/* 213:    */ 
/* 214:    */ 
/* 215:    */ 
/* 216:    */ 
/* 217:    */ 
/* 218:    */ 
/* 219:    */ 
/* 220:    */ 
/* 221:    */ 
/* 222:    */ 
/* 223:    */ 
/* 224:    */ 
/* 225:    */ 
/* 226:    */ 
/* 227:    */ 
/* 228:    */ 
/* 229:    */ 
/* 230:    */ 
/* 231:251 */     return localgr;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public static gr a(SocketAddress paramSocketAddress)
/* 235:    */   {
/* 236:255 */     gr localgr = new gr(ie.b);
/* 237:    */     
/* 238:257 */     ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)e.c())).handler(new gw(localgr))).channel(LocalChannel.class)).connect(paramSocketAddress).syncUninterruptibly();
/* 239:    */     
/* 240:    */ 
/* 241:    */ 
/* 242:    */ 
/* 243:    */ 
/* 244:    */ 
/* 245:264 */     return localgr;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public void a(SecretKey paramSecretKey)
/* 249:    */   {
/* 250:268 */     this.m = true;
/* 251:269 */     this.i.pipeline().addBefore("splitter", "decrypt", new gn(ug.a(2, paramSecretKey)));
/* 252:270 */     this.i.pipeline().addBefore("prepender", "encrypt", new go(ug.a(1, paramSecretKey)));
/* 253:    */   }
/* 254:    */   
/* 255:    */   public boolean f()
/* 256:    */   {
/* 257:274 */     return this.m;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public boolean g()
/* 261:    */   {
/* 262:278 */     return (this.i != null) && (this.i.isOpen());
/* 263:    */   }
/* 264:    */   
/* 265:    */   public boolean h()
/* 266:    */   {
/* 267:282 */     return this.i == null;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public hg i()
/* 271:    */   {
/* 272:286 */     return this.k;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public ho j()
/* 276:    */   {
/* 277:290 */     return this.l;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public void k()
/* 281:    */   {
/* 282:294 */     this.i.config().setAutoRead(false);
/* 283:    */   }
/* 284:    */   
/* 285:    */   public void a(int paramInt)
/* 286:    */   {
/* 287:298 */     if (paramInt >= 0)
/* 288:    */     {
/* 289:299 */       if ((this.i.pipeline().get("decompress") instanceof gp)) {
/* 290:300 */         ((gp)this.i.pipeline().get("decompress")).a(paramInt);
/* 291:    */       } else {
/* 292:302 */         this.i.pipeline().addBefore("decoder", "decompress", new gp(paramInt));
/* 293:    */       }
/* 294:305 */       if ((this.i.pipeline().get("compress") instanceof gq)) {
/* 295:306 */         ((gq)this.i.pipeline().get("decompress")).a(paramInt);
/* 296:    */       } else {
/* 297:308 */         this.i.pipeline().addBefore("encoder", "compress", new gq(paramInt));
/* 298:    */       }
/* 299:    */     }
/* 300:    */     else
/* 301:    */     {
/* 302:311 */       if ((this.i.pipeline().get("decompress") instanceof gp)) {
/* 303:312 */         this.i.pipeline().remove("decompress");
/* 304:    */       }
/* 305:315 */       if ((this.i.pipeline().get("compress") instanceof gq)) {
/* 306:316 */         this.i.pipeline().remove("compress");
/* 307:    */       }
/* 308:    */     }
/* 309:    */   }
/* 310:    */   
/* 311:    */   public void l()
/* 312:    */   {
/* 313:322 */     if ((!h()) && (!g()) && 
/* 314:323 */       (!this.n))
/* 315:    */     {
/* 316:324 */       this.n = true;
/* 317:325 */       if (j() != null) {
/* 318:326 */         i().a(j());
/* 319:327 */       } else if (i() != null) {
/* 320:328 */         i().a(new hy("Disconnected"));
/* 321:    */       }
/* 322:    */     }
/* 323:    */   }
				static Channel a(gr arg0) {return arg0.i;}
/* 324:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gr
 * JD-Core Version:    0.7.0.1
 */