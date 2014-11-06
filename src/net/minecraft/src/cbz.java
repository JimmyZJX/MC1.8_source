package net.minecraft.src;
/*  1:   */ public class cbz
/*  2:   */   extends ccq
/*  3:   */ {
/*  4: 8 */   public cdy[] a = new cdy[5];
/*  5:   */   
/*  6:   */   public cbz()
/*  7:   */   {
/*  8:11 */     this.a[0] = new cdy(this, 0, 8);
/*  9:12 */     this.a[1] = new cdy(this, 0, 0);
/* 10:13 */     this.a[2] = new cdy(this, 0, 0);
/* 11:14 */     this.a[3] = new cdy(this, 0, 0);
/* 12:15 */     this.a[4] = new cdy(this, 0, 0);
/* 13:   */     
/* 14:17 */     int i = 24;
/* 15:18 */     int j = 6;
/* 16:19 */     int k = 20;
/* 17:20 */     int m = 4;
/* 18:   */     
/* 19:22 */     this.a[0].a(-i / 2, -k / 2 + 2, -3.0F, i, k - 4, 4, 0.0F);
/* 20:23 */     this.a[0].a(0.0F, m, 0.0F);
/* 21:   */     
/* 22:25 */     this.a[1].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 23:26 */     this.a[1].a(-i / 2 + 1, m, 0.0F);
/* 24:   */     
/* 25:28 */     this.a[2].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 26:29 */     this.a[2].a(i / 2 - 1, m, 0.0F);
/* 27:   */     
/* 28:31 */     this.a[3].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 29:32 */     this.a[3].a(0.0F, m, -k / 2 + 1);
/* 30:   */     
/* 31:34 */     this.a[4].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 32:35 */     this.a[4].a(0.0F, m, k / 2 - 1);
/* 33:   */     
/* 34:37 */     this.a[0].f = 1.570796F;
/* 35:38 */     this.a[1].g = 4.712389F;
/* 36:39 */     this.a[2].g = 1.570796F;
/* 37:40 */     this.a[3].g = 3.141593F;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 41:   */   {
/* 42:45 */     for (int i = 0; i < 5; i++) {
/* 43:46 */       this.a[i].a(paramFloat6);
/* 44:   */     }
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cbz
 * JD-Core Version:    0.7.0.1
 */