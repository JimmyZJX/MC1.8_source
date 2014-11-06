package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class bxo
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   private final bxf f;
/*  7:   */   private final bto g;
/*  8:19 */   protected String a = "Options";
/*  9:   */   private String h;
/* 10:   */   
/* 11:   */   public bxo(bxf parambxf, bto parambto)
/* 12:   */   {
/* 13:23 */     this.f = parambxf;
/* 14:24 */     this.g = parambto;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void b()
/* 18:   */   {
/* 19:29 */     int i = 0;
/* 20:30 */     this.a = cwc.a("options.sounds.title", new Object[0]);
/* 21:31 */     this.h = cwc.a("options.off", new Object[0]);
/* 22:   */     
/* 23:33 */     this.n.add(new bxp(this, cxz.a.b(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), cxz.a, true));
/* 24:34 */     i += 2;
/* 25:36 */     for (cxz localcxz : cxz.values()) {
/* 26:37 */       if (localcxz != cxz.a)
/* 27:   */       {
/* 28:38 */         this.n.add(new bxp(this, localcxz.b(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), localcxz, false));
/* 29:   */         
/* 30:40 */         i++;
/* 31:   */       }
/* 32:   */     }
/* 33:44 */     this.n.add(new bug(200, this.l / 2 - 100, this.m / 6 + 168, cwc.a("gui.done", new Object[0])));
/* 34:   */   }
/* 35:   */   
/* 36:   */   protected void a(bug parambug)
/* 37:   */   {
/* 38:49 */     if (!parambug.l) {
/* 39:50 */       return;
/* 40:   */     }
/* 41:53 */     if (parambug.k == 200)
/* 42:   */     {
/* 43:54 */       this.j.t.b();
/* 44:55 */       this.j.a(this.f);
/* 45:   */     }
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 49:   */   {
/* 50:61 */     c();
/* 51:62 */     a(this.q, this.a, this.l / 2, 15, 16777215);
/* 52:63 */     super.a(paramInt1, paramInt2, paramFloat);
/* 53:   */   }
/* 54:   */   
/* 55:   */   protected String a(cxz paramcxz)
/* 56:   */   {
/* 57:67 */     float f1 = this.g.a(paramcxz);
/* 58:69 */     if (f1 == 0.0F) {
/* 59:70 */       return this.h;
/* 60:   */     }
/* 61:72 */     return (int)(f1 * 100.0F) + "%";
/* 62:   */   }
			  static bto a(bxo arg0) {return arg0.g;}
/* 63:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxo
 * JD-Core Version:    0.7.0.1
 */