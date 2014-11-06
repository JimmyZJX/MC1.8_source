package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.channel.ChannelHandlerContext;
/*  3:   */ import io.netty.handler.codec.MessageToByteEncoder;
/*  4:   */ import java.util.zip.Deflater;
/*  5:   */ 
/*  6:   */ public class gq
/*  7:   */   extends MessageToByteEncoder<ByteBuf>
/*  8:   */ {
/*  9:10 */   private final byte[] a = new byte[8192];
/* 10:   */   private final Deflater b;
/* 11:   */   private int c;
/* 12:   */   
/* 13:   */   public gq(int paramInt)
/* 14:   */   {
/* 15:15 */     this.c = paramInt;
/* 16:16 */     this.b = new Deflater();
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void encode(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf1, ByteBuf paramByteBuf2)
/* 20:   */   {
/* 21:21 */     int i = paramByteBuf1.readableBytes();
/* 22:22 */     ByteBufWrapper localhd = new ByteBufWrapper(paramByteBuf2);
/* 23:24 */     if (i < this.c)
/* 24:   */     {
/* 25:25 */       localhd.b(0);
/* 26:26 */       localhd.writeBytes(paramByteBuf1);
/* 27:   */     }
/* 28:   */     else
/* 29:   */     {
/* 30:28 */       byte[] arrayOfByte = new byte[i];
/* 31:29 */       paramByteBuf1.readBytes(arrayOfByte);
/* 32:   */       
/* 33:31 */       localhd.b(arrayOfByte.length);
/* 34:   */       
/* 35:33 */       this.b.setInput(arrayOfByte, 0, i);
/* 36:34 */       this.b.finish();
/* 37:35 */       while (!this.b.finished())
/* 38:   */       {
/* 39:36 */         int j = this.b.deflate(this.a);
/* 40:37 */         localhd.writeBytes(this.a, 0, j);
/* 41:   */       }
/* 42:39 */       this.b.reset();
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void a(int paramInt)
/* 47:   */   {
/* 48:48 */     this.c = paramInt;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gq
 * JD-Core Version:    0.7.0.1
 */