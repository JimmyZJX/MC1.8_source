package net.minecraft.src;
/*   1:    */ import javax.vecmath.AxisAngle4d;
/*   2:    */ import javax.vecmath.Matrix4d;
/*   3:    */ import javax.vecmath.Vector3d;
/*   4:    */ import javax.vecmath.Vector3f;
/*   5:    */ 
/*   6:    */ public class cmp
/*   7:    */ {
/*   8: 21 */   private static final double a = 1.0D / Math.cos(0.3926990816987241D) - 1.0D;
/*   9: 22 */   private static final double b = 1.0D / Math.cos(0.7853981633974483D) - 1.0D;
/*  10:    */   
/*  11:    */   public clt a(Vector3f paramVector3f1, Vector3f paramVector3f2, clx paramclx, cue paramcue, EnumDirection paramej, cxf paramcxf, clz paramclz, boolean paramBoolean1, boolean paramBoolean2)
/*  12:    */   {
/*  13: 30 */     int[] arrayOfInt = a(paramclx, paramcue, paramej, a(paramVector3f1, paramVector3f2), paramcxf, paramclz, paramBoolean1, paramBoolean2);
/*  14: 31 */     EnumDirection localej = a(arrayOfInt);
/*  15: 33 */     if (paramBoolean1) {
/*  16: 34 */       a(arrayOfInt, localej, paramclx.e, paramcue);
/*  17:    */     }
/*  18: 36 */     if (paramclz == null) {
/*  19: 37 */       a(arrayOfInt, localej);
/*  20:    */     }
/*  21: 40 */     return new clt(arrayOfInt, paramclx.c, localej);
/*  22:    */   }
/*  23:    */   
/*  24:    */   private int[] a(clx paramclx, cue paramcue, EnumDirection paramej, float[] paramArrayOfFloat, cxf paramcxf, clz paramclz, boolean paramBoolean1, boolean paramBoolean2)
/*  25:    */   {
/*  26: 44 */     int[] arrayOfInt = new int[28];
/*  27: 45 */     for (int i = 0; i < 4; i++) {
/*  28: 46 */       a(arrayOfInt, i, paramej, paramclx, paramArrayOfFloat, paramcue, paramcxf, paramclz, paramBoolean1, paramBoolean2);
/*  29:    */     }
/*  30: 48 */     return arrayOfInt;
/*  31:    */   }
/*  32:    */   
/*  33:    */   private int a(EnumDirection paramej)
/*  34:    */   {
/*  35: 52 */     float f = b(paramej);
/*  36:    */     
/*  37: 54 */     int i = MathUtils.clamp((int)(f * 255.0F), 0, 255);
/*  38: 55 */     return 0xFF000000 | i << 16 | i << 8 | i;
/*  39:    */   }
/*  40:    */   
/*  41:    */   private float b(EnumDirection paramej)
/*  42:    */   {
/*  43: 59 */     switch (cmq.a[paramej.ordinal()])
/*  44:    */     {
/*  45:    */     case 1: 
/*  46: 61 */       return 0.5F;
/*  47:    */     case 2: 
/*  48: 63 */       return 1.0F;
/*  49:    */     case 3: 
/*  50:    */     case 4: 
/*  51: 66 */       return 0.8F;
/*  52:    */     case 5: 
/*  53:    */     case 6: 
/*  54: 69 */       return 0.6F;
/*  55:    */     }
/*  56: 71 */     return 1.0F;
/*  57:    */   }
/*  58:    */   
/*  59:    */   private float[] a(Vector3f paramVector3f1, Vector3f paramVector3f2)
/*  60:    */   {
/*  61: 75 */     float[] arrayOfFloat = new float[EnumDirection.values().length];
/*  62: 76 */     arrayOfFloat[cjg.f] = (paramVector3f1.x / 16.0F);
/*  63: 77 */     arrayOfFloat[cjg.e] = (paramVector3f1.y / 16.0F);
/*  64: 78 */     arrayOfFloat[cjg.d] = (paramVector3f1.z / 16.0F);
/*  65: 79 */     arrayOfFloat[cjg.c] = (paramVector3f2.x / 16.0F);
/*  66: 80 */     arrayOfFloat[cjg.b] = (paramVector3f2.y / 16.0F);
/*  67: 81 */     arrayOfFloat[cjg.a] = (paramVector3f2.z / 16.0F);
/*  68: 82 */     return arrayOfFloat;
/*  69:    */   }
/*  70:    */   
/*  71:    */   private void a(int[] paramArrayOfInt, int paramInt, EnumDirection paramej, clx paramclx, float[] paramArrayOfFloat, cue paramcue, cxf paramcxf, clz paramclz, boolean paramBoolean1, boolean paramBoolean2)
/*  72:    */   {
/*  73: 86 */     EnumDirection localej = paramcxf.a(paramej);
/*  74: 87 */     int i = paramBoolean2 ? a(localej) : -1;
/*  75: 88 */     cjh localcjh = cje.a(paramej).a(paramInt);
/*  76:    */     
/*  77: 90 */     Vector3d localVector3d = new Vector3d(paramArrayOfFloat[localcjh.a], paramArrayOfFloat[localcjh.b], paramArrayOfFloat[localcjh.c]);
/*  78: 91 */     a(localVector3d, paramclz);
/*  79: 92 */     int j = a(localVector3d, paramej, paramInt, paramcxf, paramBoolean1);
/*  80:    */     
/*  81: 94 */     a(paramArrayOfInt, j, paramInt, localVector3d, i, paramcue, paramclx.e);
/*  82:    */   }
/*  83:    */   
/*  84:    */   private void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, Vector3d paramVector3d, int paramInt3, cue paramcue, cma paramcma)
/*  85:    */   {
/*  86: 98 */     int i = paramInt1 * 7;
/*  87: 99 */     paramArrayOfInt[i] = Float.floatToRawIntBits((float)paramVector3d.x);
/*  88:100 */     paramArrayOfInt[(i + 1)] = Float.floatToRawIntBits((float)paramVector3d.y);
/*  89:101 */     paramArrayOfInt[(i + 2)] = Float.floatToRawIntBits((float)paramVector3d.z);
/*  90:102 */     paramArrayOfInt[(i + 3)] = paramInt3;
/*  91:103 */     paramArrayOfInt[(i + 4)] = Float.floatToRawIntBits(paramcue.a(paramcma.a(paramInt2)));
/*  92:104 */     paramArrayOfInt[(i + 4 + 1)] = Float.floatToRawIntBits(paramcue.b(paramcma.b(paramInt2)));
/*  93:    */   }
/*  94:    */   
/*  95:    */   private void a(Vector3d paramVector3d, clz paramclz)
/*  96:    */   {
/*  97:108 */     if (paramclz == null) {
/*  98:109 */       return;
/*  99:    */     }
/* 100:112 */     Matrix4d localMatrix4d = a();
/* 101:    */     
/* 102:114 */     Vector3d localVector3d = new Vector3d(0.0D, 0.0D, 0.0D);
/* 103:115 */     switch (cmq.b[paramclz.b.ordinal()])
/* 104:    */     {
/* 105:    */     case 1: 
/* 106:117 */       localMatrix4d.mul(a(new AxisAngle4d(1.0D, 0.0D, 0.0D, paramclz.c * 0.0174532925199433D)));
/* 107:118 */       localVector3d.set(0.0D, 1.0D, 1.0D);
/* 108:119 */       break;
/* 109:    */     case 2: 
/* 110:121 */       localMatrix4d.mul(a(new AxisAngle4d(0.0D, 1.0D, 0.0D, paramclz.c * 0.0174532925199433D)));
/* 111:122 */       localVector3d.set(1.0D, 0.0D, 1.0D);
/* 112:123 */       break;
/* 113:    */     case 3: 
/* 114:125 */       localMatrix4d.mul(a(new AxisAngle4d(0.0D, 0.0D, 1.0D, paramclz.c * 0.0174532925199433D)));
/* 115:126 */       localVector3d.set(1.0D, 1.0D, 0.0D);
/* 116:    */     }
/* 117:130 */     if (paramclz.d)
/* 118:    */     {
/* 119:131 */       if (Math.abs(paramclz.c) == 22.5F) {
/* 120:132 */         localVector3d.scale(a);
/* 121:    */       } else {
/* 122:134 */         localVector3d.scale(b);
/* 123:    */       }
/* 124:136 */       localVector3d.add(new Vector3d(1.0D, 1.0D, 1.0D));
/* 125:    */     }
/* 126:    */     else
/* 127:    */     {
/* 128:138 */       localVector3d.set(new Vector3d(1.0D, 1.0D, 1.0D));
/* 129:    */     }
/* 130:141 */     a(paramVector3d, new Vector3d(paramclz.a), localMatrix4d, localVector3d);
/* 131:    */   }
/* 132:    */   
/* 133:    */   public int a(Vector3d paramVector3d, EnumDirection paramej, int paramInt, cxf paramcxf, boolean paramBoolean)
/* 134:    */   {
/* 135:145 */     if (paramcxf == cxf.a) {
/* 136:146 */       return paramInt;
/* 137:    */     }
/* 138:149 */     a(paramVector3d, new Vector3d(0.5D, 0.5D, 0.5D), paramcxf.a(), new Vector3d(1.0D, 1.0D, 1.0D));
/* 139:    */     
/* 140:151 */     return paramcxf.a(paramej, paramInt);
/* 141:    */   }
/* 142:    */   
/* 143:    */   private void a(Vector3d paramVector3d1, Vector3d paramVector3d2, Matrix4d paramMatrix4d, Vector3d paramVector3d3)
/* 144:    */   {
/* 145:155 */     paramVector3d1.sub(paramVector3d2);
/* 146:156 */     paramMatrix4d.transform(paramVector3d1);
/* 147:157 */     paramVector3d1.x *= paramVector3d3.x;
/* 148:158 */     paramVector3d1.y *= paramVector3d3.y;
/* 149:159 */     paramVector3d1.z *= paramVector3d3.z;
/* 150:160 */     paramVector3d1.add(paramVector3d2);
/* 151:    */   }
/* 152:    */   
/* 153:    */   private Matrix4d a(AxisAngle4d paramAxisAngle4d)
/* 154:    */   {
/* 155:164 */     Matrix4d localMatrix4d = a();
/* 156:165 */     localMatrix4d.setRotation(paramAxisAngle4d);
/* 157:166 */     return localMatrix4d;
/* 158:    */   }
/* 159:    */   
/* 160:    */   private Matrix4d a()
/* 161:    */   {
/* 162:170 */     Matrix4d localMatrix4d = new Matrix4d();
/* 163:171 */     localMatrix4d.setIdentity();
/* 164:172 */     return localMatrix4d;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public static EnumDirection a(int[] paramArrayOfInt)
/* 168:    */   {
/* 169:176 */     Vector3f localVector3f1 = new Vector3f(Float.intBitsToFloat(paramArrayOfInt[0]), Float.intBitsToFloat(paramArrayOfInt[1]), Float.intBitsToFloat(paramArrayOfInt[2]));
/* 170:177 */     Vector3f localVector3f2 = new Vector3f(Float.intBitsToFloat(paramArrayOfInt[7]), Float.intBitsToFloat(paramArrayOfInt[8]), Float.intBitsToFloat(paramArrayOfInt[9]));
/* 171:178 */     Vector3f localVector3f3 = new Vector3f(Float.intBitsToFloat(paramArrayOfInt[14]), Float.intBitsToFloat(paramArrayOfInt[15]), Float.intBitsToFloat(paramArrayOfInt[16]));
/* 172:179 */     Vector3f localVector3f4 = new Vector3f();
/* 173:180 */     Vector3f localVector3f5 = new Vector3f();
/* 174:181 */     Vector3f localVector3f6 = new Vector3f();
/* 175:182 */     localVector3f4.sub(localVector3f1, localVector3f2);
/* 176:183 */     localVector3f5.sub(localVector3f3, localVector3f2);
/* 177:184 */     localVector3f6.cross(localVector3f5, localVector3f4);
/* 178:185 */     localVector3f6.normalize();
/* 179:186 */     EnumDirection localObject = null;
/* 180:187 */     float f1 = 0.0F;
/* 181:188 */     for (EnumDirection localej : EnumDirection.values())
/* 182:    */     {
/* 183:189 */       fd localfd = localej.m();
/* 184:190 */       Vector3f localVector3f7 = new Vector3f(localfd.getX(), localfd.getY(), localfd.getZ());
/* 185:191 */       float f2 = localVector3f6.dot(localVector3f7);
/* 186:193 */       if ((f2 >= 0.0F) && (f2 > f1))
/* 187:    */       {
/* 188:194 */         f1 = f2;
/* 189:195 */         localObject = localej;
/* 190:    */       }
/* 191:    */     }
/* 192:198 */     if (localObject == null) {
/* 193:199 */       return EnumDirection.UP;
/* 194:    */     }
/* 195:201 */     return localObject;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void a(int[] paramArrayOfInt, EnumDirection paramej, cma paramcma, cue paramcue)
/* 199:    */   {
/* 200:205 */     for (int i = 0; i < 4; i++) {
/* 201:206 */       a(i, paramArrayOfInt, paramej, paramcma, paramcue);
/* 202:    */     }
/* 203:    */   }
/* 204:    */   
/* 205:    */   private void a(int[] paramArrayOfInt, EnumDirection paramej)
/* 206:    */   {
/* 207:211 */     int[] arrayOfInt = new int[paramArrayOfInt.length];
/* 208:212 */     System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramArrayOfInt.length);
/* 209:    */     
/* 210:214 */     float[] arrayOfFloat = new float[EnumDirection.values().length];
/* 211:215 */     arrayOfFloat[cjg.f] = 999.0F;
/* 212:216 */     arrayOfFloat[cjg.e] = 999.0F;
/* 213:217 */     arrayOfFloat[cjg.d] = 999.0F;
/* 214:218 */     arrayOfFloat[cjg.c] = -999.0F;
/* 215:219 */     arrayOfFloat[cjg.b] = -999.0F;
/* 216:220 */     arrayOfFloat[cjg.a] = -999.0F;
/* 217:    */     float f3;
/* 218:221 */     for (int i = 0; i < 4; i++)
/* 219:    */     {
/* 220:222 */       int j = 7 * i;
/* 221:223 */       float f1 = Float.intBitsToFloat(arrayOfInt[j]);
/* 222:224 */       float f2 = Float.intBitsToFloat(arrayOfInt[(j + 1)]);
/* 223:225 */       f3 = Float.intBitsToFloat(arrayOfInt[(j + 2)]);
/* 224:226 */       if (f1 < arrayOfFloat[cjg.f]) {
/* 225:227 */         arrayOfFloat[cjg.f] = f1;
/* 226:    */       }
/* 227:229 */       if (f2 < arrayOfFloat[cjg.e]) {
/* 228:230 */         arrayOfFloat[cjg.e] = f2;
/* 229:    */       }
/* 230:232 */       if (f3 < arrayOfFloat[cjg.d]) {
/* 231:233 */         arrayOfFloat[cjg.d] = f3;
/* 232:    */       }
/* 233:235 */       if (f1 > arrayOfFloat[cjg.c]) {
/* 234:236 */         arrayOfFloat[cjg.c] = f1;
/* 235:    */       }
/* 236:238 */       if (f2 > arrayOfFloat[cjg.b]) {
/* 237:239 */         arrayOfFloat[cjg.b] = f2;
/* 238:    */       }
/* 239:241 */       if (f3 > arrayOfFloat[cjg.a]) {
/* 240:242 */         arrayOfFloat[cjg.a] = f3;
/* 241:    */       }
/* 242:    */     }
/* 243:246 */     cje localcje = cje.a(paramej);
/* 244:247 */     for (int j = 0; j < 4; j++)
/* 245:    */     {
/* 246:248 */       int k = 7 * j;
/* 247:249 */       cjh localcjh = localcje.a(j);
/* 248:    */       
/* 249:251 */       f3 = arrayOfFloat[localcjh.a];
/* 250:252 */       float f4 = arrayOfFloat[localcjh.b];
/* 251:253 */       float f5 = arrayOfFloat[localcjh.c];
/* 252:    */       
/* 253:255 */       paramArrayOfInt[k] = Float.floatToRawIntBits(f3);
/* 254:256 */       paramArrayOfInt[(k + 1)] = Float.floatToRawIntBits(f4);
/* 255:257 */       paramArrayOfInt[(k + 2)] = Float.floatToRawIntBits(f5);
/* 256:259 */       for (int m = 0; m < 4; m++)
/* 257:    */       {
/* 258:260 */         int n = 7 * m;
/* 259:261 */         float f6 = Float.intBitsToFloat(arrayOfInt[n]);
/* 260:262 */         float f7 = Float.intBitsToFloat(arrayOfInt[(n + 1)]);
/* 261:263 */         float f8 = Float.intBitsToFloat(arrayOfInt[(n + 2)]);
/* 262:264 */         if ((MathUtils.a(f3, f6)) && (MathUtils.a(f4, f7)) && (MathUtils.a(f5, f8)))
/* 263:    */         {
/* 264:265 */           paramArrayOfInt[(k + 4)] = arrayOfInt[(n + 4)];
/* 265:266 */           paramArrayOfInt[(k + 4 + 1)] = arrayOfInt[(n + 4 + 1)];
/* 266:    */         }
/* 267:    */       }
/* 268:    */     }
/* 269:    */   }
/* 270:    */   
/* 271:    */   private void a(int paramInt, int[] paramArrayOfInt, EnumDirection paramej, cma paramcma, cue paramcue)
/* 272:    */   {
/* 273:273 */     int i = 7 * paramInt;
/* 274:274 */     float f1 = Float.intBitsToFloat(paramArrayOfInt[i]);
/* 275:275 */     float f2 = Float.intBitsToFloat(paramArrayOfInt[(i + 1)]);
/* 276:276 */     float f3 = Float.intBitsToFloat(paramArrayOfInt[(i + 2)]);
/* 277:278 */     if ((f1 < -0.1F) || (f1 >= 1.1F)) {
/* 278:279 */       f1 -= MathUtils.floor(f1);
/* 279:    */     }
/* 280:281 */     if ((f2 < -0.1F) || (f2 >= 1.1F)) {
/* 281:282 */       f2 -= MathUtils.floor(f2);
/* 282:    */     }
/* 283:284 */     if ((f3 < -0.1F) || (f3 >= 1.1F)) {
/* 284:285 */       f3 -= MathUtils.floor(f3);
/* 285:    */     }
/* 286:288 */     float f4 = 0.0F;
/* 287:289 */     float f5 = 0.0F;
/* 288:290 */     switch (cmq.a[paramej.ordinal()])
/* 289:    */     {
/* 290:    */     case 1: 
/* 291:293 */       f4 = f1 * 16.0F;
/* 292:294 */       f5 = (1.0F - f3) * 16.0F;
/* 293:295 */       break;
/* 294:    */     case 2: 
/* 295:298 */       f4 = f1 * 16.0F;
/* 296:299 */       f5 = f3 * 16.0F;
/* 297:300 */       break;
/* 298:    */     case 3: 
/* 299:303 */       f4 = (1.0F - f1) * 16.0F;
/* 300:304 */       f5 = (1.0F - f2) * 16.0F;
/* 301:305 */       break;
/* 302:    */     case 4: 
/* 303:308 */       f4 = f1 * 16.0F;
/* 304:309 */       f5 = (1.0F - f2) * 16.0F;
/* 305:310 */       break;
/* 306:    */     case 5: 
/* 307:313 */       f4 = f3 * 16.0F;
/* 308:314 */       f5 = (1.0F - f2) * 16.0F;
/* 309:315 */       break;
/* 310:    */     case 6: 
/* 311:318 */       f4 = (1.0F - f3) * 16.0F;
/* 312:319 */       f5 = (1.0F - f2) * 16.0F;
/* 313:    */     }
/* 314:323 */     int j = paramcma.c(paramInt) * 7;
/* 315:324 */     paramArrayOfInt[(j + 4)] = Float.floatToRawIntBits(paramcue.a(f4));
/* 316:325 */     paramArrayOfInt[(j + 4 + 1)] = Float.floatToRawIntBits(paramcue.b(f5));
/* 317:    */   }
/* 318:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmp
 * JD-Core Version:    0.7.0.1
 */