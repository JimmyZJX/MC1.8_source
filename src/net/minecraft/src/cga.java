package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class cga
/*   4:    */   extends cgw
/*   5:    */ {
/*   6:    */   private int ax;
/*   7:    */   private final cgx ay;
/*   8:    */   private fv az;
/*   9:    */   boolean a;
/*  10:    */   
/*  11:    */   public cga(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, cgx paramcgx, NBTTagCompound paramfn)
/*  12:    */   {
/*  13: 25 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  14: 26 */     this.xVelocity = paramDouble4;
/*  15: 27 */     this.yVelocity = paramDouble5;
/*  16: 28 */     this.zVelocity = paramDouble6;
/*  17: 29 */     this.ay = paramcgx;
/*  18: 30 */     this.g = 8;
/*  19: 32 */     if (paramfn != null)
/*  20:    */     {
/*  21: 33 */       this.az = paramfn.c("Explosions", 10);
/*  22: 34 */       if (this.az.c() == 0)
/*  23:    */       {
/*  24: 35 */         this.az = null;
/*  25:    */       }
/*  26:    */       else
/*  27:    */       {
/*  28: 37 */         this.g = (this.az.c() * 2 - 1);
/*  29: 40 */         for (int i = 0; i < this.az.c(); i++)
/*  30:    */         {
/*  31: 41 */           NBTTagCompound localfn = this.az.b(i);
/*  32: 42 */           if (localfn.getBoolean("Flicker"))
/*  33:    */           {
/*  34: 43 */             this.a = true;
/*  35: 44 */             this.g += 15;
/*  36: 45 */             break;
/*  37:    */           }
/*  38:    */         }
/*  39:    */       }
/*  40:    */     }
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/*  44:    */   
/*  45:    */   public void onUpdate()
/*  46:    */   {
/*  47: 59 */     if ((this.ax == 0) && (this.az != null))
/*  48:    */     {
/*  49: 60 */       boolean bool1 = l();
/*  50:    */       
/*  51: 62 */       int j = 0;
/*  52: 63 */       if (this.az.c() >= 3) {
/*  53: 64 */         j = 1;
/*  54:    */       } else {
/*  55: 66 */         for (int k = 0; k < this.az.c(); k++)
/*  56:    */         {
/*  57: 67 */           NBTTagCompound localfn = this.az.b(k);
/*  58: 68 */           if (localfn.d("Type") == 1)
/*  59:    */           {
/*  60: 69 */             j = 1;
/*  61: 70 */             break;
/*  62:    */           }
/*  63:    */         }
/*  64:    */       }
/*  65: 75 */       String str = "fireworks." + (j != 0 ? "largeBlast" : "blast") + (bool1 ? "_far" : "");
/*  66: 76 */       this.world.a(this.xPos, this.yPos, this.zPos, str, 20.0F, 0.95F + this.random.nextFloat() * 0.1F, true);
/*  67:    */     }
/*  68:    */     Object localObject;
/*  69: 79 */     if ((this.ax % 2 == 0) && (this.az != null) && (this.ax / 2 < this.az.c()))
/*  70:    */     {
/*  71: 80 */       int i = this.ax / 2;
/*  72: 81 */       localObject = this.az.b(i);
/*  73:    */       
/*  74: 83 */       int m = ((NBTTagCompound)localObject).d("Type");
/*  75: 84 */       boolean bool3 = ((NBTTagCompound)localObject).getBoolean("Trail");
/*  76: 85 */       boolean bool4 = ((NBTTagCompound)localObject).getBoolean("Flicker");
/*  77: 86 */       int[] arrayOfInt1 = ((NBTTagCompound)localObject).l("Colors");
/*  78: 87 */       int[] arrayOfInt2 = ((NBTTagCompound)localObject).l("FadeColors");
/*  79: 89 */       if (arrayOfInt1.length == 0) {
/*  80: 90 */         arrayOfInt1 = new int[] { akw.a[0] };
/*  81:    */       }
/*  82: 95 */       if (m == 1) {
/*  83: 97 */         a(0.5D, 4, arrayOfInt1, arrayOfInt2, bool3, bool4);
/*  84: 98 */       } else if (m == 2) {
/*  85:100 */         a(0.5D, new double[][] { { 0.0D, 1.0D }, { 0.3455D, 0.309D }, { 0.9511D, 0.309D }, { 0.3795918367346939D, -0.126530612244898D }, { 0.6122448979591837D, -0.8040816326530612D }, { 0.0D, -0.3591836734693877D } }, arrayOfInt1, arrayOfInt2, bool3, bool4, false);
/*  86:116 */       } else if (m == 3) {
/*  87:118 */         a(0.5D, new double[][] { { 0.0D, 0.2D }, { 0.2D, 0.2D }, { 0.2D, 0.6D }, { 0.6D, 0.6D }, { 0.6D, 0.2D }, { 0.2D, 0.2D }, { 0.2D, 0.0D }, { 0.4D, 0.0D }, { 0.4D, -0.6D }, { 0.2D, -0.6D }, { 0.2D, -0.4D }, { 0.0D, -0.4D } }, arrayOfInt1, arrayOfInt2, bool3, bool4, true);
/*  88:140 */       } else if (m == 4) {
/*  89:141 */         a(arrayOfInt1, arrayOfInt2, bool3, bool4);
/*  90:    */       } else {
/*  91:144 */         a(0.25D, 2, arrayOfInt1, arrayOfInt2, bool3, bool4);
/*  92:    */       }
/*  93:147 */       int n = arrayOfInt1[0];
/*  94:148 */       float f1 = ((n & 0xFF0000) >> 16) / 255.0F;
/*  95:149 */       float f2 = ((n & 0xFF00) >> 8) / 255.0F;
/*  96:150 */       float f3 = ((n & 0xFF) >> 0) / 255.0F;
/*  97:151 */       cfy localcfy = new cfy(this.world, this.xPos, this.yPos, this.zPos);
/*  98:152 */       localcfy.b(f1, f2, f3);
/*  99:153 */       this.ay.a(localcfy);
/* 100:    */     }
/* 101:156 */     this.ax += 1;
/* 102:157 */     if (this.ax > this.g)
/* 103:    */     {
/* 104:158 */       if (this.a)
/* 105:    */       {
/* 106:159 */         boolean bool2 = l();
/* 107:160 */         localObject = "fireworks." + (bool2 ? "twinkle_far" : "twinkle");
/* 108:161 */         this.world.a(this.xPos, this.yPos, this.zPos, (String)localObject, 20.0F, 0.9F + this.random.nextFloat() * 0.15F, true);
/* 109:    */       }
/* 110:163 */       setDead();
/* 111:    */     }
/* 112:    */   }
/* 113:    */   
/* 114:    */   private boolean l()
/* 115:    */   {
/* 116:168 */     bsu localbsu = bsu.z();
/* 117:169 */     if ((localbsu != null) && (localbsu.aa() != null) && 
/* 118:170 */       (localbsu.aa().e(this.xPos, this.yPos, this.zPos) < 256.0D)) {
/* 119:171 */       return false;
/* 120:    */     }
/* 121:174 */     return true;
/* 122:    */   }
/* 123:    */   
/* 124:    */   private void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2)
/* 125:    */   {
/* 126:178 */     cfz localcfz = new cfz(this.world, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, this.ay);
/* 127:179 */     localcfz.h(0.99F);
/* 128:180 */     localcfz.a(paramBoolean1);
/* 129:181 */     localcfz.i(paramBoolean2);
/* 130:    */     
/* 131:183 */     int i = this.random.nextInt(paramArrayOfInt1.length);
/* 132:184 */     localcfz.a(paramArrayOfInt1[i]);
/* 133:185 */     if ((paramArrayOfInt2 != null) && (paramArrayOfInt2.length > 0)) {
/* 134:186 */       localcfz.b(paramArrayOfInt2[this.random.nextInt(paramArrayOfInt2.length)]);
/* 135:    */     }
/* 136:188 */     this.ay.a(localcfz);
/* 137:    */   }
/* 138:    */   
/* 139:    */   private void a(double paramDouble, int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2)
/* 140:    */   {
/* 141:192 */     double d1 = this.xPos;
/* 142:193 */     double d2 = this.yPos;
/* 143:194 */     double d3 = this.zPos;
/* 144:196 */     for (int i = -paramInt; i <= paramInt; i++) {
/* 145:197 */       for (int j = -paramInt; j <= paramInt; j++) {
/* 146:198 */         for (int k = -paramInt; k <= paramInt; k++)
/* 147:    */         {
/* 148:199 */           double d4 = j + (this.random.nextDouble() - this.random.nextDouble()) * 0.5D;
/* 149:200 */           double d5 = i + (this.random.nextDouble() - this.random.nextDouble()) * 0.5D;
/* 150:201 */           double d6 = k + (this.random.nextDouble() - this.random.nextDouble()) * 0.5D;
/* 151:202 */           double d7 = MathUtils.a(d4 * d4 + d5 * d5 + d6 * d6) / paramDouble + this.random.nextGaussian() * 0.05D;
/* 152:    */           
/* 153:204 */           a(d1, d2, d3, d4 / d7, d5 / d7, d6 / d7, paramArrayOfInt1, paramArrayOfInt2, paramBoolean1, paramBoolean2);
/* 154:206 */           if ((i != -paramInt) && (i != paramInt) && (j != -paramInt) && (j != paramInt)) {
/* 155:207 */             k += paramInt * 2 - 1;
/* 156:    */           }
/* 157:    */         }
/* 158:    */       }
/* 159:    */     }
/* 160:    */   }
/* 161:    */   
/* 162:    */   private void a(double paramDouble, double[][] paramArrayOfDouble, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/* 163:    */   {
/* 164:215 */     double d1 = paramArrayOfDouble[0][0];
/* 165:216 */     double d2 = paramArrayOfDouble[0][1];
/* 166:    */     
/* 167:    */ 
/* 168:219 */     a(this.xPos, this.yPos, this.zPos, d1 * paramDouble, d2 * paramDouble, 0.0D, paramArrayOfInt1, paramArrayOfInt2, paramBoolean1, paramBoolean2);
/* 169:    */     
/* 170:    */ 
/* 171:222 */     float f = this.random.nextFloat() * 3.141593F;
/* 172:223 */     double d3 = paramBoolean3 ? 0.034D : 0.34D;
/* 173:224 */     for (int i = 0; i < 3; i++)
/* 174:    */     {
/* 175:225 */       double d4 = f + i * 3.141593F * d3;
/* 176:    */       
/* 177:227 */       double d5 = d1;
/* 178:228 */       double d6 = d2;
/* 179:230 */       for (int j = 1; j < paramArrayOfDouble.length; j++)
/* 180:    */       {
/* 181:231 */         double d7 = paramArrayOfDouble[j][0];
/* 182:232 */         double d8 = paramArrayOfDouble[j][1];
/* 183:234 */         for (double d9 = 0.25D; d9 <= 1.0D; d9 += 0.25D)
/* 184:    */         {
/* 185:235 */           double d10 = (d5 + (d7 - d5) * d9) * paramDouble;
/* 186:236 */           double d11 = (d6 + (d8 - d6) * d9) * paramDouble;
/* 187:    */           
/* 188:238 */           double d12 = d10 * Math.sin(d4);
/* 189:239 */           d10 *= Math.cos(d4);
/* 190:241 */           for (double d13 = -1.0D; d13 <= 1.0D; d13 += 2.0D) {
/* 191:242 */             a(this.xPos, this.yPos, this.zPos, d10 * d13, d11, d12 * d13, paramArrayOfInt1, paramArrayOfInt2, paramBoolean1, paramBoolean2);
/* 192:    */           }
/* 193:    */         }
/* 194:245 */         d5 = d7;
/* 195:246 */         d6 = d8;
/* 196:    */       }
/* 197:    */     }
/* 198:    */   }
/* 199:    */   
/* 200:    */   private void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2)
/* 201:    */   {
/* 202:252 */     double d1 = this.random.nextGaussian() * 0.05D;
/* 203:253 */     double d2 = this.random.nextGaussian() * 0.05D;
/* 204:255 */     for (int i = 0; i < 70; i++)
/* 205:    */     {
/* 206:256 */       double d3 = this.xVelocity * 0.5D + this.random.nextGaussian() * 0.15D + d1;
/* 207:257 */       double d4 = this.zVelocity * 0.5D + this.random.nextGaussian() * 0.15D + d2;
/* 208:258 */       double d5 = this.yVelocity * 0.5D + this.random.nextDouble() * 0.5D;
/* 209:    */       
/* 210:260 */       a(this.xPos, this.yPos, this.zPos, d3, d5, d4, paramArrayOfInt1, paramArrayOfInt2, paramBoolean1, paramBoolean2);
/* 211:    */     }
/* 212:    */   }
/* 213:    */   
/* 214:    */   public int a()
/* 215:    */   {
/* 216:266 */     return 0;
/* 217:    */   }
/* 218:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cga
 * JD-Core Version:    0.7.0.1
 */