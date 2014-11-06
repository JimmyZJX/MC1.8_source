package net.minecraft.src;
/*   1:    */ public enum EnumCobblestoneVariant
/*   2:    */   implements va
/*   3:    */ { a(0,"cobblestone","normal"),b(1,"mossy_cobblestone","mossy");
/*   4:    */   private static final EnumCobblestoneVariant[] c;
/*   5:    */   private final int d;
/*   6:    */   private final String e;
/*   7:    */   private String f;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:176 */     c = new EnumCobblestoneVariant[values().length];
/*  12:178 */     for (EnumCobblestoneVariant localbby : values()) {
/*  13:179 */       c[localbby.a()] = localbby;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private EnumCobblestoneVariant(int paramInt, String paramString1, String paramString2)
/*  18:    */   {
/*  19:184 */     this.d = paramInt;
/*  20:185 */     this.e = paramString1;
/*  21:186 */     this.f = paramString2;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a()
/*  25:    */   {
/*  26:190 */     return this.d;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String toString()
/*  30:    */   {
/*  31:199 */     return this.e;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static EnumCobblestoneVariant a(int paramInt)
/*  35:    */   {
/*  36:203 */     if ((paramInt < 0) || (paramInt >= c.length)) {
/*  37:204 */       paramInt = 0;
/*  38:    */     }
/*  39:206 */     return c[paramInt];
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String l()
/*  43:    */   {
/*  44:211 */     return this.e;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String c()
/*  48:    */   {
/*  49:215 */     return this.f;
/*  50:    */   }
/*  51:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bby
 * JD-Core Version:    0.7.0.1
 */