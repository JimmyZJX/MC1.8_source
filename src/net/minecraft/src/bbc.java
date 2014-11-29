package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bbc
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:15 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("variant", bbd.class);
/*  7:17 */   public static final int b = bbd.a.a();
/*  8:18 */   public static final int M = bbd.b.a();
/*  9:19 */   public static final int N = bbd.c.a();
/* 10:20 */   public static final int O = bbd.d.a();
/* 11:   */   
/* 12:   */   public bbc()
/* 13:   */   {
/* 14:23 */     super(Material.rock);
/* 15:24 */     j(this.L.b().setData(a, bbd.a));
/* 16:25 */     setCreativeTab(CreativeTabs.tabBlock);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public int a(Block parambec)
/* 20:   */   {
/* 21:30 */     return ((bbd)parambec.getData(a)).a();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 25:   */   {
/* 26:35 */     for (bbd localbbd : bbd.values()) {
/* 27:36 */       paramList.add(new ItemStack(paramalq, 1, localbbd.a()));
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public Block instance(int paramInt)
/* 32:   */   {
/* 33:42 */     return instance().setData(a, bbd.a(paramInt));
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int c(Block parambec)
/* 37:   */   {
/* 38:48 */     return ((bbd)parambec.getData(a)).a();
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected bed e()
/* 42:   */   {
/* 43:53 */     return new bed(this, new IBlockData[] { a });
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbc
 * JD-Core Version:    0.7.0.1
 */