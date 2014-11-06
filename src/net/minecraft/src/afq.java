package net.minecraft.src;
/*   1:    */ class afq
/*   2:    */   extends aal
/*   3:    */ {
/*   4:    */   public afq(EntityZombiePigman paramafo)
/*   5:    */   {
/*   6:210 */     super(paramafo, true, new Class[0]);
/*   7:    */   }
/*   8:    */   
/*   9:    */   protected void a(EntityWalkingMob paramxu, EntityLiving paramxm)
/*  10:    */   {
/*  11:215 */     super.a(paramxu, paramxm);
/*  12:217 */     if ((paramxu instanceof EntityZombiePigman)) {
/*  13:218 */       EntityZombiePigman.enrage((EntityZombiePigman)paramxu, paramxm);
/*  14:    */     }
/*  15:    */   }
/*  16:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afq
 * JD-Core Version:    0.7.0.1
 */