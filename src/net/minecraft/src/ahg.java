package net.minecraft.src;
/*   1:    */ public enum ahg
/*   2:    */ { FULL(0,"options.chat.visibility.full"),SYSTEM(1,"options.chat.visibility.system"),HIDDEN(0,"options.chat.visibility.hidden");
/*   3:    */   private static final ahg[] d;
/*   4:    */   private final int e;
/*   5:    */   private final String f;
/*   6:    */   
/*   7:    */   private ahg(int paramInt, String paramString)
/*   8:    */   {
/*   9: 89 */     this.e = paramInt;
/*  10: 90 */     this.f = paramString;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public int a()
/*  14:    */   {
/*  15: 94 */     return this.e;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public static ahg a(int paramInt)
/*  19:    */   {
/*  20: 98 */     return d[(paramInt % d.length)];
/*  21:    */   }
/*  22:    */   
/*  23:    */   static
/*  24:    */   {
/*  25: 84 */     d = new ahg[values().length];
/*  26:102 */     for (ahg localahg : values()) {
/*  27:103 */       d[localahg.e] = localahg;
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String b()
/*  32:    */   {
/*  33:108 */     return this.f;
/*  34:    */   }
/*  35:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahg
 * JD-Core Version:    0.7.0.1
 */