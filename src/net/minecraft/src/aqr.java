package net.minecraft.src;
/*   1:    */ class aqr
/*   2:    */ {
/*   3:    */   private String a;
/*   4:    */   private boolean b;
/*   5:    */   private int c;
/*   6:    */   private double d;
/*   7:    */   private final aqs e;
/*   8:    */   
/*   9:    */   public aqr(String paramString, aqs paramaqs)
/*  10:    */   {
/*  11:134 */     this.e = paramaqs;
/*  12:135 */     a(paramString);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void a(String paramString)
/*  16:    */   {
/*  17:139 */     this.a = paramString;
/*  18:140 */     this.b = Boolean.parseBoolean(paramString);
/*  19:141 */     this.c = (this.b ? 1 : 0);
/*  20:    */     try
/*  21:    */     {
/*  22:143 */       this.c = Integer.parseInt(paramString);
/*  23:    */     }
/*  24:    */     catch (NumberFormatException localNumberFormatException1) {}
/*  25:    */     try
/*  26:    */     {
/*  27:147 */       this.d = Double.parseDouble(paramString);
/*  28:    */     }
/*  29:    */     catch (NumberFormatException localNumberFormatException2) {}
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String a()
/*  33:    */   {
/*  34:153 */     return this.a;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean b()
/*  38:    */   {
/*  39:157 */     return this.b;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public int c()
/*  43:    */   {
/*  44:161 */     return this.c;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public aqs e()
/*  48:    */   {
/*  49:169 */     return this.e;
/*  50:    */   }
/*  51:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqr
 * JD-Core Version:    0.7.0.1
 */