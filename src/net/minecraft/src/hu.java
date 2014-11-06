package net.minecraft.src;
/*  1:   */ public class hu
/*  2:   */   extends hj
/*  3:   */ {
/*  4:   */   private final String b;
/*  5:   */   
/*  6:   */   public hu(String paramString)
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
/* 21:   */   public hu f()
/* 22:   */   {
/* 23:21 */     hu localhu = new hu(this.b);
/* 24:22 */     localhu.a(b().m());
/* 25:23 */     for (ho localho : a()) {
/* 26:24 */       localhu.a(localho.f());
/* 27:   */     }
/* 28:26 */     return localhu;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean equals(Object paramObject)
/* 32:   */   {
/* 33:31 */     if (this == paramObject) {
/* 34:32 */       return true;
/* 35:   */     }
/* 36:35 */     if ((paramObject instanceof hu))
/* 37:   */     {
/* 38:36 */       hu localhu = (hu)paramObject;
/* 39:37 */       return (this.b.equals(localhu.b)) && (super.equals(paramObject));
/* 40:   */     }
/* 41:40 */     return false;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String toString()
/* 45:   */   {
/* 46:45 */     return "SelectorComponent{pattern='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + b() + '}';
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hu
 * JD-Core Version:    0.7.0.1
 */