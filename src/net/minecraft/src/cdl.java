package net.minecraft.src;
/*  1:   */ public class cdl
/*  2:   */   extends ccl
/*  3:   */ {
/*  4:   */   public cdl()
/*  5:   */   {
/*  6: 9 */     this(0.0F, 0.0F, false);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public cdl(float paramFloat1, float paramFloat2, boolean paramBoolean)
/* 10:   */   {
/* 11:13 */     super(paramFloat1, 0.0F, 64, paramBoolean ? 32 : 64);
/* 12:15 */     if (paramBoolean)
/* 13:   */     {
/* 14:16 */       this.e = new cdy(this, 0, 0);
/* 15:17 */       this.e.a(-4.0F, -10.0F, -4.0F, 8, 8, 8, paramFloat1);
/* 16:18 */       this.e.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 17:   */     }
/* 18:   */     else
/* 19:   */     {
/* 20:20 */       this.e = new cdy(this);
/* 21:21 */       this.e.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 22:22 */       this.e.a(0, 32).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, paramFloat1);
/* 23:23 */       this.e.a(24, 32).a(-1.0F, -3.0F, -6.0F, 2, 4, 2, paramFloat1);
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 28:   */   {
/* 29:33 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 30:   */     
/* 31:35 */     float f1 = MathUtils.sin(this.p * 3.141593F);
/* 32:36 */     float f2 = MathUtils.sin((1.0F - (1.0F - this.p) * (1.0F - this.p)) * 3.141593F);
/* 33:37 */     this.h.h = 0.0F;
/* 34:38 */     this.i.h = 0.0F;
/* 35:39 */     this.h.g = (-(0.1F - f1 * 0.6F));
/* 36:40 */     this.i.g = (0.1F - f1 * 0.6F);
/* 37:41 */     this.h.f = -1.570796F;
/* 38:42 */     this.i.f = -1.570796F;
/* 39:43 */     this.h.f -= f1 * 1.2F - f2 * 0.4F;
/* 40:44 */     this.i.f -= f1 * 1.2F - f2 * 0.4F;
/* 41:   */     
/* 42:46 */     this.h.h += MathUtils.cos(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 43:47 */     this.i.h -= MathUtils.cos(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 44:48 */     this.h.f += MathUtils.sin(paramFloat3 * 0.067F) * 0.05F;
/* 45:49 */     this.i.f -= MathUtils.sin(paramFloat3 * 0.067F) * 0.05F;
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdl
 * JD-Core Version:    0.7.0.1
 */