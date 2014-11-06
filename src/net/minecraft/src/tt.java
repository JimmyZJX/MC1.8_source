package net.minecraft.src;
/*   2:    */ 
/*   3:    */ final class tt
/*   4:    */   implements tv
/*   5:    */ {
/*   6:    */   public String a(int paramInt)
/*   7:    */   {
/*   8: 92 */     double d1 = paramInt / 100.0D;
/*   9: 93 */     double d2 = d1 / 1000.0D;
/*  10: 95 */     if (d2 > 0.5D) {
/*  11: 96 */       return tq.n().format(d2) + " km";
/*  12:    */     }
/*  13: 98 */     if (d1 > 0.5D) {
/*  14: 99 */       return tq.n().format(d1) + " m";
/*  15:    */     }
/*  16:101 */     return paramInt + " cm";
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     tt
 * JD-Core Version:    0.7.0.1
 */