package net.minecraft.src;
/*  1:   */ public class bzi
/*  2:   */   extends byl
/*  3:   */ {
/*  4:11 */   private static final oa u = new oa("textures/gui/container/horse.png");
/*  5:   */   private vq v;
/*  6:   */   private vq w;
/*  7:   */   private EntityHorse x;
/*  8:   */   private float y;
/*  9:   */   private float z;
/* 10:   */   
/* 11:   */   public bzi(vq paramvq1, vq paramvq2, EntityHorse paramabt)
/* 12:   */   {
/* 13:18 */     super(new aiy(paramvq1, paramvq2, paramabt, bsu.z().h));
/* 14:19 */     this.v = paramvq1;
/* 15:20 */     this.w = paramvq2;
/* 16:21 */     this.x = paramabt;
/* 17:22 */     this.p = false;
/* 18:   */   }
/* 19:   */   
/* 20:   */   protected void b(int paramInt1, int paramInt2)
/* 21:   */   {
/* 22:27 */     this.q.a(this.w.e_().c(), 8, 6, 4210752);
/* 23:28 */     this.q.a(this.v.e_().c(), 8, this.g - 96 + 2, 4210752);
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 27:   */   {
/* 28:33 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 29:34 */     this.j.N().a(u);
/* 30:35 */     int i = (this.l - this.f) / 2;
/* 31:36 */     int j = (this.m - this.g) / 2;
/* 32:37 */     b(i, j, 0, 0, this.f, this.g);
/* 33:39 */     if (this.x.cu()) {
/* 34:40 */       b(i + 79, j + 17, 0, this.g, 90, 54);
/* 35:   */     }
/* 36:42 */     if (this.x.cM()) {
/* 37:43 */       b(i + 7, j + 35, 0, this.g + 54, 18, 18);
/* 38:   */     }
/* 39:46 */     bzj.a(i + 51, j + 60, 17, i + 51 - this.y, j + 75 - 50 - this.z, this.x);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 43:   */   {
/* 44:51 */     this.y = paramInt1;
/* 45:52 */     this.z = paramInt2;
/* 46:   */     
/* 47:54 */     super.a(paramInt1, paramInt2, paramFloat);
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzi
 * JD-Core Version:    0.7.0.1
 */