package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cqk
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final ItemStack a;
				private final cqh b;
/*   6:    */   cqk(cqh paramcqh, ItemStack paramamj) {a=paramamj;b=paramcqh;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:386 */     return String.valueOf(this.a.i());
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqk
 * JD-Core Version:    0.7.0.1
 */