package net.minecraft.src;
/*  1:   */ import io.netty.util.concurrent.Future;
/*  2:   */ import io.netty.util.concurrent.GenericFutureListener;
/*  3:   */ import javax.crypto.SecretKey;
/*  4:   */ 
/*  5:   */ class ced
/*  6:   */   implements GenericFutureListener
/*  7:   */ {
			  private final SecretKey a;
			  private final cec b;
/*  8:   */   ced(cec paramcec, SecretKey paramSecretKey) {a=paramSecretKey;b=paramcec;}
/*  9:   */   
/* 10:   */   public void operationComplete(Future paramFuture)
/* 11:   */   {
/* 12:62 */     cec.a(this.b).a(this.a);
/* 13:   */   }
/* 14:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ced
 * JD-Core Version:    0.7.0.1
 */