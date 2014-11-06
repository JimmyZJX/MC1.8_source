package net.minecraft.src;
/*   1:    */ import io.netty.channel.Channel;
/*   2:    */ import io.netty.channel.ChannelConfig;
/*   3:    */ import io.netty.channel.ChannelException;
/*   4:    */ import io.netty.channel.ChannelInitializer;
/*   5:    */ import io.netty.channel.ChannelOption;
/*   6:    */ import io.netty.channel.ChannelPipeline;
/*   7:    */ import io.netty.handler.timeout.ReadTimeoutHandler;
/*   8:    */ 
/*   9:    */ final class gv
/*  10:    */   extends ChannelInitializer
/*  11:    */ {
				private final gr a;
/*  12:    */   gv(gr paramgr) {a=paramgr;}
/*  13:    */   
/*  14:    */   protected void initChannel(Channel paramChannel)
/*  15:    */   {
/*  16:    */     try
/*  17:    */     {
/*  18:224 */       paramChannel.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
/*  19:    */     }
/*  20:    */     catch (ChannelException localChannelException1) {}
/*  21:    */     try
/*  22:    */     {
/*  23:229 */       paramChannel.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(false));
/*  24:    */     }
/*  25:    */     catch (ChannelException localChannelException2) {}
/*  26:233 */     paramChannel.pipeline().addLast("timeout", new ReadTimeoutHandler(20)).addLast("splitter", new hh()).addLast("decoder", new he(ie.b)).addLast("prepender", new hi()).addLast("encoder", new hf(ie.a)).addLast("packet_handler", this.a);
/*  27:    */   }
/*  28:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gv
 * JD-Core Version:    0.7.0.1
 */