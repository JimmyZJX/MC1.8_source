package net.minecraft.src;
/*  1:   */ import com.google.common.base.Objects;
/*  3:   */ 
/*  4:   */ public abstract class BlockData<T extends Comparable<?>>
/*  5:   */   implements IBlockData<T>
/*  6:   */ {
/*  7:   */   private final Class<T> type;
/*  8:   */   private final String name;
/*  9:   */   
/* 10:   */   protected BlockData(String paramString, Class<T> paramClass)
/* 11:   */   {
/* 12:10 */     this.type = paramClass;
/* 13:11 */     this.name = paramString;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String getName()
/* 17:   */   {
/* 18:16 */     return this.name;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Class<T> getType()
/* 22:   */   {
/* 23:21 */     return this.type;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String toString()
/* 27:   */   {
/* 28:26 */     return Objects.toStringHelper(this).add("name", this.name).add("clazz", this.type).add("values", getValues()).toString();
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
/* 39:42 */     BlockData<?> localbes = (BlockData<?>)paramObject;
/* 40:43 */     return (this.type.equals(localbes.type)) && (this.name.equals(localbes.name));
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int hashCode()
/* 44:   */   {
/* 45:48 */     return 31 * this.type.hashCode() + this.name.hashCode();
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bes
 * JD-Core Version:    0.7.0.1
 */