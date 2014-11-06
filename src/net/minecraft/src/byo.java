package net.minecraft.src;
/*   1:    */ class byo
/*   2:    */   extends byr
/*   3:    */ {
				private final byn o;
/*   4:    */   public byo(byn parambyn, int paramInt1, int paramInt2, int paramInt3)
/*   5:    */   {
/*   6:265 */     super(paramInt1, paramInt2, paramInt3, byn.a(), 112, 220);
				  o=parambyn;
/*   7:    */   }
/*   8:    */   
/*   9:    */   public void b(int paramInt1, int paramInt2)
/*  10:    */   {
/*  11:270 */     byn.c(this.o, cwc.a("gui.cancel", new Object[0]), paramInt1, paramInt2);
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byo
 * JD-Core Version:    0.7.0.1
 */