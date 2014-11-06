package net.minecraft.src;
/*   2:    */ import java.util.concurrent.Callable;
/*   3:    */ 
/*   4:    */ class bcn
/*   5:    */   implements Callable<String>
/*   6:    */ {
				private final bcm a;
/*   7:    */   bcn(bcm parambcm) {a=parambcm;}
/*   8:    */   
/*   9:    */   public String call()
/*  10:    */   {
/*  11:186 */     return (String)bcm.F().get(this.a.getClass()) + " // " + this.a.getClass().getCanonicalName();
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcn
 * JD-Core Version:    0.7.0.1
 */