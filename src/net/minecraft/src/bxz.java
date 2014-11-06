package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   3:    */ 
/*   4:    */ class bxz
/*   5:    */   extends byc
/*   6:    */ {
				final bxv u;
/*   7:    */   public bxz(bxv parambxv, bsu parambsu)
/*   8:    */   {
/*   9:435 */     super(parambxv, parambsu);
/*  10:    */     u=parambxv;
/*  11:437 */     this.w = Lists.newArrayList();
/*  12:438 */     for (to localto : StatList.d)
/*  13:    */     {
/*  14:439 */       int i = 0;
/*  15:440 */       int j = Item.b(localto.a());
/*  16:442 */       if (bxv.b(parambxv).a(localto) > 0) {
/*  17:443 */         i = 1;
/*  18:444 */       } else if ((StatList.K[j] != null) && (bxv.b(parambxv).a(StatList.K[j]) > 0)) {
/*  19:445 */         i = 1;
/*  20:446 */       } else if ((StatList.I[j] != null) && (bxv.b(parambxv).a(StatList.I[j]) > 0)) {
/*  21:447 */         i = 1;
/*  22:    */       }
/*  23:449 */       if (i != 0) {
/*  24:450 */         this.w.add(localto);
/*  25:    */       }
/*  26:    */     }
/*  27:454 */     this.x = new bya(this, parambxv);
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void a(int paramInt1, int paramInt2, ckx paramckx)
/*  31:    */   {
/*  32:494 */     super.a(paramInt1, paramInt2, paramckx);
/*  33:496 */     if (this.v == 0) {
/*  34:497 */       bxv.a(this.u, paramInt1 + 115 - 18 + 1, paramInt2 + 1 + 1, 72, 18);
/*  35:    */     } else {
/*  36:499 */       bxv.a(this.u, paramInt1 + 115 - 18, paramInt2 + 1, 72, 18);
/*  37:    */     }
/*  38:501 */     if (this.v == 1) {
/*  39:502 */       bxv.a(this.u, paramInt1 + 165 - 18 + 1, paramInt2 + 1 + 1, 18, 18);
/*  40:    */     } else {
/*  41:504 */       bxv.a(this.u, paramInt1 + 165 - 18, paramInt2 + 1, 18, 18);
/*  42:    */     }
/*  43:506 */     if (this.v == 2) {
/*  44:507 */       bxv.a(this.u, paramInt1 + 215 - 18 + 1, paramInt2 + 1 + 1, 36, 18);
/*  45:    */     } else {
/*  46:509 */       bxv.a(this.u, paramInt1 + 215 - 18, paramInt2 + 1, 36, 18);
/*  47:    */     }
/*  48:    */   }
/*  49:    */   
/*  50:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  51:    */   {
/*  52:515 */     to localto = c(paramInt1);
/*  53:    */     
/*  54:517 */     Item localalq = localto.a();
/*  55:518 */     bxv.a(this.u, paramInt2 + 40, paramInt3, localalq);
/*  56:    */     
/*  57:520 */     int i = Item.b(localalq);
/*  58:521 */     a(StatList.K[i], paramInt2 + 115, paramInt3, paramInt1 % 2 == 0);
/*  59:522 */     a(StatList.I[i], paramInt2 + 165, paramInt3, paramInt1 % 2 == 0);
/*  60:523 */     a(localto, paramInt2 + 215, paramInt3, paramInt1 % 2 == 0);
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected String b(int paramInt)
/*  64:    */   {
/*  65:528 */     if (paramInt == 1) {
/*  66:529 */       return "stat.crafted";
/*  67:    */     }
/*  68:530 */     if (paramInt == 2) {
/*  69:531 */       return "stat.used";
/*  70:    */     }
/*  71:533 */     return "stat.depleted";
/*  72:    */   }
/*  73:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxz
 * JD-Core Version:    0.7.0.1
 */