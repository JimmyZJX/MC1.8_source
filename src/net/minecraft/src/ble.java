package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class ble
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   private int o;
/*    7:     */   
/*    8:     */   public ble() {}
/*    9:     */   
/*   10:     */   public ble(EnumDirection paramej, bjb parambjb, int paramInt)
/*   11:     */   {
/*   12:1671 */     super(paramej, parambjb);
/*   13:1672 */     this.o = (paramInt & 0x1);
/*   14:     */   }
/*   15:     */   
/*   16:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   17:     */   {
/*   18:     */     int i;
/*   19:1679 */     if (this.o == 0)
/*   20:     */     {
/*   21:1680 */       for (i = 0; i < 4; i++) {
/*   22:1681 */         a(paramaqu, parambjb, 10 - i, 3 - i, 20 - i, 12 + i, 3 - i, 20, b, b, false);
/*   23:     */       }
/*   24:1683 */       a(paramaqu, parambjb, 7, 0, 6, 15, 0, 16, b, b, false);
/*   25:1684 */       a(paramaqu, parambjb, 6, 0, 6, 6, 3, 20, b, b, false);
/*   26:1685 */       a(paramaqu, parambjb, 16, 0, 6, 16, 3, 20, b, b, false);
/*   27:1686 */       a(paramaqu, parambjb, 7, 1, 7, 7, 1, 20, b, b, false);
/*   28:1687 */       a(paramaqu, parambjb, 15, 1, 7, 15, 1, 20, b, b, false);
/*   29:     */       
/*   30:1689 */       a(paramaqu, parambjb, 7, 1, 6, 9, 3, 6, b, b, false);
/*   31:1690 */       a(paramaqu, parambjb, 13, 1, 6, 15, 3, 6, b, b, false);
/*   32:1691 */       a(paramaqu, parambjb, 8, 1, 7, 9, 1, 7, b, b, false);
/*   33:1692 */       a(paramaqu, parambjb, 13, 1, 7, 14, 1, 7, b, b, false);
/*   34:1693 */       a(paramaqu, parambjb, 9, 0, 5, 13, 0, 5, b, b, false);
/*   35:     */       
/*   36:1695 */       a(paramaqu, parambjb, 10, 0, 7, 12, 0, 7, c, c, false);
/*   37:1696 */       a(paramaqu, parambjb, 8, 0, 10, 8, 0, 12, c, c, false);
/*   38:1697 */       a(paramaqu, parambjb, 14, 0, 10, 14, 0, 12, c, c, false);
/*   39:1699 */       for (i = 18; i >= 7; i -= 3)
/*   40:     */       {
/*   41:1700 */         a(paramaqu, e, 6, 3, i, parambjb);
/*   42:1701 */         a(paramaqu, e, 16, 3, i, parambjb);
/*   43:     */       }
/*   44:1703 */       a(paramaqu, e, 10, 0, 10, parambjb);
/*   45:1704 */       a(paramaqu, e, 12, 0, 10, parambjb);
/*   46:1705 */       a(paramaqu, e, 10, 0, 12, parambjb);
/*   47:1706 */       a(paramaqu, e, 12, 0, 12, parambjb);
/*   48:     */       
/*   49:1708 */       a(paramaqu, e, 8, 3, 6, parambjb);
/*   50:1709 */       a(paramaqu, e, 14, 3, 6, parambjb);
/*   51:     */       
/*   52:     */ 
/*   53:1712 */       a(paramaqu, b, 4, 2, 4, parambjb);
/*   54:1713 */       a(paramaqu, e, 4, 1, 4, parambjb);
/*   55:1714 */       a(paramaqu, b, 4, 0, 4, parambjb);
/*   56:     */       
/*   57:1716 */       a(paramaqu, b, 18, 2, 4, parambjb);
/*   58:1717 */       a(paramaqu, e, 18, 1, 4, parambjb);
/*   59:1718 */       a(paramaqu, b, 18, 0, 4, parambjb);
/*   60:     */       
/*   61:1720 */       a(paramaqu, b, 4, 2, 18, parambjb);
/*   62:1721 */       a(paramaqu, e, 4, 1, 18, parambjb);
/*   63:1722 */       a(paramaqu, b, 4, 0, 18, parambjb);
/*   64:     */       
/*   65:1724 */       a(paramaqu, b, 18, 2, 18, parambjb);
/*   66:1725 */       a(paramaqu, e, 18, 1, 18, parambjb);
/*   67:1726 */       a(paramaqu, b, 18, 0, 18, parambjb);
/*   68:     */       
/*   69:     */ 
/*   70:1729 */       a(paramaqu, b, 9, 7, 20, parambjb);
/*   71:1730 */       a(paramaqu, b, 13, 7, 20, parambjb);
/*   72:1731 */       a(paramaqu, parambjb, 6, 0, 21, 7, 4, 21, b, b, false);
/*   73:1732 */       a(paramaqu, parambjb, 15, 0, 21, 16, 4, 21, b, b, false);
/*   74:     */       
/*   75:1734 */       a(paramaqu, parambjb, 11, 2, 16);
/*   76:     */     }
/*   77:1735 */     else if (this.o == 1)
/*   78:     */     {
/*   79:1736 */       a(paramaqu, parambjb, 9, 3, 18, 13, 3, 20, b, b, false);
/*   80:1737 */       a(paramaqu, parambjb, 9, 0, 18, 9, 2, 18, b, b, false);
/*   81:1738 */       a(paramaqu, parambjb, 13, 0, 18, 13, 2, 18, b, b, false);
/*   82:1739 */       i = 9;
/*   83:1740 */       int j = 20;
/*   84:1741 */       int k = 5;
/*   85:1742 */       for (int m = 0; m < 2; m++)
/*   86:     */       {
/*   87:1743 */         a(paramaqu, b, i, k + 1, j, parambjb);
/*   88:1744 */         a(paramaqu, e, i, k, j, parambjb);
/*   89:1745 */         a(paramaqu, b, i, k - 1, j, parambjb);
/*   90:1746 */         i = 13;
/*   91:     */       }
/*   92:1749 */       a(paramaqu, parambjb, 7, 3, 7, 15, 3, 14, b, b, false);
/*   93:1750 */       i = 10;
/*   94:1751 */       for (int m = 0; m < 2; m++)
/*   95:     */       {
/*   96:1752 */         a(paramaqu, parambjb, i, 0, 10, i, 6, 10, b, b, false);
/*   97:1753 */         a(paramaqu, parambjb, i, 0, 12, i, 6, 12, b, b, false);
/*   98:1754 */         a(paramaqu, e, i, 0, 10, parambjb);
/*   99:1755 */         a(paramaqu, e, i, 0, 12, parambjb);
/*  100:1756 */         a(paramaqu, e, i, 4, 10, parambjb);
/*  101:1757 */         a(paramaqu, e, i, 4, 12, parambjb);
/*  102:1758 */         i = 12;
/*  103:     */       }
/*  104:1760 */       i = 8;
/*  105:1761 */       for (int m = 0; m < 2; m++)
/*  106:     */       {
/*  107:1762 */         a(paramaqu, parambjb, i, 0, 7, i, 2, 7, b, b, false);
/*  108:1763 */         a(paramaqu, parambjb, i, 0, 14, i, 2, 14, b, b, false);
/*  109:1764 */         i = 14;
/*  110:     */       }
/*  111:1766 */       a(paramaqu, parambjb, 8, 3, 8, 8, 3, 13, c, c, false);
/*  112:1767 */       a(paramaqu, parambjb, 14, 3, 8, 14, 3, 13, c, c, false);
/*  113:     */       
/*  114:1769 */       a(paramaqu, parambjb, 11, 5, 13);
/*  115:     */     }
/*  116:1772 */     return true;
/*  117:     */   }
/*  118:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ble
 * JD-Core Version:    0.7.0.1
 */