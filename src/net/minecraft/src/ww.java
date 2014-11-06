package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class ww
/*    4:     */   implements Callable<String>
/*    5:     */ {
				  private final Entity a;
/*    6:     */   ww(Entity paramwv) {a=paramwv;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:1785 */     return EntityList.b(this.a) + " (" + this.a.getClass().getCanonicalName() + ")";
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ww
 * JD-Core Version:    0.7.0.1
 */