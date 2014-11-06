package net.minecraft.src;
/*   1:    */ import com.google.common.util.concurrent.Futures;
/*   2:    */ import java.io.File;
/*   3:    */ import java.io.IOException;
/*   4:    */ import java.util.Queue;
/*   5:    */ import java.util.concurrent.FutureTask;
/*   6:    */ import net.minecraft.server.MinecraftServer;
/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public class cyk
/*  11:    */   extends MinecraftServer
/*  12:    */ {
/*  13: 32 */   private static final Logger j = LogManager.getLogger();
/*  14:    */   private final bsu k;
/*  15:    */   private final WorldSettings l;
/*  16:    */   private boolean m;
/*  17:    */   private boolean n;
/*  18:    */   private cyt o;
/*  19:    */   
/*  20:    */   public cyk(bsu parambsu)
/*  21:    */   {
/*  22: 40 */     super(parambsu.M(), new File(parambsu.v, a.getName()));
/*  23: 41 */     this.k = parambsu;
/*  24: 42 */     this.l = null;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public cyk(bsu parambsu, String paramString1, String paramString2, WorldSettings paramarb)
/*  28:    */   {
/*  29: 46 */     super(new File(parambsu.v, "saves"), parambsu.M(), new File(parambsu.v, a.getName()));
/*  30:    */     
/*  31: 48 */     j(parambsu.K().c());
/*  32: 49 */     k(paramString1);
/*  33: 50 */     l(paramString2);
/*  34: 51 */     b(parambsu.s());
/*  35: 52 */     c(paramarb.c());
/*  36: 53 */     c(256);
/*  37: 54 */     a(new cyj(this));
/*  38:    */     
/*  39: 56 */     this.k = parambsu;
/*  40: 57 */     this.l = (W() ? qj.a : paramarb);
/*  41:    */   }
/*  42:    */   
/*  43:    */   protected cl h()
/*  44:    */   {
/*  45: 62 */     return new cyo();
/*  46:    */   }
/*  47:    */   
/*  48:    */   protected void a(String paramString1, String paramString2, long paramLong, WorldType paramare, String paramString3)
/*  49:    */   {
/*  50: 67 */     a(paramString1);
/*  51:    */     
/*  52: 69 */     this.c = new WorldServer[3];
/*  53: 70 */     this.h = new long[this.c.length][100];
/*  54:    */     
/*  55: 72 */     bqy localbqy = X().a(paramString1, true);
/*  56: 73 */     a(T(), localbqy);
/*  57:    */     
/*  58: 75 */     WorldInfo localbqo = localbqy.d();
/*  59: 76 */     if (localbqo == null) {
/*  60: 77 */       localbqo = new WorldInfo(this.l, paramString2);
/*  61:    */     } else {
/*  62: 79 */       localbqo.a(paramString2);
/*  63:    */     }
/*  64: 82 */     for (int i = 0; i < this.c.length; i++)
/*  65:    */     {
/*  66: 83 */       int i1 = 0;
/*  67: 84 */       if (i == 1) {
/*  68: 85 */         i1 = -1;
/*  69:    */       }
/*  70: 87 */       if (i == 2) {
/*  71: 88 */         i1 = 1;
/*  72:    */       }
/*  73: 91 */       if (i == 0)
/*  74:    */       {
/*  75: 92 */         if (W()) {
/*  76: 93 */           this.c[i] = ((WorldServer)new qj(this, localbqy, localbqo, i1, this.b).getSelf());
/*  77:    */         } else {
/*  78: 95 */           this.c[i] = ((WorldServer)new WorldServer(this, localbqy, localbqo, i1, this.b).getSelf());
/*  79:    */         }
/*  80: 97 */         this.c[i].a(this.l);
/*  81:    */       }
/*  82:    */       else
/*  83:    */       {
/*  84: 99 */         this.c[i] = ((WorldServer)new ql(this, localbqy, i1, this.c[0], this.b).getSelf());
/*  85:    */       }
/*  86:102 */       this.c[i].addWorldAccess(new qp(this, this.c[i]));
/*  87:    */     }
/*  88:105 */     an().a(this.c);
/*  89:107 */     if (this.c[0].getWorldInfo().y() == null) {
/*  90:108 */       a(this.k.t.av);
/*  91:    */     }
/*  92:111 */     k();
/*  93:    */   }
/*  94:    */   
/*  95:    */   protected boolean i()
/*  96:    */   {
/*  97:116 */     j.info("Starting integrated minecraft server version 1.8");
/*  98:    */     
/*  99:118 */     d(true);
/* 100:119 */     e(true);
/* 101:120 */     f(true);
/* 102:121 */     g(true);
/* 103:122 */     h(true);
/* 104:    */     
/* 105:124 */     j.info("Generating keypair");
/* 106:125 */     a(ug.b());
/* 107:    */     
/* 108:127 */     a(T(), U(), this.l.getSeed(), this.l.h(), this.l.j());
/* 109:128 */     m(R() + " - " + this.c[0].getWorldInfo().k());
/* 110:    */     
/* 111:130 */     return true;
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected void y()
/* 115:    */   {
/* 116:135 */     boolean bool = this.m;
/* 117:136 */     this.m = ((bsu.z().t() != null) && (bsu.z().T()));
/* 118:138 */     if ((!bool) && (this.m))
/* 119:    */     {
/* 120:139 */       j.info("Saving and pausing game...");
/* 121:140 */       an().k();
/* 122:141 */       a(false);
/* 123:    */     }
/* 124:144 */     if (this.m)
/* 125:    */     {
/* 126:145 */       synchronized (this.i)
/* 127:    */       {
/* 128:146 */         while (!this.i.isEmpty()) {
/* 129:    */           try
/* 130:    */           {
/* 131:148 */             ((FutureTask)this.i.poll()).run();
/* 132:    */           }
/* 133:    */           catch (Throwable localThrowable)
/* 134:    */           {
/* 135:150 */             j.fatal(localThrowable);
/* 136:    */           }
/* 137:    */         }
/* 138:    */       }
/* 139:    */     }
/* 140:    */     else
/* 141:    */     {
/* 142:155 */       super.y();
/* 143:157 */       if (this.k.t.c != an().t())
/* 144:    */       {
/* 145:158 */         j.info("Changing view distance to {}, from {}", new Object[] { Integer.valueOf(this.k.t.c), Integer.valueOf(an().t()) });
/* 146:159 */         an().a(this.k.t.c);
/* 147:    */       }
/* 148:162 */       if (this.k.f != null)
/* 149:    */       {
/* 150:163 */         WorldInfo localbqo1 = this.c[0].getWorldInfo();
/* 151:164 */         WorldInfo localbqo = this.k.f.getWorldInfo();
/* 152:166 */         if ((!localbqo1.z()) && (localbqo.y() != localbqo1.y()))
/* 153:    */         {
/* 154:167 */           j.info("Changing difficulty to {}, from {}", new Object[] { localbqo.y(), localbqo1.y() });
/* 155:168 */           a(localbqo.y());
/* 156:    */         }
/* 157:169 */         else if ((localbqo.z()) && (!localbqo1.z()))
/* 158:    */         {
/* 159:170 */           j.info("Locking difficulty to {}", new Object[] { localbqo.y() });
/* 160:172 */           for (WorldServer localqt : this.c) {
/* 161:173 */             if (localqt != null) {
/* 162:174 */               localqt.getWorldInfo().e(true);
/* 163:    */             }
/* 164:    */           }
/* 165:    */         }
/* 166:    */       }
/* 167:    */     }
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean l()
/* 171:    */   {
/* 172:184 */     return false;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public EnumGameType m()
/* 176:    */   {
/* 177:189 */     return this.l.getGameType();
/* 178:    */   }
/* 179:    */   
/* 180:    */   public EnumDifficulty n()
/* 181:    */   {
/* 182:194 */     return this.k.f.getWorldInfo().y();
/* 183:    */   }
/* 184:    */   
/* 185:    */   public boolean o()
/* 186:    */   {
/* 187:199 */     return this.l.f();
/* 188:    */   }
/* 189:    */   
/* 190:    */   public File w()
/* 191:    */   {
/* 192:204 */     return this.k.v;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public boolean ad()
/* 196:    */   {
/* 197:209 */     return false;
/* 198:    */   }
/* 199:    */   
/* 200:    */   protected void a(b paramb)
/* 201:    */   {
/* 202:214 */     this.k.a(paramb);
/* 203:    */   }
/* 204:    */   
/* 205:    */   public b b(b paramb)
/* 206:    */   {
/* 207:219 */     paramb = super.b(paramb);
/* 208:    */     
/* 209:221 */     paramb.g().a("Type", new cyl(this));
/* 210:    */     
/* 211:    */ 
/* 212:    */ 
/* 213:    */ 
/* 214:    */ 
/* 215:    */ 
/* 216:228 */     paramb.g().a("Is Modded", new cym(this));
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
/* 231:    */ 
/* 232:    */ 
/* 233:    */ 
/* 234:    */ 
/* 235:    */ 
/* 236:248 */     return paramb;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void a(EnumDifficulty paramvt)
/* 240:    */   {
/* 241:253 */     super.a(paramvt);
/* 242:254 */     if (this.k.f != null) {
/* 243:255 */       this.k.f.getWorldInfo().setDifficulty(paramvt);
/* 244:    */     }
/* 245:    */   }
/* 246:    */   
/* 247:    */   public void a(wb paramwb)
/* 248:    */   {
/* 249:261 */     super.a(paramwb);
/* 250:    */     
/* 251:263 */     paramwb.a("snooper_partner", this.k.H().f());
/* 252:    */   }
/* 253:    */   
/* 254:    */   public boolean ac()
/* 255:    */   {
/* 256:268 */     return bsu.z().ac();
/* 257:    */   }
/* 258:    */   
/* 259:    */   public String a(EnumGameType paramarc, boolean paramBoolean)
/* 260:    */   {
/* 261:    */     try
/* 262:    */     {
/* 263:274 */       int i = -1;
/* 264:    */       try
/* 265:    */       {
/* 266:277 */         i = ui.a();
/* 267:    */       }
/* 268:    */       catch (IOException localIOException2) {}
/* 269:281 */       if (i <= 0) {
/* 270:282 */         i = 25564;
/* 271:    */       }
/* 272:285 */       ao().a(null, i);
/* 273:286 */       j.info("Started on " + i);
/* 274:287 */       this.n = true;
/* 275:    */       
/* 276:289 */       this.o = new cyt(ak(), i + "");
/* 277:290 */       this.o.start();
/* 278:    */       
/* 279:292 */       an().a(paramarc);
/* 280:293 */       an().b(paramBoolean);
/* 281:    */       
/* 282:295 */       return i + "";
/* 283:    */     }
/* 284:    */     catch (IOException localIOException1) {}
/* 285:298 */     return null;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public void r()
/* 289:    */   {
/* 290:303 */     super.r();
/* 291:305 */     if (this.o != null)
/* 292:    */     {
/* 293:306 */       this.o.interrupt();
/* 294:307 */       this.o = null;
/* 295:    */     }
/* 296:    */   }
/* 297:    */   
/* 298:    */   public void u()
/* 299:    */   {
/* 300:313 */     Futures.getUnchecked(a(new cyn(this)));
/* 301:    */     
/* 302:    */ 
/* 303:    */ 
/* 304:    */ 
/* 305:    */ 
/* 306:    */ 
/* 307:    */ 
/* 308:    */ 
/* 309:    */ 
/* 310:323 */     super.u();
/* 311:325 */     if (this.o != null)
/* 312:    */     {
/* 313:326 */       this.o.interrupt();
/* 314:327 */       this.o = null;
/* 315:    */     }
/* 316:    */   }
/* 317:    */   
/* 318:    */   public void a()
/* 319:    */   {
/* 320:332 */     v();
/* 321:    */   }
/* 322:    */   
/* 323:    */   public boolean b()
/* 324:    */   {
/* 325:336 */     return this.n;
/* 326:    */   }
/* 327:    */   
/* 328:    */   public void a(EnumGameType paramarc)
/* 329:    */   {
/* 330:341 */     an().a(paramarc);
/* 331:    */   }
/* 332:    */   
/* 333:    */   public boolean aj()
/* 334:    */   {
/* 335:346 */     return true;
/* 336:    */   }
/* 337:    */   
/* 338:    */   public int p()
/* 339:    */   {
/* 340:351 */     return 4;
/* 341:    */   }
/* 342:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyk
 * JD-Core Version:    0.7.0.1
 */