package net.minecraft.src;
/*   1:    */ public class cdq
/*   2:    */   extends ccq
/*   3:    */ {
/*   4:    */   private cdy a;
/*   5:    */   private cdy b;
/*   6:    */   private cdy c;
/*   7:    */   private cdy d;
/*   8:    */   private cdy e;
/*   9:    */   private cdy f;
/*  10:    */   private cdy g;
/*  11:    */   private cdy h;
/*  12:    */   private cdy i;
/*  13:    */   private cdy j;
/*  14:    */   private cdy k;
/*  15:    */   private cdy l;
/*  16:    */   private float m;
/*  17:    */   
/*  18:    */   public cdq(float paramFloat)
/*  19:    */   {
/*  20: 32 */     this.t = 256;
/*  21: 33 */     this.u = 256;
/*  22:    */     
/*  23: 35 */     a("body.body", 0, 0);
/*  24: 36 */     a("wing.skin", -56, 88);
/*  25: 37 */     a("wingtip.skin", -56, 144);
/*  26: 38 */     a("rearleg.main", 0, 0);
/*  27: 39 */     a("rearfoot.main", 112, 0);
/*  28: 40 */     a("rearlegtip.main", 196, 0);
/*  29: 41 */     a("head.upperhead", 112, 30);
/*  30: 42 */     a("wing.bone", 112, 88);
/*  31: 43 */     a("head.upperlip", 176, 44);
/*  32: 44 */     a("jaw.jaw", 176, 65);
/*  33: 45 */     a("frontleg.main", 112, 104);
/*  34: 46 */     a("wingtip.bone", 112, 136);
/*  35: 47 */     a("frontfoot.main", 144, 104);
/*  36: 48 */     a("neck.box", 192, 104);
/*  37: 49 */     a("frontlegtip.main", 226, 138);
/*  38: 50 */     a("body.scale", 220, 53);
/*  39: 51 */     a("head.scale", 0, 0);
/*  40: 52 */     a("neck.scale", 48, 0);
/*  41: 53 */     a("head.nostril", 112, 0);
/*  42:    */     
/*  43: 55 */     float f1 = -16.0F;
/*  44: 56 */     this.a = new cdy(this, "head");
/*  45: 57 */     this.a.a("upperlip", -6.0F, -1.0F, -8.0F + f1, 12, 5, 16);
/*  46: 58 */     this.a.a("upperhead", -8.0F, -8.0F, 6.0F + f1, 16, 16, 16);
/*  47: 59 */     this.a.i = true;
/*  48: 60 */     this.a.a("scale", -5.0F, -12.0F, 12.0F + f1, 2, 4, 6);
/*  49: 61 */     this.a.a("nostril", -5.0F, -3.0F, -6.0F + f1, 2, 2, 4);
/*  50: 62 */     this.a.i = false;
/*  51: 63 */     this.a.a("scale", 3.0F, -12.0F, 12.0F + f1, 2, 4, 6);
/*  52: 64 */     this.a.a("nostril", 3.0F, -3.0F, -6.0F + f1, 2, 2, 4);
/*  53:    */     
/*  54: 66 */     this.c = new cdy(this, "jaw");
/*  55: 67 */     this.c.a(0.0F, 4.0F, 8.0F + f1);
/*  56: 68 */     this.c.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
/*  57: 69 */     this.a.a(this.c);
/*  58:    */     
/*  59: 71 */     this.b = new cdy(this, "neck");
/*  60: 72 */     this.b.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
/*  61: 73 */     this.b.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
/*  62:    */     
/*  63: 75 */     this.d = new cdy(this, "body");
/*  64: 76 */     this.d.a(0.0F, 4.0F, 8.0F);
/*  65: 77 */     this.d.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
/*  66: 78 */     this.d.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
/*  67: 79 */     this.d.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
/*  68: 80 */     this.d.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
/*  69:    */     
/*  70: 82 */     this.k = new cdy(this, "wing");
/*  71: 83 */     this.k.a(-12.0F, 5.0F, 2.0F);
/*  72: 84 */     this.k.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
/*  73: 85 */     this.k.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
/*  74: 86 */     this.l = new cdy(this, "wingtip");
/*  75: 87 */     this.l.a(-56.0F, 0.0F, 0.0F);
/*  76: 88 */     this.l.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
/*  77: 89 */     this.l.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
/*  78: 90 */     this.k.a(this.l);
/*  79:    */     
/*  80: 92 */     this.f = new cdy(this, "frontleg");
/*  81: 93 */     this.f.a(-12.0F, 20.0F, 2.0F);
/*  82: 94 */     this.f.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
/*  83: 95 */     this.h = new cdy(this, "frontlegtip");
/*  84: 96 */     this.h.a(0.0F, 20.0F, -1.0F);
/*  85: 97 */     this.h.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
/*  86: 98 */     this.f.a(this.h);
/*  87: 99 */     this.j = new cdy(this, "frontfoot");
/*  88:100 */     this.j.a(0.0F, 23.0F, 0.0F);
/*  89:101 */     this.j.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
/*  90:102 */     this.h.a(this.j);
/*  91:    */     
/*  92:104 */     this.e = new cdy(this, "rearleg");
/*  93:105 */     this.e.a(-16.0F, 16.0F, 42.0F);
/*  94:106 */     this.e.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
/*  95:107 */     this.g = new cdy(this, "rearlegtip");
/*  96:108 */     this.g.a(0.0F, 32.0F, -4.0F);
/*  97:109 */     this.g.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
/*  98:110 */     this.e.a(this.g);
/*  99:111 */     this.i = new cdy(this, "rearfoot");
/* 100:112 */     this.i.a(0.0F, 31.0F, 4.0F);
/* 101:113 */     this.i.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
/* 102:114 */     this.g.a(this.i);
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 106:    */   {
/* 107:119 */     this.m = paramFloat3;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 111:    */   {
/* 112:124 */     cjm.glPushMatrix();
/* 113:125 */     EntityEnderDragon localadb = (EntityEnderDragon)paramwv;
/* 114:126 */     float f1 = localadb.bs + (localadb.bt - localadb.bs) * this.m;
/* 115:127 */     this.c.f = ((float)(Math.sin(f1 * 3.141593F * 2.0F) + 1.0D) * 0.2F);
/* 116:    */     
/* 117:129 */     float f2 = (float)(Math.sin(f1 * 3.141593F * 2.0F - 1.0F) + 1.0D);
/* 118:130 */     f2 = (f2 * f2 * 1.0F + f2 * 2.0F) * 0.05F;
/* 119:    */     
/* 120:132 */     cjm.glTranslatef(0.0F, f2 - 2.0F, -3.0F);
/* 121:133 */     cjm.glRotatef(f2 * 2.0F, 1.0F, 0.0F, 0.0F);
/* 122:    */     
/* 123:135 */     float f3 = -30.0F;
/* 124:    */     
/* 125:137 */     float f5 = 0.0F;
/* 126:    */     
/* 127:139 */     float f6 = 1.5F;
/* 128:    */     
/* 129:141 */     double[] arrayOfDouble1 = localadb.b(6, this.m);
/* 130:    */     
/* 131:143 */     float f7 = a(localadb.b(5, this.m)[0] - localadb.b(10, this.m)[0]);
/* 132:144 */     float f8 = a(localadb.b(5, this.m)[0] + f7 / 2.0F);
/* 133:    */     
/* 134:146 */     f3 += 2.0F;
/* 135:    */     
/* 136:148 */     float f9 = f1 * 3.141593F * 2.0F;
/* 137:149 */     f3 = 20.0F;
/* 138:150 */     float f4 = -12.0F;
/* 139:    */     float f11;
/* 140:151 */     for (int n = 0; n < 5; n++)
/* 141:    */     {
/* 142:152 */       double[] arrayOfDouble3 = localadb.b(5 - n, this.m);
/* 143:153 */       f11 = (float)Math.cos(n * 0.45F + f9) * 0.15F;
/* 144:154 */       this.b.g = (a(arrayOfDouble3[0] - arrayOfDouble1[0]) * 3.141593F / 180.0F * f6);
/* 145:155 */       this.b.f = (f11 + (float)(arrayOfDouble3[1] - arrayOfDouble1[1]) * 3.141593F / 180.0F * f6 * 5.0F);
/* 146:156 */       this.b.h = (-a(arrayOfDouble3[0] - f8) * 3.141593F / 180.0F * f6);
/* 147:    */       
/* 148:158 */       this.b.d = f3;
/* 149:159 */       this.b.e = f4;
/* 150:160 */       this.b.c = f5;
/* 151:161 */       f3 = (float)(f3 + Math.sin(this.b.f) * 10.0D);
/* 152:162 */       f4 = (float)(f4 - Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0D);
/* 153:163 */       f5 = (float)(f5 - Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0D);
/* 154:164 */       this.b.a(paramFloat6);
/* 155:    */     }
/* 156:167 */     this.a.d = f3;
/* 157:168 */     this.a.e = f4;
/* 158:169 */     this.a.c = f5;
/* 159:170 */     double[] arrayOfDouble2 = localadb.b(0, this.m);
/* 160:171 */     this.a.g = (a(arrayOfDouble2[0] - arrayOfDouble1[0]) * 3.141593F / 180.0F * 1.0F);
/* 161:172 */     this.a.h = (-a(arrayOfDouble2[0] - f8) * 3.141593F / 180.0F * 1.0F);
/* 162:173 */     this.a.a(paramFloat6);
/* 163:174 */     cjm.glPushMatrix();
/* 164:175 */     cjm.glTranslatef(0.0F, 1.0F, 0.0F);
/* 165:176 */     cjm.glRotatef(-f7 * f6 * 1.0F, 0.0F, 0.0F, 1.0F);
/* 166:177 */     cjm.glTranslatef(0.0F, -1.0F, 0.0F);
/* 167:178 */     this.d.h = 0.0F;
/* 168:179 */     this.d.a(paramFloat6);
/* 169:181 */     for (int i1 = 0; i1 < 2; i1++)
/* 170:    */     {
/* 171:182 */       cjm.o();
/* 172:183 */       f11 = f1 * 3.141593F * 2.0F;
/* 173:184 */       this.k.f = (0.125F - (float)Math.cos(f11) * 0.2F);
/* 174:185 */       this.k.g = 0.25F;
/* 175:186 */       this.k.h = ((float)(Math.sin(f11) + 0.125D) * 0.8F);
/* 176:187 */       this.l.h = (-(float)(Math.sin(f11 + 2.0F) + 0.5D) * 0.75F);
/* 177:    */       
/* 178:189 */       this.e.f = (1.0F + f2 * 0.1F);
/* 179:190 */       this.g.f = (0.5F + f2 * 0.1F);
/* 180:191 */       this.i.f = (0.75F + f2 * 0.1F);
/* 181:    */       
/* 182:193 */       this.f.f = (1.3F + f2 * 0.1F);
/* 183:194 */       this.h.f = (-0.5F - f2 * 0.1F);
/* 184:195 */       this.j.f = (0.75F + f2 * 0.1F);
/* 185:196 */       this.k.a(paramFloat6);
/* 186:197 */       this.f.a(paramFloat6);
/* 187:198 */       this.e.a(paramFloat6);
/* 188:199 */       cjm.glScalef(-1.0F, 1.0F, 1.0F);
/* 189:201 */       if (i1 == 0) {
/* 190:202 */         cjm.e(1028);
/* 191:    */       }
/* 192:    */     }
/* 193:205 */     cjm.glPopMatrix();
/* 194:206 */     cjm.e(1029);
/* 195:207 */     cjm.p();
/* 196:    */     
/* 197:209 */     float f10 = -(float)Math.sin(f1 * 3.141593F * 2.0F) * 0.0F;
/* 198:210 */     f9 = f1 * 3.141593F * 2.0F;
/* 199:211 */     f3 = 10.0F;
/* 200:212 */     f4 = 60.0F;
/* 201:213 */     f5 = 0.0F;
/* 202:214 */     arrayOfDouble1 = localadb.b(11, this.m);
/* 203:215 */     for (int i2 = 0; i2 < 12; i2++)
/* 204:    */     {
/* 205:216 */       arrayOfDouble2 = localadb.b(12 + i2, this.m);
/* 206:217 */       f10 = (float)(f10 + Math.sin(i2 * 0.45F + f9) * 0.0500000007450581D);
/* 207:218 */       this.b.g = ((a(arrayOfDouble2[0] - arrayOfDouble1[0]) * f6 + 180.0F) * 3.141593F / 180.0F);
/* 208:219 */       this.b.f = (f10 + (float)(arrayOfDouble2[1] - arrayOfDouble1[1]) * 3.141593F / 180.0F * f6 * 5.0F);
/* 209:220 */       this.b.h = (a(arrayOfDouble2[0] - f8) * 3.141593F / 180.0F * f6);
/* 210:221 */       this.b.d = f3;
/* 211:222 */       this.b.e = f4;
/* 212:223 */       this.b.c = f5;
/* 213:224 */       f3 = (float)(f3 + Math.sin(this.b.f) * 10.0D);
/* 214:225 */       f4 = (float)(f4 - Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0D);
/* 215:226 */       f5 = (float)(f5 - Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0D);
/* 216:227 */       this.b.a(paramFloat6);
/* 217:    */     }
/* 218:229 */     cjm.glPopMatrix();
/* 219:    */   }
/* 220:    */   
/* 221:    */   private float a(double paramDouble)
/* 222:    */   {
/* 223:233 */     while (paramDouble >= 180.0D) {
/* 224:234 */       paramDouble -= 360.0D;
/* 225:    */     }
/* 226:236 */     while (paramDouble < -180.0D) {
/* 227:237 */       paramDouble += 360.0D;
/* 228:    */     }
/* 229:239 */     return (float)paramDouble;
/* 230:    */   }
/* 231:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdq
 * JD-Core Version:    0.7.0.1
 */