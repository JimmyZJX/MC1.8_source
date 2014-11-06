package net.minecraft.src;
/*   1:    */ public class cla
/*   2:    */ {
/*   3:    */   protected final ckn a;
/*   4:    */   protected final World b;
/*   5:    */   protected int c;
/*   6:    */   protected int d;
/*   7:    */   protected int e;
/*   8:    */   public cop[] f;
/*   9:    */   
/*  10:    */   public cla(World paramaqu, int paramInt, ckn paramckn, coq paramcoq)
/*  11:    */   {
/*  12: 20 */     this.a = paramckn;
/*  13: 21 */     this.b = paramaqu;
/*  14:    */     
/*  15: 23 */     a(paramInt);
/*  16: 24 */     a(paramcoq);
/*  17:    */   }
/*  18:    */   
/*  19:    */   protected void a(coq paramcoq)
/*  20:    */   {
/*  21: 28 */     int i = this.d * this.c * this.e;
/*  22: 29 */     this.f = new cop[i];
/*  23:    */     
/*  24: 31 */     int j = 0;
/*  25: 32 */     for (int k = 0; k < this.d; k++) {
/*  26: 33 */       for (int m = 0; m < this.c; m++) {
/*  27: 34 */         for (int n = 0; n < this.e; n++)
/*  28:    */         {
/*  29: 35 */           int i1 = (n * this.c + m) * this.d + k;
/*  30: 36 */           BlockPosition localdt = new BlockPosition(k * 16, m * 16, n * 16);
/*  31: 37 */           this.f[i1] = paramcoq.a(this.b, this.a, localdt, j++);
/*  32:    */         }
/*  33:    */       }
/*  34:    */     }
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void a()
/*  38:    */   {
/*  39: 44 */     for (cop localcop : this.f) {
/*  40: 45 */       localcop.a();
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   protected void a(int paramInt)
/*  45:    */   {
/*  46: 50 */     int i = paramInt * 2 + 1;
/*  47: 51 */     this.d = i;
/*  48: 52 */     this.c = 16;
/*  49: 53 */     this.e = i;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void a(double paramDouble1, double paramDouble2)
/*  53:    */   {
/*  54: 57 */     int i = MathUtils.floor(paramDouble1) - 8;
/*  55: 58 */     int j = MathUtils.floor(paramDouble2) - 8;
/*  56:    */     
/*  57: 60 */     int k = this.d * 16;
/*  58: 62 */     for (int m = 0; m < this.d; m++)
/*  59:    */     {
/*  60: 63 */       int n = a(i, k, m);
/*  61: 65 */       for (int i1 = 0; i1 < this.e; i1++)
/*  62:    */       {
/*  63: 66 */         int i2 = a(j, k, i1);
/*  64: 68 */         for (int i3 = 0; i3 < this.c; i3++)
/*  65:    */         {
/*  66: 69 */           int i4 = i3 * 16;
/*  67:    */           
/*  68: 71 */           cop localcop = this.f[((i1 * this.c + i3) * this.d + m)];
/*  69: 72 */           BlockPosition localdt = new BlockPosition(n, i4, i2);
/*  70: 74 */           if (!localdt.equals(localcop.j())) {
/*  71: 75 */             localcop.a(localdt);
/*  72:    */           }
/*  73:    */         }
/*  74:    */       }
/*  75:    */     }
/*  76:    */   }
/*  77:    */   
/*  78:    */   private int a(int paramInt1, int paramInt2, int paramInt3)
/*  79:    */   {
/*  80: 84 */     int i = paramInt3 * 16;
/*  81: 85 */     int j = i - paramInt1 + paramInt2 / 2;
/*  82: 86 */     if (j < 0) {
/*  83: 87 */       j -= paramInt2 - 1;
/*  84:    */     }
/*  85: 91 */     return i - j / paramInt2 * paramInt2;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  89:    */   {
/*  90: 95 */     int i = MathUtils.intFloorDiv(paramInt1, 16);
/*  91: 96 */     int j = MathUtils.intFloorDiv(paramInt2, 16);
/*  92: 97 */     int k = MathUtils.intFloorDiv(paramInt3, 16);
/*  93: 98 */     int m = MathUtils.intFloorDiv(paramInt4, 16);
/*  94: 99 */     int n = MathUtils.intFloorDiv(paramInt5, 16);
/*  95:100 */     int i1 = MathUtils.intFloorDiv(paramInt6, 16);
/*  96:102 */     for (int i2 = i; i2 <= m; i2++)
/*  97:    */     {
/*  98:103 */       int i3 = i2 % this.d;
/*  99:104 */       if (i3 < 0) {
/* 100:105 */         i3 += this.d;
/* 101:    */       }
/* 102:107 */       for (int i4 = j; i4 <= n; i4++)
/* 103:    */       {
/* 104:108 */         int i5 = i4 % this.c;
/* 105:109 */         if (i5 < 0) {
/* 106:110 */           i5 += this.c;
/* 107:    */         }
/* 108:112 */         for (int i6 = k; i6 <= i1; i6++)
/* 109:    */         {
/* 110:113 */           int i7 = i6 % this.e;
/* 111:114 */           if (i7 < 0) {
/* 112:115 */             i7 += this.e;
/* 113:    */           }
/* 114:118 */           int i8 = (i7 * this.c + i5) * this.d + i3;
/* 115:119 */           cop localcop = this.f[i8];
/* 116:120 */           localcop.a(true);
/* 117:    */         }
/* 118:    */       }
/* 119:    */     }
/* 120:    */   }
/* 121:    */   
/* 122:    */   protected cop a(BlockPosition paramdt)
/* 123:    */   {
/* 124:128 */     int i = MathUtils.intFloorDiv(paramdt.getX(), 16);
/* 125:129 */     int j = MathUtils.intFloorDiv(paramdt.getY(), 16);
/* 126:130 */     int k = MathUtils.intFloorDiv(paramdt.getZ(), 16);
/* 127:132 */     if ((j < 0) || (j >= this.c)) {
/* 128:133 */       return null;
/* 129:    */     }
/* 130:136 */     i %= this.d;
/* 131:137 */     if (i < 0) {
/* 132:138 */       i += this.d;
/* 133:    */     }
/* 134:140 */     k %= this.e;
/* 135:141 */     if (k < 0) {
/* 136:142 */       k += this.e;
/* 137:    */     }
/* 138:144 */     int m = (k * this.c + j) * this.d + i;
/* 139:145 */     return this.f[m];
/* 140:    */   }
/* 141:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cla
 * JD-Core Version:    0.7.0.1
 */