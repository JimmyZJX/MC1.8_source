package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cud
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final cue a;
				private final cua b;
/*   6:    */   cud(cua paramcua, cue paramcue) {a=paramcue;b=paramcua;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:181 */     return this.a.k() + " frames";
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cud
 * JD-Core Version:    0.7.0.1
 */