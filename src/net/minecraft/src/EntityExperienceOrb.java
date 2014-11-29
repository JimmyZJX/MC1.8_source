package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class EntityExperienceOrb
/*   4:    */   extends Entity
/*   5:    */ {
/*   6:    */   public int a;
/*   7:    */   public int age;
/*   8:    */   public int c;
/*   9: 19 */   private int health = 5;
/*  10:    */   private int value;
/*  11:    */   private EntityPlayer f;
/*  12:    */   private int g;
/*  13:    */   
/*  14:    */   public EntityExperienceOrb(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
/*  15:    */   {
/*  16: 25 */     super(paramaqu);
/*  17: 26 */     a(0.5F, 0.5F);
/*  18: 27 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  19:    */     
/*  20: 29 */     this.yaw = ((float)(Math.random() * 360.0D));
/*  21:    */     
/*  22: 31 */     this.xVelocity = ((float)(Math.random() * 0.2000000029802322D - 0.1000000014901161D) * 2.0F);
/*  23: 32 */     this.yVelocity = ((float)(Math.random() * 0.2D) * 2.0F);
/*  24: 33 */     this.zVelocity = ((float)(Math.random() * 0.2000000029802322D - 0.1000000014901161D) * 2.0F);
/*  25:    */     
/*  26: 35 */     this.value = paramInt;
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected boolean r_()
/*  30:    */   {
/*  31: 40 */     return false;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public EntityExperienceOrb(World paramaqu)
/*  35:    */   {
/*  36: 44 */     super(paramaqu);
/*  37: 45 */     a(0.25F, 0.25F);
/*  38:    */   }
/*  39:    */   
/*  40:    */   protected void h() {}
/*  41:    */   
/*  42:    */   public int b(float paramFloat)
/*  43:    */   {
/*  44: 54 */     float f1 = 0.5F;
/*  45: 55 */     f1 = MathUtils.clamp(f1, 0.0F, 1.0F);
/*  46: 56 */     int i = super.b(paramFloat);
/*  47:    */     
/*  48: 58 */     int j = i & 0xFF;
/*  49: 59 */     int k = i >> 16 & 0xFF;
/*  50: 60 */     j += (int)(f1 * 15.0F * 16.0F);
/*  51: 61 */     if (j > 240) {
/*  52: 62 */       j = 240;
/*  53:    */     }
/*  54: 64 */     return j | k << 16;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void onUpdate()
/*  58:    */   {
/*  59: 69 */     super.onUpdate();
/*  60: 70 */     if (this.c > 0) {
/*  61: 71 */       this.c -= 1;
/*  62:    */     }
/*  63: 73 */     this.lastX = this.xPos;
/*  64: 74 */     this.lastY = this.yPos;
/*  65: 75 */     this.lastZ = this.zPos;
/*  66:    */     
/*  67: 77 */     this.yVelocity -= 0.02999999932944775D;
/*  68: 78 */     if (this.world.getBlock(new BlockPosition(this)).getType().getMaterial() == Material.lava)
/*  69:    */     {
/*  70: 79 */       this.yVelocity = 0.2000000029802322D;
/*  71: 80 */       this.xVelocity = ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.2F);
/*  72: 81 */       this.zVelocity = ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.2F);
/*  73: 82 */       a("random.fizz", 0.4F, 2.0F + this.rng.nextFloat() * 0.4F);
/*  74:    */     }
/*  75: 84 */     j(this.xPos, (getAABB().minY + getAABB().maxY) / 2.0D, this.zPos);
/*  76:    */     
/*  77: 86 */     double d1 = 8.0D;
/*  78: 89 */     if (this.g < this.a - 20 + getID() % 100)
/*  79:    */     {
/*  80: 90 */       if ((this.f == null) || (this.f.h(this) > d1 * d1)) {
/*  81: 91 */         this.f = this.world.getNearestPlayer(this, d1);
/*  82:    */       }
/*  83: 93 */       this.g = this.a;
/*  84:    */     }
/*  85: 96 */     if ((this.f != null) && (this.f.v())) {
/*  86: 97 */       this.f = null;
/*  87:    */     }
/*  88:100 */     if (this.f != null)
/*  89:    */     {
/*  90:101 */       double d2 = (this.f.xPos - this.xPos) / d1;
/*  91:102 */       double d3 = (this.f.yPos + this.f.getEyeHeight() - this.yPos) / d1;
/*  92:103 */       double d4 = (this.f.zPos - this.zPos) / d1;
/*  93:104 */       double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
/*  94:105 */       double d6 = 1.0D - d5;
/*  95:106 */       if (d6 > 0.0D)
/*  96:    */       {
/*  97:107 */         d6 *= d6;
/*  98:108 */         this.xVelocity += d2 / d5 * d6 * 0.1D;
/*  99:109 */         this.yVelocity += d3 / d5 * d6 * 0.1D;
/* 100:110 */         this.zVelocity += d4 / d5 * d6 * 0.1D;
/* 101:    */       }
/* 102:    */     }
/* 103:114 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/* 104:    */     
/* 105:116 */     float f1 = 0.98F;
/* 106:117 */     if (this.landing) {
/* 107:118 */       f1 = this.world.getBlock(new BlockPosition(MathUtils.floor(this.xPos), MathUtils.floor(getAABB().minY) - 1, MathUtils.floor(this.zPos))).getType().K * 0.98F;
/* 108:    */     }
/* 109:121 */     this.xVelocity *= f1;
/* 110:122 */     this.yVelocity *= 0.9800000190734863D;
/* 111:123 */     this.zVelocity *= f1;
/* 112:125 */     if (this.landing) {
/* 113:126 */       this.yVelocity *= -0.8999999761581421D;
/* 114:    */     }
/* 115:129 */     this.a += 1;
/* 116:    */     
/* 117:131 */     this.age += 1;
/* 118:132 */     if (this.age >= 6000) {
/* 119:133 */       setDead();
/* 120:    */     }
/* 121:    */   }
/* 122:    */   
/* 123:    */   public boolean W()
/* 124:    */   {
/* 125:139 */     return this.world.a(getAABB(), Material.water, this);
/* 126:    */   }
/* 127:    */   
/* 128:    */   protected void f(int paramInt)
/* 129:    */   {
/* 130:144 */     receiveDamage(DamageSource.inFire, paramInt);
/* 131:    */   }
/* 132:    */   
/* 133:    */   public boolean receiveDamage(DamageSource paramwh, float paramFloat)
/* 134:    */   {
/* 135:149 */     if (isImmuneTo(paramwh)) {
/* 136:150 */       return false;
/* 137:    */     }
/* 138:152 */     ac();
/* 139:153 */     this.health = ((int)(this.health - paramFloat));
/* 140:154 */     if (this.health <= 0) {
/* 141:155 */       setDead();
/* 142:    */     }
/* 143:157 */     return false;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void writeEntityToNBT(NBTTagCompound tag)
/* 147:    */   {
/* 148:162 */     tag.setShort("Health", (short)(byte)this.health);
/* 149:163 */     tag.setShort("Age", (short)this.age);
/* 150:164 */     tag.setShort("Value", (short)this.value);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void readEntityFromNBT(NBTTagCompound tag)
/* 154:    */   {
/* 155:169 */     this.health = (tag.e("Health") & 0xFF);
/* 156:170 */     this.age = tag.e("Age");
/* 157:171 */     this.value = tag.e("Value");
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void onPickedUp(EntityPlayer player)
/* 161:    */   {
/* 162:176 */     if (this.world.isClient) {
/* 163:177 */       return;
/* 164:    */     }
/* 165:180 */     if ((this.c == 0) && (player.expOrbCoolDown == 0))
/* 166:    */     {
/* 167:181 */       player.expOrbCoolDown = 2;
/* 168:182 */       this.world.a(player, "random.orb", 0.1F, 0.5F * ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.7F + 1.8F));
/* 169:183 */       player.a(this, 1);
/* 170:184 */       player.u(this.value);
/* 171:185 */       setDead();
/* 172:    */     }
/* 173:    */   }
/* 174:    */   
/* 175:    */   public int j()
/* 176:    */   {
/* 177:190 */     return this.value;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public int l()
/* 181:    */   {
/* 182:194 */     if (this.value >= 2477) {
/* 183:195 */       return 10;
/* 184:    */     }
/* 185:196 */     if (this.value >= 1237) {
/* 186:197 */       return 9;
/* 187:    */     }
/* 188:198 */     if (this.value >= 617) {
/* 189:199 */       return 8;
/* 190:    */     }
/* 191:200 */     if (this.value >= 307) {
/* 192:201 */       return 7;
/* 193:    */     }
/* 194:202 */     if (this.value >= 149) {
/* 195:203 */       return 6;
/* 196:    */     }
/* 197:204 */     if (this.value >= 73) {
/* 198:205 */       return 5;
/* 199:    */     }
/* 200:206 */     if (this.value >= 37) {
/* 201:207 */       return 4;
/* 202:    */     }
/* 203:208 */     if (this.value >= 17) {
/* 204:209 */       return 3;
/* 205:    */     }
/* 206:210 */     if (this.value >= 7) {
/* 207:211 */       return 2;
/* 208:    */     }
/* 209:212 */     if (this.value >= 3) {
/* 210:213 */       return 1;
/* 211:    */     }
/* 212:216 */     return 0;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public static int a(int paramInt)
/* 216:    */   {
/* 217:228 */     if (paramInt >= 2477) {
/* 218:229 */       return 2477;
/* 219:    */     }
/* 220:230 */     if (paramInt >= 1237) {
/* 221:231 */       return 1237;
/* 222:    */     }
/* 223:232 */     if (paramInt >= 617) {
/* 224:233 */       return 617;
/* 225:    */     }
/* 226:234 */     if (paramInt >= 307) {
/* 227:235 */       return 307;
/* 228:    */     }
/* 229:236 */     if (paramInt >= 149) {
/* 230:237 */       return 149;
/* 231:    */     }
/* 232:238 */     if (paramInt >= 73) {
/* 233:239 */       return 73;
/* 234:    */     }
/* 235:240 */     if (paramInt >= 37) {
/* 236:241 */       return 37;
/* 237:    */     }
/* 238:242 */     if (paramInt >= 17) {
/* 239:243 */       return 17;
/* 240:    */     }
/* 241:244 */     if (paramInt >= 7) {
/* 242:245 */       return 7;
/* 243:    */     }
/* 244:246 */     if (paramInt >= 3) {
/* 245:247 */       return 3;
/* 246:    */     }
/* 247:250 */     return 1;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public boolean aE()
/* 251:    */   {
/* 252:255 */     return false;
/* 253:    */   }
/* 254:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xk
 * JD-Core Version:    0.7.0.1
 */