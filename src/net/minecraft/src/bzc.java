package net.minecraft.src;
/*  1:   */ public class bzc
/*  2:   */   extends byl
/*  3:   */ {
/*  4:10 */   private static final oa v = new oa("textures/gui/container/dispenser.png");
/*  5:   */   private final Inventory w;
/*  6:   */   public vq u;
/*  7:   */   
/*  8:   */   public bzc(Inventory paramahb, vq paramvq)
/*  9:   */   {
/* 10:15 */     super(new aip(paramahb, paramvq));
/* 11:16 */     this.w = paramahb;
/* 12:17 */     this.u = paramvq;
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected void b(int paramInt1, int paramInt2)
/* 16:   */   {
/* 17:22 */     String str = this.u.e_().c();
/* 18:23 */     this.q.a(str, this.f / 2 - this.q.a(str) / 2, 6, 4210752);
/* 19:24 */     this.q.a(this.w.e_().c(), 8, this.g - 96 + 2, 4210752);
/* 20:   */   }
/* 21:   */   
/* 22:   */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 23:   */   {
/* 24:29 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 25:30 */     this.j.N().a(v);
/* 26:31 */     int i = (this.l - this.f) / 2;
/* 27:32 */     int j = (this.m - this.g) / 2;
/* 28:33 */     b(i, j, 0, 0, this.f, this.g);
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzc
 * JD-Core Version:    0.7.0.1
 */