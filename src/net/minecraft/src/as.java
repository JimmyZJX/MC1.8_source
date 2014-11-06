package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class as
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final BlockPosition a;
				private final int b;
				private final int c;
				private final int d;
				private final int e;
/*   6:    */   as(BlockPosition paramdt, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {a=paramdt;b=paramInt1;c=paramInt2;d=paramInt3;e=paramInt4;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:338 */     int i = (int)paramwv.c(this.a);
/*  11:339 */     return ((this.b < 0) || (i >= this.c)) && ((this.d < 0) || (i <= this.e));
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     as
 * JD-Core Version:    0.7.0.1
 */