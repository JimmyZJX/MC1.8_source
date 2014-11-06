package net.minecraft.src;
/*   1:    */ public enum EnumArmorMaterial
/*   2:    */ { LEATHER("leather", 5, new int[] {1, 3, 2, 1}, 15),
    			CHAIN("chainmail", 15, new int[] {2, 5, 4, 1}, 12),
    			IRON("iron", 15, new int[] {2, 6, 5, 2}, 9),
    			d("gold", 7, new int[] {2, 5, 3, 1}, 25),
    			e("diamond", 33, new int[] {3, 8, 6, 3}, 10); // TODO: BROKEN
/*   3:    */   private final String f;
/*   4:    */   private final int g;
/*   5:    */   private final int[] h;
/*   6:    */   private final int i;
/*   7:    */   
/*   8:    */   private EnumArmorMaterial(String paramString, int paramInt1, int[] paramArrayOfInt, int paramInt2)
/*   9:    */   {
/*  10: 79 */     this.f = paramString;
/*  11: 80 */     this.g = paramInt1;
/*  12: 81 */     this.h = paramArrayOfInt;
/*  13: 82 */     this.i = paramInt2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int a(int paramInt)
/*  17:    */   {
/*  18: 86 */     return ajn.d()[paramInt] * this.g;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public int b(int paramInt)
/*  22:    */   {
/*  23: 90 */     return this.h[paramInt];
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int a()
/*  27:    */   {
/*  28: 94 */     return this.i;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public Item b()
/*  32:    */   {
/*  33: 98 */     if (this == LEATHER) {
/*  34: 99 */       return ItemList.leather;
/*  35:    */     }
/*  36:100 */     if (this == CHAIN) {
/*  37:101 */       return ItemList.j;
/*  38:    */     }
/*  39:102 */     if (this == d) {
/*  40:103 */       return ItemList.k;
/*  41:    */     }
/*  42:104 */     if (this == IRON) {
/*  43:105 */       return ItemList.j;
/*  44:    */     }
/*  45:106 */     if (this == e) {
/*  46:107 */       return ItemList.diamond;
/*  47:    */     }
/*  48:109 */     return null;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String c()
/*  52:    */   {
/*  53:113 */     return this.f;
/*  54:    */   }
/*  55:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajp
 * JD-Core Version:    0.7.0.1
 */