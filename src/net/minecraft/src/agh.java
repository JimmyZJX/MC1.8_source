package net.minecraft.src;
/*   1:    */ class agh
/*   2:    */   extends aaq
/*   3:    */ {
/*   4:    */   public agh(EntitySpider paramage, Class paramClass)
/*   5:    */   {
/*   6:233 */     super(paramage, paramClass, true);
/*   7:    */   }
/*   8:    */   
/*   9:    */   public boolean canStart()
/*  10:    */   {
/*  11:238 */     float f = this.e.c(1.0F);
/*  12:239 */     if (f >= 0.5F) {
/*  13:240 */       return false;
/*  14:    */     }
/*  15:243 */     return super.canStart();
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agh
 * JD-Core Version:    0.7.0.1
 */