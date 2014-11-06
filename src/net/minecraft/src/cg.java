package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class cg
/*  4:   */   extends CommandBase
/*  5:   */ {
/*  6:   */   public String c()
/*  7:   */   {
/*  8:14 */     return "save-all";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String c(ICommandSender paramae)
/* 12:   */   {
/* 13:19 */     return "commands.save.usage";
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(ICommandSender paramae, String[] paramArrayOfString)
/* 17:   */   {
/* 18:24 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 19:25 */     paramae.a(new hz("commands.save.start", new Object[0]));
/* 20:27 */     if (localMinecraftServer.an() != null) {
/* 21:28 */       localMinecraftServer.an().k();
/* 22:   */     }
/* 23:   */     try
/* 24:   */     {
/* 25:   */       WorldServer localqt;
/* 26:   */       boolean bool;
/* 27:32 */       for (int i = 0; i < localMinecraftServer.c.length; i++) {
/* 28:33 */         if (localMinecraftServer.c[i] != null)
/* 29:   */         {
/* 30:34 */           localqt = localMinecraftServer.c[i];
/* 31:35 */           bool = localqt.c;
/* 32:36 */           localqt.c = false;
/* 33:37 */           localqt.a(true, null);
/* 34:38 */           localqt.c = bool;
/* 35:   */         }
/* 36:   */       }
/* 37:41 */       if ((paramArrayOfString.length > 0) && ("flush".equals(paramArrayOfString[0])))
/* 38:   */       {
/* 39:42 */         paramae.a(new hz("commands.save.flushStart", new Object[0]));
/* 40:43 */         for (int i = 0; i < localMinecraftServer.c.length; i++) {
/* 41:44 */           if (localMinecraftServer.c[i] != null)
/* 42:   */           {
/* 43:45 */             localqt = localMinecraftServer.c[i];
/* 44:46 */             bool = localqt.c;
/* 45:47 */             localqt.c = false;
/* 46:48 */             localqt.n();
/* 47:49 */             localqt.c = bool;
/* 48:   */           }
/* 49:   */         }
/* 50:52 */         paramae.a(new hz("commands.save.flushEnd", new Object[0]));
/* 51:   */       }
/* 52:   */     }
/* 53:   */     catch (aqz localaqz)
/* 54:   */     {
/* 55:55 */       a(paramae, this, "commands.save.failed", new Object[] { localaqz.getMessage() });
/* 56:56 */       return;
/* 57:   */     }
/* 58:59 */     a(paramae, this, "commands.save.success", new Object[0]);
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cg
 * JD-Core Version:    0.7.0.1
 */