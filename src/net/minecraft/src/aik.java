package net.minecraft.src;
/*   1:    */ class aik
/*   2:    */   extends ajk
/*   3:    */ {
/*   4:    */   private EntityPlayer a;
/*   5:    */   
/*   6:    */   public aik(EntityPlayer paramahd, vq paramvq, int paramInt1, int paramInt2, int paramInt3)
/*   7:    */   {
/*   8:128 */     super(paramvq, paramInt1, paramInt2, paramInt3);
/*   9:129 */     this.a = paramahd;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public boolean a(ItemStack paramamj)
/*  13:    */   {
/*  14:134 */     return b_(paramamj);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public int a()
/*  18:    */   {
/*  19:139 */     return 1;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(EntityPlayer paramahd, ItemStack paramamj)
/*  23:    */   {
/*  24:144 */     if ((paramamj.getItem() == ItemList.bz) && (paramamj.i() > 0)) {
/*  25:145 */       this.a.b(AchievementList.B);
/*  26:    */     }
/*  27:147 */     super.a(paramahd, paramamj);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public static boolean b_(ItemStack paramamj)
/*  31:    */   {
/*  32:151 */     return (paramamj != null) && ((paramamj.getItem() == ItemList.bz) || (paramamj.getItem() == ItemList.bA));
/*  33:    */   }
/*  34:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aik
 * JD-Core Version:    0.7.0.1
 */