package net.minecraft.src;
/*  1:   */ import java.util.concurrent.Callable;
/*  2:   */ 
/*  3:   */ class cuh
/*  4:   */   implements Callable<String>
/*  5:   */ {
			  private final cui a;
			  private final cug b;
/*  6:   */   cuh(cug paramcug, cui paramcui) {a=paramcui;b=paramcug;}
/*  7:   */   
/*  8:   */   public String call()
/*  9:   */   {
/* 10:71 */     return this.a.getClass().getName();
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuh
 * JD-Core Version:    0.7.0.1
 */