package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class bwd
/*   4:    */   extends bxf
/*   5:    */ {
/*   6:    */   private final bwf a;
/*   7: 36 */   private biv f = biv.e();
/*   8:    */   private String g;
/*   9:    */   private String h;
/*  10:    */   private String i;
/*  11:    */   private bwe r;
/*  12:    */   private bug s;
/*  13:    */   private bug t;
/*  14:    */   private bug u;
/*  15:    */   
/*  16:    */   public bwd(bwf parambwf, String paramString)
/*  17:    */   {
/*  18: 46 */     this.a = parambwf;
/*  19:    */     
/*  20: 48 */     a(paramString);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public String a()
/*  24:    */   {
/*  25: 52 */     return this.f.toString();
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(String paramString)
/*  29:    */   {
/*  30: 56 */     this.f = biv.a(paramString);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void b()
/*  34:    */   {
/*  35: 61 */     this.n.clear();
/*  36:    */     
/*  37: 63 */     this.g = cwc.a("createWorld.customize.flat.title", new Object[0]);
/*  38: 64 */     this.h = cwc.a("createWorld.customize.flat.tile", new Object[0]);
/*  39: 65 */     this.i = cwc.a("createWorld.customize.flat.height", new Object[0]);
/*  40:    */     
/*  41: 67 */     this.r = new bwe(this);
/*  42:    */     
/*  43: 69 */     this.n.add(this.s = new bug(2, this.l / 2 - 154, this.m - 52, 100, 20, cwc.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)"));
/*  44: 70 */     this.n.add(this.t = new bug(3, this.l / 2 - 50, this.m - 52, 100, 20, cwc.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)"));
/*  45: 71 */     this.n.add(this.u = new bug(4, this.l / 2 - 155, this.m - 52, 150, 20, cwc.a("createWorld.customize.flat.removeLayer", new Object[0])));
/*  46:    */     
/*  47: 73 */     this.n.add(new bug(0, this.l / 2 - 155, this.m - 28, 150, 20, cwc.a("gui.done", new Object[0])));
/*  48: 74 */     this.n.add(new bug(5, this.l / 2 + 5, this.m - 52, 150, 20, cwc.a("createWorld.customize.presets", new Object[0])));
/*  49: 75 */     this.n.add(new bug(1, this.l / 2 + 5, this.m - 28, 150, 20, cwc.a("gui.cancel", new Object[0])));
/*  50:    */     
/*  51: 77 */     this.s.m = (this.t.m = false);
/*  52:    */     
/*  53: 79 */     this.f.d();
/*  54: 80 */     f();
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void k()
/*  58:    */   {
/*  59: 85 */     super.k();
/*  60: 86 */     this.r.p();
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected void a(bug parambug)
/*  64:    */   {
/*  65: 91 */     int j = this.f.c().size() - this.r.u - 1;
/*  66: 93 */     if (parambug.k == 1)
/*  67:    */     {
/*  68: 94 */       this.j.a(this.a);
/*  69:    */     }
/*  70: 95 */     else if (parambug.k == 0)
/*  71:    */     {
/*  72: 96 */       this.a.a = a();
/*  73: 97 */       this.j.a(this.a);
/*  74:    */     }
/*  75: 98 */     else if (parambug.k == 5)
/*  76:    */     {
/*  77: 99 */       this.j.a(new bwz(this));
/*  78:    */     }
/*  79:100 */     else if ((parambug.k == 4) && (g()))
/*  80:    */     {
/*  81:101 */       this.f.c().remove(j);
/*  82:102 */       this.r.u = Math.min(this.r.u, this.f.c().size() - 1);
/*  83:    */     }
/*  84:105 */     this.f.d();
/*  85:106 */     f();
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void f()
/*  89:    */   {
/*  90:110 */     boolean bool = g();
/*  91:111 */     this.u.l = bool;
/*  92:112 */     this.t.l = bool;
/*  93:    */     
/*  94:    */ 
/*  95:115 */     this.t.l = false;
/*  96:116 */     this.s.l = false;
/*  97:    */   }
/*  98:    */   
/*  99:    */   private boolean g()
/* 100:    */   {
/* 101:120 */     return (this.r.u > -1) && (this.r.u < this.f.c().size());
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 105:    */   {
/* 106:125 */     c();
/* 107:    */     
/* 108:127 */     this.r.a(paramInt1, paramInt2, paramFloat);
/* 109:128 */     a(this.q, this.g, this.l / 2, 8, 16777215);
/* 110:    */     
/* 111:130 */     int j = this.l / 2 - 92 - 16;
/* 112:131 */     c(this.q, this.h, j, 32, 16777215);
/* 113:132 */     c(this.q, this.i, j + 2 + 213 - this.q.a(this.i), 32, 16777215);
/* 114:    */     
/* 115:134 */     super.a(paramInt1, paramInt2, paramFloat);
/* 116:    */   }
				static float a(bwd arg0) {return arg0.e;}
				static float b(bwd arg0) {return arg0.e;}
				static float c(bwd arg0) {return arg0.e;}
				static float d(bwd arg0) {return arg0.e;}
				static biv e(bwd arg0) {return arg0.f;}
/* 117:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwd
 * JD-Core Version:    0.7.0.1
 */