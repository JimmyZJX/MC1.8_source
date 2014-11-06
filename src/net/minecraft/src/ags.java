package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class ags
/*   4:    */   implements agw
/*   5:    */ {
/*   6:    */   public void a(aqd paramaqd, Random paramRandom)
/*   7:    */   {
/*   8:868 */     Enchantment localapf = Enchantment.b[paramRandom.nextInt(Enchantment.b.length)];
/*   9:869 */     int i = MathUtils.nextInt(paramRandom, localapf.e(), localapf.b());
/*  10:870 */     ItemStack localamj = ItemList.cd.a(new apo(localapf, i));
/*  11:871 */     int j = 2 + paramRandom.nextInt(5 + i * 10) + 3 * i;
/*  12:872 */     if (j > 64) {
/*  13:873 */       j = 64;
/*  14:    */     }
/*  15:876 */     paramaqd.add(new aqc(new ItemStack(ItemList.book), new ItemStack(ItemList.bO, j), localamj));
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ags
 * JD-Core Version:    0.7.0.1
 */