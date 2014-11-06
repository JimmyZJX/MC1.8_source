package net.minecraft.src;
/*   1:    */ public enum azj
/*   2:    */   implements va
/*   3:    */ { a(0,"",""),b(0,"",""),c(0,"","");
/*   4:    */   private static final azj[] d;
/*   5:    */   private final int e;
/*   6:    */   private final String f;
/*   7:    */   private final String g;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 64 */     d = new azj[values().length];
/*  12: 66 */     for (azj localazj : values()) {
/*  13: 67 */       d[localazj.a()] = localazj;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private azj(int paramInt, String paramString1, String paramString2)
/*  18:    */   {
/*  19: 72 */     this.e = paramInt;
/*  20: 73 */     this.f = paramString1;
/*  21: 74 */     this.g = paramString2;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a()
/*  25:    */   {
/*  26: 78 */     return this.e;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String toString()
/*  30:    */   {
/*  31: 87 */     return this.f;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static azj a(int paramInt)
/*  35:    */   {
/*  36: 91 */     if ((paramInt < 0) || (paramInt >= d.length)) {
/*  37: 92 */       paramInt = 0;
/*  38:    */     }
/*  39: 94 */     return d[paramInt];
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String l()
/*  43:    */   {
/*  44: 99 */     return this.f;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String c()
/*  48:    */   {
/*  49:103 */     return this.g;
/*  50:    */   }
/*  51:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azj
 * JD-Core Version:    0.7.0.1
 */