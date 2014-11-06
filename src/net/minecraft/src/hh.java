package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.buffer.Unpooled;
/*  3:   */ import io.netty.channel.ChannelHandlerContext;
/*  4:   */ import io.netty.handler.codec.ByteToMessageDecoder;
/*  5:   */ import io.netty.handler.codec.CorruptedFrameException;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class hh
/*  9:   */   extends ByteToMessageDecoder
/* 10:   */ {
/* 11:   */   protected void decode(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf, List paramList)
/* 12:   */   {
/* 13:14 */     paramByteBuf.markReaderIndex();
/* 14:   */     
/* 15:16 */     byte[] arrayOfByte = new byte[3];
/* 16:17 */     for (int i = 0; i < arrayOfByte.length; i++)
/* 17:   */     {
/* 18:18 */       if (!paramByteBuf.isReadable())
/* 19:   */       {
/* 20:19 */         paramByteBuf.resetReaderIndex();
/* 21:20 */         return;
/* 22:   */       }
/* 23:23 */       arrayOfByte[i] = paramByteBuf.readByte();
/* 24:24 */       if (arrayOfByte[i] >= 0)
/* 25:   */       {
/* 26:25 */         ByteBufWrapper localhd = new ByteBufWrapper(Unpooled.wrappedBuffer(arrayOfByte));
/* 27:   */         try
/* 28:   */         {
/* 29:27 */           int j = localhd.e();
/* 30:29 */           if (paramByteBuf.readableBytes() < j)
/* 31:   */           {
/* 32:30 */             paramByteBuf.resetReaderIndex(); return;
/* 33:   */           }
/* 34:33 */           paramList.add(paramByteBuf.readBytes(j)); return;
/* 35:   */         }
/* 36:   */         finally
/* 37:   */         {
/* 38:37 */           localhd.release();
/* 39:   */         }
/* 40:   */       }
/* 41:   */     }
/* 42:42 */     throw new CorruptedFrameException("length wider than 21-bit");
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hh
 * JD-Core Version:    0.7.0.1
 */