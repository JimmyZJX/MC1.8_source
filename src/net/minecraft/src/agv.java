package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agv
/*   4:    */   implements agw
/*   5:    */ {
/*   6:    */   public ItemStack a;
/*   7:    */   public agx b;
/*   8:    */   
/*   9:    */   public agv(Item paramalq, agx paramagx)
/*  10:    */   {
/*  11:807 */     this.a = new ItemStack(paramalq);
/*  12:808 */     this.b = paramagx;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public agv(ItemStack paramamj, agx paramagx)
/*  16:    */   {
/*  17:812 */     this.a = paramamj;
/*  18:813 */     this.b = paramagx;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(aqd paramaqd, Random paramRandom)
/*  22:    */   {
/*  23:818 */     int i = 1;
/*  24:819 */     if (this.b != null) {
/*  25:820 */       i = this.b.a(paramRandom);
/*  26:    */     }
/*  27:    */     ItemStack localamj1;
/*  28:    */     ItemStack localamj2;
/*  29:825 */     if (i < 0)
/*  30:    */     {
/*  31:826 */       localamj1 = new ItemStack(ItemList.emerald, 1, 0);
/*  32:827 */       localamj2 = new ItemStack(this.a.getItem(), -i, this.a.getDamage2());
/*  33:    */     }
/*  34:    */     else
/*  35:    */     {
/*  36:829 */       localamj1 = new ItemStack(ItemList.emerald, i, 0);
/*  37:830 */       localamj2 = new ItemStack(this.a.getItem(), 1, this.a.getDamage2());
/*  38:    */     }
/*  39:832 */     paramaqd.add(new TradeOffer(localamj1, localamj2));
/*  40:    */   }
/*  41:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agv
 * JD-Core Version:    0.7.0.1
 */