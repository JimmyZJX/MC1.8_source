package net.minecraft.src;
/*   1:    */ import com.google.common.base.Function;
/*   2:    */ 
/*   3:    */ final class alt
/*   4:    */   implements Function<ItemStack,String>
/*   5:    */ {
/*   6:    */   public String apply(ItemStack itemStack)
/*   7:    */   {
/*   8:495 */     return EnumFlowerVariant.a(awc.b, itemStack.i()).d();
/*   9:    */   }
/*  10:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alt
 * JD-Core Version:    0.7.0.1
 */