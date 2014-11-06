package net.minecraft.src;
/*  1:   */ import java.util.List;

/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class cj
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:18 */     return "say";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:23 */     return 1;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ICommandSender paramae)
/* 18:   */   {
/* 19:28 */     return "commands.say.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 23:   */   {
/* 24:33 */     if ((paramArrayOfString.length <= 0) || (paramArrayOfString[0].length() <= 0)) {
/* 25:34 */       throw new WrongUsageException("commands.say.usage", new Object[0]);
/* 26:   */     }
/* 27:37 */     ho localho = b(paramae, paramArrayOfString, 0, true);
/* 28:38 */     MinecraftServer.M().an().a(new hz("chat.type.announcement", new Object[] { paramae.e_(), localho }));
/* 29:   */   }
/* 30:   */   
/* 31:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 32:   */   {
/* 33:44 */     if (paramArrayOfString.length >= 1) {
/* 34:45 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 35:   */     }
/* 36:48 */     return null;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cj
 * JD-Core Version:    0.7.0.1
 */