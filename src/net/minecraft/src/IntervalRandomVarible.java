package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class IntervalRandomVarible
/*   4:    */   extends Pair<Integer,Integer>
/*   5:    */ {
/*   6:    */   public IntervalRandomVarible(int paramInt1, int paramInt2)
/*   7:    */   {
/*   8:766 */     super(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
/*   9:    */   }
/*  10:    */   
/*  11:    */   public int draw(Random paramRandom)
/*  12:    */   {
/*  13:770 */     if (a().intValue() >= b().intValue()) {
/*  14:771 */       return a().intValue();
/*  15:    */     }
/*  16:773 */     return a().intValue() + paramRandom.nextInt(b().intValue() - a().intValue() + 1);
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agx
 * JD-Core Version:    0.7.0.1
 */