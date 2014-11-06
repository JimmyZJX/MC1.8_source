package net.minecraft.src;
/*  1:   */ public class cce
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
/* 12:   */   public cce()
/* 13:   */   {
/* 14:11 */     this(0.0F);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public cce(float paramFloat)
/* 18:   */   {
/* 19:15 */     int i = 6;
/* 20:   */     
/* 21:17 */     this.a = new cdy(this, 0, 0);
/* 22:18 */     this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat);
/* 23:19 */     this.a.a(0.0F, i, 0.0F);
/* 24:   */     
/* 25:21 */     this.b = new cdy(this, 32, 0);
/* 26:22 */     this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat + 0.5F);
/* 27:23 */     this.b.a(0.0F, i, 0.0F);
/* 28:   */     
/* 29:25 */     this.c = new cdy(this, 16, 16);
/* 30:26 */     this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat);
/* 31:27 */     this.c.a(0.0F, i, 0.0F);
/* 32:   */     
/* 33:29 */     this.d = new cdy(this, 0, 16);
/* 34:30 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
/* 35:31 */     this.d.a(-2.0F, 12 + i, 4.0F);
/* 36:   */     
/* 37:33 */     this.e = new cdy(this, 0, 16);
/* 38:34 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
/* 39:35 */     this.e.a(2.0F, 12 + i, 4.0F);
/* 40:   */     
/* 41:37 */     this.f = new cdy(this, 0, 16);
/* 42:38 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
/* 43:39 */     this.f.a(-2.0F, 12 + i, -4.0F);
/* 44:   */     
/* 45:41 */     this.g = new cdy(this, 0, 16);
/* 46:42 */     this.g.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
/* 47:43 */     this.g.a(2.0F, 12 + i, -4.0F);
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 51:   */   {
/* 52:48 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 53:   */     
/* 54:50 */     this.a.a(paramFloat6);
/* 55:51 */     this.c.a(paramFloat6);
/* 56:52 */     this.d.a(paramFloat6);
/* 57:53 */     this.e.a(paramFloat6);
/* 58:54 */     this.f.a(paramFloat6);
/* 59:55 */     this.g.a(paramFloat6);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 63:   */   {
/* 64:60 */     this.a.g = (paramFloat4 / 57.295776F);
/* 65:61 */     this.a.f = (paramFloat5 / 57.295776F);
/* 66:   */     
/* 67:63 */     this.d.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 68:64 */     this.e.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2);
/* 69:65 */     this.f.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2);
/* 70:66 */     this.g.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cce
 * JD-Core Version:    0.7.0.1
 */