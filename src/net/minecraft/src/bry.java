package net.minecraft.src;
/*  1:   */ public class bry
/*  2:   */ {
/*  3:   */   private final bsd a;
/*  4:   */   private final String b;
/*  5:   */   private final bsk c;
/*  6:   */   private bsl d;
/*  7:   */   private String e;
/*  8:   */   
/*  9:   */   public bry(bsd parambsd, String paramString, bsk parambsk)
/* 10:   */   {
/* 11:16 */     this.a = parambsd;
/* 12:17 */     this.b = paramString;
/* 13:18 */     this.c = parambsk;
/* 14:19 */     this.e = paramString;
/* 15:20 */     this.d = parambsk.c();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public bsd a()
/* 19:   */   {
/* 20:24 */     return this.a;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public String b()
/* 24:   */   {
/* 25:28 */     return this.b;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public bsk c()
/* 29:   */   {
/* 30:32 */     return this.c;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String d()
/* 34:   */   {
/* 35:36 */     return this.e;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void a(String paramString)
/* 39:   */   {
/* 40:40 */     this.e = paramString;
/* 41:41 */     this.a.b(this);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public bsl e()
/* 45:   */   {
/* 46:45 */     return this.d;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void a(bsl parambsl)
/* 50:   */   {
/* 51:49 */     this.d = parambsl;
/* 52:50 */     this.a.b(this);
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bry
 * JD-Core Version:    0.7.0.1
 */