package net.minecraft.src;
/*  1:   */ public class bzr
/*  2:   */   implements buv
/*  3:   */ {
/*  4:   */   private final bzp c;
/*  5:   */   protected final bsu a;
/*  6:   */   protected final cyq b;
/*  7:15 */   private long d = 0L;
/*  8:   */   
/*  9:   */   protected bzr(bzp parambzp, cyq paramcyq)
/* 10:   */   {
/* 11:18 */     this.c = parambzp;
/* 12:19 */     this.b = paramcyq;
/* 13:20 */     this.a = bsu.z();
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/* 17:   */   {
/* 18:25 */     this.a.k.a(cwc.a("lanServer.title", new Object[0]), paramInt2 + 32 + 3, paramInt3 + 1, 16777215);
/* 19:26 */     this.a.k.a(this.b.a(), paramInt2 + 32 + 3, paramInt3 + 12, 8421504);
/* 20:28 */     if (this.a.t.w) {
/* 21:29 */       this.a.k.a(cwc.a("selectServer.hiddenAddress", new Object[0]), paramInt2 + 32 + 3, paramInt3 + 12 + 11, 3158064);
/* 22:   */     } else {
/* 23:31 */       this.a.k.a(this.b.b(), paramInt2 + 32 + 3, paramInt3 + 12 + 11, 3158064);
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 28:   */   {
/* 29:37 */     this.c.b(paramInt1);
/* 30:38 */     if (bsu.I() - this.d < 250L) {
/* 31:39 */       this.c.f();
/* 32:   */     }
/* 33:41 */     this.d = bsu.I();
/* 34:42 */     return false;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void a(int paramInt1, int paramInt2, int paramInt3) {}
/* 38:   */   
/* 39:   */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/* 40:   */   
/* 41:   */   public cyq a()
/* 42:   */   {
/* 43:54 */     return this.b;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzr
 * JD-Core Version:    0.7.0.1
 */