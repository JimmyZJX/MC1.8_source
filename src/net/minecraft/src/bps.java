package net.minecraft.src;
/*   1:    */ public class bps
/*   2:    */ {
/*   3:  4 */   private bpt[] a = new bpt[1024];
/*   4:    */   private int b;
/*   5:    */   
/*   6:    */   public bpt a(bpt parambpt)
/*   7:    */   {
/*   8:  9 */     if (parambpt.d >= 0) {
/*   9: 10 */       throw new IllegalStateException("OW KNOWS!");
/*  10:    */     }
/*  11: 13 */     if (this.b == this.a.length)
/*  12:    */     {
/*  13: 14 */       bpt[] arrayOfbpt = new bpt[this.b << 1];
/*  14: 15 */       System.arraycopy(this.a, 0, arrayOfbpt, 0, this.b);
/*  15: 16 */       this.a = arrayOfbpt;
/*  16:    */     }
/*  17: 20 */     this.a[this.b] = parambpt;
/*  18: 21 */     parambpt.d = this.b;
/*  19: 22 */     a(this.b++);
/*  20:    */     
/*  21: 24 */     return parambpt;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a()
/*  25:    */   {
/*  26: 28 */     this.b = 0;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public bpt c()
/*  30:    */   {
/*  31: 36 */     bpt localbpt = this.a[0];
/*  32: 37 */     this.a[0] = this.a[(--this.b)];
/*  33: 38 */     this.a[this.b] = null;
/*  34: 39 */     if (this.b > 0) {
/*  35: 40 */       b(0);
/*  36:    */     }
/*  37: 42 */     localbpt.d = -1;
/*  38: 43 */     return localbpt;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void a(bpt parambpt, float paramFloat)
/*  42:    */   {
/*  43: 62 */     float f = parambpt.g;
/*  44: 63 */     parambpt.g = paramFloat;
/*  45: 64 */     if (paramFloat < f) {
/*  46: 65 */       a(parambpt.d);
/*  47:    */     } else {
/*  48: 67 */       b(parambpt.d);
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   private void a(int paramInt)
/*  53:    */   {
/*  54: 76 */     bpt localbpt1 = this.a[paramInt];
/*  55: 77 */     float f = localbpt1.g;
/*  56: 78 */     while (paramInt > 0)
/*  57:    */     {
/*  58: 79 */       int i = paramInt - 1 >> 1;
/*  59: 80 */       bpt localbpt2 = this.a[i];
/*  60: 81 */       if (f >= localbpt2.g) {
/*  61:    */         break;
/*  62:    */       }
/*  63: 82 */       this.a[paramInt] = localbpt2;
/*  64: 83 */       localbpt2.d = paramInt;
/*  65: 84 */       paramInt = i;
/*  66:    */     }
/*  67: 89 */     this.a[paramInt] = localbpt1;
/*  68: 90 */     localbpt1.d = paramInt;
/*  69:    */   }
/*  70:    */   
/*  71:    */   private void b(int paramInt)
/*  72:    */   {
/*  73: 94 */     bpt localbpt1 = this.a[paramInt];
/*  74: 95 */     float f1 = localbpt1.g;
/*  75:    */     for (;;)
/*  76:    */     {
/*  77: 98 */       int i = 1 + (paramInt << 1);
/*  78: 99 */       int j = i + 1;
/*  79:101 */       if (i >= this.b) {
/*  80:    */         break;
/*  81:    */       }
/*  82:106 */       bpt localbpt2 = this.a[i];
/*  83:107 */       float f2 = localbpt2.g;
/*  84:    */       bpt localbpt3;
/*  85:    */       float f3;
/*  86:112 */       if (j >= this.b)
/*  87:    */       {
/*  88:114 */         localbpt3 = null;
/*  89:115 */         f3 = (1.0F / 1.0F);
/*  90:    */       }
/*  91:    */       else
/*  92:    */       {
/*  93:117 */         localbpt3 = this.a[j];
/*  94:118 */         f3 = localbpt3.g;
/*  95:    */       }
/*  96:123 */       if (f2 < f3)
/*  97:    */       {
/*  98:124 */         if (f2 >= f1) {
/*  99:    */           break;
/* 100:    */         }
/* 101:125 */         this.a[paramInt] = localbpt2;
/* 102:126 */         localbpt2.d = paramInt;
/* 103:127 */         paramInt = i;
/* 104:    */       }
/* 105:    */       else
/* 106:    */       {
/* 107:132 */         if (f3 >= f1) {
/* 108:    */           break;
/* 109:    */         }
/* 110:133 */         this.a[paramInt] = localbpt3;
/* 111:134 */         localbpt3.d = paramInt;
/* 112:135 */         paramInt = j;
/* 113:    */       }
/* 114:    */     }
/* 115:142 */     this.a[paramInt] = localbpt1;
/* 116:143 */     localbpt1.d = paramInt;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public boolean e()
/* 120:    */   {
/* 121:147 */     return this.b == 0;
/* 122:    */   }
/* 123:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bps
 * JD-Core Version:    0.7.0.1
 */