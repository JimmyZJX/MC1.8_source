package net.minecraft.src;
/*   1:    */ import com.google.common.base.Function;
/*   2:    */ 
/*   3:    */ final class alr
/*   4:    */   implements Function<ItemStack,String>
/*   5:    */ {
/*   6:    */   public String apply(ItemStack paramamj)
/*   7:    */   {
/*   8:403 */     return EnumStoneVariants.a(paramamj.getDamage2()).c();
/*   9:    */   }
/*  10:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alr
 * JD-Core Version:    0.7.0.1
 */