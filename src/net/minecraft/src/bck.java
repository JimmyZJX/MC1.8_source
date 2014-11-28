package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Arrays;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ 
/*   6:    */ public class bck
/*   7:    */   extends bdf
/*   8:    */   implements pm, vq
/*   9:    */ {
/*  10: 42 */   public static final Potion[][] a = { { Potion.speed, Potion.haste }, { Potion.resistance, Potion.jumpBoost }, { Potion.strength }, { Potion.regeneration } };
/*  11:    */   private final List<bcl> f;
/*  12:    */   private long g;
/*  13:    */   private float h;
/*  14:    */   private boolean i;
/*  15:    */   private int j;
/*  16:    */   private int k;
/*  17:    */   private int l;
/*  18:    */   private ItemStack m;
/*  19:    */   private String n;
/*  20:    */   
/*  21:    */   public bck()
/*  22:    */   {
/*  23: 53 */     this.f = Lists.newArrayList();
/*  24:    */     
/*  25:    */ 
/*  26:    */ 
/*  27:    */ 
/*  28:    */ 
/*  29: 59 */     this.j = -1;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void c()
/*  33:    */   {
/*  34: 68 */     if (this.world.K() % 80L == 0L) {
/*  35: 69 */       m();
/*  36:    */     }
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void m()
/*  40:    */   {
/*  41: 74 */     B();
/*  42: 75 */     A();
/*  43:    */   }
/*  44:    */   
/*  45:    */   private void A()
/*  46:    */   {
/*  47:    */     Iterator<EntityPlayer> localIterator;
/*  48:    */     EntityPlayer localahd;
/*  49: 79 */     if ((this.i) && (this.j > 0) && (!this.world.isClient) && (this.k > 0))
/*  50:    */     {
/*  51: 80 */       double d = this.j * 10 + 10;
/*  52: 81 */       int i1 = 0;
/*  53: 82 */       if ((this.j >= 4) && (this.k == this.l)) {
/*  54: 83 */         i1 = 1;
/*  55:    */       }
/*  56: 86 */       int i2 = this.pos.getX();
/*  57: 87 */       int i3 = this.pos.getY();
/*  58: 88 */       int i4 = this.pos.getZ();
/*  59: 89 */       AABB localbrt = new AABB(i2, i3, i4, i2 + 1, i3 + 1, i4 + 1).expand(d, d, d).addCoord(0.0D, this.world.U(), 0.0D);
/*  60: 90 */       List<EntityPlayer> localList = this.world.getEntityList(EntityPlayer.class, localbrt);
/*  61: 91 */       for (localIterator = localList.iterator(); localIterator.hasNext();)
/*  62:    */       {
/*  63: 91 */         localahd = (EntityPlayer)localIterator.next();
/*  64: 92 */         localahd.c(new PotionEffect(this.k, 180, i1, true, true));
/*  65:    */       }
/*  66: 95 */       if ((this.j >= 4) && (this.k != this.l) && (this.l > 0)) {
/*  67: 96 */         for (localIterator = localList.iterator(); localIterator.hasNext();)
/*  68:    */         {
/*  69: 96 */           localahd = (EntityPlayer)localIterator.next();
/*  70: 97 */           localahd.c(new PotionEffect(this.l, 180, 0, true, true));
/*  71:    */         }
/*  72:    */       }
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   private void B()
/*  77:    */   {
/*  78:104 */     int i1 = this.j;
/*  79:    */     
/*  80:106 */     int i2 = this.pos.getX();
/*  81:107 */     int i3 = this.pos.getY();
/*  82:108 */     int i4 = this.pos.getZ();
/*  83:    */     
/*  84:110 */     this.j = 0;
/*  85:111 */     this.f.clear();
/*  86:112 */     this.i = true;
/*  87:    */     
/*  88:114 */     bcl localbcl = new bcl(EntitySheep.a(EnumDyeColor.WHITE));
/*  89:115 */     this.f.add(localbcl);
/*  90:116 */     int i5 = 1;
/*  91:118 */     for (int i6 = i3 + 1; i6 < this.world.V(); i6++)
/*  92:    */     {
/*  93:119 */       BlockPosition localdt = new BlockPosition(i2, i6, i4);
/*  94:120 */       Block localbec = this.world.getBlock(localdt);
/*  95:    */       float[] arrayOfFloat;
/*  96:122 */       if (localbec.getProto() == BlockList.cG)
/*  97:    */       {
/*  98:123 */         arrayOfFloat = EntitySheep.a((EnumDyeColor)localbec.getData(bar.a));
/*  99:    */       }
/* 100:124 */       else if (localbec.getProto() == BlockList.stainedGlassPane)
/* 101:    */       {
/* 102:125 */         arrayOfFloat = EntitySheep.a((EnumDyeColor)localbec.getData(bas.a));
/* 103:    */       }
/* 104:    */       else
/* 105:    */       {
/* 106:126 */         if (localbec.getProto().getLightOpacity() < 15)
/* 107:    */         {
/* 108:127 */           localbcl.a();
/* 109:128 */           continue;
/* 110:    */         }
/* 111:130 */         this.i = false;
/* 112:131 */         this.f.clear();
/* 113:132 */         break;
/* 114:    */       }
/* 115:135 */       if (i5 == 0) {
/* 116:136 */         arrayOfFloat = new float[] { (localbcl.b()[0] + arrayOfFloat[0]) / 2.0F, (localbcl.b()[1] + arrayOfFloat[1]) / 2.0F, (localbcl.b()[2] + arrayOfFloat[2]) / 2.0F };
/* 117:    */       }
/* 118:143 */       if (Arrays.equals(arrayOfFloat, localbcl.b()))
/* 119:    */       {
/* 120:144 */         localbcl.a();
/* 121:    */       }
/* 122:    */       else
/* 123:    */       {
/* 124:146 */         localbcl = new bcl(arrayOfFloat);
/* 125:147 */         this.f.add(localbcl);
/* 126:    */       }
/* 127:149 */       i5 = 0;
/* 128:    */     }
/* 129:152 */     if (this.i)
/* 130:    */     {
/* 131:153 */       for (int i6 = 1; i6 <= 4; i6++)
/* 132:    */       {
/* 133:154 */         int i7 = i3 - i6;
/* 134:155 */         if (i7 < 0) {
/* 135:    */           break;
/* 136:    */         }
/* 137:159 */         int i8 = 1;
/* 138:160 */         for (int i9 = i2 - i6; (i9 <= i2 + i6) && (i8 != 0); i9++) {
/* 139:161 */           for (int i10 = i4 - i6; i10 <= i4 + i6; i10++)
/* 140:    */           {
/* 141:162 */             ProtoBlock localatr = this.world.getBlock(new BlockPosition(i9, i7, i10)).getProto();
/* 142:163 */             if ((localatr != BlockList.emeraldBlock) && (localatr != BlockList.R) && (localatr != BlockList.diamondBlock) && (localatr != BlockList.S))
/* 143:    */             {
/* 144:164 */               i8 = 0;
/* 145:165 */               break;
/* 146:    */             }
/* 147:    */           }
/* 148:    */         }
/* 149:170 */         if (i8 == 0) {
/* 150:    */           break;
/* 151:    */         }
/* 152:171 */         this.j = i6;
/* 153:    */       }
/* 154:177 */       if (this.j == 0) {
/* 155:178 */         this.i = false;
/* 156:    */       }
/* 157:    */     }
/* 158:182 */     if ((!this.world.isClient) && 
/* 159:183 */       (this.j == 4) && (i1 < this.j)) {
/* 160:184 */       for (EntityPlayer localahd : this.world.getEntityList(EntityPlayer.class, new AABB(i2, i3, i4, i2, i3 - 4, i4).expand(10.0D, 5.0D, 10.0D))) {
/* 161:185 */         localahd.increaseStat(AchievementList.K);
/* 162:    */       }
/* 163:    */     }
/* 164:    */   }
/* 165:    */   
/* 166:    */   public List<bcl> n()
/* 167:    */   {
/* 168:192 */     return this.f;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public float o()
/* 172:    */   {
/* 173:196 */     if (!this.i) {
/* 174:197 */       return 0.0F;
/* 175:    */     }
/* 176:200 */     int i1 = (int)(this.world.K() - this.g);
/* 177:201 */     this.g = this.world.K();
/* 178:202 */     if (i1 > 1)
/* 179:    */     {
/* 180:203 */       this.h -= i1 / 40.0F;
/* 181:205 */       if (this.h < 0.0F) {
/* 182:206 */         this.h = 0.0F;
/* 183:    */       }
/* 184:    */     }
/* 185:209 */     this.h += 0.025F;
/* 186:210 */     if (this.h > 1.0F) {
/* 187:211 */       this.h = 1.0F;
/* 188:    */     }
/* 189:213 */     return this.h;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public id<ik> x_()
/* 193:    */   {
/* 194:265 */     NBTTagCompound localfn = new NBTTagCompound();
/* 195:266 */     writeToNBT(localfn);
/* 196:267 */     return new iu(this.pos, 3, localfn);
/* 197:    */   }
/* 198:    */   
/* 199:    */   public double s()
/* 200:    */   {
/* 201:272 */     return 65536.0D;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void readFromNBT(NBTTagCompound paramfn)
/* 205:    */   {
/* 206:277 */     super.readFromNBT(paramfn);
/* 207:    */     
/* 208:279 */     this.k = paramfn.getInteger("Primary");
/* 209:280 */     this.l = paramfn.getInteger("Secondary");
/* 210:281 */     this.j = paramfn.getInteger("Levels");
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void writeToNBT(NBTTagCompound paramfn)
/* 214:    */   {
/* 215:286 */     super.writeToNBT(paramfn);
/* 216:    */     
/* 217:288 */     paramfn.setInt("Primary", this.k);
/* 218:289 */     paramfn.setInt("Secondary", this.l);
/* 219:    */     
/* 220:291 */     paramfn.setInt("Levels", this.j);
/* 221:    */   }
/* 222:    */   
/* 223:    */   public int getSize()
/* 224:    */   {
/* 225:296 */     return 1;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public ItemStack get(int paramInt)
/* 229:    */   {
/* 230:302 */     if (paramInt == 0) {
/* 231:303 */       return this.m;
/* 232:    */     }
/* 233:305 */     return null;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public ItemStack removeItems(int paramInt1, int paramInt2)
/* 237:    */   {
/* 238:311 */     if ((paramInt1 == 0) && (this.m != null))
/* 239:    */     {
/* 240:312 */       if (paramInt2 >= this.m.stackSize)
/* 241:    */       {
/* 242:313 */         ItemStack localamj = this.m;
/* 243:314 */         this.m = null;
/* 244:315 */         return localamj;
/* 245:    */       }
/* 246:317 */       this.m.stackSize -= paramInt2;
/* 247:318 */       return new ItemStack(this.m.getItem(), paramInt2, this.m.getDamage2());
/* 248:    */     }
/* 249:321 */     return null;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public ItemStack b(int paramInt)
/* 253:    */   {
/* 254:327 */     if ((paramInt == 0) && (this.m != null))
/* 255:    */     {
/* 256:328 */       ItemStack localamj = this.m;
/* 257:329 */       this.m = null;
/* 258:330 */       return localamj;
/* 259:    */     }
/* 260:332 */     return null;
/* 261:    */   }
/* 262:    */   
/* 263:    */   public void a(int paramInt, ItemStack paramamj)
/* 264:    */   {
/* 265:337 */     if (paramInt == 0) {
/* 266:338 */       this.m = paramamj;
/* 267:    */     }
/* 268:    */   }
/* 269:    */   
/* 270:    */   public String getName()
/* 271:    */   {
/* 272:344 */     return k_() ? this.n : "container.beacon";
/* 273:    */   }
/* 274:    */   
/* 275:    */   public boolean k_()
/* 276:    */   {
/* 277:349 */     return (this.n != null) && (this.n.length() > 0);
/* 278:    */   }
/* 279:    */   
/* 280:    */   public void a(String paramString)
/* 281:    */   {
/* 282:353 */     this.n = paramString;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public int p_()
/* 286:    */   {
/* 287:358 */     return 1;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public boolean a(EntityPlayer paramahd)
/* 291:    */   {
/* 292:363 */     if (this.world.s(this.pos) != this) {
/* 293:364 */       return false;
/* 294:    */     }
/* 295:366 */     if (paramahd.dist2(this.pos.getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) > 64.0D) {
/* 296:367 */       return false;
/* 297:    */     }
/* 298:369 */     return true;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public void b(EntityPlayer paramahd) {}
/* 302:    */   
/* 303:    */   public void c(EntityPlayer paramahd) {}
/* 304:    */   
/* 305:    */   public boolean b(int paramInt, ItemStack paramamj)
/* 306:    */   {
/* 307:382 */     return (paramamj.getItem() == ItemList.emerald) || (paramamj.getItem() == ItemList.diamond) || (paramamj.getItem() == ItemList.goldIngot) || (paramamj.getItem() == ItemList.ironIngot);
/* 308:    */   }
/* 309:    */   
/* 310:    */   public String k()
/* 311:    */   {
/* 312:387 */     return "minecraft:beacon";
/* 313:    */   }
/* 314:    */   
/* 315:    */   public aib a(Inventory paramahb, EntityPlayer paramahd)
/* 316:    */   {
/* 317:392 */     return new aig(paramahb, this);
/* 318:    */   }
/* 319:    */   
/* 320:    */   public int a_(int paramInt)
/* 321:    */   {
/* 322:397 */     switch (paramInt)
/* 323:    */     {
/* 324:    */     case 0: 
/* 325:399 */       return this.j;
/* 326:    */     case 1: 
/* 327:401 */       return this.k;
/* 328:    */     case 2: 
/* 329:403 */       return this.l;
/* 330:    */     }
/* 331:405 */     return 0;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public void b(int paramInt1, int paramInt2)
/* 335:    */   {
/* 336:410 */     switch (paramInt1)
/* 337:    */     {
/* 338:    */     case 0: 
/* 339:412 */       this.j = paramInt2;
/* 340:413 */       break;
/* 341:    */     case 1: 
/* 342:415 */       this.k = paramInt2;
/* 343:416 */       break;
/* 344:    */     case 2: 
/* 345:418 */       this.l = paramInt2;
/* 346:    */     }
/* 347:    */   }
/* 348:    */   
/* 349:    */   public int g()
/* 350:    */   {
/* 351:425 */     return 3;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public void l()
/* 355:    */   {
/* 356:430 */     this.m = null;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public boolean c(int paramInt1, int paramInt2)
/* 360:    */   {
/* 361:435 */     if (paramInt1 == 1)
/* 362:    */     {
/* 363:436 */       m();
/* 364:437 */       return true;
/* 365:    */     }
/* 366:440 */     return super.c(paramInt1, paramInt2);
/* 367:    */   }
/* 368:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bck
 * JD-Core Version:    0.7.0.1
 */