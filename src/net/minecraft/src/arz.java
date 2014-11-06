package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class arz
/*   6:    */ {
/*   7:    */   private bpa b;
/*   8:    */   private bpa c;
/*   9: 21 */   private arr d = new arr(this);
/*  10:    */   private List e;
/*  11: 24 */   private String f = "";
/*  12:    */   
/*  13:    */   protected arz()
/*  14:    */   {
/*  15: 27 */     this.e = Lists.newArrayList();
/*  16: 28 */     this.e.add(arm.t);
/*  17: 29 */     this.e.add(arm.q);
/*  18: 30 */     this.e.add(arm.u);
/*  19: 31 */     this.e.add(arm.I);
/*  20: 32 */     this.e.add(arm.H);
/*  21: 33 */     this.e.add(arm.K);
/*  22: 34 */     this.e.add(arm.L);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public arz(long paramLong, WorldType paramare, String paramString)
/*  26:    */   {
/*  27: 38 */     this();
/*  28: 39 */     this.f = paramString;
/*  29:    */     
/*  30: 41 */     bpa[] arrayOfbpa = bpa.a(paramLong, paramare, paramString);
/*  31: 42 */     this.b = arrayOfbpa[0];
/*  32: 43 */     this.c = arrayOfbpa[1];
/*  33:    */   }
/*  34:    */   
/*  35:    */   public arz(World paramaqu)
/*  36:    */   {
/*  37: 47 */     this(paramaqu.J(), paramaqu.getWorldInfo().u(), paramaqu.getWorldInfo().B());
/*  38:    */   }
/*  39:    */   
/*  40:    */   public List a()
/*  41:    */   {
/*  42: 56 */     return this.e;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public arm a(BlockPosition paramdt)
/*  46:    */   {
/*  47: 60 */     return a(paramdt, null);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public arm a(BlockPosition paramdt, arm paramarm)
/*  51:    */   {
/*  52: 64 */     return this.d.a(paramdt.getX(), paramdt.getZ(), paramarm);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public float[] a(float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  56:    */   {
/*  57:    */     
/*  58: 69 */     if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < paramInt3 * paramInt4)) {
/*  59: 70 */       paramArrayOfFloat = new float[paramInt3 * paramInt4];
/*  60:    */     }
/*  61: 73 */     int[] arrayOfInt = this.c.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*  62: 74 */     for (int i = 0; i < paramInt3 * paramInt4; i++) {
/*  63:    */       try
/*  64:    */       {
/*  65: 76 */         float f1 = arm.a(arrayOfInt[i], arm.ad).h() / 65536.0F;
/*  66: 77 */         if (f1 > 1.0F) {
/*  67: 78 */           f1 = 1.0F;
/*  68:    */         }
/*  69: 80 */         paramArrayOfFloat[i] = f1;
/*  70:    */       }
/*  71:    */       catch (Throwable localThrowable)
/*  72:    */       {
/*  73: 82 */         b localb = net.minecraft.src.b.a(localThrowable, "Invalid Biome id");
/*  74: 83 */         j localj = localb.a("DownfallBlock");
/*  75: 84 */         localj.a("biome id", Integer.valueOf(i));
/*  76: 85 */         localj.a("downfalls[] size", Integer.valueOf(paramArrayOfFloat.length));
/*  77: 86 */         localj.a("x", Integer.valueOf(paramInt1));
/*  78: 87 */         localj.a("z", Integer.valueOf(paramInt2));
/*  79: 88 */         localj.a("w", Integer.valueOf(paramInt3));
/*  80: 89 */         localj.a("h", Integer.valueOf(paramInt4));
/*  81:    */         
/*  82: 91 */         throw new u(localb);
/*  83:    */       }
/*  84:    */     }
/*  85: 95 */     return paramArrayOfFloat;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public float a(float paramFloat, int paramInt)
/*  89:    */   {
/*  90:103 */     return paramFloat;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public arm[] a(arm[] paramArrayOfarm, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  94:    */   {
/*  95:    */     
/*  96:108 */     if ((paramArrayOfarm == null) || (paramArrayOfarm.length < paramInt3 * paramInt4)) {
/*  97:109 */       paramArrayOfarm = new arm[paramInt3 * paramInt4];
/*  98:    */     }
/*  99:112 */     int[] arrayOfInt = this.b.a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 100:    */     try
/* 101:    */     {
/* 102:114 */       for (int i = 0; i < paramInt3 * paramInt4; i++) {
/* 103:115 */         paramArrayOfarm[i] = arm.a(arrayOfInt[i], arm.ad);
/* 104:    */       }
/* 105:    */     }
/* 106:    */     catch (Throwable localThrowable)
/* 107:    */     {
/* 108:118 */       b localb = net.minecraft.src.b.a(localThrowable, "Invalid Biome id");
/* 109:119 */       j localj = localb.a("RawBiomeBlock");
/* 110:120 */       localj.a("biomes[] size", Integer.valueOf(paramArrayOfarm.length));
/* 111:121 */       localj.a("x", Integer.valueOf(paramInt1));
/* 112:122 */       localj.a("z", Integer.valueOf(paramInt2));
/* 113:123 */       localj.a("w", Integer.valueOf(paramInt3));
/* 114:124 */       localj.a("h", Integer.valueOf(paramInt4));
/* 115:    */       
/* 116:126 */       throw new u(localb);
/* 117:    */     }
/* 118:129 */     return paramArrayOfarm;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public arm[] b(arm[] paramArrayOfarm, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 122:    */   {
/* 123:142 */     return a(paramArrayOfarm, paramInt1, paramInt2, paramInt3, paramInt4, true);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public arm[] a(arm[] paramArrayOfarm, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/* 127:    */   {
/* 128:    */     
/* 129:147 */     if ((paramArrayOfarm == null) || (paramArrayOfarm.length < paramInt3 * paramInt4)) {
/* 130:148 */       paramArrayOfarm = new arm[paramInt3 * paramInt4];
/* 131:    */     }
/* 132:151 */     if ((paramBoolean) && (paramInt3 == 16) && (paramInt4 == 16) && ((paramInt1 & 0xF) == 0) && ((paramInt2 & 0xF) == 0))
/* 133:    */     {
/* 134:152 */       arm[] localObject = this.d.c(paramInt1, paramInt2);
/* 135:153 */       System.arraycopy(localObject, 0, paramArrayOfarm, 0, paramInt3 * paramInt4);
/* 136:154 */       return paramArrayOfarm;
/* 137:    */     }
/* 138:157 */     int[] localObject = this.c.a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 139:158 */     for (int i = 0; i < paramInt3 * paramInt4; i++) {
/* 140:159 */       paramArrayOfarm[i] = arm.a(localObject[i], arm.ad);
/* 141:    */     }
/* 142:162 */     return paramArrayOfarm;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, List paramList)
/* 146:    */   {
/* 147:173 */     boy.a();
/* 148:174 */     int i = paramInt1 - paramInt3 >> 2;
/* 149:175 */     int j = paramInt2 - paramInt3 >> 2;
/* 150:176 */     int k = paramInt1 + paramInt3 >> 2;
/* 151:177 */     int m = paramInt2 + paramInt3 >> 2;
/* 152:    */     
/* 153:179 */     int n = k - i + 1;
/* 154:180 */     int i1 = m - j + 1;
/* 155:    */     
/* 156:182 */     int[] arrayOfInt = this.b.a(i, j, n, i1);
/* 157:    */     try
/* 158:    */     {
/* 159:184 */       for (int i2 = 0; i2 < n * i1; i2++)
/* 160:    */       {
/* 161:185 */         arm localObject = arm.e(arrayOfInt[i2]);
/* 162:186 */         if (!paramList.contains(localObject)) {
/* 163:187 */           return false;
/* 164:    */         }
/* 165:    */       }
/* 166:    */     }
/* 167:    */     catch (Throwable localThrowable)
/* 168:    */     {
/* 169:191 */       Object localObject = net.minecraft.src.b.a(localThrowable, "Invalid Biome id");
/* 170:192 */       j localj = ((b)localObject).a("Layer");
/* 171:193 */       localj.a("Layer", this.b.toString());
/* 172:194 */       localj.a("x", Integer.valueOf(paramInt1));
/* 173:195 */       localj.a("z", Integer.valueOf(paramInt2));
/* 174:196 */       localj.a("radius", Integer.valueOf(paramInt3));
/* 175:197 */       localj.a("allowed", paramList);
/* 176:    */       
/* 177:199 */       throw new u((b)localObject);
/* 178:    */     }
/* 179:202 */     return true;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public BlockPosition a(int paramInt1, int paramInt2, int paramInt3, List paramList, Random paramRandom)
/* 183:    */   {
/* 184:270 */     boy.a();
/* 185:271 */     int i = paramInt1 - paramInt3 >> 2;
/* 186:272 */     int j = paramInt2 - paramInt3 >> 2;
/* 187:273 */     int k = paramInt1 + paramInt3 >> 2;
/* 188:274 */     int m = paramInt2 + paramInt3 >> 2;
/* 189:    */     
/* 190:276 */     int n = k - i + 1;
/* 191:277 */     int i1 = m - j + 1;
/* 192:278 */     int[] arrayOfInt = this.b.a(i, j, n, i1);
/* 193:279 */     BlockPosition localdt = null;
/* 194:280 */     int i2 = 0;
/* 195:281 */     for (int i3 = 0; i3 < n * i1; i3++)
/* 196:    */     {
/* 197:282 */       int i4 = i + i3 % n << 2;
/* 198:283 */       int i5 = j + i3 / n << 2;
/* 199:284 */       arm localarm = arm.e(arrayOfInt[i3]);
/* 200:285 */       if ((paramList.contains(localarm)) && (
/* 201:286 */         (localdt == null) || (paramRandom.nextInt(i2 + 1) == 0)))
/* 202:    */       {
/* 203:287 */         localdt = new BlockPosition(i4, 0, i5);
/* 204:288 */         i2++;
/* 205:    */       }
/* 206:    */     }
/* 207:293 */     return localdt;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void b()
/* 211:    */   {
/* 212:297 */     this.d.a();
/* 213:    */   }
/* 214:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arz
 * JD-Core Version:    0.7.0.1
 */