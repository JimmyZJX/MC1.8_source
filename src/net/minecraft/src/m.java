package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ final class m
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final BlockPosition a;
/*   6:    */   m(BlockPosition paramdt) {a=paramdt;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:193 */     return j.a(this.a);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     m
 * JD-Core Version:    0.7.0.1
 */