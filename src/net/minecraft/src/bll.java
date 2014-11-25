package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bll
/*   6:    */   extends bln
/*   7:    */ {
/*   8:    */   private boolean e;
/*   9:    */   private boolean f;
/*  10:    */   private boolean g;
/*  11:    */   private boolean h;
/*  12:357 */   private static final List i = Lists.newArrayList(new vl[] { new vl(ItemList.diamond, 0, 1, 3, 3), new vl(ItemList.ironIngot, 0, 1, 5, 10), new vl(ItemList.goldIngot, 0, 2, 7, 15), new vl(ItemList.emerald, 0, 1, 3, 2), new vl(ItemList.bone, 0, 4, 6, 20), new vl(ItemList.bt, 0, 3, 7, 16), new vl(ItemList.saddle, 0, 1, 1, 3), new vl(ItemList.ck, 0, 1, 1, 1), new vl(ItemList.cl, 0, 1, 1, 1), new vl(ItemList.cm, 0, 1, 1, 1) });
/*  13:370 */   private static final List j = Lists.newArrayList(new vl[] { new vl(ItemList.g, 0, 2, 7, 30) });
/*  14:    */   
/*  15:    */   public bll() {}
/*  16:    */   
/*  17:    */   public bll(Random paramRandom, int paramInt1, int paramInt2)
/*  18:    */   {
/*  19:381 */     super(paramRandom, paramInt1, 64, paramInt2, 12, 10, 15);
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected void a(NBTTagCompound paramfn)
/*  23:    */   {
/*  24:386 */     super.a(paramfn);
/*  25:387 */     paramfn.setBoolean("placedMainChest", this.e);
/*  26:388 */     paramfn.setBoolean("placedHiddenChest", this.f);
/*  27:389 */     paramfn.setBoolean("placedTrap1", this.g);
/*  28:390 */     paramfn.setBoolean("placedTrap2", this.h);
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected void b(NBTTagCompound paramfn)
/*  32:    */   {
/*  33:395 */     super.b(paramfn);
/*  34:396 */     this.e = paramfn.getBoolean("placedMainChest");
/*  35:397 */     this.f = paramfn.getBoolean("placedHiddenChest");
/*  36:398 */     this.g = paramfn.getBoolean("placedTrap1");
/*  37:399 */     this.h = paramfn.getBoolean("placedTrap2");
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  41:    */   {
/*  42:404 */     if (!a(paramaqu, parambjb, 0)) {
/*  43:405 */       return false;
/*  44:    */     }
/*  45:408 */     int m = a(BlockList.aw, 3);
/*  46:409 */     int n = a(BlockList.aw, 2);
/*  47:410 */     int i1 = a(BlockList.aw, 0);
/*  48:411 */     int i2 = a(BlockList.aw, 1);
/*  49:    */     
/*  50:    */ 
/*  51:414 */     a(paramaqu, parambjb, 0, -4, 0, this.a - 1, 0, this.c - 1, false, paramRandom, k);
/*  52:    */     
/*  53:    */ 
/*  54:417 */     a(paramaqu, parambjb, 2, 1, 2, 9, 2, 2, false, paramRandom, k);
/*  55:418 */     a(paramaqu, parambjb, 2, 1, 12, 9, 2, 12, false, paramRandom, k);
/*  56:419 */     a(paramaqu, parambjb, 2, 1, 3, 2, 2, 11, false, paramRandom, k);
/*  57:420 */     a(paramaqu, parambjb, 9, 1, 3, 9, 2, 11, false, paramRandom, k);
/*  58:    */     
/*  59:    */ 
/*  60:423 */     a(paramaqu, parambjb, 1, 3, 1, 10, 6, 1, false, paramRandom, k);
/*  61:424 */     a(paramaqu, parambjb, 1, 3, 13, 10, 6, 13, false, paramRandom, k);
/*  62:425 */     a(paramaqu, parambjb, 1, 3, 2, 1, 6, 12, false, paramRandom, k);
/*  63:426 */     a(paramaqu, parambjb, 10, 3, 2, 10, 6, 12, false, paramRandom, k);
/*  64:    */     
/*  65:    */ 
/*  66:429 */     a(paramaqu, parambjb, 2, 3, 2, 9, 3, 12, false, paramRandom, k);
/*  67:430 */     a(paramaqu, parambjb, 2, 6, 2, 9, 6, 12, false, paramRandom, k);
/*  68:431 */     a(paramaqu, parambjb, 3, 7, 3, 8, 7, 11, false, paramRandom, k);
/*  69:432 */     a(paramaqu, parambjb, 4, 8, 4, 7, 8, 10, false, paramRandom, k);
/*  70:    */     
/*  71:    */ 
/*  72:435 */     a(paramaqu, parambjb, 3, 1, 3, 8, 2, 11);
/*  73:436 */     a(paramaqu, parambjb, 4, 3, 6, 7, 3, 9);
/*  74:437 */     a(paramaqu, parambjb, 2, 4, 2, 9, 5, 12);
/*  75:438 */     a(paramaqu, parambjb, 4, 6, 5, 7, 6, 9);
/*  76:439 */     a(paramaqu, parambjb, 5, 7, 6, 6, 7, 8);
/*  77:    */     
/*  78:    */ 
/*  79:442 */     a(paramaqu, parambjb, 5, 1, 2, 6, 2, 2);
/*  80:443 */     a(paramaqu, parambjb, 5, 2, 12, 6, 2, 12);
/*  81:444 */     a(paramaqu, parambjb, 5, 5, 1, 6, 5, 1);
/*  82:445 */     a(paramaqu, parambjb, 5, 5, 13, 6, 5, 13);
/*  83:446 */     a(paramaqu, BlockList.air.instance(), 1, 5, 5, parambjb);
/*  84:447 */     a(paramaqu, BlockList.air.instance(), 10, 5, 5, parambjb);
/*  85:448 */     a(paramaqu, BlockList.air.instance(), 1, 5, 9, parambjb);
/*  86:449 */     a(paramaqu, BlockList.air.instance(), 10, 5, 9, parambjb);
/*  87:452 */     for (int i3 = 0; i3 <= 14; i3 += 14)
/*  88:    */     {
/*  89:453 */       a(paramaqu, parambjb, 2, 4, i3, 2, 5, i3, false, paramRandom, k);
/*  90:454 */       a(paramaqu, parambjb, 4, 4, i3, 4, 5, i3, false, paramRandom, k);
/*  91:455 */       a(paramaqu, parambjb, 7, 4, i3, 7, 5, i3, false, paramRandom, k);
/*  92:456 */       a(paramaqu, parambjb, 9, 4, i3, 9, 5, i3, false, paramRandom, k);
/*  93:    */     }
/*  94:458 */     a(paramaqu, parambjb, 5, 6, 0, 6, 6, 0, false, paramRandom, k);
/*  95:459 */     for (int i3 = 0; i3 <= 11; i3 += 11)
/*  96:    */     {
/*  97:460 */       for (int i4 = 2; i4 <= 12; i4 += 2) {
/*  98:461 */         a(paramaqu, parambjb, i3, 4, i4, i3, 5, i4, false, paramRandom, k);
/*  99:    */       }
/* 100:463 */       a(paramaqu, parambjb, i3, 6, 5, i3, 6, 5, false, paramRandom, k);
/* 101:464 */       a(paramaqu, parambjb, i3, 6, 9, i3, 6, 9, false, paramRandom, k);
/* 102:    */     }
/* 103:466 */     a(paramaqu, parambjb, 2, 7, 2, 2, 9, 2, false, paramRandom, k);
/* 104:467 */     a(paramaqu, parambjb, 9, 7, 2, 9, 9, 2, false, paramRandom, k);
/* 105:468 */     a(paramaqu, parambjb, 2, 7, 12, 2, 9, 12, false, paramRandom, k);
/* 106:469 */     a(paramaqu, parambjb, 9, 7, 12, 9, 9, 12, false, paramRandom, k);
/* 107:470 */     a(paramaqu, parambjb, 4, 9, 4, 4, 9, 4, false, paramRandom, k);
/* 108:471 */     a(paramaqu, parambjb, 7, 9, 4, 7, 9, 4, false, paramRandom, k);
/* 109:472 */     a(paramaqu, parambjb, 4, 9, 10, 4, 9, 10, false, paramRandom, k);
/* 110:473 */     a(paramaqu, parambjb, 7, 9, 10, 7, 9, 10, false, paramRandom, k);
/* 111:474 */     a(paramaqu, parambjb, 5, 9, 7, 6, 9, 7, false, paramRandom, k);
/* 112:475 */     a(paramaqu, BlockList.aw.instance(m), 5, 9, 6, parambjb);
/* 113:476 */     a(paramaqu, BlockList.aw.instance(m), 6, 9, 6, parambjb);
/* 114:477 */     a(paramaqu, BlockList.aw.instance(n), 5, 9, 8, parambjb);
/* 115:478 */     a(paramaqu, BlockList.aw.instance(n), 6, 9, 8, parambjb);
/* 116:    */     
/* 117:    */ 
/* 118:481 */     a(paramaqu, BlockList.aw.instance(m), 4, 0, 0, parambjb);
/* 119:482 */     a(paramaqu, BlockList.aw.instance(m), 5, 0, 0, parambjb);
/* 120:483 */     a(paramaqu, BlockList.aw.instance(m), 6, 0, 0, parambjb);
/* 121:484 */     a(paramaqu, BlockList.aw.instance(m), 7, 0, 0, parambjb);
/* 122:    */     
/* 123:    */ 
/* 124:487 */     a(paramaqu, BlockList.aw.instance(m), 4, 1, 8, parambjb);
/* 125:488 */     a(paramaqu, BlockList.aw.instance(m), 4, 2, 9, parambjb);
/* 126:489 */     a(paramaqu, BlockList.aw.instance(m), 4, 3, 10, parambjb);
/* 127:490 */     a(paramaqu, BlockList.aw.instance(m), 7, 1, 8, parambjb);
/* 128:491 */     a(paramaqu, BlockList.aw.instance(m), 7, 2, 9, parambjb);
/* 129:492 */     a(paramaqu, BlockList.aw.instance(m), 7, 3, 10, parambjb);
/* 130:493 */     a(paramaqu, parambjb, 4, 1, 9, 4, 1, 9, false, paramRandom, k);
/* 131:494 */     a(paramaqu, parambjb, 7, 1, 9, 7, 1, 9, false, paramRandom, k);
/* 132:495 */     a(paramaqu, parambjb, 4, 1, 10, 7, 2, 10, false, paramRandom, k);
/* 133:    */     
/* 134:    */ 
/* 135:498 */     a(paramaqu, parambjb, 5, 4, 5, 6, 4, 5, false, paramRandom, k);
/* 136:499 */     a(paramaqu, BlockList.aw.instance(i1), 4, 4, 5, parambjb);
/* 137:500 */     a(paramaqu, BlockList.aw.instance(i2), 7, 4, 5, parambjb);
/* 138:503 */     for (int i3 = 0; i3 < 4; i3++)
/* 139:    */     {
/* 140:504 */       a(paramaqu, BlockList.aw.instance(n), 5, 0 - i3, 6 + i3, parambjb);
/* 141:505 */       a(paramaqu, BlockList.aw.instance(n), 6, 0 - i3, 6 + i3, parambjb);
/* 142:506 */       a(paramaqu, parambjb, 5, 0 - i3, 7 + i3, 6, 0 - i3, 9 + i3);
/* 143:    */     }
/* 144:510 */     a(paramaqu, parambjb, 1, -3, 12, 10, -1, 13);
/* 145:511 */     a(paramaqu, parambjb, 1, -3, 1, 3, -1, 13);
/* 146:512 */     a(paramaqu, parambjb, 1, -3, 1, 9, -1, 5);
/* 147:513 */     for (int i3 = 1; i3 <= 13; i3 += 2) {
/* 148:514 */       a(paramaqu, parambjb, 1, -3, i3, 1, -2, i3, false, paramRandom, k);
/* 149:    */     }
/* 150:516 */     for (int i3 = 2; i3 <= 12; i3 += 2) {
/* 151:517 */       a(paramaqu, parambjb, 1, -1, i3, 3, -1, i3, false, paramRandom, k);
/* 152:    */     }
/* 153:519 */     a(paramaqu, parambjb, 2, -2, 1, 5, -2, 1, false, paramRandom, k);
/* 154:520 */     a(paramaqu, parambjb, 7, -2, 1, 9, -2, 1, false, paramRandom, k);
/* 155:521 */     a(paramaqu, parambjb, 6, -3, 1, 6, -3, 1, false, paramRandom, k);
/* 156:522 */     a(paramaqu, parambjb, 6, -1, 1, 6, -1, 1, false, paramRandom, k);
/* 157:    */     
/* 158:    */ 
/* 159:525 */     a(paramaqu, BlockList.bR.instance(a(BlockList.bR, EnumDirection.EAST.b())).a(bbt.M, Boolean.valueOf(true)), 1, -3, 8, parambjb);
/* 160:526 */     a(paramaqu, BlockList.bR.instance(a(BlockList.bR, EnumDirection.WEST.b())).a(bbt.M, Boolean.valueOf(true)), 4, -3, 8, parambjb);
/* 161:527 */     a(paramaqu, BlockList.tripwire.instance().a(bbs.M, Boolean.valueOf(true)), 2, -3, 8, parambjb);
/* 162:528 */     a(paramaqu, BlockList.tripwire.instance().a(bbs.M, Boolean.valueOf(true)), 3, -3, 8, parambjb);
/* 163:529 */     a(paramaqu, BlockList.af.instance(), 5, -3, 7, parambjb);
/* 164:530 */     a(paramaqu, BlockList.af.instance(), 5, -3, 6, parambjb);
/* 165:531 */     a(paramaqu, BlockList.af.instance(), 5, -3, 5, parambjb);
/* 166:532 */     a(paramaqu, BlockList.af.instance(), 5, -3, 4, parambjb);
/* 167:533 */     a(paramaqu, BlockList.af.instance(), 5, -3, 3, parambjb);
/* 168:534 */     a(paramaqu, BlockList.af.instance(), 5, -3, 2, parambjb);
/* 169:535 */     a(paramaqu, BlockList.af.instance(), 5, -3, 1, parambjb);
/* 170:536 */     a(paramaqu, BlockList.af.instance(), 4, -3, 1, parambjb);
/* 171:537 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 3, -3, 1, parambjb);
/* 172:538 */     if (!this.g) {
/* 173:539 */       this.g = a(paramaqu, parambjb, paramRandom, 3, -2, 1, EnumDirection.NORTH.a(), j, 2);
/* 174:    */     }
/* 175:541 */     a(paramaqu, BlockList.vine.instance(15), 3, -2, 2, parambjb);
/* 176:    */     
/* 177:    */ 
/* 178:544 */     a(paramaqu, BlockList.bR.instance(a(BlockList.bR, EnumDirection.NORTH.b())).a(bbt.M, Boolean.valueOf(true)), 7, -3, 1, parambjb);
/* 179:545 */     a(paramaqu, BlockList.bR.instance(a(BlockList.bR, EnumDirection.SOUTH.b())).a(bbt.M, Boolean.valueOf(true)), 7, -3, 5, parambjb);
/* 180:546 */     a(paramaqu, BlockList.tripwire.instance().a(bbs.M, Boolean.valueOf(true)), 7, -3, 2, parambjb);
/* 181:547 */     a(paramaqu, BlockList.tripwire.instance().a(bbs.M, Boolean.valueOf(true)), 7, -3, 3, parambjb);
/* 182:548 */     a(paramaqu, BlockList.tripwire.instance().a(bbs.M, Boolean.valueOf(true)), 7, -3, 4, parambjb);
/* 183:549 */     a(paramaqu, BlockList.af.instance(), 8, -3, 6, parambjb);
/* 184:550 */     a(paramaqu, BlockList.af.instance(), 9, -3, 6, parambjb);
/* 185:551 */     a(paramaqu, BlockList.af.instance(), 9, -3, 5, parambjb);
/* 186:552 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 9, -3, 4, parambjb);
/* 187:553 */     a(paramaqu, BlockList.af.instance(), 9, -2, 4, parambjb);
/* 188:554 */     if (!this.h) {
/* 189:555 */       this.h = a(paramaqu, parambjb, paramRandom, 9, -2, 3, EnumDirection.WEST.a(), j, 2);
/* 190:    */     }
/* 191:557 */     a(paramaqu, BlockList.vine.instance(15), 8, -1, 3, parambjb);
/* 192:558 */     a(paramaqu, BlockList.vine.instance(15), 8, -2, 3, parambjb);
/* 193:559 */     if (!this.e) {
/* 194:560 */       this.e = a(paramaqu, parambjb, paramRandom, 8, -3, 3, vl.a(i, new vl[] { ItemList.cd.b(paramRandom) }), 2 + paramRandom.nextInt(5));
/* 195:    */     }
/* 196:562 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 9, -3, 2, parambjb);
/* 197:563 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 8, -3, 1, parambjb);
/* 198:564 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 4, -3, 5, parambjb);
/* 199:565 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 5, -2, 5, parambjb);
/* 200:566 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 5, -1, 5, parambjb);
/* 201:567 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 6, -3, 5, parambjb);
/* 202:568 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 7, -2, 5, parambjb);
/* 203:569 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 7, -1, 5, parambjb);
/* 204:570 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 8, -3, 5, parambjb);
/* 205:571 */     a(paramaqu, parambjb, 9, -1, 1, 9, -1, 5, false, paramRandom, k);
/* 206:    */     
/* 207:    */ 
/* 208:574 */     a(paramaqu, parambjb, 8, -3, 8, 10, -1, 10);
/* 209:575 */     a(paramaqu, BlockList.stoneBrick.instance(bbc.O), 8, -2, 11, parambjb);
/* 210:576 */     a(paramaqu, BlockList.stoneBrick.instance(bbc.O), 9, -2, 11, parambjb);
/* 211:577 */     a(paramaqu, BlockList.stoneBrick.instance(bbc.O), 10, -2, 11, parambjb);
/* 212:578 */     a(paramaqu, BlockList.ay.instance(axi.a(EnumDirection.a(a(BlockList.ay, EnumDirection.NORTH.a())))), 8, -2, 12, parambjb);
/* 213:579 */     a(paramaqu, BlockList.ay.instance(axi.a(EnumDirection.a(a(BlockList.ay, EnumDirection.NORTH.a())))), 9, -2, 12, parambjb);
/* 214:580 */     a(paramaqu, BlockList.ay.instance(axi.a(EnumDirection.a(a(BlockList.ay, EnumDirection.NORTH.a())))), 10, -2, 12, parambjb);
/* 215:581 */     a(paramaqu, parambjb, 8, -3, 8, 8, -3, 10, false, paramRandom, k);
/* 216:582 */     a(paramaqu, parambjb, 10, -3, 8, 10, -3, 10, false, paramRandom, k);
/* 217:583 */     a(paramaqu, BlockList.mossyCobblestone.instance(), 10, -2, 9, parambjb);
/* 218:584 */     a(paramaqu, BlockList.af.instance(), 8, -2, 9, parambjb);
/* 219:585 */     a(paramaqu, BlockList.af.instance(), 8, -2, 10, parambjb);
/* 220:586 */     a(paramaqu, BlockList.af.instance(), 10, -1, 9, parambjb);
/* 221:587 */     a(paramaqu, BlockList.F.instance(EnumDirection.UP.a()), 9, -2, 8, parambjb);
/* 222:588 */     a(paramaqu, BlockList.F.instance(a(BlockList.F, EnumDirection.WEST.a())), 10, -2, 8, parambjb);
/* 223:589 */     a(paramaqu, BlockList.F.instance(a(BlockList.F, EnumDirection.WEST.a())), 10, -1, 8, parambjb);
/* 224:590 */     a(paramaqu, BlockList.bb.instance(a(BlockList.bb, EnumDirection.NORTH.b())), 10, -2, 10, parambjb);
/* 225:591 */     if (!this.f) {
/* 226:592 */       this.f = a(paramaqu, parambjb, paramRandom, 9, -3, 10, vl.a(i, new vl[] { ItemList.cd.b(paramRandom) }), 2 + paramRandom.nextInt(5));
/* 227:    */     }
/* 228:595 */     return true;
/* 229:    */   }
/* 230:    */   
/* 231:609 */   private static blm k = new blm(null);
/* 232:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bll
 * JD-Core Version:    0.7.0.1
 */