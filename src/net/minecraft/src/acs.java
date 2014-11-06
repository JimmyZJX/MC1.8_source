package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class acs
/*   4:    */   implements Predicate<EntityLiving>
/*   5:    */ {
				private final Predicate<? super EntityLiving> a;
				private final EntityWalkingMob b;
				private final acr c;
/*   6:    */   acs(acr paramacr, Predicate<? super EntityLiving> paramPredicate, EntityWalkingMob paramxu) {a=paramPredicate;b=paramxu;c=paramacr;}
/*   7:    */   
/*   8:    */   public boolean apply(EntityLiving paramxm)
/*   9:    */   {
/*  10:244 */     if ((this.a != null) && (!this.a.apply(paramxm))) {
/*  11:245 */       return false;
/*  12:    */     }
/*  13:247 */     if ((paramxm instanceof EntityCreeper)) {
/*  14:248 */       return false;
/*  15:    */     }
/*  16:250 */     if ((paramxm instanceof EntityPlayer))
/*  17:    */     {
/*  18:251 */       double d = acr.a(this.c);
/*  19:253 */       if (paramxm.aw()) {
/*  20:254 */         d *= 0.800000011920929D;
/*  21:    */       }
/*  22:256 */       if (paramxm.ay())
/*  23:    */       {
/*  24:257 */         float f = ((EntityPlayer)paramxm).bX();
/*  25:258 */         if (f < 0.1F) {
/*  26:259 */           f = 0.1F;
/*  27:    */         }
/*  28:261 */         d *= 0.7F * f;
/*  29:    */       }
/*  30:263 */       if (paramxm.g(this.b) > d) {
/*  31:264 */         return false;
/*  32:    */       }
/*  33:    */     }
/*  34:267 */     return acr.a(this.c, paramxm, false);
/*  35:    */   }
/*  36:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     acs
 * JD-Core Version:    0.7.0.1
 */