package net.minecraft.src;
/*   1:    */ class bzl
/*   2:    */   extends bug
/*   3:    */ {
/*   4:    */   private final boolean o;
/*   5:    */   
/*   6:    */   public bzl(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*   7:    */   {
/*   8:188 */     super(paramInt1, paramInt2, paramInt3, 12, 19, "");
/*   9:189 */     this.o = paramBoolean;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public void a(bsu parambsu, int paramInt1, int paramInt2)
/*  13:    */   {
/*  14:194 */     if (!this.m) {
/*  15:195 */       return;
/*  16:    */     }
/*  17:198 */     parambsu.N().a(bzk.f());
/*  18:199 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  19:    */     
/*  20:201 */     int i = (paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g) ? 1 : 0;
/*  21:202 */     int j = 0;
/*  22:203 */     int k = 176;
/*  23:204 */     if (!this.l) {
/*  24:205 */       k += this.f * 2;
/*  25:206 */     } else if (i != 0) {
/*  26:207 */       k += this.f;
/*  27:    */     }
/*  28:209 */     if (!this.o) {
/*  29:210 */       j += this.g;
/*  30:    */     }
/*  31:213 */     b(this.h, this.i, k, j, this.f, this.g);
/*  32:    */   }
/*  33:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzl
 * JD-Core Version:    0.7.0.1
 */