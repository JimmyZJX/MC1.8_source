package net.minecraft.src;
/*  1:   */ import com.google.common.base.Objects;
/*  2:   */ import com.google.common.base.Objects.ToStringHelper;
/*  3:   */ 
/*  4:   */ public abstract class bes<E extends Comparable<?>>
/*  5:   */   implements bex<E>
/*  6:   */ {
/*  7:   */   private final Class a;
/*  8:   */   private final String b;
/*  9:   */   
/* 10:   */   protected bes(String paramString, Class paramClass)
/* 11:   */   {
/* 12:10 */     this.a = paramClass;
/* 13:11 */     this.b = paramString;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String a()
/* 17:   */   {
/* 18:16 */     return this.b;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Class b()
/* 22:   */   {
/* 23:21 */     return this.a;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String toString()
/* 27:   */   {
/* 28:26 */     return Objects.toStringHelper(this).add("name", this.b).add("clazz", this.a).add("values", c()).toString();
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean equals(Object paramObject)
/* 32:   */   {
/* 33:35 */     if (this == paramObject) {
/* 34:36 */       return true;
/* 35:   */     }
/* 36:38 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/* 37:39 */       return false;
/* 38:   */     }
/* 39:42 */     bes localbes = (bes)paramObject;
/* 40:43 */     return (this.a.equals(localbes.a)) && (this.b.equals(localbes.b));
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int hashCode()
/* 44:   */   {
/* 45:48 */     return 31 * this.a.hashCode() + this.b.hashCode();
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bes
 * JD-Core Version:    0.7.0.1
 */