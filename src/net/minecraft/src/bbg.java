package net.minecraft.src;
/*   1:    */ public enum bbg
/*   2:    */   implements va
/*   3:    */ { a(0,"stone"),b(1,"sandstone","sand"),c(2,"wood_old","wood"),d(3,"cobblestone","cobble"),
				e(4,"brick"),f(5,"stone_brick","smoothStoneBrick"),g(6,"nether_brick","netherBrick"),h(7,"quartz");
/*   4:    */   private static final bbg[] i;
/*   5:    */   private final int j;
/*   6:    */   private final String k;
/*   7:    */   private final String l;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:139 */     i = new bbg[values().length];
/*  12:141 */     for (bbg localbbg : values()) {
/*  13:142 */       i[localbbg.a()] = localbbg;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private bbg(int paramInt, String paramString)
/*  18:    */   {
/*  19:147 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private bbg(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24:151 */     this.j = paramInt;
/*  25:152 */     this.k = paramString1;
/*  26:153 */     this.l = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a()
/*  30:    */   {
/*  31:157 */     return this.j;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36:166 */     return this.k;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static bbg a(int paramInt)
/*  40:    */   {
/*  41:170 */     if ((paramInt < 0) || (paramInt >= i.length)) {
/*  42:171 */       paramInt = 0;
/*  43:    */     }
/*  44:173 */     return i[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String l()
/*  48:    */   {
/*  49:178 */     return this.k;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String c()
/*  53:    */   {
/*  54:182 */     return this.l;
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbg
 * JD-Core Version:    0.7.0.1
 */