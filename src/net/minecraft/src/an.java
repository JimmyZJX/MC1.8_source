package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class an
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final int a;
				private final int b;
/*   6:    */   an(int paramInt1, int paramInt2) {a=paramInt1;b=paramInt2;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:204 */     if (!(paramwv instanceof qw)) {
/*  11:205 */       return false;
/*  12:    */     }
/*  13:208 */     qw localqw = (qw)paramwv;
/*  14:209 */     return ((this.a <= -1) || (localqw.bz >= this.a)) && ((this.b <= -1) || (localqw.bz <= this.b));
/*  15:    */   }
/*  16:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     an
 * JD-Core Version:    0.7.0.1
 */