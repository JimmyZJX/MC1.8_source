package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public abstract class ahr
/*   5:    */   extends Entity
/*   6:    */   implements aho
/*   7:    */ {
/*   8: 22 */   private int c = -1;
/*   9: 23 */   private int d = -1;
/*  10: 24 */   private int e = -1;
/*  11:    */   private ProtoBlock f;
/*  12:    */   protected boolean a;
/*  13:    */   public int b;
/*  14:    */   private EntityLiving g;
/*  15:    */   private String h;
/*  16:    */   private int i;
/*  17:    */   private int ap;
/*  18:    */   
/*  19:    */   public ahr(World paramaqu)
/*  20:    */   {
/*  21: 34 */     super(paramaqu);
/*  22: 35 */     a(0.25F, 0.25F);
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
/*  34:    */   public ahr(World paramaqu, EntityLiving paramxm)
/*  35:    */   {
/*  36: 50 */     super(paramaqu);
/*  37: 51 */     this.g = paramxm;
/*  38:    */     
/*  39: 53 */     a(0.25F, 0.25F);
/*  40:    */     
/*  41: 55 */     setPositionAndAngles(paramxm.xPos, paramxm.yPos + paramxm.aR(), paramxm.zPos, paramxm.yaw, paramxm.pitch);
/*  42:    */     
/*  43: 57 */     this.xPos -= MathUtils.cos(this.yaw / 180.0F * 3.141593F) * 0.16F;
/*  44: 58 */     this.yPos -= 0.1000000014901161D;
/*  45: 59 */     this.zPos -= MathUtils.sin(this.yaw / 180.0F * 3.141593F) * 0.16F;
/*  46: 60 */     setPos(this.xPos, this.yPos, this.zPos);
/*  47:    */     
/*  48: 62 */     float f1 = 0.4F;
/*  49: 63 */     this.xVelocity = (-MathUtils.sin(this.yaw / 180.0F * 3.141593F) * MathUtils.cos(this.pitch / 180.0F * 3.141593F) * f1);
/*  50: 64 */     this.zVelocity = (MathUtils.cos(this.yaw / 180.0F * 3.141593F) * MathUtils.cos(this.pitch / 180.0F * 3.141593F) * f1);
/*  51: 65 */     this.yVelocity = (-MathUtils.sin((this.pitch + l()) / 180.0F * 3.141593F) * f1);
/*  52:    */     
/*  53: 67 */     c(this.xVelocity, this.yVelocity, this.zVelocity, j(), 1.0F);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public ahr(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  57:    */   {
/*  58: 71 */     super(paramaqu);
/*  59: 72 */     this.i = 0;
/*  60:    */     
/*  61: 74 */     a(0.25F, 0.25F);
/*  62:    */     
/*  63: 76 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  64:    */   }
/*  65:    */   
/*  66:    */   protected float j()
/*  67:    */   {
/*  68: 80 */     return 1.5F;
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected float l()
/*  72:    */   {
/*  73: 84 */     return 0.0F;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  77:    */   {
/*  78: 89 */     float f1 = MathUtils.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  79:    */     
/*  80: 91 */     paramDouble1 /= f1;
/*  81: 92 */     paramDouble2 /= f1;
/*  82: 93 */     paramDouble3 /= f1;
/*  83:    */     
/*  84: 95 */     paramDouble1 += this.rng.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  85: 96 */     paramDouble2 += this.rng.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  86: 97 */     paramDouble3 += this.rng.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  87:    */     
/*  88: 99 */     paramDouble1 *= paramFloat1;
/*  89:100 */     paramDouble2 *= paramFloat1;
/*  90:101 */     paramDouble3 *= paramFloat1;
/*  91:    */     
/*  92:103 */     this.xVelocity = paramDouble1;
/*  93:104 */     this.yVelocity = paramDouble2;
/*  94:105 */     this.zVelocity = paramDouble3;
/*  95:    */     
/*  96:107 */     float f2 = MathUtils.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*  97:    */     
/*  98:109 */     this.lastYaw = (this.yaw = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/*  99:110 */     this.lastPitch = (this.pitch = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.141592741012573D));
/* 100:111 */     this.i = 0;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 104:    */   {
/* 105:116 */     this.xVelocity = paramDouble1;
/* 106:117 */     this.yVelocity = paramDouble2;
/* 107:118 */     this.zVelocity = paramDouble3;
/* 108:119 */     if ((this.lastPitch == 0.0F) && (this.lastYaw == 0.0F))
/* 109:    */     {
/* 110:120 */       float f1 = MathUtils.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 111:121 */       this.lastYaw = (this.yaw = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/* 112:122 */       this.lastPitch = (this.pitch = (float)(Math.atan2(paramDouble2, f1) * 180.0D / 3.141592741012573D));
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void onUpdate()
/* 117:    */   {
/* 118:128 */     this.P = this.xPos;
/* 119:129 */     this.Q = this.yPos;
/* 120:130 */     this.R = this.zPos;
/* 121:131 */     super.onUpdate();
/* 122:133 */     if (this.b > 0) {
/* 123:134 */       this.b -= 1;
/* 124:    */     }
/* 125:137 */     if (this.a)
/* 126:    */     {
/* 127:138 */       if (this.world.getBlock(new BlockPosition(this.c, this.d, this.e)).getProto() == this.f)
/* 128:    */       {
/* 129:139 */         this.i += 1;
/* 130:140 */         if (this.i == 1200) {
/* 131:141 */           setDead();
/* 132:    */         }
/* 133:143 */         return;
/* 134:    */       }
/* 135:145 */       this.a = false;
/* 136:    */       
/* 137:147 */       this.xVelocity *= this.rng.nextFloat() * 0.2F;
/* 138:148 */       this.yVelocity *= this.rng.nextFloat() * 0.2F;
/* 139:149 */       this.zVelocity *= this.rng.nextFloat() * 0.2F;
/* 140:150 */       this.i = 0;
/* 141:151 */       this.ap = 0;
/* 142:    */     }
/* 143:    */     else
/* 144:    */     {
/* 145:154 */       this.ap += 1;
/* 146:    */     }
/* 147:157 */     Vec3 localbrw1 = new Vec3(this.xPos, this.yPos, this.zPos);
/* 148:158 */     Vec3 localbrw2 = new Vec3(this.xPos + this.xVelocity, this.yPos + this.yVelocity, this.zPos + this.zVelocity);
/* 149:159 */     HitResult localbru1 = this.world.a(localbrw1, localbrw2);
/* 150:    */     
/* 151:161 */     localbrw1 = new Vec3(this.xPos, this.yPos, this.zPos);
/* 152:162 */     localbrw2 = new Vec3(this.xPos + this.xVelocity, this.yPos + this.yVelocity, this.zPos + this.zVelocity);
/* 153:163 */     if (localbru1 != null) {
/* 154:164 */       localbrw2 = new Vec3(localbru1.c.x, localbru1.c.y, localbru1.c.z);
/* 155:    */     }
/* 156:167 */     if (!this.world.isClient)
/* 157:    */     {
/* 158:168 */       Entity localObject = null;
/* 159:169 */       List<Entity> localList = this.world.b(this, getAABB().addCoord(this.xVelocity, this.yVelocity, this.zVelocity).expand(1.0D, 1.0D, 1.0D));
/* 160:170 */       double d1 = 0.0D;
/* 161:171 */       EntityLiving localxm = n();
/* 162:172 */       for (int k = 0; k < localList.size(); k++)
/* 163:    */       {
/* 164:173 */         Entity localwv = (Entity)localList.get(k);
/* 165:174 */         if ((localwv.ad()) && ((localwv != localxm) || (this.ap >= 5)))
/* 166:    */         {
/* 167:178 */           float f5 = 0.3F;
/* 168:179 */           AABB localbrt = localwv.getAABB().expand(f5, f5, f5);
/* 169:180 */           HitResult localbru2 = localbrt.a(localbrw1, localbrw2);
/* 170:181 */           if (localbru2 != null)
/* 171:    */           {
/* 172:182 */             double d2 = localbrw1.f(localbru2.c);
/* 173:183 */             if ((d2 < d1) || (d1 == 0.0D))
/* 174:    */             {
/* 175:184 */               localObject = localwv;
/* 176:185 */               d1 = d2;
/* 177:    */             }
/* 178:    */           }
/* 179:    */         }
/* 180:    */       }
/* 181:190 */       if (localObject != null) {
/* 182:191 */         localbru1 = new HitResult(localObject);
/* 183:    */       }
/* 184:    */     }
/* 185:195 */     if (localbru1 != null) {
/* 186:196 */       if ((localbru1.a == brv.BLOCK) && (this.world.getBlock(localbru1.a()).getProto() == BlockList.aY)) {
/* 187:197 */         aq();
/* 188:    */       } else {
/* 189:199 */         a(localbru1);
/* 190:    */       }
/* 191:    */     }
/* 192:202 */     this.xPos += this.xVelocity;
/* 193:203 */     this.yPos += this.yVelocity;
/* 194:204 */     this.zPos += this.zVelocity;
/* 195:    */     
/* 196:206 */     float f1 = MathUtils.a(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 197:207 */     this.yaw = ((float)(Math.atan2(this.xVelocity, this.zVelocity) * 180.0D / 3.141592741012573D));
/* 198:208 */     this.pitch = ((float)(Math.atan2(this.yVelocity, f1) * 180.0D / 3.141592741012573D));
/* 199:210 */     while (this.pitch - this.lastPitch < -180.0F) {
/* 200:211 */       this.lastPitch -= 360.0F;
/* 201:    */     }
/* 202:213 */     while (this.pitch - this.lastPitch >= 180.0F) {
/* 203:214 */       this.lastPitch += 360.0F;
/* 204:    */     }
/* 205:217 */     while (this.yaw - this.lastYaw < -180.0F) {
/* 206:218 */       this.lastYaw -= 360.0F;
/* 207:    */     }
/* 208:220 */     while (this.yaw - this.lastYaw >= 180.0F) {
/* 209:221 */       this.lastYaw += 360.0F;
/* 210:    */     }
/* 211:224 */     this.pitch = (this.lastPitch + (this.pitch - this.lastPitch) * 0.2F);
/* 212:225 */     this.yaw = (this.lastYaw + (this.yaw - this.lastYaw) * 0.2F);
/* 213:    */     
/* 214:227 */     float f2 = 0.99F;
/* 215:228 */     float f3 = m();
/* 216:230 */     if (V())
/* 217:    */     {
/* 218:231 */       for (int j = 0; j < 4; j++)
/* 219:    */       {
/* 220:232 */         float f4 = 0.25F;
/* 221:233 */         this.world.a(EnumParticleEffect.e, this.xPos - this.xVelocity * f4, this.yPos - this.yVelocity * f4, this.zPos - this.zVelocity * f4, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 222:    */       }
/* 223:235 */       f2 = 0.8F;
/* 224:    */     }
/* 225:238 */     this.xVelocity *= f2;
/* 226:239 */     this.yVelocity *= f2;
/* 227:240 */     this.zVelocity *= f2;
/* 228:241 */     this.yVelocity -= f3;
/* 229:    */     
/* 230:243 */     setPos(this.xPos, this.yPos, this.zPos);
/* 231:    */   }
/* 232:    */   
/* 233:    */   protected float m()
/* 234:    */   {
/* 235:247 */     return 0.03F;
/* 236:    */   }
/* 237:    */   
/* 238:    */   protected abstract void a(HitResult parambru);
/* 239:    */   
/* 240:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 241:    */   {
/* 242:254 */     paramfn.setShort("xTile", (short)this.c);
/* 243:255 */     paramfn.setShort("yTile", (short)this.d);
/* 244:256 */     paramfn.setShort("zTile", (short)this.e);
/* 245:257 */     oa localoa = (oa)ProtoBlock.c.c(this.f);
/* 246:258 */     paramfn.setString("inTile", localoa == null ? "" : localoa.toString());
/* 247:259 */     paramfn.setByte("shake", (byte)this.b);
/* 248:260 */     paramfn.setByte("inGround", (byte)(this.a ? 1 : 0));
/* 249:262 */     if (((this.h == null) || (this.h.length() == 0)) && ((this.g instanceof EntityPlayer))) {
/* 250:263 */       this.h = this.g.getName();
/* 251:    */     }
/* 252:265 */     paramfn.setString("ownerName", this.h == null ? "" : this.h);
/* 253:    */   }
/* 254:    */   
/* 255:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 256:    */   {
/* 257:270 */     this.c = paramfn.e("xTile");
/* 258:271 */     this.d = paramfn.e("yTile");
/* 259:272 */     this.e = paramfn.e("zTile");
/* 260:273 */     if (paramfn.hasKey("inTile", 8)) {
/* 261:274 */       this.f = ProtoBlock.b(paramfn.getString("inTile"));
/* 262:    */     } else {
/* 263:276 */       this.f = ProtoBlock.c(paramfn.d("inTile") & 0xFF);
/* 264:    */     }
/* 265:278 */     this.b = (paramfn.d("shake") & 0xFF);
/* 266:279 */     this.a = (paramfn.d("inGround") == 1);
/* 267:280 */     this.h = paramfn.getString("ownerName");
/* 268:281 */     if ((this.h != null) && (this.h.length() == 0)) {
/* 269:282 */       this.h = null;
/* 270:    */     }
/* 271:    */   }
/* 272:    */   
/* 273:    */   public EntityLiving n()
/* 274:    */   {
/* 275:287 */     if ((this.g == null) && (this.h != null) && (this.h.length() > 0)) {
/* 276:288 */       this.g = this.world.a(this.h);
/* 277:    */     }
/* 278:290 */     return this.g;
/* 279:    */   }
/* 280:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahr
 * JD-Core Version:    0.7.0.1
 */