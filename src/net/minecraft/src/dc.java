package net.minecraft.src;
/*  1:   */ public class dc
/*  2:   */   extends CommandBase
/*  3:   */ {
/*  4:   */   public String c()
/*  5:   */   {
/*  6:12 */     return "toggledownfall";
/*  7:   */   }
/*  8:   */   
/*  9:   */   public int a()
/* 10:   */   {
/* 11:17 */     return 2;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public String c(ICommandSender paramae)
/* 15:   */   {
/* 16:22 */     return "commands.downfall.usage";
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(ICommandSender paramae, String[] paramArrayOfString)
/* 20:   */   {
/* 21:27 */     d();
/* 22:28 */     a(paramae, this, "commands.downfall.success", new Object[0]);
/* 23:   */   }
/* 24:   */   
/* 25:   */   protected void d()
/* 26:   */   {
/* 27:32 */     WorldInfo localbqo = net.minecraft.server.MinecraftServer.M().c[0].getWorldInfo();
/* 28:   */     
/* 29:34 */     localbqo.b(!localbqo.p());
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dc
 * JD-Core Version:    0.7.0.1
 */