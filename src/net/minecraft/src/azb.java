package net.minecraft.src;
/*  1:   */ public class azb
/*  2:   */   extends BlockMineral
/*  3:   */ {
/*  4:   */   public azb(MapColor paramboh)
/*  5:   */   {
/*  6:13 */     super(paramboh);
/*  7:14 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  8:   */   }
/*  9:   */   
/* 10:   */   public boolean blockType_g()
/* 11:   */   {
/* 12:19 */     return true;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int getRedStoneSignal(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/* 16:   */   {
/* 17:24 */     return 15;
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azb
 * JD-Core Version:    0.7.0.1
 */