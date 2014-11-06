package net.minecraft.src;
/*   1:    */ public abstract class bgd
/*   2:    */ {
/*   3: 23 */   public static final float[] a = { 1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F };
/*   4:    */   protected World world;
/*   5:    */   private WorldType h;
/*   6:    */   private String i;
/*   7:    */   protected arz c;
/*   8:    */   protected boolean d;
/*   9:    */   protected boolean e;
/*  10: 32 */   protected final float[] f = new float[16];
/*  11:    */   protected int g;
/*  12: 36 */   private final float[] j = new float[4];
/*  13:    */   
/*  14:    */   public final void a(World world)
/*  15:    */   {
/*  16: 39 */     this.world = world;
/*  17: 40 */     this.h = world.getWorldInfo().u();
/*  18: 41 */     this.i = world.getWorldInfo().B();
/*  19: 42 */     b();
/*  20: 43 */     a();
/*  21:    */   }
/*  22:    */   
/*  23:    */   protected void a()
/*  24:    */   {
/*  25: 47 */     float f1 = 0.0F;
/*  26: 48 */     for (int k = 0; k <= 15; k++)
/*  27:    */     {
/*  28: 49 */       float f2 = 1.0F - k / 15.0F;
/*  29: 50 */       this.f[k] = ((1.0F - f2) / (f2 * 3.0F + 1.0F) * (1.0F - f1) + f1);
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected void b()
/*  34:    */   {
/*  35: 55 */     WorldType localare = this.world.getWorldInfo().u();
/*  36: 56 */     if (localare == WorldType.FLAT)
/*  37:    */     {
/*  38: 57 */       biv localbiv = biv.a(this.world.getWorldInfo().B());
/*  39: 58 */       this.c = new asc(arm.a(localbiv.a(), arm.ad), 0.5F);
/*  40:    */     }
/*  41: 59 */     else if (localare == WorldType.DEBUG_ALL_BLOCK_STATES)
/*  42:    */     {
/*  43: 60 */       this.c = new asc(arm.q, 0.0F);
/*  44:    */     }
/*  45:    */     else
/*  46:    */     {
/*  47: 62 */       this.c = new arz(this.world);
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public bfe c()
/*  52:    */   {
/*  53: 67 */     if (this.h == WorldType.FLAT) {
/*  54: 68 */       return new bgq(this.world, this.world.J(), this.world.getWorldInfo().s(), this.i);
/*  55:    */     }
/*  56: 69 */     if (this.h == WorldType.DEBUG_ALL_BLOCK_STATES) {
/*  57: 70 */       return new bgp(this.world);
/*  58:    */     }
/*  59: 71 */     if (this.h == WorldType.f) {
/*  60: 72 */       return new bgv(this.world, this.world.J(), this.world.getWorldInfo().s(), this.i);
/*  61:    */     }
/*  62: 74 */     return new bgv(this.world, this.world.J(), this.world.getWorldInfo().s(), this.i);
/*  63:    */   }
/*  64:    */   
/*  65:    */   public boolean a(int paramInt1, int paramInt2)
/*  66:    */   {
/*  67: 79 */     return this.world.c(new BlockPosition(paramInt1, 0, paramInt2)) == BlockList.grass;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public float a(long paramLong, float paramFloat)
/*  71:    */   {
/*  72: 83 */     int k = (int)(paramLong % 24000L);
/*  73: 84 */     float f1 = (k + paramFloat) / 24000.0F - 0.25F;
/*  74: 85 */     if (f1 < 0.0F) {
/*  75: 86 */       f1 += 1.0F;
/*  76:    */     }
/*  77: 88 */     if (f1 > 1.0F) {
/*  78: 89 */       f1 -= 1.0F;
/*  79:    */     }
/*  80: 91 */     float f2 = f1;
/*  81: 92 */     f1 = 1.0F - (float)((Math.cos(f1 * 3.141592653589793D) + 1.0D) / 2.0D);
/*  82: 93 */     f1 = f2 + (f1 - f2) / 3.0F;
/*  83: 94 */     return f1;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public int a(long paramLong)
/*  87:    */   {
/*  88: 99 */     return (int)(paramLong / 24000L % 8L + 8L) % 8;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public boolean d()
/*  92:    */   {
/*  93:103 */     return true;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public float[] a(float paramFloat1, float paramFloat2)
/*  97:    */   {
/*  98:108 */     float f1 = 0.4F;
/*  99:109 */     float f2 = MathUtils.cos(paramFloat1 * 3.141593F * 2.0F) - 0.0F;
/* 100:110 */     float f3 = -0.0F;
/* 101:111 */     if ((f2 >= f3 - f1) && (f2 <= f3 + f1))
/* 102:    */     {
/* 103:112 */       float f4 = (f2 - f3) / f1 * 0.5F + 0.5F;
/* 104:113 */       float f5 = 1.0F - (1.0F - MathUtils.sin(f4 * 3.141593F)) * 0.99F;
/* 105:114 */       f5 *= f5;
/* 106:115 */       this.j[0] = (f4 * 0.3F + 0.7F);
/* 107:116 */       this.j[1] = (f4 * f4 * 0.7F + 0.2F);
/* 108:117 */       this.j[2] = (f4 * f4 * 0.0F + 0.2F);
/* 109:118 */       this.j[3] = f5;
/* 110:119 */       return this.j;
/* 111:    */     }
/* 112:122 */     return null;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public Vec3 b(float paramFloat1, float paramFloat2)
/* 116:    */   {
/* 117:126 */     float f1 = MathUtils.cos(paramFloat1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
/* 118:127 */     f1 = MathUtils.clamp(f1, 0.0F, 1.0F);
/* 119:    */     
/* 120:129 */     float f2 = 0.7529412F;
/* 121:130 */     float f3 = 0.8470588F;
/* 122:131 */     float f4 = 1.0F;
/* 123:132 */     f2 *= (f1 * 0.94F + 0.06F);
/* 124:133 */     f3 *= (f1 * 0.94F + 0.06F);
/* 125:134 */     f4 *= (f1 * 0.91F + 0.09F);
/* 126:    */     
/* 127:136 */     return new Vec3(f2, f3, f4);
/* 128:    */   }
/* 129:    */   
/* 130:    */   public boolean e()
/* 131:    */   {
/* 132:140 */     return true;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public static bgd a(int paramInt)
/* 136:    */   {
/* 137:145 */     if (paramInt == -1) {
/* 138:146 */       return new bge();
/* 139:    */     }
/* 140:148 */     if (paramInt == 0) {
/* 141:149 */       return new bgg();
/* 142:    */     }
/* 143:151 */     if (paramInt == 1) {
/* 144:152 */       return new bgh();
/* 145:    */     }
/* 146:154 */     return null;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public float f()
/* 150:    */   {
/* 151:158 */     return 128.0F;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public boolean g()
/* 155:    */   {
/* 156:162 */     return true;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public BlockPosition h()
/* 160:    */   {
/* 161:166 */     return null;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public int i()
/* 165:    */   {
/* 166:170 */     if (this.h == WorldType.FLAT) {
/* 167:171 */       return 4;
/* 168:    */     }
/* 169:173 */     return 64;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public double j()
/* 173:    */   {
/* 174:177 */     if (this.h == WorldType.FLAT) {
/* 175:178 */       return 1.0D;
/* 176:    */     }
/* 177:180 */     return 0.03125D;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public boolean b(int paramInt1, int paramInt2)
/* 181:    */   {
/* 182:184 */     return false;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public abstract String k();
/* 186:    */   
/* 187:    */   public abstract String l();
/* 188:    */   
/* 189:    */   public arz m()
/* 190:    */   {
/* 191:192 */     return this.c;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public boolean n()
/* 195:    */   {
/* 196:196 */     return this.d;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public boolean o()
/* 200:    */   {
/* 201:200 */     return this.e;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public float[] p()
/* 205:    */   {
/* 206:204 */     return this.f;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public int q()
/* 210:    */   {
/* 211:208 */     return this.g;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public bfb r()
/* 215:    */   {
/* 216:212 */     return new bfb();
/* 217:    */   }
/* 218:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgd
 * JD-Core Version:    0.7.0.1
 */