package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class aqv
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final BlockPosition a;
				private final World b;
/*   6:    */   aqv(World paramaqu, BlockPosition paramdt) {a=paramdt;b=paramaqu;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:169 */     return j.a(this.a);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqv
 * JD-Core Version:    0.7.0.1
 */