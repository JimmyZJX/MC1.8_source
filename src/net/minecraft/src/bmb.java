package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bmb
/*    5:     */   extends bmk
/*    6:     */ {
/*    7:     */   private boolean a;
/*    8:     */   
/*    9:     */   public bmb() {}
/*   10:     */   
/*   11:     */   public bmb(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   12:     */   {
/*   13:1460 */     super(paramInt);
/*   14:     */     
/*   15:1462 */     this.m = paramej;
/*   16:1463 */     this.l = parambjb;
/*   17:     */   }
/*   18:     */   
/*   19:     */   protected void a(NBTTagCompound paramfn)
/*   20:     */   {
/*   21:1468 */     super.a(paramfn);
/*   22:1469 */     paramfn.setBoolean("Mob", this.a);
/*   23:     */   }
/*   24:     */   
/*   25:     */   protected void b(NBTTagCompound paramfn)
/*   26:     */   {
/*   27:1474 */     super.b(paramfn);
/*   28:1475 */     this.a = paramfn.getBoolean("Mob");
/*   29:     */   }
/*   30:     */   
/*   31:     */   public void a(bms parambms, List<bms> paramList, Random paramRandom)
/*   32:     */   {
/*   33:1480 */     if (parambms != null) {
/*   34:1481 */       ((bmh)parambms).b = this;
/*   35:     */     }
/*   36:     */   }
/*   37:     */   
/*   38:     */   public static bmb a(List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   39:     */   {
/*   40:1486 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -4, -1, 0, 11, 8, 16, paramej);
/*   41:1488 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   42:1489 */       return null;
/*   43:     */     }
/*   44:1492 */     return new bmb(paramInt4, paramRandom, localbjb, paramej);
/*   45:     */   }
/*   46:     */   
/*   47:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   48:     */   {
/*   49:1498 */     a(paramaqu, parambjb, 0, 0, 0, 10, 7, 15, false, paramRandom, blr.c());
/*   50:     */     
/*   51:1500 */     a(paramaqu, paramRandom, parambjb, bml.c, 4, 1, 0);
/*   52:     */     
/*   53:     */ 
/*   54:1503 */     int i = 6;
/*   55:1504 */     a(paramaqu, parambjb, 1, i, 1, 1, i, 14, false, paramRandom, blr.c());
/*   56:1505 */     a(paramaqu, parambjb, 9, i, 1, 9, i, 14, false, paramRandom, blr.c());
/*   57:1506 */     a(paramaqu, parambjb, 2, i, 1, 8, i, 2, false, paramRandom, blr.c());
/*   58:1507 */     a(paramaqu, parambjb, 2, i, 14, 8, i, 14, false, paramRandom, blr.c());
/*   59:     */     
/*   60:     */ 
/*   61:1510 */     a(paramaqu, parambjb, 1, 1, 1, 2, 1, 4, false, paramRandom, blr.c());
/*   62:1511 */     a(paramaqu, parambjb, 8, 1, 1, 9, 1, 4, false, paramRandom, blr.c());
/*   63:1512 */     a(paramaqu, parambjb, 1, 1, 1, 1, 1, 3, BlockList.k.instance(), BlockList.k.instance(), false);
/*   64:1513 */     a(paramaqu, parambjb, 9, 1, 1, 9, 1, 3, BlockList.k.instance(), BlockList.k.instance(), false);
/*   65:     */     
/*   66:     */ 
/*   67:1516 */     a(paramaqu, parambjb, 3, 1, 8, 7, 1, 12, false, paramRandom, blr.c());
/*   68:1517 */     a(paramaqu, parambjb, 4, 1, 9, 6, 1, 11, BlockList.k.instance(), BlockList.k.instance(), false);
/*   69:1520 */     for (int j = 3; j < 14; j += 2)
/*   70:     */     {
/*   71:1521 */       a(paramaqu, parambjb, 0, 3, j, 0, 4, j, BlockList.bi.instance(), BlockList.bi.instance(), false);
/*   72:1522 */       a(paramaqu, parambjb, 10, 3, j, 10, 4, j, BlockList.bi.instance(), BlockList.bi.instance(), false);
/*   73:     */     }
/*   74:1524 */     for (int j = 2; j < 9; j += 2) {
/*   75:1525 */       a(paramaqu, parambjb, j, 3, 15, j, 4, 15, BlockList.bi.instance(), BlockList.bi.instance(), false);
/*   76:     */     }
/*   77:1529 */     int j = a(BlockList.bv, 3);
/*   78:1530 */     a(paramaqu, parambjb, 4, 1, 5, 6, 1, 7, false, paramRandom, blr.c());
/*   79:1531 */     a(paramaqu, parambjb, 4, 2, 6, 6, 2, 7, false, paramRandom, blr.c());
/*   80:1532 */     a(paramaqu, parambjb, 4, 3, 7, 6, 3, 7, false, paramRandom, blr.c());
/*   81:1533 */     for (int k = 4; k <= 6; k++)
/*   82:     */     {
/*   83:1534 */       a(paramaqu, BlockList.bv.a(j), k, 1, 4, parambjb);
/*   84:1535 */       a(paramaqu, BlockList.bv.a(j), k, 2, 5, parambjb);
/*   85:1536 */       a(paramaqu, BlockList.bv.a(j), k, 3, 6, parambjb);
/*   86:     */     }
/*   87:1539 */     int k = EnumDirection.NORTH.b();
/*   88:1540 */     int m = EnumDirection.SOUTH.b();
/*   89:1541 */     int n = EnumDirection.EAST.b();
/*   90:1542 */     int i1 = EnumDirection.WEST.b();
/*   91:1544 */     if (this.m != null) {
/*   92:1545 */       switch (blu.b[this.m.ordinal()])
/*   93:     */       {
/*   94:     */       case 2: 
/*   95:1547 */         k = EnumDirection.SOUTH.b();
/*   96:1548 */         m = EnumDirection.NORTH.b();
/*   97:1549 */         break;
/*   98:     */       case 4: 
/*   99:1551 */         k = EnumDirection.EAST.b();
/*  100:1552 */         m = EnumDirection.WEST.b();
/*  101:1553 */         n = EnumDirection.SOUTH.b();
/*  102:1554 */         i1 = EnumDirection.NORTH.b();
/*  103:1555 */         break;
/*  104:     */       case 3: 
/*  105:1557 */         k = EnumDirection.WEST.b();
/*  106:1558 */         m = EnumDirection.EAST.b();
/*  107:1559 */         n = EnumDirection.SOUTH.b();
/*  108:1560 */         i1 = EnumDirection.NORTH.b();
/*  109:     */       }
/*  110:     */     }
/*  111:1565 */     a(paramaqu, BlockList.endPortalFrame.a(k).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 4, 3, 8, parambjb);
/*  112:1566 */     a(paramaqu, BlockList.endPortalFrame.a(k).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 5, 3, 8, parambjb);
/*  113:1567 */     a(paramaqu, BlockList.endPortalFrame.a(k).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 6, 3, 8, parambjb);
/*  114:1568 */     a(paramaqu, BlockList.endPortalFrame.a(m).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 4, 3, 12, parambjb);
/*  115:1569 */     a(paramaqu, BlockList.endPortalFrame.a(m).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 5, 3, 12, parambjb);
/*  116:1570 */     a(paramaqu, BlockList.endPortalFrame.a(m).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 6, 3, 12, parambjb);
/*  117:1571 */     a(paramaqu, BlockList.endPortalFrame.a(n).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 3, 3, 9, parambjb);
/*  118:1572 */     a(paramaqu, BlockList.endPortalFrame.a(n).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 3, 3, 10, parambjb);
/*  119:1573 */     a(paramaqu, BlockList.endPortalFrame.a(n).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 3, 3, 11, parambjb);
/*  120:1574 */     a(paramaqu, BlockList.endPortalFrame.a(i1).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 7, 3, 9, parambjb);
/*  121:1575 */     a(paramaqu, BlockList.endPortalFrame.a(i1).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 7, 3, 10, parambjb);
/*  122:1576 */     a(paramaqu, BlockList.endPortalFrame.a(i1).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 7, 3, 11, parambjb);
/*  123:1578 */     if (!this.a)
/*  124:     */     {
/*  125:1579 */       i = d(3);
/*  126:1580 */       BlockPosition localdt = new BlockPosition(a(5, 6), i, b(5, 6));
/*  127:1581 */       if (parambjb.b(localdt))
/*  128:     */       {
/*  129:1582 */         this.a = true;
/*  130:1583 */         paramaqu.setBlock(localdt, BlockList.mobSpawner.instance(), 2);
/*  131:     */         
/*  132:1585 */         bcm localbcm = paramaqu.s(localdt);
/*  133:1586 */         if ((localbcm instanceof bdg)) {
/*  134:1587 */           ((bdg)localbcm).b().a("Silverfish");
/*  135:     */         }
/*  136:     */       }
/*  137:     */     }
/*  138:1592 */     return true;
/*  139:     */   }
/*  140:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmb
 * JD-Core Version:    0.7.0.1
 */