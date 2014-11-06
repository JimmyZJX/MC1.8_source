package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class rh
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final gr a;
				private final rc b;
/*   6:    */   rh(rc paramrc, gr paramgr) {a=paramgr;b=paramrc;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:160 */     return this.a.toString();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rh
 * JD-Core Version:    0.7.0.1
 */