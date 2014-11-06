package net.minecraft.src;
/*   1:    */ import java.nio.FloatBuffer;
/*   2:    */ import java.nio.IntBuffer;
/*   3:    */ import javax.vecmath.Matrix4f;
/*   4:    */ import org.apache.logging.log4j.LogManager;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ import org.lwjgl.BufferUtils;
/*   7:    */ 
/*   8:    */ public class ctl
/*   9:    */ {
/*  10: 15 */   private static final Logger a = LogManager.getLogger();
/*  11:    */   private int b;
/*  12:    */   private final int c;
/*  13:    */   private final int d;
/*  14:    */   private final IntBuffer e;
/*  15:    */   private final FloatBuffer f;
/*  16:    */   private final String g;
/*  17:    */   private boolean h;
/*  18:    */   private final ctf i;
/*  19:    */   
/*  20:    */   public ctl(String paramString, int paramInt1, int paramInt2, ctf paramctf)
/*  21:    */   {
/*  22: 46 */     this.g = paramString;
/*  23: 47 */     this.c = paramInt2;
/*  24: 48 */     this.d = paramInt1;
/*  25: 49 */     this.i = paramctf;
/*  26: 50 */     if (paramInt1 <= 3)
/*  27:    */     {
/*  28: 51 */       this.e = BufferUtils.createIntBuffer(paramInt2);
/*  29: 52 */       this.f = null;
/*  30:    */     }
/*  31:    */     else
/*  32:    */     {
/*  33: 54 */       this.e = null;
/*  34: 55 */       this.f = BufferUtils.createFloatBuffer(paramInt2);
/*  35:    */     }
/*  36: 57 */     this.b = -1;
/*  37: 58 */     h();
/*  38:    */   }
/*  39:    */   
/*  40:    */   private void h()
/*  41:    */   {
/*  42: 62 */     this.h = true;
/*  43: 63 */     if (this.i != null) {
/*  44: 64 */       this.i.d();
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public static int a(String paramString)
/*  49:    */   {
/*  50: 69 */     int j = -1;
/*  51: 71 */     if (paramString.equals("int")) {
/*  52: 72 */       j = 0;
/*  53: 73 */     } else if (paramString.equals("float")) {
/*  54: 74 */       j = 4;
/*  55: 75 */     } else if (paramString.startsWith("matrix")) {
/*  56: 76 */       if (paramString.endsWith("2x2")) {
/*  57: 77 */         j = 8;
/*  58: 78 */       } else if (paramString.endsWith("3x3")) {
/*  59: 79 */         j = 9;
/*  60: 80 */       } else if (paramString.endsWith("4x4")) {
/*  61: 81 */         j = 10;
/*  62:    */       }
/*  63:    */     }
/*  64: 85 */     return j;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void b(int paramInt)
/*  68:    */   {
/*  69: 89 */     this.b = paramInt;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String a()
/*  73:    */   {
/*  74: 93 */     return this.g;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(float paramFloat)
/*  78:    */   {
/*  79: 97 */     this.f.position(0);
/*  80: 98 */     this.f.put(0, paramFloat);
/*  81: 99 */     h();
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(float paramFloat1, float paramFloat2)
/*  85:    */   {
/*  86:103 */     this.f.position(0);
/*  87:104 */     this.f.put(0, paramFloat1);
/*  88:105 */     this.f.put(1, paramFloat2);
/*  89:106 */     h();
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3)
/*  93:    */   {
/*  94:123 */     this.f.position(0);
/*  95:124 */     this.f.put(0, paramFloat1);
/*  96:125 */     this.f.put(1, paramFloat2);
/*  97:126 */     this.f.put(2, paramFloat3);
/*  98:127 */     h();
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 102:    */   {
/* 103:139 */     this.f.position(0);
/* 104:140 */     this.f.put(paramFloat1);
/* 105:141 */     this.f.put(paramFloat2);
/* 106:142 */     this.f.put(paramFloat3);
/* 107:143 */     this.f.put(paramFloat4);
/* 108:144 */     this.f.flip();
/* 109:145 */     h();
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 113:    */   {
/* 114:158 */     this.f.position(0);
/* 115:159 */     if (this.d >= 4) {
/* 116:160 */       this.f.put(0, paramFloat1);
/* 117:    */     }
/* 118:162 */     if (this.d >= 5) {
/* 119:163 */       this.f.put(1, paramFloat2);
/* 120:    */     }
/* 121:165 */     if (this.d >= 6) {
/* 122:166 */       this.f.put(2, paramFloat3);
/* 123:    */     }
/* 124:168 */     if (this.d >= 7) {
/* 125:169 */       this.f.put(3, paramFloat4);
/* 126:    */     }
/* 127:171 */     h();
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 131:    */   {
/* 132:175 */     this.e.position(0);
/* 133:176 */     if (this.d >= 0) {
/* 134:177 */       this.e.put(0, paramInt1);
/* 135:    */     }
/* 136:179 */     if (this.d >= 1) {
/* 137:180 */       this.e.put(1, paramInt2);
/* 138:    */     }
/* 139:182 */     if (this.d >= 2) {
/* 140:183 */       this.e.put(2, paramInt3);
/* 141:    */     }
/* 142:185 */     if (this.d >= 3) {
/* 143:186 */       this.e.put(3, paramInt4);
/* 144:    */     }
/* 145:188 */     h();
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void a(float[] paramArrayOfFloat)
/* 149:    */   {
/* 150:222 */     if (paramArrayOfFloat.length < this.c)
/* 151:    */     {
/* 152:223 */       a.warn("Uniform.set called with a too-small value array (expected " + this.c + ", got " + paramArrayOfFloat.length + "). Ignoring.");
/* 153:224 */       return;
/* 154:    */     }
/* 155:227 */     this.f.position(0);
/* 156:228 */     this.f.put(paramArrayOfFloat);
/* 157:229 */     this.f.position(0);
/* 158:230 */     h();
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
/* 162:    */   {
/* 163:372 */     this.f.position(0);
/* 164:373 */     this.f.put(0, paramFloat1);
/* 165:374 */     this.f.put(1, paramFloat2);
/* 166:375 */     this.f.put(2, paramFloat3);
/* 167:376 */     this.f.put(3, paramFloat4);
/* 168:377 */     this.f.put(4, paramFloat5);
/* 169:378 */     this.f.put(5, paramFloat6);
/* 170:379 */     this.f.put(6, paramFloat7);
/* 171:380 */     this.f.put(7, paramFloat8);
/* 172:381 */     this.f.put(8, paramFloat9);
/* 173:382 */     this.f.put(9, paramFloat10);
/* 174:383 */     this.f.put(10, paramFloat11);
/* 175:384 */     this.f.put(11, paramFloat12);
/* 176:385 */     this.f.put(12, paramFloat13);
/* 177:386 */     this.f.put(13, paramFloat14);
/* 178:387 */     this.f.put(14, paramFloat15);
/* 179:388 */     this.f.put(15, paramFloat16);
/* 180:389 */     h();
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void a(Matrix4f paramMatrix4f)
/* 184:    */   {
/* 185:393 */     a(paramMatrix4f.m00, paramMatrix4f.m01, paramMatrix4f.m02, paramMatrix4f.m03, paramMatrix4f.m10, paramMatrix4f.m11, paramMatrix4f.m12, paramMatrix4f.m13, paramMatrix4f.m20, paramMatrix4f.m21, paramMatrix4f.m22, paramMatrix4f.m23, paramMatrix4f.m30, paramMatrix4f.m31, paramMatrix4f.m32, paramMatrix4f.m33);
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void b()
/* 189:    */   {
/* 190:402 */     if (!this.h) {}
/* 191:406 */     this.h = false;
/* 192:408 */     if (this.d <= 3)
/* 193:    */     {
/* 194:409 */       i();
/* 195:    */     }
/* 196:410 */     else if (this.d <= 7)
/* 197:    */     {
/* 198:411 */       j();
/* 199:    */     }
/* 200:412 */     else if (this.d <= 10)
/* 201:    */     {
/* 202:413 */       k();
/* 203:    */     }
/* 204:    */     else
/* 205:    */     {
/* 206:415 */       a.warn("Uniform.upload called, but type value (" + this.d + ") is not " + "a valid type. Ignoring.");
/* 207:416 */       return;
/* 208:    */     }
/* 209:    */   }
/* 210:    */   
/* 211:    */   private void i()
/* 212:    */   {
/* 213:421 */     switch (this.d)
/* 214:    */     {
/* 215:    */     case 0: 
/* 216:423 */       dax.a(this.b, this.e);
/* 217:424 */       break;
/* 218:    */     case 1: 
/* 219:426 */       dax.b(this.b, this.e);
/* 220:427 */       break;
/* 221:    */     case 2: 
/* 222:429 */       dax.c(this.b, this.e);
/* 223:430 */       break;
/* 224:    */     case 3: 
/* 225:432 */       dax.d(this.b, this.e);
/* 226:433 */       break;
/* 227:    */     default: 
/* 228:435 */       a.warn("Uniform.upload called, but count value (" + this.c + ") is " + " not in the range of 1 to 4. Ignoring.");
/* 229:    */     }
/* 230:    */   }
/* 231:    */   
/* 232:    */   private void j()
/* 233:    */   {
/* 234:441 */     switch (this.d)
/* 235:    */     {
/* 236:    */     case 4: 
/* 237:443 */       dax.a(this.b, this.f);
/* 238:444 */       break;
/* 239:    */     case 5: 
/* 240:446 */       dax.b(this.b, this.f);
/* 241:447 */       break;
/* 242:    */     case 6: 
/* 243:449 */       dax.c(this.b, this.f);
/* 244:450 */       break;
/* 245:    */     case 7: 
/* 246:452 */       dax.d(this.b, this.f);
/* 247:453 */       break;
/* 248:    */     default: 
/* 249:455 */       a.warn("Uniform.upload called, but count value (" + this.c + ") is " + "not in the range of 1 to 4. Ignoring.");
/* 250:    */     }
/* 251:    */   }
/* 252:    */   
/* 253:    */   private void k()
/* 254:    */   {
/* 255:461 */     switch (this.d)
/* 256:    */     {
/* 257:    */     case 8: 
/* 258:463 */       dax.a(this.b, true, this.f);
/* 259:464 */       break;
/* 260:    */     case 9: 
/* 261:466 */       dax.b(this.b, true, this.f);
/* 262:467 */       break;
/* 263:    */     case 10: 
/* 264:469 */       dax.c(this.b, true, this.f);
/* 265:    */     }
/* 266:    */   }
/* 267:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctl
 * JD-Core Version:    0.7.0.1
 */