package net.minecraft.src;
/*   1:    */ public class cdg
/*   2:    */   extends ccq
/*   3:    */ {
/*   4:    */   public cdy a;
/*   5:    */   public cdy b;
/*   6:    */   public cdy c;
/*   7:    */   public cdy d;
/*   8:    */   public cdy e;
/*   9:    */   public cdy f;
/*  10:    */   public cdy g;
/*  11:    */   public cdy h;
/*  12:    */   public cdy i;
/*  13:    */   public cdy j;
/*  14:    */   public cdy k;
/*  15:    */   
/*  16:    */   public cdg()
/*  17:    */   {
/*  18: 11 */     float f1 = 0.0F;
/*  19:    */     
/*  20: 13 */     int m = 15;
/*  21:    */     
/*  22: 15 */     this.a = new cdy(this, 32, 4);
/*  23: 16 */     this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, f1);
/*  24: 17 */     this.a.a(0.0F, m, -3.0F);
/*  25:    */     
/*  26: 19 */     this.b = new cdy(this, 0, 0);
/*  27: 20 */     this.b.a(-3.0F, -3.0F, -3.0F, 6, 6, 6, f1);
/*  28: 21 */     this.b.a(0.0F, m, 0.0F);
/*  29:    */     
/*  30: 23 */     this.c = new cdy(this, 0, 12);
/*  31: 24 */     this.c.a(-5.0F, -4.0F, -6.0F, 10, 8, 12, f1);
/*  32: 25 */     this.c.a(0.0F, m, 9.0F);
/*  33:    */     
/*  34: 27 */     this.d = new cdy(this, 18, 0);
/*  35: 28 */     this.d.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  36: 29 */     this.d.a(-4.0F, m, 2.0F);
/*  37:    */     
/*  38: 31 */     this.e = new cdy(this, 18, 0);
/*  39: 32 */     this.e.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  40: 33 */     this.e.a(4.0F, m, 2.0F);
/*  41:    */     
/*  42: 35 */     this.f = new cdy(this, 18, 0);
/*  43: 36 */     this.f.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  44: 37 */     this.f.a(-4.0F, m, 1.0F);
/*  45:    */     
/*  46: 39 */     this.g = new cdy(this, 18, 0);
/*  47: 40 */     this.g.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  48: 41 */     this.g.a(4.0F, m, 1.0F);
/*  49:    */     
/*  50: 43 */     this.h = new cdy(this, 18, 0);
/*  51: 44 */     this.h.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  52: 45 */     this.h.a(-4.0F, m, 0.0F);
/*  53:    */     
/*  54: 47 */     this.i = new cdy(this, 18, 0);
/*  55: 48 */     this.i.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  56: 49 */     this.i.a(4.0F, m, 0.0F);
/*  57:    */     
/*  58: 51 */     this.j = new cdy(this, 18, 0);
/*  59: 52 */     this.j.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  60: 53 */     this.j.a(-4.0F, m, -1.0F);
/*  61:    */     
/*  62: 55 */     this.k = new cdy(this, 18, 0);
/*  63: 56 */     this.k.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  64: 57 */     this.k.a(4.0F, m, -1.0F);
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  68:    */   {
/*  69: 62 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/*  70:    */     
/*  71: 64 */     this.a.a(paramFloat6);
/*  72: 65 */     this.b.a(paramFloat6);
/*  73: 66 */     this.c.a(paramFloat6);
/*  74: 67 */     this.d.a(paramFloat6);
/*  75: 68 */     this.e.a(paramFloat6);
/*  76: 69 */     this.f.a(paramFloat6);
/*  77: 70 */     this.g.a(paramFloat6);
/*  78: 71 */     this.h.a(paramFloat6);
/*  79: 72 */     this.i.a(paramFloat6);
/*  80: 73 */     this.j.a(paramFloat6);
/*  81: 74 */     this.k.a(paramFloat6);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/*  85:    */   {
/*  86: 79 */     this.a.g = (paramFloat4 / 57.295776F);
/*  87: 80 */     this.a.f = (paramFloat5 / 57.295776F);
/*  88:    */     
/*  89: 82 */     float f1 = 0.7853982F;
/*  90: 83 */     this.d.h = (-f1);
/*  91: 84 */     this.e.h = f1;
/*  92:    */     
/*  93: 86 */     this.f.h = (-f1 * 0.74F);
/*  94: 87 */     this.g.h = (f1 * 0.74F);
/*  95:    */     
/*  96: 89 */     this.h.h = (-f1 * 0.74F);
/*  97: 90 */     this.i.h = (f1 * 0.74F);
/*  98:    */     
/*  99: 92 */     this.j.h = (-f1);
/* 100: 93 */     this.k.h = f1;
/* 101:    */     
/* 102: 95 */     float f2 = -0.0F;
/* 103: 96 */     float f3 = 0.3926991F;
/* 104: 97 */     this.d.g = (f3 * 2.0F + f2);
/* 105: 98 */     this.e.g = (-f3 * 2.0F - f2);
/* 106: 99 */     this.f.g = (f3 * 1.0F + f2);
/* 107:100 */     this.g.g = (-f3 * 1.0F - f2);
/* 108:101 */     this.h.g = (-f3 * 1.0F + f2);
/* 109:102 */     this.i.g = (f3 * 1.0F - f2);
/* 110:103 */     this.j.g = (-f3 * 2.0F + f2);
/* 111:104 */     this.k.g = (f3 * 2.0F - f2);
/* 112:    */     
/* 113:106 */     float f4 = -(MathUtils.cos(paramFloat1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * paramFloat2;
/* 114:107 */     float f5 = -(MathUtils.cos(paramFloat1 * 0.6662F * 2.0F + 3.141593F) * 0.4F) * paramFloat2;
/* 115:108 */     float f6 = -(MathUtils.cos(paramFloat1 * 0.6662F * 2.0F + 1.570796F) * 0.4F) * paramFloat2;
/* 116:109 */     float f7 = -(MathUtils.cos(paramFloat1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * paramFloat2;
/* 117:    */     
/* 118:111 */     float f8 = Math.abs(MathUtils.sin(paramFloat1 * 0.6662F + 0.0F) * 0.4F) * paramFloat2;
/* 119:112 */     float f9 = Math.abs(MathUtils.sin(paramFloat1 * 0.6662F + 3.141593F) * 0.4F) * paramFloat2;
/* 120:113 */     float f10 = Math.abs(MathUtils.sin(paramFloat1 * 0.6662F + 1.570796F) * 0.4F) * paramFloat2;
/* 121:114 */     float f11 = Math.abs(MathUtils.sin(paramFloat1 * 0.6662F + 4.712389F) * 0.4F) * paramFloat2;
/* 122:    */     
/* 123:116 */     this.d.g += f4;
/* 124:117 */     this.e.g += -f4;
/* 125:118 */     this.f.g += f5;
/* 126:119 */     this.g.g += -f5;
/* 127:120 */     this.h.g += f6;
/* 128:121 */     this.i.g += -f6;
/* 129:122 */     this.j.g += f7;
/* 130:123 */     this.k.g += -f7;
/* 131:    */     
/* 132:125 */     this.d.h += f8;
/* 133:126 */     this.e.h += -f8;
/* 134:127 */     this.f.h += f9;
/* 135:128 */     this.g.h += -f9;
/* 136:129 */     this.h.h += f10;
/* 137:130 */     this.i.h += -f10;
/* 138:131 */     this.j.h += f11;
/* 139:132 */     this.k.h += -f11;
/* 140:    */   }
/* 141:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdg
 * JD-Core Version:    0.7.0.1
 */