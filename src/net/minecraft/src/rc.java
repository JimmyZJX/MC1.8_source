package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import io.netty.bootstrap.ServerBootstrap;
/*   4:    */ import io.netty.channel.ChannelFuture;
/*   5:    */ import io.netty.channel.EventLoopGroup;
/*   6:    */ import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalEventLoopGroup;
/*   7:    */ import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
/*   8:    */ import io.netty.channel.socket.nio.NioServerSocketChannel;
/*   9:    */ import io.netty.util.concurrent.GenericFutureListener;

/*  10:    */ import java.net.InetAddress;
/*  11:    */ import java.net.SocketAddress;
/*  12:    */ import java.util.Collections;
/*  13:    */ import java.util.Iterator;
/*  14:    */ import java.util.List;

/*  15:    */ import net.minecraft.server.MinecraftServer;

/*  16:    */ import org.apache.logging.log4j.LogManager;
/*  17:    */ import org.apache.logging.log4j.Logger;
/*  18:    */ 
/*  19:    */ public class rc
/*  20:    */ {
/*  21: 36 */   private static final Logger d = LogManager.getLogger();
/*  22: 37 */   public static final up<NioEventLoopGroup> a = new rd();
/*  23: 43 */   public static final up<LocalEventLoopGroup> b = new re();
/*  24:    */   private final MinecraftServer e;
/*  25:    */   public volatile boolean c;
/*  26: 52 */   private final List<ChannelFuture> f = Collections.synchronizedList(Lists.<ChannelFuture>newArrayList());
/*  27: 53 */   private final List<gr> g = Collections.synchronizedList(Lists.<gr>newArrayList());
/*  28:    */   
/*  29:    */   public rc(MinecraftServer paramMinecraftServer)
/*  30:    */   {
/*  31: 56 */     this.e = paramMinecraftServer;
/*  32: 57 */     this.c = true;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void a(InetAddress paramInetAddress, int paramInt)
/*  36:    */   {
/*  37: 61 */     synchronized (this.f)
/*  38:    */     {
/*  39: 62 */       this.f.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(NioServerSocketChannel.class)).childHandler(new rf(this)).group((EventLoopGroup)a.c()).localAddress(paramInetAddress, paramInt)).bind().syncUninterruptibly());
/*  40:    */     }
/*  41:    */   }
/*  42:    */   
/*  43:    */   public SocketAddress a()
/*  44:    */   {
/*  45:    */     ChannelFuture localChannelFuture;
/*  46:103 */     synchronized (this.f)
/*  47:    */     {
/*  48:104 */       localChannelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler(new rg(this)).group((EventLoopGroup)a.c()).localAddress(LocalAddress.ANY)).bind().syncUninterruptibly();
/*  49:    */       
/*  50:    */ 
/*  51:    */ 
/*  52:    */ 
/*  53:    */ 
/*  54:    */ 
/*  55:    */ 
/*  56:    */ 
/*  57:    */ 
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62:    */ 
/*  63:    */ 
/*  64:120 */       this.f.add(localChannelFuture);
/*  65:    */     }
/*  66:123 */     return localChannelFuture.channel().localAddress();
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void b()
/*  70:    */   {
/*  71:127 */     this.c = false;
/*  72:129 */     for (ChannelFuture localChannelFuture : this.f) {
/*  73:    */       try
/*  74:    */       {
/*  75:131 */         localChannelFuture.channel().close().sync();
/*  76:    */       }
/*  77:    */       catch (InterruptedException localInterruptedException)
/*  78:    */       {
/*  79:133 */         d.error("Interrupted whilst closing channel");
/*  80:    */       }
/*  81:    */     }
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void c()
/*  85:    */   {
/*  86:139 */     synchronized (this.g)
/*  87:    */     {
/*  88:140 */       Iterator<gr> localIterator = this.g.iterator();
/*  89:142 */       while (localIterator.hasNext())
/*  90:    */       {
/*  91:143 */         gr localgr = (gr)localIterator.next();
/*  92:145 */         if (!localgr.h()) {
/*  93:146 */           if (!localgr.g())
/*  94:    */           {
/*  95:147 */             localIterator.remove();
/*  96:148 */             localgr.l();
/*  97:    */           }
/*  98:    */           else
/*  99:    */           {
/* 100:    */             try
/* 101:    */             {
/* 102:151 */               localgr.a();
/* 103:    */             }
/* 104:    */             catch (Exception localException)
/* 105:    */             {
/* 106:153 */               if (localgr.c())
/* 107:    */               {
/* 108:154 */                 b localObject1 = net.minecraft.src.b.a(localException, "Ticking memory connection");
/* 109:155 */                 j localj = ((b)localObject1).a("Ticking connection");
/* 110:    */                 
/* 111:157 */                 localj.a("Connection", new rh(this, localgr));
/* 112:    */                 
/* 113:    */ 
/* 114:    */ 
/* 115:    */ 
/* 116:    */ 
/* 117:    */ 
/* 118:164 */                 throw new u((b)localObject1);
/* 119:    */               }
/* 120:166 */               d.warn("Failed to handle packet for " + localgr.b(), localException);
/* 121:167 */               Object localObject1 = new hy("Internal server error");
/* 122:168 */               localgr.a(new jj((ho)localObject1), new ri(this, localgr, (hy)localObject1), new GenericFutureListener[0]);
/* 123:    */               
/* 124:    */ 
/* 125:    */ 
/* 126:    */ 
/* 127:    */ 
/* 128:174 */               localgr.k();
/* 129:    */             }
/* 130:    */           }
/* 131:    */         }
/* 132:    */       }
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   public MinecraftServer d()
/* 137:    */   {
/* 138:184 */     return this.e;
/* 139:    */   }
				static List<gr> a(rc arg0) {return arg0.g;}
				static MinecraftServer b(rc arg0) {return arg0.e;}
/* 140:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rc
 * JD-Core Version:    0.7.0.1
 */