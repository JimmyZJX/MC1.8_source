package net.minecraft.src;
/*   1:    */ import java.util.BitSet;
/*   2:    */ 
/*   3:    */ class clq
/*   4:    */ {
/*   5:354 */   private final float[] b = new float[4];
/*   6:355 */   private final int[] c = new int[4];
/*   7:    */   
/*   8:    */   public clq(cln paramcln) {}
/*   9:    */   
/*  10:    */   public void a(IBlockAccess paramard, ProtoBlock paramatr, BlockPosition paramdt, EnumDirection paramej, float[] paramArrayOfFloat, BitSet paramBitSet)
/*  11:    */   {
/*  12:361 */     BlockPosition localdt1 = paramBitSet.get(0) ? paramdt.a(paramej) : paramdt;
/*  13:    */     
/*  14:363 */     clp localclp = clp.a(paramej);
/*  15:364 */     BlockPosition localdt2 = localdt1.a(localclp.g[0]);
/*  16:365 */     BlockPosition localdt3 = localdt1.a(localclp.g[1]);
/*  17:366 */     BlockPosition localdt4 = localdt1.a(localclp.g[2]);
/*  18:367 */     BlockPosition localdt5 = localdt1.a(localclp.g[3]);
/*  19:    */     
/*  20:369 */     int i = paramatr.c(paramard, localdt2);
/*  21:370 */     int j = paramatr.c(paramard, localdt3);
/*  22:371 */     int k = paramatr.c(paramard, localdt4);
/*  23:372 */     int m = paramatr.c(paramard, localdt5);
/*  24:    */     
/*  25:374 */     float f1 = paramard.getBlock(localdt2).getProto().f();
/*  26:375 */     float f2 = paramard.getBlock(localdt3).getProto().f();
/*  27:376 */     float f3 = paramard.getBlock(localdt4).getProto().f();
/*  28:377 */     float f4 = paramard.getBlock(localdt5).getProto().f();
/*  29:    */     
/*  30:379 */     boolean bool1 = paramard.getBlock(localdt2.a(paramej)).getProto().o();
/*  31:380 */     boolean bool2 = paramard.getBlock(localdt3.a(paramej)).getProto().o();
/*  32:381 */     boolean bool3 = paramard.getBlock(localdt4.a(paramej)).getProto().o();
/*  33:382 */     boolean bool4 = paramard.getBlock(localdt5.a(paramej)).getProto().o();
/*  34:    */     BlockPosition localdt6;
/*  35:    */     float f5;
/*  36:    */     int n;
/*  37:387 */     if ((bool3) || (bool1))
/*  38:    */     {
/*  39:388 */       localdt6 = localdt2.a(localclp.g[2]);
/*  40:389 */       f5 = paramard.getBlock(localdt6).getProto().f();
/*  41:390 */       n = paramatr.c(paramard, localdt6);
/*  42:    */     }
/*  43:    */     else
/*  44:    */     {
/*  45:392 */       f5 = f1;
/*  46:393 */       n = i;
/*  47:    */     }
/*  48:    */     float f6;
/*  49:    */     int i1;
/*  50:395 */     if ((bool4) || (bool1))
/*  51:    */     {
/*  52:396 */       localdt6 = localdt2.a(localclp.g[3]);
/*  53:397 */       f6 = paramard.getBlock(localdt6).getProto().f();
/*  54:398 */       i1 = paramatr.c(paramard, localdt6);
/*  55:    */     }
/*  56:    */     else
/*  57:    */     {
/*  58:400 */       f6 = f1;
/*  59:401 */       i1 = i;
/*  60:    */     }
/*  61:    */     float f7;
/*  62:    */     int i2;
/*  63:403 */     if ((bool3) || (bool2))
/*  64:    */     {
/*  65:404 */       localdt6 = localdt3.a(localclp.g[2]);
/*  66:405 */       f7 = paramard.getBlock(localdt6).getProto().f();
/*  67:406 */       i2 = paramatr.c(paramard, localdt6);
/*  68:    */     }
/*  69:    */     else
/*  70:    */     {
/*  71:408 */       f7 = f2;
/*  72:409 */       i2 = j;
/*  73:    */     }
/*  74:    */     float f8;
/*  75:    */     int i3;
/*  76:411 */     if ((bool4) || (bool2))
/*  77:    */     {
/*  78:412 */       localdt6 = localdt3.a(localclp.g[3]);
/*  79:413 */       f8 = paramard.getBlock(localdt6).getProto().f();
/*  80:414 */       i3 = paramatr.c(paramard, localdt6);
/*  81:    */     }
/*  82:    */     else
/*  83:    */     {
/*  84:416 */       f8 = f2;
/*  85:417 */       i3 = j;
/*  86:    */     }
/*  87:420 */     int i4 = paramatr.c(paramard, paramdt);
/*  88:421 */     if ((paramBitSet.get(0)) || (!paramard.getBlock(paramdt.a(paramej)).getProto().c())) {
/*  89:422 */       i4 = paramatr.c(paramard, paramdt.a(paramej));
/*  90:    */     }
/*  91:425 */     float f9 = paramBitSet.get(0) ? paramard.getBlock(localdt1).getProto().f() : paramard.getBlock(paramdt).getProto().f();
/*  92:    */     
/*  93:427 */     clr localclr = clr.a(paramej);
/*  94:    */     float f10;
/*  95:    */     float f11;
/*  96:    */     float f12;
/*  97:    */     float f13;
/*  98:429 */     if ((!paramBitSet.get(1)) || (!localclp.i))
/*  99:    */     {
/* 100:430 */       f10 = (f4 + f1 + f6 + f9) * 0.25F;
/* 101:431 */       f11 = (f3 + f1 + f5 + f9) * 0.25F;
/* 102:432 */       f12 = (f3 + f2 + f7 + f9) * 0.25F;
/* 103:433 */       f13 = (f4 + f2 + f8 + f9) * 0.25F;
/* 104:    */       
/* 105:435 */       this.c[clr.a(localclr)] = a(m, i, i1, i4);
/* 106:436 */       this.c[clr.b(localclr)] = a(k, i, n, i4);
/* 107:437 */       this.c[clr.c(localclr)] = a(k, j, i2, i4);
/* 108:438 */       this.c[clr.d(localclr)] = a(m, j, i3, i4);
/* 109:    */       
/* 110:440 */       this.b[clr.a(localclr)] = f10;
/* 111:441 */       this.b[clr.b(localclr)] = f11;
/* 112:442 */       this.b[clr.c(localclr)] = f12;
/* 113:443 */       this.b[clr.d(localclr)] = f13;
/* 114:    */     }
/* 115:    */     else
/* 116:    */     {
/* 117:445 */       f10 = (f4 + f1 + f6 + f9) * 0.25F;
/* 118:446 */       f11 = (f3 + f1 + f5 + f9) * 0.25F;
/* 119:447 */       f12 = (f3 + f2 + f7 + f9) * 0.25F;
/* 120:448 */       f13 = (f4 + f2 + f8 + f9) * 0.25F;
/* 121:    */       
/* 122:450 */       float f14 = paramArrayOfFloat[localclp.j[0].m] * paramArrayOfFloat[localclp.j[1].m];
/* 123:451 */       float f15 = paramArrayOfFloat[localclp.j[2].m] * paramArrayOfFloat[localclp.j[3].m];
/* 124:452 */       float f16 = paramArrayOfFloat[localclp.j[4].m] * paramArrayOfFloat[localclp.j[5].m];
/* 125:453 */       float f17 = paramArrayOfFloat[localclp.j[6].m] * paramArrayOfFloat[localclp.j[7].m];
/* 126:    */       
/* 127:455 */       float f18 = paramArrayOfFloat[localclp.k[0].m] * paramArrayOfFloat[localclp.k[1].m];
/* 128:456 */       float f19 = paramArrayOfFloat[localclp.k[2].m] * paramArrayOfFloat[localclp.k[3].m];
/* 129:457 */       float f20 = paramArrayOfFloat[localclp.k[4].m] * paramArrayOfFloat[localclp.k[5].m];
/* 130:458 */       float f21 = paramArrayOfFloat[localclp.k[6].m] * paramArrayOfFloat[localclp.k[7].m];
/* 131:    */       
/* 132:460 */       float f22 = paramArrayOfFloat[localclp.l[0].m] * paramArrayOfFloat[localclp.l[1].m];
/* 133:461 */       float f23 = paramArrayOfFloat[localclp.l[2].m] * paramArrayOfFloat[localclp.l[3].m];
/* 134:462 */       float f24 = paramArrayOfFloat[localclp.l[4].m] * paramArrayOfFloat[localclp.l[5].m];
/* 135:463 */       float f25 = paramArrayOfFloat[localclp.l[6].m] * paramArrayOfFloat[localclp.l[7].m];
/* 136:    */       
/* 137:465 */       float f26 = paramArrayOfFloat[localclp.m[0].m] * paramArrayOfFloat[localclp.m[1].m];
/* 138:466 */       float f27 = paramArrayOfFloat[localclp.m[2].m] * paramArrayOfFloat[localclp.m[3].m];
/* 139:467 */       float f28 = paramArrayOfFloat[localclp.m[4].m] * paramArrayOfFloat[localclp.m[5].m];
/* 140:468 */       float f29 = paramArrayOfFloat[localclp.m[6].m] * paramArrayOfFloat[localclp.m[7].m];
/* 141:    */       
/* 142:470 */       this.b[clr.a(localclr)] = (f10 * f14 + f11 * f15 + f12 * f16 + f13 * f17);
/* 143:471 */       this.b[clr.b(localclr)] = (f10 * f18 + f11 * f19 + f12 * f20 + f13 * f21);
/* 144:472 */       this.b[clr.c(localclr)] = (f10 * f22 + f11 * f23 + f12 * f24 + f13 * f25);
/* 145:473 */       this.b[clr.d(localclr)] = (f10 * f26 + f11 * f27 + f12 * f28 + f13 * f29);
/* 146:    */       
/* 147:475 */       int i5 = a(m, i, i1, i4);
/* 148:476 */       int i6 = a(k, i, n, i4);
/* 149:477 */       int i7 = a(k, j, i2, i4);
/* 150:478 */       int i8 = a(m, j, i3, i4);
/* 151:    */       
/* 152:480 */       this.c[clr.a(localclr)] = a(i5, i6, i7, i8, f14, f15, f16, f17);
/* 153:481 */       this.c[clr.b(localclr)] = a(i5, i6, i7, i8, f18, f19, f20, f21);
/* 154:482 */       this.c[clr.c(localclr)] = a(i5, i6, i7, i8, f22, f23, f24, f25);
/* 155:483 */       this.c[clr.d(localclr)] = a(i5, i6, i7, i8, f26, f27, f28, f29);
/* 156:    */     }
/* 157:    */   }
/* 158:    */   
/* 159:    */   private int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 160:    */   {
/* 161:488 */     if (paramInt1 == 0) {
/* 162:489 */       paramInt1 = paramInt4;
/* 163:    */     }
/* 164:491 */     if (paramInt2 == 0) {
/* 165:492 */       paramInt2 = paramInt4;
/* 166:    */     }
/* 167:494 */     if (paramInt3 == 0) {
/* 168:495 */       paramInt3 = paramInt4;
/* 169:    */     }
/* 170:497 */     return paramInt1 + paramInt2 + paramInt3 + paramInt4 >> 2 & 0xFF00FF;
/* 171:    */   }
/* 172:    */   
/* 173:    */   private int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 174:    */   {
/* 175:501 */     int i = (int)((paramInt1 >> 16 & 0xFF) * paramFloat1 + (paramInt2 >> 16 & 0xFF) * paramFloat2 + (paramInt3 >> 16 & 0xFF) * paramFloat3 + (paramInt4 >> 16 & 0xFF) * paramFloat4) & 0xFF;
/* 176:502 */     int j = (int)((paramInt1 & 0xFF) * paramFloat1 + (paramInt2 & 0xFF) * paramFloat2 + (paramInt3 & 0xFF) * paramFloat3 + (paramInt4 & 0xFF) * paramFloat4) & 0xFF;
/* 177:503 */     return i << 16 | j;
/* 178:    */   }
				static int[] a(clq arg0) {return arg0.c;}
				static float[] b(clq arg0) {return arg0.b;}
/* 179:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     clq
 * JD-Core Version:    0.7.0.1
 */