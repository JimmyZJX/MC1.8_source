package net.minecraft.src;
/*  3:   */ 
/*  4:   */ public class bxj
/*  5:   */   extends bxf
/*  6:   */ {
/*  7:   */   private final bxf a;
/*  8:   */   private String f;
/*  9:   */   
/* 10:   */   public bxj(bxf parambxf)
/* 11:   */   {
/* 12:14 */     this.a = parambxf;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void b()
/* 16:   */   {
/* 17:19 */     int i = 0;
/* 18:20 */     this.f = cwc.a("options.skinCustomisation.title", new Object[0]);
/* 19:22 */     for (ahh localahh : ahh.values())
/* 20:   */     {
/* 21:23 */       this.n.add(new bxl(this, localahh.b(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 + 24 * (i >> 1), 150, 20, localahh, null));
/* 22:   */       
/* 23:25 */       i++;
/* 24:   */     }
/* 25:28 */     if (i % 2 == 1) {
/* 26:29 */       i++;
/* 27:   */     }
/* 28:32 */     this.n.add(new bug(200, this.l / 2 - 100, this.m / 6 + 24 * (i >> 1), cwc.a("gui.done", new Object[0])));
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected void a(bug parambug)
/* 32:   */   {
/* 33:37 */     if (!parambug.l) {
/* 34:38 */       return;
/* 35:   */     }
/* 36:41 */     if (parambug.k == 200)
/* 37:   */     {
/* 38:42 */       this.j.t.b();
/* 39:43 */       this.j.a(this.a);
/* 40:   */     }
/* 41:44 */     else if ((parambug instanceof bxl))
/* 42:   */     {
/* 43:45 */       ahh localahh = bxl.a((bxl)parambug);
/* 44:46 */       this.j.t.a(localahh);
/* 45:47 */       parambug.j = a(localahh);
/* 46:   */     }
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 50:   */   {
/* 51:53 */     c();
/* 52:54 */     a(this.q, this.f, this.l / 2, 20, 16777215);
/* 53:   */     
/* 54:56 */     super.a(paramInt1, paramInt2, paramFloat);
/* 55:   */   }
/* 56:   */   
/* 57:   */   private String a(ahh paramahh)
/* 58:   */   {
/* 59:   */     String str;
/* 60:62 */     if (this.j.t.d().contains(paramahh)) {
/* 61:63 */       str = cwc.a("options.on", new Object[0]);
/* 62:   */     } else {
/* 63:65 */       str = cwc.a("options.off", new Object[0]);
/* 64:   */     }
/* 65:68 */     return paramahh.d().d() + ": " + str;
/* 66:   */   }
			  static String a(bxj arg0,ahh arg1) {return arg0.a(arg1);}
/* 67:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxj
 * JD-Core Version:    0.7.0.1
 */