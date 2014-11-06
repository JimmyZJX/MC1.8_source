package net.minecraft.src;
/*   1:    */ public class ccl
/*   2:    */   extends ccq
/*   3:    */ {
/*   4:    */   public cdy e;
/*   5:    */   public cdy f;
/*   6:    */   public cdy g;
/*   7:    */   public cdy h;
/*   8:    */   public cdy i;
/*   9:    */   public cdy j;
/*  10:    */   public cdy k;
/*  11:    */   public int l;
/*  12:    */   public int m;
/*  13:    */   public boolean n;
/*  14:    */   public boolean o;
/*  15:    */   
/*  16:    */   public ccl()
/*  17:    */   {
/*  18: 30 */     this(0.0F);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public ccl(float paramFloat)
/*  22:    */   {
/*  23: 34 */     this(paramFloat, 0.0F, 64, 32);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public ccl(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
/*  27:    */   {
/*  28: 38 */     this.t = paramInt1;
/*  29: 39 */     this.u = paramInt2;
/*  30:    */     
/*  31: 41 */     this.e = new cdy(this, 0, 0);
/*  32: 42 */     this.e.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat1);
/*  33: 43 */     this.e.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*  34:    */     
/*  35: 45 */     this.f = new cdy(this, 32, 0);
/*  36: 46 */     this.f.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat1 + 0.5F);
/*  37: 47 */     this.f.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*  38:    */     
/*  39: 49 */     this.g = new cdy(this, 16, 16);
/*  40: 50 */     this.g.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat1);
/*  41: 51 */     this.g.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*  42:    */     
/*  43: 53 */     this.h = new cdy(this, 40, 16);
/*  44: 54 */     this.h.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  45: 55 */     this.h.a(-5.0F, 2.0F + paramFloat2, 0.0F);
/*  46:    */     
/*  47: 57 */     this.i = new cdy(this, 40, 16);
/*  48: 58 */     this.i.i = true;
/*  49: 59 */     this.i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  50: 60 */     this.i.a(5.0F, 2.0F + paramFloat2, 0.0F);
/*  51:    */     
/*  52: 62 */     this.j = new cdy(this, 0, 16);
/*  53: 63 */     this.j.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  54: 64 */     this.j.a(-1.9F, 12.0F + paramFloat2, 0.0F);
/*  55:    */     
/*  56: 66 */     this.k = new cdy(this, 0, 16);
/*  57: 67 */     this.k.i = true;
/*  58: 68 */     this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  59: 69 */     this.k.a(1.9F, 12.0F + paramFloat2, 0.0F);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  63:    */   {
/*  64: 74 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/*  65:    */     
/*  66: 76 */     cjm.glPushMatrix();
/*  67: 77 */     if (this.r)
/*  68:    */     {
/*  69: 78 */       float f1 = 2.0F;
/*  70: 79 */       cjm.glScalef(1.5F / f1, 1.5F / f1, 1.5F / f1);
/*  71: 80 */       cjm.glTranslatef(0.0F, 16.0F * paramFloat6, 0.0F);
/*  72: 81 */       this.e.a(paramFloat6);
/*  73: 82 */       cjm.glPopMatrix();
/*  74: 83 */       cjm.glPushMatrix();
/*  75: 84 */       cjm.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/*  76: 85 */       cjm.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/*  77: 86 */       this.g.a(paramFloat6);
/*  78: 87 */       this.h.a(paramFloat6);
/*  79: 88 */       this.i.a(paramFloat6);
/*  80: 89 */       this.j.a(paramFloat6);
/*  81: 90 */       this.k.a(paramFloat6);
/*  82: 91 */       this.f.a(paramFloat6);
/*  83:    */     }
/*  84:    */     else
/*  85:    */     {
/*  86: 93 */       if (paramwv.aw()) {
/*  87: 94 */         cjm.glTranslatef(0.0F, 0.2F, 0.0F);
/*  88:    */       }
/*  89: 96 */       this.e.a(paramFloat6);
/*  90: 97 */       this.g.a(paramFloat6);
/*  91: 98 */       this.h.a(paramFloat6);
/*  92: 99 */       this.i.a(paramFloat6);
/*  93:100 */       this.j.a(paramFloat6);
/*  94:101 */       this.k.a(paramFloat6);
/*  95:102 */       this.f.a(paramFloat6);
/*  96:    */     }
/*  97:104 */     cjm.glPopMatrix();
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 101:    */   {
/* 102:109 */     this.e.g = (paramFloat4 / 57.295776F);
/* 103:110 */     this.e.f = (paramFloat5 / 57.295776F);
/* 104:    */     
/* 105:112 */     this.h.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 2.0F * paramFloat2 * 0.5F);
/* 106:    */     
/* 107:114 */     this.i.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 2.0F * paramFloat2 * 0.5F);
/* 108:115 */     this.h.h = 0.0F;
/* 109:116 */     this.i.h = 0.0F;
/* 110:    */     
/* 111:118 */     this.j.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 112:119 */     this.k.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2);
/* 113:120 */     this.j.g = 0.0F;
/* 114:121 */     this.k.g = 0.0F;
/* 115:123 */     if (this.q)
/* 116:    */     {
/* 117:124 */       this.h.f += -0.6283186F;
/* 118:125 */       this.i.f += -0.6283186F;
/* 119:126 */       this.j.f = -1.256637F;
/* 120:127 */       this.k.f = -1.256637F;
/* 121:128 */       this.j.g = 0.3141593F;
/* 122:129 */       this.k.g = -0.3141593F;
/* 123:    */     }
/* 124:132 */     if (this.l != 0) {
/* 125:133 */       this.i.f = (this.i.f * 0.5F - 0.3141593F * this.l);
/* 126:    */     }
/* 127:136 */     this.h.g = 0.0F;
/* 128:137 */     this.h.h = 0.0F;
/* 129:139 */     switch (this.m)
/* 130:    */     {
/* 131:    */     case 0: 
/* 132:    */       break;
/* 133:    */     case 3: 
/* 134:143 */       this.h.f = (this.h.f * 0.5F - 0.3141593F * this.m);
/* 135:144 */       this.h.g = -0.5235988F;
/* 136:145 */       break;
/* 137:    */     case 1: 
/* 138:147 */       this.h.f = (this.h.f * 0.5F - 0.3141593F * this.m);
/* 139:    */     }
/* 140:151 */     this.i.g = 0.0F;
/* 141:    */     float f1;
/* 142:    */     float f2;
/* 143:153 */     if (this.p > -9990.0F)
/* 144:    */     {
/* 145:154 */       f1 = this.p;
/* 146:155 */       this.g.g = (MathUtils.sin(MathUtils.sqrt(f1) * 3.141593F * 2.0F) * 0.2F);
/* 147:156 */       this.h.e = (MathUtils.sin(this.g.g) * 5.0F);
/* 148:157 */       this.h.c = (-MathUtils.cos(this.g.g) * 5.0F);
/* 149:158 */       this.i.e = (-MathUtils.sin(this.g.g) * 5.0F);
/* 150:159 */       this.i.c = (MathUtils.cos(this.g.g) * 5.0F);
/* 151:160 */       this.h.g += this.g.g;
/* 152:161 */       this.i.g += this.g.g;
/* 153:162 */       this.i.f += this.g.g;
/* 154:    */       
/* 155:164 */       f1 = 1.0F - this.p;
/* 156:165 */       f1 *= f1;
/* 157:166 */       f1 *= f1;
/* 158:167 */       f1 = 1.0F - f1;
/* 159:168 */       f2 = MathUtils.sin(f1 * 3.141593F);
/* 160:169 */       float f3 = MathUtils.sin(this.p * 3.141593F) * -(this.e.f - 0.7F) * 0.75F; cdy 
/* 161:170 */         tmp618_615 = this.h;tmp618_615.f = ((float)(tmp618_615.f - (f2 * 1.2D + f3)));
/* 162:171 */       this.h.g += this.g.g * 2.0F;
/* 163:172 */       this.h.h += MathUtils.sin(this.p * 3.141593F) * -0.4F;
/* 164:    */     }
/* 165:175 */     if (this.n)
/* 166:    */     {
/* 167:176 */       this.g.f = 0.5F;
/* 168:177 */       this.h.f += 0.4F;
/* 169:178 */       this.i.f += 0.4F;
/* 170:179 */       this.j.e = 4.0F;
/* 171:180 */       this.k.e = 4.0F;
/* 172:181 */       this.j.d = 9.0F;
/* 173:182 */       this.k.d = 9.0F;
/* 174:183 */       this.e.d = 1.0F;
/* 175:    */     }
/* 176:    */     else
/* 177:    */     {
/* 178:185 */       this.g.f = 0.0F;
/* 179:186 */       this.j.e = 0.1F;
/* 180:187 */       this.k.e = 0.1F;
/* 181:188 */       this.j.d = 12.0F;
/* 182:189 */       this.k.d = 12.0F;
/* 183:190 */       this.e.d = 0.0F;
/* 184:    */     }
/* 185:193 */     this.h.h += MathUtils.cos(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 186:194 */     this.i.h -= MathUtils.cos(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 187:195 */     this.h.f += MathUtils.sin(paramFloat3 * 0.067F) * 0.05F;
/* 188:196 */     this.i.f -= MathUtils.sin(paramFloat3 * 0.067F) * 0.05F;
/* 189:198 */     if (this.o)
/* 190:    */     {
/* 191:199 */       f1 = 0.0F;
/* 192:200 */       f2 = 0.0F;
/* 193:    */       
/* 194:202 */       this.h.h = 0.0F;
/* 195:203 */       this.i.h = 0.0F;
/* 196:204 */       this.h.g = (-(0.1F - f1 * 0.6F) + this.e.g);
/* 197:205 */       this.i.g = (0.1F - f1 * 0.6F + this.e.g + 0.4F);
/* 198:206 */       this.h.f = (-1.570796F + this.e.f);
/* 199:207 */       this.i.f = (-1.570796F + this.e.f);
/* 200:208 */       this.h.f -= f1 * 1.2F - f2 * 0.4F;
/* 201:209 */       this.i.f -= f1 * 1.2F - f2 * 0.4F;
/* 202:    */       
/* 203:211 */       this.h.h += MathUtils.cos(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 204:212 */       this.i.h -= MathUtils.cos(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 205:213 */       this.h.f += MathUtils.sin(paramFloat3 * 0.067F) * 0.05F;
/* 206:214 */       this.i.f -= MathUtils.sin(paramFloat3 * 0.067F) * 0.05F;
/* 207:    */     }
/* 208:217 */     a(this.e, this.f);
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void a(ccq paramccq)
/* 212:    */   {
/* 213:251 */     super.a(paramccq);
/* 214:253 */     if ((paramccq instanceof ccl))
/* 215:    */     {
/* 216:254 */       ccl localccl = (ccl)paramccq;
/* 217:255 */       this.l = localccl.l;
/* 218:256 */       this.m = localccl.m;
/* 219:257 */       this.n = localccl.n;
/* 220:258 */       this.o = localccl.o;
/* 221:    */     }
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void a(boolean paramBoolean)
/* 225:    */   {
/* 226:263 */     this.e.j = paramBoolean;
/* 227:264 */     this.f.j = paramBoolean;
/* 228:265 */     this.g.j = paramBoolean;
/* 229:266 */     this.h.j = paramBoolean;
/* 230:267 */     this.i.j = paramBoolean;
/* 231:268 */     this.j.j = paramBoolean;
/* 232:269 */     this.k.j = paramBoolean;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void a(float paramFloat)
/* 236:    */   {
/* 237:273 */     this.h.c(paramFloat);
/* 238:    */   }
/* 239:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccl
 * JD-Core Version:    0.7.0.1
 */