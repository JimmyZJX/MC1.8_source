package net.minecraft.src;
/*  1:   */ class bkc
/*  2:   */ {
/*  3:   */   public Class a;
/*  4:   */   public final int b;
/*  5:   */   public int c;
/*  6:   */   public int d;
/*  7:   */   public boolean e;
/*  8:   */   
/*  9:   */   public bkc(Class paramClass, int paramInt1, int paramInt2, boolean paramBoolean)
/* 10:   */   {
/* 11:51 */     this.a = paramClass;
/* 12:52 */     this.b = paramInt1;
/* 13:53 */     this.d = paramInt2;
/* 14:54 */     this.e = paramBoolean;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public bkc(Class paramClass, int paramInt1, int paramInt2)
/* 18:   */   {
/* 19:58 */     this(paramClass, paramInt1, paramInt2, false);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean a(int paramInt)
/* 23:   */   {
/* 24:62 */     return (this.d == 0) || (this.c < this.d);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public boolean a()
/* 28:   */   {
/* 29:66 */     return (this.d == 0) || (this.c < this.d);
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkc
 * JD-Core Version:    0.7.0.1
 */