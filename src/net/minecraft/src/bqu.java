package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bqu
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final WorldInfo a;
/*   6:    */   bqu(WorldInfo parambqo) {a=parambqo;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:611 */     return String.valueOf(WorldInfo.i(this.a));
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqu
 * JD-Core Version:    0.7.0.1
 */