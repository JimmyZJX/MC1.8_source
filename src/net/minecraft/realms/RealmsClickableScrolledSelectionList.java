/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import net.minecraft.src.bvs;
/*  4:   */ 
/*  5:   */ public class RealmsClickableScrolledSelectionList
/*  6:   */ {
/*  7:   */   private final bvs proxy;
/*  8:   */   
/*  9:   */   public RealmsClickableScrolledSelectionList(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 10:   */   {
/* 11:10 */     this.proxy = new bvs(this, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void render(int paramInt1, int paramInt2, float paramFloat)
/* 15:   */   {
/* 16:14 */     this.proxy.a(paramInt1, paramInt2, paramFloat);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public int width()
/* 20:   */   {
/* 21:18 */     return this.proxy.e();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public int ym()
/* 25:   */   {
/* 26:22 */     return this.proxy.f();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public int xm()
/* 30:   */   {
/* 31:26 */     return this.proxy.g();
/* 32:   */   }
/* 33:   */   
/* 34:   */   protected void renderItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Tezzelator paramTezzelator, int paramInt5, int paramInt6) {}
/* 35:   */   
/* 36:   */   public void renderItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 37:   */   {
/* 38:33 */     renderItem(paramInt1, paramInt2, paramInt3, paramInt4, Tezzelator.instance, paramInt5, paramInt6);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int getItemCount()
/* 42:   */   {
/* 43:37 */     return 0;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void selectItem(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/* 47:   */   
/* 48:   */   public boolean isSelectedItem(int paramInt)
/* 49:   */   {
/* 50:44 */     return false;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void renderBackground() {}
/* 54:   */   
/* 55:   */   public int getMaxPosition()
/* 56:   */   {
/* 57:51 */     return 0;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public int getScrollbarPosition()
/* 61:   */   {
/* 62:55 */     return this.proxy.e() / 2 + 124;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void mouseEvent()
/* 66:   */   {
/* 67:59 */     this.proxy.p();
/* 68:   */   }
/* 69:   */   
/* 70:   */   public void customMouseEvent(int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4) {}
/* 71:   */   
/* 72:   */   public void scroll(int paramInt)
/* 73:   */   {
/* 74:67 */     this.proxy.g(paramInt);
/* 75:   */   }
/* 76:   */   
/* 77:   */   public int getScroll()
/* 78:   */   {
/* 79:71 */     return this.proxy.n();
/* 80:   */   }
/* 81:   */   
/* 82:   */   protected void renderList(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/* 83:   */   
/* 84:   */   public void itemClicked(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
/* 85:   */   
/* 86:   */   public void renderSelected(int paramInt1, int paramInt2, int paramInt3, Tezzelator paramTezzelator) {}
/* 87:   */   
/* 88:   */   public void setLeftPos(int paramInt)
/* 89:   */   {
/* 90:85 */     this.proxy.h(paramInt);
/* 91:   */   }
/* 92:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsClickableScrolledSelectionList
 * JD-Core Version:    0.7.0.1
 */