package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agt
/*   4:    */   implements agw
/*   5:    */ {
/*   6:    */   public ItemStack a;
/*   7:    */   public agx b;
/*   8:    */   
/*   9:    */   public agt(Item paramalq, agx paramagx)
/*  10:    */   {
/*  11:841 */     this.a = new ItemStack(paramalq);
/*  12:842 */     this.b = paramagx;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void a(aqd paramaqd, Random paramRandom)
/*  16:    */   {
/*  17:847 */     int i = 1;
/*  18:848 */     if (this.b != null) {
/*  19:849 */       i = this.b.a(paramRandom);
/*  20:    */     }
/*  21:854 */     ItemStack localamj1 = new ItemStack(ItemList.bO, i, 0);
/*  22:855 */     ItemStack localamj2 = new ItemStack(this.a.getItem(), 1, this.a.i());
/*  23:856 */     localamj2 = aph.a(paramRandom, localamj2, 5 + paramRandom.nextInt(15));
/*  24:    */     
/*  25:858 */     paramaqd.add(new aqc(localamj1, localamj2));
/*  26:    */   }
/*  27:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agt
 * JD-Core Version:    0.7.0.1
 */