package net.minecraft.src;
/*   1:    */ class byr
/*   2:    */   extends bug
/*   3:    */ {
/*   4:    */   private final oa o;
/*   5:    */   private final int p;
/*   6:    */   private final int q;
/*   7:    */   private boolean r;
/*   8:    */   
/*   9:    */   protected byr(int paramInt1, int paramInt2, int paramInt3, oa paramoa, int paramInt4, int paramInt5)
/*  10:    */   {
/*  11:184 */     super(paramInt1, paramInt2, paramInt3, 22, 22, "");
/*  12:185 */     this.o = paramoa;
/*  13:186 */     this.p = paramInt4;
/*  14:187 */     this.q = paramInt5;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(bsu parambsu, int paramInt1, int paramInt2)
/*  18:    */   {
/*  19:192 */     if (!this.m) {
/*  20:193 */       return;
/*  21:    */     }
/*  22:196 */     parambsu.N().a(byn.a());
/*  23:197 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  24:    */     
/*  25:199 */     this.n = ((paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g));
/*  26:200 */     int i = 219;
/*  27:201 */     int j = 0;
/*  28:202 */     if (!this.l) {
/*  29:203 */       j += this.f * 2;
/*  30:204 */     } else if (this.r) {
/*  31:205 */       j += this.f * 1;
/*  32:206 */     } else if (this.n) {
/*  33:207 */       j += this.f * 3;
/*  34:    */     }
/*  35:210 */     b(this.h, this.i, j, i, this.f, this.g);
/*  36:212 */     if (!byn.a().equals(this.o)) {
/*  37:213 */       parambsu.N().a(this.o);
/*  38:    */     }
/*  39:216 */     b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean c()
/*  43:    */   {
/*  44:220 */     return this.r;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void b(boolean paramBoolean)
/*  48:    */   {
/*  49:224 */     this.r = paramBoolean;
/*  50:    */   }
/*  51:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byr
 * JD-Core Version:    0.7.0.1
 */