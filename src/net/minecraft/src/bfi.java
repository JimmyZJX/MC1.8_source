package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bfi
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final int a;
				private final int b;
				private final int c;
				private final Chunk d;
/*   6:    */   bfi(Chunk parambfh, int paramInt1, int paramInt2, int paramInt3) {a=paramInt1;b=paramInt2;c=paramInt3;d=parambfh;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:393 */     return j.a(new BlockPosition(this.d.x * 16 + this.a, this.b, this.d.z * 16 + this.c));
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfi
 * JD-Core Version:    0.7.0.1
 */