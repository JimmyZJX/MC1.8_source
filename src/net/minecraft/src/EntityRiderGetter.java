package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class EntityRiderGetter
/*    4:     */   implements Callable<String>
/*    5:     */ {
				  private final Entity a;
/*    6:     */   EntityRiderGetter(Entity paramwv) {a=paramwv;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:1801 */     return this.a.rider.toString();
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wy
 * JD-Core Version:    0.7.0.1
 */