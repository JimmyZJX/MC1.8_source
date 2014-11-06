package net.minecraft.src;
/*   1:    */ public final class dy
/*   2:    */   extends BlockPosition
/*   3:    */ {
/*   4:    */   public int b;
/*   5:    */   public int c;
/*   6:    */   public int d;
/*   7:    */   
/*   8:    */   private dy(int paramInt1, int paramInt2, int paramInt3)
/*   9:    */   {
/*  10:215 */     super(0, 0, 0);
/*  11:216 */     this.b = paramInt1;
/*  12:217 */     this.c = paramInt2;
/*  13:218 */     this.d = paramInt3;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int getX()
/*  17:    */   {
/*  18:223 */     return this.b;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public int getY()
/*  22:    */   {
/*  23:228 */     return this.c;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int getZ()
/*  27:    */   {
/*  28:233 */     return this.d;
/*  29:    */   }
				public fd d(fd arg0) {return c(arg0);}
				dy(int arg0, int arg1, int arg2, du arg3){this(arg0,arg1,arg2);}
/*  30:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dy
 * JD-Core Version:    0.7.0.1
 */