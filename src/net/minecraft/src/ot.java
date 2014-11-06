package net.minecraft.src;
/*   1:    */ final class ot
/*   2:    */   extends eg
/*   3:    */ {
/*   4:    */   public ItemStack b(dz paramdz, ItemStack paramamj)
/*   5:    */   {
/*   6:130 */     EnumDirection localej = ave.b(paramdz.f());
/*   7:    */     
/*   8:132 */     double d1 = paramdz.a() + localej.g();
/*   9:133 */     double d2 = paramdz.d().getY() + 0.2F;
/*  10:134 */     double d3 = paramdz.c() + localej.i();
/*  11:    */     
/*  12:136 */     ahm localahm = new ahm(paramdz.i(), d1, d2, d3, paramamj);
/*  13:137 */     paramdz.i().spawnEntity(localahm);
/*  14:    */     
/*  15:139 */     paramamj.split(1);
/*  16:140 */     return paramamj;
/*  17:    */   }
/*  18:    */   
/*  19:    */   protected void a(dz paramdz)
/*  20:    */   {
/*  21:145 */     paramdz.i().playLevelEvent(1002, paramdz.d(), 0);
/*  22:    */   }
/*  23:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ot
 * JD-Core Version:    0.7.0.1
 */