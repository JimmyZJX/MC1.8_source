package net.minecraft.src;
/*   1:    */ import java.util.Calendar;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class EntitySkeleton
/*   5:    */   extends EntityHostileMob
/*   6:    */   implements afr
/*   7:    */ {
/*   8: 40 */   private zz b = new zz(this, 1.0D, 20, 60, 15.0F);
/*   9: 41 */   private zk c = new zk(this, EntityPlayer.class, 1.2D, false);
/*  10:    */   
/*  11:    */   public EntitySkeleton(World paramaqu)
/*  12:    */   {
/*  13: 44 */     super(paramaqu);
/*  14:    */     
/*  15: 46 */     this.i.a(1, new yy(this));
/*  16: 47 */     this.i.a(2, new aab(this));
/*  17: 48 */     this.i.a(2, this.a);
/*  18: 49 */     this.i.a(3, new yx(this, 1.0D));
/*  19: 50 */     this.i.a(3, new yp(this, new afx(this), 6.0F, 1.0D, 1.2D));
/*  20:    */     
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25: 56 */     this.i.a(4, new zy(this, 1.0D));
/*  26: 57 */     this.i.a(6, new zh(this, EntityPlayer.class, 8.0F));
/*  27: 58 */     this.i.a(6, new zx(this));
/*  28:    */     
/*  29: 60 */     this.bg.a(1, new aal(this, false, new Class[0]));
/*  30: 61 */     this.bg.a(2, new aaq(this, EntityPlayer.class, true));
/*  31: 62 */     this.bg.a(3, new aaq(this, EntityIronGolem.class, true));
/*  32: 64 */     if ((paramaqu != null) && (!paramaqu.isClient)) {
/*  33: 65 */       n();
/*  34:    */     }
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected void aW()
/*  38:    */   {
/*  39: 71 */     super.aW();
/*  40:    */     
/*  41: 73 */     a(afs.d).a(0.25D);
/*  42:    */   }
/*  43:    */   
/*  44:    */   protected void h()
/*  45:    */   {
/*  46: 78 */     super.h();
/*  47:    */     
/*  48: 80 */     this.ac.a(13, new Byte((byte)0));
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected String z()
/*  52:    */   {
/*  53: 85 */     return "mob.skeleton.say";
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected String bn()
/*  57:    */   {
/*  58: 90 */     return "mob.skeleton.hurt";
/*  59:    */   }
/*  60:    */   
/*  61:    */   protected String bo()
/*  62:    */   {
/*  63: 95 */     return "mob.skeleton.death";
/*  64:    */   }
/*  65:    */   
/*  66:    */   protected void a(BlockPosition paramdt, ProtoBlock paramatr)
/*  67:    */   {
/*  68:100 */     a("mob.skeleton.step", 0.15F, 1.0F);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean r(Entity paramwv)
/*  72:    */   {
/*  73:105 */     if (super.r(paramwv))
/*  74:    */     {
/*  75:106 */       if ((ck() == 1) && ((paramwv instanceof EntityLiving))) {
/*  76:107 */         ((EntityLiving)paramwv).c(new PotionEffect(Potion.wither.id, 200));
/*  77:    */       }
/*  78:109 */       return true;
/*  79:    */     }
/*  80:111 */     return false;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public xs by()
/*  84:    */   {
/*  85:116 */     return xs.b;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void m()
/*  89:    */   {
/*  90:121 */     if ((this.world.w()) && (!this.world.isClient))
/*  91:    */     {
/*  92:122 */       float f = c(1.0F);
/*  93:123 */       BlockPosition localdt = new BlockPosition(this.xPos, Math.round(this.yPos), this.zPos);
/*  94:124 */       if ((f > 0.5F) && (this.rng.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) && (this.world.i(localdt)))
/*  95:    */       {
/*  96:125 */         int i = 1;
/*  97:    */         
/*  98:127 */         ItemStack localamj = p(4);
/*  99:128 */         if (localamj != null)
/* 100:    */         {
/* 101:129 */           if (localamj.e())
/* 102:    */           {
/* 103:130 */             localamj.b(localamj.getDamage() + this.rng.nextInt(2));
/* 104:131 */             if (localamj.getDamage() >= localamj.j())
/* 105:    */             {
/* 106:132 */               b(localamj);
/* 107:133 */               c(4, null);
/* 108:    */             }
/* 109:    */           }
/* 110:137 */           i = 0;
/* 111:    */         }
/* 112:140 */         if (i != 0) {
/* 113:141 */           e(8);
/* 114:    */         }
/* 115:    */       }
/* 116:    */     }
/* 117:145 */     if ((this.world.isClient) && 
/* 118:146 */       (ck() == 1)) {
/* 119:147 */       a(0.72F, 2.535F);
/* 120:    */     }
/* 121:151 */     super.m();
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void updateVehicle()
/* 125:    */   {
/* 126:156 */     super.updateVehicle();
/* 127:158 */     if ((this.vehicle instanceof EntityWalkingMob))
/* 128:    */     {
/* 129:159 */       EntityWalkingMob localxu = (EntityWalkingMob)this.vehicle;
/* 130:160 */       this.aG = localxu.aG;
/* 131:    */     }
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void a(DamageSource paramwh)
/* 135:    */   {
/* 136:166 */     super.a(paramwh);
/* 137:167 */     if (((paramwh.i() instanceof ahj)) && ((paramwh.j() instanceof EntityPlayer)))
/* 138:    */     {
/* 139:168 */       EntityPlayer localahd = (EntityPlayer)paramwh.j();
/* 140:169 */       double d1 = localahd.xPos - this.xPos;
/* 141:170 */       double d2 = localahd.zPos - this.zPos;
/* 142:171 */       if (d1 * d1 + d2 * d2 >= 2500.0D) {
/* 143:172 */         localahd.b(AchievementList.v);
/* 144:    */       }
/* 145:    */     }
/* 146:174 */     else if (((paramwh.j() instanceof EntityCreeper)) && 
/* 147:175 */       (((EntityCreeper)paramwh.j()).n()) && (((EntityCreeper)paramwh.j()).cn()))
/* 148:    */     {
/* 149:176 */       ((EntityCreeper)paramwh.j()).co();
/* 150:177 */       a(new ItemStack(ItemList.bX, 1, ck() == 1 ? 1 : 0), 0.0F);
/* 151:    */     }
/* 152:    */   }
/* 153:    */   
/* 154:    */   protected Item A()
/* 155:    */   {
/* 156:184 */     return ItemList.g;
/* 157:    */   }
/* 158:    */   
/* 159:    */   protected void b(boolean paramBoolean, int paramInt)
/* 160:    */   {
/* 161:189 */     if (ck() == 1)
/* 162:    */     {
/* 163:191 */       int i = this.rng.nextInt(3 + paramInt) - 1;
/* 164:192 */       for (int j = 0; j < i; j++) {
/* 165:193 */         a(ItemList.h, 1);
/* 166:    */       }
/* 167:    */     }
/* 168:    */     else
/* 169:    */     {
/* 170:197 */       int i = this.rng.nextInt(3 + paramInt);
/* 171:198 */       for (int j = 0; j < i; j++) {
/* 172:199 */         a(ItemList.g, 1);
/* 173:    */       }
/* 174:    */     }
/* 175:204 */     int i = this.rng.nextInt(3 + paramInt);
/* 176:205 */     for (int j = 0; j < i; j++) {
/* 177:206 */       a(ItemList.bone, 1);
/* 178:    */     }
/* 179:    */   }
/* 180:    */   
/* 181:    */   protected void bp()
/* 182:    */   {
/* 183:212 */     if (ck() == 1) {
/* 184:213 */       a(new ItemStack(ItemList.bX, 1, 1), 0.0F);
/* 185:    */     }
/* 186:    */   }
/* 187:    */   
/* 188:    */   protected void a(vu paramvu)
/* 189:    */   {
/* 190:219 */     super.a(paramvu);
/* 191:    */     
/* 192:221 */     c(0, new ItemStack(ItemList.f));
/* 193:    */   }
/* 194:    */   
/* 195:    */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 196:    */   {
/* 197:227 */     paramxq = super.beforeSpawn(paramvu, paramxq);
/* 198:229 */     if (((this.world.t instanceof bge)) && (getRNG().nextInt(5) > 0))
/* 199:    */     {
/* 200:230 */       this.i.a(4, this.c);
/* 201:    */       
/* 202:232 */       a(1);
/* 203:233 */       c(0, new ItemStack(ItemList.q));
/* 204:234 */       a(afs.e).a(4.0D);
/* 205:    */     }
/* 206:    */     else
/* 207:    */     {
/* 208:236 */       this.i.a(4, this.b);
/* 209:    */       
/* 210:238 */       a(paramvu);
/* 211:239 */       b(paramvu);
/* 212:    */     }
/* 213:242 */     j(this.rng.nextFloat() < 0.55F * paramvu.c());
/* 214:244 */     if (p(4) == null)
/* 215:    */     {
/* 216:245 */       Calendar localCalendar = this.world.Y();
/* 217:247 */       if ((localCalendar.get(2) + 1 == 10) && (localCalendar.get(5) == 31) && (this.rng.nextFloat() < 0.25F))
/* 218:    */       {
/* 219:249 */         c(4, new ItemStack(this.rng.nextFloat() < 0.1F ? BlockList.aZ : BlockList.pumpkin));
/* 220:250 */         this.bh[4] = 0.0F;
/* 221:    */       }
/* 222:    */     }
/* 223:253 */     return paramxq;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void n()
/* 227:    */   {
/* 228:257 */     this.i.a(this.c);
/* 229:258 */     this.i.a(this.b);
/* 230:    */     
/* 231:260 */     ItemStack localamj = bz();
/* 232:262 */     if ((localamj != null) && (localamj.getItem() == ItemList.f)) {
/* 233:263 */       this.i.a(4, this.b);
/* 234:    */     } else {
/* 235:265 */       this.i.a(4, this.c);
/* 236:    */     }
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void a(EntityLiving paramxm, float paramFloat)
/* 240:    */   {
/* 241:271 */     ahj localahj = new ahj(this.world, this, paramxm, 1.6F, 14 - this.world.getDifficulty().a() * 4);
/* 242:272 */     int i = aph.a(Enchantment.v.B, bz());
/* 243:273 */     int j = aph.a(Enchantment.w.B, bz());
/* 244:    */     
/* 245:275 */     localahj.b(paramFloat * 2.0F + (this.rng.nextGaussian() * 0.25D + this.world.getDifficulty().a() * 0.11F));
/* 246:277 */     if (i > 0) {
/* 247:278 */       localahj.b(localahj.j() + i * 0.5D + 0.5D);
/* 248:    */     }
/* 249:280 */     if (j > 0) {
/* 250:281 */       localahj.a(j);
/* 251:    */     }
/* 252:283 */     if ((aph.a(Enchantment.x.B, bz()) > 0) || (ck() == 1)) {
/* 253:284 */       localahj.e(100);
/* 254:    */     }
/* 255:287 */     a("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
/* 256:288 */     this.world.spawnEntity(localahj);
/* 257:    */   }
/* 258:    */   
/* 259:    */   public int ck()
/* 260:    */   {
/* 261:292 */     return this.ac.a(13);
/* 262:    */   }
/* 263:    */   
/* 264:    */   public void a(int paramInt)
/* 265:    */   {
/* 266:296 */     this.ac.b(13, Byte.valueOf((byte)paramInt));
/* 267:    */     
/* 268:298 */     this.ab = (paramInt == 1);
/* 269:299 */     if (paramInt == 1) {
/* 270:300 */       a(0.72F, 2.535F);
/* 271:    */     } else {
/* 272:302 */       a(0.6F, 1.95F);
/* 273:    */     }
/* 274:    */   }
/* 275:    */   
/* 276:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 277:    */   {
/* 278:308 */     super.readEntityFromNBT(paramfn);
/* 279:310 */     if (paramfn.hasKey("SkeletonType", 99))
/* 280:    */     {
/* 281:311 */       int i = paramfn.d("SkeletonType");
/* 282:312 */       a(i);
/* 283:    */     }
/* 284:315 */     n();
/* 285:    */   }
/* 286:    */   
/* 287:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 288:    */   {
/* 289:320 */     super.writeEntityToNBT(paramfn);
/* 290:321 */     paramfn.setByte("SkeletonType", (byte)ck());
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void c(int paramInt, ItemStack paramamj)
/* 294:    */   {
/* 295:326 */     super.c(paramInt, paramamj);
/* 296:328 */     if ((!this.world.isClient) && (paramInt == 0)) {
/* 297:329 */       n();
/* 298:    */     }
/* 299:    */   }
/* 300:    */   
/* 301:    */   public float aR()
/* 302:    */   {
/* 303:335 */     if (ck() == 1) {
/* 304:336 */       return super.aR();
/* 305:    */     }
/* 306:339 */     return 1.74F;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public double am()
/* 310:    */   {
/* 311:344 */     return super.am() - 0.5D;
/* 312:    */   }
/* 313:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afw
 * JD-Core Version:    0.7.0.1
 */