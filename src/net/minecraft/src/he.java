package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ import io.netty.channel.Channel;
/*  3:   */ import io.netty.channel.ChannelHandlerContext;
/*  4:   */ import io.netty.handler.codec.ByteToMessageDecoder;
/*  5:   */ import io.netty.util.Attribute;

/*  6:   */ import java.io.IOException;
/*  7:   */ import java.util.List;

/*  8:   */ import org.apache.logging.log4j.LogManager;
/*  9:   */ import org.apache.logging.log4j.Logger;
/* 10:   */ import org.apache.logging.log4j.Marker;
/* 11:   */ import org.apache.logging.log4j.MarkerManager;
/* 12:   */ 
/* 13:   */ public class he
/* 14:   */   extends ByteToMessageDecoder
/* 15:   */ {
/* 16:17 */   private static final Logger a = LogManager.getLogger();
/* 17:18 */   private static final Marker b = MarkerManager.getMarker("PACKET_RECEIVED", gr.b);
/* 18:   */   private final ie c;
/* 19:   */   
/* 20:   */   public he(ie paramie)
/* 21:   */   {
/* 22:23 */     this.c = paramie;
/* 23:   */   }
/* 24:   */   
/* 25:   */   protected void decode(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf, List paramList) throws IOException, InstantiationException, IllegalAccessException
/* 26:   */   {
/* 27:28 */     if (paramByteBuf.readableBytes() == 0) {
/* 28:29 */       return;
/* 29:   */     }
/* 30:32 */     ByteBufWrapper localhd = new ByteBufWrapper(paramByteBuf);
/* 31:33 */     int i = localhd.e();
/* 32:34 */     id localid = ((gy)paramChannelHandlerContext.channel().attr(gr.c).get()).a(this.c, i);
/* 33:36 */     if (localid == null) {
/* 34:37 */       throw new IOException("Bad packet id " + i);
/* 35:   */     }
/* 36:40 */     localid.fromBuffer(localhd);
/* 37:41 */     if (localhd.readableBytes() > 0) {
/* 38:42 */       throw new IOException("Packet " + ((gy)paramChannelHandlerContext.channel().attr(gr.c).get()).a() + "/" + i + " (" + localid.getClass().getSimpleName() + ") was larger than I expected, found " + localhd.readableBytes() + " bytes extra whilst reading packet " + i);
/* 39:   */     }
/* 40:44 */     paramList.add(localid);
/* 41:47 */     if (a.isDebugEnabled()) {
/* 42:48 */       a.debug(b, " IN: [{}:{}] {}", new Object[] { paramChannelHandlerContext.channel().attr(gr.c).get(), Integer.valueOf(i), localid.getClass().getName() });
/* 43:   */     }
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     he
 * JD-Core Version:    0.7.0.1
 */