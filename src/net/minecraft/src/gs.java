package net.minecraft.src;
/*  1:   */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*  2:   */ import io.netty.channel.nio.NioEventLoopGroup;
/*  3:   */ 
/*  4:   */ final class gs
/*  5:   */   extends up<NioEventLoopGroup>
/*  6:   */ {
/*  7:   */   protected NioEventLoopGroup b()
/*  8:   */   {
/*  9:47 */     return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
/* 10:   */   }
/* 11:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gs
 * JD-Core Version:    0.7.0.1
 */