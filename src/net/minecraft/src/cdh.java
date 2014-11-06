package net.minecraft.src;
/*  1:   */ public class cdh
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   cdy a;
/*  5: 8 */   cdy[] b = new cdy[8];
/*  6:   */   
/*  7:   */   public cdh()
/*  8:   */   {
/*  9:11 */     int i = -16;
/* 10:12 */     this.a = new cdy(this, 0, 0);
/* 11:13 */     this.a.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
/* 12:14 */     this.a.d += 24 + i;
/* 13:16 */     for (int j = 0; j < this.b.length; j++)
/* 14:   */     {
/* 15:17 */       this.b[j] = new cdy(this, 48, 0);
/* 16:   */       
/* 17:19 */       double d = j * 3.141592653589793D * 2.0D / this.b.length;
/* 18:20 */       float f1 = (float)Math.cos(d) * 5.0F;
/* 19:21 */       float f2 = (float)Math.sin(d) * 5.0F;
/* 20:22 */       this.b[j].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
/* 21:   */       
/* 22:24 */       this.b[j].c = f1;
/* 23:25 */       this.b[j].e = f2;
/* 24:26 */       this.b[j].d = (31 + i);
/* 25:   */       
/* 26:28 */       d = j * 3.141592653589793D * -2.0D / this.b.length + 1.570796326794897D;
/* 27:29 */       this.b[j].g = ((float)d);
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 32:   */   {
/* 33:35 */     for (cdy localcdy : this.b) {
/* 34:37 */       localcdy.f = paramFloat3;
/* 35:   */     }
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 39:   */   {
/* 40:43 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 41:   */     
/* 42:45 */     this.a.a(paramFloat6);
/* 43:46 */     for (int i = 0; i < this.b.length; i++) {
/* 44:47 */       this.b[i].a(paramFloat6);
/* 45:   */     }
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdh
 * JD-Core Version:    0.7.0.1
 */