package net.minecraft.src;
/*  1:   */ public class cdf
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   public cdy b;
/*  6:   */   public cdy c;
/*  7:   */   public cdy d;
/*  8:   */   public cdy e;
/*  9:   */   
/* 10:   */   public cdf()
/* 11:   */   {
/* 12:12 */     float f1 = 4.0F;
/* 13:13 */     float f2 = 0.0F;
/* 14:   */     
/* 15:15 */     this.c = new cdy(this, 0, 0).b(64, 64);
/* 16:16 */     this.c.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, f2 - 0.5F);
/* 17:17 */     this.c.a(0.0F, 0.0F + f1, 0.0F);
/* 18:   */     
/* 19:19 */     this.d = new cdy(this, 32, 0).b(64, 64);
/* 20:20 */     this.d.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, f2 - 0.5F);
/* 21:21 */     this.d.a(0.0F, 0.0F + f1 + 9.0F - 7.0F, 0.0F);
/* 22:   */     
/* 23:23 */     this.e = new cdy(this, 32, 0).b(64, 64);
/* 24:24 */     this.e.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, f2 - 0.5F);
/* 25:25 */     this.e.a(0.0F, 0.0F + f1 + 9.0F - 7.0F, 0.0F);
/* 26:   */     
/* 27:27 */     this.a = new cdy(this, 0, 16).b(64, 64);
/* 28:28 */     this.a.a(-5.0F, -10.0F, -5.0F, 10, 10, 10, f2 - 0.5F);
/* 29:29 */     this.a.a(0.0F, 0.0F + f1 + 9.0F, 0.0F);
/* 30:   */     
/* 31:31 */     this.b = new cdy(this, 0, 36).b(64, 64);
/* 32:32 */     this.b.a(-6.0F, -12.0F, -6.0F, 12, 12, 12, f2 - 0.5F);
/* 33:33 */     this.b.a(0.0F, 0.0F + f1 + 20.0F, 0.0F);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 37:   */   {
/* 38:38 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 39:39 */     this.c.g = (paramFloat4 / 57.295776F);
/* 40:40 */     this.c.f = (paramFloat5 / 57.295776F);
/* 41:41 */     this.a.g = (paramFloat4 / 57.295776F * 0.25F);
/* 42:   */     
/* 43:43 */     float f1 = MathUtils.sin(this.a.g);
/* 44:44 */     float f2 = MathUtils.cos(this.a.g);
/* 45:   */     
/* 46:46 */     this.d.h = 1.0F;
/* 47:47 */     this.e.h = -1.0F;
/* 48:48 */     this.d.g = (0.0F + this.a.g);
/* 49:49 */     this.e.g = (3.141593F + this.a.g);
/* 50:   */     
/* 51:51 */     this.d.c = (f2 * 5.0F);
/* 52:52 */     this.d.e = (-f1 * 5.0F);
/* 53:   */     
/* 54:54 */     this.e.c = (-f2 * 5.0F);
/* 55:55 */     this.e.e = (f1 * 5.0F);
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 59:   */   {
/* 60:60 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 61:   */     
/* 62:62 */     this.a.a(paramFloat6);
/* 63:63 */     this.b.a(paramFloat6);
/* 64:64 */     this.c.a(paramFloat6);
/* 65:65 */     this.d.a(paramFloat6);
/* 66:66 */     this.e.a(paramFloat6);
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdf
 * JD-Core Version:    0.7.0.1
 */