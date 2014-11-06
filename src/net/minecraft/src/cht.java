package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class cht
/*   4:    */   implements chc
/*   5:    */ {
/*   6:    */   public cgw a(int paramInt, World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/*   7:    */   {
/*   8: 98 */     cho localcho = new cho(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*   9: 99 */     ((cho)localcho).a(144);
/*  10:100 */     float f = paramaqu.rng.nextFloat() * 0.5F + 0.35F;
/*  11:101 */     localcho.b(1.0F * f, 0.0F * f, 1.0F * f);
/*  12:102 */     return localcho;
/*  13:    */   }
/*  14:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cht
 * JD-Core Version:    0.7.0.1
 */