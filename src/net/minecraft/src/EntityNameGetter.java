package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class EntityNameGetter
/*    4:     */   implements Callable<String>
/*    5:     */ {
				  private final Entity a;
/*    6:     */   EntityNameGetter(Entity paramwv) {a=paramwv;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:1792 */     return this.a.getName();
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wx
 * JD-Core Version:    0.7.0.1
 */