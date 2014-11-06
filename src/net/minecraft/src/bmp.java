package net.minecraft.src;
/*  1:   */ import java.util.concurrent.Callable;
/*  2:   */ 
/*  3:   */ class bmp
/*  4:   */   implements Callable<String>
/*  5:   */ {
			  private final bmm a;
/*  6:   */   bmp(bmm parambmm) {a=parambmm;}
/*  7:   */   
/*  8:   */   public String call()
/*  9:   */   {
/* 10:75 */     return this.a.getClass().getCanonicalName();
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmp
 * JD-Core Version:    0.7.0.1
 */