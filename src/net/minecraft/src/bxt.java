package net.minecraft.src;
/*   1:    */ public class bxt
/*   2:    */   extends bub
/*   3:    */ {
/*   4: 16 */   private static final oa a = new oa("textures/gui/achievement/achievement_background.png");
/*   5:    */   private bsu f;
/*   6:    */   private int g;
/*   7:    */   private int h;
/*   8:    */   private String i;
/*   9:    */   private String j;
/*  10:    */   private tk k;
/*  11:    */   private long l;
/*  12:    */   private cqh m;
/*  13:    */   private boolean n;
/*  14:    */   
/*  15:    */   public bxt(bsu parambsu)
/*  16:    */   {
/*  17: 28 */     this.f = parambsu;
/*  18: 29 */     this.m = parambsu.af();
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(tk paramtk)
/*  22:    */   {
/*  23: 33 */     this.i = cwc.a("achievement.get", new Object[0]);
/*  24: 34 */     this.j = paramtk.e().c();
/*  25: 35 */     this.l = bsu.I();
/*  26: 36 */     this.k = paramtk;
/*  27: 37 */     this.n = false;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void b(tk paramtk)
/*  31:    */   {
/*  32: 41 */     this.i = paramtk.e().c();
/*  33: 42 */     this.j = paramtk.f();
/*  34:    */     
/*  35: 44 */     this.l = (bsu.I() + 2500L);
/*  36: 45 */     this.k = paramtk;
/*  37: 46 */     this.n = true;
/*  38:    */   }
/*  39:    */   
/*  40:    */   private void c()
/*  41:    */   {
/*  42: 50 */     cjm.b(0, 0, this.f.d, this.f.e);
/*  43: 51 */     cjm.glMatrixMode(5889);
/*  44: 52 */     cjm.glLoadIdentity();
/*  45: 53 */     cjm.glMatrixMode(5888);
/*  46: 54 */     cjm.glLoadIdentity();
/*  47:    */     
/*  48: 56 */     this.g = this.f.d;
/*  49: 57 */     this.h = this.f.e;
/*  50:    */     
/*  51: 59 */     buf localbuf = new buf(this.f, this.f.d, this.f.e);
/*  52: 60 */     this.g = localbuf.a();
/*  53: 61 */     this.h = localbuf.b();
/*  54:    */     
/*  55: 63 */     cjm.glClear(256);
/*  56: 64 */     cjm.glMatrixMode(5889);
/*  57: 65 */     cjm.glLoadIdentity();
/*  58: 66 */     cjm.glOrtho(0.0D, this.g, this.h, 0.0D, 1000.0D, 3000.0D);
/*  59: 67 */     cjm.glMatrixMode(5888);
/*  60: 68 */     cjm.glLoadIdentity();
/*  61: 69 */     cjm.glTranslatef(0.0F, 0.0F, -2000.0F);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void a()
/*  65:    */   {
/*  66: 73 */     if ((this.k == null) || (this.l == 0L) || (bsu.z().h == null)) {
/*  67: 74 */       return;
/*  68:    */     }
/*  69: 77 */     double d1 = (bsu.I() - this.l) / 3000.0D;
/*  70: 78 */     if (!this.n)
/*  71:    */     {
/*  72: 79 */       if ((d1 < 0.0D) || (d1 > 1.0D)) {
/*  73: 80 */         this.l = 0L;
/*  74:    */       }
/*  75:    */     }
/*  76: 84 */     else if (d1 > 0.5D) {
/*  77: 85 */       d1 = 0.5D;
/*  78:    */     }
/*  79: 89 */     c();
/*  80: 90 */     cjm.i();
/*  81: 91 */     cjm.a(false);
/*  82:    */     
/*  83: 93 */     double d2 = d1 * 2.0D;
/*  84: 94 */     if (d2 > 1.0D) {
/*  85: 95 */       d2 = 2.0D - d2;
/*  86:    */     }
/*  87: 97 */     d2 *= 4.0D;
/*  88: 98 */     d2 = 1.0D - d2;
/*  89: 99 */     if (d2 < 0.0D) {
/*  90:100 */       d2 = 0.0D;
/*  91:    */     }
/*  92:102 */     d2 *= d2;
/*  93:103 */     d2 *= d2;
/*  94:    */     
/*  95:105 */     int i1 = this.g - 160;
/*  96:106 */     int i2 = 0 - (int)(d2 * 36.0D);
/*  97:107 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  98:108 */     cjm.w();
/*  99:109 */     this.f.N().a(a);
/* 100:110 */     cjm.disableLighting();
/* 101:    */     
/* 102:112 */     b(i1, i2, 96, 202, 160, 32);
/* 103:114 */     if (this.n)
/* 104:    */     {
/* 105:115 */       this.f.k.a(this.j, i1 + 30, i2 + 7, 120, -1);
/* 106:    */     }
/* 107:    */     else
/* 108:    */     {
/* 109:117 */       this.f.k.a(this.i, i1 + 30, i2 + 7, -256);
/* 110:118 */       this.f.k.a(this.j, i1 + 30, i2 + 18, -1);
/* 111:    */     }
/* 112:121 */     bss.c();
/* 113:122 */     cjm.disableLighting();
/* 114:123 */     cjm.B();
/* 115:124 */     cjm.g();
/* 116:    */     
/* 117:126 */     cjm.enableLighting();
/* 118:127 */     this.m.b(this.k.d, i1 + 8, i2 + 8);
/* 119:128 */     cjm.disableLighting();
/* 120:    */     
/* 121:130 */     cjm.a(true);
/* 122:131 */     cjm.j();
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void b()
/* 126:    */   {
/* 127:135 */     this.k = null;
/* 128:136 */     this.l = 0L;
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxt
 * JD-Core Version:    0.7.0.1
 */