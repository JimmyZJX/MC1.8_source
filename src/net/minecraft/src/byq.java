package net.minecraft.src;
/*   1:    */ class byq
/*   2:    */   extends byr
/*   3:    */ {
/*   4:    */   private final int p;
/*   5:    */   private final int q;
				private final byn o;
/*   6:    */   
/*   7:    */   public byq(byn parambyn, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*   8:    */   {
/*   9:234 */     super(paramInt1, paramInt2, paramInt3, byl.a, 0 + Potion.a[paramInt4].f() % 8 * 18, 198 + Potion.a[paramInt4].f() / 8 * 18);
				  o=parambyn;
/*  10:235 */     this.p = paramInt4;
/*  11:236 */     this.q = paramInt5;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public void b(int paramInt1, int paramInt2)
/*  15:    */   {
/*  16:241 */     String str = cwc.a(Potion.a[this.p].a(), new Object[0]);
/*  17:244 */     if ((this.q >= 3) && (this.p != Potion.l.H)) {
/*  18:245 */       str = str + " II";
/*  19:    */     }
/*  20:248 */     byn.a(this.o, str, paramInt1, paramInt2);
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byq
 * JD-Core Version:    0.7.0.1
 */