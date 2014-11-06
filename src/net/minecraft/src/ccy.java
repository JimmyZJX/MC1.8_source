package net.minecraft.src;
/*  1:   */ public class ccy
/*  2:   */   extends ccv
/*  3:   */ {
/*  4:   */   private float i;
/*  5:   */   
/*  6:   */   public ccy()
/*  7:   */   {
/*  8:12 */     super(12, 0.0F);
/*  9:   */     
/* 10:14 */     this.a = new cdy(this, 0, 0);
/* 11:15 */     this.a.a(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
/* 12:16 */     this.a.a(0.0F, 6.0F, -8.0F);
/* 13:   */     
/* 14:18 */     this.b = new cdy(this, 28, 8);
/* 15:19 */     this.b.a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
/* 16:20 */     this.b.a(0.0F, 5.0F, 2.0F);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 20:   */   {
/* 21:25 */     super.a(paramxm, paramFloat1, paramFloat2, paramFloat3);
/* 22:   */     
/* 23:27 */     this.a.d = (6.0F + ((EntitySheep)paramxm).o(paramFloat3) * 9.0F);
/* 24:28 */     this.i = ((EntitySheep)paramxm).p(paramFloat3);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 28:   */   {
/* 29:33 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 30:   */     
/* 31:35 */     this.a.f = this.i;
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccy
 * JD-Core Version:    0.7.0.1
 */