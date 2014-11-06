package net.minecraft.src;
/*   1:    */ import io.netty.util.concurrent.Future;
/*   2:    */ import io.netty.util.concurrent.GenericFutureListener;
/*   3:    */ 
/*   4:    */ class ri
/*   5:    */   implements GenericFutureListener
/*   6:    */ {
				private final gr a;
				private final hy b;
				private final rc c;
/*   7:    */   ri(rc paramrc, gr paramgr, hy paramhy) {a=paramgr;b=paramhy;c=paramrc;}
/*   8:    */   
/*   9:    */   public void operationComplete(Future paramFuture)
/*  10:    */   {
/*  11:171 */     this.a.a(this.b);
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ri
 * JD-Core Version:    0.7.0.1
 */