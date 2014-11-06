package net.minecraft.src;
/*   1:    */ final class os
/*   2:    */   extends eg
/*   3:    */ {
/*   4:    */   public ItemStack b(dz paramdz, ItemStack paramamj)
/*   5:    */   {
/*   6:109 */     EnumDirection localej = ave.b(paramdz.f());
/*   7:    */     
/*   8:    */ 
/*   9:112 */     double d1 = paramdz.a() + localej.g();
/*  10:113 */     double d2 = paramdz.d().getY() + 0.2F;
/*  11:114 */     double d3 = paramdz.c() + localej.i();
/*  12:    */     
/*  13:116 */     Entity localwv = anl.a(paramdz.i(), paramamj.i(), d1, d2, d3);
/*  14:118 */     if (((localwv instanceof EntityLiving)) && (paramamj.s())) {
/*  15:119 */       ((EntityMob)localwv).a(paramamj.q());
/*  16:    */     }
/*  17:122 */     paramamj.split(1);
/*  18:123 */     return paramamj;
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     os
 * JD-Core Version:    0.7.0.1
 */