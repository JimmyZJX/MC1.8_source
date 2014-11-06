package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import java.util.List;
/*  3:   */ import net.minecraft.server.MinecraftServer;
/*  4:   */ 
/*  5:   */ public class df
/*  6:   */   extends CommandBase
/*  7:   */ {
/*  8:   */   public String c()
/*  9:   */   {
/* 10:19 */     return "whitelist";
/* 11:   */   }
/* 12:   */   
/* 13:   */   public int a()
/* 14:   */   {
/* 15:24 */     return 3;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String c(ICommandSender paramae)
/* 19:   */   {
/* 20:29 */     return "commands.whitelist.usage";
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 24:   */   {
/* 25:34 */     if (paramArrayOfString.length < 1) {
/* 26:35 */       throw new WrongUsageException("commands.whitelist.usage", new Object[0]);
/* 27:   */     }
/* 28:38 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 29:39 */     if (paramArrayOfString[0].equals("on"))
/* 30:   */     {
/* 31:40 */       localMinecraftServer.an().a(true);
/* 32:41 */       a(paramae, this, "commands.whitelist.enabled", new Object[0]);
/* 33:   */     }
/* 34:42 */     else if (paramArrayOfString[0].equals("off"))
/* 35:   */     {
/* 36:43 */       localMinecraftServer.an().a(false);
/* 37:44 */       a(paramae, this, "commands.whitelist.disabled", new Object[0]);
/* 38:   */     }
/* 39:   */     else
/* 40:   */     {
/* 41:   */       Object localObject;
/* 42:45 */       if (paramArrayOfString[0].equals("list"))
/* 43:   */       {
/* 44:46 */         paramae.a(new hz("commands.whitelist.list", new Object[] { Integer.valueOf(localMinecraftServer.an().m().length), Integer.valueOf(localMinecraftServer.an().r().length) }));
/* 45:47 */         localObject = localMinecraftServer.an().m();
/* 46:48 */         paramae.a(new hy(a((Object[])localObject)));
/* 47:   */       }
/* 48:49 */       else if (paramArrayOfString[0].equals("add"))
/* 49:   */       {
/* 50:50 */         if (paramArrayOfString.length < 2) {
/* 51:51 */           throw new WrongUsageException("commands.whitelist.add.usage", new Object[0]);
/* 52:   */         }
/* 53:54 */         localObject = localMinecraftServer.aD().a(paramArrayOfString[1]);
/* 54:55 */         if (localObject == null) {
/* 55:56 */           throw new CommandException("commands.whitelist.add.failed", new Object[] { paramArrayOfString[1] });
/* 56:   */         }
/* 57:58 */         localMinecraftServer.an().d((GameProfile)localObject);
/* 58:59 */         a(paramae, this, "commands.whitelist.add.success", new Object[] { paramArrayOfString[1] });
/* 59:   */       }
/* 60:60 */       else if (paramArrayOfString[0].equals("remove"))
/* 61:   */       {
/* 62:61 */         if (paramArrayOfString.length < 2) {
/* 63:62 */           throw new WrongUsageException("commands.whitelist.remove.usage", new Object[0]);
/* 64:   */         }
/* 65:65 */         localObject = localMinecraftServer.an().l().a(paramArrayOfString[1]);
/* 66:66 */         if (localObject == null) {
/* 67:67 */           throw new CommandException("commands.whitelist.remove.failed", new Object[] { paramArrayOfString[1] });
/* 68:   */         }
/* 69:69 */         localMinecraftServer.an().c((GameProfile)localObject);
/* 70:70 */         a(paramae, this, "commands.whitelist.remove.success", new Object[] { paramArrayOfString[1] });
/* 71:   */       }
/* 72:71 */       else if (paramArrayOfString[0].equals("reload"))
/* 73:   */       {
/* 74:72 */         localMinecraftServer.an().a();
/* 75:73 */         a(paramae, this, "commands.whitelist.reloaded", new Object[0]);
/* 76:   */       }
/* 77:   */     }
/* 78:   */   }
/* 79:   */   
/* 80:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 81:   */   {
/* 82:80 */     if (paramArrayOfString.length == 1) {
/* 83:81 */       return a(paramArrayOfString, new String[] { "on", "off", "list", "add", "remove", "reload" });
/* 84:   */     }
/* 85:84 */     if (paramArrayOfString.length == 2)
/* 86:   */     {
/* 87:85 */       if (paramArrayOfString[0].equals("remove")) {
/* 88:86 */         return a(paramArrayOfString, MinecraftServer.M().an().m());
/* 89:   */       }
/* 90:87 */       if (paramArrayOfString[0].equals("add")) {
/* 91:88 */         return a(paramArrayOfString, MinecraftServer.M().aD().a());
/* 92:   */       }
/* 93:   */     }
/* 94:92 */     return null;
/* 95:   */   }
/* 96:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     df
 * JD-Core Version:    0.7.0.1
 */