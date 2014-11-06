package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;

/*  2:   */ import java.util.List;

/*  3:   */ import net.minecraft.server.MinecraftServer;
/*  4:   */ 
/*  5:   */ public class bd
/*  6:   */   extends CommandBase
/*  7:   */ {
/*  8:   */   public String c()
/*  9:   */   {
/* 10:17 */     return "deop";
/* 11:   */   }
/* 12:   */   
/* 13:   */   public int a()
/* 14:   */   {
/* 15:22 */     return 3;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String c(ICommandSender paramae)
/* 19:   */   {
/* 20:27 */     return "commands.deop.usage";
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 24:   */   {
/* 25:32 */     if ((paramArrayOfString.length != 1) || (paramArrayOfString[0].length() <= 0)) {
/* 26:33 */       throw new WrongUsageException("commands.deop.usage", new Object[0]);
/* 27:   */     }
/* 28:36 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 29:37 */     GameProfile localGameProfile = localMinecraftServer.an().n().a(paramArrayOfString[0]);
/* 30:38 */     if (localGameProfile == null) {
/* 31:39 */       throw new CommandException("commands.deop.failed", new Object[] { paramArrayOfString[0] });
/* 32:   */     }
/* 33:42 */     localMinecraftServer.an().b(localGameProfile);
/* 34:43 */     a(paramae, this, "commands.deop.success", new Object[] { paramArrayOfString[0] });
/* 35:   */   }
/* 36:   */   
/* 37:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 38:   */   {
/* 39:49 */     if (paramArrayOfString.length == 1) {
/* 40:50 */       return a(paramArrayOfString, MinecraftServer.M().an().o());
/* 41:   */     }
/* 42:53 */     return null;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bd
 * JD-Core Version:    0.7.0.1
 */