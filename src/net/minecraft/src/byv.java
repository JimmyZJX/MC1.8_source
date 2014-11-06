package net.minecraft.src;
/*   1:    */ import io.netty.buffer.Unpooled;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ import org.lwjgl.input.Keyboard;
/*   6:    */ 
/*   7:    */ public class byv
/*   8:    */   extends bxf
/*   9:    */ {
/*  10: 16 */   private static final Logger a = LogManager.getLogger();
/*  11:    */   private bul f;
/*  12:    */   private bul g;
/*  13:    */   private final aqf h;
/*  14:    */   private bug i;
/*  15:    */   private bug r;
/*  16:    */   private bug s;
/*  17:    */   private boolean t;
/*  18:    */   
/*  19:    */   public byv(aqf paramaqf)
/*  20:    */   {
/*  21: 32 */     this.h = paramaqf;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void e()
/*  25:    */   {
/*  26: 37 */     this.f.a();
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void b()
/*  30:    */   {
/*  31: 42 */     Keyboard.enableRepeatEvents(true);
/*  32: 43 */     this.n.clear();
/*  33: 44 */     this.n.add(this.i = new bug(0, this.l / 2 - 4 - 150, this.m / 4 + 120 + 12, 150, 20, cwc.a("gui.done", new Object[0])));
/*  34: 45 */     this.n.add(this.r = new bug(1, this.l / 2 + 4, this.m / 4 + 120 + 12, 150, 20, cwc.a("gui.cancel", new Object[0])));
/*  35: 46 */     this.n.add(this.s = new bug(4, this.l / 2 + 150 - 20, 150, 20, 20, "O"));
/*  36:    */     
/*  37: 48 */     this.f = new bul(2, this.q, this.l / 2 - 150, 50, 300, 20);
/*  38: 49 */     this.f.f(32767);
/*  39: 50 */     this.f.b(true);
/*  40: 51 */     this.f.a(this.h.l());
/*  41:    */     
/*  42: 53 */     this.g = new bul(3, this.q, this.l / 2 - 150, 150, 276, 20);
/*  43: 54 */     this.g.f(32767);
/*  44: 55 */     this.g.c(false);
/*  45: 56 */     this.g.a("-");
/*  46:    */     
/*  47: 58 */     this.t = this.h.m();
/*  48: 59 */     a();
/*  49:    */     
/*  50: 61 */     this.i.l = (this.f.b().trim().length() > 0);
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void m()
/*  54:    */   {
/*  55: 66 */     Keyboard.enableRepeatEvents(false);
/*  56:    */   }
/*  57:    */   
/*  58:    */   protected void a(bug parambug)
/*  59:    */   {
/*  60: 71 */     if (!parambug.l) {
/*  61: 72 */       return;
/*  62:    */     }
/*  63: 74 */     if (parambug.k == 1)
/*  64:    */     {
/*  65: 75 */       this.h.a(this.t);
/*  66: 76 */       this.j.a((bxf)null);
/*  67:    */     }
/*  68: 77 */     else if (parambug.k == 0)
/*  69:    */     {
/*  70: 78 */       ByteBufWrapper localhd = new ByteBufWrapper(Unpooled.buffer());
/*  71:    */       
/*  72: 80 */       localhd.writeByte(this.h.i());
/*  73: 81 */       this.h.a(localhd);
/*  74: 82 */       localhd.a(this.f.b());
/*  75: 83 */       localhd.writeBoolean(this.h.m());
/*  76: 84 */       this.j.t().a(new mc("MC|AdvCdm", localhd));
/*  77: 86 */       if (!this.h.m()) {
/*  78: 87 */         this.h.b((ho)null);
/*  79:    */       }
/*  80: 89 */       this.j.a((bxf)null);
/*  81:    */     }
/*  82: 90 */     else if (parambug.k == 4)
/*  83:    */     {
/*  84: 91 */       this.h.a(!this.h.m());
/*  85: 92 */       a();
/*  86:    */     }
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected void a(char paramChar, int paramInt)
/*  90:    */   {
/*  91: 98 */     this.f.a(paramChar, paramInt);
/*  92: 99 */     this.g.a(paramChar, paramInt);
/*  93:100 */     this.i.l = (this.f.b().trim().length() > 0);
/*  94:102 */     if ((paramInt == 28) || (paramInt == 156)) {
/*  95:103 */       a(this.i);
/*  96:104 */     } else if (paramInt == 1) {
/*  97:105 */       a(this.r);
/*  98:    */     }
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 102:    */   {
/* 103:111 */     super.a(paramInt1, paramInt2, paramInt3);
/* 104:    */     
/* 105:113 */     this.f.a(paramInt1, paramInt2, paramInt3);
/* 106:114 */     this.g.a(paramInt1, paramInt2, paramInt3);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 110:    */   {
/* 111:119 */     c();
/* 112:    */     
/* 113:121 */     a(this.q, cwc.a("advMode.setCommand", new Object[0]), this.l / 2, 20, 16777215);
/* 114:122 */     c(this.q, cwc.a("advMode.command", new Object[0]), this.l / 2 - 150, 37, 10526880);
/* 115:123 */     this.f.g();
/* 116:    */     
/* 117:125 */     int j = 75;
/* 118:126 */     int k = 0;
/* 119:    */     
/* 120:128 */     c(this.q, cwc.a("advMode.nearestPlayer", new Object[0]), this.l / 2 - 150, j + k++ * this.q.a, 10526880);
/* 121:129 */     c(this.q, cwc.a("advMode.randomPlayer", new Object[0]), this.l / 2 - 150, j + k++ * this.q.a, 10526880);
/* 122:130 */     c(this.q, cwc.a("advMode.allPlayers", new Object[0]), this.l / 2 - 150, j + k++ * this.q.a, 10526880);
/* 123:131 */     c(this.q, cwc.a("advMode.allEntities", new Object[0]), this.l / 2 - 150, j + k++ * this.q.a, 10526880);
/* 124:132 */     c(this.q, "", this.l / 2 - 150, j + k++ * this.q.a, 10526880);
/* 125:134 */     if (this.g.b().length() > 0)
/* 126:    */     {
/* 127:135 */       j += k * this.q.a + 16;
/* 128:136 */       c(this.q, cwc.a("advMode.previousOutput", new Object[0]), this.l / 2 - 150, j, 10526880);
/* 129:137 */       this.g.g();
/* 130:    */     }
/* 131:140 */     super.a(paramInt1, paramInt2, paramFloat);
/* 132:    */   }
/* 133:    */   
/* 134:    */   private void a()
/* 135:    */   {
/* 136:144 */     if (this.h.m())
/* 137:    */     {
/* 138:145 */       this.s.j = "O";
/* 139:146 */       if (this.h.k() != null) {
/* 140:147 */         this.g.a(this.h.k().c());
/* 141:    */       }
/* 142:    */     }
/* 143:    */     else
/* 144:    */     {
/* 145:150 */       this.s.j = "X";
/* 146:151 */       this.g.a("-");
/* 147:    */     }
/* 148:    */   }
/* 149:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byv
 * JD-Core Version:    0.7.0.1
 */