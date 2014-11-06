package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bqt
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final WorldInfo a;
/*   6:    */   bqt(WorldInfo parambqo) {a=parambqo;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:604 */     return String.format("%d game time, %d day time", new Object[] { Long.valueOf(WorldInfo.g(this.a)), Long.valueOf(WorldInfo.h(this.a)) });
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqt
 * JD-Core Version:    0.7.0.1
 */