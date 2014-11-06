package net.minecraft.src;
/*   1:    */ public enum bae
/*   2:    */   implements va
/*   3:    */ { a(0,"",""),b(0,"",""),c(0,"","");
/*   4:    */   private static final bae[] d;
/*   5:    */   private final int e;
/*   6:    */   private final String f;
/*   7:    */   private final String g;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 63 */     d = new bae[values().length];
/*  12: 65 */     for (bae localbae : values()) {
/*  13: 66 */       d[localbae.a()] = localbae;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private bae(int paramInt, String paramString1, String paramString2)
/*  18:    */   {
/*  19: 71 */     this.e = paramInt;
/*  20: 72 */     this.f = paramString1;
/*  21: 73 */     this.g = paramString2;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a()
/*  25:    */   {
/*  26: 77 */     return this.e;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String toString()
/*  30:    */   {
/*  31: 86 */     return this.f;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static bae a(int paramInt)
/*  35:    */   {
/*  36: 90 */     if ((paramInt < 0) || (paramInt >= d.length)) {
/*  37: 91 */       paramInt = 0;
/*  38:    */     }
/*  39: 93 */     return d[paramInt];
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String l()
/*  43:    */   {
/*  44: 98 */     return this.f;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String c()
/*  48:    */   {
/*  49:102 */     return this.g;
/*  50:    */   }
/*  51:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bae
 * JD-Core Version:    0.7.0.1
 */