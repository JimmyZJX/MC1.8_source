package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bwq
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   private String a;
/*  7:   */   private String f;
/*  8:   */   
/*  9:   */   public bwq(String paramString1, String paramString2)
/* 10:   */   {
/* 11: 9 */     this.a = paramString1;
/* 12:10 */     this.f = paramString2;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void b()
/* 16:   */   {
/* 17:15 */     super.b();
/* 18:   */     
/* 19:17 */     this.n.add(new bug(0, this.l / 2 - 100, 140, cwc.a("gui.cancel", new Object[0])));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 23:   */   {
/* 24:22 */     a(0, 0, this.l, this.m, -12574688, -11530224);
/* 25:   */     
/* 26:24 */     a(this.q, this.a, this.l / 2, 90, 16777215);
/* 27:25 */     a(this.q, this.f, this.l / 2, 110, 16777215);
/* 28:   */     
/* 29:27 */     super.a(paramInt1, paramInt2, paramFloat);
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected void a(char paramChar, int paramInt) {}
/* 33:   */   
/* 34:   */   protected void a(bug parambug)
/* 35:   */   {
/* 36:36 */     this.j.a((bxf)null);
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwq
 * JD-Core Version:    0.7.0.1
 */