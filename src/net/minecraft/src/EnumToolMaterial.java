package net.minecraft.src;
/*   1:    */ public enum EnumToolMaterial
/*   2:    */ { WOOD(0, 59, 2f, 0f, 15),
				STONE(1, 131, 4f, 1f, 5),
				IRON(2, 250, 6f, 2f, 14),
				DIAMOND(3, 1561, 8f, 0.0f, 10),
				GOLD(0, 32, 12f, 0f, 22); // TODO: BROKEN
/*   3:    */   private final int harvestLevel;
/*   4:    */   private final int maxUses;
/*   5:    */   private final float efficiencyOnProperMaterial;
/*   6:    */   private final float damageVsEntity;
/*   7:    */   private final int enchantability;
/*   8:    */   
/*   9:    */   private EnumToolMaterial(int level, int uses, float efficiency, float damage, int enchantability)
/*  10:    */   {
/*  11: 92 */     this.harvestLevel = level;
/*  12: 93 */     this.maxUses = uses;
/*  13: 94 */     this.efficiencyOnProperMaterial = efficiency;
/*  14: 95 */     this.damageVsEntity = damage;
/*  15: 96 */     this.enchantability = enchantability;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public int getMaxUses()
/*  19:    */   {
/*  20:100 */     return this.maxUses;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public float getEfficiencyOnProperMaterial()
/*  24:    */   {
/*  25:104 */     return this.efficiencyOnProperMaterial;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public float getDamageVsEntity()
/*  29:    */   {
/*  30:108 */     return this.damageVsEntity;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public int getHarvestLevel()
/*  34:    */   {
/*  35:112 */     return this.harvestLevel;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public int getEnchantability()
/*  39:    */   {
/*  40:116 */     return this.enchantability;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Item f()
/*  44:    */   {
/*  45:120 */     if (this == WOOD) {
/*  46:121 */       return Item.fromProtoBlock(BlockList.planks);
/*  47:    */     }
/*  48:122 */     if (this == STONE) {
/*  49:123 */       return Item.fromProtoBlock(BlockList.cobblestone);
/*  50:    */     }
/*  51:124 */     if (this == GOLD) {
/*  52:125 */       return ItemList.k;
/*  53:    */     }
/*  54:126 */     if (this == IRON) {
/*  55:127 */       return ItemList.j;
/*  56:    */     }
/*  57:128 */     if (this == DIAMOND) {
/*  58:129 */       return ItemList.diamond;
/*  59:    */     }
/*  60:131 */     return null;
/*  61:    */   }
/*  62:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ami
 * JD-Core Version:    0.7.0.1
 */