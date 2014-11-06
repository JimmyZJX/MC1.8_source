package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class bkt
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   public bkt() {}
/*    7:     */   
/*    8:     */   public bkt(EnumDirection paramej, blf paramblf, Random paramRandom)
/*    9:     */   {
/*   10:1577 */     super(1, paramej, paramblf, 2, 2, 2);
/*   11:     */   }
/*   12:     */   
/*   13:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   14:     */   {
/*   15:1583 */     a(paramaqu, parambjb, 1, 8, 0, 14, 8, 14, a);
/*   16:     */     
/*   17:     */ 
/*   18:     */ 
/*   19:1587 */     int i = 7;
/*   20:1588 */     Block localbec = b;
/*   21:1589 */     a(paramaqu, parambjb, 0, i, 0, 0, i, 15, localbec, localbec, false);
/*   22:1590 */     a(paramaqu, parambjb, 15, i, 0, 15, i, 15, localbec, localbec, false);
/*   23:1591 */     a(paramaqu, parambjb, 1, i, 0, 15, i, 0, localbec, localbec, false);
/*   24:1592 */     a(paramaqu, parambjb, 1, i, 15, 14, i, 15, localbec, localbec, false);
/*   25:1594 */     for (i = 1; i <= 6; i++)
/*   26:     */     {
/*   27:1595 */       localbec = b;
/*   28:1596 */       if ((i == 2) || (i == 6)) {
/*   29:1597 */         localbec = a;
/*   30:     */       }
/*   31:1602 */       for (int k = 0; k <= 15; k += 15)
/*   32:     */       {
/*   33:1603 */         a(paramaqu, parambjb, k, i, 0, k, i, 1, localbec, localbec, false);
/*   34:1604 */         a(paramaqu, parambjb, k, i, 6, k, i, 9, localbec, localbec, false);
/*   35:1605 */         a(paramaqu, parambjb, k, i, 14, k, i, 15, localbec, localbec, false);
/*   36:     */       }
/*   37:1607 */       a(paramaqu, parambjb, 1, i, 0, 1, i, 0, localbec, localbec, false);
/*   38:1608 */       a(paramaqu, parambjb, 6, i, 0, 9, i, 0, localbec, localbec, false);
/*   39:1609 */       a(paramaqu, parambjb, 14, i, 0, 14, i, 0, localbec, localbec, false);
/*   40:     */       
/*   41:1611 */       a(paramaqu, parambjb, 1, i, 15, 14, i, 15, localbec, localbec, false);
/*   42:     */     }
/*   43:1616 */     a(paramaqu, parambjb, 6, 3, 6, 9, 6, 9, c, c, false);
/*   44:1617 */     a(paramaqu, parambjb, 7, 4, 7, 8, 5, 8, BlockList.R.instance(), BlockList.R.instance(), false);
/*   45:1618 */     for (i = 3; i <= 6; i += 3) {
/*   46:1619 */       for (int j = 6; j <= 9; j += 3)
/*   47:     */       {
/*   48:1620 */         a(paramaqu, e, j, i, 6, parambjb);
/*   49:1621 */         a(paramaqu, e, j, i, 9, parambjb);
/*   50:     */       }
/*   51:     */     }
/*   52:1625 */     a(paramaqu, parambjb, 5, 1, 6, 5, 2, 6, b, b, false);
/*   53:1626 */     a(paramaqu, parambjb, 5, 1, 9, 5, 2, 9, b, b, false);
/*   54:1627 */     a(paramaqu, parambjb, 10, 1, 6, 10, 2, 6, b, b, false);
/*   55:1628 */     a(paramaqu, parambjb, 10, 1, 9, 10, 2, 9, b, b, false);
/*   56:1629 */     a(paramaqu, parambjb, 6, 1, 5, 6, 2, 5, b, b, false);
/*   57:1630 */     a(paramaqu, parambjb, 9, 1, 5, 9, 2, 5, b, b, false);
/*   58:1631 */     a(paramaqu, parambjb, 6, 1, 10, 6, 2, 10, b, b, false);
/*   59:1632 */     a(paramaqu, parambjb, 9, 1, 10, 9, 2, 10, b, b, false);
/*   60:     */     
/*   61:1634 */     a(paramaqu, parambjb, 5, 2, 5, 5, 6, 5, b, b, false);
/*   62:1635 */     a(paramaqu, parambjb, 5, 2, 10, 5, 6, 10, b, b, false);
/*   63:1636 */     a(paramaqu, parambjb, 10, 2, 5, 10, 6, 5, b, b, false);
/*   64:1637 */     a(paramaqu, parambjb, 10, 2, 10, 10, 6, 10, b, b, false);
/*   65:     */     
/*   66:1639 */     a(paramaqu, parambjb, 5, 7, 1, 5, 7, 6, b, b, false);
/*   67:1640 */     a(paramaqu, parambjb, 10, 7, 1, 10, 7, 6, b, b, false);
/*   68:1641 */     a(paramaqu, parambjb, 5, 7, 9, 5, 7, 14, b, b, false);
/*   69:1642 */     a(paramaqu, parambjb, 10, 7, 9, 10, 7, 14, b, b, false);
/*   70:     */     
/*   71:1644 */     a(paramaqu, parambjb, 1, 7, 5, 6, 7, 5, b, b, false);
/*   72:1645 */     a(paramaqu, parambjb, 1, 7, 10, 6, 7, 10, b, b, false);
/*   73:1646 */     a(paramaqu, parambjb, 9, 7, 5, 14, 7, 5, b, b, false);
/*   74:1647 */     a(paramaqu, parambjb, 9, 7, 10, 14, 7, 10, b, b, false);
/*   75:     */     
/*   76:     */ 
/*   77:1650 */     a(paramaqu, parambjb, 2, 1, 2, 2, 1, 3, b, b, false);
/*   78:1651 */     a(paramaqu, parambjb, 3, 1, 2, 3, 1, 2, b, b, false);
/*   79:1652 */     a(paramaqu, parambjb, 13, 1, 2, 13, 1, 3, b, b, false);
/*   80:1653 */     a(paramaqu, parambjb, 12, 1, 2, 12, 1, 2, b, b, false);
/*   81:1654 */     a(paramaqu, parambjb, 2, 1, 12, 2, 1, 13, b, b, false);
/*   82:1655 */     a(paramaqu, parambjb, 3, 1, 13, 3, 1, 13, b, b, false);
/*   83:1656 */     a(paramaqu, parambjb, 13, 1, 12, 13, 1, 13, b, b, false);
/*   84:1657 */     a(paramaqu, parambjb, 12, 1, 13, 12, 1, 13, b, b, false);
/*   85:     */     
/*   86:1659 */     return true;
/*   87:     */   }
/*   88:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkt
 * JD-Core Version:    0.7.0.1
 */