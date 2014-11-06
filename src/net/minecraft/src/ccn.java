package net.minecraft.src;
/*  1:   */ public class ccn
/*  2:   */   extends ccq
/*  3:   */ {
/*  4: 9 */   cdy[] a = new cdy[8];
/*  5:   */   cdy b;
/*  6:   */   
/*  7:   */   public ccn()
/*  8:   */   {
/*  9:13 */     for (int i = 0; i < this.a.length; i++)
/* 10:   */     {
/* 11:14 */       int j = 0;
/* 12:15 */       int k = i;
/* 13:16 */       if (i == 2)
/* 14:   */       {
/* 15:17 */         j = 24;
/* 16:18 */         k = 10;
/* 17:   */       }
/* 18:19 */       else if (i == 3)
/* 19:   */       {
/* 20:20 */         j = 24;
/* 21:21 */         k = 19;
/* 22:   */       }
/* 23:23 */       this.a[i] = new cdy(this, j, k);
/* 24:24 */       this.a[i].a(-4.0F, 16 + i, -4.0F, 8, 1, 8);
/* 25:   */     }
/* 26:27 */     this.b = new cdy(this, 0, 16);
/* 27:28 */     this.b.a(-2.0F, 18.0F, -2.0F, 4, 4, 4);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 31:   */   {
/* 32:37 */     EntityLavaSlime localafl = (EntityLavaSlime)paramxm;
/* 33:   */     
/* 34:39 */     float f = localafl.c + (localafl.b - localafl.c) * paramFloat3;
/* 35:40 */     if (f < 0.0F) {
/* 36:41 */       f = 0.0F;
/* 37:   */     }
/* 38:44 */     for (int i = 0; i < this.a.length; i++) {
/* 39:45 */       this.a[i].d = (-(4 - i) * f * 1.7F);
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 44:   */   {
/* 45:51 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 46:   */     
/* 47:53 */     this.b.a(paramFloat6);
/* 48:54 */     for (int i = 0; i < this.a.length; i++) {
/* 49:55 */       this.a[i].a(paramFloat6);
/* 50:   */     }
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccn
 * JD-Core Version:    0.7.0.1
 */