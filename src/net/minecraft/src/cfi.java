package net.minecraft.src;
/*  1:   */ public class cfi
/*  2:   */   implements chc
/*  3:   */ {
/*  4:   */   public cgw a(int paramInt, World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/*  5:   */   {
/*  6:69 */     int i = paramVarArgs.length > 1 ? paramVarArgs[1] : 0;
/*  7:70 */     return new cfh(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, Item.b(paramVarArgs[0]), i);
/*  8:   */   }
/*  9:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfi
 * JD-Core Version:    0.7.0.1
 */