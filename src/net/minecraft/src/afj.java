package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class afj
/*   4:    */   implements Predicate<EntityLiving>
/*   5:    */ {
/*   6:    */   private EntityGuardian a;
/*   7:    */   
/*   8:    */   public afj(EntityGuardian paramafg)
/*   9:    */   {
/*  10:498 */     this.a = paramafg;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean apply(EntityLiving paramxm)
/*  14:    */   {
/*  15:503 */     return (((paramxm instanceof EntityPlayer)) || ((paramxm instanceof EntitySquid))) && (paramxm.h(this.a) > 9.0D);
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afj
 * JD-Core Version:    0.7.0.1
 */