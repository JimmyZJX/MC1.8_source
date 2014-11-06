package net.minecraft.src;
/*  1:   */ import java.util.concurrent.Callable;
/*  2:   */ 
/*  3:   */ class g
/*  4:   */   implements Callable<String>
/*  5:   */ {
/*  6:   */   g(b paramb) {}
/*  7:   */   
/*  8:   */   public String call()
/*  9:   */   {
/* 10:70 */     Runtime localRuntime = Runtime.getRuntime();
/* 11:71 */     long l1 = localRuntime.maxMemory();
/* 12:72 */     long l2 = localRuntime.totalMemory();
/* 13:73 */     long l3 = localRuntime.freeMemory();
/* 14:74 */     long l4 = l1 / 1024L / 1024L;
/* 15:75 */     long l5 = l2 / 1024L / 1024L;
/* 16:76 */     long l6 = l3 / 1024L / 1024L;
/* 17:   */     
/* 18:78 */     return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l1 + " bytes (" + l4 + " MB)";
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     g
 * JD-Core Version:    0.7.0.1
 */