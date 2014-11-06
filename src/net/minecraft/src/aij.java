package net.minecraft.src;
/*   1:    */ class aij
/*   2:    */   extends ajk
/*   3:    */ {
/*   4:    */   public aij(aii paramaii, vq paramvq, int paramInt1, int paramInt2, int paramInt3)
/*   5:    */   {
/*   6:157 */     super(paramvq, paramInt1, paramInt2, paramInt3);
/*   7:    */   }
/*   8:    */   
/*   9:    */   public boolean a(ItemStack paramamj)
/*  10:    */   {
/*  11:162 */     if (paramamj != null) {
/*  12:164 */       return paramamj.getItem().l(paramamj);
/*  13:    */     }
/*  14:169 */     return false;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public int a()
/*  18:    */   {
/*  19:174 */     return 64;
/*  20:    */   }
/*  21:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aij
 * JD-Core Version:    0.7.0.1
 */