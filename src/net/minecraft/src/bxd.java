package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bxd
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   private cee a;
/*  7:   */   private int f;
/*  8:   */   
/*  9:   */   public bxd(cee paramcee)
/* 10:   */   {
/* 11:12 */     this.a = paramcee;
/* 12:   */   }
/* 13:   */   
/* 14:   */   protected void a(char paramChar, int paramInt) {}
/* 15:   */   
/* 16:   */   public void b()
/* 17:   */   {
/* 18:21 */     this.n.clear();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void e()
/* 22:   */   {
/* 23:26 */     this.f += 1;
/* 24:27 */     if (this.f % 20 == 0) {
/* 25:28 */       this.a.a(new mf());
/* 26:   */     }
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 30:   */   {
/* 31:34 */     c(0);
/* 32:   */     
/* 33:36 */     a(this.q, cwc.a("multiplayer.downloadingTerrain", new Object[0]), this.l / 2, this.m / 2 - 50, 16777215);
/* 34:   */     
/* 35:38 */     super.a(paramInt1, paramInt2, paramFloat);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public boolean d()
/* 39:   */   {
/* 40:43 */     return false;
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxd
 * JD-Core Version:    0.7.0.1
 */