package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agu
/*   4:    */   implements agw
/*   5:    */ {
/*   6:    */   public ItemStack a;
/*   7:    */   public agx b;
/*   8:    */   public ItemStack c;
/*   9:    */   public agx d;
/*  10:    */   
/*  11:    */   public agu(Item paramalq1, agx paramagx1, Item paramalq2, agx paramagx2)
/*  12:    */   {
/*  13:887 */     this.a = new ItemStack(paramalq1);
/*  14:888 */     this.b = paramagx1;
/*  15:889 */     this.c = new ItemStack(paramalq2);
/*  16:890 */     this.d = paramagx2;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void a(aqd paramaqd, Random paramRandom)
/*  20:    */   {
/*  21:895 */     int i = 1;
/*  22:896 */     if (this.b != null) {
/*  23:897 */       i = this.b.a(paramRandom);
/*  24:    */     }
/*  25:899 */     int j = 1;
/*  26:900 */     if (this.d != null) {
/*  27:901 */       j = this.d.a(paramRandom);
/*  28:    */     }
/*  29:904 */     paramaqd.add(new aqc(new ItemStack(this.a.getItem(), i, this.a.i()), new ItemStack(ItemList.bO), new ItemStack(this.c.getItem(), j, this.c.i())));
/*  30:    */   }
/*  31:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agu
 * JD-Core Version:    0.7.0.1
 */