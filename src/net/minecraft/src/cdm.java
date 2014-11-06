package net.minecraft.src;
/*  1:   */ public class cdm
/*  2:   */   extends cdk
/*  3:   */ {
/*  4:   */   public boolean g;
/*  5:   */   private cdy h;
/*  6:   */   private cdy i;
/*  7:   */   
/*  8:   */   public cdm(float paramFloat)
/*  9:   */   {
/* 10:13 */     super(paramFloat, 0.0F, 64, 128);
/* 11:   */     
/* 12:15 */     this.h = new cdy(this).b(64, 128);
/* 13:16 */     this.h.a(0.0F, -2.0F, 0.0F);
/* 14:17 */     this.h.a(0, 0).a(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
/* 15:18 */     this.f.a(this.h);
/* 16:   */     
/* 17:20 */     this.i = new cdy(this).b(64, 128);
/* 18:21 */     this.i.a(-5.0F, -10.03125F, -5.0F);
/* 19:22 */     this.i.a(0, 64).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
/* 20:23 */     this.a.a(this.i);
/* 21:   */     
/* 22:25 */     cdy localcdy1 = new cdy(this).b(64, 128);
/* 23:26 */     localcdy1.a(1.75F, -4.0F, 2.0F);
/* 24:27 */     localcdy1.a(0, 76).a(0.0F, 0.0F, 0.0F, 7, 4, 7);
/* 25:28 */     localcdy1.f = -0.05235988F;
/* 26:29 */     localcdy1.h = 0.0261799F;
/* 27:30 */     this.i.a(localcdy1);
/* 28:   */     
/* 29:32 */     cdy localcdy2 = new cdy(this).b(64, 128);
/* 30:33 */     localcdy2.a(1.75F, -4.0F, 2.0F);
/* 31:34 */     localcdy2.a(0, 87).a(0.0F, 0.0F, 0.0F, 4, 4, 4);
/* 32:35 */     localcdy2.f = -0.1047198F;
/* 33:36 */     localcdy2.h = 0.05235988F;
/* 34:37 */     localcdy1.a(localcdy2);
/* 35:   */     
/* 36:39 */     cdy localcdy3 = new cdy(this).b(64, 128);
/* 37:40 */     localcdy3.a(1.75F, -2.0F, 2.0F);
/* 38:41 */     localcdy3.a(0, 95).a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
/* 39:42 */     localcdy3.f = -0.2094395F;
/* 40:43 */     localcdy3.h = 0.1047198F;
/* 41:44 */     localcdy2.a(localcdy3);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 45:   */   {
/* 46:49 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 47:   */     
/* 48:51 */     this.f.o = (this.f.p = this.f.q = 0.0F);
/* 49:   */     
/* 50:53 */     float f = 0.01F * (paramwv.getID() % 10);
/* 51:54 */     this.f.f = (MathUtils.sin(paramwv.W * f) * 4.5F * 3.141593F / 180.0F);
/* 52:55 */     this.f.g = 0.0F;
/* 53:56 */     this.f.h = (MathUtils.cos(paramwv.W * f) * 2.5F * 3.141593F / 180.0F);
/* 54:58 */     if (this.g)
/* 55:   */     {
/* 56:59 */       this.f.f = -0.9F;
/* 57:60 */       this.f.q = -0.09375F;
/* 58:61 */       this.f.p = 0.1875F;
/* 59:   */     }
/* 60:   */   }
/* 61:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdm
 * JD-Core Version:    0.7.0.1
 */