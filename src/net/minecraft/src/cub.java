package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cub
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final cue a;
				private final cua b;
/*   6:    */   cub(cua paramcua, cue paramcue) {a=paramcue;b=paramcua;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:167 */     return this.a.i();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cub
 * JD-Core Version:    0.7.0.1
 */