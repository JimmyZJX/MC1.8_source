package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;

/*    2:     */ import org.lwjgl.Sys;
/*    3:     */ 
/*    4:     */ class bti
/*    5:     */   implements Callable<String>
/*    6:     */ {
/*    7:     */   bti(bsu parambsu) {}
/*    8:     */   
/*    9:     */   public String call()
/*   10:     */   {
/*   11:2184 */     return Sys.getVersion();
/*   12:     */   }
/*   13:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bti
 * JD-Core Version:    0.7.0.1
 */