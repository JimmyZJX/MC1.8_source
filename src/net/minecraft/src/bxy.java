package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ class bxy
/*   4:    */   extends bvk
/*   5:    */ {
				private final bxv u;
/*   6:    */   public bxy(bxv parambxv, bsu parambsu)
/*   7:    */   {
/*   8:155 */     super(parambsu, parambxv.l, parambxv.m, 32, parambxv.m - 64, 10);
/*   9:    */     u=parambxv;
/*  10:157 */     a(false);
/*  11:    */   }
/*  12:    */   
/*  13:    */   protected int b()
/*  14:    */   {
/*  15:162 */     return StatList.c.size();
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/*  19:    */   
/*  20:    */   protected boolean a(int paramInt)
/*  21:    */   {
/*  22:171 */     return false;
/*  23:    */   }
/*  24:    */   
/*  25:    */   protected int k()
/*  26:    */   {
/*  27:176 */     return b() * 10;
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void a()
/*  31:    */   {
/*  32:181 */     this.u.c();
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  36:    */   {
/*  37:186 */     PlayerStat localtq = (PlayerStat)StatList.c.get(paramInt1);
/*  38:187 */     this.u.c(bxv.a(this.u), localtq.e().c(), paramInt2 + 2, paramInt3 + 1, paramInt1 % 2 == 0 ? 16777215 : 9474192);
/*  39:188 */     String str = localtq.a(bxv.b(this.u).a(localtq));
/*  40:189 */     this.u.c(bxv.c(this.u), str, paramInt2 + 2 + 213 - bxv.d(this.u).a(str), paramInt3 + 1, paramInt1 % 2 == 0 ? 16777215 : 9474192);
/*  41:    */   }
/*  42:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxy
 * JD-Core Version:    0.7.0.1
 */