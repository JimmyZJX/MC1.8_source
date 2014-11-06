package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Random;
/*   5:    */ import org.lwjgl.util.glu.Project;
/*   6:    */ 
/*   7:    */ public class bzf
/*   8:    */   extends byl
/*   9:    */ {
/*  10: 28 */   private static final oa C = new oa("textures/gui/container/enchanting_table.png");
/*  11: 29 */   private static final oa D = new oa("textures/entity/enchanting_table_book.png");
/*  12: 30 */   private static final cca E = new cca();
/*  13:    */   private final ahb F;
/*  14: 32 */   private Random G = new Random();
/*  15:    */   private aiq H;
/*  16:    */   public int u;
/*  17:    */   public float v;
/*  18:    */   public float w;
/*  19:    */   public float x;
/*  20:    */   public float y;
/*  21:    */   public float z;
/*  22:    */   public float A;
/*  23:    */   ItemStack B;
/*  24:    */   private final vz I;
/*  25:    */   
/*  26:    */   public bzf(ahb paramahb, World paramaqu, vz paramvz)
/*  27:    */   {
/*  28: 43 */     super(new aiq(paramahb, paramaqu));
/*  29: 44 */     this.F = paramahb;
/*  30: 45 */     this.H = ((aiq)this.h);
/*  31: 46 */     this.I = paramvz;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void b(int paramInt1, int paramInt2)
/*  35:    */   {
/*  36: 51 */     this.q.a(this.I.e_().c(), 12, 5, 4210752);
/*  37: 52 */     this.q.a(this.F.e_().c(), 8, this.g - 96 + 2, 4210752);
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void e()
/*  41:    */   {
/*  42: 57 */     super.e();
/*  43: 58 */     a();
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*  47:    */   {
/*  48: 63 */     super.a(paramInt1, paramInt2, paramInt3);
/*  49:    */     
/*  50: 65 */     int i = (this.l - this.f) / 2;
/*  51: 66 */     int j = (this.m - this.g) / 2;
/*  52: 67 */     for (int k = 0; k < 3; k++)
/*  53:    */     {
/*  54: 68 */       int m = paramInt1 - (i + 60);
/*  55: 69 */       int n = paramInt2 - (j + 14 + 19 * k);
/*  56: 70 */       if ((m >= 0) && (n >= 0) && (m < 108) && (n < 19) && 
/*  57: 71 */         (this.H.a(this.j.h, k))) {
/*  58: 72 */         this.j.c.a(this.H.d, k);
/*  59:    */       }
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*  64:    */   {
/*  65: 80 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  66: 81 */     this.j.N().a(C);
/*  67: 82 */     int i = (this.l - this.f) / 2;
/*  68: 83 */     int j = (this.m - this.g) / 2;
/*  69: 84 */     b(i, j, 0, 0, this.f, this.g);
/*  70:    */     
/*  71: 86 */     cjm.glPushMatrix();
/*  72: 87 */     cjm.glMatrixMode(5889);
/*  73: 88 */     cjm.glPushMatrix();
/*  74: 89 */     cjm.glLoadIdentity();
/*  75: 90 */     buf localbuf = new buf(this.j, this.j.d, this.j.e);
/*  76:    */     
/*  77: 92 */     cjm.b((localbuf.a() - 320) / 2 * localbuf.e(), (localbuf.b() - 240) / 2 * localbuf.e(), 320 * localbuf.e(), 240 * localbuf.e());
/*  78: 93 */     cjm.glTranslatef(-0.34F, 0.23F, 0.0F);
/*  79:    */     
/*  80: 95 */     Project.gluPerspective(90.0F, 1.333333F, 9.0F, 80.0F);
/*  81:    */     
/*  82: 97 */     float f1 = 1.0F;
/*  83: 98 */     cjm.glMatrixMode(5888);
/*  84: 99 */     cjm.glLoadIdentity();
/*  85:100 */     bss.b();
/*  86:101 */     cjm.glTranslatef(0.0F, 3.3F, -16.0F);
/*  87:102 */     cjm.glScalef(f1, f1, f1);
/*  88:103 */     float f2 = 5.0F;
/*  89:104 */     cjm.glScalef(f2, f2, f2);
/*  90:105 */     cjm.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*  91:    */     
/*  92:107 */     this.j.N().a(D);
/*  93:108 */     cjm.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/*  94:109 */     float f3 = this.A + (this.z - this.A) * paramFloat;
/*  95:110 */     cjm.glTranslatef((1.0F - f3) * 0.2F, (1.0F - f3) * 0.1F, (1.0F - f3) * 0.25F);
/*  96:111 */     cjm.glRotatef(-(1.0F - f3) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
/*  97:112 */     cjm.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/*  98:    */     
/*  99:114 */     float f4 = this.w + (this.v - this.w) * paramFloat + 0.25F;
/* 100:115 */     float f5 = this.w + (this.v - this.w) * paramFloat + 0.75F;
/* 101:116 */     f4 = (f4 - MathUtils.cos(f4)) * 1.6F - 0.3F;
/* 102:117 */     f5 = (f5 - MathUtils.cos(f5)) * 1.6F - 0.3F;
/* 103:119 */     if (f4 < 0.0F) {
/* 104:120 */       f4 = 0.0F;
/* 105:    */     }
/* 106:122 */     if (f5 < 0.0F) {
/* 107:123 */       f5 = 0.0F;
/* 108:    */     }
/* 109:125 */     if (f4 > 1.0F) {
/* 110:126 */       f4 = 1.0F;
/* 111:    */     }
/* 112:128 */     if (f5 > 1.0F) {
/* 113:129 */       f5 = 1.0F;
/* 114:    */     }
/* 115:132 */     cjm.B();
/* 116:    */     
/* 117:134 */     E.a(null, 0.0F, f4, f5, f3, 0.0F, 0.0625F);
/* 118:    */     
/* 119:136 */     cjm.C();
/* 120:137 */     bss.a();
/* 121:138 */     cjm.glMatrixMode(5889);
/* 122:139 */     cjm.b(0, 0, this.j.d, this.j.e);
/* 123:140 */     cjm.glPopMatrix();
/* 124:141 */     cjm.glMatrixMode(5888);
/* 125:142 */     cjm.glPopMatrix();
/* 126:    */     
/* 127:144 */     bss.a();
/* 128:145 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 129:    */     
/* 130:147 */     bze.a().a(this.H.f);
/* 131:    */     
/* 132:149 */     int k = this.H.e();
/* 133:151 */     for (int m = 0; m < 3; m++)
/* 134:    */     {
/* 135:152 */       int n = i + 60;
/* 136:153 */       int i1 = n + 20;
/* 137:154 */       int i2 = 86;
/* 138:    */       
/* 139:156 */       String str1 = bze.a().b();
/* 140:157 */       this.e = 0.0F;
/* 141:158 */       this.j.N().a(C);
/* 142:159 */       int i3 = this.H.g[m];
/* 143:160 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 144:161 */       if (i3 == 0)
/* 145:    */       {
/* 146:162 */         b(n, j + 14 + 19 * m, 0, 185, 108, 19);
/* 147:    */       }
/* 148:    */       else
/* 149:    */       {
/* 150:165 */         String str2 = "" + i3;
/* 151:166 */         bty localbty = this.j.l;
/* 152:167 */         int i4 = 6839882;
/* 153:168 */         if (((k < m + 1) || (this.j.h.bz < i3)) && (!this.j.h.by.d))
/* 154:    */         {
/* 155:169 */           b(n, j + 14 + 19 * m, 0, 185, 108, 19);
/* 156:170 */           b(n + 1, j + 15 + 19 * m, 16 * m, 239, 16, 16);
/* 157:171 */           localbty.a(str1, i1, j + 16 + 19 * m, i2, (i4 & 0xFEFEFE) >> 1);
/* 158:172 */           i4 = 4226832;
/* 159:    */         }
/* 160:    */         else
/* 161:    */         {
/* 162:174 */           int i5 = paramInt1 - (i + 60);
/* 163:175 */           int i6 = paramInt2 - (j + 14 + 19 * m);
/* 164:176 */           if ((i5 >= 0) && (i6 >= 0) && (i5 < 108) && (i6 < 19))
/* 165:    */           {
/* 166:177 */             b(n, j + 14 + 19 * m, 0, 204, 108, 19);
/* 167:178 */             i4 = 16777088;
/* 168:    */           }
/* 169:    */           else
/* 170:    */           {
/* 171:180 */             b(n, j + 14 + 19 * m, 0, 166, 108, 19);
/* 172:    */           }
/* 173:182 */           b(n + 1, j + 15 + 19 * m, 16 * m, 223, 16, 16);
/* 174:183 */           localbty.a(str1, i1, j + 16 + 19 * m, i2, i4);
/* 175:184 */           i4 = 8453920;
/* 176:    */         }
/* 177:186 */         localbty = this.j.k;
/* 178:187 */         localbty.a(str2, i1 + 86 - localbty.a(str2), j + 16 + 19 * m + 7, i4);
/* 179:    */       }
/* 180:    */     }
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 184:    */   {
/* 185:193 */     super.a(paramInt1, paramInt2, paramFloat);
/* 186:    */     
/* 187:195 */     boolean bool = this.j.h.by.d;
/* 188:196 */     int i = this.H.e();
/* 189:198 */     for (int j = 0; j < 3; j++)
/* 190:    */     {
/* 191:199 */       int k = this.H.g[j];
/* 192:200 */       int m = this.H.h[j];
/* 193:201 */       int n = j + 1;
/* 194:202 */       if ((c(60, 14 + 19 * j, 108, 17, paramInt1, paramInt2)) && (k > 0) && (m >= 0))
/* 195:    */       {
/* 196:203 */         ArrayList<String> localArrayList = Lists.newArrayList();
/* 197:    */         String str;
/* 198:205 */         if ((m >= 0) && (Enchantment.c(m & 0xFF) != null))
/* 199:    */         {
/* 200:206 */           str = Enchantment.c(m & 0xFF).d((m & 0xFF00) >> 8);
/* 201:    */           
/* 202:208 */           localArrayList.add(net.minecraft.src.a.p.toString() + net.minecraft.src.a.u.toString() + cwc.a("container.enchant.clue", new Object[] { str }));
/* 203:    */         }
/* 204:211 */         if (!bool)
/* 205:    */         {
/* 206:212 */           if (m >= 0) {
/* 207:213 */             localArrayList.add("");
/* 208:    */           }
/* 209:215 */           if (this.j.h.bz < k)
/* 210:    */           {
/* 211:216 */             localArrayList.add(net.minecraft.src.a.m.toString() + "Level Requirement: " + this.H.g[j]);
/* 212:    */           }
/* 213:    */           else
/* 214:    */           {
/* 215:218 */             str = "";
/* 216:219 */             if (n == 1) {
/* 217:220 */               str = cwc.a("container.enchant.lapis.one", new Object[0]);
/* 218:    */             } else {
/* 219:222 */               str = cwc.a("container.enchant.lapis.many", new Object[] { Integer.valueOf(n) });
/* 220:    */             }
/* 221:224 */             if (i >= n) {
/* 222:225 */               localArrayList.add(net.minecraft.src.a.h.toString() + "" + str);
/* 223:    */             } else {
/* 224:227 */               localArrayList.add(net.minecraft.src.a.m.toString() + "" + str);
/* 225:    */             }
/* 226:230 */             if (n == 1) {
/* 227:231 */               str = cwc.a("container.enchant.level.one", new Object[0]);
/* 228:    */             } else {
/* 229:233 */               str = cwc.a("container.enchant.level.many", new Object[] { Integer.valueOf(n) });
/* 230:    */             }
/* 231:235 */             localArrayList.add(net.minecraft.src.a.h.toString() + "" + str);
/* 232:    */           }
/* 233:    */         }
/* 234:239 */         a(localArrayList, paramInt1, paramInt2);
/* 235:240 */         break;
/* 236:    */       }
/* 237:    */     }
/* 238:    */   }
/* 239:    */   
/* 240:    */   public void a()
/* 241:    */   {
/* 242:246 */     ItemStack localamj = this.h.a(0).d();
/* 243:248 */     if (!ItemStack.b(localamj, this.B))
/* 244:    */     {
/* 245:249 */       this.B = localamj;
/* 246:    */       do
/* 247:    */       {
/* 248:251 */         this.x += this.G.nextInt(4) - this.G.nextInt(4);
/* 249:252 */       } while ((this.v <= this.x + 1.0F) && (this.v >= this.x - 1.0F));
/* 250:    */     }
/* 251:255 */     this.u += 1;
/* 252:256 */     this.w = this.v;
/* 253:257 */     this.A = this.z;
/* 254:    */     
/* 255:259 */     int i = 0;
/* 256:260 */     for (int j = 0; j < 3; j++) {
/* 257:261 */       if (this.H.g[j] != 0) {
/* 258:262 */         i = 1;
/* 259:    */       }
/* 260:    */     }
/* 261:266 */     if (i != 0) {
/* 262:267 */       this.z += 0.2F;
/* 263:    */     } else {
/* 264:269 */       this.z -= 0.2F;
/* 265:    */     }
/* 266:271 */     this.z = MathUtils.clamp(this.z, 0.0F, 1.0F);
/* 267:    */     
/* 268:273 */     float f1 = (this.x - this.v) * 0.4F;
/* 269:274 */     float f2 = 0.2F;
/* 270:275 */     f1 = MathUtils.clamp(f1, -f2, f2);
/* 271:276 */     this.y += (f1 - this.y) * 0.9F;
/* 272:    */     
/* 273:278 */     this.v += this.y;
/* 274:    */   }
/* 275:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzf
 * JD-Core Version:    0.7.0.1
 */