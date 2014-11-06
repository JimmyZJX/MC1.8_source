package net.minecraft.src;
/*   1:    */  enum clr
/*   2:    */ {a(0,1,2,3),b(2,3,0,1),c(3,0,1,2),d(0,1,2,3),e(3,0,1,2),f(1,2,3,0);
/*   3:    */   private final int g;
/*   4:    */   private final int h;
/*   5:    */   private final int i;
/*   6:    */   private final int j;
/*   7:    */   private static final clr[] k;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:330 */     k = new clr[6];
/*  12:    */     
/*  13:    */ 
/*  14:333 */     k[EnumDirection.DOWN.a()] = a;
/*  15:334 */     k[EnumDirection.UP.a()] = b;
/*  16:335 */     k[EnumDirection.NORTH.a()] = c;
/*  17:336 */     k[EnumDirection.SOUTH.a()] = d;
/*  18:337 */     k[EnumDirection.WEST.a()] = e;
/*  19:338 */     k[EnumDirection.EAST.a()] = f;
/*  20:    */   }
/*  21:    */   
/*  22:    */   private clr(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  23:    */   {
/*  24:342 */     this.g = paramInt1;
/*  25:343 */     this.h = paramInt2;
/*  26:344 */     this.i = paramInt3;
/*  27:345 */     this.j = paramInt4;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public static clr a(EnumDirection paramej)
/*  31:    */   {
/*  32:349 */     return k[paramej.a()];
/*  33:    */   }
				static int a(clr arg0) {return arg0.g;}
				static int b(clr arg0) {return arg0.h;}
				static int c(clr arg0) {return arg0.i;}
				static int d(clr arg0) {return arg0.j;}
/*  34:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     clr
 * JD-Core Version:    0.7.0.1
 */