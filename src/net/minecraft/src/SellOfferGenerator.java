package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class SellOfferGenerator
/*   4:    */   implements TradeOfferGenerator
/*   5:    */ {
/*   6:    */   public ItemStack item;
/*   7:    */   public IntervalRandomVarible priceRange;
/*   8:    */   
/*   9:    */   public SellOfferGenerator(Item item, IntervalRandomVarible paramagx)
/*  10:    */   {
/*  11:807 */     this.item = new ItemStack(item);
/*  12:808 */     this.priceRange = paramagx;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public SellOfferGenerator(ItemStack paramamj, IntervalRandomVarible paramagx)
/*  16:    */   {
/*  17:812 */     this.item = paramamj;
/*  18:813 */     this.priceRange = paramagx;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void generate(TradeOfferList paramaqd, Random paramRandom)
/*  22:    */   {
/*  23:818 */     int price = 1;
/*  24:819 */     if (this.priceRange != null) {
/*  25:820 */       price = this.priceRange.draw(paramRandom);
/*  26:    */     }
/*  27:    */     ItemStack buy;
/*  28:    */     ItemStack sell;
/*  29:825 */     if (price < 0)
/*  30:    */     {
/*  31:826 */       buy = new ItemStack(ItemList.emerald, 1, 0);
/*  32:827 */       sell = new ItemStack(this.item.getItem(), -price, this.item.getDamage2());
/*  33:    */     }
/*  34:    */     else
/*  35:    */     {
/*  36:829 */       buy = new ItemStack(ItemList.emerald, price, 0);
/*  37:830 */       sell = new ItemStack(this.item.getItem(), 1, this.item.getDamage2());
/*  38:    */     }
/*  39:832 */     paramaqd.add(new TradeOffer(buy, sell));
/*  40:    */   }
/*  41:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agv
 * JD-Core Version:    0.7.0.1
 */