package net.minecraft.src;
/*   1:    */ public class ccr
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
/*  12: 20 */   int i = 1;
/*  13:    */   
/*  14:    */   public ccr()
/*  15:    */   {
/*  16: 40 */     a("head.main", 0, 0);
/*  17: 41 */     a("head.nose", 0, 24);
/*  18: 42 */     a("head.ear1", 0, 10);
/*  19: 43 */     a("head.ear2", 6, 10);
/*  20:    */     
/*  21: 45 */     this.g = new cdy(this, "head");
/*  22: 46 */     this.g.a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
/*  23: 47 */     this.g.a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
/*  24: 48 */     this.g.a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
/*  25: 49 */     this.g.a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
/*  26: 50 */     this.g.a(0.0F, 15.0F, -9.0F);
/*  27:    */     
/*  28: 52 */     this.h = new cdy(this, 20, 0);
/*  29: 53 */     this.h.a(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
/*  30: 54 */     this.h.a(0.0F, 12.0F, -10.0F);
/*  31:    */     
/*  32: 56 */     this.e = new cdy(this, 0, 15);
/*  33: 57 */     this.e.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
/*  34: 58 */     this.e.f = 0.9F;
/*  35: 59 */     this.e.a(0.0F, 15.0F, 8.0F);
/*  36:    */     
/*  37: 61 */     this.f = new cdy(this, 4, 15);
/*  38: 62 */     this.f.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
/*  39: 63 */     this.f.a(0.0F, 20.0F, 14.0F);
/*  40:    */     
/*  41: 65 */     this.a = new cdy(this, 8, 13);
/*  42: 66 */     this.a.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
/*  43: 67 */     this.a.a(1.1F, 18.0F, 5.0F);
/*  44:    */     
/*  45: 69 */     this.b = new cdy(this, 8, 13);
/*  46: 70 */     this.b.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
/*  47: 71 */     this.b.a(-1.1F, 18.0F, 5.0F);
/*  48:    */     
/*  49: 73 */     this.c = new cdy(this, 40, 0);
/*  50: 74 */     this.c.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
/*  51: 75 */     this.c.a(1.2F, 13.8F, -5.0F);
/*  52:    */     
/*  53: 77 */     this.d = new cdy(this, 40, 0);
/*  54: 78 */     this.d.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
/*  55: 79 */     this.d.a(-1.2F, 13.8F, -5.0F);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  59:    */   {
/*  60: 84 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/*  61: 85 */     if (this.r)
/*  62:    */     {
/*  63: 86 */       float f1 = 2.0F;
/*  64: 87 */       cjm.glPushMatrix();
/*  65: 88 */       cjm.glScalef(1.5F / f1, 1.5F / f1, 1.5F / f1);
/*  66: 89 */       cjm.glTranslatef(0.0F, 10.0F * paramFloat6, 4.0F * paramFloat6);
/*  67: 90 */       this.g.a(paramFloat6);
/*  68: 91 */       cjm.glPopMatrix();
/*  69: 92 */       cjm.glPushMatrix();
/*  70: 93 */       cjm.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/*  71: 94 */       cjm.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/*  72: 95 */       this.h.a(paramFloat6);
/*  73: 96 */       this.a.a(paramFloat6);
/*  74: 97 */       this.b.a(paramFloat6);
/*  75: 98 */       this.c.a(paramFloat6);
/*  76: 99 */       this.d.a(paramFloat6);
/*  77:100 */       this.e.a(paramFloat6);
/*  78:101 */       this.f.a(paramFloat6);
/*  79:102 */       cjm.glPopMatrix();
/*  80:    */     }
/*  81:    */     else
/*  82:    */     {
/*  83:104 */       this.g.a(paramFloat6);
/*  84:105 */       this.h.a(paramFloat6);
/*  85:106 */       this.e.a(paramFloat6);
/*  86:107 */       this.f.a(paramFloat6);
/*  87:108 */       this.a.a(paramFloat6);
/*  88:109 */       this.b.a(paramFloat6);
/*  89:110 */       this.c.a(paramFloat6);
/*  90:111 */       this.d.a(paramFloat6);
/*  91:    */     }
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/*  95:    */   {
/*  96:149 */     this.g.f = (paramFloat5 / 57.295776F);
/*  97:150 */     this.g.g = (paramFloat4 / 57.295776F);
/*  98:152 */     if (this.i != 3)
/*  99:    */     {
/* 100:153 */       this.h.f = 1.570796F;
/* 101:154 */       if (this.i == 2)
/* 102:    */       {
/* 103:155 */         this.a.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.0F * paramFloat2);
/* 104:156 */         this.b.f = (MathUtils.cos(paramFloat1 * 0.6662F + 0.3F) * 1.0F * paramFloat2);
/* 105:157 */         this.c.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F + 0.3F) * 1.0F * paramFloat2);
/* 106:158 */         this.d.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.0F * paramFloat2);
/* 107:159 */         this.f.f = (1.727876F + 0.3141593F * MathUtils.cos(paramFloat1) * paramFloat2);
/* 108:    */       }
/* 109:    */       else
/* 110:    */       {
/* 111:161 */         this.a.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.0F * paramFloat2);
/* 112:162 */         this.b.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.0F * paramFloat2);
/* 113:163 */         this.c.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.0F * paramFloat2);
/* 114:164 */         this.d.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.0F * paramFloat2);
/* 115:166 */         if (this.i == 1) {
/* 116:167 */           this.f.f = (1.727876F + 0.7853982F * MathUtils.cos(paramFloat1) * paramFloat2);
/* 117:    */         } else {
/* 118:169 */           this.f.f = (1.727876F + 0.4712389F * MathUtils.cos(paramFloat1) * paramFloat2);
/* 119:    */         }
/* 120:    */       }
/* 121:    */     }
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 125:    */   {
/* 126:177 */     EntityOcelot localaby = (EntityOcelot)paramxm;
/* 127:    */     
/* 128:179 */     this.h.d = 12.0F;
/* 129:180 */     this.h.e = -10.0F;
/* 130:181 */     this.g.d = 15.0F;
/* 131:182 */     this.g.e = -9.0F;
/* 132:183 */     this.e.d = 15.0F;
/* 133:184 */     this.e.e = 8.0F;
/* 134:185 */     this.f.d = 20.0F;
/* 135:186 */     this.f.e = 14.0F;
/* 136:187 */     this.c.d = (this.d.d = 13.8F);
/* 137:188 */     this.c.e = (this.d.e = -5.0F);
/* 138:189 */     this.a.d = (this.b.d = 18.0F);
/* 139:190 */     this.a.e = (this.b.e = 5.0F);
/* 140:191 */     this.e.f = 0.9F;
/* 141:193 */     if (localaby.aw())
/* 142:    */     {
/* 143:194 */       this.h.d += 1.0F;
/* 144:195 */       this.g.d += 2.0F;
/* 145:196 */       this.e.d += 1.0F;
/* 146:197 */       this.f.d += -4.0F;
/* 147:198 */       this.f.e += 2.0F;
/* 148:199 */       this.e.f = 1.570796F;
/* 149:200 */       this.f.f = 1.570796F;
/* 150:201 */       this.i = 0;
/* 151:    */     }
/* 152:202 */     else if (localaby.ax())
/* 153:    */     {
/* 154:203 */       this.f.d = this.e.d;
/* 155:204 */       this.f.e += 2.0F;
/* 156:205 */       this.e.f = 1.570796F;
/* 157:206 */       this.f.f = 1.570796F;
/* 158:207 */       this.i = 2;
/* 159:    */     }
/* 160:208 */     else if (localaby.cl())
/* 161:    */     {
/* 162:209 */       this.h.f = 0.7853982F;
/* 163:210 */       this.h.d += -4.0F;
/* 164:211 */       this.h.e += 5.0F;
/* 165:212 */       this.g.d += -3.3F;
/* 166:213 */       this.g.e += 1.0F;
/* 167:    */       
/* 168:215 */       this.e.d += 8.0F;
/* 169:216 */       this.e.e += -2.0F;
/* 170:217 */       this.f.d += 2.0F;
/* 171:218 */       this.f.e += -0.8F;
/* 172:219 */       this.e.f = 1.727876F;
/* 173:220 */       this.f.f = 2.670354F;
/* 174:    */       
/* 175:222 */       this.c.f = (this.d.f = -0.1570796F);
/* 176:223 */       this.c.d = (this.d.d = 15.8F);
/* 177:224 */       this.c.e = (this.d.e = -7.0F);
/* 178:    */       
/* 179:226 */       this.a.f = (this.b.f = -1.570796F);
/* 180:227 */       this.a.d = (this.b.d = 21.0F);
/* 181:228 */       this.a.e = (this.b.e = 1.0F);
/* 182:229 */       this.i = 3;
/* 183:    */     }
/* 184:    */     else
/* 185:    */     {
/* 186:231 */       this.i = 1;
/* 187:    */     }
/* 188:    */   }
/* 189:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccr
 * JD-Core Version:    0.7.0.1
 */