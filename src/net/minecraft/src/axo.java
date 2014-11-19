package net.minecraft.src;
/*  1:   */ public enum axo
/*  2:   */   implements va
/*  3:   */ {X("x"),Y("y"),Z("z"),NONE("none");
/*  4:   */   private final String e;
/*  5:   */   
/*  6:   */   private axo(String paramString)
/*  7:   */   {
/*  8:64 */     this.e = paramString;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String toString()
/* 12:   */   {
/* 13:69 */     return this.e;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public static axo a(EnumAxis paramel)
/* 17:   */   {
/* 18:73 */     switch (axn.a[paramel.ordinal()])
/* 19:   */     {
/* 20:   */     case 1: 
/* 21:75 */       return X;
/* 22:   */     case 2: 
/* 23:77 */       return Y;
/* 24:   */     case 3: 
/* 25:79 */       return Z;
/* 26:   */     }
/* 27:82 */     return NONE;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String toString2()
/* 31:   */   {
/* 32:87 */     return this.e;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axo
 * JD-Core Version:    0.7.0.1
 */