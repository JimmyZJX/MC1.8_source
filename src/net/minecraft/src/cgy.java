package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cgy
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final cgw a;
				private final cgx b;
/*   6:    */   cgy(cgx paramcgx, cgw paramcgw) {a=paramcgw;b=paramcgx;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:187 */     return this.a.toString();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgy
 * JD-Core Version:    0.7.0.1
 */