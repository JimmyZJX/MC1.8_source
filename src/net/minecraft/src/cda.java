package net.minecraft.src;
/*  1:   */ public class cda
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   private cdy[] a;
/*  5:   */   private cdy[] b;
/*  6:12 */   private float[] c = new float[7];
/*  7:14 */   private static final int[][] d = { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
/*  8:23 */   private static final int[][] e = { { 0, 0 }, { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
/*  9:   */   
/* 10:   */   public cda()
/* 11:   */   {
/* 12:34 */     this.a = new cdy[7];
/* 13:35 */     float f = -3.5F;
/* 14:36 */     for (int i = 0; i < this.a.length; i++)
/* 15:   */     {
/* 16:37 */       this.a[i] = new cdy(this, e[i][0], e[i][1]);
/* 17:38 */       this.a[i].a(d[i][0] * -0.5F, 0.0F, d[i][2] * -0.5F, d[i][0], d[i][1], d[i][2]);
/* 18:39 */       this.a[i].a(0.0F, 24 - d[i][1], f);
/* 19:40 */       this.c[i] = f;
/* 20:41 */       if (i < this.a.length - 1) {
/* 21:42 */         f += (d[i][2] + d[(i + 1)][2]) * 0.5F;
/* 22:   */       }
/* 23:   */     }
/* 24:46 */     this.b = new cdy[3];
/* 25:47 */     this.b[0] = new cdy(this, 20, 0);
/* 26:48 */     this.b[0].a(-5.0F, 0.0F, d[2][2] * -0.5F, 10, 8, d[2][2]);
/* 27:49 */     this.b[0].a(0.0F, 16.0F, this.c[2]);
/* 28:50 */     this.b[1] = new cdy(this, 20, 11);
/* 29:51 */     this.b[1].a(-3.0F, 0.0F, d[4][2] * -0.5F, 6, 4, d[4][2]);
/* 30:52 */     this.b[1].a(0.0F, 20.0F, this.c[4]);
/* 31:53 */     this.b[2] = new cdy(this, 20, 18);
/* 32:54 */     this.b[2].a(-3.0F, 0.0F, d[4][2] * -0.5F, 6, 5, d[1][2]);
/* 33:55 */     this.b[2].a(0.0F, 19.0F, this.c[1]);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 37:   */   {
/* 38:64 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 39:66 */     for (int i = 0; i < this.a.length; i++) {
/* 40:67 */       this.a[i].a(paramFloat6);
/* 41:   */     }
/* 42:69 */     for (int i = 0; i < this.b.length; i++) {
/* 43:70 */       this.b[i].a(paramFloat6);
/* 44:   */     }
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 48:   */   {
/* 49:76 */     for (int i = 0; i < this.a.length; i++)
/* 50:   */     {
/* 51:77 */       this.a[i].g = (MathUtils.cos(paramFloat3 * 0.9F + i * 0.15F * 3.141593F) * 3.141593F * 0.05F * (1 + Math.abs(i - 2)));
/* 52:78 */       this.a[i].c = (MathUtils.sin(paramFloat3 * 0.9F + i * 0.15F * 3.141593F) * 3.141593F * 0.2F * Math.abs(i - 2));
/* 53:   */     }
/* 54:81 */     this.b[0].g = this.a[2].g;
/* 55:82 */     this.b[1].g = this.a[4].g;
/* 56:83 */     this.b[1].c = this.a[4].c;
/* 57:84 */     this.b[2].g = this.a[1].g;
/* 58:85 */     this.b[2].c = this.a[1].c;
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cda
 * JD-Core Version:    0.7.0.1
 */