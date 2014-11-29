package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ayo
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:   */   public ayo()
/*  7:   */   {
/*  8:14 */     super(Material.rock);
/*  9:15 */     setCreativeTab(CreativeTabs.tabBlock);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 13:   */   {
/* 14:21 */     return Item.fromBlock(BlockList.obsidian);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public MapColor g(Block parambec)
/* 18:   */   {
/* 19:26 */     return MapColor.J;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayo
 * JD-Core Version:    0.7.0.1
 */