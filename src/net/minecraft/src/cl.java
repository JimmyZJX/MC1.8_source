package net.minecraft.src;
/*   1:    */ import net.minecraft.server.MinecraftServer;
/*   2:    */ 
/*   3:    */ public class cl
/*   4:    */   extends ab
/*   5:    */   implements IAdminCommand
/*   6:    */ {
/*   7:    */   public cl()
/*   8:    */   {
/*   9: 14 */     a(new da());
/*  10: 15 */     a(new bp());
/*  11: 16 */     a(new bo());
/*  12: 17 */     a(new bf());
/*  13: 18 */     a(new bu());
/*  14: 19 */     a(new dc());
/*  15: 20 */     a(new de());
/*  16: 21 */     a(new bm());
/*  17: 22 */     a(new CommandServerTp());
/*  18: 23 */     a(new br());
/*  19: 24 */     a(new cf());
/*  20: 25 */     a(new ct());
/*  21: 26 */     a(new bg());
/*  22: 27 */     a(new bi());
/*  23: 28 */     a(new cc());
/*  24: 29 */     a(new bh());
/*  25: 30 */     a(new cq());
/*  26: 31 */     a(new bs());
/*  27: 32 */     a(new be());
/*  28: 33 */     a(new bx());
/*  29: 34 */     a(new cj());
/*  30: 35 */     a(new cp());
/*  31: 36 */     a(new cn());
/*  32: 37 */     a(new bq());
/*  33: 38 */     a(new az());
/*  34: 39 */     a(new cz());
/*  35: 40 */     a(new cr());
/*  36: 41 */     a(new cd());
/*  37: 42 */     a(new ck());
/*  38: 43 */     a(new bk());
/*  39: 44 */     a(new dd());
/*  40: 45 */     a(new au());
/*  41: 46 */     a(new cv());
/*  42: 47 */     a(new cm());
/*  43: 48 */     a(new bn());
/*  44: 49 */     a(new ba());
/*  45: 50 */     a(new bc());
/*  46: 51 */     a(new ay());
/*  47: 52 */     a(new cy());
/*  48: 53 */     a(new by());
/*  49: 54 */     a(new dg());
/*  50: 55 */     a(new db());
/*  51: 56 */     a(new bj());
/*  52: 58 */     if (MinecraftServer.M().ad())
/*  53:    */     {
/*  54: 59 */       a(new bz());
/*  55: 60 */       a(new bd());
/*  56: 61 */       a(new cu());
/*  57: 62 */       a(new cg());
/*  58: 63 */       a(new ch());
/*  59: 64 */       a(new ci());
/*  60: 65 */       a(new aw());
/*  61: 66 */       a(new ca());
/*  62: 67 */       a(new ax());
/*  63: 68 */       a(new bv());
/*  64: 69 */       a(new cb());
/*  65: 70 */       a(new bt());
/*  66: 71 */       a(new bw());
/*  67: 72 */       a(new df());
/*  68: 73 */       a(new co());
/*  69:    */     }
/*  70:    */     else
/*  71:    */     {
/*  72: 75 */       a(new ce());
/*  73:    */     }
/*  74: 78 */     CommandBase.a(this);
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(ICommandSender paramae, ICommand paramac, int paramInt, String paramString, Object... paramVarArgs)
/*  78:    */   {
/*  79: 83 */     int i = 1;
/*  80:    */     
/*  81: 85 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/*  82: 86 */     if (!paramae.t_()) {
/*  83: 87 */       i = 0;
/*  84:    */     }
/*  85: 90 */     hz localhz = new hz("chat.type.admin", new Object[] { paramae.getName(), new hz(paramString, paramVarArgs) });
/*  86: 91 */     localhz.b().a(a.h);
/*  87: 92 */     localhz.b().b(Boolean.valueOf(true));
/*  88: 94 */     if (i != 0) {
/*  89: 95 */       for (EntityPlayer localahd : localMinecraftServer.an().e) {
/*  90: 96 */         if ((localahd != paramae) && (localMinecraftServer.an().g(localahd.cc())) && (paramac.a(paramae))) {
/*  91: 97 */           localahd.a(localhz);
/*  92:    */         }
/*  93:    */       }
/*  94:    */     }
/*  95:102 */     if ((paramae != localMinecraftServer) && (localMinecraftServer.c[0].getGameRules().getBoolean("logAdminCommands"))) {
/*  96:103 */       localMinecraftServer.a(localhz);
/*  97:    */     }
/*  98:106 */     boolean bool = localMinecraftServer.c[0].getGameRules().getBoolean("sendCommandFeedback");
/*  99:107 */     if ((paramae instanceof aqf)) {
/* 100:108 */       bool = ((aqf)paramae).m();
/* 101:    */     }
/* 102:110 */     if (((paramInt & 0x1) != 1) && (bool)) {
/* 103:111 */       paramae.a(new hz(paramString, paramVarArgs));
/* 104:    */     }
/* 105:    */   }
/* 106:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cl
 * JD-Core Version:    0.7.0.1
 */