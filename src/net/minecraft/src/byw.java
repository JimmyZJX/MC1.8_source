package net.minecraft.src;
/*  1:   */ public class byw
/*  2:   */   extends byl
/*  3:   */ {
/*  4:10 */   private static final oa u = new oa("textures/gui/container/generic_54.png");
/*  5:   */   private vq v;
/*  6:   */   private vq w;
/*  7:   */   private int x;
/*  8:   */   
/*  9:   */   public byw(vq paramvq1, vq paramvq2)
/* 10:   */   {
/* 11:17 */     super(new aim(paramvq1, paramvq2, bsu.z().h));
/* 12:18 */     this.v = paramvq1;
/* 13:19 */     this.w = paramvq2;
/* 14:20 */     this.p = false;
/* 15:   */     
/* 16:22 */     int i = 222;
/* 17:23 */     int j = i - 108;
/* 18:24 */     this.x = (paramvq2.getSize() / 9);
/* 19:   */     
/* 20:26 */     this.g = (j + this.x * 18);
/* 21:   */   }
/* 22:   */   
/* 23:   */   protected void b(int paramInt1, int paramInt2)
/* 24:   */   {
/* 25:31 */     this.q.a(this.w.e_().c(), 8, 6, 4210752);
/* 26:32 */     this.q.a(this.v.e_().c(), 8, this.g - 96 + 2, 4210752);
/* 27:   */   }
/* 28:   */   
/* 29:   */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 30:   */   {
/* 31:37 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 32:38 */     this.j.N().a(u);
/* 33:39 */     int i = (this.l - this.f) / 2;
/* 34:40 */     int j = (this.m - this.g) / 2;
/* 35:41 */     b(i, j, 0, 0, this.f, this.x * 18 + 17);
/* 36:42 */     b(i, j + this.x * 18 + 17, 0, 126, this.f, 96);
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byw
 * JD-Core Version:    0.7.0.1
 */