package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class at
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final int a;
				private final int b;
/*   6:    */   at(int paramInt1, int paramInt2) {a=paramInt1;b=paramInt2;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:355 */     int i = ah.a((int)Math.floor(paramwv.yaw));
/*  11:356 */     if (this.a > this.b) {
/*  12:357 */       return (i >= this.a) || (i <= this.b);
/*  13:    */     }
/*  14:359 */     return (i >= this.a) && (i <= this.b);
/*  15:    */   }
/*  16:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     at
 * JD-Core Version:    0.7.0.1
 */