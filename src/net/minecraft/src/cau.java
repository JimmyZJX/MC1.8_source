package net.minecraft.src;
/*   1:    */ class cau
/*   2:    */   implements caw
/*   3:    */ {
/*   4:    */   private final int a;
/*   5:    */   private final boolean b;
/*   6:    */   
/*   7:    */   public cau(int paramInt, boolean paramBoolean)
/*   8:    */   {
/*   9:147 */     this.a = paramInt;
/*  10:148 */     this.b = paramBoolean;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void a(car paramcar)
/*  14:    */   {
/*  15:153 */     car.a(paramcar, this.a);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public ho z_()
/*  19:    */   {
/*  20:158 */     if (this.a < 0) {
/*  21:159 */       return new hy("Previous Page");
/*  22:    */     }
/*  23:161 */     return new hy("Next Page");
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(float paramFloat, int paramInt)
/*  27:    */   {
/*  28:167 */     bsu.z().N().a(bvo.a);
/*  29:169 */     if (this.a < 0) {
/*  30:170 */       bub.a(0, 0, 144.0F, 0.0F, 16, 16, 256.0F, 256.0F);
/*  31:    */     } else {
/*  32:172 */       bub.a(0, 0, 160.0F, 0.0F, 16, 16, 256.0F, 256.0F);
/*  33:    */     }
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean A_()
/*  37:    */   {
/*  38:178 */     return this.b;
/*  39:    */   }
/*  40:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cau
 * JD-Core Version:    0.7.0.1
 */