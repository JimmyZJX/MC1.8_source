package net.minecraft.src;
/*   1:    */ public enum EnumArmorMaterial
/*   2:    */ { LEATHER("leather", 5, new int[] {1, 3, 2, 1}, 15),
    			CHAIN("chainmail", 15, new int[] {2, 5, 4, 1}, 12),
    			IRON("iron", 15, new int[] {2, 6, 5, 2}, 9),
    			GOLD("gold", 7, new int[] {2, 5, 3, 1}, 25),
    			DIAMOND("diamond", 33, new int[] {3, 8, 6, 3}, 10);
/*   3:    */   private final String name;
/*   4:    */   private final int durabilityMultiplier;
/*   5:    */   private final int[] armorValue;
/*   6:    */   private final int i;
/*   7:    */   
/*   8:    */   private EnumArmorMaterial(String paramString, int paramInt1, int[] paramArrayOfInt, int paramInt2)
/*   9:    */   {
/*  10: 79 */     this.name = paramString;
/*  11: 80 */     this.durabilityMultiplier = paramInt1;
/*  12: 81 */     this.armorValue = paramArrayOfInt;
/*  13: 82 */     this.i = paramInt2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int getDurability(int slot)
/*  17:    */   {
/*  18: 86 */     return ItemArmor.getBaseDurability()[slot] * this.durabilityMultiplier;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public int getArmorValue(int slot)
/*  22:    */   {
/*  23: 90 */     return this.armorValue[slot];
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int a()
/*  27:    */   {
/*  28: 94 */     return this.i;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public Item getItem()
/*  32:    */   {
/*  33: 98 */     if (this == LEATHER) {
/*  34: 99 */       return ItemList.leather;
/*  35:    */     }
/*  36:100 */     if (this == CHAIN) {
/*  37:101 */       return ItemList.ironIngot;
/*  38:    */     }
/*  39:102 */     if (this == GOLD) {
/*  40:103 */       return ItemList.goldIngot;
/*  41:    */     }
/*  42:104 */     if (this == IRON) {
/*  43:105 */       return ItemList.ironIngot;
/*  44:    */     }
/*  45:106 */     if (this == DIAMOND) {
/*  46:107 */       return ItemList.diamond;
/*  47:    */     }
/*  48:109 */     return null;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getName()
/*  52:    */   {
/*  53:113 */     return this.name;
/*  54:    */   }
/*  55:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajp
 * JD-Core Version:    0.7.0.1
 */