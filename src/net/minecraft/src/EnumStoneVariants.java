package net.minecraft.src;
/*   1:    */ public enum EnumStoneVariants
/*   2:    */   implements va
/*   3:    */ { STONE(0,"stone"),GRANITE(1,"granite"),GRANITE_SMOOTH(2,"smooth_granite","graniteSmooth"),DIORITE(3,"diorite"),
				DIORITE_SMOOTH(4,"smooth_diorite","dioriteSmooth"),ANDESITE(5,"andesite"),ANDESITE_SMOOTH(6,"smooth_andesite","andesiteSmooth");
/*   4:    */   private static final EnumStoneVariants[] h;
/*   5:    */   private final int i;
/*   6:    */   private final String j;
/*   7:    */   private final String k;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 78 */     h = new EnumStoneVariants[values().length];
/*  12: 80 */     for (EnumStoneVariants localbbb : values()) {
/*  13: 81 */       h[localbbb.a()] = localbbb;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private EnumStoneVariants(int paramInt, String paramString)
/*  18:    */   {
/*  19: 86 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private EnumStoneVariants(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24: 90 */     this.i = paramInt;
/*  25: 91 */     this.j = paramString1;
/*  26: 92 */     this.k = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a()
/*  30:    */   {
/*  31: 96 */     return this.i;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36:105 */     return this.j;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static EnumStoneVariants a(int paramInt)
/*  40:    */   {
/*  41:109 */     if ((paramInt < 0) || (paramInt >= h.length)) {
/*  42:110 */       paramInt = 0;
/*  43:    */     }
/*  44:112 */     return h[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String toString2()
/*  48:    */   {
/*  49:117 */     return this.j;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String c()
/*  53:    */   {
/*  54:121 */     return this.k;
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbb
 * JD-Core Version:    0.7.0.1
 */