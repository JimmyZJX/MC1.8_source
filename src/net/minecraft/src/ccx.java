package net.minecraft.src;
/*  1:   */ public class ccx
/*  2:   */   extends ccv
/*  3:   */ {
/*  4:   */   private float i;
/*  5:   */   
/*  6:   */   public ccx()
/*  7:   */   {
/*  8:12 */     super(12, 0.0F);
/*  9:   */     
/* 10:14 */     this.a = new cdy(this, 0, 0);
/* 11:15 */     this.a.a(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
/* 12:16 */     this.a.a(0.0F, 6.0F, -8.0F);
/* 13:   */     
/* 14:18 */     this.b = new cdy(this, 28, 8);
/* 15:19 */     this.b.a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
/* 16:20 */     this.b.a(0.0F, 5.0F, 2.0F);
/* 17:   */     
/* 18:22 */     float f = 0.5F;
/* 19:23 */     this.c = new cdy(this, 0, 16);
/* 20:24 */     this.c.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 21:25 */     this.c.a(-3.0F, 12.0F, 7.0F);
/* 22:   */     
/* 23:27 */     this.d = new cdy(this, 0, 16);
/* 24:28 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 25:29 */     this.d.a(3.0F, 12.0F, 7.0F);
/* 26:   */     
/* 27:31 */     this.e = new cdy(this, 0, 16);
/* 28:32 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 29:33 */     this.e.a(-3.0F, 12.0F, -5.0F);
/* 30:   */     
/* 31:35 */     this.f = new cdy(this, 0, 16);
/* 32:36 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 33:37 */     this.f.a(3.0F, 12.0F, -5.0F);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 37:   */   {
/* 38:42 */     super.a(paramxm, paramFloat1, paramFloat2, paramFloat3);
/* 39:   */     
/* 40:44 */     this.a.d = (6.0F + ((EntitySheep)paramxm).o(paramFloat3) * 9.0F);
/* 41:45 */     this.i = ((EntitySheep)paramxm).p(paramFloat3);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 45:   */   {
/* 46:50 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 47:   */     
/* 48:52 */     this.a.f = this.i;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccx
 * JD-Core Version:    0.7.0.1
 */