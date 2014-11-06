package net.minecraft.src;
/*   1:    */ class r
/*   2:    */ {
/*   3:    */   private final String a;
/*   4:    */   private final String b;
/*   5:    */   
/*   6:    */   public r(String paramString, Object paramObject)
/*   7:    */   {
/*   8:242 */     this.a = paramString;
/*   9:244 */     if (paramObject == null)
/*  10:    */     {
/*  11:245 */       this.b = "~~NULL~~";
/*  12:    */     }
/*  13:246 */     else if ((paramObject instanceof Throwable))
/*  14:    */     {
/*  15:247 */       Throwable localThrowable = (Throwable)paramObject;
/*  16:248 */       this.b = ("~~ERROR~~ " + localThrowable.getClass().getSimpleName() + ": " + localThrowable.getMessage());
/*  17:    */     }
/*  18:    */     else
/*  19:    */     {
/*  20:250 */       this.b = paramObject.toString();
/*  21:    */     }
/*  22:    */   }
/*  23:    */   
/*  24:    */   public String a()
/*  25:    */   {
/*  26:255 */     return this.a;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String b()
/*  30:    */   {
/*  31:259 */     return this.b;
/*  32:    */   }
/*  33:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     r
 * JD-Core Version:    0.7.0.1
 */