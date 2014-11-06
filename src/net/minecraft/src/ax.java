package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import java.util.List;
/*  3:   */ import net.minecraft.server.MinecraftServer;
/*  4:   */ 
/*  5:   */ public class ax
/*  6:   */   extends CommandBase
/*  7:   */ {
/*  8:   */   public String c()
/*  9:   */   {
/* 10:19 */     return "ban";
/* 11:   */   }
/* 12:   */   
/* 13:   */   public int a()
/* 14:   */   {
/* 15:24 */     return 3;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String c(ICommandSender paramae)
/* 19:   */   {
/* 20:29 */     return "commands.ban.usage";
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean a(ICommandSender paramae)
/* 24:   */   {
/* 25:34 */     return (MinecraftServer.M().an().i().b()) && (super.a(paramae));
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 29:   */   {
/* 30:39 */     if ((paramArrayOfString.length < 1) || (paramArrayOfString[0].length() <= 0)) {
/* 31:40 */       throw new WrongUsageException("commands.ban.usage", new Object[0]);
/* 32:   */     }
/* 33:43 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 34:44 */     GameProfile localGameProfile = localMinecraftServer.aD().a(paramArrayOfString[0]);
/* 35:45 */     if (localGameProfile == null) {
/* 36:46 */       throw new CommandException("commands.ban.failed", new Object[] { paramArrayOfString[0] });
/* 37:   */     }
/* 38:49 */     String str = null;
/* 39:50 */     if (paramArrayOfString.length >= 2) {
/* 40:51 */       str = a(paramae, paramArrayOfString, 1).c();
/* 41:   */     }
/* 42:54 */     sw localsw = new sw(localGameProfile, null, paramae.getName(), null, str);
/* 43:55 */     localMinecraftServer.an().i().a(localsw);
/* 44:   */     
/* 45:57 */     qw localqw = localMinecraftServer.an().a(paramArrayOfString[0]);
/* 46:58 */     if (localqw != null) {
/* 47:59 */       localqw.a.c("You are banned from this server.");
/* 48:   */     }
/* 49:62 */     a(paramae, this, "commands.ban.success", new Object[] { paramArrayOfString[0] });
/* 50:   */   }
/* 51:   */   
/* 52:   */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 53:   */   {
/* 54:68 */     if (paramArrayOfString.length >= 1) {
/* 55:69 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 56:   */     }
/* 57:72 */     return null;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ax
 * JD-Core Version:    0.7.0.1
 */