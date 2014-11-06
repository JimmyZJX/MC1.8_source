package net.minecraft.src;
/*  1:   */ import java.util.List;

/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bt
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:18 */     return "kick";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:23 */     return 3;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ICommandSender paramae)
/* 18:   */   {
/* 19:28 */     return "commands.kick.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 23:   */   {
/* 24:33 */     if ((paramArrayOfString.length <= 0) || (paramArrayOfString[0].length() <= 1)) {
/* 25:34 */       throw new WrongUsageException("commands.kick.usage", new Object[0]);
/* 26:   */     }
/* 27:37 */     qw localqw = MinecraftServer.M().an().a(paramArrayOfString[0]);
/* 28:38 */     String str = "Kicked by an operator.";
/* 29:39 */     int i = 0;
/* 30:41 */     if (localqw == null) {
/* 31:42 */       throw new dm();
/* 32:   */     }
/* 33:45 */     if (paramArrayOfString.length >= 2)
/* 34:   */     {
/* 35:46 */       str = a(paramae, paramArrayOfString, 1).c();
/* 36:47 */       i = 1;
/* 37:   */     }
/* 38:50 */     localqw.a.c(str);
/* 39:51 */     if (i != 0) {
/* 40:52 */       a(paramae, this, "commands.kick.success.reason", new Object[] { localqw.getName(), str });
/* 41:   */     } else {
/* 42:54 */       a(paramae, this, "commands.kick.success", new Object[] { localqw.getName() });
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 47:   */   {
/* 48:61 */     if (paramArrayOfString.length >= 1) {
/* 49:62 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 50:   */     }
/* 51:65 */     return null;
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bt
 * JD-Core Version:    0.7.0.1
 */