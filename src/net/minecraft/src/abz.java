package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class abz
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
/*   6:    */   abz(EntityOcelot paramaby) {}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:300 */     return paramwv instanceof EntityPlayer;
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abz
 * JD-Core Version:    0.7.0.1
 */