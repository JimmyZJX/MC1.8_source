package net.minecraft.src;
/*   1:    */ final class oq
/*   2:    */   implements eo
/*   3:    */ {
/*   4: 79 */   private final eg b = new eg();
/*   5:    */   
/*   6:    */   public ItemStack a(dz paramdz, ItemStack paramamj)
/*   7:    */   {
/*   8: 83 */     if (ItemPotion.f(paramamj.i())) {
/*   9: 84 */       return new or(this, paramamj).a(paramdz, paramamj);
/*  10:    */     }
/*  11:101 */     return this.b.a(paramdz, paramamj);
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     oq
 * JD-Core Version:    0.7.0.1
 */