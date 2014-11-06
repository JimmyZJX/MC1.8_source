package net.minecraft.src;
/*   1:    */ import com.google.common.base.Function;
/*   2:    */ 
/*   3:    */ final class alw
/*   4:    */   implements Function<ItemStack,String>
/*   5:    */ {
/*   6:    */   public String apply(ItemStack paramamj)
/*   7:    */   {
/*   8:598 */     return EnumCobblestoneVariant.a(paramamj.i()).c();
/*   9:    */   }
/*  10:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alw
 * JD-Core Version:    0.7.0.1
 */