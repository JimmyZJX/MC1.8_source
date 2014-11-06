package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ class byb
/*   6:    */   extends bvk
/*   7:    */ {
/*   8:648 */   private final List<xc> v = Lists.newArrayList();
				private final bxv u;
/*   9:    */   
/*  10:    */   public byb(bxv parambxv, bsu parambsu)
/*  11:    */   {
/*  12:651 */     super(parambsu, parambxv.l, parambxv.m, 32, parambxv.m - 64, bxv.m(parambxv).a * 4);
/*  13:    */     u=parambxv;
/*  14:653 */     a(false);
/*  15:655 */     for (xc localxc : EntityList.entityEggs.values()) {
/*  16:656 */       if ((bxv.b(parambxv).a(localxc.d) > 0) || (bxv.b(parambxv).a(localxc.e) > 0)) {
/*  17:657 */         this.v.add(localxc);
/*  18:    */       }
/*  19:    */     }
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected int b()
/*  23:    */   {
/*  24:664 */     return this.v.size();
/*  25:    */   }
/*  26:    */   
/*  27:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/*  28:    */   
/*  29:    */   protected boolean a(int paramInt)
/*  30:    */   {
/*  31:673 */     return false;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected int k()
/*  35:    */   {
/*  36:678 */     return b() * bxv.n(this.u).a * 4;
/*  37:    */   }
/*  38:    */   
/*  39:    */   protected void a()
/*  40:    */   {
/*  41:683 */     this.u.c();
/*  42:    */   }
/*  43:    */   
/*  44:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  45:    */   {
/*  46:688 */     xc localxc = (xc)this.v.get(paramInt1);
/*  47:689 */     String str1 = cwc.a("entity." + EntityList.b(localxc.a) + ".name", new Object[0]);
/*  48:690 */     int i = bxv.b(this.u).a(localxc.d);
/*  49:691 */     int j = bxv.b(this.u).a(localxc.e);
/*  50:692 */     String str2 = cwc.a("stat.entityKills", new Object[] { Integer.valueOf(i), str1 });
/*  51:693 */     String str3 = cwc.a("stat.entityKilledBy", new Object[] { str1, Integer.valueOf(j) });
/*  52:695 */     if (i == 0) {
/*  53:696 */       str2 = cwc.a("stat.entityKills.none", new Object[] { str1 });
/*  54:    */     }
/*  55:698 */     if (j == 0) {
/*  56:699 */       str3 = cwc.a("stat.entityKilledBy.none", new Object[] { str1 });
/*  57:    */     }
/*  58:702 */     this.u.c(bxv.o(this.u), str1, paramInt2 + 2 - 10, paramInt3 + 1, 16777215);
/*  59:    */     
/*  60:704 */     this.u.c(bxv.p(this.u), str2, paramInt2 + 2, paramInt3 + 1 + bxv.q(this.u).a, i == 0 ? 6316128 : 9474192);
/*  61:705 */     this.u.c(bxv.r(this.u), str3, paramInt2 + 2, paramInt3 + 1 + bxv.s(this.u).a * 2, j == 0 ? 6316128 : 9474192);
/*  62:    */   }
/*  63:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byb
 * JD-Core Version:    0.7.0.1
 */