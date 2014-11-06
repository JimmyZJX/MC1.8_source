package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class aqg
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final aqf a;
/*   6:    */   aqg(aqf paramaqf) {a=paramaqf;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:105 */     return this.a.l();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqg
 * JD-Core Version:    0.7.0.1
 */