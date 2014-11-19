package net.minecraft.src;
/*   1:    */ public enum bac
/*   2:    */   implements va
/*   3:    */ { a(0,"sand","default",MapColor.d),b(1,"red_sand","red",MapColor.l);
/*   4:    */   private static final bac[] c;
/*   5:    */   private final int d;
/*   6:    */   private final String e;
/*   7:    */   private final MapColor f;
/*   8:    */   private final String g;
/*   9:    */   
/*  10:    */   static
/*  11:    */   {
/*  12: 66 */     c = new bac[values().length];
/*  13: 68 */     for (bac localbac : values()) {
/*  14: 69 */       c[localbac.a()] = localbac;
/*  15:    */     }
/*  16:    */   }
/*  17:    */   
/*  18:    */   private bac(int paramInt, String paramString1, String paramString2, MapColor paramboh)
/*  19:    */   {
/*  20: 74 */     this.d = paramInt;
/*  21: 75 */     this.e = paramString1;
/*  22: 76 */     this.f = paramboh;
/*  23: 77 */     this.g = paramString2;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int a()
/*  27:    */   {
/*  28: 81 */     return this.d;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String toString()
/*  32:    */   {
/*  33: 90 */     return this.e;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public MapColor c()
/*  37:    */   {
/*  38: 94 */     return this.f;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public static bac a(int paramInt)
/*  42:    */   {
/*  43: 98 */     if ((paramInt < 0) || (paramInt >= c.length)) {
/*  44: 99 */       paramInt = 0;
/*  45:    */     }
/*  46:101 */     return c[paramInt];
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String toString2()
/*  50:    */   {
/*  51:106 */     return this.e;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String d()
/*  55:    */   {
/*  56:110 */     return this.g;
/*  57:    */   }
/*  58:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bac
 * JD-Core Version:    0.7.0.1
 */