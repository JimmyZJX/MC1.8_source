package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class caj
/*   4:    */   extends bxf
/*   5:    */ {
/*   6: 14 */   private static final btr[] a = { btr.F, btr.J, btr.I, btr.L, btr.G, btr.H, btr.O, btr.K };
/*   7: 24 */   private static final btr[] f = { btr.M, btr.N };
/*   8:    */   private final bxf g;
/*   9:    */   private final bto h;
/*  10:    */   private String i;
/*  11:    */   private String r;
/*  12:    */   private int s;
/*  13: 34 */   private boolean t = false;
/*  14:    */   
/*  15:    */   public caj(bxf parambxf, bto parambto)
/*  16:    */   {
/*  17: 37 */     this.g = parambxf;
/*  18: 38 */     this.h = parambto;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void b()
/*  22:    */   {
/*  23: 43 */     int j = 0;
/*  24: 44 */     this.i = cwc.a("options.stream.title", new Object[0]);
/*  25: 45 */     this.r = cwc.a("options.stream.chat.title", new Object[0]);
/*  26:    */     
/*  27: 47 */     for (btr localbtr : a)
/*  28:    */     {
/*  29: 48 */       if (localbtr.a()) {
/*  30: 49 */         this.n.add(new bvl(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbtr));
/*  31:    */       } else {
/*  32: 51 */         this.n.add(new buw(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbtr, this.h.c(localbtr)));
/*  33:    */       }
/*  34: 54 */       j++;
/*  35:    */     }
/*  36: 57 */     if (j % 2 == 1) {
/*  37: 58 */       j++;
/*  38:    */     }
/*  39: 60 */     this.s = (this.m / 6 + 24 * (j >> 1) + 6);
/*  40: 61 */     j += 2;
/*  41: 63 */     for (btr localbtr : f)
/*  42:    */     {
/*  43: 64 */       if (localbtr.a()) {
/*  44: 65 */         this.n.add(new bvl(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbtr));
/*  45:    */       } else {
/*  46: 67 */         this.n.add(new buw(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbtr, this.h.c(localbtr)));
/*  47:    */       }
/*  48: 70 */       j++;
/*  49:    */     }
/*  50: 73 */     this.n.add(new bug(200, this.l / 2 - 155, this.m / 6 + 168, 150, 20, cwc.a("gui.done", new Object[0])));
/*  51: 74 */     bug localbug = new bug(201, this.l / 2 + 5, this.m / 6 + 168, 150, 20, cwc.a("options.stream.ingestSelection", new Object[0]));
/*  52: 75 */     localbug.l = (((this.j.W().j()) && (this.j.W().s().length > 0)) || (this.j.W().w()));
/*  53: 76 */     this.n.add(localbug);
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected void a(bug parambug)
/*  57:    */   {
/*  58: 81 */     if (!parambug.l) {
/*  59: 82 */       return;
/*  60:    */     }
/*  61: 85 */     if ((parambug.k < 100) && ((parambug instanceof buw)))
/*  62:    */     {
/*  63: 86 */       btr localbtr = ((buw)parambug).c();
/*  64: 87 */       this.h.a(localbtr, 1);
/*  65: 88 */       parambug.j = this.h.c(btr.a(parambug.k));
/*  66: 90 */       if ((this.j.W().k()) && (localbtr != btr.M) && (localbtr != btr.N)) {
/*  67: 91 */         this.t = true;
/*  68:    */       }
/*  69:    */     }
/*  70: 93 */     else if ((parambug instanceof bvl))
/*  71:    */     {
/*  72: 94 */       if (parambug.k == btr.G.c()) {
/*  73: 95 */         this.j.W().p();
/*  74: 96 */       } else if (parambug.k == btr.H.c()) {
/*  75: 97 */         this.j.W().p();
/*  76: 98 */       } else if (this.j.W().k()) {
/*  77: 99 */         this.t = true;
/*  78:    */       }
/*  79:    */     }
/*  80:103 */     if (parambug.k == 200)
/*  81:    */     {
/*  82:104 */       this.j.t.b();
/*  83:105 */       this.j.a(this.g);
/*  84:    */     }
/*  85:106 */     else if (parambug.k == 201)
/*  86:    */     {
/*  87:107 */       this.j.t.b();
/*  88:108 */       this.j.a(new cah(this));
/*  89:    */     }
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  93:    */   {
/*  94:114 */     c();
/*  95:115 */     a(this.q, this.i, this.l / 2, 20, 16777215);
/*  96:116 */     a(this.q, this.r, this.l / 2, this.s, 16777215);
/*  97:118 */     if (this.t) {
/*  98:119 */       a(this.q, net.minecraft.src.a.m + cwc.a("options.stream.changes", new Object[0]), this.l / 2, 20 + this.q.a, 16777215);
/*  99:    */     }
/* 100:122 */     super.a(paramInt1, paramInt2, paramFloat);
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     caj
 * JD-Core Version:    0.7.0.1
 */