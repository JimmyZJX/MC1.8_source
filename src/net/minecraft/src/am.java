package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class am
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
/*   6:    */   public boolean apply(Entity paramwv)
/*   7:    */   {
/*   8:188 */     return paramwv instanceof EntityPlayer;
/*   9:    */   }
/*  10:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     am
 * JD-Core Version:    0.7.0.1
 */