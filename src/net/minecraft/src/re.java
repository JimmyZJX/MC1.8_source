package net.minecraft.src;
/*  1:   */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*  2:   */ import io.netty.channel.local.LocalEventLoopGroup;
/*  3:   */ 
/*  4:   */ final class re
/*  5:   */   extends up<LocalEventLoopGroup>
/*  6:   */ {
/*  7:   */   protected LocalEventLoopGroup b()
/*  8:   */   {
/*  9:46 */     return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Server IO #%d").setDaemon(true).build());
/* 10:   */   }
/* 11:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     re
 * JD-Core Version:    0.7.0.1
 */