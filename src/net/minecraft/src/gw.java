package net.minecraft.src;
/*   1:    */ import io.netty.channel.Channel;
/*   2:    */ import io.netty.channel.ChannelInitializer;
/*   3:    */ import io.netty.channel.ChannelPipeline;
/*   4:    */ 
/*   5:    */ final class gw
/*   6:    */   extends ChannelInitializer
/*   7:    */ {
/*   8:    */   gw(gr paramgr) {}
/*   9:    */   
/*  10:    */   protected void initChannel(Channel paramChannel)
/*  11:    */   {
/*  12:260 */     paramChannel.pipeline().addLast("packet_handler", this.a);
/*  13:    */   }
/*  14:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gw
 * JD-Core Version:    0.7.0.1
 */