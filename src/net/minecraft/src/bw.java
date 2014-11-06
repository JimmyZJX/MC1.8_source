package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class bw
/*  4:   */   extends CommandBase
/*  5:   */ {
/*  6:   */   public String c()
/*  7:   */   {
/*  8:14 */     return "list";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a()
/* 12:   */   {
/* 13:19 */     return 0;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String c(ICommandSender paramae)
/* 17:   */   {
/* 18:24 */     return "commands.players.usage";
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(ICommandSender paramae, String[] paramArrayOfString)
/* 22:   */   {
/* 23:29 */     int i = MinecraftServer.M().G();
/* 24:30 */     paramae.a(new hz("commands.players.list", new Object[] { Integer.valueOf(i), Integer.valueOf(MinecraftServer.M().H()) }));
/* 25:31 */     paramae.a(new hy(MinecraftServer.M().an().f()));
/* 26:32 */     paramae.a(ag.e, i);
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bw
 * JD-Core Version:    0.7.0.1
 */