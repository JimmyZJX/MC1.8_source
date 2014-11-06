package net.minecraft.src;
/*  1:   */ import java.util.concurrent.Callable;
/*  2:   */ 
/*  3:   */ class e
/*  4:   */   implements Callable<String>
/*  5:   */ {
/*  6:   */   e(b paramb) {}
/*  7:   */   
/*  8:   */   public String call()
/*  9:   */   {
/* 10:56 */     return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     e
 * JD-Core Version:    0.7.0.1
 */