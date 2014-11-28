package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class bxi
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   private final bxf a;
/*  7:   */   private bug f;
/*  8:   */   private bug g;
/*  9:20 */   private String h = "survival";
/* 10:   */   private boolean i;
/* 11:   */   
/* 12:   */   public bxi(bxf parambxf)
/* 13:   */   {
/* 14:24 */     this.a = parambxf;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void b()
/* 18:   */   {
/* 19:29 */     this.n.clear();
/* 20:30 */     this.n.add(new bug(101, this.l / 2 - 155, this.m - 28, 150, 20, cwc.a("lanServer.start", new Object[0])));
/* 21:31 */     this.n.add(new bug(102, this.l / 2 + 5, this.m - 28, 150, 20, cwc.a("gui.cancel", new Object[0])));
/* 22:   */     
/* 23:33 */     this.n.add(this.g = new bug(104, this.l / 2 - 155, 100, 150, 20, cwc.a("selectWorld.gameMode", new Object[0])));
/* 24:34 */     this.n.add(this.f = new bug(103, this.l / 2 + 5, 100, 150, 20, cwc.a("selectWorld.allowCommands", new Object[0])));
/* 25:   */     
/* 26:36 */     a();
/* 27:   */   }
/* 28:   */   
/* 29:   */   private void a()
/* 30:   */   {
/* 31:40 */     this.g.j = (cwc.a("selectWorld.gameMode", new Object[0]) + " " + cwc.a(new StringBuilder().append("selectWorld.gameMode.").append(this.h).toString(), new Object[0]));
/* 32:   */     
/* 33:42 */     this.f.j = (cwc.a("selectWorld.allowCommands", new Object[0]) + " ");
/* 34:43 */     if (this.i) {
/* 35:44 */       this.f.j += cwc.a("options.on", new Object[0]);
/* 36:   */     } else {
/* 37:46 */       this.f.j += cwc.a("options.off", new Object[0]);
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void a(bug parambug)
/* 42:   */   {
/* 43:52 */     if (parambug.k == 102)
/* 44:   */     {
/* 45:53 */       this.j.a(this.a);
/* 46:   */     }
/* 47:54 */     else if (parambug.k == 104)
/* 48:   */     {
/* 49:55 */       if (this.h.equals("spectator")) {
/* 50:56 */         this.h = "creative";
/* 51:57 */       } else if (this.h.equals("creative")) {
/* 52:58 */         this.h = "adventure";
/* 53:59 */       } else if (this.h.equals("adventure")) {
/* 54:60 */         this.h = "survival";
/* 55:   */       } else {
/* 56:62 */         this.h = "spectator";
/* 57:   */       }
/* 58:64 */       a();
/* 59:   */     }
/* 60:65 */     else if (parambug.k == 103)
/* 61:   */     {
/* 62:66 */       this.i = (!this.i);
/* 63:67 */       a();
/* 64:   */     }
/* 65:68 */     else if (parambug.k == 101)
/* 66:   */     {
/* 67:69 */       this.j.a((bxf)null);
/* 68:70 */       String str = this.j.F().a(EnumGameMode.a(this.h), this.i);
/* 69:   */       Object localObject;
/* 70:73 */       if (str != null) {
/* 71:74 */         localObject = new hz("commands.publish.started", new Object[] { str });
/* 72:   */       } else {
/* 73:76 */         localObject = new hy("commands.publish.failed");
/* 74:   */       }
/* 75:79 */       this.j.q.d().a((ho)localObject);
/* 76:   */     }
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 80:   */   {
/* 81:85 */     c();
/* 82:   */     
/* 83:87 */     a(this.q, cwc.a("lanServer.title", new Object[0]), this.l / 2, 50, 16777215);
/* 84:88 */     a(this.q, cwc.a("lanServer.otherPlayers", new Object[0]), this.l / 2, 82, 16777215);
/* 85:   */     
/* 86:90 */     super.a(paramInt1, paramInt2, paramFloat);
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxi
 * JD-Core Version:    0.7.0.1
 */