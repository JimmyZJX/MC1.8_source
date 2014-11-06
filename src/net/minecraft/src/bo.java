package net.minecraft.src;
/*  1:   */ import java.util.List;

import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bo
/*  5:   */   extends CommandBase
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:19 */     return "difficulty";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:24 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ICommandSender paramae)
/* 18:   */   {
/* 19:29 */     return "commands.difficulty.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 23:   */   {
/* 24:34 */     if (paramArrayOfString.length <= 0) {
/* 25:35 */       throw new WrongUsageException("commands.difficulty.usage", new Object[0]);
/* 26:   */     }
/* 27:38 */     EnumDifficulty localvt = e(paramArrayOfString[0]);
/* 28:39 */     MinecraftServer.M().a(localvt);
/* 29:   */     
/* 30:41 */     a(paramae, this, "commands.difficulty.success", new Object[] { new hz(localvt.b(), new Object[0]) });
/* 31:   */   }
/* 32:   */   
/* 33:   */   protected EnumDifficulty e(String paramString) throws NumberInvalidException
/* 34:   */   {
/* 35:45 */     if ((paramString.equalsIgnoreCase("peaceful")) || (paramString.equalsIgnoreCase("p"))) {
/* 36:46 */       return EnumDifficulty.PEACEFUL;
/* 37:   */     }
/* 38:47 */     if ((paramString.equalsIgnoreCase("easy")) || (paramString.equalsIgnoreCase("e"))) {
/* 39:48 */       return EnumDifficulty.EASY;
/* 40:   */     }
/* 41:49 */     if ((paramString.equalsIgnoreCase("normal")) || (paramString.equalsIgnoreCase("n"))) {
/* 42:50 */       return EnumDifficulty.NORMAL;
/* 43:   */     }
/* 44:51 */     if ((paramString.equalsIgnoreCase("hard")) || (paramString.equalsIgnoreCase("h"))) {
/* 45:52 */       return EnumDifficulty.HARD;
/* 46:   */     }
/* 47:54 */     return EnumDifficulty.a(a(paramString, 0, 3));
/* 48:   */   }
/* 49:   */   
/* 50:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 51:   */   {
/* 52:61 */     if (paramArrayOfString.length == 1) {
/* 53:62 */       return a(paramArrayOfString, new String[] { "peaceful", "easy", "normal", "hard" });
/* 54:   */     }
/* 55:65 */     return null;
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bo
 * JD-Core Version:    0.7.0.1
 */