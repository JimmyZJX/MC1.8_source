package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bm
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:18 */     return "xp";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:23 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ICommandSender paramae)
/* 18:   */   {
/* 19:28 */     return "commands.xp.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 23:   */   {
/* 24:33 */     if (paramArrayOfString.length <= 0) {
/* 25:34 */       throw new WrongUsageException("commands.xp.usage", new Object[0]);
/* 26:   */     }
/* 27:37 */     String str = paramArrayOfString[0];
/* 28:38 */     int i = (str.endsWith("l")) || (str.endsWith("L")) ? 1 : 0;
/* 29:39 */     if ((i != 0) && (str.length() > 1)) {
/* 30:40 */       str = str.substring(0, str.length() - 1);
/* 31:   */     }
/* 32:42 */     int j = a(str);
/* 33:   */     
/* 34:44 */     int k = j < 0 ? 1 : 0;
/* 35:45 */     if (k != 0) {
/* 36:46 */       j *= -1;
/* 37:   */     }
/* 38:49 */     qw localqw = paramArrayOfString.length > 1 ? a(paramae, paramArrayOfString[1]) : b(paramae);
/* 39:50 */     if (i != 0)
/* 40:   */     {
/* 41:51 */       paramae.a(ag.e, localqw.bz);
/* 42:52 */       if (k != 0)
/* 43:   */       {
/* 44:53 */         localqw.a(-j);
/* 45:54 */         a(paramae, this, "commands.xp.success.negative.levels", new Object[] { Integer.valueOf(j), localqw.getName() });
/* 46:   */       }
/* 47:   */       else
/* 48:   */       {
/* 49:56 */         localqw.a(j);
/* 50:57 */         a(paramae, this, "commands.xp.success.levels", new Object[] { Integer.valueOf(j), localqw.getName() });
/* 51:   */       }
/* 52:   */     }
/* 53:   */     else
/* 54:   */     {
/* 55:60 */       paramae.a(ag.e, localqw.bA);
/* 56:61 */       if (k != 0) {
/* 57:62 */         throw new CommandException("commands.xp.failure.widthdrawXp", new Object[0]);
/* 58:   */       }
/* 59:64 */       localqw.u(j);
/* 60:65 */       a(paramae, this, "commands.xp.success", new Object[] { Integer.valueOf(j), localqw.getName() });
/* 61:   */     }
/* 62:   */   }
/* 63:   */   
/* 64:   */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 65:   */   {
/* 66:73 */     if (paramArrayOfString.length == 2) {
/* 67:74 */       return a(paramArrayOfString, d());
/* 68:   */     }
/* 69:77 */     return null;
/* 70:   */   }
/* 71:   */   
/* 72:   */   protected String[] d()
/* 73:   */   {
/* 74:81 */     return MinecraftServer.M().I();
/* 75:   */   }
/* 76:   */   
/* 77:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 78:   */   {
/* 79:86 */     return paramInt == 1;
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bm
 * JD-Core Version:    0.7.0.1
 */