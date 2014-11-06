package net.minecraft.src;
/*  1:   */ import java.util.concurrent.Callable;
/*  2:   */ 
/*  3:   */ class d
/*  4:   */   implements Callable<String>
/*  5:   */ {
/*  6:   */   d(b paramb) {}
/*  7:   */   
/*  8:   */   public String call()
/*  9:   */   {
/* 10:49 */     return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     d
 * JD-Core Version:    0.7.0.1
 */