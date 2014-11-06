package net.minecraft.src;
/*  1:   */ import java.util.concurrent.Callable;
/*  2:   */ 
/*  3:   */ class bmn
/*  4:   */   implements Callable<String>
/*  5:   */ {
	  		  private final int a;
	  		  private final int b;
	  		  private final bmm c;
/*  6:   */   bmn(bmm parambmm, int paramInt1, int paramInt2) {a=paramInt1;b=paramInt2;c=parambmm;}
/*  7:   */   
/*  8:   */   public String call()
/*  9:   */   {
/* 10:59 */     return this.c.a(this.a, this.b) ? "True" : "False";
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmn
 * JD-Core Version:    0.7.0.1
 */