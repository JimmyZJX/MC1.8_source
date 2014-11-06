package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cuc
/*   4:    */   implements Callable<String>
/*   5:    */ {
/*   6:    */   cuc(cua paramcua, cue paramcue) {}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:174 */     return this.a.getMaxStackSize() + " x " + this.a.isStackable();
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuc
 * JD-Core Version:    0.7.0.1
 */