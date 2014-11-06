package net.minecraft.src;
/*  1:   */ public class cwd
/*  2:   */   implements Comparable<cwd>
/*  3:   */ {
/*  4:   */   private final String a;
/*  5:   */   private final String b;
/*  6:   */   private final String c;
/*  7:   */   private final boolean d;
/*  8:   */   
/*  9:   */   public cwd(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
/* 10:   */   {
/* 11:10 */     this.a = paramString1;
/* 12:11 */     this.b = paramString2;
/* 13:12 */     this.c = paramString3;
/* 14:13 */     this.d = paramBoolean;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String a()
/* 18:   */   {
/* 19:17 */     return this.a;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean b()
/* 23:   */   {
/* 24:21 */     return this.d;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String toString()
/* 28:   */   {
/* 29:26 */     return String.format("%s (%s)", new Object[] { this.c, this.b });
/* 30:   */   }
/* 31:   */   
/* 32:   */   public boolean equals(Object paramObject)
/* 33:   */   {
/* 34:32 */     if (this == paramObject) {
/* 35:33 */       return true;
/* 36:   */     }
/* 37:35 */     if (!(paramObject instanceof cwd)) {
/* 38:36 */       return false;
/* 39:   */     }
/* 40:39 */     return this.a.equals(((cwd)paramObject).a);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int hashCode()
/* 44:   */   {
/* 45:44 */     return this.a.hashCode();
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int compareTo(cwd paramcwd)
/* 49:   */   {
/* 50:49 */     return this.a.compareTo(paramcwd.a);
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwd
 * JD-Core Version:    0.7.0.1
 */