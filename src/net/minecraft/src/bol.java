package net.minecraft.src;
/*   1:    */ public class bol
/*   2:    */   extends bpa
/*   3:    */ {
/*   4:    */   private final bon c;
/*   5:    */   
/*   6:    */   public bol(long paramLong, bpa parambpa, bon parambon)
/*   7:    */   {
/*   8: 12 */     super(paramLong);
/*   9: 13 */     this.a = parambpa;
/*  10: 14 */     this.c = parambon;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  14:    */   {
/*  15: 19 */     switch (bom.a[this.c.ordinal()])
/*  16:    */     {
/*  17:    */     case 1: 
/*  18:    */     default: 
/*  19: 22 */       return c(paramInt1, paramInt2, paramInt3, paramInt4);
/*  20:    */     case 2: 
/*  21: 24 */       return d(paramInt1, paramInt2, paramInt3, paramInt4);
/*  22:    */     }
/*  23: 26 */     return e(paramInt1, paramInt2, paramInt3, paramInt4);
/*  24:    */   }
/*  25:    */   
/*  26:    */   private int[] c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  27:    */   {
/*  28: 31 */     int i = paramInt1 - 1;
/*  29: 32 */     int j = paramInt2 - 1;
/*  30: 33 */     int k = 1 + paramInt3 + 1;
/*  31: 34 */     int m = 1 + paramInt4 + 1;
/*  32: 35 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/*  33:    */     
/*  34: 37 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/*  35: 39 */     for (int n = 0; n < paramInt4; n++) {
/*  36: 40 */       for (int i1 = 0; i1 < paramInt3; i1++)
/*  37:    */       {
/*  38: 41 */         a(i1 + paramInt1, n + paramInt2);
/*  39:    */         
/*  40: 43 */         int i2 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/*  41: 45 */         if (i2 == 1)
/*  42:    */         {
/*  43: 46 */           int i3 = arrayOfInt1[(i1 + 1 + (n + 1 - 1) * k)];
/*  44: 47 */           int i4 = arrayOfInt1[(i1 + 1 + 1 + (n + 1) * k)];
/*  45: 48 */           int i5 = arrayOfInt1[(i1 + 1 - 1 + (n + 1) * k)];
/*  46: 49 */           int i6 = arrayOfInt1[(i1 + 1 + (n + 1 + 1) * k)];
/*  47:    */           
/*  48: 51 */           int i7 = (i3 == 3) || (i4 == 3) || (i5 == 3) || (i6 == 3) ? 1 : 0;
/*  49: 52 */           int i8 = (i3 == 4) || (i4 == 4) || (i5 == 4) || (i6 == 4) ? 1 : 0;
/*  50: 53 */           if ((i7 != 0) || (i8 != 0)) {
/*  51: 54 */             i2 = 2;
/*  52:    */           }
/*  53:    */         }
/*  54: 58 */         arrayOfInt2[(i1 + n * paramInt3)] = i2;
/*  55:    */       }
/*  56:    */     }
/*  57: 62 */     return arrayOfInt2;
/*  58:    */   }
/*  59:    */   
/*  60:    */   private int[] d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  61:    */   {
/*  62: 66 */     int i = paramInt1 - 1;
/*  63: 67 */     int j = paramInt2 - 1;
/*  64: 68 */     int k = 1 + paramInt3 + 1;
/*  65: 69 */     int m = 1 + paramInt4 + 1;
/*  66: 70 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/*  67:    */     
/*  68: 72 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/*  69: 74 */     for (int n = 0; n < paramInt4; n++) {
/*  70: 75 */       for (int i1 = 0; i1 < paramInt3; i1++)
/*  71:    */       {
/*  72: 76 */         int i2 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/*  73: 78 */         if (i2 == 4)
/*  74:    */         {
/*  75: 79 */           int i3 = arrayOfInt1[(i1 + 1 + (n + 1 - 1) * k)];
/*  76: 80 */           int i4 = arrayOfInt1[(i1 + 1 + 1 + (n + 1) * k)];
/*  77: 81 */           int i5 = arrayOfInt1[(i1 + 1 - 1 + (n + 1) * k)];
/*  78: 82 */           int i6 = arrayOfInt1[(i1 + 1 + (n + 1 + 1) * k)];
/*  79:    */           
/*  80: 84 */           int i7 = (i3 == 2) || (i4 == 2) || (i5 == 2) || (i6 == 2) ? 1 : 0;
/*  81: 85 */           int i8 = (i3 == 1) || (i4 == 1) || (i5 == 1) || (i6 == 1) ? 1 : 0;
/*  82: 87 */           if ((i8 != 0) || (i7 != 0)) {
/*  83: 88 */             i2 = 3;
/*  84:    */           }
/*  85:    */         }
/*  86: 92 */         arrayOfInt2[(i1 + n * paramInt3)] = i2;
/*  87:    */       }
/*  88:    */     }
/*  89: 96 */     return arrayOfInt2;
/*  90:    */   }
/*  91:    */   
/*  92:    */   private int[] e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  93:    */   {
/*  94:100 */     int[] arrayOfInt1 = this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*  95:101 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/*  96:103 */     for (int i = 0; i < paramInt4; i++) {
/*  97:104 */       for (int j = 0; j < paramInt3; j++)
/*  98:    */       {
/*  99:105 */         a(j + paramInt1, i + paramInt2);
/* 100:    */         
/* 101:107 */         int k = arrayOfInt1[(j + i * paramInt3)];
/* 102:109 */         if ((k != 0) && (a(13) == 0)) {
/* 103:110 */           k |= 1 + a(15) << 8 & 0xF00;
/* 104:    */         }
/* 105:113 */         arrayOfInt2[(j + i * paramInt3)] = k;
/* 106:    */       }
/* 107:    */     }
/* 108:117 */     return arrayOfInt2;
/* 109:    */   }
/* 110:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bol
 * JD-Core Version:    0.7.0.1
 */