package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ final class bpc
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final arm a;
/*   6:    */   bpc(arm paramarm) {a=paramarm;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:181 */     return String.valueOf(this.a);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpc
 * JD-Core Version:    0.7.0.1
 */