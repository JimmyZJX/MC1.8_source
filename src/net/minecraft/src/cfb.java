package net.minecraft.src;
/*   1:    */ import io.netty.channel.Channel;
/*   3:    */ import io.netty.channel.ChannelException;
/*   4:    */ import io.netty.channel.ChannelHandler;
/*   5:    */ import io.netty.channel.ChannelInitializer;
/*   6:    */ import io.netty.channel.ChannelOption;
/*   8:    */ 
/*   9:    */ class cfb
/*  10:    */   extends ChannelInitializer<Channel>
/*  11:    */ {
				final cev a;
				final cew b;
				final cez c;
/*  12:    */   cfb(cez paramcez, cev paramcev, cew paramcew) {a=paramcev;b=paramcew;c=paramcez;}
/*  13:    */   
/*  14:    */   protected void initChannel(Channel paramChannel)
/*  15:    */   {
/*  16:    */     try
/*  17:    */     {
/*  18:154 */       paramChannel.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
/*  19:    */     }
/*  20:    */     catch (ChannelException localChannelException1) {}
/*  21:    */     try
/*  22:    */     {
/*  23:159 */       paramChannel.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(false));
/*  24:    */     }
/*  25:    */     catch (ChannelException localChannelException2) {}
/*  26:163 */     paramChannel.pipeline().addLast(new ChannelHandler[] { new cfc(this) });
/*  27:    */   }
/*  28:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfb
 * JD-Core Version:    0.7.0.1
 */