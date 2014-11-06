package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bwl
/*   4:    */   extends bxf
/*   5:    */   implements bvz
/*   6:    */ {
/*   7:    */   private int a;
/*   8: 14 */   private boolean f = false;
/*   9:    */   
/*  10:    */   public void b()
/*  11:    */   {
/*  12: 18 */     this.n.clear();
/*  13: 19 */     if (this.j.f.getWorldInfo().isHardcore())
/*  14:    */     {
/*  15: 20 */       if (this.j.D()) {
/*  16: 21 */         this.n.add(new bug(1, this.l / 2 - 100, this.m / 4 + 96, cwc.a("deathScreen.deleteWorld", new Object[0])));
/*  17:    */       } else {
/*  18: 23 */         this.n.add(new bug(1, this.l / 2 - 100, this.m / 4 + 96, cwc.a("deathScreen.leaveServer", new Object[0])));
/*  19:    */       }
/*  20:    */     }
/*  21:    */     else
/*  22:    */     {
/*  23: 26 */       this.n.add(new bug(0, this.l / 2 - 100, this.m / 4 + 72, cwc.a("deathScreen.respawn", new Object[0])));
/*  24: 27 */       this.n.add(new bug(1, this.l / 2 - 100, this.m / 4 + 96, cwc.a("deathScreen.titleScreen", new Object[0])));
/*  25: 29 */       if (this.j.K() == null) {
/*  26: 30 */         ((bug)this.n.get(1)).l = false;
/*  27:    */       }
/*  28:    */     }
/*  29: 33 */     for (bug localbug : this.n) {
/*  30: 34 */       localbug.l = false;
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void a(char paramChar, int paramInt) {}
/*  35:    */   
/*  36:    */   protected void a(bug parambug)
/*  37:    */   {
/*  38: 44 */     switch (parambug.k)
/*  39:    */     {
/*  40:    */     case 0: 
/*  41: 46 */       this.j.h.ca();
/*  42: 47 */       this.j.a((bxf)null);
/*  43: 48 */       break;
/*  44:    */     case 1: 
/*  45: 50 */       bwa localbwa = new bwa(this, cwc.a("deathScreen.quit.confirm", new Object[0]), "", cwc.a("deathScreen.titleScreen", new Object[0]), cwc.a("deathScreen.respawn", new Object[0]), 0);
/*  46: 51 */       this.j.a(localbwa);
/*  47: 52 */       localbwa.b(20);
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(boolean paramBoolean, int paramInt)
/*  52:    */   {
/*  53: 59 */     if (paramBoolean)
/*  54:    */     {
/*  55: 60 */       this.j.f.H();
/*  56: 61 */       this.j.a((cen)null);
/*  57: 62 */       this.j.a(new bxq());
/*  58:    */     }
/*  59:    */     else
/*  60:    */     {
/*  61: 64 */       this.j.h.ca();
/*  62: 65 */       this.j.a((bxf)null);
/*  63:    */     }
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  67:    */   {
/*  68: 71 */     a(0, 0, this.l, this.m, 1615855616, -1602211792);
/*  69:    */     
/*  70: 73 */     cjm.glPushMatrix();
/*  71: 74 */     cjm.glScalef(2.0F, 2.0F, 2.0F);
/*  72:    */     
/*  73: 76 */     boolean bool = this.j.f.getWorldInfo().isHardcore();
/*  74:    */     
/*  75: 78 */     String str = bool ? cwc.a("deathScreen.title.hardcore", new Object[0]) : cwc.a("deathScreen.title", new Object[0]);
/*  76: 79 */     a(this.q, str, this.l / 2 / 2, 30, 16777215);
/*  77:    */     
/*  78: 81 */     cjm.glPopMatrix();
/*  79: 82 */     if (bool) {
/*  80: 83 */       a(this.q, cwc.a("deathScreen.hardcoreInfo", new Object[0]), this.l / 2, 144, 16777215);
/*  81:    */     }
/*  82: 85 */     a(this.q, cwc.a("deathScreen.score", new Object[0]) + ": " + net.minecraft.src.a.o + this.j.h.bW(), this.l / 2, 100, 16777215);
/*  83:    */     
/*  84: 87 */     super.a(paramInt1, paramInt2, paramFloat);
/*  85:    */   }
/*  86:    */   
/*  87:    */   public boolean d()
/*  88:    */   {
/*  89: 92 */     return false;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void e()
/*  93:    */   {
/*  94: 97 */     super.e();
/*  95:    */     
/*  96: 99 */     this.a += 1;
/*  97:100 */     if (this.a == 20) {
/*  98:101 */       for (bug localbug : this.n) {
/*  99:102 */         localbug.l = true;
/* 100:    */       }
/* 101:    */     }
/* 102:    */   }
/* 103:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwl
 * JD-Core Version:    0.7.0.1
 */