package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import io.netty.buffer.ByteBuf;
/*   3:    */ import io.netty.buffer.Unpooled;
/*   6:    */ import io.netty.channel.ChannelFutureListener;
/*   7:    */ import io.netty.channel.ChannelHandlerContext;
/*   8:    */ import io.netty.channel.ChannelInboundHandlerAdapter;
/*  10:    */ import java.net.InetSocketAddress;
/*  11:    */ import net.minecraft.server.MinecraftServer;
/*  12:    */ import org.apache.logging.log4j.LogManager;
/*  13:    */ import org.apache.logging.log4j.Logger;
/*  14:    */ 
/*  15:    */ public class ra
/*  16:    */   extends ChannelInboundHandlerAdapter
/*  17:    */ {
/*  18: 16 */   private static final Logger a = LogManager.getLogger();
/*  19:    */   private rc b;
/*  20:    */   
/*  21:    */   public ra(rc paramrc)
/*  22:    */   {
/*  23: 22 */     this.b = paramrc;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void channelRead(ChannelHandlerContext paramChannelHandlerContext, Object paramObject)
/*  27:    */   {
/*  28: 27 */     ByteBuf localByteBuf1 = (ByteBuf)paramObject;
/*  29:    */     
/*  30: 29 */     localByteBuf1.markReaderIndex();
/*  31:    */     
/*  32: 31 */     int i = 1;
/*  33:    */     try
/*  34:    */     {
/*  35: 33 */       if (localByteBuf1.readUnsignedByte() != 254) {
/*  36:    */         return;
/*  37:    */       }
/*  38: 37 */       InetSocketAddress localInetSocketAddress = (InetSocketAddress)paramChannelHandlerContext.channel().remoteAddress();
/*  39: 38 */       MinecraftServer localMinecraftServer = this.b.d();
/*  40:    */       
/*  41: 40 */       int j = localByteBuf1.readableBytes();
/*  42:    */       String str1;
/*  43: 41 */       switch (j)
/*  44:    */       {
/*  45:    */       case 0: 
/*  46: 43 */         a.debug("Ping: (<1.3.x) from {}:{}", new Object[] { localInetSocketAddress.getAddress(), Integer.valueOf(localInetSocketAddress.getPort()) });
/*  47:    */         
/*  48: 45 */         str1 = String.format("%s§%d§%d", new Object[] { localMinecraftServer.ak(), Integer.valueOf(localMinecraftServer.G()), Integer.valueOf(localMinecraftServer.H()) });
/*  49: 46 */         a(paramChannelHandlerContext, a(str1));
/*  50:    */         
/*  51: 48 */         break;
/*  52:    */       case 1: 
/*  53: 51 */         if (localByteBuf1.readUnsignedByte() != 1) {
/*  54:    */           return;
/*  55:    */         }
/*  56: 55 */         a.debug("Ping: (1.4-1.5.x) from {}:{}", new Object[] { localInetSocketAddress.getAddress(), Integer.valueOf(localInetSocketAddress.getPort()) });
/*  57:    */         
/*  58: 57 */         str1 = String.format("", new Object[] { Integer.valueOf(127), localMinecraftServer.F(), localMinecraftServer.ak(), Integer.valueOf(localMinecraftServer.G()), Integer.valueOf(localMinecraftServer.H()) });
/*  59: 58 */         a(paramChannelHandlerContext, a(str1));
/*  60:    */         
/*  61: 60 */         break;
/*  62:    */       default: 
/*  63: 63 */         boolean bool = localByteBuf1.readUnsignedByte() == 1;
/*  64: 64 */         bool &= localByteBuf1.readUnsignedByte() == 250;
/*  65: 65 */         bool &= "MC|PingHost".equals(new String(localByteBuf1.readBytes(localByteBuf1.readShort() * 2).array(), Charsets.UTF_16BE));
/*  66: 66 */         int k = localByteBuf1.readUnsignedShort();
/*  67: 67 */         bool &= localByteBuf1.readUnsignedByte() >= 73;
/*  68: 68 */         bool &= 3 + localByteBuf1.readBytes(localByteBuf1.readShort() * 2).array().length + 4 == k;
/*  69: 69 */         bool &= localByteBuf1.readInt() <= 65535;
/*  70: 70 */         bool &= localByteBuf1.readableBytes() == 0;
/*  71: 72 */         if (!bool) {
/*  72:    */           return;
/*  73:    */         }
/*  74: 76 */         a.debug("Ping: (1.6) from {}:{}", new Object[] { localInetSocketAddress.getAddress(), Integer.valueOf(localInetSocketAddress.getPort()) });
/*  75:    */         
/*  76: 78 */         String str2 = String.format("", new Object[] { Integer.valueOf(127), localMinecraftServer.F(), localMinecraftServer.ak(), Integer.valueOf(localMinecraftServer.G()), Integer.valueOf(localMinecraftServer.H()) });
/*  77: 79 */         ByteBuf localByteBuf2 = a(str2);
/*  78:    */         try
/*  79:    */         {
/*  80: 81 */           a(paramChannelHandlerContext, localByteBuf2);
/*  81:    */         }
/*  82:    */         finally
/*  83:    */         {
/*  84: 83 */           localByteBuf2.release();
/*  85:    */         }
/*  86:    */       }
/*  87: 87 */       localByteBuf1.release();
/*  88: 88 */       i = 0;
/*  89:    */     }
/*  90:    */     catch (RuntimeException localRuntimeException) {}finally
/*  91:    */     {
/*  92: 91 */       if (i != 0)
/*  93:    */       {
/*  94: 92 */         localByteBuf1.resetReaderIndex();
/*  95: 93 */         paramChannelHandlerContext.channel().pipeline().remove("legacy_query");
/*  96: 94 */         paramChannelHandlerContext.fireChannelRead(paramObject);
/*  97:    */       }
/*  98:    */     }
/*  99:    */   }
/* 100:    */   
/* 101:    */   private void a(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf)
/* 102:    */   {
/* 103:100 */     paramChannelHandlerContext.pipeline().firstContext().writeAndFlush(paramByteBuf).addListener(ChannelFutureListener.CLOSE);
/* 104:    */   }
/* 105:    */   
/* 106:    */   private ByteBuf a(String paramString)
/* 107:    */   {
/* 108:104 */     ByteBuf localByteBuf = Unpooled.buffer();
/* 109:105 */     localByteBuf.writeByte(255);
/* 110:    */     
/* 111:107 */     char[] arrayOfChar1 = paramString.toCharArray();
/* 112:108 */     localByteBuf.writeShort(arrayOfChar1.length);
/* 113:109 */     for (int k : arrayOfChar1) {
/* 114:110 */       localByteBuf.writeChar(k);
/* 115:    */     }
/* 116:113 */     return localByteBuf;
/* 117:    */   }
/* 118:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ra
 * JD-Core Version:    0.7.0.1
 */