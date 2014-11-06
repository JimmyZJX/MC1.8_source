package net.minecraft.src;
/*  1:   */ public enum EnumGameType
/*  2:   */ { a(0,""),b(0,""),CREATIVE(0,""),d(0,""),e(0,"");
/*  3:   */   int f;
/*  4:   */   String g;
/*  5:   */   
/*  6:   */   private EnumGameType(int paramInt, String paramString)
/*  7:   */   {
/*  8:19 */     this.f = paramInt;
/*  9:20 */     this.g = paramString;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:24 */     return this.f;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String b()
/* 18:   */   {
/* 19:28 */     return this.g;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(aha paramaha)
/* 23:   */   {
/* 24:32 */     if (this == CREATIVE)
/* 25:   */     {
/* 26:33 */       paramaha.c = true;
/* 27:34 */       paramaha.d = true;
/* 28:35 */       paramaha.a = true;
/* 29:   */     }
/* 30:36 */     else if (this == e)
/* 31:   */     {
/* 32:37 */       paramaha.c = true;
/* 33:38 */       paramaha.d = false;
/* 34:39 */       paramaha.a = true;
/* 35:40 */       paramaha.b = true;
/* 36:   */     }
/* 37:   */     else
/* 38:   */     {
/* 39:42 */       paramaha.c = false;
/* 40:43 */       paramaha.d = false;
/* 41:44 */       paramaha.a = false;
/* 42:45 */       paramaha.b = false;
/* 43:   */     }
/* 44:47 */     paramaha.e = (!c());
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean c()
/* 48:   */   {
/* 49:51 */     return (this == d) || (this == e);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public boolean d()
/* 53:   */   {
/* 54:55 */     return this == CREATIVE;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public boolean e()
/* 58:   */   {
/* 59:59 */     return (this == b) || (this == d);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public static EnumGameType a(int paramInt)
/* 63:   */   {
/* 64:63 */     for (EnumGameType localarc : values()) { // TODO: BROKEN
/* 65:64 */       if (localarc.f == paramInt) {
/* 66:65 */         return localarc;
/* 67:   */       }
/* 68:   */     }
/* 69:68 */     return b;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public static EnumGameType a(String paramString)
/* 73:   */   {
/* 74:72 */     for (EnumGameType localarc : values()) { // TODO: BROKEN
/* 75:73 */       if (localarc.g.equals(paramString)) {
/* 76:74 */         return localarc;
/* 77:   */       }
/* 78:   */     }
/* 79:77 */     return b;
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arc
 * JD-Core Version:    0.7.0.1
 */