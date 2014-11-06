package net.minecraft.src;
/*   1:    */ public class cmk
/*   2:    */ {
/*   3:    */   private final oa a;
/*   4:    */   private final cxf b;
/*   5:    */   private final boolean c;
/*   6:    */   private final int d;
/*   7:    */   
/*   8:    */   public cmk(oa paramoa, cxf paramcxf, boolean paramBoolean, int paramInt)
/*   9:    */   {
/*  10:128 */     this.a = paramoa;
/*  11:129 */     this.b = paramcxf;
/*  12:130 */     this.c = paramBoolean;
/*  13:131 */     this.d = paramInt;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public oa a()
/*  17:    */   {
/*  18:135 */     return this.a;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public cxf b()
/*  22:    */   {
/*  23:139 */     return this.b;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public boolean c()
/*  27:    */   {
/*  28:143 */     return this.c;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int d()
/*  32:    */   {
/*  33:147 */     return this.d;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean equals(Object paramObject)
/*  37:    */   {
/*  38:152 */     if (this == paramObject) {
/*  39:153 */       return true;
/*  40:    */     }
/*  41:155 */     if ((paramObject instanceof cmk))
/*  42:    */     {
/*  43:156 */       cmk localcmk = (cmk)paramObject;
/*  44:157 */       return (this.a.equals(localcmk.a)) && (this.b == localcmk.b) && (this.c == localcmk.c);
/*  45:    */     }
/*  46:159 */     return false;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public int hashCode()
/*  50:    */   {
/*  51:164 */     int i = this.a.hashCode();
/*  52:165 */     i = 31 * i + (this.b != null ? this.b.hashCode() : 0);
/*  53:166 */     i = 31 * i + (this.c ? 1 : 0);
/*  54:167 */     return i;
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmk
 * JD-Core Version:    0.7.0.1
 */