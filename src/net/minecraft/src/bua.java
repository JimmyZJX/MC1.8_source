package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class bua
/*   4:    */   implements Predicate<bsa>
/*   5:    */ {
/*   6:    */   bua(btz parambtz) {}
/*   7:    */   
/*   8:    */   public boolean apply(bsa parambsa)
/*   9:    */   {
/*  10:473 */     return (parambsa.e() != null) && (!parambsa.e().startsWith("#"));
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bua
 * JD-Core Version:    0.7.0.1
 */