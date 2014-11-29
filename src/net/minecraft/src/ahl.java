package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public abstract class ahl
/*   5:    */   extends Entity
/*   6:    */ {
/*   7: 23 */   private int e = -1;
/*   8: 24 */   private int f = -1;
/*   9: 25 */   private int g = -1;
/*  10:    */   private BlockType h;
/*  11:    */   private boolean i;
/*  12:    */   public EntityLiving a;
/*  13:    */   private int ap;
/*  14:    */   private int aq;
/*  15:    */   public double b;
/*  16:    */   public double c;
/*  17:    */   public double d;
/*  18:    */   
/*  19:    */   public ahl(World paramaqu)
/*  20:    */   {
/*  21: 34 */     super(paramaqu);
/*  22: 35 */     a(1.0F, 1.0F);
/*  23:    */   }
/*  24:    */   
/*  25:    */   protected void h() {}
/*  26:    */   
/*  27:    */   public boolean a(double paramDouble)
/*  28:    */   {
/*  29: 44 */     double d1 = getAABB().a() * 4.0D;
/*  30: 45 */     d1 *= 64.0D;
/*  31: 46 */     return paramDouble < d1 * d1;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public ahl(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  35:    */   {
/*  36: 50 */     super(paramaqu);
/*  37: 51 */     a(1.0F, 1.0F);
/*  38:    */     
/*  39: 53 */     setPositionAndAngles(paramDouble1, paramDouble2, paramDouble3, this.yaw, this.pitch);
/*  40: 54 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  41:    */     
/*  42: 56 */     double d1 = MathUtils.sqrt(paramDouble4 * paramDouble4 + paramDouble5 * paramDouble5 + paramDouble6 * paramDouble6);
/*  43: 57 */     this.b = (paramDouble4 / d1 * 0.1D);
/*  44: 58 */     this.c = (paramDouble5 / d1 * 0.1D);
/*  45: 59 */     this.d = (paramDouble6 / d1 * 0.1D);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public ahl(World paramaqu, EntityLiving paramxm, double paramDouble1, double paramDouble2, double paramDouble3)
/*  49:    */   {
/*  50: 63 */     super(paramaqu);
/*  51: 64 */     this.a = paramxm;
/*  52:    */     
/*  53: 66 */     a(1.0F, 1.0F);
/*  54:    */     
/*  55: 68 */     setPositionAndAngles(paramxm.xPos, paramxm.yPos, paramxm.zPos, paramxm.yaw, paramxm.pitch);
/*  56: 69 */     setPos(this.xPos, this.yPos, this.zPos);
/*  57:    */     
/*  58: 71 */     this.xVelocity = (this.yVelocity = this.zVelocity = 0.0D);
/*  59:    */     
/*  60: 73 */     paramDouble1 += this.rng.nextGaussian() * 0.4D;
/*  61: 74 */     paramDouble2 += this.rng.nextGaussian() * 0.4D;
/*  62: 75 */     paramDouble3 += this.rng.nextGaussian() * 0.4D;
/*  63: 76 */     double d1 = MathUtils.sqrt(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  64: 77 */     this.b = (paramDouble1 / d1 * 0.1D);
/*  65: 78 */     this.c = (paramDouble2 / d1 * 0.1D);
/*  66: 79 */     this.d = (paramDouble3 / d1 * 0.1D);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void onUpdate()
/*  70:    */   {
/*  71: 84 */     if ((!this.world.isClient) && (((this.a != null) && (this.a.isDead)) || (!this.world.e(new BlockPosition(this)))))
/*  72:    */     {
/*  73: 85 */       setDead();
/*  74: 86 */       return;
/*  75:    */     }
/*  76: 89 */     super.onUpdate();
/*  77: 90 */     e(1);
/*  78: 92 */     if (this.i)
/*  79:    */     {
/*  80: 93 */       if (this.world.getBlock(new BlockPosition(this.e, this.f, this.g)).getType() == this.h)
/*  81:    */       {
/*  82: 94 */         this.ap += 1;
/*  83: 95 */         if (this.ap == 600) {
/*  84: 96 */           setDead();
/*  85:    */         }
/*  86: 98 */         return;
/*  87:    */       }
/*  88:100 */       this.i = false;
/*  89:    */       
/*  90:102 */       this.xVelocity *= this.rng.nextFloat() * 0.2F;
/*  91:103 */       this.yVelocity *= this.rng.nextFloat() * 0.2F;
/*  92:104 */       this.zVelocity *= this.rng.nextFloat() * 0.2F;
/*  93:105 */       this.ap = 0;
/*  94:106 */       this.aq = 0;
/*  95:    */     }
/*  96:    */     else
/*  97:    */     {
/*  98:109 */       this.aq += 1;
/*  99:    */     }
/* 100:112 */     Vec3 localbrw1 = new Vec3(this.xPos, this.yPos, this.zPos);
/* 101:113 */     Vec3 localbrw2 = new Vec3(this.xPos + this.xVelocity, this.yPos + this.yVelocity, this.zPos + this.zVelocity);
/* 102:114 */     HitResult localbru1 = this.world.a(localbrw1, localbrw2);
/* 103:    */     
/* 104:116 */     localbrw1 = new Vec3(this.xPos, this.yPos, this.zPos);
/* 105:117 */     localbrw2 = new Vec3(this.xPos + this.xVelocity, this.yPos + this.yVelocity, this.zPos + this.zVelocity);
/* 106:118 */     if (localbru1 != null) {
/* 107:119 */       localbrw2 = new Vec3(localbru1.c.x, localbru1.c.y, localbru1.c.z);
/* 108:    */     }
/* 109:122 */     Entity localObject = null;
/* 110:123 */     List<Entity> localList = this.world.b(this, getAABB().addCoord(this.xVelocity, this.yVelocity, this.zVelocity).expand(1.0D, 1.0D, 1.0D));
/* 111:124 */     double d1 = 0.0D;
/* 112:125 */     for (int j = 0; j < localList.size(); j++)
/* 113:    */     {
/* 114:126 */       Entity localwv = (Entity)localList.get(j);
/* 115:127 */       if ((localwv.ad()) && ((!localwv.k(this.a)) || (this.aq >= 25)))
/* 116:    */       {
/* 117:131 */         float f3 = 0.3F;
/* 118:132 */         AABB localbrt = localwv.getAABB().expand(f3, f3, f3);
/* 119:133 */         HitResult localbru2 = localbrt.a(localbrw1, localbrw2);
/* 120:134 */         if (localbru2 != null)
/* 121:    */         {
/* 122:135 */           double d2 = localbrw1.dist(localbru2.c);
/* 123:136 */           if ((d2 < d1) || (d1 == 0.0D))
/* 124:    */           {
/* 125:137 */             localObject = localwv;
/* 126:138 */             d1 = d2;
/* 127:    */           }
/* 128:    */         }
/* 129:    */       }
/* 130:    */     }
/* 131:143 */     if (localObject != null) {
/* 132:144 */       localbru1 = new HitResult(localObject);
/* 133:    */     }
/* 134:147 */     if (localbru1 != null) {
/* 135:148 */       a(localbru1);
/* 136:    */     }
/* 137:150 */     this.xPos += this.xVelocity;
/* 138:151 */     this.yPos += this.yVelocity;
/* 139:152 */     this.zPos += this.zVelocity;
/* 140:    */     
/* 141:154 */     float f1 = MathUtils.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 142:155 */     this.yaw = ((float)(Math.atan2(this.zVelocity, this.xVelocity) * 180.0D / 3.141592741012573D) + 90.0F);
/* 143:156 */     this.pitch = ((float)(Math.atan2(f1, this.yVelocity) * 180.0D / 3.141592741012573D) - 90.0F);
/* 144:158 */     while (this.pitch - this.lastPitch < -180.0F) {
/* 145:159 */       this.lastPitch -= 360.0F;
/* 146:    */     }
/* 147:161 */     while (this.pitch - this.lastPitch >= 180.0F) {
/* 148:162 */       this.lastPitch += 360.0F;
/* 149:    */     }
/* 150:165 */     while (this.yaw - this.lastYaw < -180.0F) {
/* 151:166 */       this.lastYaw -= 360.0F;
/* 152:    */     }
/* 153:168 */     while (this.yaw - this.lastYaw >= 180.0F) {
/* 154:169 */       this.lastYaw += 360.0F;
/* 155:    */     }
/* 156:172 */     this.pitch = (this.lastPitch + (this.pitch - this.lastPitch) * 0.2F);
/* 157:173 */     this.yaw = (this.lastYaw + (this.yaw - this.lastYaw) * 0.2F);
/* 158:    */     
/* 159:175 */     float f2 = j();
/* 160:176 */     if (isInWater())
/* 161:    */     {
/* 162:177 */       for (int k = 0; k < 4; k++)
/* 163:    */       {
/* 164:178 */         float f4 = 0.25F;
/* 165:179 */         this.world.a(EnumParticleEffect.e, this.xPos - this.xVelocity * f4, this.yPos - this.yVelocity * f4, this.zPos - this.zVelocity * f4, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 166:    */       }
/* 167:181 */       f2 = 0.8F;
/* 168:    */     }
/* 169:184 */     this.xVelocity += this.b;
/* 170:185 */     this.yVelocity += this.c;
/* 171:186 */     this.zVelocity += this.d;
/* 172:187 */     this.xVelocity *= f2;
/* 173:188 */     this.yVelocity *= f2;
/* 174:189 */     this.zVelocity *= f2;
/* 175:    */     
/* 176:191 */     this.world.a(EnumParticleEffect.l, this.xPos, this.yPos + 0.5D, this.zPos, 0.0D, 0.0D, 0.0D, new int[0]);
/* 177:    */     
/* 178:193 */     setPos(this.xPos, this.yPos, this.zPos);
/* 179:    */   }
/* 180:    */   
/* 181:    */   protected float j()
/* 182:    */   {
/* 183:197 */     return 0.95F;
/* 184:    */   }
/* 185:    */   
/* 186:    */   protected abstract void a(HitResult parambru);
/* 187:    */   
/* 188:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 189:    */   {
/* 190:204 */     paramfn.setShort("xTile", (short)this.e);
/* 191:205 */     paramfn.setShort("yTile", (short)this.f);
/* 192:206 */     paramfn.setShort("zTile", (short)this.g);
/* 193:207 */     oa localoa = (oa)BlockType.c.c(this.h);
/* 194:208 */     paramfn.setString("inTile", localoa == null ? "" : localoa.toString());
/* 195:209 */     paramfn.setByte("inGround", (byte)(this.i ? 1 : 0));
/* 196:210 */     paramfn.setNBT("direction", a(new double[] { this.xVelocity, this.yVelocity, this.zVelocity }));
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 200:    */   {
/* 201:215 */     this.e = paramfn.e("xTile");
/* 202:216 */     this.f = paramfn.e("yTile");
/* 203:217 */     this.g = paramfn.e("zTile");
/* 204:218 */     if (paramfn.hasKey("inTile", 8)) {
/* 205:219 */       this.h = BlockType.b(paramfn.getString("inTile"));
/* 206:    */     } else {
/* 207:221 */       this.h = BlockType.c(paramfn.d("inTile") & 0xFF);
/* 208:    */     }
/* 209:223 */     this.i = (paramfn.d("inGround") == 1);
/* 210:227 */     if (paramfn.hasKey("direction", 9))
/* 211:    */     {
/* 212:228 */       fv localfv = paramfn.c("direction", 6);
/* 213:229 */       this.xVelocity = localfv.d(0);
/* 214:230 */       this.yVelocity = localfv.d(1);
/* 215:231 */       this.zVelocity = localfv.d(2);
/* 216:    */     }
/* 217:    */     else
/* 218:    */     {
/* 219:233 */       setDead();
/* 220:    */     }
/* 221:    */   }
/* 222:    */   
/* 223:    */   public boolean ad()
/* 224:    */   {
/* 225:239 */     return true;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public float ao()
/* 229:    */   {
/* 230:244 */     return 1.0F;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public boolean receiveDamage(DamageSource paramwh, float paramFloat)
/* 234:    */   {
/* 235:249 */     if (isImmuneTo(paramwh)) {
/* 236:250 */       return false;
/* 237:    */     }
/* 238:252 */     ac();
/* 239:254 */     if (paramwh.getAttacker() != null)
/* 240:    */     {
/* 241:255 */       Vec3 localbrw = paramwh.getAttacker().ap();
/* 242:256 */       if (localbrw != null)
/* 243:    */       {
/* 244:257 */         this.xVelocity = localbrw.x;
/* 245:258 */         this.yVelocity = localbrw.y;
/* 246:259 */         this.zVelocity = localbrw.z;
/* 247:260 */         this.b = (this.xVelocity * 0.1D);
/* 248:261 */         this.c = (this.yVelocity * 0.1D);
/* 249:262 */         this.d = (this.zVelocity * 0.1D);
/* 250:    */       }
/* 251:264 */       if ((paramwh.getAttacker() instanceof EntityLiving)) {
/* 252:265 */         this.a = ((EntityLiving)paramwh.getAttacker());
/* 253:    */       }
/* 254:267 */       return true;
/* 255:    */     }
/* 256:269 */     return false;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public float c(float paramFloat)
/* 260:    */   {
/* 261:274 */     return 1.0F;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public int b(float paramFloat)
/* 265:    */   {
/* 266:279 */     return 15728880;
/* 267:    */   }
/* 268:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahl
 * JD-Core Version:    0.7.0.1
 */