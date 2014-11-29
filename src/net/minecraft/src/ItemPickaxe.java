package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Sets;
/*  2:   */ import java.util.Set;
/*  3:   */ 
/*  4:   */ public class ItemPickaxe
/*  5:   */   extends ItemTool
/*  6:   */ {
/*  7:11 */   private static final Set<BlockType> blocksEffectiveAgainst = Sets.newHashSet(new BlockType[] {
				BlockList.activatorRail, BlockList.coalOre, BlockList.cobblestone, BlockList.detector_rail,
				BlockList.diamondBlock, BlockList.diamondOre, BlockList.T, BlockList.D,
				BlockList.R, BlockList.goldOre, BlockList.aI, BlockList.S,
				BlockList.ironOre, BlockList.y, BlockList.lapisOre, BlockList.aD,
				BlockList.mossyCobblestone, BlockList.netherrack, BlockList.cB, BlockList.av,
				BlockList.redstoneOre, BlockList.A, BlockList.cM, BlockList.stone,
				BlockList.U 
			});
/*  8:   */   
/*  9:   */   protected ItemPickaxe(EnumToolMaterial paramami)
/* 10:   */   {
/* 11:40 */     super(2.0F, paramami, blocksEffectiveAgainst);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean canHarvestBlock(BlockType paramatr)
/* 15:   */   {
/* 16:45 */     if (paramatr == BlockList.obsidian) {
/* 17:46 */       return this.toolMaterial.getHarvestLevel() == 3;
/* 18:   */     }
/* 19:48 */     if ((paramatr == BlockList.diamondBlock) || (paramatr == BlockList.diamondOre)) {
/* 20:49 */       return this.toolMaterial.getHarvestLevel() >= 2;
/* 21:   */     }
/* 22:51 */     if ((paramatr == BlockList.bP) || (paramatr == BlockList.emeraldBlock)) {
/* 23:52 */       return this.toolMaterial.getHarvestLevel() >= 2;
/* 24:   */     }
/* 25:54 */     if ((paramatr == BlockList.R) || (paramatr == BlockList.goldOre)) {
/* 26:55 */       return this.toolMaterial.getHarvestLevel() >= 2;
/* 27:   */     }
/* 28:57 */     if ((paramatr == BlockList.S) || (paramatr == BlockList.ironOre)) {
/* 29:58 */       return this.toolMaterial.getHarvestLevel() >= 1;
/* 30:   */     }
/* 31:60 */     if ((paramatr == BlockList.y) || (paramatr == BlockList.lapisOre)) {
/* 32:61 */       return this.toolMaterial.getHarvestLevel() >= 1;
/* 33:   */     }
/* 34:63 */     if ((paramatr == BlockList.redstoneOre) || (paramatr == BlockList.aD)) {
/* 35:64 */       return this.toolMaterial.getHarvestLevel() >= 2;
/* 36:   */     }
/* 37:66 */     if (paramatr.getMaterial() == Material.rock) {
/* 38:67 */       return true;
/* 39:   */     }
/* 40:69 */     if (paramatr.getMaterial() == Material.f) {
/* 41:70 */       return true;
/* 42:   */     }
/* 43:72 */     if (paramatr.getMaterial() == Material.g) {
/* 44:73 */       return true;
/* 45:   */     }
/* 46:75 */     return false;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public float getStrVsBlock(ItemStack paramamj, BlockType paramatr)
/* 50:   */   {
/* 51:80 */     if ((paramatr.getMaterial() == Material.f) || (paramatr.getMaterial() == Material.g) || (paramatr.getMaterial() == Material.rock)) {
/* 52:81 */       return this.efficiencyOnProperMaterial;
/* 53:   */     }
/* 54:83 */     return super.getStrVsBlock(paramamj, paramatr);
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amu
 * JD-Core Version:    0.7.0.1
 */