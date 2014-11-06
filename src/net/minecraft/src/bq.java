package net.minecraft.src;
/*  1:   */ import java.util.List;

/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bq
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:21 */     return "gamerule";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:26 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ICommandSender paramae)
/* 18:   */   {
/* 19:31 */     return "commands.gamerule.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 23:   */   {
/* 24:36 */     GameRules localaqq = d();
/* 25:37 */     String str1 = paramArrayOfString.length > 0 ? paramArrayOfString[0] : "";
/* 26:38 */     String str2 = paramArrayOfString.length > 1 ? a(paramArrayOfString, 1) : "";
/* 27:39 */     switch (paramArrayOfString.length)
/* 28:   */     {
/* 29:   */     case 1: 
/* 30:41 */       if (localaqq.e(str1))
/* 31:   */       {
/* 32:42 */         String str3 = localaqq.getString(str1);
/* 33:43 */         paramae.a(new hy(str1).a(" = ").a(str3));
/* 34:44 */         paramae.a(ag.e, localaqq.c(str1));
/* 35:   */       }
/* 36:   */       else
/* 37:   */       {
/* 38:46 */         throw new CommandException("commands.gamerule.norule", new Object[] { str1 });
/* 39:   */       }
/* 40:   */       break;
/* 41:   */     case 0: 
/* 42:51 */       paramae.a(new hy(a(localaqq.b())));
/* 43:52 */       break;
/* 44:   */     default: 
/* 45:55 */       if ((localaqq.a(str1, aqs.b)) && (!"true".equals(str2)) && (!"false".equals(str2))) {
/* 46:56 */         throw new CommandException("commands.generic.boolean.invalid", new Object[] { str2 });
/* 47:   */       }
/* 48:58 */       localaqq.a(str1, str2);
/* 49:59 */       a(localaqq, str1);
/* 50:60 */       a(paramae, this, "commands.gamerule.success", new Object[0]);
/* 51:   */     }
/* 52:   */   }
/* 53:   */   
/* 54:   */   public static void a(GameRules paramaqq, String paramString)
/* 55:   */   {
/* 56:   */     byte b;
/* 57:66 */     if ("reducedDebugInfo".equals(paramString))
/* 58:   */     {
/* 59:67 */       b = (byte) (paramaqq.getBoolean(paramString) ? 22 : 23);
/* 60:68 */       for (qw localqw : MinecraftServer.M().an().e) {
/* 61:69 */         localqw.a.a(new jk(localqw, b));
/* 62:   */       }
/* 63:   */     }
/* 64:   */   }
/* 65:   */   
/* 66:   */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 67:   */   {
/* 68:77 */     if (paramArrayOfString.length == 1) {
/* 69:78 */       return a(paramArrayOfString, d().b());
/* 70:   */     }
/* 71:80 */     if (paramArrayOfString.length == 2)
/* 72:   */     {
/* 73:81 */       GameRules localaqq = d();
/* 74:82 */       if (localaqq.a(paramArrayOfString[0], aqs.b)) {
/* 75:83 */         return a(paramArrayOfString, new String[] { "true", "false" });
/* 76:   */       }
/* 77:   */     }
/* 78:87 */     return null;
/* 79:   */   }
/* 80:   */   
/* 81:   */   private GameRules d()
/* 82:   */   {
/* 83:91 */     return MinecraftServer.M().a(0).getGameRules();
/* 84:   */   }
/* 85:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bq
 * JD-Core Version:    0.7.0.1
 */