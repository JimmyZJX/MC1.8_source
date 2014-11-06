package net.minecraft.src;
/*  1:   */ import io.netty.channel.ChannelFuture;
/*  2:   */ import io.netty.channel.ChannelFutureListener;
/*  4:   */ 
/*  5:   */ class rr
/*  6:   */   implements ChannelFutureListener
/*  7:   */ {
			  private final rq a;
/*  8:   */   rr(rq paramrq) {a=paramrq;}
/*  9:   */   
/* 10:   */   public void operationComplete(ChannelFuture paramChannelFuture)
/* 11:   */   {
/* 12:91 */     this.a.a.a(rq.a(this.a).aI());
/* 13:   */   }
/* 14:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rr
 * JD-Core Version:    0.7.0.1
 */