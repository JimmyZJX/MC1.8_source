package net.minecraft.src;
/*   1:    */ import java.nio.ByteBuffer;
/*   2:    */ import org.lwjgl.opengl.GL11;
/*   3:    */ 
/*   4:    */ public class ckw
/*   5:    */ {
/*   6:    */   public int a;
/*   7:    */   public int b;
/*   8:    */   public int c;
/*   9:    */   public int d;
/*  10:    */   public boolean e;
/*  11:    */   public int f;
/*  12:    */   public int g;
/*  13:    */   public int h;
/*  14:    */   public float[] i;
/*  15:    */   public int j;
/*  16:    */   
/*  17:    */   public ckw(int paramInt1, int paramInt2, boolean paramBoolean)
/*  18:    */   {
/*  19: 32 */     this.e = paramBoolean;
/*  20:    */     
/*  21: 34 */     this.f = -1;
/*  22: 35 */     this.g = -1;
/*  23: 36 */     this.h = -1;
/*  24:    */     
/*  25: 38 */     this.i = new float[4];
/*  26: 39 */     this.i[0] = 1.0F;
/*  27: 40 */     this.i[1] = 1.0F;
/*  28: 41 */     this.i[2] = 1.0F;
/*  29: 42 */     this.i[3] = 0.0F;
/*  30:    */     
/*  31: 44 */     a(paramInt1, paramInt2);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(int paramInt1, int paramInt2)
/*  35:    */   {
/*  36: 48 */     if (!dax.i())
/*  37:    */     {
/*  38: 49 */       this.c = paramInt1;
/*  39: 50 */       this.d = paramInt2;
/*  40: 51 */       return;
/*  41:    */     }
/*  42: 53 */     cjm.j();
/*  43: 55 */     if (this.f >= 0) {
/*  44: 56 */       a();
/*  45:    */     }
/*  46: 58 */     b(paramInt1, paramInt2);
/*  47: 59 */     b();
/*  48:    */     
/*  49:    */ 
/*  50: 62 */     dax.h(dax.b, 0);
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void a()
/*  54:    */   {
/*  55: 66 */     if (!dax.i()) {
/*  56: 67 */       return;
/*  57:    */     }
/*  58: 70 */     d();
/*  59: 71 */     e();
/*  60: 73 */     if (this.h > -1)
/*  61:    */     {
/*  62: 74 */       dax.h(this.h);
/*  63: 75 */       this.h = -1;
/*  64:    */     }
/*  65: 77 */     if (this.g > -1)
/*  66:    */     {
/*  67: 78 */       cuj.a(this.g);
/*  68: 79 */       this.g = -1;
/*  69:    */     }
/*  70: 81 */     if (this.f > -1)
/*  71:    */     {
/*  72: 82 */       dax.h(dax.b, 0);
/*  73: 83 */       dax.i(this.f);
/*  74: 84 */       this.f = -1;
/*  75:    */     }
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void b(int paramInt1, int paramInt2)
/*  79:    */   {
/*  80: 89 */     this.c = paramInt1;
/*  81: 90 */     this.d = paramInt2;
/*  82:    */     
/*  83: 92 */     this.a = paramInt1;
/*  84: 93 */     this.b = paramInt2;
/*  85: 95 */     if (!dax.i())
/*  86:    */     {
/*  87: 96 */       f();
/*  88: 97 */       return;
/*  89:    */     }
/*  90:100 */     this.f = dax.g();
/*  91:101 */     this.g = cuj.a();
/*  92:102 */     if (this.e) {
/*  93:103 */       this.h = dax.h();
/*  94:    */     }
/*  95:106 */     a(9728);
/*  96:107 */     cjm.i(this.g);
/*  97:108 */     GL11.glTexImage2D(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, (ByteBuffer)null);
/*  98:    */     
/*  99:110 */     dax.h(dax.b, this.f);
/* 100:111 */     dax.a(dax.b, dax.d, 3553, this.g, 0);
/* 101:113 */     if (this.e)
/* 102:    */     {
/* 103:115 */       dax.i(dax.c, this.h);
/* 104:    */       
/* 105:    */ 
/* 106:118 */       dax.a(dax.c, 33190, this.a, this.b);
/* 107:    */       
/* 108:    */ 
/* 109:121 */       dax.b(dax.b, dax.e, dax.c, this.h);
/* 110:    */     }
/* 111:124 */     f();
/* 112:125 */     d();
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void a(int paramInt)
/* 116:    */   {
/* 117:129 */     if (dax.i())
/* 118:    */     {
/* 119:130 */       this.j = paramInt;
/* 120:131 */       cjm.i(this.g);
/* 121:132 */       GL11.glTexParameterf(3553, 10241, paramInt);
/* 122:133 */       GL11.glTexParameterf(3553, 10240, paramInt);
/* 123:134 */       GL11.glTexParameterf(3553, 10242, 10496.0F);
/* 124:135 */       GL11.glTexParameterf(3553, 10243, 10496.0F);
/* 125:136 */       cjm.i(0);
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void b()
/* 130:    */   {
/* 131:141 */     int k = dax.j(dax.b);
/* 132:142 */     if (k == dax.f) {
/* 133:143 */       return;
/* 134:    */     }
/* 135:144 */     if (k == dax.g) {
/* 136:145 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
/* 137:    */     }
/* 138:146 */     if (k == dax.h) {
/* 139:147 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
/* 140:    */     }
/* 141:148 */     if (k == dax.i) {
/* 142:149 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
/* 143:    */     }
/* 144:150 */     if (k == dax.j) {
/* 145:151 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
/* 146:    */     }
/* 147:153 */     throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + k);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void c()
/* 151:    */   {
/* 152:158 */     if (dax.i()) {
/* 153:159 */       cjm.i(this.g);
/* 154:    */     }
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void d()
/* 158:    */   {
/* 159:171 */     if (dax.i()) {
/* 160:172 */       cjm.i(0);
/* 161:    */     }
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void a(boolean paramBoolean)
/* 165:    */   {
/* 166:177 */     if (dax.i())
/* 167:    */     {
/* 168:178 */       dax.h(dax.b, this.f);
/* 169:179 */       if (paramBoolean) {
/* 170:180 */         cjm.b(0, 0, this.c, this.d);
/* 171:    */       }
/* 172:    */     }
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void e()
/* 176:    */   {
/* 177:186 */     if (dax.i()) {
/* 178:187 */       dax.h(dax.b, 0);
/* 179:    */     }
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 183:    */   {
/* 184:192 */     this.i[0] = paramFloat1;
/* 185:193 */     this.i[1] = paramFloat2;
/* 186:194 */     this.i[2] = paramFloat3;
/* 187:195 */     this.i[3] = paramFloat4;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void c(int paramInt1, int paramInt2)
/* 191:    */   {
/* 192:199 */     a(paramInt1, paramInt2, true);
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void a(int paramInt1, int paramInt2, boolean paramBoolean)
/* 196:    */   {
/* 197:203 */     if (!dax.i()) {
/* 198:204 */       return;
/* 199:    */     }
/* 200:206 */     cjm.a(true, true, true, false);
/* 201:207 */     cjm.i();
/* 202:208 */     cjm.a(false);
/* 203:    */     
/* 204:210 */     cjm.glMatrixMode(5889);
/* 205:211 */     cjm.glLoadIdentity();
/* 206:212 */     cjm.glOrtho(0.0D, paramInt1, paramInt2, 0.0D, 1000.0D, 3000.0D);
/* 207:213 */     cjm.glMatrixMode(5888);
/* 208:214 */     cjm.glLoadIdentity();
/* 209:215 */     cjm.glTranslatef(0.0F, 0.0F, -2000.0F);
/* 210:    */     
/* 211:217 */     cjm.b(0, 0, paramInt1, paramInt2);
/* 212:    */     
/* 213:219 */     cjm.w();
/* 214:220 */     cjm.disableLighting();
/* 215:221 */     cjm.disableAlphaTest();
/* 216:222 */     if (paramBoolean)
/* 217:    */     {
/* 218:223 */       cjm.disableBlend();
/* 219:224 */       cjm.g();
/* 220:    */     }
/* 221:227 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 222:    */     
/* 223:229 */     c();
/* 224:    */     
/* 225:231 */     float f1 = paramInt1;
/* 226:232 */     float f2 = paramInt2;
/* 227:233 */     float f3 = this.c / this.a;
/* 228:234 */     float f4 = this.d / this.b;
/* 229:    */     
/* 230:236 */     ckx localckx = ckx.getInstance();
/* 231:237 */     VertexBuffer localciv = localckx.getBuffer();
/* 232:238 */     localciv.begin();
/* 233:239 */     localciv.setColor(-1);
/* 234:240 */     localciv.addVertexWithUV(0.0D, f2, 0.0D, 0.0D, 0.0D);
/* 235:241 */     localciv.addVertexWithUV(f1, f2, 0.0D, f3, 0.0D);
/* 236:242 */     localciv.addVertexWithUV(f1, 0.0D, 0.0D, f3, f4);
/* 237:243 */     localciv.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, f4);
/* 238:244 */     localckx.draw();
/* 239:    */     
/* 240:246 */     d();
/* 241:    */     
/* 242:248 */     cjm.a(true);
/* 243:249 */     cjm.a(true, true, true, true);
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void f()
/* 247:    */   {
/* 248:253 */     a(true);
/* 249:254 */     cjm.a(this.i[0], this.i[1], this.i[2], this.i[3]);
/* 250:255 */     int k = 16384;
/* 251:256 */     if (this.e)
/* 252:    */     {
/* 253:257 */       cjm.a(1.0D);
/* 254:258 */       k |= 0x100;
/* 255:    */     }
/* 256:260 */     cjm.glClear(k);
/* 257:261 */     e();
/* 258:    */   }
/* 259:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ckw
 * JD-Core Version:    0.7.0.1
 */