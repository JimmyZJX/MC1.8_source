package net.minecraft.src;
/*   1:    */ class cmt
/*   2:    */ {
/*   3:    */   private final cmu a;
/*   4:    */   private int b;
/*   5:    */   private int c;
/*   6:    */   private final int d;
/*   7:    */   
/*   8:    */   public cmt(cmu paramcmu, int paramInt1, int paramInt2)
/*   9:    */   {
/*  10:264 */     this.a = paramcmu;
/*  11:265 */     this.b = paramInt1;
/*  12:266 */     this.c = paramInt1;
/*  13:267 */     this.d = paramInt2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void a(int paramInt)
/*  17:    */   {
/*  18:271 */     if (paramInt < this.b) {
/*  19:272 */       this.b = paramInt;
/*  20:273 */     } else if (paramInt > this.c) {
/*  21:274 */       this.c = paramInt;
/*  22:    */     }
/*  23:    */   }
/*  24:    */   
/*  25:    */   public cmu a()
/*  26:    */   {
/*  27:279 */     return this.a;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public int b()
/*  31:    */   {
/*  32:283 */     return this.b;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public int c()
/*  36:    */   {
/*  37:287 */     return this.c;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public int d()
/*  41:    */   {
/*  42:291 */     return this.d;
/*  43:    */   }
/*  44:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmt
 * JD-Core Version:    0.7.0.1
 */