package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class co
/*  4:   */   extends CommandBase
/*  5:   */ {
/*  6:   */   public String c()
/*  7:   */   {
/*  8:12 */     return "setidletimeout";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a()
/* 12:   */   {
/* 13:17 */     return 3;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String c(ICommandSender paramae)
/* 17:   */   {
/* 18:22 */     return "commands.setidletimeout.usage";
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 22:   */   {
/* 23:27 */     if (paramArrayOfString.length != 1) {
/* 24:28 */       throw new WrongUsageException("commands.setidletimeout.usage", new Object[0]);
/* 25:   */     }
/* 26:31 */     int i = a(paramArrayOfString[0], 0);
/* 27:32 */     MinecraftServer.M().d(i);
/* 28:33 */     a(paramae, this, "commands.setidletimeout.success", new Object[] { Integer.valueOf(i) });
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     co
 * JD-Core Version:    0.7.0.1
 */