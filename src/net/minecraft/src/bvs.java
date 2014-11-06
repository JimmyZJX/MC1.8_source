package net.minecraft.src;
/*  1:   */ import net.minecraft.realms.RealmsClickableScrolledSelectionList;
/*  2:   */ import net.minecraft.realms.Tezzelator;
/*  3:   */ import org.lwjgl.input.Mouse;
/*  4:   */ 
/*  5:   */ public class bvs
/*  6:   */   extends bvk
/*  7:   */ {
/*  8:   */   private final RealmsClickableScrolledSelectionList u;
/*  9:   */   
/* 10:   */   public bvs(RealmsClickableScrolledSelectionList paramRealmsClickableScrolledSelectionList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 11:   */   {
/* 12:13 */     super(bsu.z(), paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 13:14 */     this.u = paramRealmsClickableScrolledSelectionList;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected int b()
/* 17:   */   {
/* 18:19 */     return this.u.getItemCount();
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/* 22:   */   {
/* 23:24 */     this.u.selectItem(paramInt1, paramBoolean, paramInt2, paramInt3);
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected boolean a(int paramInt)
/* 27:   */   {
/* 28:29 */     return this.u.isSelectedItem(paramInt);
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected void a()
/* 32:   */   {
/* 33:34 */     this.u.renderBackground();
/* 34:   */   }
/* 35:   */   
/* 36:   */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 37:   */   {
/* 38:39 */     this.u.renderItem(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int e()
/* 42:   */   {
/* 43:43 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int f()
/* 47:   */   {
/* 48:47 */     return this.j;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public int g()
/* 52:   */   {
/* 53:51 */     return this.i;
/* 54:   */   }
/* 55:   */   
/* 56:   */   protected int k()
/* 57:   */   {
/* 58:56 */     return this.u.getMaxPosition();
/* 59:   */   }
/* 60:   */   
/* 61:   */   protected int d()
/* 62:   */   {
/* 63:61 */     return this.u.getScrollbarPosition();
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void p()
/* 67:   */   {
/* 68:70 */     super.p();
/* 69:72 */     if ((this.m > 0.0F) && (Mouse.getEventButtonState())) {
/* 70:73 */       this.u.customMouseEvent(this.d, this.e, this.t, this.n, this.h);
/* 71:   */     }
/* 72:   */   }
/* 73:   */   
/* 74:   */   public void a(int paramInt1, int paramInt2, int paramInt3, Tezzelator paramTezzelator)
/* 75:   */   {
/* 76:78 */     this.u.renderSelected(paramInt1, paramInt2, paramInt3, paramTezzelator);
/* 77:   */   }
/* 78:   */   
/* 79:   */   protected void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 80:   */   {
/* 81:83 */     int i = b();
/* 82:85 */     for (int j = 0; j < i; j++)
/* 83:   */     {
/* 84:86 */       int k = paramInt2 + j * this.h + this.t;
/* 85:87 */       int m = this.h - 4;
/* 86:89 */       if ((k > this.e) || (k + m < this.d)) {
/* 87:90 */         a(j, paramInt1, k);
/* 88:   */       }
/* 89:93 */       if ((this.r) && (a(j))) {
/* 90:94 */         a(this.b, k, m, Tezzelator.instance);
/* 91:   */       }
/* 92:97 */       a(j, paramInt1, k, m, paramInt3, paramInt4);
/* 93:   */     }
/* 94:   */   }
/* 95:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvs
 * JD-Core Version:    0.7.0.1
 */