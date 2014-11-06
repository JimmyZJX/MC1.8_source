package net.minecraft.src;
/*   1:    */ import io.netty.channel.Channel;
/*   2:    */ import io.netty.channel.ChannelInitializer;
/*   5:    */ 
/*   6:    */ class rg
/*   7:    */   extends ChannelInitializer<Channel>
/*   8:    */ {
				private final rc a;
/*   9:    */   rg(rc paramrc) {a=paramrc;}
/*  10:    */   
/*  11:    */   protected void initChannel(Channel paramChannel)
/*  12:    */   {
/*  13:109 */     gr localgr = new gr(ie.a);
/*  14:110 */     localgr.a(new rb(rc.b(this.a), localgr));
/*  15:111 */     rc.a(this.a).add(localgr);
/*  16:112 */     paramChannel.pipeline().addLast("packet_handler", localgr);
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rg
 * JD-Core Version:    0.7.0.1
 */