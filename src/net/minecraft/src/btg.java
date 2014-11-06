package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class btg
/*    4:     */   implements Callable<String>
/*    5:     */ {
	  			  private final bsu a;
/*    6:     */   btg(bsu parambsu) {a=parambsu;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:1495 */     return this.a.m.getClass().getCanonicalName();
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btg
 * JD-Core Version:    0.7.0.1
 */