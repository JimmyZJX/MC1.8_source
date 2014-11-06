package net.minecraft.src;
/*   1:    */ public class cdo
/*   2:    */   extends ccq
/*   3:    */ {
/*   4:    */   public cdy a;
/*   5:    */   public cdy b;
/*   6:    */   public cdy c;
/*   7:    */   public cdy d;
/*   8:    */   public cdy e;
/*   9:    */   public cdy f;
/*  10:    */   cdy g;
/*  11:    */   cdy h;
/*  12:    */   
/*  13:    */   public cdo()
/*  14:    */   {
/*  15: 18 */     float f1 = 0.0F;
/*  16:    */     
/*  17: 20 */     float f2 = 13.5F;
/*  18:    */     
/*  19: 22 */     this.a = new cdy(this, 0, 0);
/*  20: 23 */     this.a.a(-3.0F, -3.0F, -2.0F, 6, 6, 4, f1);
/*  21: 24 */     this.a.a(-1.0F, f2, -7.0F);
/*  22:    */     
/*  23: 26 */     this.b = new cdy(this, 18, 14);
/*  24: 27 */     this.b.a(-4.0F, -2.0F, -3.0F, 6, 9, 6, f1);
/*  25: 28 */     this.b.a(0.0F, 14.0F, 2.0F);
/*  26:    */     
/*  27: 30 */     this.h = new cdy(this, 21, 0);
/*  28: 31 */     this.h.a(-4.0F, -3.0F, -3.0F, 8, 6, 7, f1);
/*  29: 32 */     this.h.a(-1.0F, 14.0F, 2.0F);
/*  30:    */     
/*  31: 34 */     this.c = new cdy(this, 0, 18);
/*  32: 35 */     this.c.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  33: 36 */     this.c.a(-2.5F, 16.0F, 7.0F);
/*  34:    */     
/*  35: 38 */     this.d = new cdy(this, 0, 18);
/*  36: 39 */     this.d.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  37: 40 */     this.d.a(0.5F, 16.0F, 7.0F);
/*  38:    */     
/*  39: 42 */     this.e = new cdy(this, 0, 18);
/*  40: 43 */     this.e.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  41: 44 */     this.e.a(-2.5F, 16.0F, -4.0F);
/*  42:    */     
/*  43: 46 */     this.f = new cdy(this, 0, 18);
/*  44: 47 */     this.f.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  45: 48 */     this.f.a(0.5F, 16.0F, -4.0F);
/*  46:    */     
/*  47: 50 */     this.g = new cdy(this, 9, 18);
/*  48: 51 */     this.g.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
/*  49: 52 */     this.g.a(-1.0F, 12.0F, 8.0F);
/*  50:    */     
/*  51: 54 */     this.a.a(16, 14).a(-3.0F, -5.0F, 0.0F, 2, 2, 1, f1);
/*  52: 55 */     this.a.a(16, 14).a(1.0F, -5.0F, 0.0F, 2, 2, 1, f1);
/*  53: 56 */     this.a.a(0, 10).a(-1.5F, 0.0F, -5.0F, 3, 3, 4, f1);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  57:    */   {
/*  58: 61 */     super.a(paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  59: 62 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/*  60: 64 */     if (this.r)
/*  61:    */     {
/*  62: 65 */       float f1 = 2.0F;
/*  63: 66 */       cjm.glPushMatrix();
/*  64: 67 */       cjm.glTranslatef(0.0F, 5.0F * paramFloat6, 2.0F * paramFloat6);
/*  65: 68 */       this.a.b(paramFloat6);
/*  66: 69 */       cjm.glPopMatrix();
/*  67: 70 */       cjm.glPushMatrix();
/*  68: 71 */       cjm.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/*  69: 72 */       cjm.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/*  70: 73 */       this.b.a(paramFloat6);
/*  71: 74 */       this.c.a(paramFloat6);
/*  72: 75 */       this.d.a(paramFloat6);
/*  73: 76 */       this.e.a(paramFloat6);
/*  74: 77 */       this.f.a(paramFloat6);
/*  75:    */       
/*  76: 79 */       this.g.b(paramFloat6);
/*  77: 80 */       this.h.a(paramFloat6);
/*  78: 81 */       cjm.glPopMatrix();
/*  79:    */     }
/*  80:    */     else
/*  81:    */     {
/*  82: 83 */       this.a.b(paramFloat6);
/*  83: 84 */       this.b.a(paramFloat6);
/*  84: 85 */       this.c.a(paramFloat6);
/*  85: 86 */       this.d.a(paramFloat6);
/*  86: 87 */       this.e.a(paramFloat6);
/*  87: 88 */       this.f.a(paramFloat6);
/*  88:    */       
/*  89: 90 */       this.g.b(paramFloat6);
/*  90: 91 */       this.h.a(paramFloat6);
/*  91:    */     }
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/*  95:    */   {
/*  96: 97 */     EntityWolf localacu = (EntityWolf)paramxm;
/*  97: 99 */     if (localacu.ct()) {
/*  98:100 */       this.g.g = 0.0F;
/*  99:    */     } else {
/* 100:102 */       this.g.g = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 101:    */     }
/* 102:105 */     if (localacu.cl())
/* 103:    */     {
/* 104:106 */       this.h.a(-1.0F, 16.0F, -3.0F);
/* 105:107 */       this.h.f = 1.256637F;
/* 106:108 */       this.h.g = 0.0F;
/* 107:    */       
/* 108:110 */       this.b.a(0.0F, 18.0F, 0.0F);
/* 109:111 */       this.b.f = 0.7853982F;
/* 110:    */       
/* 111:113 */       this.g.a(-1.0F, 21.0F, 6.0F);
/* 112:    */       
/* 113:115 */       this.c.a(-2.5F, 22.0F, 2.0F);
/* 114:116 */       this.c.f = 4.712389F;
/* 115:117 */       this.d.a(0.5F, 22.0F, 2.0F);
/* 116:118 */       this.d.f = 4.712389F;
/* 117:    */       
/* 118:120 */       this.e.f = 5.811947F;
/* 119:121 */       this.e.a(-2.49F, 17.0F, -4.0F);
/* 120:122 */       this.f.f = 5.811947F;
/* 121:123 */       this.f.a(0.51F, 17.0F, -4.0F);
/* 122:    */     }
/* 123:    */     else
/* 124:    */     {
/* 125:125 */       this.b.a(0.0F, 14.0F, 2.0F);
/* 126:126 */       this.b.f = 1.570796F;
/* 127:    */       
/* 128:128 */       this.h.a(-1.0F, 14.0F, -3.0F);
/* 129:129 */       this.h.f = this.b.f;
/* 130:    */       
/* 131:131 */       this.g.a(-1.0F, 12.0F, 8.0F);
/* 132:    */       
/* 133:133 */       this.c.a(-2.5F, 16.0F, 7.0F);
/* 134:134 */       this.d.a(0.5F, 16.0F, 7.0F);
/* 135:135 */       this.e.a(-2.5F, 16.0F, -4.0F);
/* 136:136 */       this.f.a(0.5F, 16.0F, -4.0F);
/* 137:    */       
/* 138:138 */       this.c.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 139:139 */       this.d.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2);
/* 140:140 */       this.e.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2);
/* 141:141 */       this.f.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 142:    */     }
/* 143:144 */     this.a.h = (localacu.p(paramFloat3) + localacu.i(paramFloat3, 0.0F));
/* 144:    */     
/* 145:146 */     this.h.h = localacu.i(paramFloat3, -0.08F);
/* 146:147 */     this.b.h = localacu.i(paramFloat3, -0.16F);
/* 147:148 */     this.g.h = localacu.i(paramFloat3, -0.2F);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 151:    */   {
/* 152:153 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 153:154 */     this.a.f = (paramFloat5 / 57.295776F);
/* 154:155 */     this.a.g = (paramFloat4 / 57.295776F);
/* 155:    */     
/* 156:157 */     this.g.f = paramFloat3;
/* 157:    */   }
/* 158:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdo
 * JD-Core Version:    0.7.0.1
 */