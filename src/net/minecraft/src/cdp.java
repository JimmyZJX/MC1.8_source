package net.minecraft.src;
/*  1:   */ public class cdp
/*  2:   */   extends ccl
/*  3:   */ {
/*  4:   */   public cdp()
/*  5:   */   {
/*  6: 8 */     this(0.0F, false);
/*  7:   */   }
/*  8:   */   
/*  9:   */   protected cdp(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:12 */     super(paramFloat1, paramFloat2, paramInt1, paramInt2);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public cdp(float paramFloat, boolean paramBoolean)
/* 15:   */   {
/* 16:16 */     super(paramFloat, 0.0F, 64, paramBoolean ? 32 : 64);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 20:   */   {
/* 21:21 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 22:   */     
/* 23:23 */     float f1 = MathUtils.sin(this.p * 3.141593F);
/* 24:24 */     float f2 = MathUtils.sin((1.0F - (1.0F - this.p) * (1.0F - this.p)) * 3.141593F);
/* 25:25 */     this.h.h = 0.0F;
/* 26:26 */     this.i.h = 0.0F;
/* 27:27 */     this.h.g = (-(0.1F - f1 * 0.6F));
/* 28:28 */     this.i.g = (0.1F - f1 * 0.6F);
/* 29:29 */     this.h.f = -1.570796F;
/* 30:30 */     this.i.f = -1.570796F;
/* 31:31 */     this.h.f -= f1 * 1.2F - f2 * 0.4F;
/* 32:32 */     this.i.f -= f1 * 1.2F - f2 * 0.4F;
/* 33:   */     
/* 34:34 */     this.h.h += MathUtils.cos(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 35:35 */     this.i.h -= MathUtils.cos(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 36:36 */     this.h.f += MathUtils.sin(paramFloat3 * 0.067F) * 0.05F;
/* 37:37 */     this.i.f -= MathUtils.sin(paramFloat3 * 0.067F) * 0.05F;
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdp
 * JD-Core Version:    0.7.0.1
 */