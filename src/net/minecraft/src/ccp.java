package net.minecraft.src;
/*  1:   */ public class ccp
/*  2:   */   extends ccq
/*  3:   */ {
/*  4: 8 */   public cdy[] a = new cdy[7];
/*  5:   */   
/*  6:   */   public ccp()
/*  7:   */   {
/*  8:11 */     this.a[0] = new cdy(this, 0, 10);
/*  9:12 */     this.a[1] = new cdy(this, 0, 0);
/* 10:13 */     this.a[2] = new cdy(this, 0, 0);
/* 11:14 */     this.a[3] = new cdy(this, 0, 0);
/* 12:15 */     this.a[4] = new cdy(this, 0, 0);
/* 13:16 */     this.a[5] = new cdy(this, 44, 10);
/* 14:   */     
/* 15:18 */     int i = 20;
/* 16:19 */     int j = 8;
/* 17:20 */     int k = 16;
/* 18:21 */     int m = 4;
/* 19:   */     
/* 20:23 */     this.a[0].a(-i / 2, -k / 2, -1.0F, i, k, 2, 0.0F);
/* 21:24 */     this.a[0].a(0.0F, m, 0.0F);
/* 22:   */     
/* 23:26 */     this.a[5].a(-i / 2 + 1, -k / 2 + 1, -1.0F, i - 2, k - 2, 1, 0.0F);
/* 24:27 */     this.a[5].a(0.0F, m, 0.0F);
/* 25:   */     
/* 26:29 */     this.a[1].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 27:30 */     this.a[1].a(-i / 2 + 1, m, 0.0F);
/* 28:   */     
/* 29:32 */     this.a[2].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 30:33 */     this.a[2].a(i / 2 - 1, m, 0.0F);
/* 31:   */     
/* 32:35 */     this.a[3].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 33:36 */     this.a[3].a(0.0F, m, -k / 2 + 1);
/* 34:   */     
/* 35:38 */     this.a[4].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 36:39 */     this.a[4].a(0.0F, m, k / 2 - 1);
/* 37:   */     
/* 38:41 */     this.a[0].f = 1.570796F;
/* 39:42 */     this.a[1].g = 4.712389F;
/* 40:43 */     this.a[2].g = 1.570796F;
/* 41:44 */     this.a[3].g = 3.141593F;
/* 42:45 */     this.a[5].f = -1.570796F;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 46:   */   {
/* 47:50 */     this.a[5].d = (4.0F - paramFloat3);
/* 48:51 */     for (int i = 0; i < 6; i++) {
/* 49:52 */       this.a[i].a(paramFloat6);
/* 50:   */     }
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccp
 * JD-Core Version:    0.7.0.1
 */