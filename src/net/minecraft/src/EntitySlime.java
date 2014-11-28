package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class EntitySlime
/*   4:    */   extends EntityMob
/*   5:    */   implements aex
/*   6:    */ {
/*   7:    */   public float a;
/*   8:    */   public float b;
/*   9:    */   public float c;
/*  10:    */   private boolean bi;
/*  11:    */   
/*  12:    */   public EntitySlime(World paramaqu)
/*  13:    */   {
/*  14: 42 */     super(paramaqu);
/*  15:    */     
/*  16: 44 */     this.moveManager = new agc(this);
/*  17:    */     
/*  18: 46 */     this.goalSelector.addGoal(1, new aga(this));
/*  19:    */     
/*  20: 48 */     this.goalSelector.addGoal(2, new afz(this));
/*  21: 49 */     this.goalSelector.addGoal(3, new agd(this));
/*  22:    */     
/*  23: 51 */     this.goalSelector.addGoal(5, new agb(this));
/*  24:    */     
/*  25: 53 */     this.targetSelector.addGoal(1, new aao(this));
/*  26: 54 */     this.targetSelector.addGoal(3, new aam(this, EntityIronGolem.class));
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected void h()
/*  30:    */   {
/*  31: 59 */     super.h();
/*  32:    */     
/*  33: 61 */     this.ac.a(16, Byte.valueOf((byte)1));
/*  34:    */   }
/*  35:    */   
/*  36:    */   protected void a(int paramInt)
/*  37:    */   {
/*  38: 65 */     this.ac.b(16, Byte.valueOf((byte)paramInt));
/*  39: 66 */     a(0.5100001F * paramInt, 0.5100001F * paramInt);
/*  40: 67 */     setPos(this.xPos, this.yPos, this.zPos);
/*  41: 68 */     getAttribute(MobAttribute.maxHealth).a(paramInt * paramInt);
/*  42: 69 */     getAttribute(MobAttribute.movementSpeed).a(0.2F + 0.1F * paramInt);
/*  43: 70 */     h(bt());
/*  44: 71 */     this.b_ = paramInt;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public int ck()
/*  48:    */   {
/*  49: 75 */     return this.ac.a(16);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  53:    */   {
/*  54: 80 */     super.writeEntityToNBT(paramfn);
/*  55: 81 */     paramfn.setInt("Size", ck() - 1);
/*  56: 82 */     paramfn.setBoolean("wasOnGround", this.bi);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  60:    */   {
/*  61: 87 */     super.readEntityFromNBT(paramfn);
/*  62: 88 */     int i = paramfn.getInteger("Size");
/*  63: 89 */     if (i < 0) {
/*  64: 90 */       i = 0;
/*  65:    */     }
/*  66: 92 */     a(i + 1);
/*  67: 93 */     this.bi = paramfn.getBoolean("wasOnGround");
/*  68:    */   }
/*  69:    */   
/*  70:    */   protected EnumParticleEffect n()
/*  71:    */   {
/*  72: 97 */     return EnumParticleEffect.H;
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected String ci()
/*  76:    */   {
/*  77:101 */     return "mob.slime." + (ck() > 1 ? "big" : "small");
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void onUpdate()
/*  81:    */   {
/*  82:106 */     if ((!this.world.isClient) && (this.world.getDifficulty() == EnumDifficulty.PEACEFUL) && (ck() > 0)) {
/*  83:107 */       this.isDead = true;
/*  84:    */     }
/*  85:110 */     this.b += (this.a - this.b) * 0.5F;
/*  86:111 */     this.c = this.b;
/*  87:112 */     super.onUpdate();
/*  88:114 */     if ((this.C) && (!this.bi))
/*  89:    */     {
/*  90:115 */       int i = ck();
/*  91:116 */       for (int j = 0; j < i * 8; j++)
/*  92:    */       {
/*  93:117 */         float f1 = this.rng.nextFloat() * 3.141593F * 2.0F;
/*  94:118 */         float f2 = this.rng.nextFloat() * 0.5F + 0.5F;
/*  95:119 */         float f3 = MathUtils.sin(f1) * i * 0.5F * f2;
/*  96:120 */         float f4 = MathUtils.cos(f1) * i * 0.5F * f2;
/*  97:121 */         this.world.a(n(), this.xPos + f3, getAABB().minY, this.zPos + f4, 0.0D, 0.0D, 0.0D, new int[0]);
/*  98:    */       }
/*  99:124 */       if (cj()) {
/* 100:125 */         a(ci(), bA(), ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.2F + 1.0F) / 0.8F);
/* 101:    */       }
/* 102:127 */       this.a = -0.5F;
/* 103:    */     }
/* 104:128 */     else if ((!this.C) && (this.bi))
/* 105:    */     {
/* 106:129 */       this.a = 1.0F;
/* 107:    */     }
/* 108:131 */     this.bi = this.C;
/* 109:132 */     cf();
/* 110:    */   }
/* 111:    */   
/* 112:    */   protected void cf()
/* 113:    */   {
/* 114:136 */     this.a *= 0.6F;
/* 115:    */   }
/* 116:    */   
/* 117:    */   protected int ce()
/* 118:    */   {
/* 119:140 */     return this.rng.nextInt(20) + 10;
/* 120:    */   }
/* 121:    */   
/* 122:    */   protected EntitySlime cd()
/* 123:    */   {
/* 124:144 */     return new EntitySlime(this.world);
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void i(int paramInt)
/* 128:    */   {
/* 129:149 */     if (paramInt == 16)
/* 130:    */     {
/* 131:150 */       int i = ck();
/* 132:151 */       a(0.5100001F * i, 0.5100001F * i);
/* 133:152 */       this.yaw = this.aI;
/* 134:153 */       this.aG = this.aI;
/* 135:155 */       if ((isInWater()) && 
/* 136:156 */         (this.rng.nextInt(20) == 0)) {
/* 137:157 */         X();
/* 138:    */       }
/* 139:    */     }
/* 140:162 */     super.i(paramInt);
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setDead()
/* 144:    */   {
/* 145:167 */     int i = ck();
/* 146:168 */     if ((!this.world.isClient) && (i > 1) && (getHealth() <= 0.0F))
/* 147:    */     {
/* 148:169 */       int j = 2 + this.rng.nextInt(3);
/* 149:170 */       for (int k = 0; k < j; k++)
/* 150:    */       {
/* 151:171 */         float f1 = (k % 2 - 0.5F) * i / 4.0F;
/* 152:172 */         float f2 = (k / 2 - 0.5F) * i / 4.0F;
/* 153:173 */         EntitySlime localafy = cd();
/* 154:174 */         if (k_()) {
/* 155:175 */           localafy.a(aL());
/* 156:    */         }
/* 157:177 */         if (isPersistent()) {
/* 158:178 */           localafy.setPersistent();
/* 159:    */         }
/* 160:180 */         localafy.a(i / 2);
/* 161:181 */         localafy.setPositionAndAngles(this.xPos + f1, this.yPos + 0.5D, this.zPos + f2, this.rng.nextFloat() * 360.0F, 0.0F);
/* 162:182 */         this.world.spawnEntity(localafy);
/* 163:    */       }
/* 164:    */     }
/* 165:185 */     super.setDead();
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void i(Entity paramwv)
/* 169:    */   {
/* 170:190 */     super.i(paramwv);
/* 171:191 */     if (((paramwv instanceof EntityIronGolem)) && (cg())) {
/* 172:192 */       e((EntityLiving)paramwv);
/* 173:    */     }
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void onPickedUp(EntityPlayer paramahd)
/* 177:    */   {
/* 178:198 */     if (cg()) {
/* 179:199 */       e(paramahd);
/* 180:    */     }
/* 181:    */   }
/* 182:    */   
/* 183:    */   protected void e(EntityLiving paramxm)
/* 184:    */   {
/* 185:204 */     int i = ck();
/* 186:205 */     if ((canSee(paramxm)) && (h(paramxm) < 0.6D * i * (0.6D * i)) && 
/* 187:206 */       (paramxm.a(DamageSource.fromMob(this), ch())))
/* 188:    */     {
/* 189:207 */       a("mob.attack", 1.0F, (this.rng.nextFloat() - this.rng.nextFloat()) * 0.2F + 1.0F);
/* 190:208 */       a(this, paramxm);
/* 191:    */     }
/* 192:    */   }
/* 193:    */   
/* 194:    */   public float getEyeHeight()
/* 195:    */   {
/* 196:215 */     return 0.625F * this.height;
/* 197:    */   }
/* 198:    */   
/* 199:    */   protected boolean cg()
/* 200:    */   {
/* 201:219 */     return ck() > 1;
/* 202:    */   }
/* 203:    */   
/* 204:    */   protected int ch()
/* 205:    */   {
/* 206:223 */     return ck();
/* 207:    */   }
/* 208:    */   
/* 209:    */   protected String bn()
/* 210:    */   {
/* 211:228 */     return "mob.slime." + (ck() > 1 ? "big" : "small");
/* 212:    */   }
/* 213:    */   
/* 214:    */   protected String bo()
/* 215:    */   {
/* 216:233 */     return "mob.slime." + (ck() > 1 ? "big" : "small");
/* 217:    */   }
/* 218:    */   
/* 219:    */   protected Item A()
/* 220:    */   {
/* 221:238 */     if (ck() == 1) {
/* 222:239 */       return ItemList.aM;
/* 223:    */     }
/* 224:241 */     return null;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public boolean canSpawn()
/* 228:    */   {
/* 229:246 */     Chunk localbfh = this.world.getChunk(new BlockPosition(MathUtils.floor(this.xPos), 0, MathUtils.floor(this.zPos)));
/* 230:247 */     if ((this.world.getWorldInfo().u() == WorldType.FLAT) && (this.rng.nextInt(4) != 1)) {
/* 231:248 */       return false;
/* 232:    */     }
/* 233:250 */     if (this.world.getDifficulty() != EnumDifficulty.PEACEFUL)
/* 234:    */     {
/* 235:252 */       arm localarm = this.world.b(new BlockPosition(MathUtils.floor(this.xPos), 0, MathUtils.floor(this.zPos)));
/* 236:254 */       if ((localarm == arm.v) && (this.yPos > 50.0D) && (this.yPos < 70.0D) && (this.rng.nextFloat() < 0.5F) && 
/* 237:255 */         (this.rng.nextFloat() < this.world.y()) && (this.world.l(new BlockPosition(this)) <= this.rng.nextInt(8))) {
/* 238:256 */         return super.canSpawn();
/* 239:    */       }
/* 240:259 */       if ((this.rng.nextInt(10) == 0) && (localbfh.a(987234911L).nextInt(10) == 0) && (this.yPos < 40.0D)) {
/* 241:260 */         return super.canSpawn();
/* 242:    */       }
/* 243:    */     }
/* 244:263 */     return false;
/* 245:    */   }
/* 246:    */   
/* 247:    */   protected float bA()
/* 248:    */   {
/* 249:268 */     return 0.4F * ck();
/* 250:    */   }
/* 251:    */   
/* 252:    */   public int bP()
/* 253:    */   {
/* 254:273 */     return 0;
/* 255:    */   }
/* 256:    */   
/* 257:    */   protected boolean cl()
/* 258:    */   {
/* 259:277 */     return ck() > 0;
/* 260:    */   }
/* 261:    */   
/* 262:    */   protected boolean cj()
/* 263:    */   {
/* 264:281 */     return ck() > 2;
/* 265:    */   }
/* 266:    */   
/* 267:    */   protected void jump()
/* 268:    */   {
/* 269:286 */     this.yVelocity = 0.4199999868869782D;
/* 270:287 */     this.ai = true;
/* 271:    */   }
/* 272:    */   
/* 273:    */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 274:    */   {
/* 275:293 */     int i = this.rng.nextInt(3);
/* 276:294 */     if ((i < 2) && (this.rng.nextFloat() < 0.5F * paramvu.c())) {
/* 277:295 */       i++;
/* 278:    */     }
/* 279:297 */     int j = 1 << i;
/* 280:298 */     a(j);
/* 281:    */     
/* 282:300 */     return super.beforeSpawn(paramvu, paramxq);
/* 283:    */   }
/* 284:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afy
 * JD-Core Version:    0.7.0.1
 */