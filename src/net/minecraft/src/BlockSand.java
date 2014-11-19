package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class BlockSand
/*  4:   */   extends avt
/*  5:   */ {
/*  6:15 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("variant", bac.class);
/*  7:   */   
/*  8:   */   public BlockSand()
/*  9:   */   {
/* 10:18 */     j(this.L.b().a(a, bac.a));
/* 11:   */   }
/* 12:   */   
/* 13:   */   public int a(Block parambec)
/* 14:   */   {
/* 15:23 */     return ((bac)parambec.getProperty(a)).a();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 19:   */   {
/* 20:28 */     for (bac localbac : bac.values()) {
/* 21:29 */       paramList.add(new ItemStack(paramalq, 1, localbac.a()));
/* 22:   */     }
/* 23:   */   }
/* 24:   */   
/* 25:   */   public MapColor g(Block parambec)
/* 26:   */   {
/* 27:35 */     return ((bac)parambec.getProperty(a)).c();
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Block a(int paramInt)
/* 31:   */   {
/* 32:40 */     return instance().a(a, bac.a(paramInt));
/* 33:   */   }
/* 34:   */   
/* 35:   */   public int c(Block parambec)
/* 36:   */   {
/* 37:46 */     return ((bac)parambec.getProperty(a)).a();
/* 38:   */   }
/* 39:   */   
/* 40:   */   protected bed e()
/* 41:   */   {
/* 42:51 */     return new bed(this, new IBlockData[] { a });
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bab
 * JD-Core Version:    0.7.0.1
 */