package net.minecraft.src;
/*  1:   */ public class ccv
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   public cdy b;
/*  6:   */   public cdy c;
/*  7:   */   public cdy d;
/*  8:   */   public cdy e;
/*  9:   */   public cdy f;
/* 10:10 */   protected float g = 8.0F;
/* 11:11 */   protected float h = 4.0F;
/* 12:   */   
/* 13:   */   public ccv(int paramInt, float paramFloat)
/* 14:   */   {
/* 15:14 */     this.a = new cdy(this, 0, 0);
/* 16:15 */     this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, paramFloat);
/* 17:16 */     this.a.a(0.0F, 18 - paramInt, -6.0F);
/* 18:   */     
/* 19:18 */     this.b = new cdy(this, 28, 8);
/* 20:19 */     this.b.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, paramFloat);
/* 21:20 */     this.b.a(0.0F, 17 - paramInt, 2.0F);
/* 22:   */     
/* 23:22 */     this.c = new cdy(this, 0, 16);
/* 24:23 */     this.c.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 25:24 */     this.c.a(-3.0F, 24 - paramInt, 7.0F);
/* 26:   */     
/* 27:26 */     this.d = new cdy(this, 0, 16);
/* 28:27 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 29:28 */     this.d.a(3.0F, 24 - paramInt, 7.0F);
/* 30:   */     
/* 31:30 */     this.e = new cdy(this, 0, 16);
/* 32:31 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 33:32 */     this.e.a(-3.0F, 24 - paramInt, -5.0F);
/* 34:   */     
/* 35:34 */     this.f = new cdy(this, 0, 16);
/* 36:35 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 37:36 */     this.f.a(3.0F, 24 - paramInt, -5.0F);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 41:   */   {
/* 42:41 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 43:43 */     if (this.r)
/* 44:   */     {
/* 45:44 */       float f1 = 2.0F;
/* 46:45 */       cjm.glPushMatrix();
/* 47:46 */       cjm.glTranslatef(0.0F, this.g * paramFloat6, this.h * paramFloat6);
/* 48:47 */       this.a.a(paramFloat6);
/* 49:48 */       cjm.glPopMatrix();
/* 50:49 */       cjm.glPushMatrix();
/* 51:50 */       cjm.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/* 52:51 */       cjm.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/* 53:52 */       this.b.a(paramFloat6);
/* 54:53 */       this.c.a(paramFloat6);
/* 55:54 */       this.d.a(paramFloat6);
/* 56:55 */       this.e.a(paramFloat6);
/* 57:56 */       this.f.a(paramFloat6);
/* 58:57 */       cjm.glPopMatrix();
/* 59:   */     }
/* 60:   */     else
/* 61:   */     {
/* 62:59 */       this.a.a(paramFloat6);
/* 63:60 */       this.b.a(paramFloat6);
/* 64:61 */       this.c.a(paramFloat6);
/* 65:62 */       this.d.a(paramFloat6);
/* 66:63 */       this.e.a(paramFloat6);
/* 67:64 */       this.f.a(paramFloat6);
/* 68:   */     }
/* 69:   */   }
/* 70:   */   
/* 71:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 72:   */   {
/* 73:70 */     float f1 = 57.295776F;
/* 74:71 */     this.a.f = (paramFloat5 / 57.295776F);
/* 75:72 */     this.a.g = (paramFloat4 / 57.295776F);
/* 76:73 */     this.b.f = 1.570796F;
/* 77:   */     
/* 78:75 */     this.c.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 79:76 */     this.d.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2);
/* 80:77 */     this.e.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2);
/* 81:78 */     this.f.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccv
 * JD-Core Version:    0.7.0.1
 */