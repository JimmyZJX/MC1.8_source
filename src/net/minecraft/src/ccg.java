package net.minecraft.src;
/*  1:   */ public class ccg
/*  2:   */   extends ccq
/*  3:   */ {
/*  4: 8 */   private static final int[][] a = { { 4, 3, 2 }, { 6, 4, 5 }, { 3, 3, 1 }, { 1, 2, 1 } };
/*  5:15 */   private static final int[][] b = { { 0, 0 }, { 0, 5 }, { 0, 14 }, { 0, 18 } };
/*  6:22 */   private static final int c = a.length;
/*  7:   */   private final cdy[] d;
/*  8:   */   
/*  9:   */   public ccg()
/* 10:   */   {
/* 11:27 */     this.d = new cdy[c];
/* 12:28 */     float f = -3.5F;
/* 13:29 */     for (int i = 0; i < this.d.length; i++)
/* 14:   */     {
/* 15:30 */       this.d[i] = new cdy(this, b[i][0], b[i][1]);
/* 16:31 */       this.d[i].a(a[i][0] * -0.5F, 0.0F, a[i][2] * -0.5F, a[i][0], a[i][1], a[i][2]);
/* 17:32 */       this.d[i].a(0.0F, 24 - a[i][1], f);
/* 18:33 */       if (i < this.d.length - 1) {
/* 19:34 */         f += (a[i][2] + a[(i + 1)][2]) * 0.5F;
/* 20:   */       }
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 25:   */   {
/* 26:41 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 27:43 */     for (int i = 0; i < this.d.length; i++) {
/* 28:44 */       this.d[i].a(paramFloat6);
/* 29:   */     }
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 33:   */   {
/* 34:50 */     for (int i = 0; i < this.d.length; i++)
/* 35:   */     {
/* 36:51 */       this.d[i].g = (MathUtils.cos(paramFloat3 * 0.9F + i * 0.15F * 3.141593F) * 3.141593F * 0.01F * (1 + Math.abs(i - 2)));
/* 37:52 */       this.d[i].c = (MathUtils.sin(paramFloat3 * 0.9F + i * 0.15F * 3.141593F) * 3.141593F * 0.1F * Math.abs(i - 2));
/* 38:   */     }
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccg
 * JD-Core Version:    0.7.0.1
 */