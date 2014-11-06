package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bnb
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   private ProtoBlock a;
/*    8:     */   private ProtoBlock b;
/*    9:     */   private ProtoBlock c;
/*   10:     */   private ProtoBlock d;
/*   11:     */   
/*   12:     */   public bnb() {}
/*   13:     */   
/*   14:     */   public bnb(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   15:     */   {
/*   16:1735 */     super(parambnk, paramInt);
/*   17:     */     
/*   18:1737 */     this.m = paramej;
/*   19:1738 */     this.l = parambjb;
/*   20:     */     
/*   21:1740 */     this.a = a(paramRandom);
/*   22:1741 */     this.b = a(paramRandom);
/*   23:1742 */     this.c = a(paramRandom);
/*   24:1743 */     this.d = a(paramRandom);
/*   25:     */   }
/*   26:     */   
/*   27:     */   protected void a(NBTTagCompound paramfn)
/*   28:     */   {
/*   29:1748 */     super.a(paramfn);
/*   30:1749 */     paramfn.setInt("CA", ProtoBlock.c.b(this.a));
/*   31:1750 */     paramfn.setInt("CB", ProtoBlock.c.b(this.b));
/*   32:1751 */     paramfn.setInt("CC", ProtoBlock.c.b(this.c));
/*   33:1752 */     paramfn.setInt("CD", ProtoBlock.c.b(this.d));
/*   34:     */   }
/*   35:     */   
/*   36:     */   protected void b(NBTTagCompound paramfn)
/*   37:     */   {
/*   38:1757 */     super.b(paramfn);
/*   39:1758 */     this.a = ProtoBlock.c(paramfn.getInteger("CA"));
/*   40:1759 */     this.b = ProtoBlock.c(paramfn.getInteger("CB"));
/*   41:1760 */     this.c = ProtoBlock.c(paramfn.getInteger("CC"));
/*   42:1761 */     this.d = ProtoBlock.c(paramfn.getInteger("CD"));
/*   43:     */   }
/*   44:     */   
/*   45:     */   private ProtoBlock a(Random paramRandom)
/*   46:     */   {
/*   47:1765 */     switch (paramRandom.nextInt(5))
/*   48:     */     {
/*   49:     */     default: 
/*   50:1767 */       return BlockList.aj;
/*   51:     */     case 0: 
/*   52:1769 */       return BlockList.cb;
/*   53:     */     }
/*   54:1771 */     //return aty.cc;
/*   55:     */   }
/*   56:     */   
/*   57:     */   public static bnb a(bnk parambnk, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   58:     */   {
/*   59:1776 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 13, 4, 9, paramej);
/*   60:1778 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   61:1779 */       return null;
/*   62:     */     }
/*   63:1782 */     return new bnb(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   64:     */   }
/*   65:     */   
/*   66:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   67:     */   {
/*   68:1787 */     if (this.h < 0)
/*   69:     */     {
/*   70:1788 */       this.h = b(paramaqu, parambjb);
/*   71:1789 */       if (this.h < 0) {
/*   72:1790 */         return true;
/*   73:     */       }
/*   74:1792 */       this.l.a(0, this.h - this.l.e + 4 - 1, 0);
/*   75:     */     }
/*   76:1796 */     a(paramaqu, parambjb, 0, 1, 0, 12, 4, 8, BlockList.air.instance(), BlockList.air.instance(), false);
/*   77:     */     
/*   78:     */ 
/*   79:1799 */     a(paramaqu, parambjb, 1, 0, 1, 2, 0, 7, BlockList.ak.instance(), BlockList.ak.instance(), false);
/*   80:1800 */     a(paramaqu, parambjb, 4, 0, 1, 5, 0, 7, BlockList.ak.instance(), BlockList.ak.instance(), false);
/*   81:1801 */     a(paramaqu, parambjb, 7, 0, 1, 8, 0, 7, BlockList.ak.instance(), BlockList.ak.instance(), false);
/*   82:1802 */     a(paramaqu, parambjb, 10, 0, 1, 11, 0, 7, BlockList.ak.instance(), BlockList.ak.instance(), false);
/*   83:     */     
/*   84:1804 */     a(paramaqu, parambjb, 0, 0, 0, 0, 0, 8, BlockList.log.instance(), BlockList.log.instance(), false);
/*   85:1805 */     a(paramaqu, parambjb, 6, 0, 0, 6, 0, 8, BlockList.log.instance(), BlockList.log.instance(), false);
/*   86:1806 */     a(paramaqu, parambjb, 12, 0, 0, 12, 0, 8, BlockList.log.instance(), BlockList.log.instance(), false);
/*   87:1807 */     a(paramaqu, parambjb, 1, 0, 0, 11, 0, 0, BlockList.log.instance(), BlockList.log.instance(), false);
/*   88:1808 */     a(paramaqu, parambjb, 1, 0, 8, 11, 0, 8, BlockList.log.instance(), BlockList.log.instance(), false);
/*   89:     */     
/*   90:1810 */     a(paramaqu, parambjb, 3, 0, 1, 3, 0, 7, BlockList.j.instance(), BlockList.j.instance(), false);
/*   91:1811 */     a(paramaqu, parambjb, 9, 0, 1, 9, 0, 7, BlockList.j.instance(), BlockList.j.instance(), false);
/*   92:1813 */     for (int i = 1; i <= 7; i++)
/*   93:     */     {
/*   94:1814 */       a(paramaqu, this.a.a(MathUtils.nextInt(paramRandom, 2, 7)), 1, 1, i, parambjb);
/*   95:1815 */       a(paramaqu, this.a.a(MathUtils.nextInt(paramRandom, 2, 7)), 2, 1, i, parambjb);
/*   96:1816 */       a(paramaqu, this.b.a(MathUtils.nextInt(paramRandom, 2, 7)), 4, 1, i, parambjb);
/*   97:1817 */       a(paramaqu, this.b.a(MathUtils.nextInt(paramRandom, 2, 7)), 5, 1, i, parambjb);
/*   98:1818 */       a(paramaqu, this.c.a(MathUtils.nextInt(paramRandom, 2, 7)), 7, 1, i, parambjb);
/*   99:1819 */       a(paramaqu, this.c.a(MathUtils.nextInt(paramRandom, 2, 7)), 8, 1, i, parambjb);
/*  100:1820 */       a(paramaqu, this.d.a(MathUtils.nextInt(paramRandom, 2, 7)), 10, 1, i, parambjb);
/*  101:1821 */       a(paramaqu, this.d.a(MathUtils.nextInt(paramRandom, 2, 7)), 11, 1, i, parambjb);
/*  102:     */     }
/*  103:1824 */     for (int i = 0; i < 9; i++) {
/*  104:1825 */       for (int j = 0; j < 13; j++)
/*  105:     */       {
/*  106:1826 */         b(paramaqu, j, 4, i, parambjb);
/*  107:1827 */         b(paramaqu, BlockList.dirt.instance(), j, -1, i, parambjb);
/*  108:     */       }
/*  109:     */     }
/*  110:1831 */     return true;
/*  111:     */   }
/*  112:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnb
 * JD-Core Version:    0.7.0.1
 */