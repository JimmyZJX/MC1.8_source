package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bjt
/*    5:     */   extends bkb
/*    6:     */ {
/*    7:     */   public bjt() {}
/*    8:     */   
/*    9:     */   public bjt(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   10:     */   {
/*   11:1472 */     super(paramInt);
/*   12:     */     
/*   13:1474 */     this.m = paramej;
/*   14:1475 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   18:     */   {
/*   19:1480 */     int i = 1;
/*   20:1482 */     if ((this.m == EnumDirection.WEST) || (this.m == EnumDirection.NORTH)) {
/*   21:1483 */       i = 5;
/*   22:     */     }
/*   23:1486 */     b((bkf)parambms, paramList, paramRandom, 0, i, paramRandom.nextInt(8) > 0);
/*   24:1487 */     c((bkf)parambms, paramList, paramRandom, 0, i, paramRandom.nextInt(8) > 0);
/*   25:     */   }
/*   26:     */   
/*   27:     */   public static bjt a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   28:     */   {
/*   29:1491 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -3, 0, 0, 9, 7, 9, paramej);
/*   30:1493 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   31:1494 */       return null;
/*   32:     */     }
/*   33:1497 */     return new bjt(paramInt4, paramRandom, localbjb, paramej);
/*   34:     */   }
/*   35:     */   
/*   36:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   37:     */   {
/*   38:1503 */     a(paramaqu, parambjb, 0, 0, 0, 8, 1, 8, BlockList.by.instance(), BlockList.by.instance(), false);
/*   39:     */     
/*   40:1505 */     a(paramaqu, parambjb, 0, 2, 0, 8, 5, 8, BlockList.air.instance(), BlockList.air.instance(), false);
/*   41:     */     
/*   42:1507 */     a(paramaqu, parambjb, 0, 6, 0, 8, 6, 5, BlockList.by.instance(), BlockList.by.instance(), false);
/*   43:     */     
/*   44:     */ 
/*   45:1510 */     a(paramaqu, parambjb, 0, 2, 0, 2, 5, 0, BlockList.by.instance(), BlockList.by.instance(), false);
/*   46:1511 */     a(paramaqu, parambjb, 6, 2, 0, 8, 5, 0, BlockList.by.instance(), BlockList.by.instance(), false);
/*   47:1512 */     a(paramaqu, parambjb, 1, 3, 0, 1, 4, 0, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   48:1513 */     a(paramaqu, parambjb, 7, 3, 0, 7, 4, 0, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   49:     */     
/*   50:     */ 
/*   51:1516 */     a(paramaqu, parambjb, 0, 2, 4, 8, 2, 8, BlockList.by.instance(), BlockList.by.instance(), false);
/*   52:1517 */     a(paramaqu, parambjb, 1, 1, 4, 2, 2, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*   53:1518 */     a(paramaqu, parambjb, 6, 1, 4, 7, 2, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*   54:     */     
/*   55:     */ 
/*   56:1521 */     a(paramaqu, parambjb, 0, 3, 8, 8, 3, 8, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   57:1522 */     a(paramaqu, parambjb, 0, 3, 6, 0, 3, 7, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   58:1523 */     a(paramaqu, parambjb, 8, 3, 6, 8, 3, 7, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   59:     */     
/*   60:     */ 
/*   61:1526 */     a(paramaqu, parambjb, 0, 3, 4, 0, 5, 5, BlockList.by.instance(), BlockList.by.instance(), false);
/*   62:1527 */     a(paramaqu, parambjb, 8, 3, 4, 8, 5, 5, BlockList.by.instance(), BlockList.by.instance(), false);
/*   63:1528 */     a(paramaqu, parambjb, 1, 3, 5, 2, 5, 5, BlockList.by.instance(), BlockList.by.instance(), false);
/*   64:1529 */     a(paramaqu, parambjb, 6, 3, 5, 7, 5, 5, BlockList.by.instance(), BlockList.by.instance(), false);
/*   65:1530 */     a(paramaqu, parambjb, 1, 4, 5, 1, 5, 5, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   66:1531 */     a(paramaqu, parambjb, 7, 4, 5, 7, 5, 5, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   67:1534 */     for (int i = 0; i <= 5; i++) {
/*   68:1535 */       for (int j = 0; j <= 8; j++) {
/*   69:1536 */         b(paramaqu, BlockList.by.instance(), j, -1, i, parambjb);
/*   70:     */       }
/*   71:     */     }
/*   72:1540 */     return true;
/*   73:     */   }
/*   74:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjt
 * JD-Core Version:    0.7.0.1
 */