package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class byj
/*   4:    */   extends bxf
/*   5:    */ {
/*   6: 17 */   private static final btr[] h = { btr.a, btr.b, btr.y };
/*   7:    */   private bxf i;
/*   8: 22 */   protected String a = "Controls";
/*   9:    */   private bto r;
/*  10: 24 */   public bsr f = null;
/*  11:    */   public long g;
/*  12:    */   private byf s;
/*  13:    */   private bug t;
/*  14:    */   
/*  15:    */   public byj(bxf parambxf, bto parambto)
/*  16:    */   {
/*  17: 30 */     this.i = parambxf;
/*  18: 31 */     this.r = parambto;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void b()
/*  22:    */   {
/*  23: 36 */     this.s = new byf(this, this.j);
/*  24: 37 */     this.n.add(new bug(200, this.l / 2 - 155, this.m - 29, 150, 20, cwc.a("gui.done", new Object[0])));
/*  25: 38 */     this.n.add(this.t = new bug(201, this.l / 2 - 155 + 160, this.m - 29, 150, 20, cwc.a("controls.resetAll", new Object[0])));
/*  26: 39 */     this.a = cwc.a("controls.title", new Object[0]);
/*  27:    */     
/*  28: 41 */     int j = 0;
/*  29: 42 */     for (btr localbtr : h)
/*  30:    */     {
/*  31: 43 */       if (localbtr.a()) {
/*  32: 44 */         this.n.add(new bvl(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, 18 + 24 * (j >> 1), localbtr));
/*  33:    */       } else {
/*  34: 46 */         this.n.add(new buw(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, 18 + 24 * (j >> 1), localbtr, this.r.c(localbtr)));
/*  35:    */       }
/*  36: 49 */       j++;
/*  37:    */     }
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void k()
/*  41:    */   {
/*  42: 55 */     super.k();
/*  43: 56 */     this.s.p();
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected void a(bug parambug)
/*  47:    */   {
/*  48: 61 */     if (parambug.k == 200)
/*  49:    */     {
/*  50: 62 */       this.j.a(this.i);
/*  51:    */     }
/*  52: 63 */     else if (parambug.k == 201)
/*  53:    */     {
/*  54: 64 */       for (bsr localbsr : this.j.t.at) {
/*  55: 65 */         localbsr.b(localbsr.h());
/*  56:    */       }
/*  57: 67 */       bsr.b();
/*  58:    */     }
/*  59: 68 */     else if ((parambug.k < 100) && ((parambug instanceof buw)))
/*  60:    */     {
/*  61: 69 */       this.r.a(((buw)parambug).c(), 1);
/*  62: 70 */       parambug.j = this.r.c(btr.a(parambug.k));
/*  63:    */     }
/*  64:    */   }
/*  65:    */   
/*  66:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*  67:    */   {
/*  68: 76 */     if (this.f != null)
/*  69:    */     {
/*  70: 77 */       this.r.a(this.f, -100 + paramInt3);
/*  71: 78 */       this.f = null;
/*  72: 79 */       bsr.b();
/*  73:    */     }
/*  74: 80 */     else if ((paramInt3 != 0) || (!this.s.b(paramInt1, paramInt2, paramInt3)))
/*  75:    */     {
/*  76: 81 */       super.a(paramInt1, paramInt2, paramInt3);
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/*  81:    */   {
/*  82: 87 */     if ((paramInt3 != 0) || (!this.s.c(paramInt1, paramInt2, paramInt3))) {
/*  83: 88 */       super.b(paramInt1, paramInt2, paramInt3);
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   protected void a(char paramChar, int paramInt)
/*  88:    */   {
/*  89: 94 */     if (this.f != null)
/*  90:    */     {
/*  91: 95 */       if (paramInt == 1) {
/*  92: 96 */         this.r.a(this.f, 0);
/*  93: 97 */       } else if (paramInt != 0) {
/*  94: 98 */         this.r.a(this.f, paramInt);
/*  95: 99 */       } else if (paramChar > 0) {
/*  96:100 */         this.r.a(this.f, paramChar + 'Ā');
/*  97:    */       }
/*  98:103 */       this.f = null;
/*  99:104 */       this.g = bsu.I();
/* 100:105 */       bsr.b();
/* 101:    */     }
/* 102:    */     else
/* 103:    */     {
/* 104:107 */       super.a(paramChar, paramInt);
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 109:    */   {
/* 110:113 */     c();
/* 111:    */     
/* 112:115 */     this.s.a(paramInt1, paramInt2, paramFloat);
/* 113:116 */     a(this.q, this.a, this.l / 2, 8, 16777215);
/* 114:    */     
/* 115:118 */     int j = 1;
/* 116:120 */     for (bsr localbsr : this.r.at) {
/* 117:121 */       if (localbsr.i() != localbsr.h())
/* 118:    */       {
/* 119:122 */         j = 0;
/* 120:123 */         break;
/* 121:    */       }
/* 122:    */     }
/* 123:127 */     this.t.l = (j == 0);
/* 124:    */     
/* 125:129 */     super.a(paramInt1, paramInt2, paramFloat);
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byj
 * JD-Core Version:    0.7.0.1
 */