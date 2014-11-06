package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class auq
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final EnumDirection a;
				private final BlockComparator b;
/*   6:    */   auq(BlockComparator paramaup, EnumDirection paramej) {a=paramej;b=paramaup;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:146 */     return (paramwv != null) && (paramwv.aO() == this.a);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     auq
 * JD-Core Version:    0.7.0.1
 */