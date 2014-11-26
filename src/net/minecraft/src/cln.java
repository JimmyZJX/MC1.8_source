package net.minecraft.src;
/*   1:    */ import java.util.BitSet;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class cln
/*   5:    */ {
/*   6:    */   public boolean a(IBlockAccess paramard, cxe paramcxe, Block parambec, BlockPosition paramdt, VertexBuffer paramciv)
/*   7:    */   {
/*   8: 33 */     ProtoBlock localatr = parambec.getProto();
/*   9: 34 */     localatr.a(paramard, paramdt);
/*  10: 35 */     return a(paramard, paramcxe, parambec, paramdt, paramciv, true);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean a(IBlockAccess paramard, cxe paramcxe, Block parambec, BlockPosition paramdt, VertexBuffer paramciv, boolean paramBoolean)
/*  14:    */   {
/*  15: 39 */     boolean bool = (bsu.w()) && (parambec.getProto().p() == 0) && (paramcxe.b());
/*  16:    */     try
/*  17:    */     {
/*  18: 41 */       ProtoBlock localatr = parambec.getProto();
/*  19: 42 */       if (bool) {
/*  20: 43 */         return a(paramard, paramcxe, localatr, paramdt, paramciv, paramBoolean);
/*  21:    */       }
/*  22: 45 */       return b(paramard, paramcxe, localatr, paramdt, paramciv, paramBoolean);
/*  23:    */     }
/*  24:    */     catch (Throwable localThrowable)
/*  25:    */     {
/*  26: 48 */       b localb = b.a(localThrowable, "Tesselating block model");
/*  27: 49 */       j localj = localb.a("Block model being tesselated");
/*  28:    */       
/*  29: 51 */       j.a(localj, paramdt, parambec);
/*  30: 52 */       localj.a("Using AO", Boolean.valueOf(bool));
/*  31: 53 */       throw new u(localb);
/*  32:    */     }
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean a(IBlockAccess paramard, cxe paramcxe, ProtoBlock paramatr, BlockPosition paramdt, VertexBuffer paramciv, boolean paramBoolean)
/*  36:    */   {
/*  37: 58 */     boolean bool = false;
/*  38:    */     
/*  39: 60 */     paramciv.b(983055);
/*  40:    */     
/*  41: 62 */     float[] arrayOfFloat = new float[EnumDirection.values().length * 2];
/*  42: 63 */     BitSet localBitSet = new BitSet(3);
/*  43: 64 */     clq localclq = new clq(this);
/*  44: 66 */     for (EnumDirection localej : EnumDirection.values())
/*  45:    */     {
/*  46: 67 */       List localList = paramcxe.a(localej);
/*  47: 68 */       if (!localList.isEmpty())
/*  48:    */       {
/*  49: 72 */         BlockPosition localdt = paramdt.offset(localej);
/*  50: 73 */         if ((!paramBoolean) || (paramatr.a(paramard, localdt, localej)))
/*  51:    */         {
/*  52: 74 */           a(paramard, paramatr, paramdt, paramciv, localList, arrayOfFloat, localBitSet, localclq);
/*  53: 75 */           bool = true;
/*  54:    */         }
/*  55:    */       }
/*  56:    */     }
/*  57: 79 */     List localList = paramcxe.a();
/*  58: 80 */     if (localList.size() > 0)
/*  59:    */     {
/*  60: 81 */       a(paramard, paramatr, paramdt, paramciv, localList, arrayOfFloat, localBitSet, localclq);
/*  61: 82 */       bool = true;
/*  62:    */     }
/*  63: 85 */     return bool;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean b(IBlockAccess paramard, cxe paramcxe, ProtoBlock paramatr, BlockPosition paramdt, VertexBuffer paramciv, boolean paramBoolean)
/*  67:    */   {
/*  68: 89 */     boolean bool = false;
/*  69:    */     
/*  70: 91 */     BitSet localBitSet = new BitSet(3);
/*  71: 92 */     for (EnumDirection localej : EnumDirection.values())
/*  72:    */     {
/*  73: 93 */       List localList = paramcxe.a(localej);
/*  74: 94 */       if (!localList.isEmpty())
/*  75:    */       {
/*  76: 98 */         BlockPosition localdt = paramdt.offset(localej);
/*  77: 99 */         if ((!paramBoolean) || (paramatr.a(paramard, localdt, localej)))
/*  78:    */         {
/*  79:103 */           int k = paramatr.c(paramard, localdt);
/*  80:    */           
/*  81:105 */           a(paramard, paramatr, paramdt, localej, k, false, paramciv, localList, localBitSet);
/*  82:106 */           bool = true;
/*  83:    */         }
/*  84:    */       }
/*  85:    */     }
/*  86:109 */     List localList = paramcxe.a();
/*  87:110 */     if (localList.size() > 0)
/*  88:    */     {
/*  89:111 */       a(paramard, paramatr, paramdt, null, -1, true, paramciv, localList, localBitSet);
/*  90:112 */       bool = true;
/*  91:    */     }
/*  92:115 */     return bool;
/*  93:    */   }
/*  94:    */   
/*  95:    */   private void a(IBlockAccess paramard, ProtoBlock paramatr, BlockPosition paramdt, VertexBuffer paramciv, List<clt> paramList, float[] paramArrayOfFloat, BitSet paramBitSet, clq paramclq)
/*  96:    */   {
/*  97:119 */     double d1 = paramdt.getX();
/*  98:120 */     double d2 = paramdt.getY();
/*  99:121 */     double d3 = paramdt.getZ();
/* 100:    */     
/* 101:123 */     atw localatw = paramatr.Q();
/* 102:124 */     if (localatw != atw.a)
/* 103:    */     {
/* 104:125 */       long l = MathUtils.a(paramdt);
/* 105:    */       
/* 106:127 */       d1 += ((float)(l >> 16 & 0xF) / 15.0F - 0.5D) * 0.5D;
/* 107:128 */       d3 += ((float)(l >> 24 & 0xF) / 15.0F - 0.5D) * 0.5D;
/* 108:129 */       if (localatw == atw.c) {
/* 109:130 */         d2 += ((float)(l >> 20 & 0xF) / 15.0F - 1.0D) * 0.2D;
/* 110:    */       }
/* 111:    */     }
/* 112:134 */     for (clt localclt : paramList)
/* 113:    */     {
/* 114:135 */       a(paramatr, localclt.a(), localclt.d(), paramArrayOfFloat, paramBitSet);
/* 115:136 */       paramclq.a(paramard, paramatr, paramdt, localclt.d(), paramArrayOfFloat, paramBitSet);
/* 116:    */       
/* 117:138 */       paramciv.a(localclt.a());
/* 118:139 */       paramciv.a(clq.a(paramclq)[0], clq.a(paramclq)[1], clq.a(paramclq)[2], clq.a(paramclq)[3]);
/* 119:140 */       if (localclt.b())
/* 120:    */       {
/* 121:141 */         int i = paramatr.a(paramard, paramdt, localclt.c());
/* 122:142 */         if (cji.a) {
/* 123:143 */           i = cuj.c(i);
/* 124:    */         }
/* 125:145 */         float f1 = (i >> 16 & 0xFF) / 255.0F;
/* 126:146 */         float f2 = (i >> 8 & 0xFF) / 255.0F;
/* 127:147 */         float f3 = (i & 0xFF) / 255.0F;
/* 128:    */         
/* 129:149 */         paramciv.a(clq.b(paramclq)[0] * f1, clq.b(paramclq)[0] * f2, clq.b(paramclq)[0] * f3, 4);
/* 130:150 */         paramciv.a(clq.b(paramclq)[1] * f1, clq.b(paramclq)[1] * f2, clq.b(paramclq)[1] * f3, 3);
/* 131:151 */         paramciv.a(clq.b(paramclq)[2] * f1, clq.b(paramclq)[2] * f2, clq.b(paramclq)[2] * f3, 2);
/* 132:152 */         paramciv.a(clq.b(paramclq)[3] * f1, clq.b(paramclq)[3] * f2, clq.b(paramclq)[3] * f3, 1);
/* 133:    */       }
/* 134:    */       else
/* 135:    */       {
/* 136:154 */         paramciv.a(clq.b(paramclq)[0], clq.b(paramclq)[0], clq.b(paramclq)[0], 4);
/* 137:155 */         paramciv.a(clq.b(paramclq)[1], clq.b(paramclq)[1], clq.b(paramclq)[1], 3);
/* 138:156 */         paramciv.a(clq.b(paramclq)[2], clq.b(paramclq)[2], clq.b(paramclq)[2], 2);
/* 139:157 */         paramciv.a(clq.b(paramclq)[3], clq.b(paramclq)[3], clq.b(paramclq)[3], 1);
/* 140:    */       }
/* 141:159 */       paramciv.a(d1, d2, d3);
/* 142:    */     }
/* 143:    */   }
/* 144:    */   
/* 145:    */   private void a(ProtoBlock paramatr, int[] paramArrayOfInt, EnumDirection paramej, float[] paramArrayOfFloat, BitSet paramBitSet)
/* 146:    */   {
/* 147:164 */     float f1 = 32.0F;
/* 148:165 */     float f2 = 32.0F;
/* 149:166 */     float f3 = 32.0F;
/* 150:167 */     float f4 = -32.0F;
/* 151:168 */     float f5 = -32.0F;
/* 152:169 */     float f6 = -32.0F;
/* 153:170 */     for (int i = 0; i < 4; i++)
/* 154:    */     {
/* 155:171 */       float f8 = Float.intBitsToFloat(paramArrayOfInt[(i * 7)]);
/* 156:172 */       float f9 = Float.intBitsToFloat(paramArrayOfInt[(i * 7 + 1)]);
/* 157:173 */       float f10 = Float.intBitsToFloat(paramArrayOfInt[(i * 7 + 2)]);
/* 158:174 */       f1 = Math.min(f1, f8);
/* 159:175 */       f2 = Math.min(f2, f9);
/* 160:176 */       f3 = Math.min(f3, f10);
/* 161:177 */       f4 = Math.max(f4, f8);
/* 162:178 */       f5 = Math.max(f5, f9);
/* 163:179 */       f6 = Math.max(f6, f10);
/* 164:    */     }
/* 165:182 */     if (paramArrayOfFloat != null)
/* 166:    */     {
/* 167:183 */       paramArrayOfFloat[EnumDirection.WEST.a()] = f1;
/* 168:184 */       paramArrayOfFloat[EnumDirection.EAST.a()] = f4;
/* 169:185 */       paramArrayOfFloat[EnumDirection.DOWN.a()] = f2;
/* 170:186 */       paramArrayOfFloat[EnumDirection.UP.a()] = f5;
/* 171:187 */       paramArrayOfFloat[EnumDirection.NORTH.a()] = f3;
/* 172:188 */       paramArrayOfFloat[EnumDirection.SOUTH.a()] = f6;
/* 173:189 */       paramArrayOfFloat[(EnumDirection.WEST.a() + EnumDirection.values().length)] = (1.0F - f1);
/* 174:190 */       paramArrayOfFloat[(EnumDirection.EAST.a() + EnumDirection.values().length)] = (1.0F - f4);
/* 175:191 */       paramArrayOfFloat[(EnumDirection.DOWN.a() + EnumDirection.values().length)] = (1.0F - f2);
/* 176:192 */       paramArrayOfFloat[(EnumDirection.UP.a() + EnumDirection.values().length)] = (1.0F - f5);
/* 177:193 */       paramArrayOfFloat[(EnumDirection.NORTH.a() + EnumDirection.values().length)] = (1.0F - f3);
/* 178:194 */       paramArrayOfFloat[(EnumDirection.SOUTH.a() + EnumDirection.values().length)] = (1.0F - f6);
/* 179:    */     }
/* 180:197 */     float f7 = 1.0E-004F;
/* 181:198 */     float f8 = 0.9999F;
/* 182:199 */     switch (clo.a[paramej.ordinal()])
/* 183:    */     {
/* 184:    */     case 1: 
/* 185:201 */       paramBitSet.set(1, (f1 >= 1.0E-004F) || (f3 >= 1.0E-004F) || (f4 <= 0.9999F) || (f6 <= 0.9999F));
/* 186:202 */       paramBitSet.set(0, ((f2 < 1.0E-004F) || (paramatr.isOpaqueCube())) && (f2 == f5));
/* 187:203 */       break;
/* 188:    */     case 2: 
/* 189:205 */       paramBitSet.set(1, (f1 >= 1.0E-004F) || (f3 >= 1.0E-004F) || (f4 <= 0.9999F) || (f6 <= 0.9999F));
/* 190:206 */       paramBitSet.set(0, ((f5 > 0.9999F) || (paramatr.isOpaqueCube())) && (f2 == f5));
/* 191:207 */       break;
/* 192:    */     case 3: 
/* 193:209 */       paramBitSet.set(1, (f1 >= 1.0E-004F) || (f2 >= 1.0E-004F) || (f4 <= 0.9999F) || (f5 <= 0.9999F));
/* 194:210 */       paramBitSet.set(0, ((f3 < 1.0E-004F) || (paramatr.isOpaqueCube())) && (f3 == f6));
/* 195:211 */       break;
/* 196:    */     case 4: 
/* 197:213 */       paramBitSet.set(1, (f1 >= 1.0E-004F) || (f2 >= 1.0E-004F) || (f4 <= 0.9999F) || (f5 <= 0.9999F));
/* 198:214 */       paramBitSet.set(0, ((f6 > 0.9999F) || (paramatr.isOpaqueCube())) && (f3 == f6));
/* 199:215 */       break;
/* 200:    */     case 5: 
/* 201:217 */       paramBitSet.set(1, (f2 >= 1.0E-004F) || (f3 >= 1.0E-004F) || (f5 <= 0.9999F) || (f6 <= 0.9999F));
/* 202:218 */       paramBitSet.set(0, ((f1 < 1.0E-004F) || (paramatr.isOpaqueCube())) && (f1 == f4));
/* 203:219 */       break;
/* 204:    */     case 6: 
/* 205:221 */       paramBitSet.set(1, (f2 >= 1.0E-004F) || (f3 >= 1.0E-004F) || (f5 <= 0.9999F) || (f6 <= 0.9999F));
/* 206:222 */       paramBitSet.set(0, ((f4 > 0.9999F) || (paramatr.isOpaqueCube())) && (f1 == f4));
/* 207:    */     }
/* 208:    */   }
/* 209:    */   
/* 210:    */   private void a(IBlockAccess paramard, ProtoBlock paramatr, BlockPosition paramdt, EnumDirection paramej, int paramInt, boolean paramBoolean, VertexBuffer paramciv, List<clt> paramList, BitSet paramBitSet)
/* 211:    */   {
/* 212:228 */     double d1 = paramdt.getX();
/* 213:229 */     double d2 = paramdt.getY();
/* 214:230 */     double d3 = paramdt.getZ();
/* 215:    */     
/* 216:232 */     atw localatw = paramatr.Q();
/* 217:233 */     if (localatw != atw.a)
/* 218:    */     {
/* 219:234 */       int i = paramdt.getX();
/* 220:235 */       int j = paramdt.getZ();
/* 221:    */       
/* 222:237 */       long l = i * 3129871 ^ j * 116129781L;
/* 223:238 */       l = l * l * 42317861L + l * 11L;
/* 224:    */       
/* 225:240 */       d1 += ((float)(l >> 16 & 0xF) / 15.0F - 0.5D) * 0.5D;
/* 226:241 */       d3 += ((float)(l >> 24 & 0xF) / 15.0F - 0.5D) * 0.5D;
/* 227:242 */       if (localatw == atw.c) {
/* 228:243 */         d2 += ((float)(l >> 20 & 0xF) / 15.0F - 1.0D) * 0.2D;
/* 229:    */       }
/* 230:    */     }
/* 231:247 */     for (clt localclt : paramList)
/* 232:    */     {
/* 233:248 */       if (paramBoolean)
/* 234:    */       {
/* 235:249 */         a(paramatr, localclt.a(), localclt.d(), null, paramBitSet);
/* 236:    */         
/* 237:251 */         paramInt = paramBitSet.get(0) ? paramatr.c(paramard, paramdt.offset(localclt.d())) : paramatr.c(paramard, paramdt);
/* 238:    */       }
/* 239:253 */       paramciv.a(localclt.a());
/* 240:254 */       paramciv.a(paramInt, paramInt, paramInt, paramInt);
/* 241:255 */       if (localclt.b())
/* 242:    */       {
/* 243:256 */         int k = paramatr.a(paramard, paramdt, localclt.c());
/* 244:257 */         if (cji.a) {
/* 245:258 */           k = cuj.c(k);
/* 246:    */         }
/* 247:260 */         float f1 = (k >> 16 & 0xFF) / 255.0F;
/* 248:261 */         float f2 = (k >> 8 & 0xFF) / 255.0F;
/* 249:262 */         float f3 = (k & 0xFF) / 255.0F;
/* 250:    */         
/* 251:264 */         paramciv.a(f1, f2, f3, 4);
/* 252:265 */         paramciv.a(f1, f2, f3, 3);
/* 253:266 */         paramciv.a(f1, f2, f3, 2);
/* 254:267 */         paramciv.a(f1, f2, f3, 1);
/* 255:    */       }
/* 256:269 */       paramciv.a(d1, d2, d3);
/* 257:    */     }
/* 258:    */   }
/* 259:    */   
/* 260:    */   public void a(cxe paramcxe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 261:    */   {
/* 262:274 */     for (EnumDirection localej : EnumDirection.values()) {
/* 263:275 */       a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramcxe.a(localej));
/* 264:    */     }
/* 265:277 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramcxe.a());
/* 266:    */   }
/* 267:    */   
/* 268:    */   public void a(cxe paramcxe, Block parambec, float paramFloat, boolean paramBoolean)
/* 269:    */   {
/* 270:281 */     ProtoBlock localatr = parambec.getProto();
/* 271:282 */     localatr.h();
/* 272:283 */     cjm.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 273:    */     
/* 274:285 */     int i = localatr.h(localatr.b(parambec));
/* 275:286 */     if (cji.a) {
/* 276:287 */       i = cuj.c(i);
/* 277:    */     }
/* 278:289 */     float f1 = (i >> 16 & 0xFF) / 255.0F;
/* 279:290 */     float f2 = (i >> 8 & 0xFF) / 255.0F;
/* 280:291 */     float f3 = (i & 0xFF) / 255.0F;
/* 281:293 */     if (!paramBoolean) {
/* 282:294 */       cjm.c(paramFloat, paramFloat, paramFloat, 1.0F);
/* 283:    */     }
/* 284:296 */     a(paramcxe, paramFloat, f1, f2, f3);
/* 285:    */   }
/* 286:    */   
/* 287:    */   private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, List<clt> paramList)
/* 288:    */   {
/* 289:300 */     ckx localckx = ckx.getInstance();
/* 290:301 */     VertexBuffer localciv = localckx.getBuffer();
/* 291:302 */     for (clt localclt : paramList)
/* 292:    */     {
/* 293:303 */       localciv.begin();
/* 294:304 */       localciv.setFormat(cuq.b);
/* 295:305 */       localciv.a(localclt.a());
/* 296:306 */       if (localclt.b()) {
/* 297:307 */         localciv.f(paramFloat2 * paramFloat1, paramFloat3 * paramFloat1, paramFloat4 * paramFloat1);
/* 298:    */       } else {
/* 299:309 */         localciv.f(paramFloat1, paramFloat1, paramFloat1);
/* 300:    */       }
/* 301:311 */       fd localfd = localclt.d().m();
/* 302:312 */       localciv.e(localfd.getX(), localfd.getY(), localfd.getZ());
/* 303:313 */       localckx.draw();
/* 304:    */     }
/* 305:    */   }
/* 306:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cln
 * JD-Core Version:    0.7.0.1
 */