package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class agq
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
/*   6:    */   agq(EntityVillager paramagp) {}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:104 */     return paramwv instanceof EntityZombie;
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agq
 * JD-Core Version:    0.7.0.1
 */