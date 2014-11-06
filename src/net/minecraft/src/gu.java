package net.minecraft.src;
/*   1:    */ import io.netty.channel.Channel;
/*   2:    */ import io.netty.channel.ChannelFuture;
/*   3:    */ import io.netty.channel.ChannelFutureListener;
/*   4:    */ import io.netty.util.concurrent.GenericFutureListener;
/*   5:    */ 
/*   6:    */ class gu
/*   7:    */   implements Runnable
/*   8:    */ {
				private final gy a;
				private final gy b;
				private final id c;
				private final GenericFutureListener[] d;
				private final gr e;
/*   9:    */   gu(gr paramgr, gy paramgy1, gy paramgy2, id paramid, GenericFutureListener[] paramArrayOfGenericFutureListener) {a=paramgy1;b=paramgy2;c=paramid;d=paramArrayOfGenericFutureListener;e=paramgr;}
/*  10:    */   
/*  11:    */   public void run()
/*  12:    */   {
/*  13:158 */     if (this.a != this.b) {
/*  14:159 */       this.e.a(this.a);
/*  15:    */     }
/*  16:161 */     ChannelFuture localChannelFuture = gr.a(this.e).writeAndFlush(this.c);
/*  17:162 */     if (this.d != null) {
/*  18:163 */       localChannelFuture.addListeners(this.d);
/*  19:    */     }
/*  20:165 */     localChannelFuture.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gu
 * JD-Core Version:    0.7.0.1
 */