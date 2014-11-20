package net.minecraft.src;
/*   1:    */ class aih
/*   2:    */   extends ajk
/*   3:    */ {
/*   4:    */   public aih(aig paramaig, vq paramvq, int paramInt1, int paramInt2, int paramInt3)
/*   5:    */   {
/*   6:105 */     super(paramvq, paramInt1, paramInt2, paramInt3);
/*   7:    */   }
/*   8:    */   
/*   9:    */   public boolean a(ItemStack paramamj)
/*  10:    */   {
/*  11:110 */     if (paramamj != null) {
/*  12:111 */       return (paramamj.getItem() == ItemList.emerald) || (paramamj.getItem() == ItemList.diamond) || (paramamj.getItem() == ItemList.k) || (paramamj.getItem() == ItemList.j);
/*  13:    */     }
/*  14:113 */     return false;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public int a()
/*  18:    */   {
/*  19:118 */     return 1;
/*  20:    */   }
/*  21:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aih
 * JD-Core Version:    0.7.0.1
 */