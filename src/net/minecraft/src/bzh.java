package net.minecraft.src;
/*  1:   */ public class bzh
/*  2:   */   extends byl
/*  3:   */ {
/*  4:11 */   private static final oa u = new oa("textures/gui/container/hopper.png");
/*  5:   */   private vq v;
/*  6:   */   private vq w;
/*  7:   */   
/*  8:   */   public bzh(Inventory paramahb, vq paramvq)
/*  9:   */   {
/* 10:16 */     super(new aix(paramahb, paramvq, bsu.z().h));
/* 11:17 */     this.v = paramahb;
/* 12:18 */     this.w = paramvq;
/* 13:19 */     this.p = false;
/* 14:   */     
/* 15:21 */     this.g = 133;
/* 16:   */   }
/* 17:   */   
/* 18:   */   protected void b(int paramInt1, int paramInt2)
/* 19:   */   {
/* 20:26 */     this.q.a(this.w.e_().c(), 8, 6, 4210752);
/* 21:27 */     this.q.a(this.v.e_().c(), 8, this.g - 96 + 2, 4210752);
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 25:   */   {
/* 26:32 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 27:33 */     this.j.N().a(u);
/* 28:34 */     int i = (this.l - this.f) / 2;
/* 29:35 */     int j = (this.m - this.g) / 2;
/* 30:36 */     b(i, j, 0, 0, this.f, this.g);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzh
 * JD-Core Version:    0.7.0.1
 */