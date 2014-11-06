package net.minecraft.src;
/*   1:    */ import com.google.common.base.Function;
/*   2:    */ 
/*   3:    */ final class ame
/*   4:    */   implements Function<ItemStack,String>
/*   5:    */ {
/*   6:    */   public String apply(ItemStack paramamj)
/*   7:    */   {
/*   8:445 */     return EnumWoodVariant.fromIndex(paramamj.i()).c();
/*   9:    */   }
/*  10:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ame
 * JD-Core Version:    0.7.0.1
 */