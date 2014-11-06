package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.buffer.ByteBufAllocator;
/*  3:   */ import io.netty.channel.ChannelHandlerContext;

/*  4:   */ import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
/*  5:   */ 
/*  6:   */ public class gm
/*  7:   */ {
/*  8:   */   private final Cipher a;
/*  9:11 */   private byte[] b = new byte[0];
/* 10:12 */   private byte[] c = new byte[0];
/* 11:   */   
/* 12:   */   protected gm(Cipher paramCipher)
/* 13:   */   {
/* 14:15 */     this.a = paramCipher;
/* 15:   */   }
/* 16:   */   
/* 17:   */   private byte[] a(ByteBuf paramByteBuf)
/* 18:   */   {
/* 19:19 */     int i = paramByteBuf.readableBytes();
/* 20:20 */     if (this.b.length < i) {
/* 21:21 */       this.b = new byte[i];
/* 22:   */     }
/* 23:23 */     paramByteBuf.readBytes(this.b, 0, i);
/* 24:24 */     return this.b;
/* 25:   */   }
/* 26:   */   
/* 27:   */   protected ByteBuf a(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf) throws ShortBufferException
/* 28:   */   {
/* 29:28 */     int i = paramByteBuf.readableBytes();
/* 30:29 */     byte[] arrayOfByte = a(paramByteBuf);
/* 31:   */     
/* 32:31 */     ByteBuf localByteBuf = paramChannelHandlerContext.alloc().heapBuffer(this.a.getOutputSize(i));
/* 33:32 */     localByteBuf.writerIndex(this.a.update(arrayOfByte, 0, i, localByteBuf.array(), localByteBuf.arrayOffset()));
/* 34:   */     
/* 35:34 */     return localByteBuf;
/* 36:   */   }
/* 37:   */   
/* 38:   */   protected void a(ByteBuf paramByteBuf1, ByteBuf paramByteBuf2) throws ShortBufferException
/* 39:   */   {
/* 40:38 */     int i = paramByteBuf1.readableBytes();
/* 41:39 */     byte[] arrayOfByte = a(paramByteBuf1);
/* 42:   */     
/* 43:41 */     int j = this.a.getOutputSize(i);
/* 44:42 */     if (this.c.length < j) {
/* 45:43 */       this.c = new byte[j];
/* 46:   */     }
/* 47:45 */     paramByteBuf2.writeBytes(this.c, 0, this.a.update(arrayOfByte, 0, i, this.c));
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gm
 * JD-Core Version:    0.7.0.1
 */