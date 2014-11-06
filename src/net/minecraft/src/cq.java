package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class cq
/*  4:   */   extends CommandBase
/*  5:   */ {
/*  6:   */   public boolean a(ICommandSender paramae)
/*  7:   */   {
/*  8:14 */     return (MinecraftServer.M().S()) || (super.a(paramae));
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String c()
/* 12:   */   {
/* 13:19 */     return "seed";
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int a()
/* 17:   */   {
/* 18:24 */     return 2;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String c(ICommandSender paramae)
/* 22:   */   {
/* 23:29 */     return "commands.seed.usage";
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(ICommandSender paramae, String[] paramArrayOfString)
/* 27:   */   {
/* 28:34 */     WorldServer localqt = (paramae instanceof EntityPlayer) ? (WorldServer)((EntityPlayer)paramae).world : MinecraftServer.M().a(0);
/* 29:35 */     paramae.a(new hz("commands.seed.success", new Object[] { Long.valueOf(localqt.J()) }));
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cq
 * JD-Core Version:    0.7.0.1
 */