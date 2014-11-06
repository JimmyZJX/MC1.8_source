package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   3:    */ 
/*   4:    */ class bxw
/*   5:    */   extends byc
/*   6:    */ {
				final bxv u;
/*   7:    */   public bxw(bxv parambxv, bsu parambsu)
/*   8:    */   {
/*   9:544 */     super(parambxv, parambsu);
/*  10:    */     u=parambxv;
/*  11:546 */     this.w = Lists.newArrayList();
/*  12:547 */     for (to localto : StatList.e)
/*  13:    */     {
/*  14:548 */       int i = 0;
/*  15:549 */       int j = Item.b(localto.a());
/*  16:551 */       if (bxv.b(parambxv).a(localto) > 0) {
/*  17:552 */         i = 1;
/*  18:553 */       } else if ((StatList.J[j] != null) && (bxv.b(parambxv).a(StatList.J[j]) > 0)) {
/*  19:554 */         i = 1;
/*  20:555 */       } else if ((StatList.I[j] != null) && (bxv.b(parambxv).a(StatList.I[j]) > 0)) {
/*  21:556 */         i = 1;
/*  22:    */       }
/*  23:558 */       if (i != 0) {
/*  24:559 */         this.w.add(localto);
/*  25:    */       }
/*  26:    */     }
/*  27:563 */     this.x = new bxx(this, parambxv);
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void a(int paramInt1, int paramInt2, ckx paramckx)
/*  31:    */   {
/*  32:603 */     super.a(paramInt1, paramInt2, paramckx);
/*  33:605 */     if (this.v == 0) {
/*  34:606 */       bxv.a(this.u, paramInt1 + 115 - 18 + 1, paramInt2 + 1 + 1, 18, 18);
/*  35:    */     } else {
/*  36:608 */       bxv.a(this.u, paramInt1 + 115 - 18, paramInt2 + 1, 18, 18);
/*  37:    */     }
/*  38:610 */     if (this.v == 1) {
/*  39:611 */       bxv.a(this.u, paramInt1 + 165 - 18 + 1, paramInt2 + 1 + 1, 36, 18);
/*  40:    */     } else {
/*  41:613 */       bxv.a(this.u, paramInt1 + 165 - 18, paramInt2 + 1, 36, 18);
/*  42:    */     }
/*  43:615 */     if (this.v == 2) {
/*  44:616 */       bxv.a(this.u, paramInt1 + 215 - 18 + 1, paramInt2 + 1 + 1, 54, 18);
/*  45:    */     } else {
/*  46:618 */       bxv.a(this.u, paramInt1 + 215 - 18, paramInt2 + 1, 54, 18);
/*  47:    */     }
/*  48:    */   }
/*  49:    */   
/*  50:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  51:    */   {
/*  52:624 */     to localto = c(paramInt1);
/*  53:625 */     Item localalq = localto.a();
/*  54:    */     
/*  55:627 */     bxv.a(this.u, paramInt2 + 40, paramInt3, localalq);
/*  56:    */     
/*  57:629 */     int i = Item.b(localalq);
/*  58:630 */     a(StatList.I[i], paramInt2 + 115, paramInt3, paramInt1 % 2 == 0);
/*  59:631 */     a(StatList.J[i], paramInt2 + 165, paramInt3, paramInt1 % 2 == 0);
/*  60:632 */     a(localto, paramInt2 + 215, paramInt3, paramInt1 % 2 == 0);
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected String b(int paramInt)
/*  64:    */   {
/*  65:637 */     if (paramInt == 0) {
/*  66:638 */       return "stat.crafted";
/*  67:    */     }
/*  68:639 */     if (paramInt == 1) {
/*  69:640 */       return "stat.used";
/*  70:    */     }
/*  71:642 */     return "stat.mined";
/*  72:    */   }
/*  73:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxw
 * JD-Core Version:    0.7.0.1
 */