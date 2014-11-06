package net.minecraft.src;
/*  1:   */ public class cbu
/*  2:   */   extends ccl
/*  3:   */ {
/*  4:   */   public cbu()
/*  5:   */   {
/*  6: 9 */     this(0.0F);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public cbu(float paramFloat)
/* 10:   */   {
/* 11:13 */     this(paramFloat, 64, 32);
/* 12:   */   }
/* 13:   */   
/* 14:   */   protected cbu(float paramFloat, int paramInt1, int paramInt2)
/* 15:   */   {
/* 16:17 */     super(paramFloat, 0.0F, paramInt1, paramInt2);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 20:   */   {
/* 21:22 */     if (!(paramwv instanceof EntityArmorStand)) {
/* 22:23 */       return;
/* 23:   */     }
/* 24:25 */     EntityArmorStand localadi = (EntityArmorStand)paramwv;
/* 25:   */     
/* 26:27 */     this.e.f = (0.01745329F * localadi.s().b());
/* 27:28 */     this.e.g = (0.01745329F * localadi.s().c());
/* 28:29 */     this.e.h = (0.01745329F * localadi.s().d());
/* 29:30 */     this.e.a(0.0F, 1.0F, 0.0F);
/* 30:   */     
/* 31:32 */     this.g.f = (0.01745329F * localadi.t().b());
/* 32:33 */     this.g.g = (0.01745329F * localadi.t().c());
/* 33:34 */     this.g.h = (0.01745329F * localadi.t().d());
/* 34:   */     
/* 35:36 */     this.i.f = (0.01745329F * localadi.u().b());
/* 36:37 */     this.i.g = (0.01745329F * localadi.u().c());
/* 37:38 */     this.i.h = (0.01745329F * localadi.u().d());
/* 38:   */     
/* 39:40 */     this.h.f = (0.01745329F * localadi.v().b());
/* 40:41 */     this.h.g = (0.01745329F * localadi.v().c());
/* 41:42 */     this.h.h = (0.01745329F * localadi.v().d());
/* 42:   */     
/* 43:44 */     this.k.f = (0.01745329F * localadi.w().b());
/* 44:45 */     this.k.g = (0.01745329F * localadi.w().c());
/* 45:46 */     this.k.h = (0.01745329F * localadi.w().d());
/* 46:47 */     this.k.a(1.9F, 11.0F, 0.0F);
/* 47:   */     
/* 48:49 */     this.j.f = (0.01745329F * localadi.x().b());
/* 49:50 */     this.j.g = (0.01745329F * localadi.x().c());
/* 50:51 */     this.j.h = (0.01745329F * localadi.x().d());
/* 51:52 */     this.j.a(-1.9F, 11.0F, 0.0F);
/* 52:   */     
/* 53:54 */     a(this.e, this.f);
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cbu
 * JD-Core Version:    0.7.0.1
 */