package net.minecraft.src;
/*   1:    */ public class bts
/*   2:    */   implements uy
/*   3:    */ {
/*   4: 15 */   private String a = "";
/*   5:    */   private bsu b;
/*   6: 17 */   private String c = "";
/*   7: 18 */   private long d = bsu.I();
/*   8:    */   private boolean e;
/*   9:    */   private buf f;
/*  10:    */   private ckw g;
/*  11:    */   
/*  12:    */   public bts(bsu parambsu)
/*  13:    */   {
/*  14: 24 */     this.b = parambsu;
/*  15: 25 */     this.f = new buf(parambsu, parambsu.d, parambsu.e);
/*  16: 26 */     this.g = new ckw(parambsu.d, parambsu.e, false);
/*  17: 27 */     this.g.a(9728);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void b(String paramString)
/*  21:    */   {
/*  22: 32 */     this.e = false;
/*  23: 33 */     d(paramString);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(String paramString)
/*  27:    */   {
/*  28: 38 */     this.e = true;
/*  29: 39 */     d(paramString);
/*  30:    */   }
/*  31:    */   
/*  32:    */   private void d(String paramString)
/*  33:    */   {
/*  34: 43 */     this.c = paramString;
/*  35: 44 */     if (!this.b.z)
/*  36:    */     {
/*  37: 45 */       if (this.e) {
/*  38: 46 */         return;
/*  39:    */       }
/*  40: 48 */       throw new btu();
/*  41:    */     }
/*  42: 51 */     cjm.glClear(256);
/*  43: 52 */     cjm.glMatrixMode(5889);
/*  44: 53 */     cjm.glLoadIdentity();
/*  45: 54 */     if (dax.i())
/*  46:    */     {
/*  47: 55 */       int i = this.f.e();
/*  48: 56 */       cjm.glOrtho(0.0D, this.f.a() * i, this.f.b() * i, 0.0D, 100.0D, 300.0D);
/*  49:    */     }
/*  50:    */     else
/*  51:    */     {
/*  52: 58 */       buf localbuf = new buf(this.b, this.b.d, this.b.e);
/*  53: 59 */       cjm.glOrtho(0.0D, localbuf.c(), localbuf.d(), 0.0D, 100.0D, 300.0D);
/*  54:    */     }
/*  55: 61 */     cjm.glMatrixMode(5888);
/*  56: 62 */     cjm.glLoadIdentity();
/*  57: 63 */     cjm.glTranslatef(0.0F, 0.0F, -200.0F);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void c(String paramString)
/*  61:    */   {
/*  62: 68 */     if (!this.b.z)
/*  63:    */     {
/*  64: 69 */       if (this.e) {
/*  65: 70 */         return;
/*  66:    */       }
/*  67: 72 */       throw new btu();
/*  68:    */     }
/*  69: 75 */     this.d = 0L;
/*  70: 76 */     this.a = paramString;
/*  71: 77 */     a(-1);
/*  72: 78 */     this.d = 0L;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(int paramInt)
/*  76:    */   {
/*  77: 83 */     if (!this.b.z)
/*  78:    */     {
/*  79: 84 */       if (this.e) {
/*  80: 85 */         return;
/*  81:    */       }
/*  82: 87 */       throw new btu();
/*  83:    */     }
/*  84: 90 */     long l = bsu.I();
/*  85: 91 */     if (l - this.d < 100L) {
/*  86: 92 */       return;
/*  87:    */     }
/*  88: 94 */     this.d = l;
/*  89:    */     
/*  90: 96 */     buf localbuf = new buf(this.b, this.b.d, this.b.e);
/*  91: 97 */     int i = localbuf.e();
/*  92: 98 */     int j = localbuf.a();
/*  93: 99 */     int k = localbuf.b();
/*  94:101 */     if (dax.i()) {
/*  95:102 */       this.g.f();
/*  96:    */     } else {
/*  97:104 */       cjm.glClear(256);
/*  98:    */     }
/*  99:106 */     this.g.a(false);
/* 100:107 */     cjm.glMatrixMode(5889);
/* 101:108 */     cjm.glLoadIdentity();
/* 102:109 */     cjm.glOrtho(0.0D, localbuf.c(), localbuf.d(), 0.0D, 100.0D, 300.0D);
/* 103:110 */     cjm.glMatrixMode(5888);
/* 104:111 */     cjm.glLoadIdentity();
/* 105:112 */     cjm.glTranslatef(0.0F, 0.0F, -200.0F);
/* 106:114 */     if (!dax.i()) {
/* 107:115 */       cjm.glClear(16640);
/* 108:    */     }
/* 109:118 */     ckx localckx = ckx.getInstance();
/* 110:119 */     VertexBuffer localciv = localckx.getBuffer();
/* 111:120 */     this.b.N().a(bub.b);
/* 112:121 */     float f1 = 32.0F;
/* 113:122 */     localciv.begin();
/* 114:123 */     localciv.setColor(4210752);
/* 115:124 */     localciv.addVertexWithUV(0.0D, k, 0.0D, 0.0D, k / f1);
/* 116:125 */     localciv.addVertexWithUV(j, k, 0.0D, j / f1, k / f1);
/* 117:126 */     localciv.addVertexWithUV(j, 0.0D, 0.0D, j / f1, 0.0D);
/* 118:127 */     localciv.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 119:128 */     localckx.draw();
/* 120:130 */     if (paramInt >= 0)
/* 121:    */     {
/* 122:131 */       int m = 100;
/* 123:132 */       int n = 2;
/* 124:133 */       int i1 = j / 2 - m / 2;
/* 125:134 */       int i2 = k / 2 + 16;
/* 126:    */       
/* 127:136 */       cjm.x();
/* 128:137 */       localciv.begin();
/* 129:138 */       localciv.setColor(8421504);
/* 130:139 */       localciv.addVertex(i1, i2, 0.0D);
/* 131:140 */       localciv.addVertex(i1, i2 + n, 0.0D);
/* 132:141 */       localciv.addVertex(i1 + m, i2 + n, 0.0D);
/* 133:142 */       localciv.addVertex(i1 + m, i2, 0.0D);
/* 134:    */       
/* 135:144 */       localciv.setColor(8454016);
/* 136:145 */       localciv.addVertex(i1, i2, 0.0D);
/* 137:146 */       localciv.addVertex(i1, i2 + n, 0.0D);
/* 138:147 */       localciv.addVertex(i1 + paramInt, i2 + n, 0.0D);
/* 139:148 */       localciv.addVertex(i1 + paramInt, i2, 0.0D);
/* 140:149 */       localckx.draw();
/* 141:150 */       cjm.w();
/* 142:    */     }
/* 143:153 */     cjm.enableBlend();
/* 144:154 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 145:155 */     this.b.k.a(this.c, (j - this.b.k.a(this.c)) / 2, k / 2 - 4 - 16, 16777215);
/* 146:156 */     this.b.k.a(this.a, (j - this.b.k.a(this.a)) / 2, k / 2 - 4 + 8, 16777215);
/* 147:157 */     this.g.e();
/* 148:158 */     if (dax.i()) {
/* 149:159 */       this.g.c(j * i, k * i);
/* 150:    */     }
/* 151:161 */     this.b.h();
/* 152:    */     try
/* 153:    */     {
/* 154:164 */       Thread.yield();
/* 155:    */     }
/* 156:    */     catch (Exception localException) {}
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void a() {}
/* 160:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bts
 * JD-Core Version:    0.7.0.1
 */