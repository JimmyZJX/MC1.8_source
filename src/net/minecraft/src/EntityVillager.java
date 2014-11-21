package net.minecraft.src;
/*    1:     */ import java.util.Iterator;
/*    4:     */ 
/*    5:     */ public class EntityVillager
/*    6:     */   extends EntityPassiveMob
/*    7:     */   implements ago, aqb
/*    8:     */ {
/*    9:     */   private int bl;
/*   10:     */   private boolean bm;
/*   11:     */   private boolean bn;
/*   12:     */   Village bk;
/*   13:     */   private EntityPlayer bo;
/*   14:     */   private aqd offers;
/*   15:     */   private int bq;
/*   16:     */   private boolean br;
/*   17:     */   private boolean willing;
/*   18:     */   private int riches;
/*   19:     */   private String bu;
/*   20:     */   private int career;
/*   21:     */   private int careerLevel;
/*   22:     */   private boolean bx;
/*   23:     */   private boolean by;
/*   24:  83 */   private wa inventory = new wa("Items", false, 8);
/*   25:     */   
/*   26:     */   public EntityVillager(World paramaqu)
/*   27:     */   {
/*   28:  89 */     this(paramaqu, 0);
/*   29:     */   }
/*   30:     */   
/*   31:     */   public EntityVillager(World paramaqu, int paramInt)
/*   32:     */   {
/*   33:  93 */     super(paramaqu);
/*   34:  94 */     setProfession(paramInt);
/*   35:  95 */     a(0.6F, 1.8F);
/*   36:     */     
/*   37:  97 */     ((aay)s()).b(true);
/*   38:  98 */     ((aay)s()).a(true);
/*   39:     */     
/*   40: 100 */     this.i.a(0, new yy(this));
/*   41: 101 */     this.i.a(1, new yp(this, new agq(this), 8.0F, 0.6D, 0.6D));
/*   42:     */     
/*   43:     */ 
/*   44:     */ 
/*   45:     */ 
/*   46:     */ 
/*   47: 107 */     this.i.a(1, new aah(this));
/*   48: 108 */     this.i.a(1, new zi(this));
/*   49: 109 */     this.i.a(2, new zl(this));
/*   50: 110 */     this.i.a(3, new aaa(this));
/*   51: 111 */     this.i.a(4, new zt(this, true));
/*   52: 112 */     this.i.a(5, new zo(this, 0.6D));
/*   53: 113 */     this.i.a(6, new VillagerProposal(this));
/*   54: 114 */     this.i.a(7, new aaf(this));
/*   55: 115 */     this.i.a(9, new zf(this, EntityPlayer.class, 3.0F, 1.0F));
/*   56: 116 */     this.i.a(9, new aai(this));
/*   57: 117 */     this.i.a(9, new zy(this, 0.6D));
/*   58: 118 */     this.i.a(10, new zh(this, EntityMob.class, 8.0F));
/*   59:     */     
/*   60: 120 */     j(true);
/*   61:     */   }
/*   62:     */   
/*   63:     */   private void ct()
/*   64:     */   {
/*   65: 127 */     if (this.by) {
/*   66: 128 */       return;
/*   67:     */     }
/*   68: 130 */     this.by = true;
/*   69: 132 */     if (i_()) {
/*   70: 133 */       this.i.a(8, new zv(this, 0.32D));
/*   71: 134 */     } else if (getProfession() == 0) {
/*   72: 135 */       this.i.a(6, new ze(this, 0.6D));
/*   73:     */     }
/*   74:     */   }
/*   75:     */   
/*   76:     */   protected void n()
/*   77:     */   {
/*   78: 141 */     if (getProfession() == 0) {
/*   79: 142 */       this.i.a(8, new ze(this, 0.6D));
/*   80:     */     }
/*   81: 145 */     super.n();
/*   82:     */   }
/*   83:     */   
/*   84:     */   protected void aW()
/*   85:     */   {
/*   86: 150 */     super.aW();
/*   87:     */     
/*   88: 152 */     a(afs.d).a(0.5D);
/*   89:     */   }
/*   90:     */   
/*   91:     */   protected void E()
/*   92:     */   {
/*   93:     */     
/*   94:     */     
/*   95: 157 */     if (--this.bl <= 0)
/*   96:     */     {
/*   97: 158 */       BlockPosition pos = new BlockPosition(this);
/*   98: 159 */       this.world.getVillageManager().queueVillager(pos);
/*   99: 160 */       this.bl = (70 + this.rng.nextInt(50));
/*  100:     */       
/*  101: 162 */       this.bk = this.world.getVillageManager().getNearestVillage(pos, 32);
/*  102: 163 */       if (this.bk == null)
/*  103:     */       {
/*  104: 164 */         ch();
/*  105:     */       }
/*  106:     */       else
/*  107:     */       {
/*  108: 166 */         BlockPosition pos1 = this.bk.a();
/*  109: 167 */         a(pos1, (int)(this.bk.b() * 1.0F));
/*  110: 169 */         if (this.bx)
/*  111:     */         {
/*  112: 170 */           this.bx = false;
/*  113: 171 */           this.bk.b(5);
/*  114:     */         }
/*  115:     */       }
/*  116:     */     }
/*  117: 175 */     if ((!cm()) && (this.bq > 0))
/*  118:     */     {
/*  119: 176 */       this.bq -= 1;
/*  120: 177 */       if (this.bq <= 0)
/*  121:     */       {
/*  122: 178 */         if (this.br)
/*  123:     */         {
/*  124: 180 */           for (Iterator<TradeOffer> it = this.offers.iterator(); it.hasNext();)
/*  125:     */           {
/*  126: 180 */             TradeOffer entry = it.next();
/*  127: 181 */             if (entry.isBlocked()) {
/*  128: 182 */               entry.extendUses(this.rng.nextInt(6) + this.rng.nextInt(6) + 2);
/*  129:     */             }
/*  130:     */           }
/*  131: 186 */           cu();
/*  132: 187 */           this.br = false;
/*  133: 189 */           if ((this.bk != null) && (this.bu != null))
/*  134:     */           {
/*  135: 190 */             this.world.sendSignal(this, (byte)14);
/*  136: 191 */             this.bk.a(this.bu, 1);
/*  137:     */           }
/*  138:     */         }
/*  139: 194 */         c(new PotionEffect(Potion.regeneration.id, 200, 0));
/*  140:     */       }
/*  141:     */     }
/*  142: 198 */     super.E();
/*  143:     */   }
/*  144:     */   
/*  145:     */   public boolean onRightClick(EntityPlayer player)
/*  146:     */   {
/*  147: 204 */     ItemStack stack = player.bg.h();
/*  148: 205 */     int usingEgg = (stack != null) && (stack.getItem() == ItemList.spawnEgg) ? 1 : 0;
/*  149: 207 */     if ((usingEgg == 0) && (ai()) && (!cm()) && (!i_()))
/*  150:     */     {
/*  151: 208 */       if ((!this.world.isClient) && ((this.offers == null) || (this.offers.size() > 0)))
/*  152:     */       {
/*  153: 210 */         a_(player);
/*  154: 211 */         player.a((aqb)this);
/*  155:     */       }
/*  156: 213 */       player.b(StatList.talkedToVillager);
/*  157: 214 */       return true;
/*  158:     */     }
/*  159: 216 */     return super.onRightClick(player);
/*  160:     */   }
/*  161:     */   
/*  162:     */   protected void h()
/*  163:     */   {
/*  164: 221 */     super.h();
/*  165: 222 */     this.ac.a(16, Integer.valueOf(0));
/*  166:     */   }
/*  167:     */   
/*  168:     */   public void writeEntityToNBT(NBTTagCompound tag)
/*  169:     */   {
/*  170: 227 */     super.writeEntityToNBT(tag);
/*  171: 228 */     tag.setInt("Profession", getProfession());
/*  172: 229 */     tag.setInt("Riches", this.riches);
/*  173: 230 */     tag.setInt("Career", this.career);
/*  174: 231 */     tag.setInt("CareerLevel", this.careerLevel);
/*  175: 232 */     tag.setBoolean("Willing", this.willing);
/*  176: 233 */     if (this.offers != null) {
/*  177: 234 */       tag.setNBT("Offers", this.offers.a());
/*  178:     */     }
/*  179: 236 */     fv localfv = new fv();
/*  180: 237 */     for (int i = 0; i < this.inventory.getSize(); i++)
/*  181:     */     {
/*  182: 238 */       ItemStack localamj = this.inventory.get(i);
/*  183: 239 */       if (localamj != null) {
/*  184: 240 */         localfv.a(localamj.writeToNBT(new NBTTagCompound()));
/*  185:     */       }
/*  186:     */     }
/*  187: 243 */     tag.setNBT("Inventory", localfv);
/*  188:     */   }
/*  189:     */   
/*  190:     */   public void readEntityFromNBT(NBTTagCompound tag)
/*  191:     */   {
/*  192: 248 */     super.readEntityFromNBT(tag);
/*  193: 249 */     setProfession(tag.getInteger("Profession"));
/*  194: 250 */     this.riches = tag.getInteger("Riches");
/*  195: 251 */     this.career = tag.getInteger("Career");
/*  196: 252 */     this.careerLevel = tag.getInteger("CareerLevel");
/*  197: 253 */     this.willing = tag.getBoolean("Willing");
/*  198: 254 */     if (tag.hasKey("Offers", 10))
/*  199:     */     {
/*  200: 255 */       NBTTagCompound localObject = tag.getCompoundTag("Offers");
/*  201: 256 */       this.offers = new aqd((NBTTagCompound)localObject);
/*  202:     */     }
/*  203: 258 */     fv localObject = tag.c("Inventory", 10);
/*  204: 259 */     for (int i = 0; i < localObject.c(); i++)
/*  205:     */     {
/*  206: 260 */       ItemStack stack = ItemStack.loadItemStackFromNBT(localObject.b(i));
/*  207: 261 */       if (stack != null) {
/*  208: 262 */         this.inventory.add(stack);
/*  209:     */       }
/*  210:     */     }
/*  211: 266 */     j(true);
/*  212: 267 */     ct();
/*  213:     */   }
/*  214:     */   
/*  215:     */   protected boolean C()
/*  216:     */   {
/*  217: 272 */     return false;
/*  218:     */   }
/*  219:     */   
/*  220:     */   protected String z()
/*  221:     */   {
/*  222: 277 */     if (cm()) {
/*  223: 278 */       return "mob.villager.haggle";
/*  224:     */     }
/*  225: 280 */     return "mob.villager.idle";
/*  226:     */   }
/*  227:     */   
/*  228:     */   protected String bn()
/*  229:     */   {
/*  230: 285 */     return "mob.villager.hit";
/*  231:     */   }
/*  232:     */   
/*  233:     */   protected String bo()
/*  234:     */   {
/*  235: 290 */     return "mob.villager.death";
/*  236:     */   }
/*  237:     */   
/*  238:     */   public void setProfession(int paramInt)
/*  239:     */   {
/*  240: 294 */     this.ac.b(16, Integer.valueOf(paramInt));
/*  241:     */   }
/*  242:     */   
/*  243:     */   public int getProfession()
/*  244:     */   {
/*  245: 298 */     return Math.max(this.ac.c(16) % 5, 0);
/*  246:     */   }
/*  247:     */   
/*  248:     */   public boolean ck()
/*  249:     */   {
/*  250: 302 */     return this.bm;
/*  251:     */   }
/*  252:     */   
/*  253:     */   public void l(boolean paramBoolean)
/*  254:     */   {
/*  255: 306 */     this.bm = paramBoolean;
/*  256:     */   }
/*  257:     */   
/*  258:     */   public void m(boolean paramBoolean)
/*  259:     */   {
/*  260: 310 */     this.bn = paramBoolean;
/*  261:     */   }
/*  262:     */   
/*  263:     */   public boolean cl()
/*  264:     */   {
/*  265: 314 */     return this.bn;
/*  266:     */   }
/*  267:     */   
/*  268:     */   public void b(EntityLiving paramxm)
/*  269:     */   {
/*  270: 319 */     super.b(paramxm);
/*  271: 320 */     if ((this.bk != null) && (paramxm != null))
/*  272:     */     {
/*  273: 321 */       this.bk.a(paramxm);
/*  274: 323 */       if ((paramxm instanceof EntityPlayer))
/*  275:     */       {
/*  276: 324 */         int i = -1;
/*  277: 325 */         if (i_()) {
/*  278: 326 */           i = -3;
/*  279:     */         }
/*  280: 328 */         this.bk.a(paramxm.getName(), i);
/*  281: 329 */         if (ai()) {
/*  282: 330 */           this.world.sendSignal(this, (byte)13);
/*  283:     */         }
/*  284:     */       }
/*  285:     */     }
/*  286:     */   }
/*  287:     */   
/*  288:     */   public void a(DamageSource paramwh)
/*  289:     */   {
/*  290: 338 */     if (this.bk != null)
/*  291:     */     {
/*  292: 339 */       Entity localwv = paramwh.j();
/*  293: 340 */       if (localwv != null)
/*  294:     */       {
/*  295: 341 */         if ((localwv instanceof EntityPlayer)) {
/*  296: 342 */           this.bk.a(localwv.getName(), -2);
/*  297: 343 */         } else if ((localwv instanceof aex)) {
/*  298: 344 */           this.bk.h();
/*  299:     */         }
/*  300:     */       }
/*  301:     */       else
/*  302:     */       {
/*  303: 349 */         EntityPlayer localahd = this.world.a(this, 16.0D);
/*  304: 350 */         if (localahd != null) {
/*  305: 351 */           this.bk.h();
/*  306:     */         }
/*  307:     */       }
/*  308:     */     }
/*  309: 356 */     super.a(paramwh);
/*  310:     */   }
/*  311:     */   
/*  312:     */   public void a_(EntityPlayer paramahd)
/*  313:     */   {
/*  314: 361 */     this.bo = paramahd;
/*  315:     */   }
/*  316:     */   
/*  317:     */   public EntityPlayer u_()
/*  318:     */   {
/*  319: 366 */     return this.bo;
/*  320:     */   }
/*  321:     */   
/*  322:     */   public boolean cm()
/*  323:     */   {
/*  324: 370 */     return this.bo != null;
/*  325:     */   }
/*  326:     */   
/*  327:     */   public boolean testWilling(boolean paramBoolean)
/*  328:     */   {
/*  329: 374 */     if ((!this.willing) && (paramBoolean) && (cp()))
/*  330:     */     {
/*  331: 375 */       int flag = 0;
/*  332: 377 */       for (int j = 0; j < this.inventory.getSize(); j++)
/*  333:     */       {
/*  334: 378 */         ItemStack stack = this.inventory.get(j);
/*  335: 379 */         if (stack != null) {
/*  336: 380 */           if ((stack.getItem() == ItemList.bread) && (stack.stackSize >= 3))
/*  337:     */           {
/*  338: 381 */             flag = 1;
/*  339: 382 */             this.inventory.removeItems(j, 3);
/*  340:     */           }
/*  341: 383 */           else if (((stack.getItem() == ItemList.potato) || (stack.getItem() == ItemList.carrot)) && (stack.stackSize >= 12))
/*  342:     */           {
/*  343: 384 */             flag = 1;
/*  344: 385 */             this.inventory.removeItems(j, 12);
/*  345:     */           }
/*  346:     */         }
/*  347: 388 */         if (flag != 0)
/*  348:     */         {
/*  349: 389 */           this.world.sendSignal(this, (byte)18);
/*  350: 390 */           this.willing = true;
/*  351: 391 */           break;
/*  352:     */         }
/*  353:     */       }
/*  354:     */     }
/*  355: 396 */     return this.willing;
/*  356:     */   }
/*  357:     */   
/*  358:     */   public void setWilling(boolean willing)
/*  359:     */   {
/*  360: 400 */     this.willing = willing;
/*  361:     */   }
/*  362:     */   
/*  363:     */   public void a(TradeOffer paramaqc)
/*  364:     */   {
/*  365: 405 */     paramaqc.onUse();
/*  366: 406 */     this.a_ = (-w());
/*  367: 407 */     a("mob.villager.yes", bA(), bB());
/*  368:     */     
/*  369: 409 */     int i = 3 + this.rng.nextInt(4);
/*  370: 412 */     if ((paramaqc.getUses() == 1) || (this.rng.nextInt(5) == 0))
/*  371:     */     {
/*  372: 413 */       this.bq = 40;
/*  373: 414 */       this.br = true;
/*  374: 415 */       this.willing = true;
/*  375: 416 */       if (this.bo != null) {
/*  376: 417 */         this.bu = this.bo.getName();
/*  377:     */       } else {
/*  378: 419 */         this.bu = null;
/*  379:     */       }
/*  380: 421 */       i += 5;
/*  381:     */     }
/*  382: 423 */     if (paramaqc.getItemBought().getItem() == ItemList.emerald) {
/*  383: 424 */       this.riches += paramaqc.getItemBought().stackSize;
/*  384:     */     }
/*  385: 427 */     if (paramaqc.getRewardExp()) {
/*  386: 428 */       this.world.spawnEntity(new EntityExperienceOrb(this.world, this.xPos, this.yPos + 0.5D, this.zPos, i));
/*  387:     */     }
/*  388:     */   }
/*  389:     */   
/*  390:     */   public void a_(ItemStack paramamj)
/*  391:     */   {
/*  392: 434 */     if ((!this.world.isClient) && (this.a_ > -w() + 20))
/*  393:     */     {
/*  394: 435 */       this.a_ = (-w());
/*  395: 436 */       if (paramamj != null) {
/*  396: 437 */         a("mob.villager.yes", bA(), bB());
/*  397:     */       } else {
/*  398: 439 */         a("mob.villager.no", bA(), bB());
/*  399:     */       }
/*  400:     */     }
/*  401:     */   }
/*  402:     */   
/*  403:     */   public aqd b_(EntityPlayer paramahd)
/*  404:     */   {
/*  405: 446 */     if (this.offers == null) {
/*  406: 447 */       cu();
/*  407:     */     }
/*  408: 449 */     return this.offers;
/*  409:     */   }
/*  410:     */   
/*  411:     */   private void cu()
/*  412:     */   {
/*  413: 453 */     agw[][][] arrayOfagw = bA[getProfession()];
/*  414: 455 */     if ((this.career == 0) || (this.careerLevel == 0))
/*  415:     */     {
/*  416: 457 */       this.career = (this.rng.nextInt(arrayOfagw.length) + 1);
/*  417: 458 */       this.careerLevel = 1;
/*  418:     */     }
/*  419:     */     else
/*  420:     */     {
/*  421: 460 */       this.careerLevel += 1;
/*  422:     */     }
/*  423: 463 */     if (this.offers == null) {
/*  424: 464 */       this.offers = new aqd();
/*  425:     */     }
/*  426: 467 */     int i = this.career - 1;
/*  427: 468 */     int j = this.careerLevel - 1;
/*  428:     */     
/*  429: 470 */     agw[][] arrayOfagw1 = arrayOfagw[i];
/*  430: 471 */     if (j < arrayOfagw1.length)
/*  431:     */     {
/*  432: 472 */       agw[] arrayOfagw2 = arrayOfagw1[j];
/*  433: 473 */       for (agw localagw : arrayOfagw2) {
/*  434: 474 */         localagw.a(this.offers, this.rng);
/*  435:     */       }
/*  436:     */     }
/*  437:     */   }
/*  438:     */   
/*  439:     */   public void a(aqd paramaqd) {}
/*  440:     */   
/*  441:     */   public ho e_()
/*  442:     */   {
/*  443: 485 */     String str1 = aL();
/*  444: 486 */     if ((str1 != null) && (str1.length() > 0)) {
/*  445: 487 */       return new hy(str1);
/*  446:     */     }
/*  447: 490 */     if (this.offers == null) {
/*  448: 492 */       cu();
/*  449:     */     }
/*  450: 495 */     String str2 = null;
/*  451: 496 */     switch (getProfession())
/*  452:     */     {
/*  453:     */     case 0: 
/*  454: 498 */       if (this.career == 1) {
/*  455: 499 */         str2 = "farmer";
/*  456: 500 */       } else if (this.career == 2) {
/*  457: 501 */         str2 = "fisherman";
/*  458: 502 */       } else if (this.career == 3) {
/*  459: 503 */         str2 = "shepherd";
/*  460: 504 */       } else if (this.career == 4) {
/*  461: 505 */         str2 = "fletcher";
/*  462:     */       }
/*  463:     */       break;
/*  464:     */     case 1: 
/*  465: 510 */       str2 = "librarian";
/*  466:     */       
/*  467: 512 */       break;
/*  468:     */     case 2: 
/*  469: 514 */       str2 = "cleric";
/*  470:     */       
/*  471: 516 */       break;
/*  472:     */     case 3: 
/*  473: 518 */       if (this.career == 1) {
/*  474: 519 */         str2 = "armor";
/*  475: 520 */       } else if (this.career == 2) {
/*  476: 521 */         str2 = "weapon";
/*  477: 522 */       } else if (this.career == 3) {
/*  478: 523 */         str2 = "tool";
/*  479:     */       }
/*  480:     */       break;
/*  481:     */     case 4: 
/*  482: 528 */       if (this.career == 1) {
/*  483: 529 */         str2 = "butcher";
/*  484: 530 */       } else if (this.career == 2) {
/*  485: 531 */         str2 = "leather";
/*  486:     */       }
/*  487:     */       break;
/*  488:     */     }
/*  489: 537 */     if (str2 != null)
/*  490:     */     {
/*  491: 538 */       hz localhz = new hz("entity.Villager." + str2, new Object[0]);
/*  492: 539 */       localhz.b().a(aP());
/*  493: 540 */       localhz.b().a(getUUID().toString());
/*  494: 541 */       return localhz;
/*  495:     */     }
/*  496: 544 */     return super.e_();
/*  497:     */   }
/*  498:     */   
/*  499:     */   public float aR()
/*  500:     */   {
/*  501: 549 */     float f = 1.62F;
/*  502: 550 */     if (i_()) {
/*  503: 551 */       f = (float)(f - 0.8100000000000001D);
/*  504:     */     }
/*  505: 553 */     return f;
/*  506:     */   }
/*  507:     */   
/*  508: 557 */   private static final agw[][][][] bA = { { { { new agr(ItemList.O, new agx(18, 22)), new agr(ItemList.potato, new agx(15, 19)), new agr(ItemList.carrot, new agx(15, 19)), new agv(ItemList.bread, new agx(-4, -2)) }, { new agr(Item.fromProtoBlock(BlockList.pumpkin), new agx(8, 13)), new agv(ItemList.ca, new agx(-3, -2)) }, { new agr(Item.fromProtoBlock(BlockList.bk), new agx(7, 12)), new agv(ItemList.apple, new agx(-5, -7)) }, { new agv(ItemList.bc, new agx(-6, -10)), new agv(ItemList.aZ, new agx(1, 1)) } }, { { new agr(ItemList.F, new agx(15, 20)), new agr(ItemList.h, new agx(16, 24)), new agu(ItemList.fish, new agx(6, 6), ItemList.aV, new agx(6, 6)) }, { new agt(ItemList.fishingRod, new agx(7, 8)) } }, { { new agr(Item.fromProtoBlock(BlockList.wool), new agx(16, 22)), new agv(ItemList.be, new agx(3, 4)) }, { new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 0), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 1), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 2), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 3), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 4), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 5), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 6), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 7), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 8), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 9), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 10), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 11), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 12), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 13), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 14), new agx(1, 2)), new agv(new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 15), new agx(1, 2)) } }, { { new agr(ItemList.F, new agx(15, 20)), new agv(ItemList.g, new agx(-12, -8)) }, { new agv(ItemList.f, new agx(2, 3)), new agu(Item.fromProtoBlock(BlockList.gravel), new agx(10, 10), ItemList.ak, new agx(6, 10)) } } }, { { { new agr(ItemList.aK, new agx(24, 36)), new ags() }, { new agr(ItemList.book, new agx(8, 10)), new agv(ItemList.aQ, new agx(10, 12)), new agv(Item.fromProtoBlock(BlockList.bookshelf), new agx(3, 4)) }, { new agr(ItemList.bN, new agx(2, 2)), new agv(ItemList.aS, new agx(10, 12)), new agv(Item.fromProtoBlock(BlockList.w), new agx(-5, -3)) }, { new ags() }, { new ags() }, { new agv(ItemList.nameTag, new agx(20, 22)) } } }, { { { new agr(ItemList.bt, new agx(36, 40)), new agr(ItemList.k, new agx(8, 10)) }, { new agv(ItemList.aC, new agx(-4, -1)), new agv(new ItemStack(ItemList.dye, 1, EnumDyeColor.BLUE.b()), new agx(-2, -1)) }, { new agv(ItemList.bH, new agx(7, 11)), new agv(Item.fromProtoBlock(BlockList.glowstone), new agx(-3, -1)) }, { new agv(ItemList.bK, new agx(3, 11)) } } }, { { { new agr(ItemList.h, new agx(16, 24)), new agv(ItemList.Y, new agx(4, 6)) }, { new agr(ItemList.j, new agx(7, 9)), new agv(ItemList.Z, new agx(10, 14)) }, { new agr(ItemList.diamond, new agx(3, 4)), new agt(ItemList.ad, new agx(16, 19)) }, { new agv(ItemList.X, new agx(5, 7)), new agv(ItemList.W, new agx(9, 11)), new agv(ItemList.U, new agx(5, 7)), new agv(ItemList.V, new agx(11, 15)) } }, { { new agr(ItemList.h, new agx(16, 24)), new agv(ItemList.c, new agx(6, 8)) }, { new agr(ItemList.j, new agx(7, 9)), new agt(ItemList.l, new agx(9, 10)) }, { new agr(ItemList.diamond, new agx(3, 4)), new agt(ItemList.u, new agx(12, 15)), new agt(ItemList.x, new agx(9, 12)) } }, { { new agr(ItemList.h, new agx(16, 24)), new agt(ItemList.a, new agx(5, 7)) }, { new agr(ItemList.j, new agx(7, 9)), new agt(ItemList.b, new agx(9, 11)) }, { new agr(ItemList.diamond, new agx(3, 4)), new agt(ItemList.w, new agx(12, 15)) } } }, { { { new agr(ItemList.al, new agx(14, 18)), new agr(ItemList.bk, new agx(14, 18)) }, { new agr(ItemList.h, new agx(16, 24)), new agv(ItemList.am, new agx(-7, -5)), new agv(ItemList.bl, new agx(-8, -6)) } }, { { new agr(ItemList.leather, new agx(9, 12)), new agv(ItemList.S, new agx(2, 4)) }, { new agt(ItemList.R, new agx(7, 12)) }, { new agv(ItemList.saddle, new agx(8, 10)) } } } };
/*  509:     */   
/*  510:     */   public void onSignal(byte signal)
/*  511:     */   {
/*  512: 911 */     if (signal == 12) {
/*  513: 912 */       showParticle(EnumParticleEffect.HEART);
/*  514: 913 */     } else if (signal == 13) {
/*  515: 914 */       showParticle(EnumParticleEffect.VILLAGER_ANGRY);
/*  516: 915 */     } else if (signal == 14) {
/*  517: 916 */       showParticle(EnumParticleEffect.VILLAGER_HAPPY);
/*  518:     */     } else {
/*  519: 918 */       super.onSignal(signal);
/*  520:     */     }
/*  521:     */   }
/*  522:     */   
/*  523:     */   private void showParticle(EnumParticleEffect paramew)
/*  524:     */   {
/*  525: 923 */     for (int i = 0; i < 5; i++)
/*  526:     */     {
/*  527: 924 */       double d1 = this.rng.nextGaussian() * 0.02D;
/*  528: 925 */       double d2 = this.rng.nextGaussian() * 0.02D;
/*  529: 926 */       double d3 = this.rng.nextGaussian() * 0.02D;
/*  530: 927 */       this.world.a(paramew, this.xPos + this.rng.nextFloat() * this.width * 2.0F - this.width, this.yPos + 1.0D + this.rng.nextFloat() * this.height, this.zPos + this.rng.nextFloat() * this.width * 2.0F - this.width, d1, d2, d3, new int[0]);
/*  531:     */     }
/*  532:     */   }
/*  533:     */   
/*  534:     */   public xq beforeSpawn(vu paramvu, xq paramxq)
/*  535:     */   {
/*  536: 934 */     paramxq = super.beforeSpawn(paramvu, paramxq);
/*  537:     */     
/*  538: 936 */     setProfession(this.world.rng.nextInt(5));
/*  539:     */     
/*  540: 938 */     ct();
/*  541:     */     
/*  542: 940 */     return paramxq;
/*  543:     */   }
/*  544:     */   
/*  545:     */   public void cn()
/*  546:     */   {
/*  547: 944 */     this.bx = true;
/*  548:     */   }
/*  549:     */   
/*  550:     */   public EntityVillager getBaby(EntityPassiveMob paramws)
/*  551:     */   {
/*  552: 949 */     EntityVillager baby = new EntityVillager(this.world);
/*  553: 950 */     baby.beforeSpawn(this.world.E(new BlockPosition(baby)), null);
/*  554: 951 */     return baby;
/*  555:     */   }
/*  556:     */   
/*  557:     */   public boolean ca()
/*  558:     */   {
/*  559: 956 */     return false;
/*  560:     */   }
/*  561:     */   
/*  562:     */   public void onStruck(ads paramads)
/*  563:     */   {
/*  564: 961 */     if (this.world.isClient) {
/*  565: 962 */       return;
/*  566:     */     }
/*  567: 965 */     EntityWitch witch = new EntityWitch(this.world);
/*  568: 966 */     witch.setPositionAndAngles(this.xPos, this.yPos, this.zPos, this.yaw, this.pitch);
/*  569: 967 */     witch.beforeSpawn(this.world.E(new BlockPosition(witch)), null);
/*  570: 968 */     this.world.spawnEntity(witch);
/*  571: 969 */     setDead();
/*  572:     */   }
/*  573:     */   
/*  574:     */   public wa getInventory()
/*  575:     */   {
/*  576: 973 */     return this.inventory;
/*  577:     */   }
/*  578:     */   
/*  579:     */   protected void onPickup(EntityItem entityItem)
/*  580:     */   {
/*  581: 978 */     ItemStack stack = entityItem.getItemStack();
/*  582: 979 */     Item localalq = stack.getItem();
/*  583: 981 */     if (a(localalq))
/*  584:     */     {
/*  585: 982 */       ItemStack remainder = this.inventory.add(stack);
/*  586: 983 */       if (remainder == null) {
/*  587: 984 */         entityItem.setDead();
/*  588:     */       } else {
/*  589: 986 */         stack.stackSize = remainder.stackSize;
/*  590:     */       }
/*  591:     */     }
/*  592:     */   }
/*  593:     */   
/*  594:     */   private boolean a(Item paramalq)
/*  595:     */   {
/*  596: 992 */     return (paramalq == ItemList.bread) || (paramalq == ItemList.potato) || (paramalq == ItemList.carrot) || (paramalq == ItemList.O) || (paramalq == ItemList.N);
/*  597:     */   }
/*  598:     */   
/*  599:     */   public boolean cp()
/*  600:     */   {
/*  601: 996 */     return s(1);
/*  602:     */   }
/*  603:     */   
/*  604:     */   public boolean cq()
/*  605:     */   {
/*  606:1000 */     return s(2);
/*  607:     */   }
/*  608:     */   
/*  609:     */   public boolean cr()
/*  610:     */   {
/*  611:1004 */     int i = getProfession() == 0 ? 1 : 0;
/*  612:1005 */     if (i != 0) {
/*  613:1006 */       return !s(5);
/*  614:     */     }
/*  615:1008 */     return !s(1);
/*  616:     */   }
/*  617:     */   
/*  618:     */   private boolean s(int paramInt)
/*  619:     */   {
/*  620:1012 */     int i = getProfession() == 0 ? 1 : 0;
/*  621:1014 */     for (int j = 0; j < this.inventory.getSize(); j++)
/*  622:     */     {
/*  623:1015 */       ItemStack localamj = this.inventory.get(j);
/*  624:1016 */       if (localamj != null)
/*  625:     */       {
/*  626:1017 */         if (((localamj.getItem() == ItemList.bread) && (localamj.stackSize >= 3 * paramInt)) || ((localamj.getItem() == ItemList.potato) && (localamj.stackSize >= 12 * paramInt)) || ((localamj.getItem() == ItemList.carrot) && (localamj.stackSize >= 12 * paramInt))) {
/*  627:1019 */           return true;
/*  628:     */         }
/*  629:1021 */         if ((i != 0) && 
/*  630:1022 */           (localamj.getItem() == ItemList.O) && (localamj.stackSize >= 9 * paramInt)) {
/*  631:1023 */           return true;
/*  632:     */         }
/*  633:     */       }
/*  634:     */     }
/*  635:1028 */     return false;
/*  636:     */   }
/*  637:     */   
/*  638:     */   public boolean cs()
/*  639:     */   {
/*  640:1032 */     for (int i = 0; i < this.inventory.getSize(); i++)
/*  641:     */     {
/*  642:1033 */       ItemStack localamj = this.inventory.get(i);
/*  643:1034 */       if ((localamj != null) && (
/*  644:1035 */         (localamj.getItem() == ItemList.N) || (localamj.getItem() == ItemList.potato) || (localamj.getItem() == ItemList.carrot))) {
/*  645:1036 */         return true;
/*  646:     */       }
/*  647:     */     }
/*  648:1040 */     return false;
/*  649:     */   }
/*  650:     */   
/*  651:     */   public boolean d(int paramInt, ItemStack paramamj)
/*  652:     */   {
/*  653:1045 */     if (super.d(paramInt, paramamj)) {
/*  654:1046 */       return true;
/*  655:     */     }
/*  656:1048 */     int i = paramInt - 300;
/*  657:1049 */     if ((i >= 0) && (i < this.inventory.getSize()))
/*  658:     */     {
/*  659:1050 */       this.inventory.a(i, paramamj);
/*  660:1051 */       return true;
/*  661:     */     }
/*  662:1053 */     return false;
/*  663:     */   }
/*  664:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agp
 * JD-Core Version:    0.7.0.1
 */