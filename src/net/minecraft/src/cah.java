package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class cah
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   private final bxf a;
/*  7:   */   private String f;
/*  8:   */   private cai g;
/*  9:   */   
/* 10:   */   public cah(bxf parambxf)
/* 11:   */   {
/* 12:21 */     this.a = parambxf;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void b()
/* 16:   */   {
/* 17:26 */     this.f = cwc.a("options.stream.ingest.title", new Object[0]);
/* 18:27 */     this.g = new cai(this, this.j);
/* 19:28 */     if (!this.j.W().w()) {
/* 20:29 */       this.j.W().u();
/* 21:   */     }
/* 22:32 */     this.n.add(new bug(1, this.l / 2 - 155, this.m - 24 - 6, 150, 20, cwc.a("gui.done", new Object[0])));
/* 23:33 */     this.n.add(new bug(2, this.l / 2 + 5, this.m - 24 - 6, 150, 20, cwc.a("options.stream.ingest.reset", new Object[0])));
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void k()
/* 27:   */   {
/* 28:38 */     super.k();
/* 29:39 */     this.g.p();
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void m()
/* 33:   */   {
/* 34:44 */     if (this.j.W().w()) {
/* 35:45 */       this.j.W().v().m();
/* 36:   */     }
/* 37:   */   }
/* 38:   */   
/* 39:   */   protected void a(bug parambug)
/* 40:   */   {
/* 41:51 */     if (!parambug.l) {
/* 42:52 */       return;
/* 43:   */     }
/* 44:55 */     if (parambug.k == 1)
/* 45:   */     {
/* 46:56 */       this.j.a(this.a);
/* 47:   */     }
/* 48:   */     else
/* 49:   */     {
/* 50:58 */       this.j.t.Q = "";
/* 51:59 */       this.j.t.b();
/* 52:   */     }
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 56:   */   {
/* 57:65 */     c();
/* 58:66 */     this.g.a(paramInt1, paramInt2, paramFloat);
/* 59:67 */     a(this.q, this.f, this.l / 2, 20, 16777215);
/* 60:   */     
/* 61:69 */     super.a(paramInt1, paramInt2, paramFloat);
/* 62:   */   }
			  static bty a(cah arg0) {return arg0.q;}
			  static bty b(cah arg0) {return arg0.q;}
			  static bty c(cah arg0) {return arg0.q;}
			  static bty d(cah arg0) {return arg0.q;}
			  static bty e(cah arg0) {return arg0.q;}
			  static bty f(cah arg0) {return arg0.q;}
			  static bty g(cah arg0) {return arg0.q;}
			  static bty h(cah arg0) {return arg0.q;}
/* 63:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cah
 * JD-Core Version:    0.7.0.1
 */