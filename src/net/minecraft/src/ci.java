package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class ci
/*  4:   */   extends CommandBase
/*  5:   */ {
/*  6:   */   public String c()
/*  7:   */   {
/*  8:12 */     return "save-on";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String c(ICommandSender paramae)
/* 12:   */   {
/* 13:17 */     return "commands.save-on.usage";
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 17:   */   {
/* 18:22 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 19:   */     
/* 20:24 */     int i = 0;
/* 21:25 */     for (int j = 0; j < localMinecraftServer.c.length; j++) {
/* 22:26 */       if (localMinecraftServer.c[j] != null)
/* 23:   */       {
/* 24:27 */         WorldServer localqt = localMinecraftServer.c[j];
/* 25:28 */         if (localqt.c)
/* 26:   */         {
/* 27:29 */           localqt.c = false;
/* 28:30 */           i = 1;
/* 29:   */         }
/* 30:   */       }
/* 31:   */     }
/* 32:35 */     if (i != 0) {
/* 33:36 */       a(paramae, this, "commands.save.enabled", new Object[0]);
/* 34:   */     } else {
/* 35:38 */       throw new CommandException("commands.save-on.alreadyOn", new Object[0]);
/* 36:   */     }
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ci
 * JD-Core Version:    0.7.0.1
 */