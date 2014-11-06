package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bqw
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final WorldInfo a;
/*   6:    */   bqw(WorldInfo parambqo) {a=parambqo;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:639 */     return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[] { Integer.valueOf(WorldInfo.k(this.a)), Boolean.valueOf(WorldInfo.l(this.a)), Integer.valueOf(WorldInfo.m(this.a)), Boolean.valueOf(WorldInfo.n(this.a)) });
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqw
 * JD-Core Version:    0.7.0.1
 */