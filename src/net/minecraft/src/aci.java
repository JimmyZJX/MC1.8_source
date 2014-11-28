package net.minecraft.src;
/*   1:    */ class aci
/*   2:    */   extends MoveManager
/*   3:    */ {
/*   4:    */   private EntityRabbit g;
/*   5:    */   
/*   6:    */   public aci(EntityRabbit paramacb)
/*   7:    */   {
/*   8:475 */     super(paramacb);
/*   9:476 */     this.g = paramacb;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public void tick()
/*  13:    */   {
/*  14:481 */     if ((this.g.C) && (!this.g.cj())) {
/*  15:482 */       this.g.b(0.0D);
/*  16:    */     }
/*  17:484 */     super.tick();
/*  18:    */   }
/*  19:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aci
 * JD-Core Version:    0.7.0.1
 */