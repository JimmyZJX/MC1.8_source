package net.minecraft.src;
/*  1:   */ public class cdk
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   public cdy b;
/*  6:   */   public cdy c;
/*  7:   */   public cdy d;
/*  8:   */   public cdy e;
/*  9:   */   public cdy f;
/* 10:   */   
/* 11:   */   public cdk(float paramFloat)
/* 12:   */   {
/* 13:11 */     this(paramFloat, 0.0F, 64, 64);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public cdk(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
/* 17:   */   {
/* 18:15 */     this.a = new cdy(this).b(paramInt1, paramInt2);
/* 19:16 */     this.a.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 20:17 */     this.a.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, paramFloat1);
/* 21:   */     
/* 22:19 */     this.f = new cdy(this).b(paramInt1, paramInt2);
/* 23:20 */     this.f.a(0.0F, paramFloat2 - 2.0F, 0.0F);
/* 24:21 */     this.f.a(24, 0).a(-1.0F, -1.0F, -6.0F, 2, 4, 2, paramFloat1);
/* 25:22 */     this.a.a(this.f);
/* 26:   */     
/* 27:24 */     this.b = new cdy(this).b(paramInt1, paramInt2);
/* 28:25 */     this.b.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 29:26 */     this.b.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8, 12, 6, paramFloat1);
/* 30:27 */     this.b.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8, 18, 6, paramFloat1 + 0.5F);
/* 31:   */     
/* 32:29 */     this.c = new cdy(this).b(paramInt1, paramInt2);
/* 33:30 */     this.c.a(0.0F, 0.0F + paramFloat2 + 2.0F, 0.0F);
/* 34:31 */     this.c.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4, 8, 4, paramFloat1);
/* 35:32 */     this.c.a(44, 22).a(4.0F, -2.0F, -2.0F, 4, 8, 4, paramFloat1);
/* 36:33 */     this.c.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8, 4, 4, paramFloat1);
/* 37:   */     
/* 38:35 */     this.d = new cdy(this, 0, 22).b(paramInt1, paramInt2);
/* 39:36 */     this.d.a(-2.0F, 12.0F + paramFloat2, 0.0F);
/* 40:37 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/* 41:   */     
/* 42:39 */     this.e = new cdy(this, 0, 22).b(paramInt1, paramInt2);
/* 43:40 */     this.e.i = true;
/* 44:41 */     this.e.a(2.0F, 12.0F + paramFloat2, 0.0F);
/* 45:42 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 49:   */   {
/* 50:47 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 51:   */     
/* 52:49 */     this.a.a(paramFloat6);
/* 53:50 */     this.b.a(paramFloat6);
/* 54:51 */     this.d.a(paramFloat6);
/* 55:52 */     this.e.a(paramFloat6);
/* 56:53 */     this.c.a(paramFloat6);
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 60:   */   {
/* 61:58 */     this.a.g = (paramFloat4 / 57.295776F);
/* 62:59 */     this.a.f = (paramFloat5 / 57.295776F);
/* 63:   */     
/* 64:61 */     this.c.d = 3.0F;
/* 65:62 */     this.c.e = -1.0F;
/* 66:63 */     this.c.f = -0.75F;
/* 67:   */     
/* 68:65 */     this.d.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2 * 0.5F);
/* 69:66 */     this.e.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2 * 0.5F);
/* 70:67 */     this.d.g = 0.0F;
/* 71:68 */     this.e.g = 0.0F;
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdk
 * JD-Core Version:    0.7.0.1
 */