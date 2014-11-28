package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class EnchantBookOfferGenerator
/*   4:    */   implements TradeOfferGenerator
/*   5:    */ {
/*   6:    */   public void generate(TradeOfferList paramaqd, Random paramRandom)
/*   7:    */   {
/*   8:868 */     Enchantment enchantment = Enchantment.list[paramRandom.nextInt(Enchantment.list.length)];
/*   9:869 */     int level = MathUtils.nextInt(paramRandom, enchantment.getLowestLevel(), enchantment.getHighestLevel());
/*  10:870 */     ItemStack stack = ItemList.enchantedBook.addEnchantment(new WeightedRandomItemEnchantment(enchantment, level));
/*  11:871 */     int price = 2 + paramRandom.nextInt(5 + level * 10) + 3 * level;
/*  12:872 */     if (price > 64) {
/*  13:873 */       price = 64;
/*  14:    */     }
/*  15:876 */     paramaqd.add(new TradeOffer(new ItemStack(ItemList.book), new ItemStack(ItemList.emerald, price), stack));
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ags
 * JD-Core Version:    0.7.0.1
 */