package net.minecraft.src;
/*   1:    */ public class byi
/*   2:    */   implements buv
/*   3:    */ {
/*   4:    */   private final bsr b;
/*   5:    */   private final String c;
/*   6:    */   private final bug d;
/*   7:    */   private final bug e;
				private final byf a;
/*   8:    */   
/*   9:    */   private byi(byf parambyf, bsr parambsr)
/*  10:    */   {
				  a=parambyf;
/*  11: 95 */     this.b = parambsr;
/*  12: 96 */     this.c = cwc.a(parambsr.g(), new Object[0]);
/*  13: 97 */     this.d = new bug(0, 0, 0, 75, 18, cwc.a(parambsr.g(), new Object[0]));
/*  14: 98 */     this.e = new bug(0, 0, 0, 50, 18, cwc.a("controls.reset", new Object[0]));
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*  18:    */   {
/*  19:103 */     int i = byf.b(this.a).f == this.b ? 1 : 0;
/*  20:104 */     byf.a(this.a).k.a(this.c, paramInt2 + 90 - byf.c(this.a), paramInt3 + paramInt5 / 2 - byf.a(this.a).k.a / 2, 16777215);
/*  21:    */     
/*  22:106 */     this.e.h = (paramInt2 + 190);
/*  23:107 */     this.e.i = paramInt3;
/*  24:108 */     this.e.l = (this.b.i() != this.b.h());
/*  25:109 */     this.e.a(byf.a(this.a), paramInt6, paramInt7);
/*  26:    */     
/*  27:111 */     this.d.h = (paramInt2 + 105);
/*  28:112 */     this.d.i = paramInt3;
/*  29:113 */     this.d.j = bto.c(this.b.i());
/*  30:    */     
/*  31:115 */     int j = 0;
/*  32:117 */     if (this.b.i() != 0) {
/*  33:118 */       for (bsr localbsr : byf.a(this.a).t.at) {
/*  34:119 */         if ((localbsr != this.b) && (localbsr.i() == this.b.i()))
/*  35:    */         {
/*  36:120 */           j = 1;
/*  37:121 */           break;
/*  38:    */         }
/*  39:    */       }
/*  40:    */     }
/*  41:126 */     if (i != 0) {
/*  42:127 */       this.d.j = (a.p + "> " + a.o + this.d.j + a.p + " <");
/*  43:128 */     } else if (j != 0) {
/*  44:129 */       this.d.j = (a.m + this.d.j);
/*  45:    */     }
/*  46:132 */     this.d.a(byf.a(this.a), paramInt6, paramInt7);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  50:    */   {
/*  51:137 */     if (this.d.c(byf.a(this.a), paramInt2, paramInt3))
/*  52:    */     {
/*  53:138 */       byf.b(this.a).f = this.b;
/*  54:139 */       return true;
/*  55:    */     }
/*  56:140 */     if (this.e.c(byf.a(this.a), paramInt2, paramInt3))
/*  57:    */     {
/*  58:141 */       byf.a(this.a).t.a(this.b, this.b.h());
/*  59:142 */       bsr.b();
/*  60:143 */       return true;
/*  61:    */     }
/*  62:145 */     return false;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  66:    */   {
/*  67:150 */     this.d.a(paramInt2, paramInt3);
/*  68:151 */     this.e.a(paramInt2, paramInt3);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void a(int paramInt1, int paramInt2, int paramInt3) {}
				byi(byf arg0, bsr arg1, byg arg2) {this(arg0,arg1);}
/*  72:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byi
 * JD-Core Version:    0.7.0.1
 */