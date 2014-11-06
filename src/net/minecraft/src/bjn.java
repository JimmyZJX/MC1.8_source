package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bjn
/*   5:    */ {
/*   6:    */   public static void a()
/*   7:    */   {
/*   8: 26 */     bmq.a(bjp.class, "NeBCr");
/*   9: 27 */     bmq.a(bjq.class, "NeBEF");
/*  10: 28 */     bmq.a(bjr.class, "NeBS");
/*  11: 29 */     bmq.a(bjs.class, "NeCCS");
/*  12: 30 */     bmq.a(bjt.class, "NeCTB");
/*  13: 31 */     bmq.a(bju.class, "NeCE");
/*  14: 32 */     bmq.a(bjv.class, "NeSCSC");
/*  15: 33 */     bmq.a(bjw.class, "NeSCLT");
/*  16: 34 */     bmq.a(bjx.class, "NeSC");
/*  17: 35 */     bmq.a(bjy.class, "NeSCRT");
/*  18: 36 */     bmq.a(bjz.class, "NeCSR");
/*  19: 37 */     bmq.a(bka.class, "NeMT");
/*  20: 38 */     bmq.a(bkd.class, "NeRC");
/*  21: 39 */     bmq.a(bke.class, "NeSR");
/*  22: 40 */     bmq.a(bkf.class, "NeStart");
/*  23:    */   }
/*  24:    */   
/*  25: 71 */   private static final bkc[] a = { new bkc(bjr.class, 30, 0, true), new bkc(bjp.class, 10, 4), new bkc(bkd.class, 10, 4), new bkc(bke.class, 10, 3), new bkc(bka.class, 5, 2), new bkc(bju.class, 5, 1) };
/*  26: 79 */   private static final bkc[] b = { new bkc(bjx.class, 25, 0, true), new bkc(bjv.class, 15, 5), new bkc(bjy.class, 5, 10), new bkc(bjw.class, 5, 10), new bkc(bjs.class, 10, 3, true), new bkc(bjt.class, 7, 2), new bkc(bjz.class, 5, 2) };
/*  27:    */   
/*  28:    */   private static bkb b(bkc parambkc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  29:    */   {
/*  30: 91 */     Class localClass = parambkc.a;
/*  31: 92 */     bkb localObject = null;
/*  32: 94 */     if (localClass == bjr.class) {
/*  33: 95 */       localObject = bjr.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  34: 96 */     } else if (localClass == bjp.class) {
/*  35: 97 */       localObject = bjp.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  36: 98 */     } else if (localClass == bkd.class) {
/*  37: 99 */       localObject = bkd.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  38:100 */     } else if (localClass == bke.class) {
/*  39:101 */       localObject = bke.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramej);
/*  40:102 */     } else if (localClass == bka.class) {
/*  41:103 */       localObject = bka.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramej);
/*  42:104 */     } else if (localClass == bju.class) {
/*  43:105 */       localObject = bju.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  44:106 */     } else if (localClass == bjx.class) {
/*  45:107 */       localObject = bjx.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  46:108 */     } else if (localClass == bjy.class) {
/*  47:109 */       localObject = bjy.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  48:110 */     } else if (localClass == bjw.class) {
/*  49:111 */       localObject = bjw.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  50:112 */     } else if (localClass == bjs.class) {
/*  51:113 */       localObject = bjs.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  52:114 */     } else if (localClass == bjt.class) {
/*  53:115 */       localObject = bjt.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  54:116 */     } else if (localClass == bjv.class) {
/*  55:117 */       localObject = bjv.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  56:118 */     } else if (localClass == bjz.class) {
/*  57:119 */       localObject = bjz.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  58:    */     }
/*  59:121 */     return localObject;
/*  60:    */   }
				static bkb a(bkc arg0, List arg1, Random arg2, int arg3, int arg4, int arg5, EnumDirection arg6, int arg7) {return b(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7);}
				static bkc[] b() {return a;}
				static bkc[] c() {return b;}
/*  61:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjn
 * JD-Core Version:    0.7.0.1
 */