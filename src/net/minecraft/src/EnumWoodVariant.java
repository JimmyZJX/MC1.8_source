package net.minecraft.src;
/*   1:    */ public enum EnumWoodVariant
/*   2:    */   implements va
/*   3:    */ { OAK(0,"oak"),SPRUCE(1,"spruce"),BIRCH(2,"birch"),JUNGLE(3,"jungle"),ACACIA(4,"acacia"),DARK_OAK(5,"dark_oak","big_oak");
/*   4:    */   private static final EnumWoodVariant[] g;
/*   5:    */   private final int index;
/*   6:    */   private final String name1;
/*   7:    */   private final String name2;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 66 */     g = new EnumWoodVariant[values().length];
/*  12: 68 */     for (EnumWoodVariant localayx : values()) {
/*  13: 69 */       g[localayx.getIndex()] = localayx;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private EnumWoodVariant(int paramInt, String paramString)
/*  18:    */   {
/*  19: 74 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private EnumWoodVariant(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24: 78 */     this.index = paramInt;
/*  25: 79 */     this.name1 = paramString1;
/*  26: 80 */     this.name2 = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int getIndex()
/*  30:    */   {
/*  31: 84 */     return this.index;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36: 93 */     return this.name1;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static EnumWoodVariant fromIndex(int paramInt)
/*  40:    */   {
/*  41: 97 */     if ((paramInt < 0) || (paramInt >= g.length)) {
/*  42: 98 */       paramInt = 0;
/*  43:    */     }
/*  44:100 */     return g[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String toString2()
/*  48:    */   {
/*  49:105 */     return this.name1;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String c()
/*  53:    */   {
/*  54:109 */     return this.name2;
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayx
 * JD-Core Version:    0.7.0.1
 */