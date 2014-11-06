package net.minecraft.src;
/*   1:    */ public class cbv
/*   2:    */   extends cbu
/*   3:    */ {
/*   4:    */   public cdy a;
/*   5:    */   public cdy b;
/*   6:    */   public cdy c;
/*   7:    */   public cdy d;
/*   8:    */   
/*   9:    */   public cbv()
/*  10:    */   {
/*  11: 16 */     this(0.0F);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public cbv(float paramFloat)
/*  15:    */   {
/*  16: 20 */     super(paramFloat, 64, 64);
/*  17:    */     
/*  18: 22 */     this.e = new cdy(this, 0, 0);
/*  19: 23 */     this.e.a(-1.0F, -7.0F, -1.0F, 2, 7, 2, paramFloat);
/*  20: 24 */     this.e.a(0.0F, 0.0F, 0.0F);
/*  21:    */     
/*  22: 26 */     this.g = new cdy(this, 0, 26);
/*  23: 27 */     this.g.a(-6.0F, 0.0F, -1.5F, 12, 3, 3, paramFloat);
/*  24: 28 */     this.g.a(0.0F, 0.0F, 0.0F);
/*  25:    */     
/*  26: 30 */     this.h = new cdy(this, 24, 0);
/*  27: 31 */     this.h.a(-2.0F, -2.0F, -1.0F, 2, 12, 2, paramFloat);
/*  28: 32 */     this.h.a(-5.0F, 2.0F, 0.0F);
/*  29:    */     
/*  30: 34 */     this.i = new cdy(this, 32, 16);
/*  31: 35 */     this.i.i = true;
/*  32: 36 */     this.i.a(0.0F, -2.0F, -1.0F, 2, 12, 2, paramFloat);
/*  33: 37 */     this.i.a(5.0F, 2.0F, 0.0F);
/*  34:    */     
/*  35: 39 */     this.j = new cdy(this, 8, 0);
/*  36: 40 */     this.j.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, paramFloat);
/*  37: 41 */     this.j.a(-1.9F, 12.0F, 0.0F);
/*  38:    */     
/*  39: 43 */     this.k = new cdy(this, 40, 16);
/*  40: 44 */     this.k.i = true;
/*  41: 45 */     this.k.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, paramFloat);
/*  42: 46 */     this.k.a(1.9F, 12.0F, 0.0F);
/*  43:    */     
/*  44: 48 */     this.a = new cdy(this, 16, 0);
/*  45: 49 */     this.a.a(-3.0F, 3.0F, -1.0F, 2, 7, 2, paramFloat);
/*  46: 50 */     this.a.a(0.0F, 0.0F, 0.0F);
/*  47: 51 */     this.a.j = true;
/*  48:    */     
/*  49: 53 */     this.b = new cdy(this, 48, 16);
/*  50: 54 */     this.b.a(1.0F, 3.0F, -1.0F, 2, 7, 2, paramFloat);
/*  51: 55 */     this.b.a(0.0F, 0.0F, 0.0F);
/*  52:    */     
/*  53: 57 */     this.c = new cdy(this, 0, 48);
/*  54: 58 */     this.c.a(-4.0F, 10.0F, -1.0F, 8, 2, 2, paramFloat);
/*  55: 59 */     this.c.a(0.0F, 0.0F, 0.0F);
/*  56:    */     
/*  57: 61 */     this.d = new cdy(this, 0, 32);
/*  58: 62 */     this.d.a(-6.0F, 11.0F, -6.0F, 12, 1, 12, paramFloat);
/*  59: 63 */     this.d.a(0.0F, 12.0F, 0.0F);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/*  63:    */   {
/*  64: 68 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/*  65: 69 */     if (!(paramwv instanceof EntityArmorStand)) {
/*  66: 70 */       return;
/*  67:    */     }
/*  68: 72 */     EntityArmorStand localadi = (EntityArmorStand)paramwv;
/*  69:    */     
/*  70: 74 */     this.i.j = localadi.q();
/*  71: 75 */     this.h.j = localadi.q();
/*  72: 76 */     this.d.j = (!localadi.r());
/*  73:    */     
/*  74: 78 */     this.k.a(1.9F, 12.0F, 0.0F);
/*  75: 79 */     this.j.a(-1.9F, 12.0F, 0.0F);
/*  76:    */     
/*  77: 81 */     this.a.f = (0.01745329F * localadi.t().b());
/*  78: 82 */     this.a.g = (0.01745329F * localadi.t().c());
/*  79: 83 */     this.a.h = (0.01745329F * localadi.t().d());
/*  80:    */     
/*  81: 85 */     this.b.f = (0.01745329F * localadi.t().b());
/*  82: 86 */     this.b.g = (0.01745329F * localadi.t().c());
/*  83: 87 */     this.b.h = (0.01745329F * localadi.t().d());
/*  84:    */     
/*  85: 89 */     this.c.f = (0.01745329F * localadi.t().b());
/*  86: 90 */     this.c.g = (0.01745329F * localadi.t().c());
/*  87: 91 */     this.c.h = (0.01745329F * localadi.t().d());
/*  88:    */     
/*  89: 93 */     float f1 = (localadi.w().b() + localadi.x().b()) / 2.0F;
/*  90: 94 */     float f2 = (localadi.w().c() + localadi.x().c()) / 2.0F;
/*  91: 95 */     float f3 = (localadi.w().d() + localadi.x().d()) / 2.0F;
/*  92:    */     
/*  93: 97 */     this.d.f = 0.0F;
/*  94: 98 */     this.d.g = (0.01745329F * -paramwv.yaw);
/*  95: 99 */     this.d.h = 0.0F;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  99:    */   {
/* 100:104 */     super.a(paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 101:    */     
/* 102:106 */     cjm.glPushMatrix();
/* 103:107 */     if (this.r)
/* 104:    */     {
/* 105:108 */       float f = 2.0F;
/* 106:109 */       cjm.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
/* 107:110 */       cjm.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/* 108:111 */       this.a.a(paramFloat6);
/* 109:112 */       this.b.a(paramFloat6);
/* 110:113 */       this.c.a(paramFloat6);
/* 111:114 */       this.d.a(paramFloat6);
/* 112:    */     }
/* 113:    */     else
/* 114:    */     {
/* 115:116 */       if (paramwv.aw()) {
/* 116:117 */         cjm.glTranslatef(0.0F, 0.2F, 0.0F);
/* 117:    */       }
/* 118:119 */       this.a.a(paramFloat6);
/* 119:120 */       this.b.a(paramFloat6);
/* 120:121 */       this.c.a(paramFloat6);
/* 121:122 */       this.d.a(paramFloat6);
/* 122:    */     }
/* 123:124 */     cjm.glPopMatrix();
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void a(float paramFloat)
/* 127:    */   {
/* 128:129 */     boolean bool = this.h.j;
/* 129:130 */     this.h.j = true;
/* 130:131 */     super.a(paramFloat);
/* 131:132 */     this.h.j = bool;
/* 132:    */   }
/* 133:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cbv
 * JD-Core Version:    0.7.0.1
 */