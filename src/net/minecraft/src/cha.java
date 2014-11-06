package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cha
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final cgw a;
				private final cgx b;
/*   6:    */   cha(cgx paramcgx, cgw paramcgw) {a=paramcgw;b=paramcgx;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:270 */     return this.a.toString();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cha
 * JD-Core Version:    0.7.0.1
 */