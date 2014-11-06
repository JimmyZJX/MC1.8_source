package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class acr
/*   4:    */   extends aaq
/*   5:    */ {
/*   6:    */   public acr(EntityWalkingMob paramxu, Class paramClass, int paramInt, boolean paramBoolean1, boolean paramBoolean2, Predicate<? super EntityLiving> paramPredicate)
/*   7:    */   {
/*   8:240 */     super(paramxu, paramClass, paramInt, paramBoolean1, paramBoolean2, paramPredicate);
/*   9:241 */     this.c = new acs(this, paramPredicate, paramxu);
/*  10:    */   }
				static double a(acr arg0) {return arg0.f();}
				static boolean a(acr arg0, EntityLiving arg1, boolean arg2) {return arg0.a(arg1,arg2);}
/*  11:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     acr
 * JD-Core Version:    0.7.0.1
 */