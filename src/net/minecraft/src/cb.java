package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import java.util.List;
/*  3:   */ import net.minecraft.server.MinecraftServer;
/*  4:   */ 
/*  5:   */ public class cb
/*  6:   */   extends CommandBase
/*  7:   */ {
/*  8:   */   public String c()
/*  9:   */   {
/* 10:17 */     return "pardon";
/* 11:   */   }
/* 12:   */   
/* 13:   */   public int a()
/* 14:   */   {
/* 15:22 */     return 3;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String c(ICommandSender paramae)
/* 19:   */   {
/* 20:27 */     return "commands.unban.usage";
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean a(ICommandSender paramae)
/* 24:   */   {
/* 25:32 */     return (MinecraftServer.M().an().i().b()) && (super.a(paramae));
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 29:   */   {
/* 30:37 */     if ((paramArrayOfString.length != 1) || (paramArrayOfString[0].length() <= 0)) {
/* 31:38 */       throw new WrongUsageException("commands.unban.usage", new Object[0]);
/* 32:   */     }
/* 33:41 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 34:42 */     GameProfile localGameProfile = localMinecraftServer.an().i().a(paramArrayOfString[0]);
/* 35:43 */     if (localGameProfile == null) {
/* 36:44 */       throw new CommandException("commands.unban.failed", new Object[] { paramArrayOfString[0] });
/* 37:   */     }
/* 38:47 */     localMinecraftServer.an().i().c(localGameProfile);
/* 39:48 */     a(paramae, this, "commands.unban.success", new Object[] { paramArrayOfString[0] });
/* 40:   */   }
/* 41:   */   
/* 42:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 43:   */   {
/* 44:54 */     if (paramArrayOfString.length == 1) {
/* 45:55 */       return a(paramArrayOfString, MinecraftServer.M().an().i().a());
/* 46:   */     }
/* 47:58 */     return null;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cb
 * JD-Core Version:    0.7.0.1
 */