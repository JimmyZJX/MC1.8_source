package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class bla
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   public bla() {}
/*    7:     */   
/*    8:     */   public bla(EnumDirection paramej, bjb parambjb)
/*    9:     */   {
/*   10:1782 */     super(paramej, parambjb);
/*   11:     */   }
/*   12:     */   
/*   13:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   14:     */   {
/*   15:1788 */     a(paramaqu, parambjb, 2, -1, 2, 11, -1, 11, b, b, false);
/*   16:1789 */     a(paramaqu, parambjb, 0, -1, 0, 1, -1, 11, a, a, false);
/*   17:1790 */     a(paramaqu, parambjb, 12, -1, 0, 13, -1, 11, a, a, false);
/*   18:1791 */     a(paramaqu, parambjb, 2, -1, 0, 11, -1, 1, a, a, false);
/*   19:1792 */     a(paramaqu, parambjb, 2, -1, 12, 11, -1, 13, a, a, false);
/*   20:     */     
/*   21:1794 */     a(paramaqu, parambjb, 0, 0, 0, 0, 0, 13, b, b, false);
/*   22:1795 */     a(paramaqu, parambjb, 13, 0, 0, 13, 0, 13, b, b, false);
/*   23:1796 */     a(paramaqu, parambjb, 1, 0, 0, 12, 0, 0, b, b, false);
/*   24:1797 */     a(paramaqu, parambjb, 1, 0, 13, 12, 0, 13, b, b, false);
/*   25:1799 */     for (int i = 2; i <= 11; i += 3)
/*   26:     */     {
/*   27:1800 */       a(paramaqu, e, 0, 0, i, parambjb);
/*   28:1801 */       a(paramaqu, e, 13, 0, i, parambjb);
/*   29:1802 */       a(paramaqu, e, i, 0, 0, parambjb);
/*   30:     */     }
/*   31:1805 */     a(paramaqu, parambjb, 2, 0, 3, 4, 0, 9, b, b, false);
/*   32:1806 */     a(paramaqu, parambjb, 9, 0, 3, 11, 0, 9, b, b, false);
/*   33:1807 */     a(paramaqu, parambjb, 4, 0, 9, 9, 0, 11, b, b, false);
/*   34:1808 */     a(paramaqu, b, 5, 0, 8, parambjb);
/*   35:1809 */     a(paramaqu, b, 8, 0, 8, parambjb);
/*   36:1810 */     a(paramaqu, b, 10, 0, 10, parambjb);
/*   37:1811 */     a(paramaqu, b, 3, 0, 10, parambjb);
/*   38:1812 */     a(paramaqu, parambjb, 3, 0, 3, 3, 0, 7, c, c, false);
/*   39:1813 */     a(paramaqu, parambjb, 10, 0, 3, 10, 0, 7, c, c, false);
/*   40:1814 */     a(paramaqu, parambjb, 6, 0, 10, 7, 0, 10, c, c, false);
/*   41:     */     
/*   42:1816 */     int i = 3;
/*   43:1817 */     for (int j = 0; j < 2; j++)
/*   44:     */     {
/*   45:1818 */       for (int k = 2; k <= 8; k += 3) {
/*   46:1819 */         a(paramaqu, parambjb, i, 0, k, i, 2, k, b, b, false);
/*   47:     */       }
/*   48:1821 */       i = 10;
/*   49:     */     }
/*   50:1823 */     a(paramaqu, parambjb, 5, 0, 10, 5, 2, 10, b, b, false);
/*   51:1824 */     a(paramaqu, parambjb, 8, 0, 10, 8, 2, 10, b, b, false);
/*   52:     */     
/*   53:1826 */     a(paramaqu, parambjb, 6, -1, 7, 7, -1, 8, c, c, false);
/*   54:     */     
/*   55:     */ 
/*   56:1829 */     a(paramaqu, parambjb, 6, -1, 3, 7, -1, 4, f, f, false);
/*   57:     */     
/*   58:1831 */     a(paramaqu, parambjb, 6, 1, 6);
/*   59:     */     
/*   60:1833 */     return true;
/*   61:     */   }
/*   62:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bla
 * JD-Core Version:    0.7.0.1
 */