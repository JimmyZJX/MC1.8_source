package net.minecraft.src;
/*   1:    */ public enum bbi
/*   2:    */   implements va
/*   3:    */ { a(0,""),b(0,""),c(0,""); // TODO: BROKEN
/*   4:    */   private static final bbi[] d;
/*   5:    */   private final int e;
/*   6:    */   private final String f;
/*   7:    */   
/*   8:    */   static
/*   9:    */   {
/*  10:156 */     d = new bbi[values().length];
/*  11:158 */     for (bbi localbbi : values()) {
/*  12:159 */       d[localbbi.a()] = localbbi;
/*  13:    */     }
/*  14:    */   }
/*  15:    */   
/*  16:    */   private bbi(int paramInt, String paramString)
/*  17:    */   {
/*  18:164 */     this.e = paramInt;
/*  19:165 */     this.f = paramString;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int a()
/*  23:    */   {
/*  24:169 */     return this.e;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String toString()
/*  28:    */   {
/*  29:174 */     return this.f;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static bbi a(int paramInt)
/*  33:    */   {
/*  34:178 */     if ((paramInt < 0) || (paramInt >= d.length)) {
/*  35:179 */       paramInt = 0;
/*  36:    */     }
/*  37:181 */     return d[paramInt];
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String toString2()
/*  41:    */   {
/*  42:186 */     return this.f;
/*  43:    */   }
/*  44:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbi
 * JD-Core Version:    0.7.0.1
 */