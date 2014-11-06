package net.minecraft.src;
/*  1:   */ public class yj
/*  2:   */ {
/*  3:   */   private EntityLiving a;
/*  4:   */   private int b;
/*  5:   */   private float c;
/*  6:   */   
/*  7:   */   public yj(EntityLiving paramxm)
/*  8:   */   {
/*  9:13 */     this.a = paramxm;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a()
/* 13:   */   {
/* 14:17 */     double d1 = this.a.xPos - this.a.lastX;
/* 15:18 */     double d2 = this.a.zPos - this.a.lastZ;
/* 16:20 */     if (d1 * d1 + d2 * d2 > 2.500000277905201E-007D)
/* 17:   */     {
/* 18:22 */       this.a.aG = this.a.yaw;
/* 19:23 */       this.a.aI = a(this.a.aG, this.a.aI, 75.0F);
/* 20:24 */       this.c = this.a.aI;
/* 21:25 */       this.b = 0;
/* 22:26 */       return;
/* 23:   */     }
/* 24:30 */     float f = 75.0F;
/* 25:31 */     if (Math.abs(this.a.aI - this.c) > 15.0F)
/* 26:   */     {
/* 27:32 */       this.b = 0;
/* 28:33 */       this.c = this.a.aI;
/* 29:   */     }
/* 30:   */     else
/* 31:   */     {
/* 32:35 */       this.b += 1;
/* 33:36 */       int i = 10;
/* 34:37 */       if (this.b > 10) {
/* 35:38 */         f = Math.max(1.0F - (this.b - 10) / 10.0F, 0.0F) * 75.0F;
/* 36:   */       }
/* 37:   */     }
/* 38:42 */     this.a.aG = a(this.a.aI, this.a.aG, f);
/* 39:   */   }
/* 40:   */   
/* 41:   */   private float a(float paramFloat1, float paramFloat2, float paramFloat3)
/* 42:   */   {
/* 43:46 */     float f = MathUtils.wrapDegrees(paramFloat1 - paramFloat2);
/* 44:47 */     if (f < -paramFloat3) {
/* 45:48 */       f = -paramFloat3;
/* 46:   */     }
/* 47:50 */     if (f >= paramFloat3) {
/* 48:51 */       f = paramFloat3;
/* 49:   */     }
/* 50:53 */     return paramFloat1 - f;
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yj
 * JD-Core Version:    0.7.0.1
 */