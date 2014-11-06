package net.minecraft.src;
/*  1:   */ import java.util.concurrent.Callable;
/*  2:   */ 
/*  3:   */ class bmo
/*  4:   */   implements Callable<String>
/*  5:   */ {
			  private final int a;
			  private final int b;
			  private final bmm c;
/*  6:   */   bmo(bmm parambmm, int paramInt1, int paramInt2) {a=paramInt1;b=paramInt2;c=parambmm;}
/*  7:   */   
/*  8:   */   public String call()
/*  9:   */   {
/* 10:68 */     return String.valueOf(ChunkID.toLong(this.a, this.b));
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmo
 * JD-Core Version:    0.7.0.1
 */