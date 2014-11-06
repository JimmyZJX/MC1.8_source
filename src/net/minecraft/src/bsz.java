package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class bsz
/*    4:     */   implements Callable<String>
/*    5:     */ {
				  private final bsu a;
/*    6:     */   bsz(bsu parambsu) {a=parambsu;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:2240 */     return bsu.b(this.a).c().toString();
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsz
 * JD-Core Version:    0.7.0.1
 */