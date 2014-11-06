package net.minecraft.src;
/*   1:    */ public enum avk
/*   2:    */   implements va
/*   3:    */ { a(0,""),b(0,""),c(0,""),d(0,""),e(0,""),f(0,"");
/*   4:    */   private static final avk[] g;
/*   5:    */   private final int h;
/*   6:    */   private final String i;
/*   7:    */   private final String j;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:297 */     g = new avk[values().length];
/*  12:299 */     for (avk localavk : values()) {
/*  13:300 */       g[localavk.a()] = localavk;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private avk(int paramInt, String paramString)
/*  18:    */   {
/*  19:305 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private avk(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24:309 */     this.h = paramInt;
/*  25:310 */     this.i = paramString1;
/*  26:311 */     this.j = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a()
/*  30:    */   {
/*  31:315 */     return this.h;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36:324 */     return this.i;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static avk a(int paramInt)
/*  40:    */   {
/*  41:328 */     if ((paramInt < 0) || (paramInt >= g.length)) {
/*  42:329 */       paramInt = 0;
/*  43:    */     }
/*  44:331 */     return g[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String l()
/*  48:    */   {
/*  49:336 */     return this.i;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String c()
/*  53:    */   {
/*  54:340 */     return this.j;
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avk
 * JD-Core Version:    0.7.0.1
 */