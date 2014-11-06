package net.minecraft.src;
/*   1:    */  enum cmu
/*   2:    */ { a(EnumDirection.UP,0,-1),b(EnumDirection.DOWN,0,1),c(EnumDirection.EAST,-1,0),d(EnumDirection.WEST,1,0);
/*   3:    */   private final EnumDirection e;
/*   4:    */   private final int f;
/*   5:    */   private final int g;
/*   6:    */   
/*   7:    */   private cmu(EnumDirection paramej, int paramInt1, int paramInt2)
/*   8:    */   {
/*   9:234 */     this.e = paramej;
/*  10:235 */     this.f = paramInt1;
/*  11:236 */     this.g = paramInt2;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public EnumDirection a()
/*  15:    */   {
/*  16:240 */     return this.e;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public int b()
/*  20:    */   {
/*  21:244 */     return this.f;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int c()
/*  25:    */   {
/*  26:248 */     return this.g;
/*  27:    */   }
/*  28:    */   
/*  29:    */   private boolean d()
/*  30:    */   {
/*  31:252 */     return (this == b) || (this == a);
/*  32:    */   }
				static boolean a(cmu arg0) {return arg0.d();}
/*  33:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmu
 * JD-Core Version:    0.7.0.1
 */