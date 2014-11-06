package net.minecraft.src;
/*   1:    */ public class ccf
/*   2:    */   extends ccl
/*   3:    */ {
/*   4:    */   public boolean a;
/*   5:    */   public boolean b;
/*   6:    */   
/*   7:    */   public ccf(float paramFloat)
/*   8:    */   {
/*   9: 11 */     super(0.0F, -14.0F, 64, 32);
/*  10: 12 */     float f = -14.0F;
/*  11:    */     
/*  12: 14 */     this.f = new cdy(this, 0, 16);
/*  13: 15 */     this.f.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat - 0.5F);
/*  14: 16 */     this.f.a(0.0F, 0.0F + f, 0.0F);
/*  15:    */     
/*  16: 18 */     this.g = new cdy(this, 32, 16);
/*  17: 19 */     this.g.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat);
/*  18: 20 */     this.g.a(0.0F, 0.0F + f, 0.0F);
/*  19:    */     
/*  20: 22 */     this.h = new cdy(this, 56, 0);
/*  21: 23 */     this.h.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, paramFloat);
/*  22: 24 */     this.h.a(-3.0F, 2.0F + f, 0.0F);
/*  23:    */     
/*  24: 26 */     this.i = new cdy(this, 56, 0);
/*  25: 27 */     this.i.i = true;
/*  26: 28 */     this.i.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, paramFloat);
/*  27: 29 */     this.i.a(5.0F, 2.0F + f, 0.0F);
/*  28:    */     
/*  29: 31 */     this.j = new cdy(this, 56, 0);
/*  30: 32 */     this.j.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, paramFloat);
/*  31: 33 */     this.j.a(-2.0F, 12.0F + f, 0.0F);
/*  32:    */     
/*  33: 35 */     this.k = new cdy(this, 56, 0);
/*  34: 36 */     this.k.i = true;
/*  35: 37 */     this.k.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, paramFloat);
/*  36: 38 */     this.k.a(2.0F, 12.0F + f, 0.0F);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/*  40:    */   {
/*  41: 43 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/*  42:    */     
/*  43: 45 */     this.e.j = true;
/*  44:    */     
/*  45: 47 */     float f1 = -14.0F;
/*  46: 48 */     this.g.f = 0.0F;
/*  47: 49 */     this.g.d = f1;
/*  48: 50 */     this.g.e = -0.0F;
/*  49:    */     
/*  50: 52 */     this.j.f -= 0.0F;
/*  51: 53 */     this.k.f -= 0.0F; cdy 
/*  52:    */     
/*  53: 55 */       tmp83_80 = this.h;tmp83_80.f = ((float)(tmp83_80.f * 0.5D)); cdy 
/*  54: 56 */       tmp100_97 = this.i;tmp100_97.f = ((float)(tmp100_97.f * 0.5D)); cdy 
/*  55: 57 */       tmp117_114 = this.j;tmp117_114.f = ((float)(tmp117_114.f * 0.5D)); cdy 
/*  56: 58 */       tmp134_131 = this.k;tmp134_131.f = ((float)(tmp134_131.f * 0.5D));
/*  57:    */     
/*  58: 60 */     float f2 = 0.4F;
/*  59: 61 */     if (this.h.f > f2) {
/*  60: 62 */       this.h.f = f2;
/*  61:    */     }
/*  62: 64 */     if (this.i.f > f2) {
/*  63: 65 */       this.i.f = f2;
/*  64:    */     }
/*  65: 67 */     if (this.h.f < -f2) {
/*  66: 68 */       this.h.f = (-f2);
/*  67:    */     }
/*  68: 70 */     if (this.i.f < -f2) {
/*  69: 71 */       this.i.f = (-f2);
/*  70:    */     }
/*  71: 73 */     if (this.j.f > f2) {
/*  72: 74 */       this.j.f = f2;
/*  73:    */     }
/*  74: 76 */     if (this.k.f > f2) {
/*  75: 77 */       this.k.f = f2;
/*  76:    */     }
/*  77: 79 */     if (this.j.f < -f2) {
/*  78: 80 */       this.j.f = (-f2);
/*  79:    */     }
/*  80: 82 */     if (this.k.f < -f2) {
/*  81: 83 */       this.k.f = (-f2);
/*  82:    */     }
/*  83: 86 */     if (this.a)
/*  84:    */     {
/*  85: 87 */       this.h.f = -0.5F;
/*  86: 88 */       this.i.f = -0.5F;
/*  87: 89 */       this.h.h = 0.05F;
/*  88: 90 */       this.i.h = -0.05F;
/*  89:    */     }
/*  90: 93 */     this.h.e = 0.0F;
/*  91: 94 */     this.i.e = 0.0F;
/*  92: 95 */     this.j.e = 0.0F;
/*  93: 96 */     this.k.e = 0.0F;
/*  94:    */     
/*  95: 98 */     this.j.d = (9.0F + f1);
/*  96: 99 */     this.k.d = (9.0F + f1);
/*  97:    */     
/*  98:101 */     this.e.e = -0.0F;
/*  99:102 */     this.e.d = (f1 + 1.0F);
/* 100:    */     
/* 101:104 */     this.f.c = this.e.c;
/* 102:105 */     this.f.d = this.e.d;
/* 103:106 */     this.f.e = this.e.e;
/* 104:107 */     this.f.f = this.e.f;
/* 105:108 */     this.f.g = this.e.g;
/* 106:109 */     this.f.h = this.e.h;
/* 107:111 */     if (this.b)
/* 108:    */     {
/* 109:112 */       float f3 = 1.0F;
/* 110:113 */       this.e.d -= f3 * 5.0F;
/* 111:    */     }
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccf
 * JD-Core Version:    0.7.0.1
 */