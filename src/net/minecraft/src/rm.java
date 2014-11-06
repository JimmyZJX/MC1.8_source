package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class rm
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final id a;
				private final rj b;
/*   6:    */   rm(rj paramrj, id paramid) {a=paramid;b=paramrj;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:582 */     return this.a.getClass().getCanonicalName();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rm
 * JD-Core Version:    0.7.0.1
 */