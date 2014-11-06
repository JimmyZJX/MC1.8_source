package net.minecraft.src;
/*  1:   */ import java.util.List;

import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class cp
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:17 */     return "spawnpoint";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:22 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ICommandSender paramae)
/* 18:   */   {
/* 19:27 */     return "commands.spawnpoint.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 23:   */   {
/* 24:32 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length < 4)) {
/* 25:33 */       throw new WrongUsageException("commands.spawnpoint.usage", new Object[0]);
/* 26:   */     }
/* 27:36 */     qw localqw = paramArrayOfString.length > 0 ? a(paramae, paramArrayOfString[0]) : b(paramae);
/* 28:37 */     BlockPosition localdt = paramArrayOfString.length > 3 ? a(paramae, paramArrayOfString, 1, true) : localqw.c();
/* 29:38 */     if (localqw.world != null)
/* 30:   */     {
/* 31:39 */       localqw.a(localdt, true);
/* 32:40 */       a(paramae, this, "commands.spawnpoint.success", new Object[] { localqw.getName(), Integer.valueOf(localdt.getX()), Integer.valueOf(localdt.getY()), Integer.valueOf(localdt.getZ()) });
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 37:   */   {
/* 38:47 */     if (paramArrayOfString.length == 1) {
/* 39:48 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 40:   */     }
/* 41:49 */     if ((paramArrayOfString.length > 1) && (paramArrayOfString.length <= 4)) {
/* 42:50 */       return a(paramArrayOfString, 1, paramdt);
/* 43:   */     }
/* 44:53 */     return null;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 48:   */   {
/* 49:58 */     return paramInt == 0;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cp
 * JD-Core Version:    0.7.0.1
 */