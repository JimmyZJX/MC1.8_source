package net.minecraft.src;
/*  1:   */ public class hy
/*  2:   */   extends hj
/*  3:   */ {
/*  4:   */   private final String b;
/*  5:   */   
/*  6:   */   public hy(String paramString)
/*  7:   */   {
/*  8: 7 */     this.b = paramString;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String g()
/* 12:   */   {
/* 13:11 */     return this.b;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String e()
/* 17:   */   {
/* 18:16 */     return this.b;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public hy f()
/* 22:   */   {
/* 23:21 */     hy localhy = new hy(this.b);
/* 24:22 */     localhy.a(b().m());
/* 25:23 */     for (ho localho : a()) {
/* 26:24 */       localhy.a(localho.f());
/* 27:   */     }
/* 28:26 */     return localhy;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean equals(Object paramObject)
/* 32:   */   {
/* 33:31 */     if (this == paramObject) {
/* 34:32 */       return true;
/* 35:   */     }
/* 36:35 */     if ((paramObject instanceof hy))
/* 37:   */     {
/* 38:36 */       hy localhy = (hy)paramObject;
/* 39:37 */       return (this.b.equals(localhy.g())) && (super.equals(paramObject));
/* 40:   */     }
/* 41:40 */     return false;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String toString()
/* 45:   */   {
/* 46:45 */     return "TextComponent{text='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + b() + '}';
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hy
 * JD-Core Version:    0.7.0.1
 */