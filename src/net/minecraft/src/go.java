package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.channel.ChannelHandlerContext;
/*  3:   */ import io.netty.handler.codec.MessageToByteEncoder;

/*  4:   */ import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
/*  5:   */ 
/*  6:   */ public class go
/*  7:   */   extends MessageToByteEncoder<ByteBuf>
/*  8:   */ {
/*  9:   */   private final gm a;
/* 10:   */   
/* 11:   */   public go(Cipher paramCipher)
/* 12:   */   {
/* 13:13 */     this.a = new gm(paramCipher);
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void encode(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf1, ByteBuf paramByteBuf2) throws ShortBufferException
/* 17:   */   {
/* 18:18 */     this.a.a(paramByteBuf1, paramByteBuf2);
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     go
 * JD-Core Version:    0.7.0.1
 */