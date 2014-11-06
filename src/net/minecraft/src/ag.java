package net.minecraft.src;
/*   1:    */ public enum ag
/*   2:    */ { a(0,""),b(0,""),c(0,""),d(0,""),e(0,""); // TODO: BROKEN
/*   3:    */   final int f;
/*   4:    */   final String g;
/*   5:    */   
/*   6:    */   private ag(int paramInt, String paramString)
/*   7:    */   {
/*   8:136 */     this.f = paramInt;
/*   9:137 */     this.g = paramString;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public int a()
/*  13:    */   {
/*  14:141 */     return this.f;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public String b()
/*  18:    */   {
/*  19:145 */     return this.g;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public static String[] c()
/*  23:    */   {
/*  24:149 */     String[] arrayOfString = new String[values().length];
/*  25:150 */     int i = 0;
/*  26:151 */     for (ag localag : values()) {
/*  27:152 */       arrayOfString[(i++)] = localag.b();
/*  28:    */     }
/*  29:154 */     return arrayOfString;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static ag a(String paramString)
/*  33:    */   {
/*  34:159 */     for (ag localag : values()) {
/*  35:160 */       if (localag.b().equals(paramString)) {
/*  36:161 */         return localag;
/*  37:    */       }
/*  38:    */     }
/*  39:164 */     return null;
/*  40:    */   }
/*  41:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ag
 * JD-Core Version:    0.7.0.1
 */