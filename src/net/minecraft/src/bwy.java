package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bwy
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   private int a;
/*  7:   */   private int f;
/*  8:   */   
/*  9:   */   public void b()
/* 10:   */   {
/* 11:14 */     this.a = 0;
/* 12:15 */     this.n.clear();
/* 13:   */     
/* 14:17 */     int i = -16;
/* 15:18 */     int j = 98;
/* 16:19 */     this.n.add(new bug(1, this.l / 2 - 100, this.m / 4 + 120 + i, cwc.a("menu.returnToMenu", new Object[0])));
/* 17:20 */     if (!this.j.D()) {
/* 18:21 */       ((bug)this.n.get(0)).j = cwc.a("menu.disconnect", new Object[0]);
/* 19:   */     }
/* 20:24 */     this.n.add(new bug(4, this.l / 2 - 100, this.m / 4 + 24 + i, cwc.a("menu.returnToGame", new Object[0])));
/* 21:25 */     this.n.add(new bug(0, this.l / 2 - 100, this.m / 4 + 96 + i, 98, 20, cwc.a("menu.options", new Object[0])));
/* 22:   */     bug localbug;
/* 23:27 */     this.n.add(localbug = new bug(7, this.l / 2 + 2, this.m / 4 + 96 + i, 98, 20, cwc.a("menu.shareToLan", new Object[0])));
/* 24:   */     
/* 25:29 */     this.n.add(new bug(5, this.l / 2 - 100, this.m / 4 + 48 + i, 98, 20, cwc.a("gui.achievements", new Object[0])));
/* 26:30 */     this.n.add(new bug(6, this.l / 2 + 2, this.m / 4 + 48 + i, 98, 20, cwc.a("gui.stats", new Object[0])));
/* 27:   */     
/* 28:32 */     localbug.l = ((this.j.E()) && (!this.j.F().b()));
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected void a(bug parambug)
/* 32:   */   {
/* 33:37 */     switch (parambug.k)
/* 34:   */     {
/* 35:   */     case 0: 
/* 36:39 */       this.j.a(new bwv(this, this.j.t));
/* 37:40 */       break;
/* 38:   */     case 1: 
/* 39:44 */       parambug.l = false;
/* 40:45 */       this.j.f.H();
/* 41:46 */       this.j.a((cen)null);
/* 42:47 */       this.j.a(new bxq());
/* 43:48 */       break;
/* 44:   */     case 4: 
/* 45:50 */       this.j.a((bxf)null);
/* 46:51 */       this.j.n();
/* 47:52 */       break;
/* 48:   */     case 5: 
/* 49:54 */       this.j.a(new AchievementGUI(this, this.j.h.x()));
/* 50:55 */       break;
/* 51:   */     case 6: 
/* 52:57 */       this.j.a(new bxv(this, this.j.h.x()));
/* 53:58 */       break;
/* 54:   */     case 7: 
/* 55:60 */       this.j.a(new bxi(this));
/* 56:   */     }
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void e()
/* 60:   */   {
/* 61:67 */     super.e();
/* 62:68 */     this.f += 1;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 66:   */   {
/* 67:73 */     c();
/* 68:   */     
/* 69:75 */     a(this.q, cwc.a("menu.game", new Object[0]), this.l / 2, 40, 16777215);
/* 70:   */     
/* 71:77 */     super.a(paramInt1, paramInt2, paramFloat);
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwy
 * JD-Core Version:    0.7.0.1
 */