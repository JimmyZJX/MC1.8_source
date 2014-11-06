package net.minecraft.src;
/*   2:    */ 
/*   3:    */ class bxn
/*   4:    */   extends bvk
/*   5:    */ {
				private final bxm u;
/*   6:    */   public bxn(bxm parambxm)
/*   7:    */   {
/*   8:108 */     super(parambxm.j, parambxm.l, parambxm.m, 80, parambxm.m - 40, parambxm.q.a + 1);
				  u=parambxm;
/*   9:    */   }
/*  10:    */   
/*  11:    */   protected int b()
/*  12:    */   {
/*  13:113 */     return bxm.a(this.u).size();
/*  14:    */   }
/*  15:    */   
/*  16:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/*  17:    */   
/*  18:    */   protected boolean a(int paramInt)
/*  19:    */   {
/*  20:122 */     return false;
/*  21:    */   }
/*  22:    */   
/*  23:    */   protected void a() {}
/*  24:    */   
/*  25:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  26:    */   {
/*  27:131 */     this.u.q.a((String)bxm.a(this.u).get(paramInt1), 10, paramInt3, 16777215);
/*  28:    */     
/*  29:133 */     this.u.q.a((String)bxm.b(this.u).get(paramInt1), 230, paramInt3, 16777215);
/*  30:    */   }
/*  31:    */   
/*  32:    */   protected int d()
/*  33:    */   {
/*  34:138 */     return this.b - 10;
/*  35:    */   }
/*  36:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxn
 * JD-Core Version:    0.7.0.1
 */