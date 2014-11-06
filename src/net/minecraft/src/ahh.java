package net.minecraft.src;
/*  1:   */ public enum ahh
/*  2:   */ { a(0,""),b(0,""),c(0,""),d(0,""),e(0,""),f(0,""),g(0,"");
/*  3:   */   private final int h;
/*  4:   */   private final int i;
/*  5:   */   private final String j;
/*  6:   */   private final ho k;
/*  7:   */   
/*  8:   */   private ahh(int paramInt, String paramString)
/*  9:   */   {
/* 10:22 */     this.h = paramInt;
/* 11:23 */     this.i = (1 << paramInt);
/* 12:24 */     this.j = paramString;
/* 13:25 */     this.k = new hz("options.modelPart." + paramString, new Object[0]);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int a()
/* 17:   */   {
/* 18:29 */     return this.i;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int b()
/* 22:   */   {
/* 23:33 */     return this.h;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String c()
/* 27:   */   {
/* 28:37 */     return this.j;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public ho d()
/* 32:   */   {
/* 33:41 */     return this.k;
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahh
 * JD-Core Version:    0.7.0.1
 */