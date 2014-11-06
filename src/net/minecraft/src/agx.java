package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agx
/*   4:    */   extends vi
/*   5:    */ {
/*   6:    */   public agx(int paramInt1, int paramInt2)
/*   7:    */   {
/*   8:766 */     super(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
/*   9:    */   }
/*  10:    */   
/*  11:    */   public int a(Random paramRandom)
/*  12:    */   {
/*  13:770 */     if (((Integer)a()).intValue() >= ((Integer)b()).intValue()) {
/*  14:771 */       return ((Integer)a()).intValue();
/*  15:    */     }
/*  16:773 */     return ((Integer)a()).intValue() + paramRandom.nextInt(((Integer)b()).intValue() - ((Integer)a()).intValue() + 1);
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agx
 * JD-Core Version:    0.7.0.1
 */