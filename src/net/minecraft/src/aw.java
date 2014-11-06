package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.regex.Matcher;
/*  3:   */ import java.util.regex.Pattern;

/*  4:   */ import net.minecraft.server.MinecraftServer;
/*  5:   */ 
/*  6:   */ public class aw
/*  7:   */   extends CommandBase
/*  8:   */ {
/*  9:20 */   public static final Pattern a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
/* 10:   */   
/* 11:   */   public String c()
/* 12:   */   {
/* 13:24 */     return "ban-ip";
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int a()
/* 17:   */   {
/* 18:29 */     return 3;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public boolean a(ICommandSender paramae)
/* 22:   */   {
/* 23:34 */     return (MinecraftServer.M().an().j().b()) && (super.a(paramae));
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String c(ICommandSender paramae)
/* 27:   */   {
/* 28:39 */     return "commands.banip.usage";
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 32:   */   {
/* 33:44 */     if ((paramArrayOfString.length < 1) || (paramArrayOfString[0].length() <= 1)) {
/* 34:45 */       throw new WrongUsageException("commands.banip.usage", new Object[0]);
/* 35:   */     }
/* 36:48 */     ho localObject = paramArrayOfString.length >= 2 ? a(paramae, paramArrayOfString, 1) : null;
/* 37:   */     
/* 38:50 */     Matcher localMatcher = a.matcher(paramArrayOfString[0]);
/* 39:51 */     if (localMatcher.matches())
/* 40:   */     {
/* 41:52 */       a(paramae, paramArrayOfString[0], localObject == null ? null : localObject.c());
/* 42:   */     }
/* 43:   */     else
/* 44:   */     {
/* 45:54 */       qw localqw = MinecraftServer.M().an().a(paramArrayOfString[0]);
/* 46:55 */       if (localqw == null) {
/* 47:56 */         throw new dm("commands.banip.invalid", new Object[0]);
/* 48:   */       }
/* 49:59 */       a(paramae, localqw.w(), localObject == null ? null : localObject.c());
/* 50:   */     }
/* 51:   */   }
/* 52:   */   
/* 53:   */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 54:   */   {
/* 55:66 */     if (paramArrayOfString.length == 1) {
/* 56:67 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 57:   */     }
/* 58:70 */     return null;
/* 59:   */   }
/* 60:   */   
/* 61:   */   protected void a(ICommandSender paramae, String paramString1, String paramString2)
/* 62:   */   {
/* 63:74 */     se localse = new se(paramString1, null, paramae.getName(), null, paramString2);
/* 64:75 */     MinecraftServer.M().an().j().a(localse);
/* 65:   */     
/* 66:77 */     List<qw> localList = MinecraftServer.M().an().b(paramString1);
/* 67:78 */     String[] arrayOfString = new String[localList.size()];
/* 68:79 */     int i = 0;
/* 69:81 */     for (qw localqw : localList)
/* 70:   */     {
/* 71:82 */       localqw.a.c("You have been IP banned.");
/* 72:83 */       arrayOfString[(i++)] = localqw.getName();
/* 73:   */     }
/* 74:86 */     if (localList.isEmpty()) {
/* 75:87 */       a(paramae, this, "commands.banip.success", new Object[] { paramString1 });
/* 76:   */     } else {
/* 77:89 */       a(paramae, this, "commands.banip.success.players", new Object[] { paramString1, a(arrayOfString) });
/* 78:   */     }
/* 79:   */   }
/* 80:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aw
 * JD-Core Version:    0.7.0.1
 */