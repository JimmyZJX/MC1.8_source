package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.buffer.Unpooled;
/*  3:   */ import io.netty.channel.ChannelHandlerContext;
/*  4:   */ import io.netty.handler.codec.ByteToMessageDecoder;
/*  5:   */ import io.netty.handler.codec.DecoderException;

/*  6:   */ import java.util.List;
import java.util.zip.DataFormatException;
/*  7:   */ import java.util.zip.Inflater;
/*  8:   */ 
/*  9:   */ public class gp
/* 10:   */   extends ByteToMessageDecoder
/* 11:   */ {
/* 12:   */   private final Inflater a;
/* 13:   */   private int b;
/* 14:   */   
/* 15:   */   public gp(int paramInt)
/* 16:   */   {
/* 17:19 */     this.b = paramInt;
/* 18:20 */     this.a = new Inflater();
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected void decode(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf, List paramList) throws DataFormatException
/* 22:   */   {
/* 23:25 */     if (paramByteBuf.readableBytes() == 0) {
/* 24:26 */       return;
/* 25:   */     }
/* 26:29 */     ByteBufWrapper localhd = new ByteBufWrapper(paramByteBuf);
/* 27:30 */     int i = localhd.e();
/* 28:32 */     if (i == 0)
/* 29:   */     {
/* 30:33 */       paramList.add(localhd.readBytes(localhd.readableBytes()));
/* 31:   */     }
/* 32:   */     else
/* 33:   */     {
/* 34:34 */       if (i < this.b) {
/* 35:35 */         throw new DecoderException("Badly compressed packet - size of " + i + " is below server threshold of " + this.b);
/* 36:   */       }
/* 37:36 */       if (i > 2097152) {
/* 38:37 */         throw new DecoderException("Badly compressed packet - size of " + i + " is larger than protocol maximum of " + 2097152);
/* 39:   */       }
/* 40:39 */       byte[] arrayOfByte1 = new byte[localhd.readableBytes()];
/* 41:40 */       localhd.readBytes(arrayOfByte1);
/* 42:41 */       this.a.setInput(arrayOfByte1);
/* 43:   */       
/* 44:43 */       byte[] arrayOfByte2 = new byte[i];
/* 45:44 */       this.a.inflate(arrayOfByte2);
/* 46:45 */       paramList.add(Unpooled.wrappedBuffer(arrayOfByte2));
/* 47:   */       
/* 48:47 */       this.a.reset();
/* 49:   */     }
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void a(int paramInt)
/* 53:   */   {
/* 54:56 */     this.b = paramInt;
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gp
 * JD-Core Version:    0.7.0.1
 */