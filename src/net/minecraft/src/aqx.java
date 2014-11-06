package net.minecraft.src;
/*    2:     */ import java.util.concurrent.Callable;
/*    3:     */ 
/*    4:     */ class aqx
/*    5:     */   implements Callable<String>
/*    6:     */ {
				  private final World a;
/*    7:     */   aqx(World paramaqu) {a=paramaqu;}
/*    8:     */   
/*    9:     */   public String call()
/*   10:     */   {
/*   11:2781 */     return this.a.playerList.size() + " total; " + this.a.playerList.toString();
/*   12:     */   }
/*   13:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqx
 * JD-Core Version:    0.7.0.1
 */