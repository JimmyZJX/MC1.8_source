package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class aqh
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final aqf a;
/*   6:    */   aqh(aqf paramaqf) {a=paramaqf;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:112 */     return this.a.getName();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqh
 * JD-Core Version:    0.7.0.1
 */