package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Lists;
/*    2:     */ import com.google.common.collect.Maps;
/*    3:     */ import java.util.ArrayList;
/*    4:     */ import java.util.Collections;
/*    5:     */ import java.util.Iterator;
/*    6:     */ import java.util.List;
/*    7:     */ import java.util.Map;
/*    8:     */ 
/*    9:     */ public class aop
/*   10:     */ {
/*   11:  19 */   private static final aop a = new aop();
/*   12:  20 */   private final List<aoo> b = Lists.newArrayList();
/*   13:     */   
/*   14:     */   public static aop a()
/*   15:     */   {
/*   16:  23 */     return a;
/*   17:     */   }
/*   18:     */   
/*   19:     */   private aop()
/*   20:     */   {
/*   21:  27 */     new aov().a(this);
/*   22:  28 */     new aow().a(this);
/*   23:  29 */     new aon().a(this);
/*   24:  30 */     new aoj().a(this);
/*   25:  31 */     new aou().a(this);
/*   26:  32 */     new aob().a(this);
/*   27:  33 */     new aoh().a(this);
/*   28:  34 */     this.b.add(new aoa());
/*   29:  35 */     this.b.add(new aog());
/*   30:  36 */     this.b.add(new aol());
/*   31:  37 */     this.b.add(new aom());
/*   32:  38 */     this.b.add(new aoi());
/*   33:  39 */     this.b.add(new aor());
/*   34:  40 */     new aoc().a(this);
/*   35:     */     
/*   36:     */ 
/*   37:  43 */     a(new ItemStack(ItemList.aK, 3), new Object[] { "###", Character.valueOf('#'), ItemList.aJ });
/*   38:     */     
/*   39:     */ 
/*   40:     */ 
/*   41:     */ 
/*   42:     */ 
/*   43:  49 */     b(new ItemStack(ItemList.book, 1), new Object[] { ItemList.aK, ItemList.aK, ItemList.aK, ItemList.leather });
/*   44:     */     
/*   45:     */ 
/*   46:     */ 
/*   47:     */ 
/*   48:     */ 
/*   49:     */ 
/*   50:  56 */     b(new ItemStack(ItemList.bM, 1), new Object[] { ItemList.book, new ItemStack(ItemList.dye, 1, EnumDyeColor.BLACK.b()), ItemList.G });
/*   51:     */     
/*   52:     */ 
/*   53:     */ 
/*   54:     */ 
/*   55:     */ 
/*   56:  62 */     a(new ItemStack(BlockList.fence, 3), new Object[] { "W#W", "W#W", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.OAK.getIndex()) });
/*   57:     */     
/*   58:     */ 
/*   59:     */ 
/*   60:     */ 
/*   61:     */ 
/*   62:     */ 
/*   63:     */ 
/*   64:  70 */     a(new ItemStack(BlockList.aQ, 3), new Object[] { "W#W", "W#W", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.BIRCH.getIndex()) });
/*   65:     */     
/*   66:     */ 
/*   67:     */ 
/*   68:     */ 
/*   69:     */ 
/*   70:     */ 
/*   71:     */ 
/*   72:  78 */     a(new ItemStack(BlockList.aP, 3), new Object[] { "W#W", "W#W", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.SPRUCE.getIndex()) });
/*   73:     */     
/*   74:     */ 
/*   75:     */ 
/*   76:     */ 
/*   77:     */ 
/*   78:     */ 
/*   79:     */ 
/*   80:  86 */     a(new ItemStack(BlockList.aR, 3), new Object[] { "W#W", "W#W", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.JUNGLE.getIndex()) });
/*   81:     */     
/*   82:     */ 
/*   83:     */ 
/*   84:     */ 
/*   85:     */ 
/*   86:     */ 
/*   87:  93 */     a(new ItemStack(BlockList.aT, 3), new Object[] { "W#W", "W#W", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, 4 + EnumWoodVariant.ACACIA.getIndex() - 4) });
/*   88:     */     
/*   89:     */ 
/*   90:     */ 
/*   91:     */ 
/*   92:     */ 
/*   93:     */ 
/*   94:     */ 
/*   95: 101 */     a(new ItemStack(BlockList.darkOakFence, 3), new Object[] { "W#W", "W#W", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, 4 + EnumWoodVariant.DARK_OAK.getIndex() - 4) });
/*   96:     */     
/*   97:     */ 
/*   98:     */ 
/*   99:     */ 
/*  100:     */ 
/*  101:     */ 
/*  102:     */ 
/*  103: 109 */     a(new ItemStack(BlockList.bZ, 6, EnumCobblestoneVariant.a.a()), new Object[] { "###", "###", Character.valueOf('#'), BlockList.cobblestone });
/*  104:     */     
/*  105:     */ 
/*  106:     */ 
/*  107:     */ 
/*  108:     */ 
/*  109:     */ 
/*  110: 116 */     a(new ItemStack(BlockList.bZ, 6, EnumCobblestoneVariant.b.a()), new Object[] { "###", "###", Character.valueOf('#'), BlockList.Y });
/*  111:     */     
/*  112:     */ 
/*  113:     */ 
/*  114:     */ 
/*  115:     */ 
/*  116:     */ 
/*  117: 123 */     a(new ItemStack(BlockList.bz, 6), new Object[] { "###", "###", Character.valueOf('#'), BlockList.netherBrick });
/*  118:     */     
/*  119:     */ 
/*  120:     */ 
/*  121:     */ 
/*  122:     */ 
/*  123:     */ 
/*  124: 130 */     a(new ItemStack(BlockList.bo, 1), new Object[] { "#W#", "#W#", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.OAK.getIndex()) });
/*  125:     */     
/*  126:     */ 
/*  127:     */ 
/*  128:     */ 
/*  129:     */ 
/*  130:     */ 
/*  131:     */ 
/*  132: 138 */     a(new ItemStack(BlockList.bq, 1), new Object[] { "#W#", "#W#", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.BIRCH.getIndex()) });
/*  133:     */     
/*  134:     */ 
/*  135:     */ 
/*  136:     */ 
/*  137:     */ 
/*  138:     */ 
/*  139:     */ 
/*  140: 146 */     a(new ItemStack(BlockList.bp, 1), new Object[] { "#W#", "#W#", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.SPRUCE.getIndex()) });
/*  141:     */     
/*  142:     */ 
/*  143:     */ 
/*  144:     */ 
/*  145:     */ 
/*  146:     */ 
/*  147:     */ 
/*  148: 154 */     a(new ItemStack(BlockList.br, 1), new Object[] { "#W#", "#W#", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.JUNGLE.getIndex()) });
/*  149:     */     
/*  150:     */ 
/*  151:     */ 
/*  152:     */ 
/*  153:     */ 
/*  154:     */ 
/*  155: 161 */     a(new ItemStack(BlockList.bt, 1), new Object[] { "#W#", "#W#", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, 4 + EnumWoodVariant.ACACIA.getIndex() - 4) });
/*  156:     */     
/*  157:     */ 
/*  158:     */ 
/*  159:     */ 
/*  160:     */ 
/*  161:     */ 
/*  162:     */ 
/*  163: 169 */     a(new ItemStack(BlockList.bs, 1), new Object[] { "#W#", "#W#", Character.valueOf('#'), ItemList.stick, Character.valueOf('W'), new ItemStack(BlockList.planks, 1, 4 + EnumWoodVariant.DARK_OAK.getIndex() - 4) });
/*  164:     */     
/*  165:     */ 
/*  166:     */ 
/*  167:     */ 
/*  168:     */ 
/*  169:     */ 
/*  170:     */ 
/*  171: 177 */     a(new ItemStack(BlockList.aN, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), BlockList.planks, Character.valueOf('X'), ItemList.diamond });
/*  172:     */     
/*  173:     */ 
/*  174:     */ 
/*  175:     */ 
/*  176:     */ 
/*  177:     */ 
/*  178:     */ 
/*  179:     */ 
/*  180: 186 */     a(new ItemStack(ItemList.cn, 2), new Object[] { "~~ ", "~O ", "  ~", Character.valueOf('~'), ItemList.F, Character.valueOf('O'), ItemList.aM });
/*  181:     */     
/*  182:     */ 
/*  183:     */ 
/*  184:     */ 
/*  185:     */ 
/*  186:     */ 
/*  187:     */ 
/*  188:     */ 
/*  189: 195 */     a(new ItemStack(BlockList.B, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), BlockList.planks, Character.valueOf('X'), ItemList.aC });
/*  190:     */     
/*  191:     */ 
/*  192:     */ 
/*  193:     */ 
/*  194:     */ 
/*  195:     */ 
/*  196:     */ 
/*  197:     */ 
/*  198: 204 */     a(new ItemStack(BlockList.bookshelf, 1), new Object[] { "###", "XXX", "###", Character.valueOf('#'), BlockList.planks, Character.valueOf('X'), ItemList.book });
/*  199:     */     
/*  200:     */ 
/*  201:     */ 
/*  202:     */ 
/*  203:     */ 
/*  204:     */ 
/*  205:     */ 
/*  206:     */ 
/*  207: 213 */     a(new ItemStack(BlockList.aJ, 1), new Object[] { "##", "##", Character.valueOf('#'), ItemList.aD });
/*  208:     */     
/*  209:     */ 
/*  210:     */ 
/*  211:     */ 
/*  212:     */ 
/*  213:     */ 
/*  214: 220 */     a(new ItemStack(BlockList.aH, 6), new Object[] { "###", Character.valueOf('#'), BlockList.aJ });
/*  215:     */     
/*  216:     */ 
/*  217:     */ 
/*  218:     */ 
/*  219:     */ 
/*  220: 226 */     a(new ItemStack(BlockList.aL, 1), new Object[] { "##", "##", Character.valueOf('#'), ItemList.aI });
/*  221:     */     
/*  222:     */ 
/*  223:     */ 
/*  224:     */ 
/*  225:     */ 
/*  226:     */ 
/*  227: 233 */     a(new ItemStack(BlockList.V, 1), new Object[] { "##", "##", Character.valueOf('#'), ItemList.aH });
/*  228:     */     
/*  229:     */ 
/*  230:     */ 
/*  231:     */ 
/*  232:     */ 
/*  233:     */ 
/*  234: 240 */     a(new ItemStack(BlockList.glowstone, 1), new Object[] { "##", "##", Character.valueOf('#'), ItemList.aT });
/*  235:     */     
/*  236:     */ 
/*  237:     */ 
/*  238:     */ 
/*  239:     */ 
/*  240:     */ 
/*  241: 247 */     a(new ItemStack(BlockList.cq, 1), new Object[] { "##", "##", Character.valueOf('#'), ItemList.cg });
/*  242:     */     
/*  243:     */ 
/*  244:     */ 
/*  245:     */ 
/*  246:     */ 
/*  247:     */ 
/*  248: 254 */     a(new ItemStack(BlockList.wool, 1), new Object[] { "##", "##", Character.valueOf('#'), ItemList.F });
/*  249:     */     
/*  250:     */ 
/*  251:     */ 
/*  252:     */ 
/*  253:     */ 
/*  254:     */ 
/*  255: 261 */     a(new ItemStack(BlockList.W, 1), new Object[] { "X#X", "#X#", "X#X", Character.valueOf('X'), ItemList.H, Character.valueOf('#'), BlockList.sand });
/*  256:     */     
/*  257:     */ 
/*  258:     */ 
/*  259:     */ 
/*  260:     */ 
/*  261:     */ 
/*  262:     */ 
/*  263:     */ 
/*  264: 270 */     a(new ItemStack(BlockList.U, 6, bbg.d.a()), new Object[] { "###", Character.valueOf('#'), BlockList.cobblestone });
/*  265:     */     
/*  266:     */ 
/*  267:     */ 
/*  268:     */ 
/*  269:     */ 
/*  270: 276 */     a(new ItemStack(BlockList.U, 6, bbg.a.a()), new Object[] { "###", Character.valueOf('#'), new ItemStack(BlockList.stone, EnumStoneVariants.STONE.a()) });
/*  271:     */     
/*  272:     */ 
/*  273:     */ 
/*  274:     */ 
/*  275:     */ 
/*  276: 282 */     a(new ItemStack(BlockList.U, 6, bbg.b.a()), new Object[] { "###", Character.valueOf('#'), BlockList.A });
/*  277:     */     
/*  278:     */ 
/*  279:     */ 
/*  280:     */ 
/*  281:     */ 
/*  282: 288 */     a(new ItemStack(BlockList.U, 6, bbg.e.a()), new Object[] { "###", Character.valueOf('#'), BlockList.V });
/*  283:     */     
/*  284:     */ 
/*  285:     */ 
/*  286:     */ 
/*  287:     */ 
/*  288: 294 */     a(new ItemStack(BlockList.U, 6, bbg.f.a()), new Object[] { "###", Character.valueOf('#'), BlockList.bf });
/*  289:     */     
/*  290:     */ 
/*  291:     */ 
/*  292:     */ 
/*  293:     */ 
/*  294: 300 */     a(new ItemStack(BlockList.U, 6, bbg.g.a()), new Object[] { "###", Character.valueOf('#'), BlockList.netherBrick });
/*  295:     */     
/*  296:     */ 
/*  297:     */ 
/*  298:     */ 
/*  299:     */ 
/*  300: 306 */     a(new ItemStack(BlockList.U, 6, bbg.h.a()), new Object[] { "###", Character.valueOf('#'), BlockList.cq });
/*  301:     */     
/*  302:     */ 
/*  303:     */ 
/*  304:     */ 
/*  305:     */ 
/*  306: 312 */     a(new ItemStack(BlockList.cP, 6, aym.a.a()), new Object[] { "###", Character.valueOf('#'), BlockList.cM });
/*  307:     */     
/*  308:     */ 
/*  309:     */ 
/*  310:     */ 
/*  311:     */ 
/*  312: 318 */     a(new ItemStack(BlockList.bM, 6, 0), new Object[] { "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.OAK.getIndex()) });
/*  313:     */     
/*  314:     */ 
/*  315:     */ 
/*  316:     */ 
/*  317:     */ 
/*  318: 324 */     a(new ItemStack(BlockList.bM, 6, EnumWoodVariant.BIRCH.getIndex()), new Object[] { "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.BIRCH.getIndex()) });
/*  319:     */     
/*  320:     */ 
/*  321:     */ 
/*  322:     */ 
/*  323:     */ 
/*  324: 330 */     a(new ItemStack(BlockList.bM, 6, EnumWoodVariant.SPRUCE.getIndex()), new Object[] { "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.SPRUCE.getIndex()) });
/*  325:     */     
/*  326:     */ 
/*  327:     */ 
/*  328:     */ 
/*  329:     */ 
/*  330: 336 */     a(new ItemStack(BlockList.bM, 6, EnumWoodVariant.JUNGLE.getIndex()), new Object[] { "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.JUNGLE.getIndex()) });
/*  331:     */     
/*  332:     */ 
/*  333:     */ 
/*  334:     */ 
/*  335:     */ 
/*  336: 342 */     a(new ItemStack(BlockList.bM, 6, 4 + EnumWoodVariant.ACACIA.getIndex() - 4), new Object[] { "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, 4 + EnumWoodVariant.ACACIA.getIndex() - 4) });
/*  337:     */     
/*  338:     */ 
/*  339:     */ 
/*  340:     */ 
/*  341:     */ 
/*  342: 348 */     a(new ItemStack(BlockList.bM, 6, 4 + EnumWoodVariant.DARK_OAK.getIndex() - 4), new Object[] { "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, 4 + EnumWoodVariant.DARK_OAK.getIndex() - 4) });
/*  343:     */     
/*  344:     */ 
/*  345:     */ 
/*  346:     */ 
/*  347:     */ 
/*  348: 354 */     a(new ItemStack(BlockList.au, 3), new Object[] { "# #", "###", "# #", Character.valueOf('#'), ItemList.stick });
/*  349:     */     
/*  350:     */ 
/*  351:     */ 
/*  352:     */ 
/*  353:     */ 
/*  354:     */ 
/*  355:     */ 
/*  356: 362 */     a(new ItemStack(ItemList.aq, 3), new Object[] { "##", "##", "##", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.OAK.getIndex()) });
/*  357:     */     
/*  358:     */ 
/*  359:     */ 
/*  360:     */ 
/*  361:     */ 
/*  362:     */ 
/*  363:     */ 
/*  364: 370 */     a(new ItemStack(ItemList.ar, 3), new Object[] { "##", "##", "##", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.SPRUCE.getIndex()) });
/*  365:     */     
/*  366:     */ 
/*  367:     */ 
/*  368:     */ 
/*  369:     */ 
/*  370:     */ 
/*  371:     */ 
/*  372: 378 */     a(new ItemStack(ItemList.as, 3), new Object[] { "##", "##", "##", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.BIRCH.getIndex()) });
/*  373:     */     
/*  374:     */ 
/*  375:     */ 
/*  376:     */ 
/*  377:     */ 
/*  378:     */ 
/*  379:     */ 
/*  380: 386 */     a(new ItemStack(ItemList.at, 3), new Object[] { "##", "##", "##", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.JUNGLE.getIndex()) });
/*  381:     */     
/*  382:     */ 
/*  383:     */ 
/*  384:     */ 
/*  385:     */ 
/*  386:     */ 
/*  387:     */ 
/*  388: 394 */     a(new ItemStack(ItemList.au, 3), new Object[] { "##", "##", "##", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.ACACIA.getIndex()) });
/*  389:     */     
/*  390:     */ 
/*  391:     */ 
/*  392:     */ 
/*  393:     */ 
/*  394:     */ 
/*  395:     */ 
/*  396: 402 */     a(new ItemStack(ItemList.av, 3), new Object[] { "##", "##", "##", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.DARK_OAK.getIndex()) });
/*  397:     */     
/*  398:     */ 
/*  399:     */ 
/*  400:     */ 
/*  401:     */ 
/*  402:     */ 
/*  403:     */ 
/*  404: 410 */     a(new ItemStack(BlockList.bd, 2), new Object[] { "###", "###", Character.valueOf('#'), BlockList.planks });
/*  405:     */     
/*  406:     */ 
/*  407:     */ 
/*  408:     */ 
/*  409:     */ 
/*  410:     */ 
/*  411: 417 */     a(new ItemStack(ItemList.aB, 3), new Object[] { "##", "##", "##", Character.valueOf('#'), ItemList.ironIngot });
/*  412:     */     
/*  413:     */ 
/*  414:     */ 
/*  415:     */ 
/*  416:     */ 
/*  417:     */ 
/*  418:     */ 
/*  419: 425 */     a(new ItemStack(BlockList.cw, 1), new Object[] { "##", "##", Character.valueOf('#'), ItemList.ironIngot });
/*  420:     */     
/*  421:     */ 
/*  422:     */ 
/*  423:     */ 
/*  424:     */ 
/*  425:     */ 
/*  426: 432 */     a(new ItemStack(ItemList.ap, 3), new Object[] { "###", "###", " X ", Character.valueOf('#'), BlockList.planks, Character.valueOf('X'), ItemList.stick });
/*  427:     */     
/*  428:     */ 
/*  429:     */ 
/*  430:     */ 
/*  431:     */ 
/*  432:     */ 
/*  433:     */ 
/*  434:     */ 
/*  435: 441 */     a(new ItemStack(ItemList.aZ, 1), new Object[] { "AAA", "BEB", "CCC", Character.valueOf('A'), ItemList.aG, Character.valueOf('B'), ItemList.aY, Character.valueOf('C'), ItemList.O, Character.valueOf('E'), ItemList.aP });
/*  436:     */     
/*  437:     */ 
/*  438:     */ 
/*  439:     */ 
/*  440:     */ 
/*  441:     */ 
/*  442:     */ 
/*  443:     */ 
/*  444:     */ 
/*  445:     */ 
/*  446: 452 */     a(new ItemStack(ItemList.aY, 1), new Object[] { "#", Character.valueOf('#'), ItemList.aJ });
/*  447:     */     
/*  448:     */ 
/*  449:     */ 
/*  450:     */ 
/*  451:     */ 
/*  452: 458 */     a(new ItemStack(BlockList.planks, 4, EnumWoodVariant.OAK.getIndex()), new Object[] { "#", Character.valueOf('#'), new ItemStack(BlockList.log, 1, EnumWoodVariant.OAK.getIndex()) });
/*  453:     */     
/*  454:     */ 
/*  455:     */ 
/*  456:     */ 
/*  457: 463 */     a(new ItemStack(BlockList.planks, 4, EnumWoodVariant.SPRUCE.getIndex()), new Object[] { "#", Character.valueOf('#'), new ItemStack(BlockList.log, 1, EnumWoodVariant.SPRUCE.getIndex()) });
/*  458:     */     
/*  459:     */ 
/*  460:     */ 
/*  461:     */ 
/*  462: 468 */     a(new ItemStack(BlockList.planks, 4, EnumWoodVariant.BIRCH.getIndex()), new Object[] { "#", Character.valueOf('#'), new ItemStack(BlockList.log, 1, EnumWoodVariant.BIRCH.getIndex()) });
/*  463:     */     
/*  464:     */ 
/*  465:     */ 
/*  466:     */ 
/*  467: 473 */     a(new ItemStack(BlockList.planks, 4, EnumWoodVariant.JUNGLE.getIndex()), new Object[] { "#", Character.valueOf('#'), new ItemStack(BlockList.log, 1, EnumWoodVariant.JUNGLE.getIndex()) });
/*  468:     */     
/*  469:     */ 
/*  470:     */ 
/*  471:     */ 
/*  472: 478 */     a(new ItemStack(BlockList.planks, 4, 4 + EnumWoodVariant.ACACIA.getIndex() - 4), new Object[] { "#", Character.valueOf('#'), new ItemStack(BlockList.log2, 1, EnumWoodVariant.ACACIA.getIndex() - 4) });
/*  473:     */     
/*  474:     */ 
/*  475:     */ 
/*  476:     */ 
/*  477: 483 */     a(new ItemStack(BlockList.planks, 4, 4 + EnumWoodVariant.DARK_OAK.getIndex() - 4), new Object[] { "#", Character.valueOf('#'), new ItemStack(BlockList.log2, 1, EnumWoodVariant.DARK_OAK.getIndex() - 4) });
/*  478:     */     
/*  479:     */ 
/*  480:     */ 
/*  481:     */ 
/*  482:     */ 
/*  483: 489 */     a(new ItemStack(ItemList.stick, 4), new Object[] { "#", "#", Character.valueOf('#'), BlockList.planks });
/*  484:     */     
/*  485:     */ 
/*  486:     */ 
/*  487:     */ 
/*  488:     */ 
/*  489:     */ 
/*  490: 496 */     a(new ItemStack(BlockList.torch, 4), new Object[] { "X", "#", Character.valueOf('X'), ItemList.h, Character.valueOf('#'), ItemList.stick });
/*  491:     */     
/*  492:     */ 
/*  493:     */ 
/*  494:     */ 
/*  495:     */ 
/*  496:     */ 
/*  497:     */ 
/*  498:     */ 
/*  499: 505 */     a(new ItemStack(BlockList.torch, 4), new Object[] { "X", "#", Character.valueOf('X'), new ItemStack(ItemList.h, 1, 1), Character.valueOf('#'), ItemList.stick });
/*  500:     */     
/*  501:     */ 
/*  502:     */ 
/*  503:     */ 
/*  504:     */ 
/*  505:     */ 
/*  506:     */ 
/*  507: 513 */     a(new ItemStack(ItemList.z, 4), new Object[] { "# #", " # ", Character.valueOf('#'), BlockList.planks });
/*  508:     */     
/*  509:     */ 
/*  510:     */ 
/*  511:     */ 
/*  512:     */ 
/*  513:     */ 
/*  514: 520 */     a(new ItemStack(ItemList.bA, 3), new Object[] { "# #", " # ", Character.valueOf('#'), BlockList.w });
/*  515:     */     
/*  516:     */ 
/*  517:     */ 
/*  518:     */ 
/*  519:     */ 
/*  520:     */ 
/*  521: 527 */     a(new ItemStack(BlockList.av, 16), new Object[] { "X X", "X#X", "X X", Character.valueOf('X'), ItemList.ironIngot, Character.valueOf('#'), ItemList.stick });
/*  522:     */     
/*  523:     */ 
/*  524:     */ 
/*  525:     */ 
/*  526:     */ 
/*  527:     */ 
/*  528:     */ 
/*  529:     */ 
/*  530: 536 */     a(new ItemStack(BlockList.D, 6), new Object[] { "X X", "X#X", "XRX", Character.valueOf('X'), ItemList.goldIngot, Character.valueOf('R'), ItemList.aC, Character.valueOf('#'), ItemList.stick });
/*  531:     */     
/*  532:     */ 
/*  533:     */ 
/*  534:     */ 
/*  535:     */ 
/*  536:     */ 
/*  537:     */ 
/*  538:     */ 
/*  539:     */ 
/*  540: 546 */     a(new ItemStack(BlockList.activatorRail, 6), new Object[] { "XSX", "X#X", "XSX", Character.valueOf('X'), ItemList.ironIngot, Character.valueOf('#'), BlockList.aF, Character.valueOf('S'), ItemList.stick });
/*  541:     */     
/*  542:     */ 
/*  543:     */ 
/*  544:     */ 
/*  545:     */ 
/*  546:     */ 
/*  547:     */ 
/*  548:     */ 
/*  549:     */ 
/*  550: 556 */     a(new ItemStack(BlockList.detector_rail, 6), new Object[] { "X X", "X#X", "XRX", Character.valueOf('X'), ItemList.ironIngot, Character.valueOf('R'), ItemList.aC, Character.valueOf('#'), BlockList.az });
/*  551:     */     
/*  552:     */ 
/*  553:     */ 
/*  554:     */ 
/*  555:     */ 
/*  556:     */ 
/*  557:     */ 
/*  558:     */ 
/*  559:     */ 
/*  560: 566 */     a(new ItemStack(ItemList.az, 1), new Object[] { "# #", "###", Character.valueOf('#'), ItemList.ironIngot });
/*  561:     */     
/*  562:     */ 
/*  563:     */ 
/*  564:     */ 
/*  565:     */ 
/*  566:     */ 
/*  567: 573 */     a(new ItemStack(ItemList.bG, 1), new Object[] { "# #", "# #", "###", Character.valueOf('#'), ItemList.ironIngot });
/*  568:     */     
/*  569:     */ 
/*  570:     */ 
/*  571:     */ 
/*  572:     */ 
/*  573:     */ 
/*  574:     */ 
/*  575: 581 */     a(new ItemStack(ItemList.bF, 1), new Object[] { " B ", "###", Character.valueOf('#'), BlockList.cobblestone, Character.valueOf('B'), ItemList.bv });
/*  576:     */     
/*  577:     */ 
/*  578:     */ 
/*  579:     */ 
/*  580:     */ 
/*  581:     */ 
/*  582:     */ 
/*  583: 589 */     a(new ItemStack(BlockList.aZ, 1), new Object[] { "A", "B", Character.valueOf('A'), BlockList.pumpkin, Character.valueOf('B'), BlockList.torch });
/*  584:     */     
/*  585:     */ 
/*  586:     */ 
/*  587:     */ 
/*  588:     */ 
/*  589:     */ 
/*  590:     */ 
/*  591: 597 */     a(new ItemStack(ItemList.aN, 1), new Object[] { "A", "B", Character.valueOf('A'), BlockList.ae, Character.valueOf('B'), ItemList.az });
/*  592:     */     
/*  593:     */ 
/*  594:     */ 
/*  595:     */ 
/*  596:     */ 
/*  597:     */ 
/*  598:     */ 
/*  599: 605 */     a(new ItemStack(ItemList.aO, 1), new Object[] { "A", "B", Character.valueOf('A'), BlockList.al, Character.valueOf('B'), ItemList.az });
/*  600:     */     
/*  601:     */ 
/*  602:     */ 
/*  603:     */ 
/*  604:     */ 
/*  605:     */ 
/*  606:     */ 
/*  607: 613 */     a(new ItemStack(ItemList.ch, 1), new Object[] { "A", "B", Character.valueOf('A'), BlockList.W, Character.valueOf('B'), ItemList.az });
/*  608:     */     
/*  609:     */ 
/*  610:     */ 
/*  611:     */ 
/*  612:     */ 
/*  613:     */ 
/*  614:     */ 
/*  615: 621 */     a(new ItemStack(ItemList.ci, 1), new Object[] { "A", "B", Character.valueOf('A'), BlockList.cp, Character.valueOf('B'), ItemList.az });
/*  616:     */     
/*  617:     */ 
/*  618:     */ 
/*  619:     */ 
/*  620:     */ 
/*  621:     */ 
/*  622:     */ 
/*  623: 629 */     a(new ItemStack(ItemList.aE, 1), new Object[] { "# #", "###", Character.valueOf('#'), BlockList.planks });
/*  624:     */     
/*  625:     */ 
/*  626:     */ 
/*  627:     */ 
/*  628:     */ 
/*  629:     */ 
/*  630: 636 */     a(new ItemStack(ItemList.aw, 1), new Object[] { "# #", " # ", Character.valueOf('#'), ItemList.ironIngot });
/*  631:     */     
/*  632:     */ 
/*  633:     */ 
/*  634:     */ 
/*  635:     */ 
/*  636:     */ 
/*  637: 643 */     a(new ItemStack(ItemList.bQ, 1), new Object[] { "# #", " # ", Character.valueOf('#'), ItemList.aH });
/*  638:     */     
/*  639:     */ 
/*  640:     */ 
/*  641:     */ 
/*  642:     */ 
/*  643:     */ 
/*  644:     */ 
/*  645: 651 */     b(new ItemStack(ItemList.d, 1), new Object[] { new ItemStack(ItemList.ironIngot, 1), new ItemStack(ItemList.ak, 1) });
/*  646:     */     
/*  647:     */ 
/*  648:     */ 
/*  649: 655 */     a(new ItemStack(ItemList.bread, 1), new Object[] { "###", Character.valueOf('#'), ItemList.O });
/*  650:     */     
/*  651:     */ 
/*  652:     */ 
/*  653:     */ 
/*  654:     */ 
/*  655: 661 */     a(new ItemStack(BlockList.ad, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.OAK.getIndex()) });
/*  656:     */     
/*  657:     */ 
/*  658:     */ 
/*  659:     */ 
/*  660:     */ 
/*  661:     */ 
/*  662:     */ 
/*  663: 669 */     a(new ItemStack(BlockList.bV, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.BIRCH.getIndex()) });
/*  664:     */     
/*  665:     */ 
/*  666:     */ 
/*  667:     */ 
/*  668:     */ 
/*  669:     */ 
/*  670:     */ 
/*  671: 677 */     a(new ItemStack(BlockList.bU, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.SPRUCE.getIndex()) });
/*  672:     */     
/*  673:     */ 
/*  674:     */ 
/*  675:     */ 
/*  676:     */ 
/*  677:     */ 
/*  678:     */ 
/*  679: 685 */     a(new ItemStack(BlockList.bW, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, EnumWoodVariant.JUNGLE.getIndex()) });
/*  680:     */     
/*  681:     */ 
/*  682:     */ 
/*  683:     */ 
/*  684:     */ 
/*  685:     */ 
/*  686:     */ 
/*  687: 693 */     a(new ItemStack(BlockList.cC, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, 4 + EnumWoodVariant.ACACIA.getIndex() - 4) });
/*  688:     */     
/*  689:     */ 
/*  690:     */ 
/*  691:     */ 
/*  692:     */ 
/*  693:     */ 
/*  694:     */ 
/*  695: 701 */     a(new ItemStack(BlockList.cD, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(BlockList.planks, 1, 4 + EnumWoodVariant.DARK_OAK.getIndex() - 4) });
/*  696:     */     
/*  697:     */ 
/*  698:     */ 
/*  699:     */ 
/*  700:     */ 
/*  701:     */ 
/*  702:     */ 
/*  703: 709 */     a(new ItemStack(ItemList.fishingRod, 1), new Object[] { "  #", " #X", "# X", Character.valueOf('#'), ItemList.stick, Character.valueOf('X'), ItemList.F });
/*  704:     */     
/*  705:     */ 
/*  706:     */ 
/*  707:     */ 
/*  708:     */ 
/*  709:     */ 
/*  710:     */ 
/*  711:     */ 
/*  712: 718 */     a(new ItemStack(ItemList.bY, 1), new Object[] { "# ", " X", Character.valueOf('#'), ItemList.fishingRod, Character.valueOf('X'), ItemList.carrot }).c();
/*  713:     */     
/*  714:     */ 
/*  715:     */ 
/*  716:     */ 
/*  717:     */ 
/*  718:     */ 
/*  719:     */ 
/*  720: 726 */     a(new ItemStack(BlockList.aw, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), BlockList.cobblestone });
/*  721:     */     
/*  722:     */ 
/*  723:     */ 
/*  724:     */ 
/*  725:     */ 
/*  726:     */ 
/*  727:     */ 
/*  728: 734 */     a(new ItemStack(BlockList.bu, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), BlockList.V });
/*  729:     */     
/*  730:     */ 
/*  731:     */ 
/*  732:     */ 
/*  733:     */ 
/*  734:     */ 
/*  735:     */ 
/*  736: 742 */     a(new ItemStack(BlockList.bv, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), BlockList.bf });
/*  737:     */     
/*  738:     */ 
/*  739:     */ 
/*  740:     */ 
/*  741:     */ 
/*  742:     */ 
/*  743:     */ 
/*  744: 750 */     a(new ItemStack(BlockList.bA, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), BlockList.netherBrick });
/*  745:     */     
/*  746:     */ 
/*  747:     */ 
/*  748:     */ 
/*  749:     */ 
/*  750:     */ 
/*  751:     */ 
/*  752: 758 */     a(new ItemStack(BlockList.bO, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), BlockList.A });
/*  753:     */     
/*  754:     */ 
/*  755:     */ 
/*  756:     */ 
/*  757:     */ 
/*  758:     */ 
/*  759:     */ 
/*  760: 766 */     a(new ItemStack(BlockList.cN, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), BlockList.cM });
/*  761:     */     
/*  762:     */ 
/*  763:     */ 
/*  764:     */ 
/*  765:     */ 
/*  766:     */ 
/*  767:     */ 
/*  768: 774 */     a(new ItemStack(BlockList.cr, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), BlockList.cq });
/*  769:     */     
/*  770:     */ 
/*  771:     */ 
/*  772:     */ 
/*  773:     */ 
/*  774:     */ 
/*  775:     */ 
/*  776: 782 */     a(new ItemStack(ItemList.an, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), ItemList.stick, Character.valueOf('X'), BlockList.wool });
/*  777:     */     
/*  778:     */ 
/*  779:     */ 
/*  780:     */ 
/*  781:     */ 
/*  782:     */ 
/*  783:     */ 
/*  784:     */ 
/*  785: 791 */     a(new ItemStack(ItemList.itemFrame, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), ItemList.stick, Character.valueOf('X'), ItemList.leather });
/*  786:     */     
/*  787:     */ 
/*  788:     */ 
/*  789:     */ 
/*  790:     */ 
/*  791:     */ 
/*  792:     */ 
/*  793:     */ 
/*  794: 800 */     a(new ItemStack(ItemList.ao, 1, 0), new Object[] { "###", "#X#", "###", Character.valueOf('#'), ItemList.goldIngot, Character.valueOf('X'), ItemList.apple });
/*  795:     */     
/*  796:     */ 
/*  797:     */ 
/*  798:     */ 
/*  799:     */ 
/*  800:     */ 
/*  801:     */ 
/*  802:     */ 
/*  803: 809 */     a(new ItemStack(ItemList.ao, 1, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), BlockList.R, Character.valueOf('X'), ItemList.apple });
/*  804:     */     
/*  805:     */ 
/*  806:     */ 
/*  807:     */ 
/*  808:     */ 
/*  809:     */ 
/*  810:     */ 
/*  811:     */ 
/*  812: 818 */     a(new ItemStack(ItemList.bW, 1, 0), new Object[] { "###", "#X#", "###", Character.valueOf('#'), ItemList.goldNugget, Character.valueOf('X'), ItemList.carrot });
/*  813:     */     
/*  814:     */ 
/*  815:     */ 
/*  816:     */ 
/*  817:     */ 
/*  818:     */ 
/*  819:     */ 
/*  820:     */ 
/*  821: 827 */     a(new ItemStack(ItemList.bI, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), ItemList.goldNugget, Character.valueOf('X'), ItemList.bf });
/*  822:     */     
/*  823:     */ 
/*  824:     */ 
/*  825:     */ 
/*  826:     */ 
/*  827:     */ 
/*  828:     */ 
/*  829:     */ 
/*  830: 836 */     a(new ItemStack(BlockList.ay, 1), new Object[] { "X", "#", Character.valueOf('#'), BlockList.cobblestone, Character.valueOf('X'), ItemList.stick });
/*  831:     */     
/*  832:     */ 
/*  833:     */ 
/*  834:     */ 
/*  835:     */ 
/*  836:     */ 
/*  837:     */ 
/*  838: 844 */     a(new ItemStack(BlockList.bR, 2), new Object[] { "I", "S", "#", Character.valueOf('#'), BlockList.planks, Character.valueOf('S'), ItemList.stick, Character.valueOf('I'), ItemList.ironIngot });
/*  839:     */     
/*  840:     */ 
/*  841:     */ 
/*  842:     */ 
/*  843:     */ 
/*  844:     */ 
/*  845:     */ 
/*  846:     */ 
/*  847:     */ 
/*  848: 854 */     a(new ItemStack(BlockList.aF, 1), new Object[] { "X", "#", Character.valueOf('#'), ItemList.stick, Character.valueOf('X'), ItemList.aC });
/*  849:     */     
/*  850:     */ 
/*  851:     */ 
/*  852:     */ 
/*  853:     */ 
/*  854:     */ 
/*  855:     */ 
/*  856: 862 */     a(new ItemStack(ItemList.bb, 1), new Object[] { "#X#", "III", Character.valueOf('#'), BlockList.aF, Character.valueOf('X'), ItemList.aC, Character.valueOf('I'), new ItemStack(BlockList.stone, 1, EnumStoneVariants.STONE.a()) });
/*  857:     */     
/*  858:     */ 
/*  859:     */ 
/*  860:     */ 
/*  861:     */ 
/*  862:     */ 
/*  863:     */ 
/*  864:     */ 
/*  865: 871 */     a(new ItemStack(ItemList.ce, 1), new Object[] { " # ", "#X#", "III", Character.valueOf('#'), BlockList.aF, Character.valueOf('X'), ItemList.cg, Character.valueOf('I'), new ItemStack(BlockList.stone, 1, EnumStoneVariants.STONE.a()) });
/*  866:     */     
/*  867:     */ 
/*  868:     */ 
/*  869:     */ 
/*  870:     */ 
/*  871:     */ 
/*  872:     */ 
/*  873:     */ 
/*  874:     */ 
/*  875: 881 */     a(new ItemStack(ItemList.aS, 1), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), ItemList.goldIngot, Character.valueOf('X'), ItemList.aC });
/*  876:     */     
/*  877:     */ 
/*  878:     */ 
/*  879:     */ 
/*  880:     */ 
/*  881:     */ 
/*  882:     */ 
/*  883:     */ 
/*  884: 890 */     a(new ItemStack(ItemList.aQ, 1), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), ItemList.ironIngot, Character.valueOf('X'), ItemList.aC });
/*  885:     */     
/*  886:     */ 
/*  887:     */ 
/*  888:     */ 
/*  889:     */ 
/*  890:     */ 
/*  891:     */ 
/*  892:     */ 
/*  893: 899 */     a(new ItemStack(ItemList.map, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), ItemList.aK, Character.valueOf('X'), ItemList.aQ });
/*  894:     */     
/*  895:     */ 
/*  896:     */ 
/*  897:     */ 
/*  898:     */ 
/*  899:     */ 
/*  900:     */ 
/*  901:     */ 
/*  902: 908 */     a(new ItemStack(BlockList.aG, 1), new Object[] { "#", Character.valueOf('#'), new ItemStack(BlockList.stone, 1, EnumStoneVariants.STONE.a()) });
/*  903:     */     
/*  904:     */ 
/*  905:     */ 
/*  906:     */ 
/*  907:     */ 
/*  908: 914 */     a(new ItemStack(BlockList.cd, 1), new Object[] { "#", Character.valueOf('#'), BlockList.planks });
/*  909:     */     
/*  910:     */ 
/*  911:     */ 
/*  912:     */ 
/*  913:     */ 
/*  914: 920 */     a(new ItemStack(BlockList.az, 1), new Object[] { "##", Character.valueOf('#'), new ItemStack(BlockList.stone, 1, EnumStoneVariants.STONE.a()) });
/*  915:     */     
/*  916:     */ 
/*  917:     */ 
/*  918:     */ 
/*  919:     */ 
/*  920: 926 */     a(new ItemStack(BlockList.aB, 1), new Object[] { "##", Character.valueOf('#'), BlockList.planks });
/*  921:     */     
/*  922:     */ 
/*  923:     */ 
/*  924:     */ 
/*  925:     */ 
/*  926: 932 */     a(new ItemStack(BlockList.ci, 1), new Object[] { "##", Character.valueOf('#'), ItemList.ironIngot });
/*  927:     */     
/*  928:     */ 
/*  929:     */ 
/*  930:     */ 
/*  931:     */ 
/*  932: 938 */     a(new ItemStack(BlockList.ch, 1), new Object[] { "##", Character.valueOf('#'), ItemList.goldIngot });
/*  933:     */     
/*  934:     */ 
/*  935:     */ 
/*  936:     */ 
/*  937:     */ 
/*  938: 944 */     a(new ItemStack(BlockList.z, 1), new Object[] { "###", "#X#", "#R#", Character.valueOf('#'), BlockList.cobblestone, Character.valueOf('X'), ItemList.bow, Character.valueOf('R'), ItemList.aC });
/*  939:     */     
/*  940:     */ 
/*  941:     */ 
/*  942:     */ 
/*  943:     */ 
/*  944:     */ 
/*  945:     */ 
/*  946:     */ 
/*  947:     */ 
/*  948: 954 */     a(new ItemStack(BlockList.ct, 1), new Object[] { "###", "# #", "#R#", Character.valueOf('#'), BlockList.cobblestone, Character.valueOf('R'), ItemList.aC });
/*  949:     */     
/*  950:     */ 
/*  951:     */ 
/*  952:     */ 
/*  953:     */ 
/*  954:     */ 
/*  955:     */ 
/*  956:     */ 
/*  957: 963 */     a(new ItemStack(BlockList.J, 1), new Object[] { "TTT", "#X#", "#R#", Character.valueOf('#'), BlockList.cobblestone, Character.valueOf('X'), ItemList.ironIngot, Character.valueOf('R'), ItemList.aC, Character.valueOf('T'), BlockList.planks });
/*  958:     */     
/*  959:     */ 
/*  960:     */ 
/*  961:     */ 
/*  962:     */ 
/*  963:     */ 
/*  964:     */ 
/*  965:     */ 
/*  966:     */ 
/*  967:     */ 
/*  968: 974 */     a(new ItemStack(BlockList.F, 1), new Object[] { "S", "P", Character.valueOf('S'), ItemList.aM, Character.valueOf('P'), BlockList.J });
/*  969:     */     
/*  970:     */ 
/*  971:     */ 
/*  972:     */ 
/*  973:     */ 
/*  974:     */ 
/*  975:     */ 
/*  976:     */ 
/*  977: 983 */     a(new ItemStack(ItemList.ba, 1), new Object[] { "###", "XXX", Character.valueOf('#'), BlockList.wool, Character.valueOf('X'), BlockList.planks });
/*  978:     */     
/*  979:     */ 
/*  980:     */ 
/*  981:     */ 
/*  982:     */ 
/*  983:     */ 
/*  984:     */ 
/*  985: 991 */     a(new ItemStack(BlockList.bC, 1), new Object[] { " B ", "D#D", "###", Character.valueOf('#'), BlockList.obsidian, Character.valueOf('B'), ItemList.book, Character.valueOf('D'), ItemList.diamond });
/*  986:     */     
/*  987:     */ 
/*  988:     */ 
/*  989:     */ 
/*  990:     */ 
/*  991:     */ 
/*  992:     */ 
/*  993:     */ 
/*  994:     */ 
/*  995:1001 */     a(new ItemStack(BlockList.cf, 1), new Object[] { "III", " i ", "iii", Character.valueOf('I'), BlockList.S, Character.valueOf('i'), ItemList.ironIngot });
/*  996:     */     
/*  997:     */ 
/*  998:     */ 
/*  999:     */ 
/* 1000:     */ 
/* 1001:     */ 
/* 1002:     */ 
/* 1003:     */ 
/* 1004:1010 */     a(new ItemStack(ItemList.leather), new Object[] { "##", "##", Character.valueOf('#'), ItemList.bs });
/* 1005:     */     
/* 1006:     */ 
/* 1007:     */ 
/* 1008:     */ 
/* 1009:     */ 
/* 1010:1016 */     b(new ItemStack(ItemList.bH, 1), new Object[] { ItemList.bu, ItemList.bD });
/* 1011:     */     
/* 1012:     */ 
/* 1013:     */ 
/* 1014:     */ 
/* 1015:1021 */     b(new ItemStack(ItemList.bL, 3), new Object[] { ItemList.H, ItemList.bD, ItemList.h });
/* 1016:     */     
/* 1017:     */ 
/* 1018:     */ 
/* 1019:     */ 
/* 1020:     */ 
/* 1021:1027 */     b(new ItemStack(ItemList.bL, 3), new Object[] { ItemList.H, ItemList.bD, new ItemStack(ItemList.h, 1, 1) });
/* 1022:     */     
/* 1023:     */ 
/* 1024:     */ 
/* 1025:     */ 
/* 1026:     */ 
/* 1027:1033 */     a(new ItemStack(BlockList.cl), new Object[] { "GGG", "QQQ", "WWW", Character.valueOf('G'), BlockList.w, Character.valueOf('Q'), ItemList.cg, Character.valueOf('W'), BlockList.bM });
/* 1028:     */     
/* 1029:     */ 
/* 1030:     */ 
/* 1031:     */ 
/* 1032:     */ 
/* 1033:     */ 
/* 1034:     */ 
/* 1035:     */ 
/* 1036:     */ 
/* 1037:1043 */     a(new ItemStack(BlockList.cp), new Object[] { "I I", "ICI", " I ", Character.valueOf('I'), ItemList.ironIngot, Character.valueOf('C'), BlockList.ae });
/* 1038:     */     
/* 1039:     */ 
/* 1040:     */ 
/* 1041:     */ 
/* 1042:     */ 
/* 1043:     */ 
/* 1044:     */ 
/* 1045:1051 */     a(new ItemStack(ItemList.armorStand, 1), new Object[] { "///", " / ", "/_/", Character.valueOf('/'), ItemList.stick, Character.valueOf('_'), new ItemStack(BlockList.U, 1, bbg.a.a()) });
/* 1046:     */     
/* 1047:     */ 
/* 1048:     */ 
/* 1049:     */ 
/* 1050:     */ 
/* 1051:     */ 
/* 1052:     */ 
/* 1053:     */ 
/* 1054:     */ 
/* 1055:     */ 
/* 1056:1062 */     Collections.sort(this.b, new aoq(this));
/* 1057:     */   }
/* 1058:     */   
/* 1059:     */   public aos a(ItemStack paramamj, Object... paramVarArgs)
/* 1060:     */   {
/* 1061:1088 */     String str = "";
/* 1062:1089 */     int i = 0;
/* 1063:1090 */     int j = 0;
/* 1064:1091 */     int k = 0;
/* 1065:     */     
/* 1066:1093 */     if ((paramVarArgs[i] instanceof String[]))
/* 1067:     */     {
/* 1068:1094 */       String[] localObject1 = (String[])paramVarArgs[(i++)];
/* 1069:1095 */       for (int m = 0; m < localObject1.length; m++)
/* 1070:     */       {
/* 1071:1096 */         String localObject3 = localObject1[m];
/* 1072:1097 */         k++;
/* 1073:1098 */         j = ((String)localObject3).length();
/* 1074:1099 */         str = str + (String)localObject3;
/* 1075:     */       }
/* 1076:     */     }
/* 1077:     */     else
/* 1078:     */     {
/* 1079:1102 */       while ((paramVarArgs[i] instanceof String))
/* 1080:     */       {
/* 1081:1103 */         String localObject1 = (String)paramVarArgs[(i++)];
/* 1082:1104 */         k++;
/* 1083:1105 */         j = ((String)localObject1).length();
/* 1084:1106 */         str = str + (String)localObject1;
/* 1085:     */       }
/* 1086:     */     }
/* 1087:1110 */     Map<Character,ItemStack> localObject1 = Maps.newHashMap();
/* 1088:1111 */     for (; i < paramVarArgs.length; i += 2)
/* 1089:     */     {
/* 1090:1112 */       Character localObject2 = (Character)paramVarArgs[i];
/* 1091:1113 */       ItemStack localObject3 = null;
/* 1092:1114 */       if ((paramVarArgs[(i + 1)] instanceof Item)) {
/* 1093:1115 */         localObject3 = new ItemStack((Item)paramVarArgs[(i + 1)]);
/* 1094:1116 */       } else if ((paramVarArgs[(i + 1)] instanceof ProtoBlock)) {
/* 1095:1117 */         localObject3 = new ItemStack((ProtoBlock)paramVarArgs[(i + 1)], 1, 32767);
/* 1096:1118 */       } else if ((paramVarArgs[(i + 1)] instanceof ItemStack)) {
/* 1097:1119 */         localObject3 = (ItemStack)paramVarArgs[(i + 1)];
/* 1098:     */       }
/* 1099:1121 */       localObject1.put(localObject2, localObject3);
/* 1100:     */     }
/* 1101:1124 */     ItemStack[] localObject2 = new ItemStack[j * k];
/* 1102:1126 */     for (int n = 0; n < j * k; n++)
/* 1103:     */     {
/* 1104:1127 */       char c = str.charAt(n);
/* 1105:1128 */       if ((localObject1).containsKey(Character.valueOf(c))) {
/* 1106:1129 */         localObject2[n] = ((ItemStack)((Map)localObject1).get(Character.valueOf(c))).k();
/* 1107:     */       } else {
/* 1108:1131 */         localObject2[n] = null;
/* 1109:     */       }
/* 1110:     */     }
/* 1111:1134 */     aos localaos = new aos(j, k, (ItemStack[])localObject2, paramamj);
/* 1112:1135 */     this.b.add(localaos);
/* 1113:1136 */     return localaos;
/* 1114:     */   }
/* 1115:     */   
/* 1116:     */   public void b(ItemStack paramamj, Object... paramVarArgs)
/* 1117:     */   {
/* 1118:1140 */     ArrayList localArrayList = Lists.newArrayList();
/* 1119:1142 */     for (Object localObject : paramVarArgs) {
/* 1120:1143 */       if ((localObject instanceof ItemStack)) {
/* 1121:1144 */         localArrayList.add(((ItemStack)localObject).k());
/* 1122:1145 */       } else if ((localObject instanceof Item)) {
/* 1123:1146 */         localArrayList.add(new ItemStack((Item)localObject));
/* 1124:1147 */       } else if ((localObject instanceof ProtoBlock)) {
/* 1125:1148 */         localArrayList.add(new ItemStack((ProtoBlock)localObject));
/* 1126:     */       } else {
/* 1127:1150 */         throw new IllegalArgumentException("Invalid shapeless recipe: unknown type " + localObject.getClass().getName() + "!");
/* 1128:     */       }
/* 1129:     */     }
/* 1130:1154 */     this.b.add(new aot(paramamj, localArrayList));
/* 1131:     */   }
/* 1132:     */   
/* 1133:     */   public void a(aoo paramaoo)
/* 1134:     */   {
/* 1135:1158 */     this.b.add(paramaoo);
/* 1136:     */   }
/* 1137:     */   
/* 1138:     */   public ItemStack a(ain paramain, World paramaqu)
/* 1139:     */   {
/* 1140:1163 */     for (aoo localaoo : this.b) {
/* 1141:1164 */       if (localaoo.a(paramain, paramaqu)) {
/* 1142:1165 */         return localaoo.a(paramain);
/* 1143:     */       }
/* 1144:     */     }
/* 1145:1169 */     return null;
/* 1146:     */   }
/* 1147:     */   
/* 1148:     */   public ItemStack[] b(ain paramain, World paramaqu)
/* 1149:     */   {
/* 1150:1173 */     for (Object localObject = this.b.iterator(); ((Iterator)localObject).hasNext();)
/* 1151:     */     {
/* 1152:1173 */       aoo localaoo = (aoo)((Iterator)localObject).next();
/* 1153:1174 */       if (localaoo.a(paramain, paramaqu)) {
/* 1154:1175 */         return localaoo.b(paramain);
/* 1155:     */       }
/* 1156:     */     }
/* 1157:1179 */     ItemStack[] localObject = new ItemStack[paramain.getSize()];
/* 1158:1180 */     for (int i = 0; i < localObject.length; i++) {
/* 1159:1181 */       localObject[i] = paramain.get(i);
/* 1160:     */     }
/* 1161:1183 */     return localObject;
/* 1162:     */   }
/* 1163:     */   
/* 1164:     */   public List b()
/* 1165:     */   {
/* 1166:1187 */     return this.b;
/* 1167:     */   }
/* 1168:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aop
 * JD-Core Version:    0.7.0.1
 */