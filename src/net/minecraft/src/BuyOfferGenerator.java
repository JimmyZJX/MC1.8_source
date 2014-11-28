package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class BuyOfferGenerator
/*   4:    */   implements TradeOfferGenerator
/*   5:    */ {
/*   6:    */   public Item buy;
/*   7:    */   public IntervalRandomVarible numRange;
/*   8:    */   
/*   9:    */   public BuyOfferGenerator(Item paramalq, IntervalRandomVarible paramagx)
/*  10:    */   {
/*  11:787 */     this.buy = paramalq;
/*  12:788 */     this.numRange = paramagx;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void generate(TradeOfferList paramaqd, Random paramRandom)
/*  16:    */   {
/*  17:793 */     int num = 1;
/*  18:794 */     if (this.numRange != null) {
/*  19:795 */       num = this.numRange.draw(paramRandom);
/*  20:    */     }
/*  21:798 */     paramaqd.add(new TradeOffer(new ItemStack(this.buy, num, 0), ItemList.emerald));
/*  22:    */   }
/*  23:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agr
 * JD-Core Version:    0.7.0.1
 */