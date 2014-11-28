package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class ServiceOfferGenerator
/*   4:    */   implements TradeOfferGenerator
/*   5:    */ {
/*   6:    */   public ItemStack buy;
/*   7:    */   public IntervalRandomVarible buyNumRange;
/*   8:    */   public ItemStack sell;
/*   9:    */   public IntervalRandomVarible sellNumRange;
/*  10:    */   
/*  11:    */   public ServiceOfferGenerator(Item paramalq1, IntervalRandomVarible paramagx1, Item paramalq2, IntervalRandomVarible paramagx2)
/*  12:    */   {
/*  13:887 */     this.buy = new ItemStack(paramalq1);
/*  14:888 */     this.buyNumRange = paramagx1;
/*  15:889 */     this.sell = new ItemStack(paramalq2);
/*  16:890 */     this.sellNumRange = paramagx2;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void generate(TradeOfferList paramaqd, Random paramRandom)
/*  20:    */   {
/*  21:895 */     int buyNum = 1;
/*  22:896 */     if (this.buyNumRange != null) {
/*  23:897 */       buyNum = this.buyNumRange.draw(paramRandom);
/*  24:    */     }
/*  25:899 */     int sellNum = 1;
/*  26:900 */     if (this.sellNumRange != null) {
/*  27:901 */       sellNum = this.sellNumRange.draw(paramRandom);
/*  28:    */     }
/*  29:904 */     paramaqd.add(new TradeOffer(new ItemStack(this.buy.getItem(), buyNum, this.buy.getDamage2()), new ItemStack(ItemList.emerald), new ItemStack(this.sell.getItem(), sellNum, this.sell.getDamage2())));
/*  30:    */   }
/*  31:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agu
 * JD-Core Version:    0.7.0.1
 */