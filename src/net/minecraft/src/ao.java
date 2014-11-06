package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class ao
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final int a;
/*   6:    */   ao(int paramInt) {a=paramInt;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:224 */     if (!(paramwv instanceof qw)) {
/*  11:225 */       return false;
/*  12:    */     }
/*  13:228 */     qw localqw = (qw)paramwv;
/*  14:229 */     return localqw.c.b().a() == this.a;
/*  15:    */   }
/*  16:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ao
 * JD-Core Version:    0.7.0.1
 */