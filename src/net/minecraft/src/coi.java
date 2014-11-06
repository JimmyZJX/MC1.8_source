package net.minecraft.src;
/*   1:    */ import com.google.common.util.concurrent.ListenableFuture;
/*   2:    */ 
/*   3:    */ class coi
/*   4:    */   implements Runnable
/*   5:    */ {
				private final ListenableFuture a;
				private final coh b;
/*   6:    */   coi(coh paramcoh, ListenableFuture paramListenableFuture) {a=paramListenableFuture;b=paramcoh;}
/*   7:    */   
/*   8:    */   public void run()
/*   9:    */   {
/*  10:115 */     this.a.cancel(false);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     coi
 * JD-Core Version:    0.7.0.1
 */