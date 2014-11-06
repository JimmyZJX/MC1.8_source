package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bxv
/*   4:    */   extends bxf
/*   5:    */   implements byd
/*   6:    */ {
/*   7:    */   protected bxf a;
/*   8: 37 */   protected String f = "Select world";
/*   9:    */   private bxy g;
/*  10:    */   private bxz h;
/*  11:    */   private bxw i;
/*  12:    */   private byb r;
/*  13:    */   private tz s;
/*  14:    */   private bvk t;
/*  15: 45 */   private boolean u = true;
/*  16:    */   
/*  17:    */   public bxv(bxf parambxf, tz paramtz)
/*  18:    */   {
/*  19: 48 */     this.a = parambxf;
/*  20: 49 */     this.s = paramtz;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void b()
/*  24:    */   {
/*  25: 54 */     this.f = cwc.a("gui.stats", new Object[0]);
/*  26:    */     
/*  27: 56 */     this.u = true;
/*  28: 57 */     this.j.t().a(new lv(lw.REQUEST_STATS));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void k()
/*  32:    */   {
/*  33: 62 */     super.k();
/*  34: 63 */     if (this.t != null) {
/*  35: 64 */       this.t.p();
/*  36:    */     }
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void f()
/*  40:    */   {
/*  41: 69 */     this.g = new bxy(this, this.j);
/*  42: 70 */     this.g.d(1, 1);
/*  43:    */     
/*  44: 72 */     this.h = new bxz(this, this.j);
/*  45: 73 */     this.h.d(1, 1);
/*  46:    */     
/*  47: 75 */     this.i = new bxw(this, this.j);
/*  48: 76 */     this.i.d(1, 1);
/*  49:    */     
/*  50: 78 */     this.r = new byb(this, this.j);
/*  51: 79 */     this.r.d(1, 1);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void g()
/*  55:    */   {
/*  56: 83 */     this.n.add(new bug(0, this.l / 2 + 4, this.m - 28, 150, 20, cwc.a("gui.done", new Object[0])));
/*  57:    */     
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62: 89 */     this.n.add(new bug(1, this.l / 2 - 160, this.m - 52, 80, 20, cwc.a("stat.generalButton", new Object[0])));
/*  63:    */     bug localbug1;
/*  64: 90 */     this.n.add(localbug1 = new bug(2, this.l / 2 - 80, this.m - 52, 80, 20, cwc.a("stat.blocksButton", new Object[0])));
/*  65:    */     bug localbug2;
/*  66: 91 */     this.n.add(localbug2 = new bug(3, this.l / 2, this.m - 52, 80, 20, cwc.a("stat.itemsButton", new Object[0])));
/*  67:    */     bug localbug3;
/*  68: 92 */     this.n.add(localbug3 = new bug(4, this.l / 2 + 80, this.m - 52, 80, 20, cwc.a("stat.mobsButton", new Object[0])));
/*  69: 94 */     if (this.i.b() == 0) {
/*  70: 95 */       localbug1.l = false;
/*  71:    */     }
/*  72: 97 */     if (this.h.b() == 0) {
/*  73: 98 */       localbug2.l = false;
/*  74:    */     }
/*  75:100 */     if (this.r.b() == 0) {
/*  76:101 */       localbug3.l = false;
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   protected void a(bug parambug)
/*  81:    */   {
/*  82:107 */     if (!parambug.l) {
/*  83:108 */       return;
/*  84:    */     }
/*  85:110 */     if (parambug.k == 0) {
/*  86:111 */       this.j.a(this.a);
/*  87:112 */     } else if (parambug.k == 1) {
/*  88:113 */       this.t = this.g;
/*  89:114 */     } else if (parambug.k == 3) {
/*  90:115 */       this.t = this.h;
/*  91:116 */     } else if (parambug.k == 2) {
/*  92:117 */       this.t = this.i;
/*  93:118 */     } else if (parambug.k == 4) {
/*  94:119 */       this.t = this.r;
/*  95:    */     } else {
/*  96:121 */       this.t.a(parambug);
/*  97:    */     }
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 101:    */   {
/* 102:127 */     if (this.u)
/* 103:    */     {
/* 104:128 */       c();
/* 105:129 */       a(this.q, cwc.a("multiplayer.downloadingStats", new Object[0]), this.l / 2, this.m / 2, 16777215);
/* 106:130 */       a(this.q, c_[((int)(bsu.I() / 150L % c_.length))], this.l / 2, this.m / 2 + this.q.a * 2, 16777215);
/* 107:    */     }
/* 108:    */     else
/* 109:    */     {
/* 110:132 */       this.t.a(paramInt1, paramInt2, paramFloat);
/* 111:133 */       a(this.q, this.f, this.l / 2, 20, 16777215);
/* 112:134 */       super.a(paramInt1, paramInt2, paramFloat);
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void a()
/* 117:    */   {
/* 118:140 */     if (this.u)
/* 119:    */     {
/* 120:141 */       f();
/* 121:142 */       g();
/* 122:143 */       this.t = this.g;
/* 123:144 */       this.u = false;
/* 124:    */     }
/* 125:    */   }
/* 126:    */   
/* 127:    */   public boolean d()
/* 128:    */   {
/* 129:150 */     return !this.u;
/* 130:    */   }
/* 131:    */   
/* 132:    */   private void a(int paramInt1, int paramInt2, Item paramalq)
/* 133:    */   {
/* 134:211 */     b(paramInt1 + 1, paramInt2 + 1);
/* 135:    */     
/* 136:213 */     cjm.B();
/* 137:    */     
/* 138:215 */     bss.c();
/* 139:    */     
/* 140:217 */     this.k.a(new ItemStack(paramalq, 1, 0), paramInt1 + 2, paramInt2 + 2);
/* 141:218 */     bss.a();
/* 142:    */     
/* 143:220 */     cjm.C();
/* 144:    */   }
/* 145:    */   
/* 146:    */   private void b(int paramInt1, int paramInt2)
/* 147:    */   {
/* 148:224 */     c(paramInt1, paramInt2, 0, 0);
/* 149:    */   }
/* 150:    */   
/* 151:    */   private void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 152:    */   {
/* 153:228 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 154:229 */     this.j.N().a(c);
/* 155:    */     
/* 156:231 */     float f1 = 0.007813F;
/* 157:232 */     float f2 = 0.007813F;
/* 158:233 */     int j = 18;
/* 159:234 */     int k = 18;
/* 160:235 */     ckx localckx = ckx.getInstance();
/* 161:236 */     VertexBuffer localciv = localckx.getBuffer();
/* 162:237 */     localciv.begin();
/* 163:238 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 18, this.e, (paramInt3 + 0) * 0.007813F, (paramInt4 + 18) * 0.007813F);
/* 164:239 */     localciv.addVertexWithUV(paramInt1 + 18, paramInt2 + 18, this.e, (paramInt3 + 18) * 0.007813F, (paramInt4 + 18) * 0.007813F);
/* 165:240 */     localciv.addVertexWithUV(paramInt1 + 18, paramInt2 + 0, this.e, (paramInt3 + 18) * 0.007813F, (paramInt4 + 0) * 0.007813F);
/* 166:241 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 0, this.e, (paramInt3 + 0) * 0.007813F, (paramInt4 + 0) * 0.007813F);
/* 167:242 */     localckx.draw();
/* 168:    */   }
				static bty a(bxv arg0) {return arg0.q;}
				static tz b(bxv arg0) {return arg0.s;}
				static bty c(bxv arg0) {return arg0.q;}
				static bty d(bxv arg0) {return arg0.q;}
				static void a(bxv arg0, int arg1, int arg2, int arg3, int arg4) {arg0.c(arg1,arg2,arg3,arg4);}
				static bty e(bxv arg0) {return arg0.q;}
				static bty f(bxv arg0) {return arg0.q;}
				static bty g(bxv arg0) {return arg0.q;}
				static bty h(bxv arg0) {return arg0.q;}
				static bty i(bxv arg0) {return arg0.q;}
				static void a(bxv arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {arg0.a(arg1,arg2,arg3,arg4,arg5,arg6);}
				static bty j(bxv arg0) {return arg0.q;}
				static bty k(bxv arg0) {return arg0.q;}
				static void b(bxv arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {arg0.a(arg1,arg2,arg3,arg4,arg5,arg6);}
				static bty l(bxv arg0) {return arg0.q;}
				static void a(bxv arg0, int arg1, int arg2, Item arg3) {arg0.a(arg1,arg2,arg3);}
				static bty m(bxv arg0) {return arg0.q;}
				static bty n(bxv arg0) {return arg0.q;}
				static bty o(bxv arg0) {return arg0.q;}
				static bty p(bxv arg0) {return arg0.q;}
				static bty q(bxv arg0) {return arg0.q;}
				static bty r(bxv arg0) {return arg0.q;}
				static bty s(bxv arg0) {return arg0.q;}
/* 169:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxv
 * JD-Core Version:    0.7.0.1
 */