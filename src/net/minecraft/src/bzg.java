package net.minecraft.src;
/*  1:   */ public class bzg
/*  2:   */   extends byl
/*  3:   */ {
/*  4:11 */   private static final oa u = new oa("textures/gui/container/furnace.png");
/*  5:   */   private final ahb v;
/*  6:   */   private vq w;
/*  7:   */   
/*  8:   */   public bzg(ahb paramahb, vq paramvq)
/*  9:   */   {
/* 10:16 */     super(new aiv(paramahb, paramvq));
/* 11:17 */     this.v = paramahb;
/* 12:18 */     this.w = paramvq;
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected void b(int paramInt1, int paramInt2)
/* 16:   */   {
/* 17:23 */     String str = this.w.e_().c();
/* 18:24 */     this.q.a(str, this.f / 2 - this.q.a(str) / 2, 6, 4210752);
/* 19:25 */     this.q.a(this.v.e_().c(), 8, this.g - 96 + 2, 4210752);
/* 20:   */   }
/* 21:   */   
/* 22:   */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 23:   */   {
/* 24:30 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 25:31 */     this.j.N().a(u);
/* 26:32 */     int i = (this.l - this.f) / 2;
/* 27:33 */     int j = (this.m - this.g) / 2;
/* 28:34 */     b(i, j, 0, 0, this.f, this.g);
/* 29:35 */     if (bdc.a(this.w))
/* 30:   */     {
/* 31:36 */       int k = i(13);
/* 32:37 */       b(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
/* 33:   */     }
/* 34:40 */     int k = h(24);
/* 35:41 */     b(i + 79, j + 34, 176, 14, k + 1, 16);
/* 36:   */   }
/* 37:   */   
/* 38:   */   private int h(int paramInt)
/* 39:   */   {
/* 40:45 */     int i = this.w.a_(2);
/* 41:46 */     int j = this.w.a_(3);
/* 42:47 */     if ((j == 0) || (i == 0)) {
/* 43:48 */       return 0;
/* 44:   */     }
/* 45:50 */     return i * paramInt / j;
/* 46:   */   }
/* 47:   */   
/* 48:   */   private int i(int paramInt)
/* 49:   */   {
/* 50:55 */     int i = this.w.a_(1);
/* 51:56 */     if (i == 0) {
/* 52:57 */       i = 200;
/* 53:   */     }
/* 54:59 */     return this.w.a_(0) * paramInt / i;
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzg
 * JD-Core Version:    0.7.0.1
 */