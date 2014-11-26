package net.minecraft.src;
/*   1:    */ final class of
/*   2:    */   extends eg
/*   3:    */ {
/*   4:217 */   private final eg b = new eg();
/*   5:    */   
/*   6:    */   public ItemStack b(dz paramdz, ItemStack paramamj)
/*   7:    */   {
/*   8:221 */     akb localakb = (akb)paramamj.getItem();
/*   9:222 */     BlockPosition localdt = paramdz.d().offset(ave.b(paramdz.f()));
/*  10:224 */     if (localakb.a(paramdz.i(), localdt))
/*  11:    */     {
/*  12:225 */       paramamj.a(ItemList.aw);
/*  13:226 */       paramamj.stackSize = 1;
/*  14:    */       
/*  15:228 */       return paramamj;
/*  16:    */     }
/*  17:231 */     return this.b.a(paramdz, paramamj);
/*  18:    */   }
/*  19:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     of
 * JD-Core Version:    0.7.0.1
 */