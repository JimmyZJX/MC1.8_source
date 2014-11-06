package net.minecraft.src;
/*   1:    */ class byt
/*   2:    */   extends bug
/*   3:    */ {
/*   4:    */   private final boolean o;
/*   5:    */   
/*   6:    */   public byt(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*   7:    */   {
/*   8:500 */     super(paramInt1, paramInt2, paramInt3, 23, 13, "");
/*   9:501 */     this.o = paramBoolean;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public void a(bsu parambsu, int paramInt1, int paramInt2)
/*  13:    */   {
/*  14:506 */     if (!this.m) {
/*  15:507 */       return;
/*  16:    */     }
/*  17:509 */     int i = (paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g) ? 1 : 0;
/*  18:    */     
/*  19:511 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  20:512 */     parambsu.N().a(bys.a());
/*  21:    */     
/*  22:514 */     int j = 0;
/*  23:515 */     int k = 192;
/*  24:516 */     if (i != 0) {
/*  25:517 */       j += 23;
/*  26:    */     }
/*  27:519 */     if (!this.o) {
/*  28:520 */       k += 13;
/*  29:    */     }
/*  30:523 */     b(this.h, this.i, j, k, 23, 13);
/*  31:    */   }
/*  32:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byt
 * JD-Core Version:    0.7.0.1
 */