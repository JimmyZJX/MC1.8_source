package net.minecraft.src;
/*  1:   */ import java.util.concurrent.Callable;
/*  2:   */ 
/*  3:   */ class f
/*  4:   */   implements Callable<String>
/*  5:   */ {
/*  6:   */   f(b paramb) {}
/*  7:   */   
/*  8:   */   public String call()
/*  9:   */   {
/* 10:63 */     return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     f
 * JD-Core Version:    0.7.0.1
 */