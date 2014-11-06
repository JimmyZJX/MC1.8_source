package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import com.mojang.authlib.GameProfile;
/*  3:   */ import java.util.ArrayList;
/*  4:   */ import java.util.List;
/*  5:   */ import net.minecraft.server.MinecraftServer;
/*  6:   */ 
/*  7:   */ public class bz
/*  8:   */   extends CommandBase
/*  9:   */ {
/* 10:   */   public String c()
/* 11:   */   {
/* 12:18 */     return "op";
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int a()
/* 16:   */   {
/* 17:23 */     return 3;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String c(ICommandSender paramae)
/* 21:   */   {
/* 22:28 */     return "commands.op.usage";
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 26:   */   {
/* 27:33 */     if ((paramArrayOfString.length != 1) || (paramArrayOfString[0].length() <= 0)) {
/* 28:34 */       throw new WrongUsageException("commands.op.usage", new Object[0]);
/* 29:   */     }
/* 30:37 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 31:38 */     GameProfile localGameProfile = localMinecraftServer.aD().a(paramArrayOfString[0]);
/* 32:39 */     if (localGameProfile == null) {
/* 33:40 */       throw new CommandException("commands.op.failed", new Object[] { paramArrayOfString[0] });
/* 34:   */     }
/* 35:43 */     localMinecraftServer.an().a(localGameProfile);
/* 36:44 */     a(paramae, this, "commands.op.success", new Object[] { paramArrayOfString[0] });
/* 37:   */   }
/* 38:   */   
/* 39:   */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 40:   */   {
/* 41:50 */     if (paramArrayOfString.length == 1)
/* 42:   */     {
/* 43:51 */       String str = paramArrayOfString[(paramArrayOfString.length - 1)];
/* 44:52 */       ArrayList<String> localArrayList = Lists.newArrayList();
/* 45:54 */       for (GameProfile localGameProfile : MinecraftServer.M().J()) {
/* 46:55 */         if ((!MinecraftServer.M().an().g(localGameProfile)) && (a(str, localGameProfile.getName()))) {
/* 47:56 */           localArrayList.add(localGameProfile.getName());
/* 48:   */         }
/* 49:   */       }
/* 50:60 */       return localArrayList;
/* 51:   */     }
/* 52:63 */     return null;
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bz
 * JD-Core Version:    0.7.0.1
 */