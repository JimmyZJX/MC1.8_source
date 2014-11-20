package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agr
/*   4:    */   implements agw
/*   5:    */ {
/*   6:    */   public Item a;
/*   7:    */   public agx b;
/*   8:    */   
/*   9:    */   public agr(Item paramalq, agx paramagx)
/*  10:    */   {
/*  11:787 */     this.a = paramalq;
/*  12:788 */     this.b = paramagx;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void a(aqd paramaqd, Random paramRandom)
/*  16:    */   {
/*  17:793 */     int i = 1;
/*  18:794 */     if (this.b != null) {
/*  19:795 */       i = this.b.a(paramRandom);
/*  20:    */     }
/*  21:798 */     paramaqd.add(new TradeOffer(new ItemStack(this.a, i, 0), ItemList.emerald));
/*  22:    */   }
/*  23:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agr
 * JD-Core Version:    0.7.0.1
 */