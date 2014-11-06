package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class cqu
/*   4:    */   extends cpu<ads>
/*   5:    */ {
/*   6:    */   public cqu(cpt paramcpt)
/*   7:    */   {
/*   8: 15 */     super(paramcpt);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public void a(ads paramads, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  12:    */   {
/*  13: 20 */     ckx localckx = ckx.getInstance();
/*  14: 21 */     VertexBuffer localciv = localckx.getBuffer();
/*  15:    */     
/*  16: 23 */     cjm.x();
/*  17: 24 */     cjm.disableLighting();
/*  18: 25 */     cjm.enableBlend();
/*  19: 26 */     cjm.glBlendFunc(770, 1);
/*  20:    */     
/*  21: 28 */     double[] arrayOfDouble1 = new double[8];
/*  22: 29 */     double[] arrayOfDouble2 = new double[8];
/*  23: 30 */     double d1 = 0.0D;
/*  24: 31 */     double d2 = 0.0D;
/*  25:    */     
/*  26: 33 */     Random localRandom1 = new Random(paramads.a);
/*  27: 34 */     for (int j = 7; j >= 0; j--)
/*  28:    */     {
/*  29: 35 */       arrayOfDouble1[j] = d1;
/*  30: 36 */       arrayOfDouble2[j] = d2;
/*  31: 37 */       d1 += localRandom1.nextInt(11) - 5;
/*  32: 38 */       d2 += localRandom1.nextInt(11) - 5;
/*  33:    */     }
/*  34: 42 */     for (int i = 0; i < 4; i++)
/*  35:    */     {
/*  36: 43 */       Random localRandom2 = new Random(paramads.a);
/*  37: 44 */       for (int k = 0; k < 3; k++)
/*  38:    */       {
/*  39: 45 */         int m = 7;
/*  40: 46 */         int n = 0;
/*  41: 47 */         if (k > 0) {
/*  42: 48 */           m = 7 - k;
/*  43:    */         }
/*  44: 50 */         if (k > 0) {
/*  45: 51 */           n = m - 2;
/*  46:    */         }
/*  47: 53 */         double d3 = arrayOfDouble1[m] - d1;
/*  48: 54 */         double d4 = arrayOfDouble2[m] - d2;
/*  49: 55 */         for (int i1 = m; i1 >= n; i1--)
/*  50:    */         {
/*  51: 56 */           double d5 = d3;
/*  52: 57 */           double d6 = d4;
/*  53: 58 */           if (k == 0)
/*  54:    */           {
/*  55: 59 */             d3 += localRandom2.nextInt(11) - 5;
/*  56: 60 */             d4 += localRandom2.nextInt(11) - 5;
/*  57:    */           }
/*  58:    */           else
/*  59:    */           {
/*  60: 62 */             d3 += localRandom2.nextInt(31) - 15;
/*  61: 63 */             d4 += localRandom2.nextInt(31) - 15;
/*  62:    */           }
/*  63: 66 */           localciv.a(5);
/*  64: 67 */           float f = 0.5F;
/*  65: 68 */           localciv.setColor(0.9F * f, 0.9F * f, 1.0F * f, 0.3F);
/*  66:    */           
/*  67: 70 */           double d7 = 0.1D + i * 0.2D;
/*  68: 71 */           if (k == 0) {
/*  69: 72 */             d7 *= (i1 * 0.1D + 1.0D);
/*  70:    */           }
/*  71: 75 */           double d8 = 0.1D + i * 0.2D;
/*  72: 76 */           if (k == 0) {
/*  73: 77 */             d8 *= ((i1 - 1) * 0.1D + 1.0D);
/*  74:    */           }
/*  75: 80 */           for (int i2 = 0; i2 < 5; i2++)
/*  76:    */           {
/*  77: 81 */             double d9 = paramDouble1 + 0.5D - d7;
/*  78: 82 */             double d10 = paramDouble3 + 0.5D - d7;
/*  79: 83 */             if ((i2 == 1) || (i2 == 2)) {
/*  80: 84 */               d9 += d7 * 2.0D;
/*  81:    */             }
/*  82: 86 */             if ((i2 == 2) || (i2 == 3)) {
/*  83: 87 */               d10 += d7 * 2.0D;
/*  84:    */             }
/*  85: 90 */             double d11 = paramDouble1 + 0.5D - d8;
/*  86: 91 */             double d12 = paramDouble3 + 0.5D - d8;
/*  87: 92 */             if ((i2 == 1) || (i2 == 2)) {
/*  88: 93 */               d11 += d8 * 2.0D;
/*  89:    */             }
/*  90: 95 */             if ((i2 == 2) || (i2 == 3)) {
/*  91: 96 */               d12 += d8 * 2.0D;
/*  92:    */             }
/*  93: 99 */             localciv.addVertex(d11 + d3, paramDouble2 + i1 * 16, d12 + d4);
/*  94:100 */             localciv.addVertex(d9 + d5, paramDouble2 + (i1 + 1) * 16, d10 + d6);
/*  95:    */           }
/*  96:103 */           localckx.draw();
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:108 */     cjm.disableBlend();
/* 101:109 */     cjm.enableLighting();
/* 102:110 */     cjm.w();
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected oa a(ads paramads)
/* 106:    */   {
/* 107:116 */     return null;
/* 108:    */   }
/* 109:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqu
 * JD-Core Version:    0.7.0.1
 */