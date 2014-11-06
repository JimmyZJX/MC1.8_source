package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class EntityRabbit
/*   4:    */   extends EntityAnimal
/*   5:    */ {
/*   6:    */   private acf bk;
/*   7: 62 */   private int bm = 0;
/*   8: 63 */   private int bn = 0;
/*   9: 64 */   private boolean bo = false;
/*  10: 68 */   private boolean bp = false;
/*  11: 69 */   private int bq = 0;
/*  12: 70 */   private ace br = ace.b;
/*  13: 72 */   private int bs = 0;
/*  14:    */   
/*  15:    */   public EntityRabbit(World paramaqu)
/*  16:    */   {
/*  17: 75 */     super(paramaqu);
/*  18: 76 */     a(0.6F, 0.7F);
/*  19:    */     
/*  20: 78 */     this.g = new ach(this, this);
/*  21:    */     
/*  22: 80 */     this.f = new aci(this);
/*  23:    */     
/*  24: 82 */     ((aay)s()).a(true);
/*  25: 83 */     this.h.a(2.5F);
/*  26:    */     
/*  27: 85 */     this.i.a(1, new yy(this));
/*  28: 86 */     this.i.a(1, new acj(this, 1.33D));
/*  29: 87 */     this.i.a(2, new aag(this, 1.0D, ItemList.carrot, false));
/*  30: 88 */     this.i.a(3, new yt(this, 0.8D));
/*  31: 89 */     this.i.a(5, new ack(this));
/*  32: 90 */     this.i.a(5, new zy(this, 0.6D));
/*  33: 91 */     this.i.a(11, new zh(this, EntityPlayer.class, 10.0F));
/*  34:    */     
/*  35: 93 */     this.bk = new acf(this, new acc(this), 16.0F, 1.33D, 1.33D);
/*  36:    */     
/*  37:    */ 
/*  38:    */ 
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:100 */     this.i.a(4, this.bk);
/*  43:    */     
/*  44:102 */     b(0.0D);
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected float bD()
/*  48:    */   {
/*  49:107 */     if ((this.f.a()) && (this.f.e() > this.yPos + 0.5D)) {
/*  50:108 */       return 0.5F;
/*  51:    */     }
/*  52:110 */     return this.br.b();
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a(ace paramace)
/*  56:    */   {
/*  57:114 */     this.br = paramace;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public float o(float paramFloat)
/*  61:    */   {
/*  62:118 */     if (this.bn == 0) {
/*  63:119 */       return 0.0F;
/*  64:    */     }
/*  65:121 */     return (this.bm + paramFloat) / this.bn;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void b(double paramDouble)
/*  69:    */   {
/*  70:125 */     s().a(paramDouble);
/*  71:126 */     this.f.a(this.f.d(), this.f.e(), this.f.f(), paramDouble);
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void a(boolean paramBoolean, ace paramace)
/*  75:    */   {
/*  76:130 */     super.i(paramBoolean);
/*  77:131 */     if (!paramBoolean)
/*  78:    */     {
/*  79:132 */       if (this.br == ace.e) {
/*  80:133 */         this.br = ace.b;
/*  81:    */       }
/*  82:    */     }
/*  83:    */     else
/*  84:    */     {
/*  85:136 */       b(1.5D * paramace.a());
/*  86:137 */       a(ck(), bA(), ((this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*  87:    */     }
/*  88:139 */     this.bo = paramBoolean;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void b(ace paramace)
/*  92:    */   {
/*  93:143 */     a(true, paramace);
/*  94:144 */     this.bn = paramace.d();
/*  95:145 */     this.bm = 0;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public boolean cj()
/*  99:    */   {
/* 100:149 */     return this.bo;
/* 101:    */   }
/* 102:    */   
/* 103:    */   protected void h()
/* 104:    */   {
/* 105:154 */     super.h();
/* 106:    */     
/* 107:156 */     this.ac.a(18, Byte.valueOf((byte)0));
/* 108:    */   }
/* 109:    */   
/* 110:159 */   private EntityPlayer bt = null;
/* 111:    */   
/* 112:    */   public void E()
/* 113:    */   {
/* 114:163 */     if (this.f.b() > 0.8D) {
/* 115:164 */       a(ace.d);
/* 116:166 */     } else if (this.br != ace.e) {
/* 117:167 */       a(ace.b);
/* 118:    */     }
/* 119:170 */     if (this.bq > 0) {
/* 120:171 */       this.bq -= 1;
/* 121:    */     }
/* 122:174 */     if (this.bs > 0)
/* 123:    */     {
/* 124:175 */       this.bs -= this.random.nextInt(3);
/* 125:176 */       if (this.bs < 0) {
/* 126:177 */         this.bs = 0;
/* 127:    */       }
/* 128:    */     }
/* 129:181 */     if (this.C)
/* 130:    */     {
/* 131:182 */       if (!this.bp)
/* 132:    */       {
/* 133:183 */         a(false, ace.a);
/* 134:184 */         cu();
/* 135:    */       }
/* 136:187 */       if ((cl() == 99) && (this.bq == 0))
/* 137:    */       {
/* 138:188 */         EntityLiving localObject = u();
/* 139:189 */         if ((localObject != null) && (h((Entity)localObject) < 16.0D))
/* 140:    */         {
/* 141:190 */           a(((EntityLiving)localObject).xPos, ((EntityLiving)localObject).zPos);
/* 142:191 */           this.f.a(((EntityLiving)localObject).xPos, ((EntityLiving)localObject).yPos, ((EntityLiving)localObject).zPos, this.f.b());
/* 143:192 */           b(ace.e);
/* 144:193 */           this.bp = true;
/* 145:    */         }
/* 146:    */       }
/* 147:197 */       Object localObject = (ach)this.g;
/* 148:198 */       if (!((ach)localObject).c())
/* 149:    */       {
/* 150:199 */         if ((this.f.a()) && (this.bq == 0))
/* 151:    */         {
/* 152:200 */           bpv localbpv = this.h.j();
/* 153:201 */           Vec3 localbrw = new Vec3(this.f.d(), this.f.e(), this.f.f());
/* 154:202 */           if ((localbpv != null) && (localbpv.e() < localbpv.d())) {
/* 155:203 */             localbrw = localbpv.a(this);
/* 156:    */           }
/* 157:205 */           a(localbrw.x, localbrw.z);
/* 158:206 */           b(this.br);
/* 159:    */         }
/* 160:    */       }
/* 161:208 */       else if (!((ach)localObject).d()) {
/* 162:209 */         cr();
/* 163:    */       }
/* 164:    */     }
/* 165:213 */     this.bp = this.C;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void Y() {}
/* 169:    */   
/* 170:    */   private void a(double paramDouble1, double paramDouble2)
/* 171:    */   {
/* 172:222 */     this.yaw = ((float)(Math.atan2(paramDouble2 - this.zPos, paramDouble1 - this.xPos) * 180.0D / 3.141592741012573D) - 90.0F);
/* 173:    */   }
/* 174:    */   
/* 175:    */   private void cr()
/* 176:    */   {
/* 177:226 */     ((ach)this.g).a(true);
/* 178:    */   }
/* 179:    */   
/* 180:    */   private void cs()
/* 181:    */   {
/* 182:230 */     ((ach)this.g).a(false);
/* 183:    */   }
/* 184:    */   
/* 185:    */   private void ct()
/* 186:    */   {
/* 187:234 */     this.bq = cm();
/* 188:    */   }
/* 189:    */   
/* 190:    */   private void cu()
/* 191:    */   {
/* 192:238 */     ct();
/* 193:239 */     cs();
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void m()
/* 197:    */   {
/* 198:244 */     super.m();
/* 199:245 */     if (this.bm != this.bn)
/* 200:    */     {
/* 201:246 */       if ((this.bm == 0) && (!this.world.isClient)) {
/* 202:247 */         this.world.a(this, (byte)1);
/* 203:    */       }
/* 204:249 */       this.bm += 1;
/* 205:    */     }
/* 206:250 */     else if (this.bn != 0)
/* 207:    */     {
/* 208:251 */       this.bm = 0;
/* 209:252 */       this.bn = 0;
/* 210:    */     }
/* 211:    */   }
/* 212:    */   
/* 213:    */   protected void aW()
/* 214:    */   {
/* 215:258 */     super.aW();
/* 216:    */     
/* 217:260 */     a(afs.a).a(10.0D);
/* 218:261 */     a(afs.d).a(0.300000011920929D);
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 222:    */   {
/* 223:266 */     super.writeEntityToNBT(paramfn);
/* 224:267 */     paramfn.setInt("RabbitType", cl());
/* 225:268 */     paramfn.setInt("MoreCarrotTicks", this.bs);
/* 226:    */   }
/* 227:    */   
/* 228:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 229:    */   {
/* 230:273 */     super.readEntityFromNBT(paramfn);
/* 231:274 */     r(paramfn.getInteger("RabbitType"));
/* 232:275 */     this.bs = paramfn.getInteger("MoreCarrotTicks");
/* 233:    */   }
/* 234:    */   
/* 235:    */   protected String ck()
/* 236:    */   {
/* 237:279 */     return "mob.rabbit.hop";
/* 238:    */   }
/* 239:    */   
/* 240:    */   protected String z()
/* 241:    */   {
/* 242:284 */     return "mob.rabbit.idle";
/* 243:    */   }
/* 244:    */   
/* 245:    */   protected String bn()
/* 246:    */   {
/* 247:289 */     return "mob.rabbit.hurt";
/* 248:    */   }
/* 249:    */   
/* 250:    */   protected String bo()
/* 251:    */   {
/* 252:294 */     return "mob.rabbit.death";
/* 253:    */   }
/* 254:    */   
/* 255:    */   public boolean r(Entity paramwv)
/* 256:    */   {
/* 257:299 */     if (cl() == 99)
/* 258:    */     {
/* 259:300 */       a("mob.attack", 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
/* 260:301 */       return paramwv.a(wh.a(this), 8.0F);
/* 261:    */     }
/* 262:303 */     return paramwv.a(wh.a(this), 3.0F);
/* 263:    */   }
/* 264:    */   
/* 265:    */   public int bq()
/* 266:    */   {
/* 267:308 */     if (cl() == 99) {
/* 268:309 */       return 8;
/* 269:    */     }
/* 270:311 */     return super.bq();
/* 271:    */   }
/* 272:    */   
/* 273:    */   public boolean a(wh paramwh, float paramFloat)
/* 274:    */   {
/* 275:316 */     if (b(paramwh)) {
/* 276:317 */       return false;
/* 277:    */     }
/* 278:319 */     return super.a(paramwh, paramFloat);
/* 279:    */   }
/* 280:    */   
/* 281:    */   protected void bp()
/* 282:    */   {
/* 283:324 */     a(new ItemStack(ItemList.br, 1), 0.0F);
/* 284:    */   }
/* 285:    */   
/* 286:    */   protected void b(boolean paramBoolean, int paramInt)
/* 287:    */   {
/* 288:330 */     int i = this.random.nextInt(2) + this.random.nextInt(1 + paramInt);
/* 289:331 */     for (int j = 0; j < i; j++) {
/* 290:332 */       a(ItemList.bs, 1);
/* 291:    */     }
/* 292:336 */     i = this.random.nextInt(2);
/* 293:337 */     for (j = 0; j < i; j++) {
/* 294:338 */       if (au()) {
/* 295:339 */         a(ItemList.bp, 1);
/* 296:    */       } else {
/* 297:341 */         a(ItemList.bo, 1);
/* 298:    */       }
/* 299:    */     }
/* 300:    */   }
/* 301:    */   
/* 302:    */   private boolean a(Item paramalq)
/* 303:    */   {
/* 304:347 */     return (paramalq == ItemList.carrot) || (paramalq == ItemList.bW) || (paramalq == Item.fromProtoBlock(BlockList.yellowFlower));
/* 305:    */   }
/* 306:    */   
/* 307:    */   public EntityRabbit b(EntityPassiveMob paramws)
/* 308:    */   {
/* 309:352 */     EntityRabbit localacb = new EntityRabbit(this.world);
/* 310:353 */     if ((paramws instanceof EntityRabbit)) {
/* 311:354 */       localacb.r(this.random.nextBoolean() ? cl() : ((EntityRabbit)paramws).cl());
/* 312:    */     }
/* 313:356 */     return localacb;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public boolean d(ItemStack paramamj)
/* 317:    */   {
/* 318:361 */     return (paramamj != null) && (a(paramamj.getItem()));
/* 319:    */   }
/* 320:    */   
/* 321:    */   public int cl()
/* 322:    */   {
/* 323:365 */     return this.ac.a(18);
/* 324:    */   }
/* 325:    */   
/* 326:    */   public void r(int paramInt)
/* 327:    */   {
/* 328:369 */     if (paramInt == 99)
/* 329:    */     {
/* 330:370 */       this.i.a(this.bk);
/* 331:371 */       this.i.a(4, new acd(this));
/* 332:372 */       this.bg.a(1, new aal(this, false, new Class[0]));
/* 333:373 */       this.bg.a(2, new aaq(this, EntityPlayer.class, true));
/* 334:374 */       this.bg.a(2, new aaq(this, EntityWolf.class, true));
/* 335:376 */       if (!k_()) {
/* 336:377 */         a(fi.a("entity.KillerBunny.name"));
/* 337:    */       }
/* 338:    */     }
/* 339:381 */     this.ac.b(18, Byte.valueOf((byte)paramInt));
/* 340:    */   }
/* 341:    */   
/* 342:    */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 343:    */   {
/* 344:387 */     paramxq = super.beforeSpawn(paramvu, paramxq);
/* 345:    */     
/* 346:389 */     int i = this.random.nextInt(6);
/* 347:390 */     int j = 0;
/* 348:391 */     if ((paramxq instanceof acg))
/* 349:    */     {
/* 350:393 */       i = ((acg)paramxq).a;
/* 351:394 */       j = 1;
/* 352:    */     }
/* 353:    */     else
/* 354:    */     {
/* 355:397 */       paramxq = new acg(i);
/* 356:    */     }
/* 357:400 */     r(i);
/* 358:401 */     if (j != 0) {
/* 359:402 */       b(-24000);
/* 360:    */     }
/* 361:405 */     return paramxq;
/* 362:    */   }
/* 363:    */   
/* 364:    */   private boolean cv()
/* 365:    */   {
/* 366:417 */     return this.bs == 0;
/* 367:    */   }
/* 368:    */   
/* 369:    */   protected int cm()
/* 370:    */   {
/* 371:421 */     return this.br.c();
/* 372:    */   }
/* 373:    */   
/* 374:    */   protected void cn()
/* 375:    */   {
/* 376:425 */     this.world.a(ew.M, this.xPos + this.random.nextFloat() * this.J * 2.0F - this.J, this.yPos + 0.5D + this.random.nextFloat() * this.K, this.zPos + this.random.nextFloat() * this.J * 2.0F - this.J, 0.0D, 0.0D, 0.0D, new int[] { ProtoBlock.f(BlockList.cb.a(7)) });
/* 377:426 */     this.bs = 100;
/* 378:    */   }
/* 379:    */   
/* 380:    */   public void a(byte paramByte)
/* 381:    */   {
/* 382:431 */     if (paramByte == 1)
/* 383:    */     {
/* 384:432 */       Z();
/* 385:433 */       this.bn = 10;
/* 386:434 */       this.bm = 0;
/* 387:    */     }
/* 388:    */     else
/* 389:    */     {
/* 390:437 */       super.a(paramByte);
/* 391:    */     }
/* 392:    */   }
				public EntityPassiveMob a(EntityPassiveMob arg0) {return b(arg0);}
				static boolean a(EntityRabbit arg0) {return arg0.cv();}
/* 393:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     acb
 * JD-Core Version:    0.7.0.1
 */