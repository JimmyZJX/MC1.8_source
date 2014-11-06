package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.channel.Channel;
/*  3:   */ import io.netty.channel.ChannelHandlerContext;
/*  4:   */ import io.netty.handler.codec.MessageToByteEncoder;
/*  5:   */ import io.netty.util.Attribute;
/*  6:   */ import java.io.IOException;
/*  7:   */ import org.apache.logging.log4j.LogManager;
/*  8:   */ import org.apache.logging.log4j.Logger;
/*  9:   */ import org.apache.logging.log4j.Marker;
/* 10:   */ import org.apache.logging.log4j.MarkerManager;
/* 11:   */ 
/* 12:   */ public class hf
/* 13:   */   extends MessageToByteEncoder<id>
/* 14:   */ {
/* 15:17 */   private static final Logger a = LogManager.getLogger();
/* 16:18 */   private static final Marker b = MarkerManager.getMarker("PACKET_SENT", gr.b);
/* 17:   */   private final ie c;
/* 18:   */   
/* 19:   */   public hf(ie paramie)
/* 20:   */   {
/* 21:23 */     this.c = paramie;
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected void encode(ChannelHandlerContext paramChannelHandlerContext, id paramid, ByteBuf paramByteBuf) throws IOException
/* 25:   */   {
/* 26:28 */     Integer localInteger = ((gy)paramChannelHandlerContext.channel().attr(gr.c).get()).a(this.c, paramid);
/* 27:31 */     if (a.isDebugEnabled()) {
/* 28:32 */       a.debug(b, "OUT: [{}:{}] {}", new Object[] { paramChannelHandlerContext.channel().attr(gr.c).get(), localInteger, paramid.getClass().getName() });
/* 29:   */     }
/* 30:35 */     if (localInteger == null) {
/* 31:36 */       throw new IOException("Can't serialize unregistered packet");
/* 32:   */     }
/* 33:39 */     ByteBufWrapper localhd = new ByteBufWrapper(paramByteBuf);
/* 34:40 */     localhd.b(localInteger.intValue());
/* 35:   */     try
/* 36:   */     {
/* 37:43 */       if ((paramid instanceof iq)) {
/* 38:44 */         paramid = paramid;
/* 39:   */       }
/* 40:46 */       paramid.toBuffer(localhd);
/* 41:   */     }
/* 42:   */     catch (Throwable localThrowable)
/* 43:   */     {
/* 44:48 */       a.error(localThrowable);
/* 45:   */     }
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hf
 * JD-Core Version:    0.7.0.1
 */