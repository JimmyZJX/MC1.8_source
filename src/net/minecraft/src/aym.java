package net.minecraft.src;
/*   1:    */ public enum aym
/*   2:    */   implements va
/*   3:    */ { a(0,"red_sandstone");
/*   4:    */   private static final aym[] b;
/*   5:    */   private final int c;
/*   6:    */   private final String d;
/*   7:    */   
/*   8:    */   static
/*   9:    */   {
/*  10:128 */     b = new aym[values().length];
/*  11:130 */     for (aym localaym : values()) {
/*  12:131 */       b[localaym.a()] = localaym;
/*  13:    */     }
/*  14:    */   }
/*  15:    */   
/*  16:    */   private aym(int paramInt, String paramString)
/*  17:    */   {
/*  18:136 */     this.c = paramInt;
/*  19:137 */     this.d = paramString;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int a()
/*  23:    */   {
/*  24:141 */     return this.c;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String toString()
/*  28:    */   {
/*  29:150 */     return this.d;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static aym a(int paramInt)
/*  33:    */   {
/*  34:154 */     if ((paramInt < 0) || (paramInt >= b.length)) {
/*  35:155 */       paramInt = 0;
/*  36:    */     }
/*  37:157 */     return b[paramInt];
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String toString2()
/*  41:    */   {
/*  42:162 */     return this.d;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String c()
/*  46:    */   {
/*  47:166 */     return this.d;
/*  48:    */   }
/*  49:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aym
 * JD-Core Version:    0.7.0.1
 */