package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class btf
/*    4:     */   implements Callable<String>
/*    5:     */ {
	  			  private final bsu a;
/*    6:     */   btf(bsu parambsu) {a=parambsu;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:1480 */     return this.a.m.getClass().getCanonicalName();
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btf
 * JD-Core Version:    0.7.0.1
 */