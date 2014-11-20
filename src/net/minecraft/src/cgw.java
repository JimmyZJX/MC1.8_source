package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class cgw
/*   4:    */   extends Entity
/*   5:    */ {
/*   6:    */   protected int b;
/*   7:    */   protected int c;
/*   8:    */   protected float d;
/*   9:    */   protected float e;
/*  10:    */   protected int f;
/*  11:    */   protected int g;
/*  12:    */   protected float h;
/*  13:    */   protected float i;
/*  14:    */   protected float ap;
/*  15:    */   protected float aq;
/*  16:    */   protected float ar;
/*  17: 19 */   protected float as = 1.0F;
/*  18:    */   protected cue at;
/*  19:    */   public static double au;
/*  20:    */   public static double av;
/*  21:    */   public static double aw;
/*  22:    */   
/*  23:    */   protected cgw(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  24:    */   {
/*  25: 25 */     super(paramaqu);
/*  26:    */     
/*  27: 27 */     a(0.2F, 0.2F);
/*  28: 28 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  29: 29 */     this.P = paramDouble1;
/*  30: 30 */     this.Q = paramDouble2;
/*  31: 31 */     this.R = paramDouble3;
/*  32: 32 */     this.ap = (this.aq = this.ar = 1.0F);
/*  33:    */     
/*  34: 34 */     this.d = (this.rng.nextFloat() * 3.0F);
/*  35: 35 */     this.e = (this.rng.nextFloat() * 3.0F);
/*  36:    */     
/*  37: 37 */     this.h = ((this.rng.nextFloat() * 0.5F + 0.5F) * 2.0F);
/*  38:    */     
/*  39: 39 */     this.g = ((int)(4.0F / (this.rng.nextFloat() * 0.9F + 0.1F)));
/*  40: 40 */     this.f = 0;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public cgw(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  44:    */   {
/*  45: 44 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  46:    */     
/*  47: 46 */     this.xVelocity = (paramDouble4 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
/*  48: 47 */     this.yVelocity = (paramDouble5 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
/*  49: 48 */     this.zVelocity = (paramDouble6 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
/*  50: 49 */     float f1 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
/*  51:    */     
/*  52: 51 */     float f2 = MathUtils.a(this.xVelocity * this.xVelocity + this.yVelocity * this.yVelocity + this.zVelocity * this.zVelocity);
/*  53: 52 */     this.xVelocity = (this.xVelocity / f2 * f1 * 0.4000000059604645D);
/*  54: 53 */     this.yVelocity = (this.yVelocity / f2 * f1 * 0.4000000059604645D + 0.1000000014901161D);
/*  55: 54 */     this.zVelocity = (this.zVelocity / f2 * f1 * 0.4000000059604645D);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public cgw a(float paramFloat)
/*  59:    */   {
/*  60: 58 */     this.xVelocity *= paramFloat;
/*  61: 59 */     this.yVelocity = ((this.yVelocity - 0.1000000014901161D) * paramFloat + 0.1000000014901161D);
/*  62: 60 */     this.zVelocity *= paramFloat;
/*  63: 61 */     return this;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public cgw g(float paramFloat)
/*  67:    */   {
/*  68: 65 */     a(0.2F * paramFloat, 0.2F * paramFloat);
/*  69: 66 */     this.h *= paramFloat;
/*  70: 67 */     return this;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void b(float paramFloat1, float paramFloat2, float paramFloat3)
/*  74:    */   {
/*  75: 71 */     this.ap = paramFloat1;
/*  76: 72 */     this.aq = paramFloat2;
/*  77: 73 */     this.ar = paramFloat3;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void h(float paramFloat)
/*  81:    */   {
/*  82: 77 */     if ((this.as == 1.0F) && (paramFloat < 1.0F)) {
/*  83: 78 */       bsu.z().j.b(this);
/*  84: 79 */     } else if ((this.as < 1.0F) && (paramFloat == 1.0F)) {
/*  85: 80 */       bsu.z().j.c(this);
/*  86:    */     }
/*  87: 82 */     this.as = paramFloat;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public float b()
/*  91:    */   {
/*  92: 86 */     return this.ap;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public float g()
/*  96:    */   {
/*  97: 90 */     return this.aq;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public float i()
/* 101:    */   {
/* 102: 94 */     return this.ar;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public float j()
/* 106:    */   {
/* 107: 98 */     return this.as;
/* 108:    */   }
/* 109:    */   
/* 110:    */   protected boolean r_()
/* 111:    */   {
/* 112:103 */     return false;
/* 113:    */   }
/* 114:    */   
/* 115:    */   protected void h() {}
/* 116:    */   
/* 117:    */   public void onUpdate()
/* 118:    */   {
/* 119:112 */     this.lastX = this.xPos;
/* 120:113 */     this.lastY = this.yPos;
/* 121:114 */     this.lastZ = this.zPos;
/* 122:116 */     if (this.f++ >= this.g) {
/* 123:117 */       setDead();
/* 124:    */     }
/* 125:120 */     this.yVelocity -= 0.04D * this.i;
/* 126:121 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 127:122 */     this.xVelocity *= 0.9800000190734863D;
/* 128:123 */     this.yVelocity *= 0.9800000190734863D;
/* 129:124 */     this.zVelocity *= 0.9800000190734863D;
/* 130:126 */     if (this.C)
/* 131:    */     {
/* 132:127 */       this.xVelocity *= 0.699999988079071D;
/* 133:128 */       this.zVelocity *= 0.699999988079071D;
/* 134:    */     }
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 138:    */   {
/* 139:133 */     float f1 = this.b / 16.0F;
/* 140:134 */     float f2 = f1 + 0.0624375F;
/* 141:135 */     float f3 = this.c / 16.0F;
/* 142:136 */     float f4 = f3 + 0.0624375F;
/* 143:137 */     float f5 = 0.1F * this.h;
/* 144:139 */     if (this.at != null)
/* 145:    */     {
/* 146:140 */       f1 = this.at.e();
/* 147:141 */       f2 = this.at.f();
/* 148:142 */       f3 = this.at.g();
/* 149:143 */       f4 = this.at.h();
/* 150:    */     }
/* 151:146 */     float f6 = (float)(this.lastX + (this.xPos - this.lastX) * paramFloat1 - au);
/* 152:147 */     float f7 = (float)(this.lastY + (this.yPos - this.lastY) * paramFloat1 - av);
/* 153:148 */     float f8 = (float)(this.lastZ + (this.zPos - this.lastZ) * paramFloat1 - aw);
/* 154:    */     
/* 155:150 */     paramciv.setColor(this.ap, this.aq, this.ar, this.as);
/* 156:    */     
/* 157:152 */     paramciv.addVertexWithUV(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/* 158:153 */     paramciv.addVertexWithUV(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/* 159:154 */     paramciv.addVertexWithUV(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/* 160:155 */     paramciv.addVertexWithUV(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/* 161:    */   }
/* 162:    */   
/* 163:    */   public int a()
/* 164:    */   {
/* 165:159 */     return 0;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void writeEntityToNBT(NBTTagCompound paramfn) {}
/* 169:    */   
/* 170:    */   public void readEntityFromNBT(NBTTagCompound paramfn) {}
/* 171:    */   
/* 172:    */   public void a(cue paramcue)
/* 173:    */   {
/* 174:171 */     int j = a();
/* 175:172 */     if (j == 1) {
/* 176:173 */       this.at = paramcue;
/* 177:    */     } else {
/* 178:175 */       throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
/* 179:    */     }
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void k(int paramInt)
/* 183:    */   {
/* 184:180 */     if (a() != 0) {
/* 185:181 */       throw new RuntimeException("Invalid call to Particle.setMiscTex");
/* 186:    */     }
/* 187:183 */     this.b = (paramInt % 16);
/* 188:184 */     this.c = (paramInt / 16);
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void k()
/* 192:    */   {
/* 193:188 */     this.b += 1;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public boolean aE()
/* 197:    */   {
/* 198:193 */     return false;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public String toString()
/* 202:    */   {
/* 203:198 */     return getClass().getSimpleName() + ", Pos (" + this.xPos + "," + this.yPos + "," + this.zPos + "), RGBA (" + this.ap + "," + this.aq + "," + this.ar + "," + this.as + "), Age " + this.f;
/* 204:    */   }
/* 205:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgw
 * JD-Core Version:    0.7.0.1
 */