package net.minecraft.src;
/*  1:   */ import java.util.List;

/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class da
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:18 */     return "time";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:23 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ICommandSender paramae)
/* 18:   */   {
/* 19:28 */     return "commands.time.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 23:   */   {
/* 24:33 */     if (paramArrayOfString.length > 1)
/* 25:   */     {
/* 26:   */       int i;
/* 27:34 */       if (paramArrayOfString[0].equals("set"))
/* 28:   */       {
/* 29:36 */         if (paramArrayOfString[1].equals("day")) {
/* 30:37 */           i = 1000;
/* 31:38 */         } else if (paramArrayOfString[1].equals("night")) {
/* 32:39 */           i = 13000;
/* 33:   */         } else {
/* 34:41 */           i = a(paramArrayOfString[1], 0);
/* 35:   */         }
/* 36:43 */         a(paramae, i);
/* 37:44 */         a(paramae, this, "commands.time.set", new Object[] { Integer.valueOf(i) });
/* 38:45 */         return;
/* 39:   */       }
/* 40:46 */       if (paramArrayOfString[0].equals("add"))
/* 41:   */       {
/* 42:47 */         i = a(paramArrayOfString[1], 0);
/* 43:48 */         b(paramae, i);
/* 44:49 */         a(paramae, this, "commands.time.added", new Object[] { Integer.valueOf(i) });
/* 45:50 */         return;
/* 46:   */       }
/* 47:51 */       if (paramArrayOfString[0].equals("query"))
/* 48:   */       {
/* 49:52 */         if (paramArrayOfString[1].equals("daytime"))
/* 50:   */         {
/* 51:53 */           i = (int)(paramae.e().L() % 2147483647L);
/* 52:54 */           paramae.a(ag.e, i);
/* 53:55 */           a(paramae, this, "commands.time.query", new Object[] { Integer.valueOf(i) });
/* 54:56 */           return;
/* 55:   */         }
/* 56:57 */         if (paramArrayOfString[1].equals("gametime"))
/* 57:   */         {
/* 58:58 */           i = (int)(paramae.e().K() % 2147483647L);
/* 59:59 */           paramae.a(ag.e, i);
/* 60:60 */           a(paramae, this, "commands.time.query", new Object[] { Integer.valueOf(i) });
/* 61:61 */           return;
/* 62:   */         }
/* 63:   */       }
/* 64:   */     }
/* 65:66 */     throw new WrongUsageException("commands.time.usage", new Object[0]);
/* 66:   */   }
/* 67:   */   
/* 68:   */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 69:   */   {
/* 70:72 */     if (paramArrayOfString.length == 1) {
/* 71:73 */       return a(paramArrayOfString, new String[] { "set", "add", "query" });
/* 72:   */     }
/* 73:74 */     if ((paramArrayOfString.length == 2) && (paramArrayOfString[0].equals("set"))) {
/* 74:75 */       return a(paramArrayOfString, new String[] { "day", "night" });
/* 75:   */     }
/* 76:76 */     if ((paramArrayOfString.length == 2) && (paramArrayOfString[0].equals("query"))) {
/* 77:77 */       return a(paramArrayOfString, new String[] { "daytime", "gametime" });
/* 78:   */     }
/* 79:79 */     return null;
/* 80:   */   }
/* 81:   */   
/* 82:   */   protected void a(ICommandSender paramae, int paramInt)
/* 83:   */   {
/* 84:83 */     for (int i = 0; i < MinecraftServer.M().c.length; i++) {
/* 85:84 */       MinecraftServer.M().c[i].b(paramInt);
/* 86:   */     }
/* 87:   */   }
/* 88:   */   
/* 89:   */   protected void b(ICommandSender paramae, int paramInt)
/* 90:   */   {
/* 91:89 */     for (int i = 0; i < MinecraftServer.M().c.length; i++)
/* 92:   */     {
/* 93:90 */       WorldServer localqt = MinecraftServer.M().c[i];
/* 94:91 */       localqt.b(localqt.L() + paramInt);
/* 95:   */     }
/* 96:   */   }
/* 97:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     da
 * JD-Core Version:    0.7.0.1
 */