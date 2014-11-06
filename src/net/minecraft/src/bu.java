package net.minecraft.src;
/*  1:   */ public class bu
/*  2:   */   extends CommandBase
/*  3:   */ {
/*  4:   */   public String c()
/*  5:   */   {
/*  6:12 */     return "kill";
/*  7:   */   }
/*  8:   */   
/*  9:   */   public int a()
/* 10:   */   {
/* 11:17 */     return 2;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public String c(ICommandSender paramae)
/* 15:   */   {
/* 16:22 */     return "commands.kill.usage";
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 20:   */   {
/* 21:27 */     if (paramArrayOfString.length == 0)
/* 22:   */     {
/* 23:28 */       qw localObject = b(paramae);
/* 24:29 */       ((EntityPlayer)localObject).G();
/* 25:30 */       a(paramae, this, "commands.kill.successful", new Object[] { ((EntityPlayer)localObject).e_() });
/* 26:31 */       return;
/* 27:   */     }
/* 28:34 */     Object localObject = b(paramae, paramArrayOfString[0]);
/* 29:35 */     ((Entity)localObject).G();
/* 30:36 */     a(paramae, this, "commands.kill.successful", new Object[] { ((Entity)localObject).e_() });
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 34:   */   {
/* 35:41 */     return paramInt == 0;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bu
 * JD-Core Version:    0.7.0.1
 */