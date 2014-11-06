package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bv
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:17 */     return "banlist";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:22 */     return 3;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a(ICommandSender paramae)
/* 18:   */   {
/* 19:27 */     return ((MinecraftServer.M().an().j().b()) || (MinecraftServer.M().an().i().b())) && (super.a(paramae));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String c(ICommandSender paramae)
/* 23:   */   {
/* 24:32 */     return "commands.banlist.usage";
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(ICommandSender paramae, String[] paramArrayOfString)
/* 28:   */   {
/* 29:37 */     if ((paramArrayOfString.length >= 1) && (paramArrayOfString[0].equalsIgnoreCase("ips")))
/* 30:   */     {
/* 31:38 */       paramae.a(new hz("commands.banlist.ips", new Object[] { Integer.valueOf(MinecraftServer.M().an().j().a().length) }));
/* 32:39 */       paramae.a(new hy(a(MinecraftServer.M().an().j().a())));
/* 33:   */     }
/* 34:   */     else
/* 35:   */     {
/* 36:41 */       paramae.a(new hz("commands.banlist.players", new Object[] { Integer.valueOf(MinecraftServer.M().an().i().a().length) }));
/* 37:42 */       paramae.a(new hy(a(MinecraftServer.M().an().i().a())));
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 42:   */   {
/* 43:49 */     if (paramArrayOfString.length == 1) {
/* 44:50 */       return a(paramArrayOfString, new String[] { "players", "ips" });
/* 45:   */     }
/* 46:53 */     return null;
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bv
 * JD-Core Version:    0.7.0.1
 */