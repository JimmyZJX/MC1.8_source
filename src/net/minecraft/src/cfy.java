package net.minecraft.src;
/*   1:    */ public class cfy
/*   2:    */   extends cgw
/*   3:    */ {
/*   4:    */   protected cfy(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*   5:    */   {
/*   6:399 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*   7:    */     
/*   8:401 */     this.g = 4;
/*   9:    */   }
/*  10:    */   
/*  11:    */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  12:    */   {
/*  13:406 */     float f1 = 0.25F;
/*  14:407 */     float f2 = f1 + 0.25F;
/*  15:408 */     float f3 = 0.125F;
/*  16:409 */     float f4 = f3 + 0.25F;
/*  17:410 */     float f5 = 7.1F * MathUtils.sin((this.f + paramFloat1 - 1.0F) * 0.25F * 3.141593F);
/*  18:411 */     this.as = (0.6F - (this.f + paramFloat1 - 1.0F) * 0.25F * 0.5F);
/*  19:    */     
/*  20:413 */     float f6 = (float)(this.lastX + (this.xPos - this.lastX) * paramFloat1 - au);
/*  21:414 */     float f7 = (float)(this.lastY + (this.yPos - this.lastY) * paramFloat1 - av);
/*  22:415 */     float f8 = (float)(this.lastZ + (this.zPos - this.lastZ) * paramFloat1 - aw);
/*  23:    */     
/*  24:417 */     paramciv.setColor(this.ap, this.aq, this.ar, this.as);
/*  25:    */     
/*  26:419 */     paramciv.addVertexWithUV(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/*  27:420 */     paramciv.addVertexWithUV(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/*  28:421 */     paramciv.addVertexWithUV(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/*  29:422 */     paramciv.addVertexWithUV(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/*  30:    */   }
/*  31:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfy
 * JD-Core Version:    0.7.0.1
 */