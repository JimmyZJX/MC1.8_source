package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class fp
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final int a;
				private final NBTTagCompound b;
/*   6:    */   fp(NBTTagCompound paramfn, int paramInt) {a=paramInt;b=paramfn;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:326 */     return NBTBase.a[this.a];
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fp
 * JD-Core Version:    0.7.0.1
 */