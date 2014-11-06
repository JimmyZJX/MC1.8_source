package net.minecraft.src;
/*   1:    */ public enum bbd
/*   2:    */   implements va
/*   3:    */ { a(0,"",""),b(0,"",""),c(0,"",""),d(0,"","");
/*   4:    */   private static final bbd[] e;
/*   5:    */   private final int f;
/*   6:    */   private final String g;
/*   7:    */   private final String h;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 69 */     e = new bbd[values().length];
/*  12: 71 */     for (bbd localbbd : values()) {
/*  13: 72 */       e[localbbd.a()] = localbbd;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private bbd(int paramInt, String paramString1, String paramString2)
/*  18:    */   {
/*  19: 77 */     this.f = paramInt;
/*  20: 78 */     this.g = paramString1;
/*  21: 79 */     this.h = paramString2;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a()
/*  25:    */   {
/*  26: 83 */     return this.f;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String toString()
/*  30:    */   {
/*  31: 92 */     return this.g;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static bbd a(int paramInt)
/*  35:    */   {
/*  36: 96 */     if ((paramInt < 0) || (paramInt >= e.length)) {
/*  37: 97 */       paramInt = 0;
/*  38:    */     }
/*  39: 99 */     return e[paramInt];
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String l()
/*  43:    */   {
/*  44:104 */     return this.g;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String c()
/*  48:    */   {
/*  49:108 */     return this.h;
/*  50:    */   }
/*  51:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbd
 * JD-Core Version:    0.7.0.1
 */