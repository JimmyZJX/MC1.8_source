package net.minecraft.src;
/*   1:    */ public class cct
/*   2:    */   extends ccl
/*   3:    */ {
/*   4:    */   public cdy a;
/*   5:    */   public cdy b;
/*   6:    */   public cdy c;
/*   7:    */   public cdy d;
/*   8:    */   public cdy v;
/*   9:    */   private cdy w;
/*  10:    */   private cdy x;
/*  11:    */   private boolean y;
/*  12:    */   
/*  13:    */   public cct(float paramFloat, boolean paramBoolean)
/*  14:    */   {
/*  15: 18 */     super(paramFloat, 0.0F, 64, 64);
/*  16: 19 */     this.y = paramBoolean;
/*  17:    */     
/*  18: 21 */     this.x = new cdy(this, 24, 0);
/*  19: 22 */     this.x.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, paramFloat);
/*  20:    */     
/*  21: 24 */     this.w = new cdy(this, 0, 0);
/*  22: 25 */     this.w.b(64, 32);
/*  23: 26 */     this.w.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, paramFloat);
/*  24: 28 */     if (paramBoolean)
/*  25:    */     {
/*  26: 29 */       this.i = new cdy(this, 32, 48);
/*  27: 30 */       this.i.a(-1.0F, -2.0F, -2.0F, 3, 12, 4, paramFloat);
/*  28: 31 */       this.i.a(5.0F, 2.5F, 0.0F);
/*  29:    */       
/*  30: 33 */       this.h = new cdy(this, 40, 16);
/*  31: 34 */       this.h.a(-2.0F, -2.0F, -2.0F, 3, 12, 4, paramFloat);
/*  32: 35 */       this.h.a(-5.0F, 2.5F, 0.0F);
/*  33:    */       
/*  34: 37 */       this.a = new cdy(this, 48, 48);
/*  35: 38 */       this.a.a(-1.0F, -2.0F, -2.0F, 3, 12, 4, paramFloat + 0.25F);
/*  36: 39 */       this.a.a(5.0F, 2.5F, 0.0F);
/*  37:    */       
/*  38: 41 */       this.b = new cdy(this, 40, 32);
/*  39: 42 */       this.b.a(-2.0F, -2.0F, -2.0F, 3, 12, 4, paramFloat + 0.25F);
/*  40: 43 */       this.b.a(-5.0F, 2.5F, 10.0F);
/*  41:    */     }
/*  42:    */     else
/*  43:    */     {
/*  44: 46 */       this.i = new cdy(this, 32, 48);
/*  45: 47 */       this.i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat);
/*  46: 48 */       this.i.a(5.0F, 2.0F, 0.0F);
/*  47:    */       
/*  48:    */ 
/*  49: 51 */       this.a = new cdy(this, 48, 48);
/*  50: 52 */       this.a.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat + 0.25F);
/*  51: 53 */       this.a.a(5.0F, 2.0F, 0.0F);
/*  52:    */       
/*  53: 55 */       this.b = new cdy(this, 40, 32);
/*  54: 56 */       this.b.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat + 0.25F);
/*  55: 57 */       this.b.a(-5.0F, 2.0F, 10.0F);
/*  56:    */     }
/*  57: 60 */     this.k = new cdy(this, 16, 48);
/*  58: 61 */     this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat);
/*  59: 62 */     this.k.a(1.9F, 12.0F, 0.0F);
/*  60:    */     
/*  61: 64 */     this.c = new cdy(this, 0, 48);
/*  62: 65 */     this.c.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat + 0.25F);
/*  63: 66 */     this.c.a(1.9F, 12.0F, 0.0F);
/*  64:    */     
/*  65: 68 */     this.d = new cdy(this, 0, 32);
/*  66: 69 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat + 0.25F);
/*  67: 70 */     this.d.a(-1.9F, 12.0F, 0.0F);
/*  68:    */     
/*  69: 72 */     this.v = new cdy(this, 16, 32);
/*  70: 73 */     this.v.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat + 0.25F);
/*  71: 74 */     this.v.a(0.0F, 0.0F, 0.0F);
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  75:    */   {
/*  76: 79 */     super.a(paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  77:    */     
/*  78: 81 */     cjm.glPushMatrix();
/*  79: 82 */     if (this.r)
/*  80:    */     {
/*  81: 83 */       float f = 2.0F;
/*  82: 84 */       cjm.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
/*  83: 85 */       cjm.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/*  84: 86 */       this.c.a(paramFloat6);
/*  85: 87 */       this.d.a(paramFloat6);
/*  86: 88 */       this.a.a(paramFloat6);
/*  87: 89 */       this.b.a(paramFloat6);
/*  88: 90 */       this.v.a(paramFloat6);
/*  89:    */     }
/*  90:    */     else
/*  91:    */     {
/*  92: 92 */       if (paramwv.aw()) {
/*  93: 93 */         cjm.glTranslatef(0.0F, 0.2F, 0.0F);
/*  94:    */       }
/*  95: 95 */       this.c.a(paramFloat6);
/*  96: 96 */       this.d.a(paramFloat6);
/*  97: 97 */       this.a.a(paramFloat6);
/*  98: 98 */       this.b.a(paramFloat6);
/*  99: 99 */       this.v.a(paramFloat6);
/* 100:    */     }
/* 101:101 */     cjm.glPopMatrix();
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void b(float paramFloat)
/* 105:    */   {
/* 106:105 */     a(this.e, this.x);
/* 107:106 */     this.x.c = 0.0F;
/* 108:107 */     this.x.d = 0.0F;
/* 109:108 */     this.x.a(paramFloat);
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void c(float paramFloat)
/* 113:    */   {
/* 114:112 */     this.w.a(paramFloat);
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 118:    */   {
/* 119:117 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 120:    */     
/* 121:119 */     a(this.k, this.c);
/* 122:120 */     a(this.j, this.d);
/* 123:121 */     a(this.i, this.a);
/* 124:122 */     a(this.h, this.b);
/* 125:123 */     a(this.g, this.v);
/* 126:125 */     if (paramwv.aw()) {
/* 127:126 */       this.w.d = 2.0F;
/* 128:    */     } else {
/* 129:128 */       this.w.d = 0.0F;
/* 130:    */     }
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void a()
/* 134:    */   {
/* 135:150 */     this.h.a(0.0625F);
/* 136:151 */     this.b.a(0.0625F);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void b()
/* 140:    */   {
/* 141:155 */     this.i.a(0.0625F);
/* 142:156 */     this.a.a(0.0625F);
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void a(boolean paramBoolean)
/* 146:    */   {
/* 147:161 */     super.a(paramBoolean);
/* 148:162 */     this.a.j = paramBoolean;
/* 149:163 */     this.b.j = paramBoolean;
/* 150:164 */     this.c.j = paramBoolean;
/* 151:165 */     this.d.j = paramBoolean;
/* 152:166 */     this.v.j = paramBoolean;
/* 153:167 */     this.w.j = paramBoolean;
/* 154:168 */     this.x.j = paramBoolean;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void a(float paramFloat)
/* 158:    */   {
/* 159:174 */     if (this.y)
/* 160:    */     {
/* 161:175 */       this.h.c += 1.0F;
/* 162:176 */       this.h.c(paramFloat);
/* 163:177 */       this.h.c -= 1.0F;
/* 164:    */     }
/* 165:    */     else
/* 166:    */     {
/* 167:179 */       this.h.c(paramFloat);
/* 168:    */     }
/* 169:    */   }
/* 170:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cct
 * JD-Core Version:    0.7.0.1
 */