package net.minecraft.src;
/*   1:    */ class afp
/*   2:    */   extends aaq
/*   3:    */ {
/*   4:    */   public afp(EntityZombiePigman paramafo)
/*   5:    */   {
/*   6:225 */     super(paramafo, EntityPlayer.class, true);
/*   7:    */   }
/*   8:    */   
/*   9:    */   public boolean canStart()
/*  10:    */   {
/*  11:230 */     return (((EntityZombiePigman)this.e).ck()) && (super.canStart());
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afp
 * JD-Core Version:    0.7.0.1
 */