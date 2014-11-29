package net.minecraft.src;
/*  1:   */ public class BlockMineral
/*  2:   */   extends BlockType
/*  3:   */ {
/*  4:   */   private final MapColor a;
/*  5:   */   
/*  6:   */   public BlockMineral(MapColor paramboh)
/*  7:   */   {
/*  8:12 */     super(Material.f);
/*  9:13 */     this.a = paramboh;
/* 10:14 */     setCreativeTab(CreativeTabs.tabBlock);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public MapColor g(Block parambec)
/* 14:   */   {
/* 15:19 */     return this.a;
/* 16:   */   }
/* 17:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axq
 * JD-Core Version:    0.7.0.1
 */