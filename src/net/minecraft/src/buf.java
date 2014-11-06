package net.minecraft.src;
/*  1:   */ public class buf
/*  2:   */ {
/*  3:   */   private final double a;
/*  4:   */   private final double b;
/*  5:   */   private int c;
/*  6:   */   private int d;
/*  7:   */   private int e;
/*  8:   */   
/*  9:   */   public buf(bsu parambsu, int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:14 */     this.c = paramInt1;
/* 12:15 */     this.d = paramInt2;
/* 13:16 */     this.e = 1;
/* 14:   */     
/* 15:18 */     boolean bool = parambsu.d();
/* 16:19 */     int i = parambsu.t.aG;
/* 17:20 */     if (i == 0) {
/* 18:21 */       i = 1000;
/* 19:   */     }
/* 20:23 */     while ((this.e < i) && (this.c / (this.e + 1) >= 320) && (this.d / (this.e + 1) >= 240)) {
/* 21:24 */       this.e += 1;
/* 22:   */     }
/* 23:26 */     if ((bool) && (this.e % 2 != 0) && (this.e != 1)) {
/* 24:27 */       this.e -= 1;
/* 25:   */     }
/* 26:29 */     this.a = (this.c / this.e);
/* 27:30 */     this.b = (this.d / this.e);
/* 28:31 */     this.c = MathUtils.ceil(this.a);
/* 29:32 */     this.d = MathUtils.ceil(this.b);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int a()
/* 33:   */   {
/* 34:36 */     return this.c;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int b()
/* 38:   */   {
/* 39:40 */     return this.d;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public double c()
/* 43:   */   {
/* 44:44 */     return this.a;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public double d()
/* 48:   */   {
/* 49:48 */     return this.b;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int e()
/* 53:   */   {
/* 54:52 */     return this.e;
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buf
 * JD-Core Version:    0.7.0.1
 */