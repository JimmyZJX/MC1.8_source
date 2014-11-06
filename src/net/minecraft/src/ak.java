package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class ak
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final AABB a;
/*   6:    */   ak(AABB parambrt) {a=parambrt;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:407 */     if ((paramwv.xPos < this.a.minX) || (paramwv.yPos < this.a.minY) || (paramwv.zPos < this.a.minZ)) {
/*  11:408 */       return false;
/*  12:    */     }
/*  13:410 */     if ((paramwv.xPos >= this.a.maxX) || (paramwv.yPos >= this.a.maxY) || (paramwv.zPos >= this.a.maxZ)) {
/*  14:411 */       return false;
/*  15:    */     }
/*  16:413 */     return true;
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ak
 * JD-Core Version:    0.7.0.1
 */