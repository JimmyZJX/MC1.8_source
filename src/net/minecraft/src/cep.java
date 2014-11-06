package net.minecraft.src;
/*   2:    */ import java.util.concurrent.Callable;
/*   3:    */ 
/*   4:    */ class cep
/*   5:    */   implements Callable<String>
/*   6:    */ {
				private final cen a;
/*   7:    */   cep(cen paramcen) {a=paramcen;}
/*   8:    */   
/*   9:    */   public String call()
/*  10:    */   {
/*  11:320 */     return cen.b(this.a).size() + " total; " + cen.b(this.a).toString();
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cep
 * JD-Core Version:    0.7.0.1
 */