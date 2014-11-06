package net.minecraft.src;
/*  1:   */ import io.netty.channel.Channel;
/*  3:   */ import io.netty.channel.ChannelException;
/*  4:   */ import io.netty.channel.ChannelInitializer;
/*  5:   */ import io.netty.channel.ChannelOption;
/*  7:   */ import io.netty.handler.timeout.ReadTimeoutHandler;
/*  9:   */ 
/* 10:   */ class rf
/* 11:   */   extends ChannelInitializer<Channel>
/* 12:   */ {
			  private final rc a;
/* 13:   */   rf(rc paramrc) {a=paramrc;}
/* 14:   */   
/* 15:   */   protected void initChannel(Channel paramChannel)
/* 16:   */   {
/* 17:   */     try
/* 18:   */     {
/* 19:68 */       paramChannel.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
/* 20:   */     }
/* 21:   */     catch (ChannelException localChannelException1) {}
/* 22:   */     try
/* 23:   */     {
/* 24:73 */       paramChannel.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(false));
/* 25:   */     }
/* 26:   */     catch (ChannelException localChannelException2) {}
/* 27:77 */     paramChannel.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("legacy_query", new ra(this.a)).addLast("splitter", new hh()).addLast("decoder", new he(ie.a)).addLast("prepender", new hi()).addLast("encoder", new hf(ie.b));
/* 28:   */     
/* 29:   */ 
/* 30:   */ 
/* 31:   */ 
/* 32:   */ 
/* 33:   */ 
/* 34:   */ 
/* 35:   */ 
/* 36:   */ 
/* 37:87 */     gr localgr = new gr(ie.a);
/* 38:88 */     rc.a(this.a).add(localgr);
/* 39:89 */     paramChannel.pipeline().addLast("packet_handler", localgr);
/* 40:90 */     localgr.a(new ro(rc.b(this.a), localgr));
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rf
 * JD-Core Version:    0.7.0.1
 */