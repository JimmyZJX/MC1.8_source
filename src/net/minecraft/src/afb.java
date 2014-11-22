package net.minecraft.src;
/*   1:    */ class afb
/*   2:    */   extends GoalType
/*   3:    */ {
/*   4:    */   private EntityGhast a;
/*   5:    */   
/*   6:    */   public afb(EntityGhast paramafa)
/*   7:    */   {
/*   8:265 */     this.a = paramafa;
/*   9:    */     
/*  10:267 */     a(2);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean canStart()
/*  14:    */   {
/*  15:272 */     return true;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void tick()
/*  19:    */   {
/*  20:277 */     if (this.a.u() == null)
/*  21:    */     {
/*  22:278 */       this.a.aG = (this.a.yaw = -(float)Math.atan2(this.a.xVelocity, this.a.zVelocity) * 180.0F / 3.141593F);
/*  23:    */     }
/*  24:    */     else
/*  25:    */     {
/*  26:280 */       EntityLiving localxm = this.a.u();
/*  27:    */       
/*  28:282 */       double d1 = 64.0D;
/*  29:283 */       if (localxm.h(this.a) < d1 * d1)
/*  30:    */       {
/*  31:284 */         double d2 = localxm.xPos - this.a.xPos;
/*  32:285 */         double d3 = localxm.zPos - this.a.zPos;
/*  33:286 */         this.a.aG = (this.a.yaw = -(float)Math.atan2(d2, d3) * 180.0F / 3.141593F);
/*  34:    */       }
/*  35:    */     }
/*  36:    */   }
/*  37:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afb
 * JD-Core Version:    0.7.0.1
 */