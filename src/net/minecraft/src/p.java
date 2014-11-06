package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ final class p
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final Block a;
/*   6:    */   p(Block parambec) {a=parambec;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:225 */     return this.a.toString();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     p
 * JD-Core Version:    0.7.0.1
 */