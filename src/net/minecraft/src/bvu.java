package net.minecraft.src;
/*  1:   */ import net.minecraft.realms.RealmsScrolledSelectionList;
/*  2:   */ 
/*  3:   */ public class bvu
/*  4:   */   extends bvk
/*  5:   */ {
/*  6:   */   private final RealmsScrolledSelectionList u;
/*  7:   */   
/*  8:   */   public bvu(RealmsScrolledSelectionList paramRealmsScrolledSelectionList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  9:   */   {
/* 10:11 */     super(bsu.z(), paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 11:12 */     this.u = paramRealmsScrolledSelectionList;
/* 12:   */   }
/* 13:   */   
/* 14:   */   protected int b()
/* 15:   */   {
/* 16:17 */     return this.u.getItemCount();
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/* 20:   */   {
/* 21:22 */     this.u.selectItem(paramInt1, paramBoolean, paramInt2, paramInt3);
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected boolean a(int paramInt)
/* 25:   */   {
/* 26:27 */     return this.u.isSelectedItem(paramInt);
/* 27:   */   }
/* 28:   */   
/* 29:   */   protected void a()
/* 30:   */   {
/* 31:32 */     this.u.renderBackground();
/* 32:   */   }
/* 33:   */   
/* 34:   */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 35:   */   {
/* 36:37 */     this.u.renderItem(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public int e()
/* 40:   */   {
/* 41:41 */     return this.b;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public int f()
/* 45:   */   {
/* 46:45 */     return this.j;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public int g()
/* 50:   */   {
/* 51:49 */     return this.i;
/* 52:   */   }
/* 53:   */   
/* 54:   */   protected int k()
/* 55:   */   {
/* 56:54 */     return this.u.getMaxPosition();
/* 57:   */   }
/* 58:   */   
/* 59:   */   protected int d()
/* 60:   */   {
/* 61:59 */     return this.u.getScrollbarPosition();
/* 62:   */   }
/* 63:   */   
/* 64:   */   public void p()
/* 65:   */   {
/* 66:64 */     super.p();
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvu
 * JD-Core Version:    0.7.0.1
 */