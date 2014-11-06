package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class cko
/*    4:     */   implements Callable<String>
/*    5:     */ {
				  private final double a;
				  private final double b;
				  private final double c;
				  private final ckn d;
/*    6:     */   cko(ckn paramckn, double paramDouble1, double paramDouble2, double paramDouble3) {a=paramDouble1;b=paramDouble2;c=paramDouble3;d=paramckn;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:2133 */     return j.a(this.a, this.b, this.c);
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cko
 * JD-Core Version:    0.7.0.1
 */