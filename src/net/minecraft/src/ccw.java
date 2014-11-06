package net.minecraft.src;
/*   1:    */ public class ccw
/*   2:    */   extends ccq
/*   3:    */ {
/*   4:    */   cdy a;
/*   5:    */   cdy b;
/*   6:    */   cdy c;
/*   7:    */   cdy d;
/*   8:    */   cdy e;
/*   9:    */   cdy f;
/*  10:    */   cdy g;
/*  11:    */   cdy h;
/*  12:    */   cdy i;
/*  13:    */   cdy j;
/*  14:    */   cdy k;
/*  15:    */   cdy l;
/*  16:    */   
/*  17:    */   public ccw()
/*  18:    */   {
/*  19: 27 */     a("head.main", 0, 0);
/*  20: 28 */     a("head.nose", 0, 24);
/*  21: 29 */     a("head.ear1", 0, 10);
/*  22: 30 */     a("head.ear2", 6, 10);
/*  23:    */     
/*  24: 32 */     this.a = new cdy(this, 26, 24);
/*  25: 33 */     this.a.a(-1.0F, 5.5F, -3.7F, 2, 1, 7);
/*  26: 34 */     this.a.a(3.0F, 17.5F, 3.7F);
/*  27: 35 */     this.a.i = true;
/*  28: 36 */     a(this.a, 0.0F, 0.0F, 0.0F);
/*  29:    */     
/*  30: 38 */     this.b = new cdy(this, 8, 24);
/*  31: 39 */     this.b.a(-1.0F, 5.5F, -3.7F, 2, 1, 7);
/*  32: 40 */     this.b.a(-3.0F, 17.5F, 3.7F);
/*  33: 41 */     this.b.i = true;
/*  34: 42 */     a(this.b, 0.0F, 0.0F, 0.0F);
/*  35:    */     
/*  36: 44 */     this.c = new cdy(this, 30, 15);
/*  37: 45 */     this.c.a(-1.0F, 0.0F, 0.0F, 2, 4, 5);
/*  38: 46 */     this.c.a(3.0F, 17.5F, 3.7F);
/*  39: 47 */     this.c.i = true;
/*  40: 48 */     a(this.c, -0.3490658F, 0.0F, 0.0F);
/*  41:    */     
/*  42: 50 */     this.d = new cdy(this, 16, 15);
/*  43: 51 */     this.d.a(-1.0F, 0.0F, 0.0F, 2, 4, 5);
/*  44: 52 */     this.d.a(-3.0F, 17.5F, 3.7F);
/*  45: 53 */     this.d.i = true;
/*  46: 54 */     a(this.d, -0.3490658F, 0.0F, 0.0F);
/*  47:    */     
/*  48: 56 */     this.e = new cdy(this, 0, 0);
/*  49: 57 */     this.e.a(-3.0F, -2.0F, -10.0F, 6, 5, 10);
/*  50: 58 */     this.e.a(0.0F, 19.0F, 8.0F);
/*  51: 59 */     this.e.i = true;
/*  52: 60 */     a(this.e, -0.3490658F, 0.0F, 0.0F);
/*  53:    */     
/*  54: 62 */     this.f = new cdy(this, 8, 15);
/*  55: 63 */     this.f.a(-1.0F, 0.0F, -1.0F, 2, 7, 2);
/*  56: 64 */     this.f.a(3.0F, 17.0F, -1.0F);
/*  57: 65 */     this.f.i = true;
/*  58: 66 */     a(this.f, -0.1745329F, 0.0F, 0.0F);
/*  59:    */     
/*  60: 68 */     this.g = new cdy(this, 0, 15);
/*  61: 69 */     this.g.a(-1.0F, 0.0F, -1.0F, 2, 7, 2);
/*  62: 70 */     this.g.a(-3.0F, 17.0F, -1.0F);
/*  63: 71 */     this.g.i = true;
/*  64: 72 */     a(this.g, -0.1745329F, 0.0F, 0.0F);
/*  65:    */     
/*  66: 74 */     this.h = new cdy(this, 32, 0);
/*  67: 75 */     this.h.a(-2.5F, -4.0F, -5.0F, 5, 4, 5);
/*  68: 76 */     this.h.a(0.0F, 16.0F, -1.0F);
/*  69: 77 */     this.h.i = true;
/*  70: 78 */     a(this.h, 0.0F, 0.0F, 0.0F);
/*  71:    */     
/*  72: 80 */     this.i = new cdy(this, 52, 0);
/*  73: 81 */     this.i.a(-2.5F, -9.0F, -1.0F, 2, 5, 1);
/*  74: 82 */     this.i.a(0.0F, 16.0F, -1.0F);
/*  75: 83 */     this.i.i = true;
/*  76: 84 */     a(this.i, 0.0F, -0.261799F, 0.0F);
/*  77:    */     
/*  78: 86 */     this.j = new cdy(this, 58, 0);
/*  79: 87 */     this.j.a(0.5F, -9.0F, -1.0F, 2, 5, 1);
/*  80: 88 */     this.j.a(0.0F, 16.0F, -1.0F);
/*  81: 89 */     this.j.i = true;
/*  82: 90 */     a(this.j, 0.0F, 0.261799F, 0.0F);
/*  83:    */     
/*  84: 92 */     this.k = new cdy(this, 52, 6);
/*  85: 93 */     this.k.a(-1.5F, -1.5F, 0.0F, 3, 3, 2);
/*  86: 94 */     this.k.a(0.0F, 20.0F, 7.0F);
/*  87: 95 */     this.k.i = true;
/*  88: 96 */     a(this.k, -0.349066F, 0.0F, 0.0F);
/*  89:    */     
/*  90: 98 */     this.l = new cdy(this, 32, 9);
/*  91: 99 */     this.l.a(-0.5F, -2.5F, -5.5F, 1, 1, 1);
/*  92:100 */     this.l.a(0.0F, 16.0F, -1.0F);
/*  93:101 */     this.l.i = true;
/*  94:102 */     a(this.l, 0.0F, 0.0F, 0.0F);
/*  95:    */   }
/*  96:    */   
/*  97:    */   private void a(cdy paramcdy, float paramFloat1, float paramFloat2, float paramFloat3)
/*  98:    */   {
/*  99:107 */     paramcdy.f = paramFloat1;
/* 100:108 */     paramcdy.g = paramFloat2;
/* 101:109 */     paramcdy.h = paramFloat3;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 105:    */   {
/* 106:114 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 107:115 */     if (this.r)
/* 108:    */     {
/* 109:116 */       float f1 = 2.0F;
/* 110:117 */       cjm.glPushMatrix();
/* 111:118 */       cjm.glTranslatef(0.0F, 5.0F * paramFloat6, 2.0F * paramFloat6);
/* 112:119 */       this.h.a(paramFloat6);
/* 113:120 */       this.j.a(paramFloat6);
/* 114:121 */       this.i.a(paramFloat6);
/* 115:122 */       this.l.a(paramFloat6);
/* 116:123 */       cjm.glPopMatrix();
/* 117:124 */       cjm.glPushMatrix();
/* 118:125 */       cjm.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/* 119:126 */       cjm.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/* 120:127 */       this.a.a(paramFloat6);
/* 121:128 */       this.b.a(paramFloat6);
/* 122:129 */       this.c.a(paramFloat6);
/* 123:130 */       this.d.a(paramFloat6);
/* 124:131 */       this.e.a(paramFloat6);
/* 125:132 */       this.f.a(paramFloat6);
/* 126:133 */       this.g.a(paramFloat6);
/* 127:134 */       this.k.a(paramFloat6);
/* 128:135 */       cjm.glPopMatrix();
/* 129:    */     }
/* 130:    */     else
/* 131:    */     {
/* 132:137 */       this.a.a(paramFloat6);
/* 133:138 */       this.b.a(paramFloat6);
/* 134:139 */       this.c.a(paramFloat6);
/* 135:140 */       this.d.a(paramFloat6);
/* 136:141 */       this.e.a(paramFloat6);
/* 137:142 */       this.f.a(paramFloat6);
/* 138:143 */       this.g.a(paramFloat6);
/* 139:144 */       this.h.a(paramFloat6);
/* 140:145 */       this.i.a(paramFloat6);
/* 141:146 */       this.j.a(paramFloat6);
/* 142:147 */       this.k.a(paramFloat6);
/* 143:148 */       this.l.a(paramFloat6);
/* 144:    */     }
/* 145:    */   }
/* 146:    */   
/* 147:167 */   private float m = 0.0F;
/* 148:169 */   private float n = 0.0F;
/* 149:    */   
/* 150:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 151:    */   {
/* 152:173 */     float f1 = paramFloat3 - paramwv.W;
/* 153:    */     
/* 154:175 */     EntityRabbit localacb = (EntityRabbit)paramwv;
/* 155:176 */     this.l.f = (this.h.f = this.i.f = this.j.f = paramFloat5 * 0.01745329F);
/* 156:177 */     this.l.g = (this.h.g = paramFloat4 * 0.01745329F);
/* 157:178 */     this.i.g = (this.l.g - 0.261799F);
/* 158:179 */     this.j.g = (this.l.g + 0.261799F);
/* 159:180 */     this.m = MathUtils.sin(localacb.o(f1) * 3.141593F);
/* 160:181 */     this.c.f = (this.d.f = (this.m * 50.0F - 21.0F) * 0.01745329F);
/* 161:182 */     this.a.f = (this.b.f = this.m * 50.0F * 0.01745329F);
/* 162:183 */     this.f.f = (this.g.f = (this.m * -40.0F - 11.0F) * 0.01745329F);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3) {}
/* 166:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccw
 * JD-Core Version:    0.7.0.1
 */