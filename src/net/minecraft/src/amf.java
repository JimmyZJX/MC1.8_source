package net.minecraft.src;
/*   1:    */ import com.google.common.base.Function;
/*   2:    */ 
/*   3:    */ final class amf
/*   4:    */   implements Function<ItemStack,String>
/*   5:    */ {
/*   6:    */   public String apply(ItemStack paramamj)
/*   7:    */   {
/*   8:452 */     return EnumWoodVariant.fromIndex(paramamj.getDamage2() + 4).c();
/*   9:    */   }
/*  10:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amf
 * JD-Core Version:    0.7.0.1
 */