package net.minecraft.src;
/*   1:    */ public enum avd
/*   2:    */   implements va
/*   3:    */ { a(0,""),b(0,""),c(0,"");
/*   4:    */   private static final avd[] d;
/*   5:    */   private final int e;
/*   6:    */   private final String f;
/*   7:    */   private final String g;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 90 */     d = new avd[values().length];
/*  12: 92 */     for (avd localavd : values()) {
/*  13: 93 */       d[localavd.a()] = localavd;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private avd(int paramInt, String paramString)
/*  18:    */   {
/*  19: 98 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private avd(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24:102 */     this.e = paramInt;
/*  25:103 */     this.f = paramString1;
/*  26:104 */     this.g = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a()
/*  30:    */   {
/*  31:108 */     return this.e;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String c()
/*  35:    */   {
/*  36:116 */     return this.g;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String toString()
/*  40:    */   {
/*  41:121 */     return this.f;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public static avd a(int paramInt)
/*  45:    */   {
/*  46:125 */     if ((paramInt < 0) || (paramInt >= d.length)) {
/*  47:126 */       paramInt = 0;
/*  48:    */     }
/*  49:128 */     return d[paramInt];
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String toString2()
/*  53:    */   {
/*  54:133 */     return this.f;
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avd
 * JD-Core Version:    0.7.0.1
 */