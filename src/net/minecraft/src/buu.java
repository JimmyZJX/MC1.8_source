package net.minecraft.src;
/*  1:   */ public abstract class buu<T extends buv>
/*  2:   */   extends bvk
/*  3:   */ {
/*  4:   */   public buu(bsu parambsu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  5:   */   {
/*  6: 7 */     super(parambsu, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  7:   */   }
/*  8:   */   
/*  9:   */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/* 10:   */   
/* 11:   */   protected boolean a(int paramInt)
/* 12:   */   {
/* 13:16 */     return false;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void a() {}
/* 17:   */   
/* 18:   */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 19:   */   {
/* 20:25 */     b(paramInt1).a(paramInt1, paramInt2, paramInt3, c(), paramInt4, paramInt5, paramInt6, c(paramInt5, paramInt6) == paramInt1);
/* 21:   */   }
/* 22:   */   
/* 23:   */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 24:   */   {
/* 25:30 */     b(paramInt1).a(paramInt1, paramInt2, paramInt3);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public boolean b(int paramInt1, int paramInt2, int paramInt3)
/* 29:   */   {
/* 30:34 */     if (f(paramInt2))
/* 31:   */     {
/* 32:35 */       int i = c(paramInt1, paramInt2);
/* 33:36 */       if (i >= 0)
/* 34:   */       {
/* 35:37 */         int j = this.g + (this.b / 2 - c() / 2 + 2);
/* 36:38 */         int k = this.d + 4 - n() + (i * this.h + this.t);
/* 37:39 */         int m = paramInt1 - j;
/* 38:40 */         int n = paramInt2 - k;
/* 39:41 */         if (b(i).a(i, paramInt1, paramInt2, paramInt3, m, n))
/* 40:   */         {
/* 41:42 */           c(false);
/* 42:43 */           return true;
/* 43:   */         }
/* 44:   */       }
/* 45:   */     }
/* 46:48 */     return false;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public boolean c(int paramInt1, int paramInt2, int paramInt3)
/* 50:   */   {
/* 51:52 */     for (int i = 0; i < b(); i++)
/* 52:   */     {
/* 53:53 */       int j = this.g + (this.b / 2 - c() / 2 + 2);
/* 54:54 */       int k = this.d + 4 - n() + (i * this.h + this.t);
/* 55:55 */       int m = paramInt1 - j;
/* 56:56 */       int n = paramInt2 - k;
/* 57:57 */       b(i).b(i, paramInt1, paramInt2, paramInt3, m, n);
/* 58:   */     }
/* 59:60 */     c(true);
/* 60:61 */     return false;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public abstract T b(int paramInt);
/* 64:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buu
 * JD-Core Version:    0.7.0.1
 */