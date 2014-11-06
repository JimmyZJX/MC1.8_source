package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class azi
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:15 */   public static final bev a = bev.a("variant", azj.class);
/*  7:16 */   public static final int b = azj.a.a();
/*  8:17 */   public static final int M = azj.b.a();
/*  9:18 */   public static final int N = azj.c.a();
/* 10:   */   
/* 11:   */   public azi()
/* 12:   */   {
/* 13:21 */     super(Material.rock);
/* 14:22 */     j(this.L.b().a(a, azj.a));
/* 15:23 */     setCreativeTab(CreativeTabs.tabBlock);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int a(Block parambec)
/* 19:   */   {
/* 20:28 */     return ((azj)parambec.getProperty(a)).a();
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int c(Block parambec)
/* 24:   */   {
/* 25:33 */     return ((azj)parambec.getProperty(a)).a();
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected bed e()
/* 29:   */   {
/* 30:38 */     return new bed(this, new bex[] { a });
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Block a(int paramInt)
/* 34:   */   {
/* 35:43 */     return instance().a(a, azj.a(paramInt));
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/* 39:   */   {
/* 40:48 */     paramList.add(new ItemStack(paramalq, 1, b));
/* 41:49 */     paramList.add(new ItemStack(paramalq, 1, M));
/* 42:50 */     paramList.add(new ItemStack(paramalq, 1, N));
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azi
 * JD-Core Version:    0.7.0.1
 */