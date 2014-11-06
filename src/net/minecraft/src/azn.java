package net.minecraft.src;
/*   1:    */ public enum azn
/*   2:    */   implements va
/*   3:    */ { a(0,"",""),b(0,"",""),c(0,"",""),d(0,"",""),e(0,"",""); // TODO: BROKEN
/*   4:    */   private static final azn[] f;
/*   5:    */   private final int g;
/*   6:    */   private final String h;
/*   7:    */   private final String i;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:110 */     f = new azn[values().length];
/*  12:112 */     for (azn localazn : values()) {
/*  13:113 */       f[localazn.a()] = localazn;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private azn(int paramInt, String paramString1, String paramString2)
/*  18:    */   {
/*  19:118 */     this.g = paramInt;
/*  20:119 */     this.h = paramString1;
/*  21:120 */     this.i = paramString2;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a()
/*  25:    */   {
/*  26:124 */     return this.g;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String toString()
/*  30:    */   {
/*  31:133 */     return this.i;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static azn a(int paramInt)
/*  35:    */   {
/*  36:137 */     if ((paramInt < 0) || (paramInt >= f.length)) {
/*  37:138 */       paramInt = 0;
/*  38:    */     }
/*  39:140 */     return f[paramInt];
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String l()
/*  43:    */   {
/*  44:145 */     return this.h;
/*  45:    */   }
/*  46:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azn
 * JD-Core Version:    0.7.0.1
 */