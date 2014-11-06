package net.minecraft.src;
/*  1:   */ public class cdn
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   private cdy[] a;
/*  5:   */   private cdy[] b;
/*  6:   */   
/*  7:   */   public cdn(float paramFloat)
/*  8:   */   {
/*  9:14 */     this.t = 64;
/* 10:15 */     this.u = 64;
/* 11:   */     
/* 12:17 */     this.a = new cdy[3];
/* 13:   */     
/* 14:19 */     this.a[0] = new cdy(this, 0, 16);
/* 15:20 */     this.a[0].a(-10.0F, 3.9F, -0.5F, 20, 3, 3, paramFloat);
/* 16:   */     
/* 17:22 */     this.a[1] = new cdy(this).b(this.t, this.u);
/* 18:23 */     this.a[1].a(-2.0F, 6.9F, -0.5F);
/* 19:24 */     this.a[1].a(0, 22).a(0.0F, 0.0F, 0.0F, 3, 10, 3, paramFloat);
/* 20:25 */     this.a[1].a(24, 22).a(-4.0F, 1.5F, 0.5F, 11, 2, 2, paramFloat);
/* 21:26 */     this.a[1].a(24, 22).a(-4.0F, 4.0F, 0.5F, 11, 2, 2, paramFloat);
/* 22:27 */     this.a[1].a(24, 22).a(-4.0F, 6.5F, 0.5F, 11, 2, 2, paramFloat);
/* 23:   */     
/* 24:29 */     this.a[2] = new cdy(this, 12, 22);
/* 25:30 */     this.a[2].a(0.0F, 0.0F, 0.0F, 3, 6, 3, paramFloat);
/* 26:   */     
/* 27:32 */     this.b = new cdy[3];
/* 28:33 */     this.b[0] = new cdy(this, 0, 0);
/* 29:34 */     this.b[0].a(-4.0F, -4.0F, -4.0F, 8, 8, 8, paramFloat);
/* 30:35 */     this.b[1] = new cdy(this, 32, 0);
/* 31:36 */     this.b[1].a(-4.0F, -4.0F, -4.0F, 6, 6, 6, paramFloat);
/* 32:37 */     this.b[1].c = -8.0F;
/* 33:38 */     this.b[1].d = 4.0F;
/* 34:39 */     this.b[2] = new cdy(this, 32, 0);
/* 35:40 */     this.b[2].a(-4.0F, -4.0F, -4.0F, 6, 6, 6, paramFloat);
/* 36:41 */     this.b[2].c = 10.0F;
/* 37:42 */     this.b[2].d = 4.0F;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 41:   */   {
/* 42:47 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 43:   */     
/* 44:49 */     for (cdy localcdy : this.b) {
/* 45:50 */       localcdy.a(paramFloat6);
/* 46:   */     }
/* 47:52 */     for (cdy localcdy : this.a) {
/* 48:53 */       localcdy.a(paramFloat6);
/* 49:   */     }
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 53:   */   {
/* 54:59 */     float f = MathUtils.cos(paramFloat3 * 0.1F);
/* 55:60 */     this.a[1].f = ((0.065F + 0.05F * f) * 3.141593F);
/* 56:   */     
/* 57:62 */     this.a[2].a(-2.0F, 6.9F + MathUtils.cos(this.a[1].f) * 10.0F, -0.5F + MathUtils.sin(this.a[1].f) * 10.0F);
/* 58:63 */     this.a[2].f = ((0.265F + 0.1F * f) * 3.141593F);
/* 59:   */     
/* 60:65 */     this.b[0].g = (paramFloat4 / 57.295776F);
/* 61:66 */     this.b[0].f = (paramFloat5 / 57.295776F);
/* 62:   */   }
/* 63:   */   
/* 64:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 65:   */   {
/* 66:71 */     EntityWither localadf = (EntityWither)paramxm;
/* 67:73 */     for (int i = 1; i < 3; i++)
/* 68:   */     {
/* 69:74 */       this.b[i].g = ((localadf.a(i - 1) - paramxm.aG) / 57.295776F);
/* 70:75 */       this.b[i].f = (localadf.b(i - 1) / 57.295776F);
/* 71:   */     }
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdn
 * JD-Core Version:    0.7.0.1
 */