package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bvy
/*  4:   */   extends bwa
/*  5:   */ {
/*  6:   */   private final String r;
/*  7:   */   private final String s;
/*  8:   */   private final String t;
/*  9:14 */   private boolean u = true;
/* 10:   */   
/* 11:   */   public bvy(bvz parambvz, String paramString, int paramInt, boolean paramBoolean)
/* 12:   */   {
/* 13:17 */     super(parambvz, cwc.a(paramBoolean ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), paramString, paramInt);
/* 14:   */     
/* 15:19 */     this.g = cwc.a(paramBoolean ? "chat.link.open" : "gui.yes", new Object[0]);
/* 16:20 */     this.h = cwc.a(paramBoolean ? "gui.cancel" : "gui.no", new Object[0]);
/* 17:21 */     this.s = cwc.a("chat.copy", new Object[0]);
/* 18:22 */     this.r = cwc.a("chat.link.warning", new Object[0]);
/* 19:23 */     this.t = paramString;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void b()
/* 23:   */   {
/* 24:28 */     this.n.add(new bug(0, this.l / 2 - 50 - 105, this.m / 6 + 96, 100, 20, this.g));
/* 25:29 */     this.n.add(new bug(2, this.l / 2 - 50, this.m / 6 + 96, 100, 20, this.s));
/* 26:30 */     this.n.add(new bug(1, this.l / 2 - 50 + 105, this.m / 6 + 96, 100, 20, this.h));
/* 27:   */   }
/* 28:   */   
/* 29:   */   protected void a(bug parambug)
/* 30:   */   {
/* 31:35 */     if (parambug.k == 2) {
/* 32:36 */       a();
/* 33:   */     }
/* 34:39 */     this.a.a(parambug.k == 0, this.i);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void a()
/* 38:   */   {
/* 39:43 */     e(this.t);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 43:   */   {
/* 44:48 */     super.a(paramInt1, paramInt2, paramFloat);
/* 45:50 */     if (this.u) {
/* 46:51 */       a(this.q, this.r, this.l / 2, 110, 16764108);
/* 47:   */     }
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void f()
/* 51:   */   {
/* 52:56 */     this.u = false;
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvy
 * JD-Core Version:    0.7.0.1
 */