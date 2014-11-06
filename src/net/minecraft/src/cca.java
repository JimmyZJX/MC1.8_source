package net.minecraft.src;
/*  1:   */ public class cca
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   public cdy b;
/*  6:   */   public cdy c;
/*  7:   */   public cdy d;
/*  8:   */   public cdy e;
/*  9:   */   public cdy f;
/* 10:   */   public cdy g;
/* 11:   */   
/* 12:   */   public cca()
/* 13:   */   {
/* 14:14 */     this.a = new cdy(this).a(0, 0).a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
/* 15:15 */     this.b = new cdy(this).a(16, 0).a(0.0F, -5.0F, 0.0F, 6, 10, 0);
/* 16:   */     
/* 17:17 */     this.g = new cdy(this).a(12, 0).a(-1.0F, -5.0F, 0.0F, 2, 10, 0);
/* 18:   */     
/* 19:19 */     this.c = new cdy(this).a(0, 10).a(0.0F, -4.0F, -0.99F, 5, 8, 1);
/* 20:20 */     this.d = new cdy(this).a(12, 10).a(0.0F, -4.0F, -0.01F, 5, 8, 1);
/* 21:   */     
/* 22:22 */     this.e = new cdy(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
/* 23:23 */     this.f = new cdy(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
/* 24:   */     
/* 25:25 */     this.a.a(0.0F, 0.0F, -1.0F);
/* 26:26 */     this.b.a(0.0F, 0.0F, 1.0F);
/* 27:   */     
/* 28:28 */     this.g.g = 1.570796F;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 32:   */   {
/* 33:33 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 34:   */     
/* 35:35 */     this.a.a(paramFloat6);
/* 36:36 */     this.b.a(paramFloat6);
/* 37:37 */     this.g.a(paramFloat6);
/* 38:   */     
/* 39:39 */     this.c.a(paramFloat6);
/* 40:40 */     this.d.a(paramFloat6);
/* 41:   */     
/* 42:42 */     this.e.a(paramFloat6);
/* 43:43 */     this.f.a(paramFloat6);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 47:   */   {
/* 48:48 */     float f1 = (MathUtils.sin(paramFloat1 * 0.02F) * 0.1F + 1.25F) * paramFloat4;
/* 49:   */     
/* 50:50 */     this.a.g = (3.141593F + f1);
/* 51:51 */     this.b.g = (-f1);
/* 52:52 */     this.c.g = f1;
/* 53:53 */     this.d.g = (-f1);
/* 54:   */     
/* 55:55 */     this.e.g = (f1 - f1 * 2.0F * paramFloat2);
/* 56:56 */     this.f.g = (f1 - f1 * 2.0F * paramFloat3);
/* 57:   */     
/* 58:58 */     this.c.c = MathUtils.sin(f1);
/* 59:59 */     this.d.c = MathUtils.sin(f1);
/* 60:60 */     this.e.c = MathUtils.sin(f1);
/* 61:61 */     this.f.c = MathUtils.sin(f1);
/* 62:   */   }
/* 63:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cca
 * JD-Core Version:    0.7.0.1
 */