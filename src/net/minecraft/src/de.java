package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class de
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:20 */     return "weather";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:25 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ICommandSender paramae)
/* 18:   */   {
/* 19:30 */     return "commands.weather.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 23:   */   {
/* 24:35 */     if ((paramArrayOfString.length < 1) || (paramArrayOfString.length > 2)) {
/* 25:36 */       throw new WrongUsageException("commands.weather.usage", new Object[0]);
/* 26:   */     }
/* 27:39 */     int i = (300 + new Random().nextInt(600)) * 20;
/* 28:40 */     if (paramArrayOfString.length >= 2) {
/* 29:41 */       i = a(paramArrayOfString[1], 1, 1000000) * 20;
/* 30:   */     }
/* 31:44 */     WorldServer localqt = net.minecraft.server.MinecraftServer.M().c[0];
/* 32:45 */     WorldInfo localbqo = localqt.getWorldInfo();
/* 33:47 */     if ("clear".equalsIgnoreCase(paramArrayOfString[0]))
/* 34:   */     {
/* 35:48 */       localbqo.i(i);
/* 36:49 */       localbqo.g(0);
/* 37:50 */       localbqo.f(0);
/* 38:51 */       localbqo.b(false);
/* 39:52 */       localbqo.a(false);
/* 40:53 */       a(paramae, this, "commands.weather.clear", new Object[0]);
/* 41:   */     }
/* 42:54 */     else if ("rain".equalsIgnoreCase(paramArrayOfString[0]))
/* 43:   */     {
/* 44:55 */       localbqo.i(0);
/* 45:56 */       localbqo.g(i);
/* 46:57 */       localbqo.f(i);
/* 47:58 */       localbqo.b(true);
/* 48:59 */       localbqo.a(false);
/* 49:60 */       a(paramae, this, "commands.weather.rain", new Object[0]);
/* 50:   */     }
/* 51:61 */     else if ("thunder".equalsIgnoreCase(paramArrayOfString[0]))
/* 52:   */     {
/* 53:62 */       localbqo.i(0);
/* 54:63 */       localbqo.g(i);
/* 55:64 */       localbqo.f(i);
/* 56:65 */       localbqo.b(true);
/* 57:66 */       localbqo.a(true);
/* 58:67 */       a(paramae, this, "commands.weather.thunder", new Object[0]);
/* 59:   */     }
/* 60:   */     else
/* 61:   */     {
/* 62:69 */       throw new WrongUsageException("commands.weather.usage", new Object[0]);
/* 63:   */     }
/* 64:   */   }
/* 65:   */   
/* 66:   */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 67:   */   {
/* 68:76 */     if (paramArrayOfString.length == 1) {
/* 69:77 */       return a(paramArrayOfString, new String[] { "clear", "rain", "thunder" });
/* 70:   */     }
/* 71:80 */     return null;
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     de
 * JD-Core Version:    0.7.0.1
 */