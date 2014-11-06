package net.minecraft.src;
/*   1:    */ import io.netty.util.concurrent.Future;
/*   2:    */ import io.netty.util.concurrent.GenericFutureListener;
/*   3:    */ 
/*   4:    */ class rk
/*   5:    */   implements GenericFutureListener
/*   6:    */ {
				private final hy a;
				private final rj b;
/*   7:    */   rk(rj paramrj, hy paramhy) {a=paramhy;b=paramrj;}
/*   8:    */   
/*   9:    */   public void operationComplete(Future paramFuture)
/*  10:    */   {
/*  11:125 */     this.b.a.a(this.a);
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rk
 * JD-Core Version:    0.7.0.1
 */