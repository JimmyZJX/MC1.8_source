package net.minecraft.src;
/*   1:    */ class un
/*   2:    */ {
/*   3:    */   final int a;
/*   4:    */   Object b;
/*   5:    */   un c;
/*   6:    */   final int d;
/*   7:    */   
/*   8:    */   un(int paramInt1, int paramInt2, Object paramObject, un paramun)
/*   9:    */   {
/*  10:191 */     this.b = paramObject;
/*  11:192 */     this.c = paramun;
/*  12:193 */     this.a = paramInt2;
/*  13:194 */     this.d = paramInt1;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public final int a()
/*  17:    */   {
/*  18:198 */     return this.a;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public final Object b()
/*  22:    */   {
/*  23:202 */     return this.b;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public final boolean equals(Object paramObject)
/*  27:    */   {
/*  28:207 */     if (!(paramObject instanceof un)) {
/*  29:208 */       return false;
/*  30:    */     }
/*  31:210 */     un localun = (un)paramObject;
/*  32:211 */     Integer localInteger1 = Integer.valueOf(a());
/*  33:212 */     Integer localInteger2 = Integer.valueOf(localun.a());
/*  34:213 */     if ((localInteger1 == localInteger2) || ((localInteger1 != null) && (localInteger1.equals(localInteger2))))
/*  35:    */     {
/*  36:214 */       Object localObject1 = b();
/*  37:215 */       Object localObject2 = localun.b();
/*  38:216 */       if ((localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2)))) {
/*  39:217 */         return true;
/*  40:    */       }
/*  41:    */     }
/*  42:220 */     return false;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public final int hashCode()
/*  46:    */   {
/*  47:224 */     return um.f(this.a);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public final String toString()
/*  51:    */   {
/*  52:228 */     return a() + "=" + b();
/*  53:    */   }
/*  54:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     un
 * JD-Core Version:    0.7.0.1
 */