package net.minecraft.src;
/*  1:   */ public class byh
/*  2:   */   implements buv
/*  3:   */ {
/*  4:   */   private final String b;
/*  5:   */   private final int c;
			  private final byf a;
/*  6:   */   
/*  7:   */   public byh(byf parambyf, String paramString)
/*  8:   */   {
				a=parambyf;
/*  9:65 */     this.b = cwc.a(paramString, new Object[0]);
/* 10:66 */     this.c = byf.a(parambyf).k.a(this.b);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/* 14:   */   {
/* 15:71 */     byf.a(this.a).k.a(this.b, byf.a(this.a).m.l / 2 - this.c / 2, paramInt3 + paramInt5 - byf.a(this.a).k.a - 1, 16777215);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 19:   */   {
/* 20:76 */     return false;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/* 24:   */   
/* 25:   */   public void a(int paramInt1, int paramInt2, int paramInt3) {}
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byh
 * JD-Core Version:    0.7.0.1
 */