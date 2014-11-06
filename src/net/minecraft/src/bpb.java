package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ final class bpb
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final arm a;
/*   6:    */   bpb(arm paramarm) {a=paramarm;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:175 */     return String.valueOf(this.a);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpb
 * JD-Core Version:    0.7.0.1
 */