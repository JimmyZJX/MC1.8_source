package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.channel.ChannelHandlerContext;
/*  3:   */ import io.netty.handler.codec.MessageToByteEncoder;
/*  4:   */ 
/*  5:   */ public class hi
/*  6:   */   extends MessageToByteEncoder<ByteBuf>
/*  7:   */ {
/*  8:   */   protected void encode(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf1, ByteBuf paramByteBuf2)
/*  9:   */   {
/* 10:15 */     int i = paramByteBuf1.readableBytes();
/* 11:16 */     int j = ByteBufWrapper.a(i);
/* 12:18 */     if (j > 3) {
/* 13:19 */       throw new IllegalArgumentException("unable to fit " + i + " into " + 3);
/* 14:   */     }
/* 15:22 */     ByteBufWrapper localhd = new ByteBufWrapper(paramByteBuf2);
/* 16:   */     
/* 17:24 */     localhd.ensureWritable(j + i);
/* 18:   */     
/* 19:26 */     localhd.b(i);
/* 20:27 */     localhd.writeBytes(paramByteBuf1, paramByteBuf1.readerIndex(), i);
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hi
 * JD-Core Version:    0.7.0.1
 */