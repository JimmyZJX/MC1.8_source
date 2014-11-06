package net.minecraft.src;
/*   1:    */ import java.nio.ByteBuffer;
/*   2:    */ import java.nio.FloatBuffer;
/*   3:    */ import java.nio.IntBuffer;
/*   4:    */ import org.lwjgl.opengl.ARBFramebufferObject;
/*   5:    */ import org.lwjgl.opengl.ARBMultitexture;
/*   6:    */ import org.lwjgl.opengl.ARBShaderObjects;
/*   7:    */ import org.lwjgl.opengl.ARBVertexBufferObject;
/*   8:    */ import org.lwjgl.opengl.ARBVertexShader;
/*   9:    */ import org.lwjgl.opengl.ContextCapabilities;
/*  10:    */ import org.lwjgl.opengl.EXTBlendFuncSeparate;
/*  11:    */ import org.lwjgl.opengl.EXTFramebufferObject;
/*  12:    */ import org.lwjgl.opengl.GL11;
/*  13:    */ import org.lwjgl.opengl.GL13;
/*  14:    */ import org.lwjgl.opengl.GL14;
/*  15:    */ import org.lwjgl.opengl.GL15;
/*  16:    */ import org.lwjgl.opengl.GL20;
/*  17:    */ import org.lwjgl.opengl.GL30;
/*  18:    */ import org.lwjgl.opengl.GLContext;
/*  19:    */ 
/*  20:    */ public class dax
/*  21:    */ {
/*  22:    */   public static boolean a;
/*  23:    */   public static int b;
/*  24:    */   public static int c;
/*  25:    */   public static int d;
/*  26:    */   public static int e;
/*  27:    */   public static int f;
/*  28:    */   public static int g;
/*  29:    */   public static int h;
/*  30:    */   public static int i;
/*  31:    */   public static int j;
/*  32:    */   private static int R;
/*  33:    */   public static boolean k;
/*  34:    */   private static boolean S;
/*  35:    */   private static boolean T;
/*  36:    */   public static int l;
/*  37:    */   public static int m;
/*  38:    */   public static int n;
/*  39:    */   public static int o;
/*  40:    */   private static boolean U;
/*  41:    */   public static int p;
/*  42:    */   public static int q;
/*  43:    */   public static int r;
/*  44:    */   private static boolean V;
/*  45:    */   public static int s;
/*  46:    */   public static int t;
/*  47:    */   public static int u;
/*  48:    */   public static int v;
/*  49:    */   public static int w;
/*  50:    */   public static int x;
/*  51:    */   public static int y;
/*  52:    */   public static int z;
/*  53:    */   public static int A;
/*  54:    */   public static int B;
/*  55:    */   public static int C;
/*  56:    */   public static int D;
/*  57:    */   public static int E;
/*  58:    */   public static int F;
/*  59:    */   public static int G;
/*  60:    */   public static int H;
/*  61:    */   public static int I;
/*  62:    */   public static int J;
/*  63:    */   public static int K;
/*  64:    */   private static boolean W;
/*  65:    */   public static boolean L;
/*  66:    */   public static boolean M;
/*  67:    */   public static boolean N;
/*  68: 73 */   private static String X = "";
/*  69:    */   public static boolean O;
/*  70:    */   private static boolean Y;
/*  71:    */   public static int P;
/*  72:    */   public static int Q;
/*  73:    */   
/*  74:    */   public static void a()
/*  75:    */   {
/*  76: 82 */     ContextCapabilities localContextCapabilities = GLContext.getCapabilities();
/*  77: 83 */     U = (localContextCapabilities.GL_ARB_multitexture) && (!localContextCapabilities.OpenGL13);
/*  78: 84 */     V = (localContextCapabilities.GL_ARB_texture_env_combine) && (!localContextCapabilities.OpenGL13);
/*  79: 86 */     if (U)
/*  80:    */     {
/*  81: 87 */       X += "Using ARB_multitexture.\n";
/*  82: 88 */       p = 33984;
/*  83: 89 */       q = 33985;
/*  84: 90 */       r = 33986;
/*  85:    */     }
/*  86:    */     else
/*  87:    */     {
/*  88: 92 */       X += "Using GL 1.3 multitexturing.\n";
/*  89: 93 */       p = 33984;
/*  90: 94 */       q = 33985;
/*  91: 95 */       r = 33986;
/*  92:    */     }
/*  93: 98 */     if (V)
/*  94:    */     {
/*  95: 99 */       X += "Using ARB_texture_env_combine.\n";
/*  96:100 */       s = 34160;
/*  97:101 */       t = 34165;
/*  98:102 */       u = 34167;
/*  99:103 */       v = 34166;
/* 100:104 */       w = 34168;
/* 101:105 */       x = 34161;
/* 102:106 */       y = 34176;
/* 103:107 */       z = 34177;
/* 104:108 */       A = 34178;
/* 105:109 */       B = 34192;
/* 106:110 */       C = 34193;
/* 107:111 */       D = 34194;
/* 108:112 */       E = 34162;
/* 109:113 */       F = 34184;
/* 110:114 */       G = 34185;
/* 111:115 */       H = 34186;
/* 112:116 */       I = 34200;
/* 113:117 */       J = 34201;
/* 114:118 */       K = 34202;
/* 115:    */     }
/* 116:    */     else
/* 117:    */     {
/* 118:120 */       X += "Using GL 1.3 texture combiners.\n";
/* 119:121 */       s = 34160;
/* 120:122 */       t = 34165;
/* 121:123 */       u = 34167;
/* 122:124 */       v = 34166;
/* 123:125 */       w = 34168;
/* 124:126 */       x = 34161;
/* 125:127 */       y = 34176;
/* 126:128 */       z = 34177;
/* 127:129 */       A = 34178;
/* 128:130 */       B = 34192;
/* 129:131 */       C = 34193;
/* 130:132 */       D = 34194;
/* 131:133 */       E = 34162;
/* 132:134 */       F = 34184;
/* 133:135 */       G = 34185;
/* 134:136 */       H = 34186;
/* 135:137 */       I = 34200;
/* 136:138 */       J = 34201;
/* 137:139 */       K = 34202;
/* 138:    */     }
/* 139:142 */     L = (localContextCapabilities.GL_EXT_blend_func_separate) && (!localContextCapabilities.OpenGL14);
/* 140:143 */     W = (localContextCapabilities.OpenGL14) || (localContextCapabilities.GL_EXT_blend_func_separate);
/* 141:144 */     k = (W) && ((localContextCapabilities.GL_ARB_framebuffer_object) || (localContextCapabilities.GL_EXT_framebuffer_object) || (localContextCapabilities.OpenGL30));
/* 142:145 */     if (k)
/* 143:    */     {
/* 144:146 */       X += "Using framebuffer objects because ";
/* 145:147 */       if (localContextCapabilities.OpenGL30)
/* 146:    */       {
/* 147:148 */         X += "OpenGL 3.0 is supported and separate blending is supported.\n";
/* 148:149 */         R = 0;
/* 149:150 */         b = 36160;
/* 150:151 */         c = 36161;
/* 151:152 */         d = 36064;
/* 152:153 */         e = 36096;
/* 153:154 */         f = 36053;
/* 154:155 */         g = 36054;
/* 155:156 */         h = 36055;
/* 156:157 */         i = 36059;
/* 157:158 */         j = 36060;
/* 158:    */       }
/* 159:159 */       else if (localContextCapabilities.GL_ARB_framebuffer_object)
/* 160:    */       {
/* 161:160 */         X += "ARB_framebuffer_object is supported and separate blending is supported.\n";
/* 162:161 */         R = 1;
/* 163:162 */         b = 36160;
/* 164:163 */         c = 36161;
/* 165:164 */         d = 36064;
/* 166:165 */         e = 36096;
/* 167:166 */         f = 36053;
/* 168:167 */         h = 36055;
/* 169:168 */         g = 36054;
/* 170:169 */         i = 36059;
/* 171:170 */         j = 36060;
/* 172:    */       }
/* 173:171 */       else if (localContextCapabilities.GL_EXT_framebuffer_object)
/* 174:    */       {
/* 175:172 */         X += "EXT_framebuffer_object is supported.\n";
/* 176:173 */         R = 2;
/* 177:174 */         b = 36160;
/* 178:175 */         c = 36161;
/* 179:176 */         d = 36064;
/* 180:177 */         e = 36096;
/* 181:178 */         f = 36053;
/* 182:179 */         h = 36055;
/* 183:180 */         g = 36054;
/* 184:181 */         i = 36059;
/* 185:182 */         j = 36060;
/* 186:    */       }
/* 187:    */     }
/* 188:    */     else
/* 189:    */     {
/* 190:185 */       X += "Not using framebuffer objects because ";
/* 191:186 */       X = X + "OpenGL 1.4 is " + (localContextCapabilities.OpenGL14 ? "" : "not ") + "supported, ";
/* 192:187 */       X = X + "EXT_blend_func_separate is " + (localContextCapabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
/* 193:188 */       X = X + "OpenGL 3.0 is " + (localContextCapabilities.OpenGL30 ? "" : "not ") + "supported, ";
/* 194:189 */       X = X + "ARB_framebuffer_object is " + (localContextCapabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
/* 195:190 */       X = X + "EXT_framebuffer_object is " + (localContextCapabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
/* 196:    */     }
/* 197:193 */     M = localContextCapabilities.OpenGL21;
/* 198:194 */     S = (M) || ((localContextCapabilities.GL_ARB_vertex_shader) && (localContextCapabilities.GL_ARB_fragment_shader) && (localContextCapabilities.GL_ARB_shader_objects));
/* 199:195 */     X = X + "Shaders are " + (S ? "" : "not ") + "available because ";
/* 200:196 */     if (S)
/* 201:    */     {
/* 202:197 */       if (localContextCapabilities.OpenGL21)
/* 203:    */       {
/* 204:198 */         X += "OpenGL 2.1 is supported.\n";
/* 205:199 */         T = false;
/* 206:200 */         l = 35714;
/* 207:201 */         m = 35713;
/* 208:202 */         n = 35633;
/* 209:203 */         o = 35632;
/* 210:    */       }
/* 211:    */       else
/* 212:    */       {
/* 213:205 */         X += "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
/* 214:206 */         T = true;
/* 215:207 */         l = 35714;
/* 216:208 */         m = 35713;
/* 217:209 */         n = 35633;
/* 218:210 */         o = 35632;
/* 219:    */       }
/* 220:    */     }
/* 221:    */     else
/* 222:    */     {
/* 223:213 */       X = X + "OpenGL 2.1 is " + (localContextCapabilities.OpenGL21 ? "" : "not ") + "supported, ";
/* 224:214 */       X = X + "ARB_shader_objects is " + (localContextCapabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
/* 225:215 */       X = X + "ARB_vertex_shader is " + (localContextCapabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
/* 226:216 */       X = X + "ARB_fragment_shader is " + (localContextCapabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
/* 227:    */     }
/* 228:218 */     N = (k) && (S);
/* 229:    */     
/* 230:220 */     a = GL11.glGetString(7936).toLowerCase().contains("nvidia");
/* 231:    */     
/* 232:222 */     Y = (!localContextCapabilities.OpenGL15) && (localContextCapabilities.GL_ARB_vertex_buffer_object);
/* 233:223 */     O = (localContextCapabilities.OpenGL15) || (Y);
/* 234:224 */     X = X + "VBOs are " + (O ? "" : "not ") + "available because ";
/* 235:225 */     if (O) {
/* 236:226 */       if (Y)
/* 237:    */       {
/* 238:227 */         X += "ARB_vertex_buffer_object is supported.\n";
/* 239:228 */         Q = 35044;
/* 240:229 */         P = 34962;
/* 241:    */       }
/* 242:    */       else
/* 243:    */       {
/* 244:231 */         X += "OpenGL 1.5 is supported.\n";
/* 245:232 */         Q = 35044;
/* 246:233 */         P = 34962;
/* 247:    */       }
/* 248:    */     }
/* 249:    */   }
/* 250:    */   
/* 251:    */   public static boolean b()
/* 252:    */   {
/* 253:239 */     return N;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public static String c()
/* 257:    */   {
/* 258:243 */     return X;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public static int a(int paramInt1, int paramInt2)
/* 262:    */   {
/* 263:247 */     if (T) {
/* 264:248 */       return ARBShaderObjects.glGetObjectParameteriARB(paramInt1, paramInt2);
/* 265:    */     }
/* 266:250 */     return GL20.glGetProgrami(paramInt1, paramInt2);
/* 267:    */   }
/* 268:    */   
/* 269:    */   public static void b(int paramInt1, int paramInt2)
/* 270:    */   {
/* 271:255 */     if (T) {
/* 272:256 */       ARBShaderObjects.glAttachObjectARB(paramInt1, paramInt2);
/* 273:    */     } else {
/* 274:258 */       GL20.glAttachShader(paramInt1, paramInt2);
/* 275:    */     }
/* 276:    */   }
/* 277:    */   
/* 278:    */   public static void a(int paramInt)
/* 279:    */   {
/* 280:263 */     if (T) {
/* 281:264 */       ARBShaderObjects.glDeleteObjectARB(paramInt);
/* 282:    */     } else {
/* 283:266 */       GL20.glDeleteShader(paramInt);
/* 284:    */     }
/* 285:    */   }
/* 286:    */   
/* 287:    */   public static int b(int paramInt)
/* 288:    */   {
/* 289:271 */     if (T) {
/* 290:272 */       return ARBShaderObjects.glCreateShaderObjectARB(paramInt);
/* 291:    */     }
/* 292:274 */     return GL20.glCreateShader(paramInt);
/* 293:    */   }
/* 294:    */   
/* 295:    */   public static void a(int paramInt, ByteBuffer paramByteBuffer)
/* 296:    */   {
/* 297:279 */     if (T) {
/* 298:280 */       ARBShaderObjects.glShaderSourceARB(paramInt, paramByteBuffer);
/* 299:    */     } else {
/* 300:282 */       GL20.glShaderSource(paramInt, paramByteBuffer);
/* 301:    */     }
/* 302:    */   }
/* 303:    */   
/* 304:    */   public static void c(int paramInt)
/* 305:    */   {
/* 306:287 */     if (T) {
/* 307:288 */       ARBShaderObjects.glCompileShaderARB(paramInt);
/* 308:    */     } else {
/* 309:290 */       GL20.glCompileShader(paramInt);
/* 310:    */     }
/* 311:    */   }
/* 312:    */   
/* 313:    */   public static int c(int paramInt1, int paramInt2)
/* 314:    */   {
/* 315:295 */     if (T) {
/* 316:296 */       return ARBShaderObjects.glGetObjectParameteriARB(paramInt1, paramInt2);
/* 317:    */     }
/* 318:298 */     return GL20.glGetShaderi(paramInt1, paramInt2);
/* 319:    */   }
/* 320:    */   
/* 321:    */   public static String d(int paramInt1, int paramInt2)
/* 322:    */   {
/* 323:303 */     if (T) {
/* 324:304 */       return ARBShaderObjects.glGetInfoLogARB(paramInt1, paramInt2);
/* 325:    */     }
/* 326:306 */     return GL20.glGetShaderInfoLog(paramInt1, paramInt2);
/* 327:    */   }
/* 328:    */   
/* 329:    */   public static String e(int paramInt1, int paramInt2)
/* 330:    */   {
/* 331:311 */     if (T) {
/* 332:312 */       return ARBShaderObjects.glGetInfoLogARB(paramInt1, paramInt2);
/* 333:    */     }
/* 334:314 */     return GL20.glGetProgramInfoLog(paramInt1, paramInt2);
/* 335:    */   }
/* 336:    */   
/* 337:    */   public static void d(int paramInt)
/* 338:    */   {
/* 339:319 */     if (T) {
/* 340:320 */       ARBShaderObjects.glUseProgramObjectARB(paramInt);
/* 341:    */     } else {
/* 342:322 */       GL20.glUseProgram(paramInt);
/* 343:    */     }
/* 344:    */   }
/* 345:    */   
/* 346:    */   public static int d()
/* 347:    */   {
/* 348:327 */     if (T) {
/* 349:328 */       return ARBShaderObjects.glCreateProgramObjectARB();
/* 350:    */     }
/* 351:330 */     return GL20.glCreateProgram();
/* 352:    */   }
/* 353:    */   
/* 354:    */   public static void e(int paramInt)
/* 355:    */   {
/* 356:335 */     if (T) {
/* 357:336 */       ARBShaderObjects.glDeleteObjectARB(paramInt);
/* 358:    */     } else {
/* 359:338 */       GL20.glDeleteProgram(paramInt);
/* 360:    */     }
/* 361:    */   }
/* 362:    */   
/* 363:    */   public static void f(int paramInt)
/* 364:    */   {
/* 365:343 */     if (T) {
/* 366:344 */       ARBShaderObjects.glLinkProgramARB(paramInt);
/* 367:    */     } else {
/* 368:346 */       GL20.glLinkProgram(paramInt);
/* 369:    */     }
/* 370:    */   }
/* 371:    */   
/* 372:    */   public static int a(int paramInt, CharSequence paramCharSequence)
/* 373:    */   {
/* 374:351 */     if (T) {
/* 375:352 */       return ARBShaderObjects.glGetUniformLocationARB(paramInt, paramCharSequence);
/* 376:    */     }
/* 377:354 */     return GL20.glGetUniformLocation(paramInt, paramCharSequence);
/* 378:    */   }
/* 379:    */   
/* 380:    */   public static void a(int paramInt, IntBuffer paramIntBuffer)
/* 381:    */   {
/* 382:359 */     if (T) {
/* 383:360 */       ARBShaderObjects.glUniform1ARB(paramInt, paramIntBuffer);
/* 384:    */     } else {
/* 385:362 */       GL20.glUniform1(paramInt, paramIntBuffer);
/* 386:    */     }
/* 387:    */   }
/* 388:    */   
/* 389:    */   public static void f(int paramInt1, int paramInt2)
/* 390:    */   {
/* 391:367 */     if (T) {
/* 392:368 */       ARBShaderObjects.glUniform1iARB(paramInt1, paramInt2);
/* 393:    */     } else {
/* 394:370 */       GL20.glUniform1i(paramInt1, paramInt2);
/* 395:    */     }
/* 396:    */   }
/* 397:    */   
/* 398:    */   public static void a(int paramInt, FloatBuffer paramFloatBuffer)
/* 399:    */   {
/* 400:375 */     if (T) {
/* 401:376 */       ARBShaderObjects.glUniform1ARB(paramInt, paramFloatBuffer);
/* 402:    */     } else {
/* 403:378 */       GL20.glUniform1(paramInt, paramFloatBuffer);
/* 404:    */     }
/* 405:    */   }
/* 406:    */   
/* 407:    */   public static void b(int paramInt, IntBuffer paramIntBuffer)
/* 408:    */   {
/* 409:383 */     if (T) {
/* 410:384 */       ARBShaderObjects.glUniform2ARB(paramInt, paramIntBuffer);
/* 411:    */     } else {
/* 412:386 */       GL20.glUniform2(paramInt, paramIntBuffer);
/* 413:    */     }
/* 414:    */   }
/* 415:    */   
/* 416:    */   public static void b(int paramInt, FloatBuffer paramFloatBuffer)
/* 417:    */   {
/* 418:391 */     if (T) {
/* 419:392 */       ARBShaderObjects.glUniform2ARB(paramInt, paramFloatBuffer);
/* 420:    */     } else {
/* 421:394 */       GL20.glUniform2(paramInt, paramFloatBuffer);
/* 422:    */     }
/* 423:    */   }
/* 424:    */   
/* 425:    */   public static void c(int paramInt, IntBuffer paramIntBuffer)
/* 426:    */   {
/* 427:399 */     if (T) {
/* 428:400 */       ARBShaderObjects.glUniform3ARB(paramInt, paramIntBuffer);
/* 429:    */     } else {
/* 430:402 */       GL20.glUniform3(paramInt, paramIntBuffer);
/* 431:    */     }
/* 432:    */   }
/* 433:    */   
/* 434:    */   public static void c(int paramInt, FloatBuffer paramFloatBuffer)
/* 435:    */   {
/* 436:407 */     if (T) {
/* 437:408 */       ARBShaderObjects.glUniform3ARB(paramInt, paramFloatBuffer);
/* 438:    */     } else {
/* 439:410 */       GL20.glUniform3(paramInt, paramFloatBuffer);
/* 440:    */     }
/* 441:    */   }
/* 442:    */   
/* 443:    */   public static void d(int paramInt, IntBuffer paramIntBuffer)
/* 444:    */   {
/* 445:415 */     if (T) {
/* 446:416 */       ARBShaderObjects.glUniform4ARB(paramInt, paramIntBuffer);
/* 447:    */     } else {
/* 448:418 */       GL20.glUniform4(paramInt, paramIntBuffer);
/* 449:    */     }
/* 450:    */   }
/* 451:    */   
/* 452:    */   public static void d(int paramInt, FloatBuffer paramFloatBuffer)
/* 453:    */   {
/* 454:423 */     if (T) {
/* 455:424 */       ARBShaderObjects.glUniform4ARB(paramInt, paramFloatBuffer);
/* 456:    */     } else {
/* 457:426 */       GL20.glUniform4(paramInt, paramFloatBuffer);
/* 458:    */     }
/* 459:    */   }
/* 460:    */   
/* 461:    */   public static void a(int paramInt, boolean paramBoolean, FloatBuffer paramFloatBuffer)
/* 462:    */   {
/* 463:431 */     if (T) {
/* 464:432 */       ARBShaderObjects.glUniformMatrix2ARB(paramInt, paramBoolean, paramFloatBuffer);
/* 465:    */     } else {
/* 466:434 */       GL20.glUniformMatrix2(paramInt, paramBoolean, paramFloatBuffer);
/* 467:    */     }
/* 468:    */   }
/* 469:    */   
/* 470:    */   public static void b(int paramInt, boolean paramBoolean, FloatBuffer paramFloatBuffer)
/* 471:    */   {
/* 472:439 */     if (T) {
/* 473:440 */       ARBShaderObjects.glUniformMatrix3ARB(paramInt, paramBoolean, paramFloatBuffer);
/* 474:    */     } else {
/* 475:442 */       GL20.glUniformMatrix3(paramInt, paramBoolean, paramFloatBuffer);
/* 476:    */     }
/* 477:    */   }
/* 478:    */   
/* 479:    */   public static void c(int paramInt, boolean paramBoolean, FloatBuffer paramFloatBuffer)
/* 480:    */   {
/* 481:447 */     if (T) {
/* 482:448 */       ARBShaderObjects.glUniformMatrix4ARB(paramInt, paramBoolean, paramFloatBuffer);
/* 483:    */     } else {
/* 484:450 */       GL20.glUniformMatrix4(paramInt, paramBoolean, paramFloatBuffer);
/* 485:    */     }
/* 486:    */   }
/* 487:    */   
/* 488:    */   public static int b(int paramInt, CharSequence paramCharSequence)
/* 489:    */   {
/* 490:455 */     if (T) {
/* 491:456 */       return ARBVertexShader.glGetAttribLocationARB(paramInt, paramCharSequence);
/* 492:    */     }
/* 493:458 */     return GL20.glGetAttribLocation(paramInt, paramCharSequence);
/* 494:    */   }
/* 495:    */   
/* 496:    */   public static int e()
/* 497:    */   {
/* 498:463 */     if (Y) {
/* 499:464 */       return ARBVertexBufferObject.glGenBuffersARB();
/* 500:    */     }
/* 501:466 */     return GL15.glGenBuffers();
/* 502:    */   }
/* 503:    */   
/* 504:    */   public static void g(int paramInt1, int paramInt2)
/* 505:    */   {
/* 506:479 */     if (Y) {
/* 507:480 */       ARBVertexBufferObject.glBindBufferARB(paramInt1, paramInt2);
/* 508:    */     } else {
/* 509:482 */       GL15.glBindBuffer(paramInt1, paramInt2);
/* 510:    */     }
/* 511:    */   }
/* 512:    */   
/* 513:    */   public static void a(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2)
/* 514:    */   {
/* 515:487 */     if (Y) {
/* 516:488 */       ARBVertexBufferObject.glBufferDataARB(paramInt1, paramByteBuffer, paramInt2);
/* 517:    */     } else {
/* 518:490 */       GL15.glBufferData(paramInt1, paramByteBuffer, paramInt2);
/* 519:    */     }
/* 520:    */   }
/* 521:    */   
/* 522:    */   public static void g(int paramInt)
/* 523:    */   {
/* 524:495 */     if (Y) {
/* 525:496 */       ARBVertexBufferObject.glDeleteBuffersARB(paramInt);
/* 526:    */     } else {
/* 527:498 */       GL15.glDeleteBuffers(paramInt);
/* 528:    */     }
/* 529:    */   }
/* 530:    */   
/* 531:    */   public static boolean f()
/* 532:    */   {
/* 533:511 */     return (O) && (bsu.z().t.t);
/* 534:    */   }
/* 535:    */   
/* 536:    */   public static void h(int paramInt1, int paramInt2)
/* 537:    */   {
/* 538:515 */     if (!k) {
/* 539:516 */       return;
/* 540:    */     }
/* 541:518 */     switch (R)
/* 542:    */     {
/* 543:    */     case 0: 
/* 544:520 */       GL30.glBindFramebuffer(paramInt1, paramInt2);
/* 545:521 */       break;
/* 546:    */     case 1: 
/* 547:523 */       ARBFramebufferObject.glBindFramebuffer(paramInt1, paramInt2);
/* 548:524 */       break;
/* 549:    */     case 2: 
/* 550:526 */       EXTFramebufferObject.glBindFramebufferEXT(paramInt1, paramInt2);
/* 551:    */     }
/* 552:    */   }
/* 553:    */   
/* 554:    */   public static void i(int paramInt1, int paramInt2)
/* 555:    */   {
/* 556:532 */     if (!k) {
/* 557:533 */       return;
/* 558:    */     }
/* 559:535 */     switch (R)
/* 560:    */     {
/* 561:    */     case 0: 
/* 562:537 */       GL30.glBindRenderbuffer(paramInt1, paramInt2);
/* 563:538 */       break;
/* 564:    */     case 1: 
/* 565:540 */       ARBFramebufferObject.glBindRenderbuffer(paramInt1, paramInt2);
/* 566:541 */       break;
/* 567:    */     case 2: 
/* 568:543 */       EXTFramebufferObject.glBindRenderbufferEXT(paramInt1, paramInt2);
/* 569:    */     }
/* 570:    */   }
/* 571:    */   
/* 572:    */   public static void h(int paramInt)
/* 573:    */   {
/* 574:549 */     if (!k) {
/* 575:550 */       return;
/* 576:    */     }
/* 577:552 */     switch (R)
/* 578:    */     {
/* 579:    */     case 0: 
/* 580:554 */       GL30.glDeleteRenderbuffers(paramInt);
/* 581:555 */       break;
/* 582:    */     case 1: 
/* 583:557 */       ARBFramebufferObject.glDeleteRenderbuffers(paramInt);
/* 584:558 */       break;
/* 585:    */     case 2: 
/* 586:560 */       EXTFramebufferObject.glDeleteRenderbuffersEXT(paramInt);
/* 587:    */     }
/* 588:    */   }
/* 589:    */   
/* 590:    */   public static void i(int paramInt)
/* 591:    */   {
/* 592:566 */     if (!k) {
/* 593:567 */       return;
/* 594:    */     }
/* 595:569 */     switch (R)
/* 596:    */     {
/* 597:    */     case 0: 
/* 598:571 */       GL30.glDeleteFramebuffers(paramInt);
/* 599:572 */       break;
/* 600:    */     case 1: 
/* 601:574 */       ARBFramebufferObject.glDeleteFramebuffers(paramInt);
/* 602:575 */       break;
/* 603:    */     case 2: 
/* 604:577 */       EXTFramebufferObject.glDeleteFramebuffersEXT(paramInt);
/* 605:    */     }
/* 606:    */   }
/* 607:    */   
/* 608:    */   public static int g()
/* 609:    */   {
/* 610:583 */     if (!k) {
/* 611:584 */       return -1;
/* 612:    */     }
/* 613:586 */     switch (R)
/* 614:    */     {
/* 615:    */     case 0: 
/* 616:588 */       return GL30.glGenFramebuffers();
/* 617:    */     case 1: 
/* 618:590 */       return ARBFramebufferObject.glGenFramebuffers();
/* 619:    */     case 2: 
/* 620:592 */       return EXTFramebufferObject.glGenFramebuffersEXT();
/* 621:    */     }
/* 622:594 */     return -1;
/* 623:    */   }
/* 624:    */   
/* 625:    */   public static int h()
/* 626:    */   {
/* 627:598 */     if (!k) {
/* 628:599 */       return -1;
/* 629:    */     }
/* 630:601 */     switch (R)
/* 631:    */     {
/* 632:    */     case 0: 
/* 633:603 */       return GL30.glGenRenderbuffers();
/* 634:    */     case 1: 
/* 635:605 */       return ARBFramebufferObject.glGenRenderbuffers();
/* 636:    */     case 2: 
/* 637:607 */       return EXTFramebufferObject.glGenRenderbuffersEXT();
/* 638:    */     }
/* 639:609 */     return -1;
/* 640:    */   }
/* 641:    */   
/* 642:    */   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 643:    */   {
/* 644:613 */     if (!k) {
/* 645:614 */       return;
/* 646:    */     }
/* 647:616 */     switch (R)
/* 648:    */     {
/* 649:    */     case 0: 
/* 650:618 */       GL30.glRenderbufferStorage(paramInt1, paramInt2, paramInt3, paramInt4);
/* 651:619 */       break;
/* 652:    */     case 1: 
/* 653:621 */       ARBFramebufferObject.glRenderbufferStorage(paramInt1, paramInt2, paramInt3, paramInt4);
/* 654:622 */       break;
/* 655:    */     case 2: 
/* 656:624 */       EXTFramebufferObject.glRenderbufferStorageEXT(paramInt1, paramInt2, paramInt3, paramInt4);
/* 657:    */     }
/* 658:    */   }
/* 659:    */   
/* 660:    */   public static void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 661:    */   {
/* 662:630 */     if (!k) {
/* 663:631 */       return;
/* 664:    */     }
/* 665:633 */     switch (R)
/* 666:    */     {
/* 667:    */     case 0: 
/* 668:635 */       GL30.glFramebufferRenderbuffer(paramInt1, paramInt2, paramInt3, paramInt4);
/* 669:636 */       break;
/* 670:    */     case 1: 
/* 671:638 */       ARBFramebufferObject.glFramebufferRenderbuffer(paramInt1, paramInt2, paramInt3, paramInt4);
/* 672:639 */       break;
/* 673:    */     case 2: 
/* 674:641 */       EXTFramebufferObject.glFramebufferRenderbufferEXT(paramInt1, paramInt2, paramInt3, paramInt4);
/* 675:    */     }
/* 676:    */   }
/* 677:    */   
/* 678:    */   public static int j(int paramInt)
/* 679:    */   {
/* 680:647 */     if (!k) {
/* 681:648 */       return -1;
/* 682:    */     }
/* 683:650 */     switch (R)
/* 684:    */     {
/* 685:    */     case 0: 
/* 686:652 */       return GL30.glCheckFramebufferStatus(paramInt);
/* 687:    */     case 1: 
/* 688:654 */       return ARBFramebufferObject.glCheckFramebufferStatus(paramInt);
/* 689:    */     case 2: 
/* 690:656 */       return EXTFramebufferObject.glCheckFramebufferStatusEXT(paramInt);
/* 691:    */     }
/* 692:658 */     return -1;
/* 693:    */   }
/* 694:    */   
/* 695:    */   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 696:    */   {
/* 697:662 */     if (!k) {
/* 698:663 */       return;
/* 699:    */     }
/* 700:665 */     switch (R)
/* 701:    */     {
/* 702:    */     case 0: 
/* 703:667 */       GL30.glFramebufferTexture2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 704:668 */       break;
/* 705:    */     case 1: 
/* 706:670 */       ARBFramebufferObject.glFramebufferTexture2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 707:671 */       break;
/* 708:    */     case 2: 
/* 709:673 */       EXTFramebufferObject.glFramebufferTexture2DEXT(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 710:    */     }
/* 711:    */   }
/* 712:    */   
/* 713:    */   public static void k(int paramInt)
/* 714:    */   {
/* 715:679 */     if (U) {
/* 716:680 */       ARBMultitexture.glActiveTextureARB(paramInt);
/* 717:    */     } else {
/* 718:682 */       GL13.glActiveTexture(paramInt);
/* 719:    */     }
/* 720:    */   }
/* 721:    */   
/* 722:    */   public static void l(int paramInt)
/* 723:    */   {
/* 724:687 */     if (U) {
/* 725:688 */       ARBMultitexture.glClientActiveTextureARB(paramInt);
/* 726:    */     } else {
/* 727:690 */       GL13.glClientActiveTexture(paramInt);
/* 728:    */     }
/* 729:    */   }
/* 730:    */   
/* 731:    */   public static void glMultiTexCoord2f(int paramInt, float paramFloat1, float paramFloat2)
/* 732:    */   {
/* 733:695 */     if (U) {
/* 734:696 */       ARBMultitexture.glMultiTexCoord2fARB(paramInt, paramFloat1, paramFloat2);
/* 735:    */     } else {
/* 736:698 */       GL13.glMultiTexCoord2f(paramInt, paramFloat1, paramFloat2);
/* 737:    */     }
/* 738:    */   }
/* 739:    */   
/* 740:    */   public static void glBlendFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 741:    */   {
/* 742:703 */     if (W)
/* 743:    */     {
/* 744:704 */       if (L) {
/* 745:705 */         EXTBlendFuncSeparate.glBlendFuncSeparateEXT(paramInt1, paramInt2, paramInt3, paramInt4);
/* 746:    */       } else {
/* 747:707 */         GL14.glBlendFuncSeparate(paramInt1, paramInt2, paramInt3, paramInt4);
/* 748:    */       }
/* 749:    */     }
/* 750:    */     else {
/* 751:710 */       GL11.glBlendFunc(paramInt1, paramInt2);
/* 752:    */     }
/* 753:    */   }
/* 754:    */   
/* 755:    */   public static boolean i()
/* 756:    */   {
/* 757:715 */     return (k) && (bsu.z().t.f);
/* 758:    */   }
/* 759:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dax
 * JD-Core Version:    0.7.0.1
 */