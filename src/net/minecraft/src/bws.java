package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class bws
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   protected bxf a;
/*  7:   */   private bwt f;
/*  8:   */   private final bto g;
/*  9:   */   private final cwe h;
/* 10:   */   private buw i;
/* 11:   */   private buw r;
/* 12:   */   
/* 13:   */   public bws(bxf parambxf, bto parambto, cwe paramcwe)
/* 14:   */   {
/* 15:28 */     this.a = parambxf;
/* 16:29 */     this.g = parambto;
/* 17:30 */     this.h = paramcwe;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void b()
/* 21:   */   {
/* 22:35 */     this.n.add(this.i = new buw(100, this.l / 2 - 155, this.m - 38, btr.E, this.g.c(btr.E)));
/* 23:36 */     this.n.add(this.r = new buw(6, this.l / 2 - 155 + 160, this.m - 38, cwc.a("gui.done", new Object[0])));
/* 24:   */     
/* 25:38 */     this.f = new bwt(this, this.j);
/* 26:39 */     this.f.d(7, 8);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void k()
/* 30:   */   {
/* 31:44 */     super.k();
/* 32:45 */     this.f.p();
/* 33:   */   }
/* 34:   */   
/* 35:   */   protected void a(bug parambug)
/* 36:   */   {
/* 37:50 */     if (!parambug.l) {
/* 38:51 */       return;
/* 39:   */     }
/* 40:54 */     switch (parambug.k)
/* 41:   */     {
/* 42:   */     case 100: 
/* 43:56 */       if ((parambug instanceof buw))
/* 44:   */       {
/* 45:57 */         this.g.a(((buw)parambug).c(), 1);
/* 46:58 */         parambug.j = this.g.c(btr.E);
/* 47:   */         
/* 48:60 */         buf localbuf = new buf(this.j, this.j.d, this.j.e);
/* 49:61 */         int j = localbuf.a();
/* 50:62 */         int k = localbuf.b();
/* 51:63 */         a(this.j, j, k);
/* 52:   */       }
/* 53:64 */       break;
/* 54:   */     case 5: 
/* 55:   */       break;
/* 56:   */     case 6: 
/* 57:69 */       this.j.a(this.a);
/* 58:70 */       break;
/* 59:   */     default: 
/* 60:72 */       this.f.a(parambug);
/* 61:   */     }
/* 62:   */   }
/* 63:   */   
/* 64:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 65:   */   {
/* 66:79 */     this.f.a(paramInt1, paramInt2, paramFloat);
/* 67:   */     
/* 68:81 */     a(this.q, cwc.a("options.language", new Object[0]), this.l / 2, 16, 16777215);
/* 69:82 */     a(this.q, "(" + cwc.a("options.languageWarning", new Object[0]) + ")", this.l / 2, this.m - 56, 8421504);
/* 70:   */     
/* 71:84 */     super.a(paramInt1, paramInt2, paramFloat);
/* 72:   */   }  
			  static cwe a(bws arg0) {return arg0.h;}
			  static bto b(bws arg0) {return arg0.g;}
			  static buw c(bws arg0) {return arg0.r;}
			  static buw d(bws arg0) {return arg0.i;}
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bws
 * JD-Core Version:    0.7.0.1
 */