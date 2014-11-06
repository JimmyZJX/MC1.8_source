package net.minecraft.src;
/*   1:    */ public abstract class bpa
/*   2:    */ {
/*   3:    */   private long c;
/*   4:    */   protected bpa a;
/*   5:    */   private long d;
/*   6:    */   protected long b;
/*   7:    */   
/*   8:    */   public static bpa[] a(long paramLong, WorldType paramare, String paramString)
/*   9:    */   {
/*  10: 28 */     bpa localObject1 = new boz(1L);
/*  11: 29 */     localObject1 = new bow(2000L, (bpa)localObject1);
/*  12: 30 */     localObject1 = new boo(1L, (bpa)localObject1);
/*  13: 31 */     localObject1 = new bpp(2001L, (bpa)localObject1);
/*  14: 32 */     localObject1 = new boo(2L, (bpa)localObject1);
/*  15: 33 */     localObject1 = new boo(50L, (bpa)localObject1);
/*  16: 34 */     localObject1 = new boo(70L, (bpa)localObject1);
/*  17: 35 */     localObject1 = new bpf(2L, (bpa)localObject1);
/*  18: 36 */     localObject1 = new boq(2L, (bpa)localObject1);
/*  19: 37 */     localObject1 = new boo(3L, (bpa)localObject1);
/*  20: 38 */     localObject1 = new bol(2L, (bpa)localObject1, bon.a);
/*  21: 39 */     localObject1 = new bol(2L, (bpa)localObject1, bon.b);
/*  22: 40 */     localObject1 = new bol(3L, (bpa)localObject1, bon.c);
/*  23: 41 */     localObject1 = new bpp(2002L, (bpa)localObject1);
/*  24: 42 */     localObject1 = new bpp(2003L, (bpa)localObject1);
/*  25: 43 */     localObject1 = new boo(4L, (bpa)localObject1);
/*  26: 44 */     localObject1 = new bop(5L, (bpa)localObject1);
/*  27: 45 */     localObject1 = new bok(4L, (bpa)localObject1);
/*  28: 46 */     localObject1 = bpp.b(1000L, (bpa)localObject1, 0);
/*  29:    */     
/*  30: 48 */     bgl localbgl = null;
/*  31: 49 */     int i = 4;
/*  32: 50 */     int j = i;
/*  33: 51 */     if ((paramare == WorldType.f) && (paramString.length() > 0))
/*  34:    */     {
/*  35: 52 */       localbgl = bgn.a(paramString).b();
/*  36: 53 */       i = localbgl.G;
/*  37: 54 */       j = localbgl.H;
/*  38:    */     }
/*  39: 56 */     if (paramare == WorldType.d) {
/*  40: 57 */       i = 6;
/*  41:    */     }
/*  42: 60 */     Object localObject2 = localObject1;
/*  43: 61 */     localObject2 = bpp.b(1000L, (bpa)localObject2, 0);
/*  44: 62 */     localObject2 = new bpg(100L, (bpa)localObject2);
/*  45:    */     
/*  46: 64 */     bpa localObject3 = localObject1;
/*  47: 65 */     localObject3 = new bos(200L, (bpa)localObject3, paramare, paramString);
/*  48: 66 */     localObject3 = bpp.b(1000L, (bpa)localObject3, 2);
/*  49: 67 */     localObject3 = new bor(1000L, (bpa)localObject3);
/*  50: 68 */     Object localObject4 = localObject2;
/*  51: 69 */     localObject4 = bpp.b(1000L, (bpa)localObject4, 2);
/*  52: 70 */     localObject3 = new bpe(1000L, (bpa)localObject3, (bpa)localObject4);
/*  53:    */     
/*  54: 72 */     localObject2 = bpp.b(1000L, (bpa)localObject2, 2);
/*  55: 73 */     localObject2 = bpp.b(1000L, (bpa)localObject2, j);
/*  56: 74 */     localObject2 = new bph(1L, (bpa)localObject2);
/*  57: 75 */     localObject2 = new bpk(1000L, (bpa)localObject2);
/*  58:    */     
/*  59: 77 */     localObject3 = new bpd(1001L, (bpa)localObject3);
/*  60: 78 */     for (int k = 0; k < i; k++)
/*  61:    */     {
/*  62: 79 */       localObject3 = new bpp(1000 + k, (bpa)localObject3);
/*  63: 80 */       if (k == 0) {
/*  64: 81 */         localObject3 = new boo(3L, (bpa)localObject3);
/*  65:    */       }
/*  66: 84 */       if ((k == 1) || (i == 1)) {
/*  67: 85 */         localObject3 = new bpj(1000L, (bpa)localObject3);
/*  68:    */       }
/*  69:    */     }
/*  70: 89 */     localObject3 = new bpk(1000L, (bpa)localObject3);
/*  71:    */     
/*  72: 91 */     localObject3 = new bpi(100L, (bpa)localObject3, (bpa)localObject2);
/*  73:    */     
/*  74: 93 */     bpa localObject5 = localObject3;
/*  75: 94 */     bpo localbpo = new bpo(10L, (bpa)localObject3);
/*  76:    */     
/*  77: 96 */     ((bpa)localObject3).a(paramLong);
/*  78: 97 */     localbpo.a(paramLong);
/*  79:    */     
/*  80: 99 */     return new bpa[] { localObject3, localbpo, localObject5 };
/*  81:    */   }
/*  82:    */   
/*  83:    */   public bpa(long paramLong)
/*  84:    */   {
/*  85:105 */     this.b = paramLong;
/*  86:106 */     this.b *= (this.b * 6364136223846793005L + 1442695040888963407L);
/*  87:107 */     this.b += paramLong;
/*  88:108 */     this.b *= (this.b * 6364136223846793005L + 1442695040888963407L);
/*  89:109 */     this.b += paramLong;
/*  90:110 */     this.b *= (this.b * 6364136223846793005L + 1442695040888963407L);
/*  91:111 */     this.b += paramLong;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(long paramLong)
/*  95:    */   {
/*  96:115 */     this.c = paramLong;
/*  97:116 */     if (this.a != null) {
/*  98:117 */       this.a.a(paramLong);
/*  99:    */     }
/* 100:119 */     this.c *= (this.c * 6364136223846793005L + 1442695040888963407L);
/* 101:120 */     this.c += this.b;
/* 102:121 */     this.c *= (this.c * 6364136223846793005L + 1442695040888963407L);
/* 103:122 */     this.c += this.b;
/* 104:123 */     this.c *= (this.c * 6364136223846793005L + 1442695040888963407L);
/* 105:124 */     this.c += this.b;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void a(long paramLong1, long paramLong2)
/* 109:    */   {
/* 110:128 */     this.d = this.c;
/* 111:129 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 112:130 */     this.d += paramLong1;
/* 113:131 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 114:132 */     this.d += paramLong2;
/* 115:133 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 116:134 */     this.d += paramLong1;
/* 117:135 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 118:136 */     this.d += paramLong2;
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected int a(int paramInt)
/* 122:    */   {
/* 123:140 */     int i = (int)((this.d >> 24) % paramInt);
/* 124:141 */     if (i < 0) {
/* 125:142 */       i += paramInt;
/* 126:    */     }
/* 127:144 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 128:145 */     this.d += this.c;
/* 129:146 */     return i;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public abstract int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/* 133:    */   
/* 134:    */   protected static boolean a(int paramInt1, int paramInt2)
/* 135:    */   {
/* 136:152 */     if (paramInt1 == paramInt2) {
/* 137:153 */       return true;
/* 138:    */     }
/* 139:155 */     if ((paramInt1 == arm.ab.az) || (paramInt1 == arm.ac.az)) {
/* 140:156 */       return (paramInt2 == arm.ab.az) || (paramInt2 == arm.ac.az);
/* 141:    */     }
/* 142:159 */     arm localarm1 = arm.e(paramInt1);
/* 143:160 */     arm localarm2 = arm.e(paramInt2);
/* 144:    */     try
/* 145:    */     {
/* 146:162 */       if ((localarm1 != null) && (localarm2 != null)) {
/* 147:163 */         return localarm1.a(localarm2);
/* 148:    */       }
/* 149:    */     }
/* 150:    */     catch (Throwable localThrowable)
/* 151:    */     {
/* 152:166 */       b localb = net.minecraft.src.b.a(localThrowable, "Comparing biomes");
/* 153:167 */       j localj = localb.a("Biomes being compared");
/* 154:    */       
/* 155:169 */       localj.a("Biome A ID", Integer.valueOf(paramInt1));
/* 156:170 */       localj.a("Biome B ID", Integer.valueOf(paramInt2));
/* 157:    */       
/* 158:172 */       localj.a("Biome A", new bpb(localarm1));
/* 159:    */       
/* 160:    */ 
/* 161:    */ 
/* 162:    */ 
/* 163:    */ 
/* 164:178 */       localj.a("Biome B", new bpc(localarm2));
/* 165:    */       
/* 166:    */ 
/* 167:    */ 
/* 168:    */ 
/* 169:    */ 
/* 170:    */ 
/* 171:185 */       throw new u(localb);
/* 172:    */     }
/* 173:188 */     return false;
/* 174:    */   }
/* 175:    */   
/* 176:    */   protected static boolean b(int paramInt)
/* 177:    */   {
/* 178:192 */     return (paramInt == arm.p.az) || (paramInt == arm.N.az) || (paramInt == arm.z.az);
/* 179:    */   }
/* 180:    */   
/* 181:    */   protected int a(int... paramVarArgs)
/* 182:    */   {
/* 183:196 */     return paramVarArgs[a(paramVarArgs.length)];
/* 184:    */   }
/* 185:    */   
/* 186:    */   protected int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 187:    */   {
/* 188:200 */     if ((paramInt2 == paramInt3) && (paramInt3 == paramInt4)) {
/* 189:201 */       return paramInt2;
/* 190:    */     }
/* 191:203 */     if ((paramInt1 == paramInt2) && (paramInt1 == paramInt3)) {
/* 192:204 */       return paramInt1;
/* 193:    */     }
/* 194:206 */     if ((paramInt1 == paramInt2) && (paramInt1 == paramInt4)) {
/* 195:207 */       return paramInt1;
/* 196:    */     }
/* 197:209 */     if ((paramInt1 == paramInt3) && (paramInt1 == paramInt4)) {
/* 198:210 */       return paramInt1;
/* 199:    */     }
/* 200:213 */     if ((paramInt1 == paramInt2) && (paramInt3 != paramInt4)) {
/* 201:214 */       return paramInt1;
/* 202:    */     }
/* 203:216 */     if ((paramInt1 == paramInt3) && (paramInt2 != paramInt4)) {
/* 204:217 */       return paramInt1;
/* 205:    */     }
/* 206:219 */     if ((paramInt1 == paramInt4) && (paramInt2 != paramInt3)) {
/* 207:220 */       return paramInt1;
/* 208:    */     }
/* 209:224 */     if ((paramInt2 == paramInt3) && (paramInt1 != paramInt4)) {
/* 210:225 */       return paramInt2;
/* 211:    */     }
/* 212:227 */     if ((paramInt2 == paramInt4) && (paramInt1 != paramInt3)) {
/* 213:228 */       return paramInt2;
/* 214:    */     }
/* 215:233 */     if ((paramInt3 == paramInt4) && (paramInt1 != paramInt2)) {
/* 216:234 */       return paramInt3;
/* 217:    */     }
/* 218:241 */     return a(new int[] { paramInt1, paramInt2, paramInt3, paramInt4 });
/* 219:    */   }
/* 220:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpa
 * JD-Core Version:    0.7.0.1
 */