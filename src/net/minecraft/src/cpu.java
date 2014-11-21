package net.minecraft.src;
// TODO: this hierarchy is still a huge mess
/*   1:    */ import org.lwjgl.opengl.GL11;
/*   2:    */ 
/*   3:    */ public abstract class cpu<T extends Entity>
/*   4:    */ {
/*   5: 24 */   private static final oa a = new oa("textures/misc/shadow.png");
/*   6:    */   protected final cpt b;
/*   7:    */   protected float c;
/*   8: 28 */   protected float d = 1.0F;
/*   9:    */   
/*  10:    */   protected cpu(cpt paramcpt)
/*  11:    */   {
/*  12: 31 */     this.b = paramcpt;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean a(T paramwv, cox paramcox, double paramDouble1, double paramDouble2, double paramDouble3)
/*  16:    */   {
/*  17: 35 */     return (paramwv.h(paramDouble1, paramDouble2, paramDouble3)) && ((paramwv.ah) || (paramcox.a(paramwv.getAABB())));
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void a(T paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  21:    */   {
/*  22: 39 */     a(paramwv, paramDouble1, paramDouble2, paramDouble3);
/*  23:    */   }
/*  24:    */   
/*  25:    */   protected void a(T paramwv, double paramDouble1, double paramDouble2, double paramDouble3)
/*  26:    */   {
/*  27: 43 */     if (!b(paramwv)) {
/*  28: 44 */       return;
/*  29:    */     }
/*  30: 47 */     a(paramwv, paramwv.e_().d(), paramDouble1, paramDouble2, paramDouble3, 64);
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected boolean b(T paramwv)
/*  34:    */   {
/*  35: 51 */     return (paramwv.aN()) && (paramwv.k_());
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected void a(T paramwv, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4)
/*  39:    */   {
/*  40: 55 */     a(paramwv, paramString, paramDouble1, paramDouble2, paramDouble3, 64);
/*  41:    */   }
/*  42:    */   
/*  43:    */   protected abstract oa a(T paramwv);
/*  44:    */   
/*  45:    */   protected boolean c(T paramwv)
/*  46:    */   {
/*  47: 61 */     oa localoa = a(paramwv);
/*  48: 62 */     if (localoa == null) {
/*  49: 63 */       return false;
/*  50:    */     }
/*  51: 65 */     a(localoa);
/*  52: 66 */     return true;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a(oa paramoa)
/*  56:    */   {
/*  57: 70 */     this.b.a.a(paramoa);
/*  58:    */   }
/*  59:    */   
/*  60:    */   private void a(T paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*  61:    */   {
/*  62: 74 */     cjm.disableLighting();
/*  63:    */     
/*  64:    */ 
/*  65: 77 */     cua localcua = bsu.z().R();
/*  66: 78 */     cue localcue1 = localcua.a("minecraft:blocks/fire_layer_0");
/*  67: 79 */     cue localcue2 = localcua.a("minecraft:blocks/fire_layer_1");
/*  68:    */     
/*  69: 81 */     cjm.glPushMatrix();
/*  70: 82 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*  71:    */     
/*  72: 84 */     float f1 = paramwv.width * 1.4F;
/*  73: 85 */     cjm.glScalef(f1, f1, f1);
/*  74: 86 */     ckx localckx = ckx.getInstance();
/*  75: 87 */     VertexBuffer localciv = localckx.getBuffer();
/*  76:    */     
/*  77: 89 */     float f2 = 0.5F;
/*  78: 90 */     float f3 = 0.0F;
/*  79:    */     
/*  80: 92 */     float f4 = paramwv.height / f1;
/*  81: 93 */     float f5 = (float)(paramwv.yPos - paramwv.getAABB().minY);
/*  82:    */     
/*  83: 95 */     cjm.glRotatef(-this.b.e, 0.0F, 1.0F, 0.0F);
/*  84: 96 */     cjm.glTranslatef(0.0F, 0.0F, -0.3F + (int)f4 * 0.02F);
/*  85: 97 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  86: 98 */     float f6 = 0.0F;
/*  87: 99 */     int i = 0;
/*  88:100 */     localciv.begin();
/*  89:101 */     while (f4 > 0.0F)
/*  90:    */     {
/*  91:102 */       cue localcue3 = i % 2 == 0 ? localcue1 : localcue2;
/*  92:    */       
/*  93:104 */       a(cua.g);
/*  94:    */       
/*  95:106 */       float f7 = localcue3.e();
/*  96:107 */       float f8 = localcue3.g();
/*  97:108 */       float f9 = localcue3.f();
/*  98:109 */       float f10 = localcue3.h();
/*  99:110 */       if (i / 2 % 2 == 0)
/* 100:    */       {
/* 101:111 */         float f11 = f9;
/* 102:112 */         f9 = f7;
/* 103:113 */         f7 = f11;
/* 104:    */       }
/* 105:115 */       localciv.addVertexWithUV(f2 - f3, 0.0F - f5, f6, f9, f10);
/* 106:116 */       localciv.addVertexWithUV(-f2 - f3, 0.0F - f5, f6, f7, f10);
/* 107:117 */       localciv.addVertexWithUV(-f2 - f3, 1.4F - f5, f6, f7, f8);
/* 108:118 */       localciv.addVertexWithUV(f2 - f3, 1.4F - f5, f6, f9, f8);
/* 109:119 */       f4 -= 0.45F;
/* 110:120 */       f5 -= 0.45F;
/* 111:121 */       f2 *= 0.9F;
/* 112:122 */       f6 += 0.03F;
/* 113:123 */       i++;
/* 114:    */     }
/* 115:125 */     localckx.draw();
/* 116:126 */     cjm.glPopMatrix();
/* 117:127 */     cjm.enableLighting();
/* 118:    */   }
/* 119:    */   
/* 120:    */   private void c(T paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 121:    */   {
/* 122:131 */     cjm.enableBlend();
/* 123:132 */     cjm.glBlendFunc(770, 771);
/* 124:    */     
/* 125:134 */     this.b.a.a(a);
/* 126:    */     
/* 127:136 */     World localaqu = a();
/* 128:    */     
/* 129:138 */     cjm.a(false);
/* 130:139 */     float f = this.c;
/* 131:140 */     if ((paramwv instanceof EntityMob))
/* 132:    */     {
/* 133:141 */       EntityMob localxn = (EntityMob)paramwv;
/* 134:142 */       f *= localxn.bS();
/* 135:144 */       if (localxn.i_()) {
/* 136:145 */         f *= 0.5F;
/* 137:    */       }
/* 138:    */     }
/* 139:149 */     double d1 = paramwv.P + (paramwv.xPos - paramwv.P) * paramFloat2;
/* 140:150 */     double d2 = paramwv.Q + (paramwv.yPos - paramwv.Q) * paramFloat2;
/* 141:151 */     double d3 = paramwv.R + (paramwv.zPos - paramwv.R) * paramFloat2;
/* 142:    */     
/* 143:153 */     int i = MathUtils.floor(d1 - f);
/* 144:154 */     int j = MathUtils.floor(d1 + f);
/* 145:155 */     int k = MathUtils.floor(d2 - f);
/* 146:156 */     int m = MathUtils.floor(d2);
/* 147:157 */     int n = MathUtils.floor(d3 - f);
/* 148:158 */     int i1 = MathUtils.floor(d3 + f);
/* 149:    */     
/* 150:160 */     double d4 = paramDouble1 - d1;
/* 151:161 */     double d5 = paramDouble2 - d2;
/* 152:162 */     double d6 = paramDouble3 - d3;
/* 153:    */     
/* 154:164 */     ckx localckx = ckx.getInstance();
/* 155:165 */     VertexBuffer localciv = localckx.getBuffer();
/* 156:166 */     localciv.begin();
/* 157:167 */     for (BlockPosition localdt : BlockPosition.a(new BlockPosition(i, k, n), new BlockPosition(j, m, i1)))
/* 158:    */     {
/* 159:168 */       ProtoBlock localatr = localaqu.getBlock(localdt.down()).getProto();
/* 160:169 */       if ((localatr.b() != -1) && (localaqu.l(localdt) > 3)) {
/* 161:170 */         a(localatr, paramDouble1, paramDouble2, paramDouble3, localdt, paramFloat1, f, d4, d5, d6);
/* 162:    */       }
/* 163:    */     }
/* 164:173 */     localckx.draw();
/* 165:    */     
/* 166:175 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 167:176 */     cjm.disableBlend();
/* 168:177 */     cjm.a(true);
/* 169:    */   }
/* 170:    */   
/* 171:    */   private World a()
/* 172:    */   {
/* 173:181 */     return this.b.b;
/* 174:    */   }
/* 175:    */   
/* 176:    */   private void a(ProtoBlock paramatr, double paramDouble1, double paramDouble2, double paramDouble3, BlockPosition paramdt, float paramFloat1, float paramFloat2, double paramDouble4, double paramDouble5, double paramDouble6)
/* 177:    */   {
/* 178:185 */     if (!paramatr.isOpaqueCube()) {
/* 179:186 */       return;
/* 180:    */     }
/* 181:189 */     ckx localckx = ckx.getInstance();
/* 182:190 */     VertexBuffer localciv = localckx.getBuffer();
/* 183:    */     
/* 184:192 */     double d1 = (paramFloat1 - (paramDouble2 - (paramdt.getY() + paramDouble5)) / 2.0D) * 0.5D * a().o(paramdt);
/* 185:193 */     if (d1 < 0.0D) {
/* 186:194 */       return;
/* 187:    */     }
/* 188:196 */     if (d1 > 1.0D) {
/* 189:197 */       d1 = 1.0D;
/* 190:    */     }
/* 191:199 */     localciv.setColor(1.0F, 1.0F, 1.0F, (float)d1);
/* 192:    */     
/* 193:201 */     double d2 = paramdt.getX() + paramatr.z() + paramDouble4;
/* 194:202 */     double d3 = paramdt.getX() + paramatr.A() + paramDouble4;
/* 195:203 */     double d4 = paramdt.getY() + paramatr.B() + paramDouble5 + 0.015625D;
/* 196:204 */     double d5 = paramdt.getZ() + paramatr.D() + paramDouble6;
/* 197:205 */     double d6 = paramdt.getZ() + paramatr.E() + paramDouble6;
/* 198:    */     
/* 199:207 */     float f1 = (float)((paramDouble1 - d2) / 2.0D / paramFloat2 + 0.5D);
/* 200:208 */     float f2 = (float)((paramDouble1 - d3) / 2.0D / paramFloat2 + 0.5D);
/* 201:209 */     float f3 = (float)((paramDouble3 - d5) / 2.0D / paramFloat2 + 0.5D);
/* 202:210 */     float f4 = (float)((paramDouble3 - d6) / 2.0D / paramFloat2 + 0.5D);
/* 203:    */     
/* 204:212 */     localciv.addVertexWithUV(d2, d4, d5, f1, f3);
/* 205:213 */     localciv.addVertexWithUV(d2, d4, d6, f1, f4);
/* 206:214 */     localciv.addVertexWithUV(d3, d4, d6, f2, f4);
/* 207:215 */     localciv.addVertexWithUV(d3, d4, d5, f2, f3);
/* 208:    */   }
/* 209:    */   
/* 210:    */   public static void a(AABB parambrt, double paramDouble1, double paramDouble2, double paramDouble3)
/* 211:    */   {
/* 212:219 */     cjm.x();
/* 213:220 */     ckx localckx = ckx.getInstance();
/* 214:221 */     VertexBuffer localciv = localckx.getBuffer();
/* 215:222 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 216:223 */     localciv.begin();
/* 217:224 */     localciv.c(paramDouble1, paramDouble2, paramDouble3);
/* 218:225 */     localciv.d(0.0F, 0.0F, -1.0F);
/* 219:226 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.minZ);
/* 220:227 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.minZ);
/* 221:228 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.minZ);
/* 222:229 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.minZ);
/* 223:    */     
/* 224:231 */     localciv.d(0.0F, 0.0F, 1.0F);
/* 225:232 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.maxZ);
/* 226:233 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.maxZ);
/* 227:234 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.maxZ);
/* 228:235 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.maxZ);
/* 229:    */     
/* 230:237 */     localciv.d(0.0F, -1.0F, 0.0F);
/* 231:238 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.minZ);
/* 232:239 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.minZ);
/* 233:240 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.maxZ);
/* 234:241 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.maxZ);
/* 235:    */     
/* 236:243 */     localciv.d(0.0F, 1.0F, 0.0F);
/* 237:244 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.maxZ);
/* 238:245 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.maxZ);
/* 239:246 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.minZ);
/* 240:247 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.minZ);
/* 241:    */     
/* 242:249 */     localciv.d(-1.0F, 0.0F, 0.0F);
/* 243:250 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.maxZ);
/* 244:251 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.maxZ);
/* 245:252 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.minZ);
/* 246:253 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.minZ);
/* 247:    */     
/* 248:255 */     localciv.d(1.0F, 0.0F, 0.0F);
/* 249:256 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.minZ);
/* 250:257 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.minZ);
/* 251:258 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.maxZ);
/* 252:259 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.maxZ);
/* 253:260 */     localciv.c(0.0D, 0.0D, 0.0D);
/* 254:261 */     localckx.draw();
/* 255:262 */     cjm.w();
/* 256:    */   }
/* 257:    */   
/* 258:    */   public void b(T paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 259:    */   {
/* 260:297 */     if (this.b.g == null) {
/* 261:298 */       return;
/* 262:    */     }
/* 263:300 */     if ((this.b.g.i) && (this.c > 0.0F) && (!paramwv.ay()) && (this.b.a()))
/* 264:    */     {
/* 265:301 */       double d1 = this.b.b(paramwv.xPos, paramwv.yPos, paramwv.zPos);
/* 266:302 */       float f = (float)((1.0D - d1 / 256.0D) * this.d);
/* 267:303 */       if (f > 0.0F) {
/* 268:304 */         c(paramwv, paramDouble1, paramDouble2, paramDouble3, f, paramFloat2);
/* 269:    */       }
/* 270:    */     }
/* 271:307 */     if ((paramwv.aI()) && (
/* 272:308 */       (!(paramwv instanceof EntityPlayer)) || (!((EntityPlayer)paramwv).v()))) {
/* 273:309 */       a(paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat2);
/* 274:    */     }
/* 275:    */   }
/* 276:    */   
/* 277:    */   public bty c()
/* 278:    */   {
/* 279:315 */     return this.b.c();
/* 280:    */   }
/* 281:    */   
/* 282:    */   protected void a(T paramwv, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
/* 283:    */   {
/* 284:319 */     double d1 = paramwv.h(this.b.c);
/* 285:321 */     if (d1 > paramInt * paramInt) {
/* 286:322 */       return;
/* 287:    */     }
/* 288:325 */     bty localbty = c();
/* 289:    */     
/* 290:327 */     float f1 = 1.6F;
/* 291:328 */     float f2 = 0.01666667F * f1;
/* 292:    */     
/* 293:330 */     cjm.glPushMatrix();
/* 294:331 */     cjm.glTranslatef((float)paramDouble1 + 0.0F, (float)paramDouble2 + paramwv.height + 0.5F, (float)paramDouble3);
/* 295:332 */     GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 296:    */     
/* 297:334 */     cjm.glRotatef(-this.b.e, 0.0F, 1.0F, 0.0F);
/* 298:335 */     cjm.glRotatef(this.b.f, 1.0F, 0.0F, 0.0F);
/* 299:    */     
/* 300:337 */     cjm.glScalef(-f2, -f2, f2);
/* 301:338 */     cjm.disableLighting();
/* 302:    */     
/* 303:340 */     cjm.a(false);
/* 304:341 */     cjm.i();
/* 305:342 */     cjm.enableBlend();
/* 306:343 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 307:    */     
/* 308:345 */     ckx localckx = ckx.getInstance();
/* 309:346 */     VertexBuffer localciv = localckx.getBuffer();
/* 310:    */     
/* 311:348 */     int i = 0;
/* 312:349 */     if (paramString.equals("deadmau5")) {
/* 313:350 */       i = -10;
/* 314:    */     }
/* 315:353 */     cjm.x();
/* 316:354 */     localciv.begin();
/* 317:355 */     int j = localbty.a(paramString) / 2;
/* 318:356 */     localciv.setColor(0.0F, 0.0F, 0.0F, 0.25F);
/* 319:357 */     localciv.addVertex(-j - 1, -1 + i, 0.0D);
/* 320:358 */     localciv.addVertex(-j - 1, 8 + i, 0.0D);
/* 321:359 */     localciv.addVertex(j + 1, 8 + i, 0.0D);
/* 322:360 */     localciv.addVertex(j + 1, -1 + i, 0.0D);
/* 323:361 */     localckx.draw();
/* 324:362 */     cjm.w();
/* 325:363 */     localbty.a(paramString, -localbty.a(paramString) / 2, i, 553648127);
/* 326:364 */     cjm.j();
/* 327:    */     
/* 328:366 */     cjm.a(true);
/* 329:367 */     localbty.a(paramString, -localbty.a(paramString) / 2, i, -1);
/* 330:368 */     cjm.enableLighting();
/* 331:369 */     cjm.disableBlend();
/* 332:370 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 333:371 */     cjm.glPopMatrix();
/* 334:    */   }
/* 335:    */   
/* 336:    */   public cpt d()
/* 337:    */   {
/* 338:375 */     return this.b;
/* 339:    */   }
/* 340:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpu
 * JD-Core Version:    0.7.0.1
 */