package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import javax.vecmath.Vector3f;
/*    3:     */ 
/*    4:     */ public class cqh
/*    5:     */   implements cvl
/*    6:     */ {
/*    7:  38 */   private static final oa k = new oa("textures/misc/enchanted_item_glint.png");
/*    8:  51 */   private boolean l = true;
/*    9:     */   public float a;
/*   10:     */   private final ckk m;
/*   11:     */   private final cug n;
/*   12:     */   
/*   13:     */   public cqh(cug paramcug, cxk paramcxk)
/*   14:     */   {
/*   15:  58 */     this.n = paramcug;
/*   16:  59 */     this.m = new ckk(paramcxk);
/*   17:     */     
/*   18:  61 */     b();
/*   19:     */   }
/*   20:     */   
/*   21:     */   public void a(boolean paramBoolean)
/*   22:     */   {
/*   23:  65 */     this.l = paramBoolean;
/*   24:     */   }
/*   25:     */   
/*   26:     */   public ckk a()
/*   27:     */   {
/*   28:  69 */     return this.m;
/*   29:     */   }
/*   30:     */   
/*   31:     */   protected void a(Item paramalq, int paramInt, String paramString)
/*   32:     */   {
/*   33:  73 */     this.m.a(paramalq, paramInt, new cxl(paramString, "inventory"));
/*   34:     */   }
/*   35:     */   
/*   36:     */   protected void a(ProtoBlock paramatr, int paramInt, String paramString)
/*   37:     */   {
/*   38:  77 */     a(Item.fromProtoBlock(paramatr), paramInt, paramString);
/*   39:     */   }
/*   40:     */   
/*   41:     */   private void a(ProtoBlock paramatr, String paramString)
/*   42:     */   {
/*   43:  81 */     a(paramatr, 0, paramString);
/*   44:     */   }
/*   45:     */   
/*   46:     */   private void a(Item paramalq, String paramString)
/*   47:     */   {
/*   48:  85 */     a(paramalq, 0, paramString);
/*   49:     */   }
/*   50:     */   
/*   51:     */   private void a(cxe paramcxe, ItemStack paramamj)
/*   52:     */   {
/*   53:  89 */     a(paramcxe, -1, paramamj);
/*   54:     */   }
/*   55:     */   
/*   56:     */   private void a(cxe paramcxe, int paramInt)
/*   57:     */   {
/*   58:  93 */     a(paramcxe, paramInt, null);
/*   59:     */   }
/*   60:     */   
/*   61:     */   private void a(cxe paramcxe, int paramInt, ItemStack paramamj)
/*   62:     */   {
/*   63:  97 */     ckx localckx = ckx.getInstance();
/*   64:  98 */     VertexBuffer localciv = localckx.getBuffer();
/*   65:  99 */     localciv.begin();
/*   66: 100 */     localciv.setFormat(cuq.b);
/*   67: 102 */     for (EnumDirection localej : EnumDirection.values()) {
/*   68: 103 */       a(localciv, paramcxe.a(localej), paramInt, paramamj);
/*   69:     */     }
/*   70: 105 */     a(localciv, paramcxe.a(), paramInt, paramamj);
/*   71:     */     
/*   72: 107 */     localckx.draw();
/*   73:     */   }
/*   74:     */   
/*   75:     */   public void a(ItemStack paramamj, cxe paramcxe)
/*   76:     */   {
/*   77: 111 */     cjm.glPushMatrix();
/*   78: 112 */     cjm.glScalef(0.5F, 0.5F, 0.5F);
/*   79: 113 */     if (paramcxe.d())
/*   80:     */     {
/*   81: 114 */       cjm.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*   82: 115 */       cjm.glTranslatef(-0.5F, -0.5F, -0.5F);
/*   83: 116 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*   84: 117 */       cjm.B();
/*   85:     */       
/*   86: 119 */       cjd.a.a(paramamj);
/*   87:     */     }
/*   88:     */     else
/*   89:     */     {
/*   90: 121 */       cjm.glTranslatef(-0.5F, -0.5F, -0.5F);
/*   91:     */       
/*   92: 123 */       a(paramcxe, paramamj);
/*   93: 124 */       if (paramamj.t()) {
/*   94: 125 */         a(paramcxe);
/*   95:     */       }
/*   96:     */     }
/*   97: 128 */     cjm.glPopMatrix();
/*   98:     */   }
/*   99:     */   
/*  100:     */   private void a(cxe paramcxe)
/*  101:     */   {
/*  102: 132 */     cjm.a(false);
/*  103: 133 */     cjm.c(514);
/*  104: 134 */     cjm.disableLighting();
/*  105: 135 */     cjm.glBlendFunc(768, 1);
/*  106:     */     
/*  107: 137 */     this.n.a(k);
/*  108:     */     
/*  109: 139 */     cjm.glMatrixMode(5890);
/*  110:     */     
/*  111: 141 */     cjm.glPushMatrix();
/*  112: 142 */     cjm.glScalef(8.0F, 8.0F, 8.0F);
/*  113:     */     
/*  114: 144 */     float f1 = (float)(bsu.I() % 3000L) / 3000.0F / 8.0F;
/*  115: 145 */     cjm.glTranslatef(f1, 0.0F, 0.0F);
/*  116: 146 */     cjm.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
/*  117: 147 */     a(paramcxe, -8372020);
/*  118: 148 */     cjm.glPopMatrix();
/*  119:     */     
/*  120: 150 */     cjm.glPushMatrix();
/*  121: 151 */     cjm.glScalef(8.0F, 8.0F, 8.0F);
/*  122: 152 */     float f2 = (float)(bsu.I() % 4873L) / 4873.0F / 8.0F;
/*  123: 153 */     cjm.glTranslatef(-f2, 0.0F, 0.0F);
/*  124: 154 */     cjm.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
/*  125: 155 */     a(paramcxe, -8372020);
/*  126: 156 */     cjm.glPopMatrix();
/*  127:     */     
/*  128: 158 */     cjm.glMatrixMode(5888);
/*  129:     */     
/*  130: 160 */     cjm.glBlendFunc(770, 771);
/*  131: 161 */     cjm.enableLighting();
/*  132: 162 */     cjm.c(515);
/*  133: 163 */     cjm.a(true);
/*  134:     */     
/*  135:     */ 
/*  136: 166 */     this.n.a(cua.g);
/*  137:     */   }
/*  138:     */   
/*  139:     */   private void a(VertexBuffer paramciv, clt paramclt)
/*  140:     */   {
/*  141: 170 */     fd localfd = paramclt.d().m();
/*  142: 171 */     paramciv.e(localfd.getX(), localfd.getY(), localfd.getZ());
/*  143:     */   }
/*  144:     */   
/*  145:     */   private void a(VertexBuffer paramciv, clt paramclt, int paramInt)
/*  146:     */   {
/*  147: 175 */     paramciv.a(paramclt.a());
/*  148: 176 */     paramciv.d(paramInt);
/*  149: 177 */     a(paramciv, paramclt);
/*  150:     */   }
/*  151:     */   
/*  152:     */   private void a(VertexBuffer paramciv, List<clt> paramList, int paramInt, ItemStack paramamj)
/*  153:     */   {
/*  154: 181 */     int i1 = (paramInt == -1) && (paramamj != null) ? 1 : 0;
/*  155: 183 */     for (clt localclt : paramList)
/*  156:     */     {
/*  157: 184 */       int i2 = paramInt;
/*  158: 185 */       if ((i1 != 0) && (localclt.b()))
/*  159:     */       {
/*  160: 186 */         i2 = paramamj.getItem().a(paramamj, localclt.c());
/*  161: 187 */         if (cji.a) {
/*  162: 188 */           i2 = cuj.c(i2);
/*  163:     */         }
/*  164: 190 */         i2 |= 0xFF000000;
/*  165:     */       }
/*  166: 193 */       a(paramciv, localclt, i2);
/*  167:     */     }
/*  168:     */   }
/*  169:     */   
/*  170:     */   public boolean a(ItemStack paramamj)
/*  171:     */   {
/*  172: 198 */     cxe localcxe = this.m.a(paramamj);
/*  173: 199 */     if (localcxe == null) {
/*  174: 200 */       return false;
/*  175:     */     }
/*  176: 203 */     return localcxe.c();
/*  177:     */   }
/*  178:     */   
/*  179:     */   private void c(ItemStack paramamj)
/*  180:     */   {
/*  181: 207 */     cxe localcxe = this.m.a(paramamj);
/*  182: 208 */     Item localalq = paramamj.getItem();
/*  183: 210 */     if (localalq == null) {
/*  184: 211 */       return;
/*  185:     */     }
/*  186: 214 */     boolean bool = localcxe.c();
/*  187: 215 */     if (!bool) {
/*  188: 216 */       cjm.glScalef(2.0F, 2.0F, 2.0F);
/*  189:     */     }
/*  190: 219 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  191:     */   }
/*  192:     */   
/*  193:     */   public void b(ItemStack paramamj)
/*  194:     */   {
/*  195: 223 */     cxe localcxe = this.m.a(paramamj);
/*  196:     */     
/*  197: 225 */     a(paramamj, localcxe, cmz.NONE);
/*  198:     */   }
/*  199:     */   
/*  200:     */   public void a(ItemStack paramamj, EntityLiving paramxm, cmz paramcmz)
/*  201:     */   {
/*  202: 229 */     cxe localcxe = this.m.a(paramamj);
/*  203: 232 */     if ((paramxm instanceof EntityPlayer))
/*  204:     */     {
/*  205: 233 */       EntityPlayer localahd = (EntityPlayer)paramxm;
/*  206:     */       
/*  207: 235 */       Item localalq = paramamj.getItem();
/*  208: 236 */       cxl localcxl = null;
/*  209: 238 */       if ((localalq == ItemList.fishingRod) && (localahd.bE != null))
/*  210:     */       {
/*  211: 239 */         localcxl = new cxl("fishing_rod_cast", "inventory");
/*  212:     */       }
/*  213: 240 */       else if ((localalq == ItemList.bow) && (localahd.bP() != null))
/*  214:     */       {
/*  215: 242 */         int i1 = paramamj.l() - localahd.bQ();
/*  216: 243 */         if (i1 >= 18) {
/*  217: 244 */           localcxl = new cxl("bow_pulling_2", "inventory");
/*  218: 245 */         } else if (i1 > 13) {
/*  219: 246 */           localcxl = new cxl("bow_pulling_1", "inventory");
/*  220: 247 */         } else if (i1 > 0) {
/*  221: 248 */           localcxl = new cxl("bow_pulling_0", "inventory");
/*  222:     */         }
/*  223:     */       }
/*  224: 252 */       if (localcxl != null) {
/*  225: 253 */         localcxe = this.m.a().a(localcxl);
/*  226:     */       }
/*  227:     */     }
/*  228: 257 */     a(paramamj, localcxe, paramcmz);
/*  229:     */   }
/*  230:     */   
/*  231: 260 */   public static float b = 0.0F;
/*  232: 261 */   public static float c = 0.0F;
/*  233: 262 */   public static float d = 0.0F;
/*  234: 263 */   public static float e = 0.0F;
/*  235: 264 */   public static float f = 0.0F;
/*  236: 265 */   public static float g = 0.0F;
/*  237: 266 */   public static float h = 0.0F;
/*  238: 267 */   public static float i = 0.0F;
/*  239: 268 */   public static float j = 0.0F;
/*  240:     */   
/*  241:     */   protected void a(cmv paramcmv)
/*  242:     */   {
/*  243: 271 */     if (paramcmv != cmv.a)
/*  244:     */     {
/*  245: 272 */       cjm.glTranslatef(paramcmv.c.x + b, paramcmv.c.y + c, paramcmv.c.z + d);
/*  246: 273 */       cjm.glRotatef(paramcmv.b.y + f, 0.0F, 1.0F, 0.0F);
/*  247: 274 */       cjm.glRotatef(paramcmv.b.x + e, 1.0F, 0.0F, 0.0F);
/*  248: 275 */       cjm.glRotatef(paramcmv.b.z + g, 0.0F, 0.0F, 1.0F);
/*  249: 276 */       cjm.glScalef(paramcmv.d.x + h, paramcmv.d.y + i, paramcmv.d.z + j);
/*  250:     */     }
/*  251:     */   }
/*  252:     */   
/*  253:     */   protected void a(ItemStack paramamj, cxe paramcxe, cmz paramcmz)
/*  254:     */   {
/*  255: 281 */     this.n.a(cua.g);
/*  256: 282 */     this.n.b(cua.g).b(false, false);
/*  257:     */     
/*  258: 284 */     c(paramamj);
/*  259:     */     
/*  260: 286 */     cjm.B();
/*  261: 287 */     cjm.glAlphaFunc(516, 0.1F);
/*  262: 288 */     cjm.enableBlend();
/*  263: 289 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  264:     */     
/*  265: 291 */     cjm.glPushMatrix();
/*  266: 292 */     switch (cqj.a[paramcmz.ordinal()])
/*  267:     */     {
/*  268:     */     case 1: 
/*  269:     */       break;
/*  270:     */     case 2: 
/*  271: 296 */       a(paramcxe.f().b);
/*  272: 297 */       break;
/*  273:     */     case 3: 
/*  274: 299 */       a(paramcxe.f().c);
/*  275: 300 */       break;
/*  276:     */     case 4: 
/*  277: 302 */       a(paramcxe.f().d);
/*  278: 303 */       break;
/*  279:     */     case 5: 
/*  280: 305 */       a(paramcxe.f().e);
/*  281:     */     }
/*  282: 308 */     a(paramamj, paramcxe);
/*  283: 309 */     cjm.glPopMatrix();
/*  284:     */     
/*  285: 311 */     cjm.C();
/*  286: 312 */     cjm.disableBlend();
/*  287: 313 */     this.n.a(cua.g);
/*  288: 314 */     this.n.b(cua.g).a();
/*  289:     */   }
/*  290:     */   
/*  291:     */   public void a(ItemStack paramamj, int paramInt1, int paramInt2)
/*  292:     */   {
/*  293: 318 */     cxe localcxe = this.m.a(paramamj);
/*  294:     */     
/*  295: 320 */     cjm.glPushMatrix();
/*  296: 321 */     this.n.a(cua.g);
/*  297: 322 */     this.n.b(cua.g).b(false, false);
/*  298:     */     
/*  299: 324 */     cjm.B();
/*  300: 325 */     cjm.enableAlphaTest();
/*  301: 326 */     cjm.glAlphaFunc(516, 0.1F);
/*  302: 327 */     cjm.enableBlend();
/*  303: 328 */     cjm.glBlendFunc(770, 771);
/*  304:     */     
/*  305: 330 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  306:     */     
/*  307:     */ 
/*  308: 333 */     a(paramInt1, paramInt2, localcxe.c());
/*  309: 334 */     a(localcxe.f().e);
/*  310: 335 */     a(paramamj, localcxe);
/*  311:     */     
/*  312: 337 */     cjm.disableAlphaTest();
/*  313: 338 */     cjm.C();
/*  314: 339 */     cjm.disableLighting();
/*  315: 340 */     cjm.glPopMatrix();
/*  316: 341 */     this.n.a(cua.g);
/*  317: 342 */     this.n.b(cua.g).a();
/*  318:     */   }
/*  319:     */   
/*  320:     */   private void a(int paramInt1, int paramInt2, boolean paramBoolean)
/*  321:     */   {
/*  322: 346 */     cjm.glTranslatef(paramInt1, paramInt2, 100.0F + this.a);
/*  323: 347 */     cjm.glTranslatef(8.0F, 8.0F, 0.0F);
/*  324:     */     
/*  325: 349 */     cjm.glScalef(1.0F, 1.0F, -1.0F);
/*  326: 350 */     cjm.glScalef(0.5F, 0.5F, 0.5F);
/*  327: 352 */     if (paramBoolean)
/*  328:     */     {
/*  329: 353 */       cjm.glScalef(40.0F, 40.0F, 40.0F);
/*  330: 354 */       cjm.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
/*  331: 355 */       cjm.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
/*  332: 356 */       cjm.enableLighting();
/*  333:     */     }
/*  334:     */     else
/*  335:     */     {
/*  336: 358 */       cjm.glScalef(64.0F, 64.0F, 64.0F);
/*  337: 359 */       cjm.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/*  338: 360 */       cjm.disableLighting();
/*  339:     */     }
/*  340:     */   }
/*  341:     */   
/*  342:     */   public void b(ItemStack paramamj, int paramInt1, int paramInt2)
/*  343:     */   {
/*  344: 365 */     if (paramamj == null) {
/*  345: 366 */       return;
/*  346:     */     }
/*  347: 369 */     this.a += 50.0F;
/*  348:     */     try
/*  349:     */     {
/*  350: 371 */       a(paramamj, paramInt1, paramInt2);
/*  351:     */     }
/*  352:     */     catch (Throwable localThrowable)
/*  353:     */     {
/*  354: 373 */       b localb = net.minecraft.src.b.a(localThrowable, "Rendering item");
/*  355: 374 */       j localj = localb.a("Item being rendered");
/*  356:     */       
/*  357: 376 */       localj.a("Item Type", new cqi(this, paramamj));
/*  358:     */       
/*  359:     */ 
/*  360:     */ 
/*  361:     */ 
/*  362:     */ 
/*  363:     */ 
/*  364: 383 */       localj.a("Item Aux", new cqk(this, paramamj));
/*  365:     */       
/*  366:     */ 
/*  367:     */ 
/*  368:     */ 
/*  369:     */ 
/*  370:     */ 
/*  371: 390 */       localj.a("Item NBT", new cql(this, paramamj));
/*  372:     */       
/*  373:     */ 
/*  374:     */ 
/*  375:     */ 
/*  376:     */ 
/*  377:     */ 
/*  378: 397 */       localj.a("Item Foil", new cqm(this, paramamj));
/*  379:     */       
/*  380:     */ 
/*  381:     */ 
/*  382:     */ 
/*  383:     */ 
/*  384:     */ 
/*  385: 404 */       throw new u(localb);
/*  386:     */     }
/*  387: 407 */     this.a -= 50.0F;
/*  388:     */   }
/*  389:     */   
/*  390:     */   public void a(bty parambty, ItemStack paramamj, int paramInt1, int paramInt2)
/*  391:     */   {
/*  392: 411 */     a(parambty, paramamj, paramInt1, paramInt2, null);
/*  393:     */   }
/*  394:     */   
/*  395:     */   public void a(bty parambty, ItemStack paramamj, int paramInt1, int paramInt2, String paramString)
/*  396:     */   {
/*  397: 415 */     if (paramamj == null) {
/*  398: 416 */       return;
/*  399:     */     }
/*  400: 419 */     if ((paramamj.stackSize != 1) || (paramString != null))
/*  401:     */     {
/*  402: 420 */       String str = paramString == null ? String.valueOf(paramamj.stackSize) : paramString;
/*  403: 422 */       if ((paramString == null) && (paramamj.stackSize < 1)) {
/*  404: 423 */         str = net.minecraft.src.a.m + String.valueOf(paramamj.stackSize);
/*  405:     */       }
/*  406: 426 */       cjm.disableLighting();
/*  407: 427 */       cjm.i();
/*  408: 428 */       cjm.disableBlend();
/*  409: 429 */       parambty.a(str, paramInt1 + 19 - 2 - parambty.a(str), paramInt2 + 6 + 3, 16777215);
/*  410: 430 */       cjm.enableLighting();
/*  411: 431 */       cjm.j();
/*  412:     */     }
/*  413: 434 */     if (paramamj.g())
/*  414:     */     {
/*  415: 435 */       int i1 = (int)Math.round(13.0D - paramamj.getDamage() * 13.0D / paramamj.j());
/*  416: 436 */       int i2 = (int)Math.round(255.0D - paramamj.getDamage() * 255.0D / paramamj.j());
/*  417: 437 */       cjm.disableLighting();
/*  418: 438 */       cjm.i();
/*  419: 439 */       cjm.x();
/*  420: 440 */       cjm.disableAlphaTest();
/*  421: 441 */       cjm.disableBlend();
/*  422:     */       
/*  423: 443 */       ckx localckx = ckx.getInstance();
/*  424: 444 */       VertexBuffer localciv = localckx.getBuffer();
/*  425:     */       
/*  426: 446 */       int i3 = 255 - i2 << 16 | i2 << 8;
/*  427: 447 */       int i4 = (255 - i2) / 4 << 16 | 0x3F00;
/*  428: 448 */       a(localciv, paramInt1 + 2, paramInt2 + 13, 13, 2, 0);
/*  429: 449 */       a(localciv, paramInt1 + 2, paramInt2 + 13, 12, 1, i4);
/*  430: 450 */       a(localciv, paramInt1 + 2, paramInt2 + 13, i1, 1, i3);
/*  431:     */       
/*  432: 452 */       cjm.enableBlend();
/*  433: 453 */       cjm.enableAlphaTest();
/*  434: 454 */       cjm.w();
/*  435: 455 */       cjm.enableLighting();
/*  436: 456 */       cjm.j();
/*  437:     */     }
/*  438:     */   }
/*  439:     */   
/*  440:     */   private void a(VertexBuffer paramciv, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  441:     */   {
/*  442: 461 */     paramciv.begin();
/*  443: 462 */     paramciv.setColor(paramInt5);
/*  444: 463 */     paramciv.addVertex(paramInt1 + 0, paramInt2 + 0, 0.0D);
/*  445: 464 */     paramciv.addVertex(paramInt1 + 0, paramInt2 + paramInt4, 0.0D);
/*  446: 465 */     paramciv.addVertex(paramInt1 + paramInt3, paramInt2 + paramInt4, 0.0D);
/*  447: 466 */     paramciv.addVertex(paramInt1 + paramInt3, paramInt2 + 0, 0.0D);
/*  448: 467 */     ckx.getInstance().draw();
/*  449:     */   }
/*  450:     */   
/*  451:     */   private void b()
/*  452:     */   {
/*  453: 482 */     a(BlockList.cf, "anvil_intact");
/*  454: 483 */     a(BlockList.cf, 1, "anvil_slightly_damaged");
/*  455: 484 */     a(BlockList.cf, 2, "anvil_very_damaged");
/*  456: 485 */     a(BlockList.cy, EnumDyeColor.BLACK.a(), "black_carpet");
/*  457: 486 */     a(BlockList.cy, EnumDyeColor.BLUE.a(), "blue_carpet");
/*  458: 487 */     a(BlockList.cy, EnumDyeColor.BROWN.a(), "brown_carpet");
/*  459: 488 */     a(BlockList.cy, EnumDyeColor.CYAN.a(), "cyan_carpet");
/*  460: 489 */     a(BlockList.cy, EnumDyeColor.GRAY.a(), "gray_carpet");
/*  461: 490 */     a(BlockList.cy, EnumDyeColor.GREEN.a(), "green_carpet");
/*  462: 491 */     a(BlockList.cy, EnumDyeColor.LIGHT_BLUE.a(), "light_blue_carpet");
/*  463: 492 */     a(BlockList.cy, EnumDyeColor.LIME.a(), "lime_carpet");
/*  464: 493 */     a(BlockList.cy, EnumDyeColor.MAGENTA.a(), "magenta_carpet");
/*  465: 494 */     a(BlockList.cy, EnumDyeColor.ORANGE.a(), "orange_carpet");
/*  466: 495 */     a(BlockList.cy, EnumDyeColor.PINK.a(), "pink_carpet");
/*  467: 496 */     a(BlockList.cy, EnumDyeColor.PURPLE.a(), "purple_carpet");
/*  468: 497 */     a(BlockList.cy, EnumDyeColor.RED.a(), "red_carpet");
/*  469: 498 */     a(BlockList.cy, EnumDyeColor.SILVER.a(), "silver_carpet");
/*  470: 499 */     a(BlockList.cy, EnumDyeColor.WHITE.a(), "white_carpet");
/*  471: 500 */     a(BlockList.cy, EnumDyeColor.YELLOW.a(), "yellow_carpet");
/*  472: 501 */     a(BlockList.bZ, EnumCobblestoneVariant.b.a(), "mossy_cobblestone_wall");
/*  473: 502 */     a(BlockList.bZ, EnumCobblestoneVariant.a.a(), "cobblestone_wall");
/*  474: 503 */     a(BlockList.dirt, avd.b.a(), "coarse_dirt");
/*  475: 504 */     a(BlockList.dirt, avd.a.a(), "dirt");
/*  476: 505 */     a(BlockList.dirt, avd.c.a(), "podzol");
/*  477: 506 */     a(BlockList.cF, avk.d.a(), "double_fern");
/*  478: 507 */     a(BlockList.cF, avk.c.a(), "double_grass");
/*  479: 508 */     a(BlockList.cF, avk.f.a(), "paeonia");
/*  480: 509 */     a(BlockList.cF, avk.e.a(), "double_rose");
/*  481: 510 */     a(BlockList.cF, avk.a.a(), "sunflower");
/*  482: 511 */     a(BlockList.cF, avk.b.a(), "syringa");
/*  483: 512 */     a(BlockList.leaves, EnumWoodVariant.BIRCH.getIndex(), "birch_leaves");
/*  484: 513 */     a(BlockList.leaves, EnumWoodVariant.JUNGLE.getIndex(), "jungle_leaves");
/*  485: 514 */     a(BlockList.leaves, EnumWoodVariant.OAK.getIndex(), "oak_leaves");
/*  486: 515 */     a(BlockList.leaves, EnumWoodVariant.SPRUCE.getIndex(), "spruce_leaves");
/*  487: 516 */     a(BlockList.leaves2, EnumWoodVariant.ACACIA.getIndex() - 4, "acacia_leaves");
/*  488: 517 */     a(BlockList.leaves2, EnumWoodVariant.DARK_OAK.getIndex() - 4, "dark_oak_leaves");
/*  489: 518 */     a(BlockList.log, EnumWoodVariant.BIRCH.getIndex(), "birch_log");
/*  490: 519 */     a(BlockList.log, EnumWoodVariant.JUNGLE.getIndex(), "jungle_log");
/*  491: 520 */     a(BlockList.log, EnumWoodVariant.OAK.getIndex(), "oak_log");
/*  492: 521 */     a(BlockList.log, EnumWoodVariant.SPRUCE.getIndex(), "spruce_log");
/*  493: 522 */     a(BlockList.log2, EnumWoodVariant.ACACIA.getIndex() - 4, "acacia_log");
/*  494: 523 */     a(BlockList.log2, EnumWoodVariant.DARK_OAK.getIndex() - 4, "dark_oak_log");
/*  495: 524 */     a(BlockList.monsterEgg, EnumMonsterEggVariants.f.a(), "chiseled_brick_monster_egg");
/*  496: 525 */     a(BlockList.monsterEgg, EnumMonsterEggVariants.b.a(), "cobblestone_monster_egg");
/*  497: 526 */     a(BlockList.monsterEgg, EnumMonsterEggVariants.e.a(), "cracked_brick_monster_egg");
/*  498: 527 */     a(BlockList.monsterEgg, EnumMonsterEggVariants.d.a(), "mossy_brick_monster_egg");
/*  499: 528 */     a(BlockList.monsterEgg, EnumMonsterEggVariants.a.a(), "stone_monster_egg");
/*  500: 529 */     a(BlockList.monsterEgg, EnumMonsterEggVariants.c.a(), "stone_brick_monster_egg");
/*  501: 530 */     a(BlockList.planks, EnumWoodVariant.ACACIA.getIndex(), "acacia_planks");
/*  502: 531 */     a(BlockList.planks, EnumWoodVariant.BIRCH.getIndex(), "birch_planks");
/*  503: 532 */     a(BlockList.planks, EnumWoodVariant.DARK_OAK.getIndex(), "dark_oak_planks");
/*  504: 533 */     a(BlockList.planks, EnumWoodVariant.JUNGLE.getIndex(), "jungle_planks");
/*  505: 534 */     a(BlockList.planks, EnumWoodVariant.OAK.getIndex(), "oak_planks");
/*  506: 535 */     a(BlockList.planks, EnumWoodVariant.SPRUCE.getIndex(), "spruce_planks");
/*  507: 536 */     a(BlockList.cI, azj.b.a(), "prismarine_bricks");
/*  508: 537 */     a(BlockList.cI, azj.c.a(), "dark_prismarine");
/*  509: 538 */     a(BlockList.cI, azj.a.a(), "prismarine");
/*  510: 539 */     a(BlockList.cq, azn.b.a(), "chiseled_quartz_block");
/*  511: 540 */     a(BlockList.cq, azn.a.a(), "quartz_block");
/*  512: 541 */     a(BlockList.cq, azn.c.a(), "quartz_column");
/*  513: 542 */     a(BlockList.redFlower, EnumFlowerVariant.d.b(), "allium");
/*  514: 543 */     a(BlockList.redFlower, EnumFlowerVariant.c.b(), "blue_orchid");
/*  515: 544 */     a(BlockList.redFlower, EnumFlowerVariant.e.b(), "houstonia");
/*  516: 545 */     a(BlockList.redFlower, EnumFlowerVariant.g.b(), "orange_tulip");
/*  517: 546 */     a(BlockList.redFlower, EnumFlowerVariant.j.b(), "oxeye_daisy");
/*  518: 547 */     a(BlockList.redFlower, EnumFlowerVariant.i.b(), "pink_tulip");
/*  519: 548 */     a(BlockList.redFlower, EnumFlowerVariant.b.b(), "poppy");
/*  520: 549 */     a(BlockList.redFlower, EnumFlowerVariant.f.b(), "red_tulip");
/*  521: 550 */     a(BlockList.redFlower, EnumFlowerVariant.h.b(), "white_tulip");
/*  522: 551 */     a(BlockList.sand, bac.b.a(), "red_sand");
/*  523: 552 */     a(BlockList.sand, bac.a.a(), "sand");
/*  524: 553 */     a(BlockList.A, bae.b.a(), "chiseled_sandstone");
/*  525: 554 */     a(BlockList.A, bae.a.a(), "sandstone");
/*  526: 555 */     a(BlockList.A, bae.c.a(), "smooth_sandstone");
/*  527: 556 */     a(BlockList.cM, azr.b.a(), "chiseled_red_sandstone");
/*  528: 557 */     a(BlockList.cM, azr.a.a(), "red_sandstone");
/*  529: 558 */     a(BlockList.cM, azr.c.a(), "smooth_red_sandstone");
/*  530: 559 */     a(BlockList.sapling, EnumWoodVariant.ACACIA.getIndex(), "acacia_sapling");
/*  531: 560 */     a(BlockList.sapling, EnumWoodVariant.BIRCH.getIndex(), "birch_sapling");
/*  532: 561 */     a(BlockList.sapling, EnumWoodVariant.DARK_OAK.getIndex(), "dark_oak_sapling");
/*  533: 562 */     a(BlockList.sapling, EnumWoodVariant.JUNGLE.getIndex(), "jungle_sapling");
/*  534: 563 */     a(BlockList.sapling, EnumWoodVariant.OAK.getIndex(), "oak_sapling");
/*  535: 564 */     a(BlockList.sapling, EnumWoodVariant.SPRUCE.getIndex(), "spruce_sapling");
/*  536: 565 */     a(BlockList.v, 0, "sponge");
/*  537: 566 */     a(BlockList.v, 1, "sponge_wet");
/*  538: 567 */     a(BlockList.cG, EnumDyeColor.BLACK.a(), "black_stained_glass");
/*  539: 568 */     a(BlockList.cG, EnumDyeColor.BLUE.a(), "blue_stained_glass");
/*  540: 569 */     a(BlockList.cG, EnumDyeColor.BROWN.a(), "brown_stained_glass");
/*  541: 570 */     a(BlockList.cG, EnumDyeColor.CYAN.a(), "cyan_stained_glass");
/*  542: 571 */     a(BlockList.cG, EnumDyeColor.GRAY.a(), "gray_stained_glass");
/*  543: 572 */     a(BlockList.cG, EnumDyeColor.GREEN.a(), "green_stained_glass");
/*  544: 573 */     a(BlockList.cG, EnumDyeColor.LIGHT_BLUE.a(), "light_blue_stained_glass");
/*  545: 574 */     a(BlockList.cG, EnumDyeColor.LIME.a(), "lime_stained_glass");
/*  546: 575 */     a(BlockList.cG, EnumDyeColor.MAGENTA.a(), "magenta_stained_glass");
/*  547: 576 */     a(BlockList.cG, EnumDyeColor.ORANGE.a(), "orange_stained_glass");
/*  548: 577 */     a(BlockList.cG, EnumDyeColor.PINK.a(), "pink_stained_glass");
/*  549: 578 */     a(BlockList.cG, EnumDyeColor.PURPLE.a(), "purple_stained_glass");
/*  550: 579 */     a(BlockList.cG, EnumDyeColor.RED.a(), "red_stained_glass");
/*  551: 580 */     a(BlockList.cG, EnumDyeColor.SILVER.a(), "silver_stained_glass");
/*  552: 581 */     a(BlockList.cG, EnumDyeColor.WHITE.a(), "white_stained_glass");
/*  553: 582 */     a(BlockList.cG, EnumDyeColor.YELLOW.a(), "yellow_stained_glass");
/*  554: 583 */     a(BlockList.stainedGlassPane, EnumDyeColor.BLACK.a(), "black_stained_glass_pane");
/*  555: 584 */     a(BlockList.stainedGlassPane, EnumDyeColor.BLUE.a(), "blue_stained_glass_pane");
/*  556: 585 */     a(BlockList.stainedGlassPane, EnumDyeColor.BROWN.a(), "brown_stained_glass_pane");
/*  557: 586 */     a(BlockList.stainedGlassPane, EnumDyeColor.CYAN.a(), "cyan_stained_glass_pane");
/*  558: 587 */     a(BlockList.stainedGlassPane, EnumDyeColor.GRAY.a(), "gray_stained_glass_pane");
/*  559: 588 */     a(BlockList.stainedGlassPane, EnumDyeColor.GREEN.a(), "green_stained_glass_pane");
/*  560: 589 */     a(BlockList.stainedGlassPane, EnumDyeColor.LIGHT_BLUE.a(), "light_blue_stained_glass_pane");
/*  561: 590 */     a(BlockList.stainedGlassPane, EnumDyeColor.LIME.a(), "lime_stained_glass_pane");
/*  562: 591 */     a(BlockList.stainedGlassPane, EnumDyeColor.MAGENTA.a(), "magenta_stained_glass_pane");
/*  563: 592 */     a(BlockList.stainedGlassPane, EnumDyeColor.ORANGE.a(), "orange_stained_glass_pane");
/*  564: 593 */     a(BlockList.stainedGlassPane, EnumDyeColor.PINK.a(), "pink_stained_glass_pane");
/*  565: 594 */     a(BlockList.stainedGlassPane, EnumDyeColor.PURPLE.a(), "purple_stained_glass_pane");
/*  566: 595 */     a(BlockList.stainedGlassPane, EnumDyeColor.RED.a(), "red_stained_glass_pane");
/*  567: 596 */     a(BlockList.stainedGlassPane, EnumDyeColor.SILVER.a(), "silver_stained_glass_pane");
/*  568: 597 */     a(BlockList.stainedGlassPane, EnumDyeColor.WHITE.a(), "white_stained_glass_pane");
/*  569: 598 */     a(BlockList.stainedGlassPane, EnumDyeColor.YELLOW.a(), "yellow_stained_glass_pane");
/*  570: 599 */     a(BlockList.cu, EnumDyeColor.BLACK.a(), "black_stained_hardened_clay");
/*  571: 600 */     a(BlockList.cu, EnumDyeColor.BLUE.a(), "blue_stained_hardened_clay");
/*  572: 601 */     a(BlockList.cu, EnumDyeColor.BROWN.a(), "brown_stained_hardened_clay");
/*  573: 602 */     a(BlockList.cu, EnumDyeColor.CYAN.a(), "cyan_stained_hardened_clay");
/*  574: 603 */     a(BlockList.cu, EnumDyeColor.GRAY.a(), "gray_stained_hardened_clay");
/*  575: 604 */     a(BlockList.cu, EnumDyeColor.GREEN.a(), "green_stained_hardened_clay");
/*  576: 605 */     a(BlockList.cu, EnumDyeColor.LIGHT_BLUE.a(), "light_blue_stained_hardened_clay");
/*  577: 606 */     a(BlockList.cu, EnumDyeColor.LIME.a(), "lime_stained_hardened_clay");
/*  578: 607 */     a(BlockList.cu, EnumDyeColor.MAGENTA.a(), "magenta_stained_hardened_clay");
/*  579: 608 */     a(BlockList.cu, EnumDyeColor.ORANGE.a(), "orange_stained_hardened_clay");
/*  580: 609 */     a(BlockList.cu, EnumDyeColor.PINK.a(), "pink_stained_hardened_clay");
/*  581: 610 */     a(BlockList.cu, EnumDyeColor.PURPLE.a(), "purple_stained_hardened_clay");
/*  582: 611 */     a(BlockList.cu, EnumDyeColor.RED.a(), "red_stained_hardened_clay");
/*  583: 612 */     a(BlockList.cu, EnumDyeColor.SILVER.a(), "silver_stained_hardened_clay");
/*  584: 613 */     a(BlockList.cu, EnumDyeColor.WHITE.a(), "white_stained_hardened_clay");
/*  585: 614 */     a(BlockList.cu, EnumDyeColor.YELLOW.a(), "yellow_stained_hardened_clay");
/*  586: 615 */     a(BlockList.stone, EnumStoneVariants.ANDESITE.a(), "andesite");
/*  587: 616 */     a(BlockList.stone, EnumStoneVariants.ANDESITE_SMOOTH.a(), "andesite_smooth");
/*  588: 617 */     a(BlockList.stone, EnumStoneVariants.DIORITE.a(), "diorite");
/*  589: 618 */     a(BlockList.stone, EnumStoneVariants.DIORITE_SMOOTH.a(), "diorite_smooth");
/*  590: 619 */     a(BlockList.stone, EnumStoneVariants.GRANITE.a(), "granite");
/*  591: 620 */     a(BlockList.stone, EnumStoneVariants.GRANITE_SMOOTH.a(), "granite_smooth");
/*  592: 621 */     a(BlockList.stone, EnumStoneVariants.STONE.a(), "stone");
/*  593: 622 */     a(BlockList.bf, bbd.c.a(), "cracked_stonebrick");
/*  594: 623 */     a(BlockList.bf, bbd.a.a(), "stonebrick");
/*  595: 624 */     a(BlockList.bf, bbd.d.a(), "chiseled_stonebrick");
/*  596: 625 */     a(BlockList.bf, bbd.b.a(), "mossy_stonebrick");
/*  597: 626 */     a(BlockList.U, bbg.e.a(), "brick_slab");
/*  598: 627 */     a(BlockList.U, bbg.d.a(), "cobblestone_slab");
/*  599: 628 */     a(BlockList.U, bbg.c.a(), "old_wood_slab");
/*  600: 629 */     a(BlockList.U, bbg.g.a(), "nether_brick_slab");
/*  601: 630 */     a(BlockList.U, bbg.h.a(), "quartz_slab");
/*  602: 631 */     a(BlockList.U, bbg.b.a(), "sandstone_slab");
/*  603: 632 */     a(BlockList.U, bbg.f.a(), "stone_brick_slab");
/*  604: 633 */     a(BlockList.U, bbg.a.a(), "stone_slab");
/*  605: 634 */     a(BlockList.cP, aym.a.a(), "red_sandstone_slab");
/*  606: 635 */     a(BlockList.tallgrass, bbi.a.a(), "dead_bush");
/*  607: 636 */     a(BlockList.tallgrass, bbi.c.a(), "fern");
/*  608: 637 */     a(BlockList.tallgrass, bbi.b.a(), "tall_grass");
/*  609: 638 */     a(BlockList.bM, EnumWoodVariant.ACACIA.getIndex(), "acacia_slab");
/*  610: 639 */     a(BlockList.bM, EnumWoodVariant.BIRCH.getIndex(), "birch_slab");
/*  611: 640 */     a(BlockList.bM, EnumWoodVariant.DARK_OAK.getIndex(), "dark_oak_slab");
/*  612: 641 */     a(BlockList.bM, EnumWoodVariant.JUNGLE.getIndex(), "jungle_slab");
/*  613: 642 */     a(BlockList.bM, EnumWoodVariant.OAK.getIndex(), "oak_slab");
/*  614: 643 */     a(BlockList.bM, EnumWoodVariant.SPRUCE.getIndex(), "spruce_slab");
/*  615: 644 */     a(BlockList.wool, EnumDyeColor.BLACK.a(), "black_wool");
/*  616: 645 */     a(BlockList.wool, EnumDyeColor.BLUE.a(), "blue_wool");
/*  617: 646 */     a(BlockList.wool, EnumDyeColor.BROWN.a(), "brown_wool");
/*  618: 647 */     a(BlockList.wool, EnumDyeColor.CYAN.a(), "cyan_wool");
/*  619: 648 */     a(BlockList.wool, EnumDyeColor.GRAY.a(), "gray_wool");
/*  620: 649 */     a(BlockList.wool, EnumDyeColor.GREEN.a(), "green_wool");
/*  621: 650 */     a(BlockList.wool, EnumDyeColor.LIGHT_BLUE.a(), "light_blue_wool");
/*  622: 651 */     a(BlockList.wool, EnumDyeColor.LIME.a(), "lime_wool");
/*  623: 652 */     a(BlockList.wool, EnumDyeColor.MAGENTA.a(), "magenta_wool");
/*  624: 653 */     a(BlockList.wool, EnumDyeColor.ORANGE.a(), "orange_wool");
/*  625: 654 */     a(BlockList.wool, EnumDyeColor.PINK.a(), "pink_wool");
/*  626: 655 */     a(BlockList.wool, EnumDyeColor.PURPLE.a(), "purple_wool");
/*  627: 656 */     a(BlockList.wool, EnumDyeColor.RED.a(), "red_wool");
/*  628: 657 */     a(BlockList.wool, EnumDyeColor.SILVER.a(), "silver_wool");
/*  629: 658 */     a(BlockList.wool, EnumDyeColor.WHITE.a(), "white_wool");
/*  630: 659 */     a(BlockList.wool, EnumDyeColor.YELLOW.a(), "yellow_wool");
/*  631:     */     
/*  632: 661 */     a(BlockList.cC, "acacia_stairs");
/*  633: 662 */     a(BlockList.activatorRail, "activator_rail");
/*  634: 663 */     a(BlockList.bY, "beacon");
/*  635: 664 */     a(BlockList.bedrock, "bedrock");
/*  636: 665 */     a(BlockList.bV, "birch_stairs");
/*  637: 666 */     a(BlockList.bookshelf, "bookshelf");
/*  638: 667 */     a(BlockList.V, "brick_block");
/*  639: 668 */     a(BlockList.V, "brick_block");
/*  640: 669 */     a(BlockList.bu, "brick_stairs");
/*  641: 670 */     a(BlockList.brownMushroom, "brown_mushroom");
/*  642: 671 */     a(BlockList.cactus, "cactus");
/*  643: 672 */     a(BlockList.aL, "clay");
/*  644: 673 */     a(BlockList.cA, "coal_block");
/*  645: 674 */     a(BlockList.coalOre, "coal_ore");
/*  646: 675 */     a(BlockList.cobblestone, "cobblestone");
/*  647: 676 */     a(BlockList.ai, "crafting_table");
/*  648: 677 */     a(BlockList.cD, "dark_oak_stairs");
/*  649: 678 */     a(BlockList.cl, "daylight_detector");
/*  650: 679 */     a(BlockList.deadbush, "dead_bush");
/*  651: 680 */     a(BlockList.detector_rail, "detector_rail");
/*  652: 681 */     a(BlockList.diamondBlock, "diamond_block");
/*  653: 682 */     a(BlockList.diamondOre, "diamond_ore");
/*  654: 683 */     a(BlockList.z, "dispenser");
/*  655: 684 */     a(BlockList.ct, "dropper");
/*  656: 685 */     a(BlockList.emeraldBlock, "emerald_block");
/*  657: 686 */     a(BlockList.bP, "emerald_ore");
/*  658: 687 */     a(BlockList.bC, "enchanting_table");
/*  659: 688 */     a(BlockList.endPortalFrame, "end_portal_frame");
/*  660: 689 */     a(BlockList.endStone, "end_stone");
/*  661: 690 */     a(BlockList.fence, "oak_fence");
/*  662: 691 */     a(BlockList.aP, "spruce_fence");
/*  663: 692 */     a(BlockList.aQ, "birch_fence");
/*  664: 693 */     a(BlockList.aR, "jungle_fence");
/*  665: 694 */     a(BlockList.darkOakFence, "dark_oak_fence");
/*  666: 695 */     a(BlockList.aT, "acacia_fence");
/*  667: 696 */     a(BlockList.bo, "oak_fence_gate");
/*  668: 697 */     a(BlockList.bp, "spruce_fence_gate");
/*  669: 698 */     a(BlockList.bq, "birch_fence_gate");
/*  670: 699 */     a(BlockList.br, "jungle_fence_gate");
/*  671: 700 */     a(BlockList.bs, "dark_oak_fence_gate");
/*  672: 701 */     a(BlockList.bt, "acacia_fence_gate");
/*  673: 702 */     a(BlockList.al, "furnace");
/*  674: 703 */     a(BlockList.w, "glass");
/*  675: 704 */     a(BlockList.bj, "glass_pane");
/*  676: 705 */     a(BlockList.glowstone, "glowstone");
/*  677: 706 */     a(BlockList.D, "golden_rail");
/*  678: 707 */     a(BlockList.R, "gold_block");
/*  679: 708 */     a(BlockList.goldOre, "gold_ore");
/*  680: 709 */     a(BlockList.grass, "grass");
/*  681: 710 */     a(BlockList.gravel, "gravel");
/*  682: 711 */     a(BlockList.cz, "hardened_clay");
/*  683: 712 */     a(BlockList.cx, "hay_block");
/*  684: 713 */     a(BlockList.ci, "heavy_weighted_pressure_plate");
/*  685: 714 */     a(BlockList.cp, "hopper");
/*  686: 715 */     a(BlockList.aI, "ice");
/*  687: 716 */     a(BlockList.bi, "iron_bars");
/*  688: 717 */     a(BlockList.S, "iron_block");
/*  689: 718 */     a(BlockList.ironOre, "iron_ore");
/*  690: 719 */     a(BlockList.cw, "iron_trapdoor");
/*  691: 720 */     a(BlockList.aN, "jukebox");
/*  692: 721 */     a(BlockList.bW, "jungle_stairs");
/*  693: 722 */     a(BlockList.au, "ladder");
/*  694: 723 */     a(BlockList.y, "lapis_block");
/*  695: 724 */     a(BlockList.lapisOre, "lapis_ore");
/*  696: 725 */     a(BlockList.ay, "lever");
/*  697: 726 */     a(BlockList.ch, "light_weighted_pressure_plate");
/*  698: 727 */     a(BlockList.aZ, "lit_pumpkin");
/*  699: 728 */     a(BlockList.bk, "melon_block");
/*  700: 729 */     a(BlockList.Y, "mossy_cobblestone");
/*  701: 730 */     a(BlockList.bw, "mycelium");
/*  702: 731 */     a(BlockList.netherrack, "netherrack");
/*  703: 732 */     a(BlockList.netherBrick, "nether_brick");
/*  704: 733 */     a(BlockList.bz, "nether_brick_fence");
/*  705: 734 */     a(BlockList.bA, "nether_brick_stairs");
/*  706: 735 */     a(BlockList.B, "noteblock");
/*  707: 736 */     a(BlockList.ad, "oak_stairs");
/*  708: 737 */     a(BlockList.obsidian, "obsidian");
/*  709: 738 */     a(BlockList.cB, "packed_ice");
/*  710: 739 */     a(BlockList.J, "piston");
/*  711: 740 */     a(BlockList.pumpkin, "pumpkin");
/*  712: 741 */     a(BlockList.quartzOre, "quartz_ore");
/*  713: 742 */     a(BlockList.cr, "quartz_stairs");
/*  714: 743 */     a(BlockList.av, "rail");
/*  715: 744 */     a(BlockList.cn, "redstone_block");
/*  716: 745 */     a(BlockList.bJ, "redstone_lamp");
/*  717: 746 */     a(BlockList.redstoneOre, "redstone_ore");
/*  718: 747 */     a(BlockList.aF, "redstone_torch");
/*  719: 748 */     a(BlockList.redMushroom, "red_mushroom");
/*  720: 749 */     a(BlockList.bO, "sandstone_stairs");
/*  721: 750 */     a(BlockList.cN, "red_sandstone_stairs");
/*  722: 751 */     a(BlockList.seaLantern, "sea_lantern");
/*  723: 752 */     a(BlockList.cE, "slime");
/*  724: 753 */     a(BlockList.aJ, "snow");
/*  725: 754 */     a(BlockList.aH, "snow_layer");
/*  726: 755 */     a(BlockList.soulSand, "soul_sand");
/*  727: 756 */     a(BlockList.bU, "spruce_stairs");
/*  728: 757 */     a(BlockList.F, "sticky_piston");
/*  729: 758 */     a(BlockList.bv, "stone_brick_stairs");
/*  730: 759 */     a(BlockList.aG, "stone_button");
/*  731: 760 */     a(BlockList.az, "stone_pressure_plate");
/*  732: 761 */     a(BlockList.aw, "stone_stairs");
/*  733: 762 */     a(BlockList.W, "tnt");
/*  734: 763 */     a(BlockList.torch, "torch");
/*  735: 764 */     a(BlockList.bd, "trapdoor");
/*  736: 765 */     a(BlockList.bR, "tripwire_hook");
/*  737: 766 */     a(BlockList.vine, "vine");
/*  738: 767 */     a(BlockList.waterLily, "waterlily");
/*  739: 768 */     a(BlockList.web, "web");
/*  740: 769 */     a(BlockList.cd, "wooden_button");
/*  741: 770 */     a(BlockList.aB, "wooden_pressure_plate");
/*  742: 771 */     a(BlockList.yellowFlower, EnumFlowerVariant.a.b(), "dandelion");
/*  743:     */     
/*  744: 773 */     a(BlockList.ae, "chest");
/*  745: 774 */     a(BlockList.cg, "trapped_chest");
/*  746: 775 */     a(BlockList.bQ, "ender_chest");
/*  747:     */     
/*  748: 777 */     a(ItemList.a, "iron_shovel");
/*  749: 778 */     a(ItemList.b, "iron_pickaxe");
/*  750:     */     
/*  751: 780 */     a(ItemList.c, "iron_axe");
/*  752: 781 */     a(ItemList.d, "flint_and_steel");
/*  753: 782 */     a(ItemList.apple, "apple");
/*  754: 783 */     a(ItemList.bow, 0, "bow");
/*  755: 784 */     a(ItemList.bow, 1, "bow_pulling_0");
/*  756: 785 */     a(ItemList.bow, 2, "bow_pulling_1");
/*  757: 786 */     a(ItemList.bow, 3, "bow_pulling_2");
/*  758: 787 */     a(ItemList.g, "arrow");
/*  759: 788 */     a(ItemList.h, 0, "coal");
/*  760: 789 */     a(ItemList.h, 1, "charcoal");
/*  761: 790 */     a(ItemList.diamond, "diamond");
/*  762: 791 */     a(ItemList.ironIngot, "iron_ingot");
/*  763:     */     
/*  764: 793 */     a(ItemList.goldIngot, "gold_ingot");
/*  765: 794 */     a(ItemList.l, "iron_sword");
/*  766: 795 */     a(ItemList.m, "wooden_sword");
/*  767: 796 */     a(ItemList.n, "wooden_shovel");
/*  768: 797 */     a(ItemList.o, "wooden_pickaxe");
/*  769: 798 */     a(ItemList.p, "wooden_axe");
/*  770: 799 */     a(ItemList.q, "stone_sword");
/*  771: 800 */     a(ItemList.r, "stone_shovel");
/*  772: 801 */     a(ItemList.s, "stone_pickaxe");
/*  773:     */     
/*  774: 803 */     a(ItemList.t, "stone_axe");
/*  775: 804 */     a(ItemList.u, "diamond_sword");
/*  776: 805 */     a(ItemList.v, "diamond_shovel");
/*  777: 806 */     a(ItemList.w, "diamond_pickaxe");
/*  778: 807 */     a(ItemList.x, "diamond_axe");
/*  779: 808 */     a(ItemList.stick, "stick");
/*  780: 809 */     a(ItemList.z, "bowl");
/*  781: 810 */     a(ItemList.A, "mushroom_stew");
/*  782: 811 */     a(ItemList.goldenSword, "golden_sword");
/*  783: 812 */     a(ItemList.C, "golden_shovel");
/*  784: 813 */     a(ItemList.D, "golden_pickaxe");
/*  785: 814 */     a(ItemList.E, "golden_axe");
/*  786: 815 */     a(ItemList.F, "string");
/*  787: 816 */     a(ItemList.G, "feather");
/*  788: 817 */     a(ItemList.H, "gunpowder");
/*  789: 818 */     a(ItemList.I, "wooden_hoe");
/*  790: 819 */     a(ItemList.J, "stone_hoe");
/*  791: 820 */     a(ItemList.K, "iron_hoe");
/*  792: 821 */     a(ItemList.L, "diamond_hoe");
/*  793: 822 */     a(ItemList.M, "golden_hoe");
/*  794: 823 */     a(ItemList.N, "wheat_seeds");
/*  795: 824 */     a(ItemList.O, "wheat");
/*  796: 825 */     a(ItemList.bread, "bread");
/*  797:     */     
/*  798: 827 */     a(ItemList.Q, "leather_helmet");
/*  799: 828 */     a(ItemList.R, "leather_chestplate");
/*  800: 829 */     a(ItemList.S, "leather_leggings");
/*  801: 830 */     a(ItemList.leatherBoots, "leather_boots");
/*  802:     */     
/*  803: 832 */     a(ItemList.U, "chainmail_helmet");
/*  804: 833 */     a(ItemList.V, "chainmail_chestplate");
/*  805: 834 */     a(ItemList.W, "chainmail_leggings");
/*  806: 835 */     a(ItemList.X, "chainmail_boots");
/*  807:     */     
/*  808: 837 */     a(ItemList.Y, "iron_helmet");
/*  809: 838 */     a(ItemList.Z, "iron_chestplate");
/*  810: 839 */     a(ItemList.aa, "iron_leggings");
/*  811: 840 */     a(ItemList.ab, "iron_boots");
/*  812:     */     
/*  813: 842 */     a(ItemList.ac, "diamond_helmet");
/*  814: 843 */     a(ItemList.ad, "diamond_chestplate");
/*  815: 844 */     a(ItemList.ae, "diamond_leggings");
/*  816: 845 */     a(ItemList.af, "diamond_boots");
/*  817:     */     
/*  818: 847 */     a(ItemList.ag, "golden_helmet");
/*  819: 848 */     a(ItemList.ah, "golden_chestplate");
/*  820: 849 */     a(ItemList.ai, "golden_leggings");
/*  821: 850 */     a(ItemList.aj, "golden_boots");
/*  822:     */     
/*  823: 852 */     a(ItemList.ak, "flint");
/*  824: 853 */     a(ItemList.al, "porkchop");
/*  825: 854 */     a(ItemList.am, "cooked_porkchop");
/*  826: 855 */     a(ItemList.an, "painting");
/*  827: 856 */     a(ItemList.ao, "golden_apple");
/*  828: 857 */     a(ItemList.ao, 1, "golden_apple");
/*  829: 858 */     a(ItemList.ap, "sign");
/*  830: 859 */     a(ItemList.aq, "oak_door");
/*  831: 860 */     a(ItemList.ar, "spruce_door");
/*  832: 861 */     a(ItemList.as, "birch_door");
/*  833: 862 */     a(ItemList.at, "jungle_door");
/*  834: 863 */     a(ItemList.au, "acacia_door");
/*  835: 864 */     a(ItemList.av, "dark_oak_door");
/*  836: 865 */     a(ItemList.aw, "bucket");
/*  837: 866 */     a(ItemList.ax, "water_bucket");
/*  838: 867 */     a(ItemList.ay, "lava_bucket");
/*  839:     */     
/*  840: 869 */     a(ItemList.az, "minecart");
/*  841: 870 */     a(ItemList.saddle, "saddle");
/*  842: 871 */     a(ItemList.aB, "iron_door");
/*  843: 872 */     a(ItemList.aC, "redstone");
/*  844: 873 */     a(ItemList.aD, "snowball");
/*  845: 874 */     a(ItemList.aE, "boat");
/*  846: 875 */     a(ItemList.leather, "leather");
/*  847: 876 */     a(ItemList.aG, "milk_bucket");
/*  848: 877 */     a(ItemList.aH, "brick");
/*  849:     */     
/*  850: 879 */     a(ItemList.aI, "clay_ball");
/*  851: 880 */     a(ItemList.aJ, "reeds");
/*  852: 881 */     a(ItemList.aK, "paper");
/*  853: 882 */     a(ItemList.book, "book");
/*  854: 883 */     a(ItemList.aM, "slime_ball");
/*  855: 884 */     a(ItemList.aN, "chest_minecart");
/*  856: 885 */     a(ItemList.aO, "furnace_minecart");
/*  857: 886 */     a(ItemList.aP, "egg");
/*  858: 887 */     a(ItemList.aQ, "compass");
/*  859:     */     
/*  860: 889 */     a(ItemList.fishingRod, "fishing_rod");
/*  861: 890 */     a(ItemList.fishingRod, 1, "fishing_rod_cast");
/*  862: 891 */     a(ItemList.aS, "clock");
/*  863: 892 */     a(ItemList.aT, "glowstone_dust");
/*  864: 893 */     a(ItemList.fish, ali.a.a(), "cod");
/*  865: 894 */     a(ItemList.fish, ali.b.a(), "salmon");
/*  866: 895 */     a(ItemList.fish, ali.c.a(), "clownfish");
/*  867: 896 */     a(ItemList.fish, ali.d.a(), "pufferfish");
/*  868: 897 */     a(ItemList.aV, ali.a.a(), "cooked_cod");
/*  869: 898 */     a(ItemList.aV, ali.b.a(), "cooked_salmon");
/*  870:     */     
/*  871: 900 */     a(ItemList.dye, EnumDyeColor.BLACK.b(), "dye_black");
/*  872: 901 */     a(ItemList.dye, EnumDyeColor.RED.b(), "dye_red");
/*  873: 902 */     a(ItemList.dye, EnumDyeColor.GREEN.b(), "dye_green");
/*  874: 903 */     a(ItemList.dye, EnumDyeColor.BROWN.b(), "dye_brown");
/*  875: 904 */     a(ItemList.dye, EnumDyeColor.BLUE.b(), "dye_blue");
/*  876: 905 */     a(ItemList.dye, EnumDyeColor.PURPLE.b(), "dye_purple");
/*  877: 906 */     a(ItemList.dye, EnumDyeColor.CYAN.b(), "dye_cyan");
/*  878: 907 */     a(ItemList.dye, EnumDyeColor.SILVER.b(), "dye_silver");
/*  879: 908 */     a(ItemList.dye, EnumDyeColor.GRAY.b(), "dye_gray");
/*  880: 909 */     a(ItemList.dye, EnumDyeColor.PINK.b(), "dye_pink");
/*  881: 910 */     a(ItemList.dye, EnumDyeColor.LIME.b(), "dye_lime");
/*  882: 911 */     a(ItemList.dye, EnumDyeColor.YELLOW.b(), "dye_yellow");
/*  883: 912 */     a(ItemList.dye, EnumDyeColor.LIGHT_BLUE.b(), "dye_light_blue");
/*  884: 913 */     a(ItemList.dye, EnumDyeColor.MAGENTA.b(), "dye_magenta");
/*  885: 914 */     a(ItemList.dye, EnumDyeColor.ORANGE.b(), "dye_orange");
/*  886: 915 */     a(ItemList.dye, EnumDyeColor.WHITE.b(), "dye_white");
/*  887:     */     
/*  888: 917 */     a(ItemList.bone, "bone");
/*  889: 918 */     a(ItemList.aY, "sugar");
/*  890:     */     
/*  891: 920 */     a(ItemList.aZ, "cake");
/*  892: 921 */     a(ItemList.ba, "bed");
/*  893: 922 */     a(ItemList.bb, "repeater");
/*  894: 923 */     a(ItemList.bc, "cookie");
/*  895: 924 */     a(ItemList.be, "shears");
/*  896: 925 */     a(ItemList.bf, "melon");
/*  897: 926 */     a(ItemList.bg, "pumpkin_seeds");
/*  898: 927 */     a(ItemList.bh, "melon_seeds");
/*  899:     */     
/*  900: 929 */     a(ItemList.bi, "beef");
/*  901: 930 */     a(ItemList.bj, "cooked_beef");
/*  902: 931 */     a(ItemList.bk, "chicken");
/*  903: 932 */     a(ItemList.bl, "cooked_chicken");
/*  904: 933 */     a(ItemList.bo, "rabbit");
/*  905: 934 */     a(ItemList.bp, "cooked_rabbit");
/*  906: 935 */     a(ItemList.bm, "mutton");
/*  907: 936 */     a(ItemList.bn, "cooked_mutton");
/*  908: 937 */     a(ItemList.br, "rabbit_foot");
/*  909: 938 */     a(ItemList.bs, "rabbit_hide");
/*  910: 939 */     a(ItemList.bq, "rabbit_stew");
/*  911:     */     
/*  912: 941 */     a(ItemList.bt, "rotten_flesh");
/*  913: 942 */     a(ItemList.bu, "ender_pearl");
/*  914: 943 */     a(ItemList.bv, "blaze_rod");
/*  915: 944 */     a(ItemList.bw, "ghast_tear");
/*  916: 945 */     a(ItemList.goldNugget, "gold_nugget");
/*  917: 946 */     a(ItemList.by, "nether_wart");
/*  918:     */     
/*  919: 948 */     this.m.a(ItemList.potion, new cqn(this));
/*  920:     */     
/*  921:     */ 
/*  922:     */ 
/*  923:     */ 
/*  924:     */ 
/*  925:     */ 
/*  926:     */ 
/*  927:     */ 
/*  928:     */ 
/*  929:     */ 
/*  930: 959 */     a(ItemList.bA, "glass_bottle");
/*  931: 960 */     a(ItemList.bB, "spider_eye");
/*  932: 961 */     a(ItemList.bC, "fermented_spider_eye");
/*  933: 962 */     a(ItemList.bD, "blaze_powder");
/*  934: 963 */     a(ItemList.bE, "magma_cream");
/*  935: 964 */     a(ItemList.bF, "brewing_stand");
/*  936: 965 */     a(ItemList.bG, "cauldron");
/*  937: 966 */     a(ItemList.bH, "ender_eye");
/*  938: 967 */     a(ItemList.bI, "speckled_melon");
/*  939:     */     
/*  940: 969 */     this.m.a(ItemList.spawnEgg, new cqo(this));
/*  941:     */     
/*  942:     */ 
/*  943:     */ 
/*  944:     */ 
/*  945:     */ 
/*  946:     */ 
/*  947: 976 */     a(ItemList.bK, "experience_bottle");
/*  948: 977 */     a(ItemList.bL, "fire_charge");
/*  949: 978 */     a(ItemList.bM, "writable_book");
/*  950: 979 */     a(ItemList.emerald, "emerald");
/*  951: 980 */     a(ItemList.itemFrame, "item_frame");
/*  952: 981 */     a(ItemList.bQ, "flower_pot");
/*  953: 982 */     a(ItemList.carrot, "carrot");
/*  954: 983 */     a(ItemList.potato, "potato");
/*  955:     */     
/*  956: 985 */     a(ItemList.bT, "baked_potato");
/*  957: 986 */     a(ItemList.bU, "poisonous_potato");
/*  958: 987 */     a(ItemList.map, "map");
/*  959: 988 */     a(ItemList.bW, "golden_carrot");
/*  960: 989 */     a(ItemList.skull, 0, "skull_skeleton");
/*  961: 990 */     a(ItemList.skull, 1, "skull_wither");
/*  962: 991 */     a(ItemList.skull, 2, "skull_zombie");
/*  963: 992 */     a(ItemList.skull, 3, "skull_char");
/*  964: 993 */     a(ItemList.skull, 4, "skull_creeper");
/*  965:     */     
/*  966: 995 */     a(ItemList.bY, "carrot_on_a_stick");
/*  967: 996 */     a(ItemList.bZ, "nether_star");
/*  968: 997 */     a(ItemList.ca, "pumpkin_pie");
/*  969: 998 */     a(ItemList.cc, "firework_charge");
/*  970: 999 */     a(ItemList.ce, "comparator");
/*  971:1000 */     a(ItemList.cf, "netherbrick");
/*  972:1001 */     a(ItemList.cg, "quartz");
/*  973:1002 */     a(ItemList.ch, "tnt_minecart");
/*  974:1003 */     a(ItemList.ci, "hopper_minecart");
/*  975:     */     
/*  976:1005 */     a(ItemList.armorStand, "armor_stand");
/*  977:1006 */     a(ItemList.ck, "iron_horse_armor");
/*  978:1007 */     a(ItemList.cl, "golden_horse_armor");
/*  979:1008 */     a(ItemList.cm, "diamond_horse_armor");
/*  980:1009 */     a(ItemList.cn, "lead");
/*  981:1010 */     a(ItemList.nameTag, "name_tag");
/*  982:     */     
/*  983:1012 */     this.m.a(ItemList.cE, new cqp(this));
/*  984:     */     
/*  985:     */ 
/*  986:     */ 
/*  987:     */ 
/*  988:     */ 
/*  989:     */ 
/*  990:1019 */     a(ItemList.cq, "record_13");
/*  991:1020 */     a(ItemList.cr, "record_cat");
/*  992:1021 */     a(ItemList.cs, "record_blocks");
/*  993:1022 */     a(ItemList.ct, "record_chirp");
/*  994:1023 */     a(ItemList.cu, "record_far");
/*  995:1024 */     a(ItemList.cv, "record_mall");
/*  996:1025 */     a(ItemList.cw, "record_mellohi");
/*  997:1026 */     a(ItemList.cx, "record_stal");
/*  998:1027 */     a(ItemList.cy, "record_strad");
/*  999:1028 */     a(ItemList.cz, "record_ward");
/* 1000:1029 */     a(ItemList.cA, "record_11");
/* 1001:1030 */     a(ItemList.cB, "record_wait");
/* 1002:     */     
/* 1003:1032 */     a(ItemList.cC, "prismarine_shard");
/* 1004:1033 */     a(ItemList.cD, "prismarine_crystals");
/* 1005:     */     
/* 1006:1035 */     this.m.a(ItemList.cd, new cqq(this));
/* 1007:     */     
/* 1008:     */ 
/* 1009:     */ 
/* 1010:     */ 
/* 1011:     */ 
/* 1012:     */ 
/* 1013:1042 */     this.m.a(ItemList.filledMap, new cqr(this));
/* 1014:     */     
/* 1015:     */ 
/* 1016:     */ 
/* 1017:     */ 
/* 1018:     */ 
/* 1019:1048 */     a(BlockList.bX, "command_block");
/* 1020:1049 */     a(ItemList.cb, "fireworks");
/* 1021:1050 */     a(ItemList.cp, "command_block_minecart");
/* 1022:1051 */     a(BlockList.barrier, "barrier");
/* 1023:1052 */     a(BlockList.mobSpawner, "mob_spawner");
/* 1024:1053 */     a(ItemList.bN, "written_book");
/* 1025:     */     
/* 1026:1055 */     a(BlockList.bg, axa.k.a(), "brown_mushroom_block");
/* 1027:1056 */     a(BlockList.bh, axa.k.a(), "red_mushroom_block");
/* 1028:     */     
/* 1029:1058 */     a(BlockList.dragonEgg, "dragon_egg");
/* 1030:     */   }
/* 1031:     */   
/* 1032:     */   public void a(cvk paramcvk)
/* 1033:     */   {
/* 1034:1063 */     this.m.b();
/* 1035:     */   }
/* 1036:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqh
 * JD-Core Version:    0.7.0.1
 */