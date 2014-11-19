package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class aqy
/*    4:     */   implements Callable<String>
/*    5:     */ {
				  private final World a;
/*    6:     */   aqy(World paramaqu) {a=paramaqu;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:2788 */     return this.a.v.getName();
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqy
 * JD-Core Version:    0.7.0.1
 */