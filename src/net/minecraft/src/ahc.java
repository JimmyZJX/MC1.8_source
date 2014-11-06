package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class ahc
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final ItemStack a;
				private final ahb b;
/*   6:    */   ahc(ahb paramahb, ItemStack paramamj) {a=paramamj;b=paramahb;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:333 */     return this.a.q();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahc
 * JD-Core Version:    0.7.0.1
 */