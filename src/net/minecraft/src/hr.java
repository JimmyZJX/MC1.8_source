package net.minecraft.src;
/*  1:   */ public class hr
/*  2:   */ {
/*  3:   */   private final hs a;
/*  4:   */   private final ho b;
/*  5:   */   
/*  6:   */   public hr(hs paramhs, ho paramho)
/*  7:   */   {
/*  8:12 */     this.a = paramhs;
/*  9:13 */     this.b = paramho;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public hs a()
/* 13:   */   {
/* 14:17 */     return this.a;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public ho b()
/* 18:   */   {
/* 19:21 */     return this.b;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean equals(Object paramObject)
/* 23:   */   {
/* 24:26 */     if (this == paramObject) {
/* 25:27 */       return true;
/* 26:   */     }
/* 27:29 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/* 28:30 */       return false;
/* 29:   */     }
/* 30:33 */     hr localhr = (hr)paramObject;
/* 31:35 */     if (this.a != localhr.a) {
/* 32:36 */       return false;
/* 33:   */     }
/* 34:38 */     if (this.b != null ? !this.b.equals(localhr.b) : localhr.b != null) {
/* 35:39 */       return false;
/* 36:   */     }
/* 37:42 */     return true;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String toString()
/* 41:   */   {
/* 42:47 */     return "HoverEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int hashCode()
/* 46:   */   {
/* 47:55 */     int i = this.a.hashCode();
/* 48:56 */     i = 31 * i + (this.b != null ? this.b.hashCode() : 0);
/* 49:57 */     return i;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hr
 * JD-Core Version:    0.7.0.1
 */