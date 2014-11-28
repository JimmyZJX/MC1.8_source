package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class EnchantOfferGenerator
/*   4:    */   implements TradeOfferGenerator
/*   5:    */ {
/*   6:    */   public ItemStack item;
/*   7:    */   public IntervalRandomVarible priceRange;
/*   8:    */   
/*   9:    */   public EnchantOfferGenerator(Item paramalq, IntervalRandomVarible paramagx)
/*  10:    */   {
/*  11:841 */     this.item = new ItemStack(paramalq);
/*  12:842 */     this.priceRange = paramagx;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void generate(TradeOfferList paramaqd, Random paramRandom)
/*  16:    */   {
/*  17:847 */     int price = 1;
/*  18:848 */     if (this.priceRange != null) {
/*  19:849 */       price = this.priceRange.draw(paramRandom);
/*  20:    */     }
/*  21:854 */     ItemStack buy = new ItemStack(ItemList.emerald, price, 0);
/*  22:855 */     ItemStack sell = new ItemStack(this.item.getItem(), 1, this.item.getDamage2());
/*  23:856 */     sell = aph.randomEnchant(paramRandom, sell, 5 + paramRandom.nextInt(15));
/*  24:    */     
/*  25:858 */     paramaqd.add(new TradeOffer(buy, sell));
/*  26:    */   }
/*  27:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agt
 * JD-Core Version:    0.7.0.1
 */