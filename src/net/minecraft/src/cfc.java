package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import com.google.common.base.Splitter;
/*   3:    */ import com.google.common.collect.Iterables;

/*   4:    */ import io.netty.buffer.ByteBuf;
/*   5:    */ import io.netty.buffer.Unpooled;
/*   6:    */ import io.netty.channel.Channel;
/*   7:    */ import io.netty.channel.ChannelFuture;
/*   8:    */ import io.netty.channel.ChannelFutureListener;
/*   9:    */ import io.netty.channel.ChannelHandlerContext;
/*  10:    */ import io.netty.channel.SimpleChannelInboundHandler;
/*  11:    */ 
/*  12:    */ class cfc
/*  13:    */   extends SimpleChannelInboundHandler<ByteBuf>
/*  14:    */ {
				private final cfb a;
/*  15:    */   cfc(cfb paramcfb) {a=paramcfb;}
/*  16:    */   
/*  17:    */   public void channelActive(ChannelHandlerContext paramChannelHandlerContext) throws Exception
/*  18:    */   {
/*  19:167 */     super.channelActive(paramChannelHandlerContext);
/*  20:168 */     ByteBuf localByteBuf = Unpooled.buffer();
/*  21:    */     try
/*  22:    */     {
/*  23:170 */       localByteBuf.writeByte(254);
/*  24:171 */       localByteBuf.writeByte(1);
/*  25:172 */       localByteBuf.writeByte(250);
/*  26:    */       
/*  27:174 */       char[] arrayOfChar1 = "MC|PingHost".toCharArray();
/*  28:175 */       localByteBuf.writeShort(arrayOfChar1.length);
/*  29:    */       
/*  30:176 */       for (int k : arrayOfChar1) {
/*  31:177 */         localByteBuf.writeChar(k);
/*  32:    */       }
/*  33:179 */       localByteBuf.writeShort(7 + 2 * this.a.a.a().length());
/*  34:180 */       localByteBuf.writeByte(127);
/*  35:181 */       arrayOfChar1 = this.a.a.a().toCharArray();
/*  36:182 */       localByteBuf.writeShort(arrayOfChar1.length);
/*  37:183 */       for (int k : arrayOfChar1) {
/*  38:184 */         localByteBuf.writeChar(k);
/*  39:    */       }
/*  40:186 */       localByteBuf.writeInt(this.a.a.b());
/*  41:    */       
/*  42:188 */       paramChannelHandlerContext.channel().writeAndFlush(localByteBuf).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
/*  43:    */     }
/*  44:    */     finally
/*  45:    */     {
/*  46:190 */       localByteBuf.release();
/*  47:    */     }
/*  48:    */   }
/*  49:    */   
/*  50:    */   protected void channelRead0(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf)
/*  51:    */   {
/*  52:196 */     int i = paramByteBuf.readUnsignedByte();
/*  53:198 */     if (i == 255)
/*  54:    */     {
/*  55:199 */       String str1 = new String(paramByteBuf.readBytes(paramByteBuf.readShort() * 2).array(), Charsets.UTF_16BE);
/*  56:200 */       String[] arrayOfString = (String[])Iterables.toArray(cez.d().split(str1), String.class);
/*  57:202 */       if ("§1".equals(arrayOfString[0]))
/*  58:    */       {
/*  59:203 */         int j = MathUtils.getInt(arrayOfString[1], 0);
/*  60:204 */         String str2 = arrayOfString[2];
/*  61:205 */         String str3 = arrayOfString[3];
/*  62:206 */         int k = MathUtils.getInt(arrayOfString[4], -1);
/*  63:207 */         int m = MathUtils.getInt(arrayOfString[5], -1);
/*  64:    */         
/*  65:209 */         this.a.b.f = -1;
/*  66:210 */         this.a.b.g = str2;
/*  67:211 */         this.a.b.d = str3;
/*  68:212 */         this.a.b.c = (net.minecraft.src.a.h + "" + k + "" + net.minecraft.src.a.i + "/" + net.minecraft.src.a.h + m);
/*  69:    */       }
/*  70:    */     }
/*  71:216 */     paramChannelHandlerContext.close();
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void exceptionCaught(ChannelHandlerContext paramChannelHandlerContext, Throwable paramThrowable)
/*  75:    */   {
/*  76:221 */     paramChannelHandlerContext.close();
/*  77:    */   }
/*  78:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfc
 * JD-Core Version:    0.7.0.1
 */