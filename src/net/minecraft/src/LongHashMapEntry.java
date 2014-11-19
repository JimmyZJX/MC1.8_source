package net.minecraft.src;
/*   1:    */ class LongHashMapEntry
/*   2:    */ {
/*   3:    */   final long key;
/*   4:    */   Object value;
/*   5:    */   LongHashMapEntry nextEntry;
/*   6:    */   final int hash;
/*   7:    */   
/*   8:    */   LongHashMapEntry(int paramInt, long paramLong, Object paramObject, LongHashMapEntry paramus)
/*   9:    */   {
/*  10:204 */     this.value = paramObject;
/*  11:205 */     this.nextEntry = paramus;
/*  12:206 */     this.key = paramLong;
/*  13:207 */     this.hash = paramInt;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public final long getKey()
/*  17:    */   {
/*  18:211 */     return this.key;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public final Object getValue()
/*  22:    */   {
/*  23:215 */     return this.value;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public final boolean equals(Object paramObject)
/*  27:    */   {
/*  28:220 */     if (!(paramObject instanceof LongHashMapEntry)) {
/*  29:221 */       return false;
/*  30:    */     }
/*  31:223 */     LongHashMapEntry localus = (LongHashMapEntry)paramObject;
/*  32:224 */     Long localLong1 = Long.valueOf(getKey());
/*  33:225 */     Long localLong2 = Long.valueOf(localus.getKey());
/*  34:226 */     if ((localLong1 == localLong2) || ((localLong1 != null) && (localLong1.equals(localLong2))))
/*  35:    */     {
/*  36:227 */       Object localObject1 = getValue();
/*  37:228 */       Object localObject2 = localus.getValue();
/*  38:229 */       if ((localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2)))) {
/*  39:230 */         return true;
/*  40:    */       }
/*  41:    */     }
/*  42:233 */     return false;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public final int hashCode()
/*  46:    */   {
/*  47:237 */     return LongHashMap.getHashCode(this.key);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public final String toString()
/*  51:    */   {
/*  52:241 */     return getKey() + "=" + getValue();
/*  53:    */   }
/*  54:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     us
 * JD-Core Version:    0.7.0.1
 */