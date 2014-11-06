/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import net.minecraft.src.bvu;
/*  4:   */ 
/*  5:   */ public class RealmsScrolledSelectionList
/*  6:   */ {
/*  7:   */   private final bvu proxy;
/*  8:   */   
/*  9:   */   public RealmsScrolledSelectionList(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 10:   */   {
/* 11: 9 */     this.proxy = new bvu(this, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void render(int paramInt1, int paramInt2, float paramFloat)
/* 15:   */   {
/* 16:13 */     this.proxy.a(paramInt1, paramInt2, paramFloat);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public int width()
/* 20:   */   {
/* 21:17 */     return this.proxy.e();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public int ym()
/* 25:   */   {
/* 26:21 */     return this.proxy.f();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public int xm()
/* 30:   */   {
/* 31:25 */     return this.proxy.g();
/* 32:   */   }
/* 33:   */   
/* 34:   */   protected void renderItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Tezzelator paramTezzelator, int paramInt5, int paramInt6) {}
/* 35:   */   
/* 36:   */   public void renderItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 37:   */   {
/* 38:32 */     renderItem(paramInt1, paramInt2, paramInt3, paramInt4, Tezzelator.instance, paramInt5, paramInt6);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int getItemCount()
/* 42:   */   {
/* 43:36 */     return 0;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void selectItem(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/* 47:   */   
/* 48:   */   public boolean isSelectedItem(int paramInt)
/* 49:   */   {
/* 50:43 */     return false;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void renderBackground() {}
/* 54:   */   
/* 55:   */   public int getMaxPosition()
/* 56:   */   {
/* 57:50 */     return 0;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public int getScrollbarPosition()
/* 61:   */   {
/* 62:54 */     return this.proxy.e() / 2 + 124;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void mouseEvent()
/* 66:   */   {
/* 67:58 */     this.proxy.p();
/* 68:   */   }
/* 69:   */   
/* 70:   */   public void scroll(int paramInt)
/* 71:   */   {
/* 72:62 */     this.proxy.g(paramInt);
/* 73:   */   }
/* 74:   */   
/* 75:   */   public int getScroll()
/* 76:   */   {
/* 77:66 */     return this.proxy.n();
/* 78:   */   }
/* 79:   */   
/* 80:   */   protected void renderList(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsScrolledSelectionList
 * JD-Core Version:    0.7.0.1
 */