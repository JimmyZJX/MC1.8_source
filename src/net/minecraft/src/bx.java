package net.minecraft.src;
/*  1:   */ import java.util.Arrays;
/*  2:   */ import java.util.List;

/*  3:   */ import net.minecraft.server.MinecraftServer;
/*  4:   */ 
/*  5:   */ public class bx
/*  6:   */   extends CommandBase
/*  7:   */ {
/*  8:   */   public List<String> b()
/*  9:   */   {
/* 10:22 */     return Arrays.asList(new String[] { "w", "msg" });
/* 11:   */   }
/* 12:   */   
/* 13:   */   public String c()
/* 14:   */   {
/* 15:27 */     return "tell";
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int a()
/* 19:   */   {
/* 20:32 */     return 0;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public String c(ICommandSender paramae)
/* 24:   */   {
/* 25:37 */     return "commands.message.usage";
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 29:   */   {
/* 30:42 */     if (paramArrayOfString.length < 2) {
/* 31:43 */       throw new WrongUsageException("commands.message.usage", new Object[0]);
/* 32:   */     }
/* 33:46 */     qw localqw = a(paramae, paramArrayOfString[0]);
/* 34:47 */     if (localqw == paramae) {
/* 35:48 */       throw new dm("commands.message.sameTarget", new Object[0]);
/* 36:   */     }
/* 37:51 */     ho localho = b(paramae, paramArrayOfString, 1, !(paramae instanceof EntityPlayer));
/* 38:52 */     hz localhz1 = new hz("commands.message.display.incoming", new Object[] { paramae.e_(), localho.f() });
/* 39:53 */     hz localhz2 = new hz("commands.message.display.outgoing", new Object[] { localqw.e_(), localho.f() });
/* 40:54 */     localhz1.b().a(a.h).b(Boolean.valueOf(true));
/* 41:55 */     localhz2.b().a(a.h).b(Boolean.valueOf(true));
/* 42:56 */     localqw.a(localhz1);
/* 43:57 */     paramae.a(localhz2);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 47:   */   {
/* 48:63 */     return a(paramArrayOfString, MinecraftServer.M().I());
/* 49:   */   }
/* 50:   */   
/* 51:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 52:   */   {
/* 53:68 */     return paramInt == 0;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bx
 * JD-Core Version:    0.7.0.1
 */