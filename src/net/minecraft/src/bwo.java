package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bwo
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   private String a;
/*  7:   */   private ho f;
/*  8:   */   private List<String> g;
/*  9:   */   private final bxf h;
/* 10:   */   private int i;
/* 11:   */   
/* 12:   */   public bwo(bxf parambxf, String paramString, ho paramho)
/* 13:   */   {
/* 14:17 */     this.h = parambxf;
/* 15:18 */     this.a = cwc.a(paramString, new Object[0]);
/* 16:19 */     this.f = paramho;
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(char paramChar, int paramInt) {}
/* 20:   */   
/* 21:   */   public void b()
/* 22:   */   {
/* 23:28 */     this.n.clear();
/* 24:29 */     this.g = this.q.c(this.f.d(), this.l - 50);
/* 25:   */     
/* 26:31 */     this.i = (this.g.size() * this.q.a);
/* 27:32 */     this.n.add(new bug(0, this.l / 2 - 100, this.m / 2 + this.i / 2 + this.q.a, cwc.a("gui.toMenu", new Object[0])));
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected void a(bug parambug)
/* 31:   */   {
/* 32:37 */     if (parambug.k == 0) {
/* 33:38 */       this.j.a(this.h);
/* 34:   */     }
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 38:   */   {
/* 39:44 */     c();
/* 40:   */     
/* 41:46 */     a(this.q, this.a, this.l / 2, this.m / 2 - this.i / 2 - this.q.a * 2, 11184810);
/* 42:   */     
/* 43:48 */     int j = this.m / 2 - this.i / 2;
/* 44:50 */     if (this.g != null) {
/* 45:51 */       for (String str : this.g)
/* 46:   */       {
/* 47:52 */         a(this.q, str, this.l / 2, j, 16777215);
/* 48:53 */         j += this.q.a;
/* 49:   */       }
/* 50:   */     }
/* 51:57 */     super.a(paramInt1, paramInt2, paramFloat);
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwo
 * JD-Core Version:    0.7.0.1
 */