package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bwr
/*  4:   */   extends bvx
/*  5:   */ {
/*  6:   */   public void b()
/*  7:   */   {
/*  8:19 */     super.b();
/*  9:   */     
/* 10:21 */     this.n.add(new bug(1, this.l / 2 - 100, this.m - 40, cwc.a("multiplayer.stopSleeping", new Object[0])));
/* 11:   */   }
/* 12:   */   
/* 13:   */   protected void a(char paramChar, int paramInt)
/* 14:   */   {
/* 15:26 */     if (paramInt == 1)
/* 16:   */     {
/* 17:27 */       f();
/* 18:   */     }
/* 19:28 */     else if ((paramInt == 28) || (paramInt == 156))
/* 20:   */     {
/* 21:29 */       String str = this.a.b().trim();
/* 22:31 */       if (!str.isEmpty()) {
/* 23:32 */         this.j.h.e(str);
/* 24:   */       }
/* 25:35 */       this.a.a("");
/* 26:36 */       this.j.q.d().d();
/* 27:   */     }
/* 28:   */     else
/* 29:   */     {
/* 30:38 */       super.a(paramChar, paramInt);
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   protected void a(bug parambug)
/* 35:   */   {
/* 36:44 */     if (parambug.k == 1) {
/* 37:45 */       f();
/* 38:   */     } else {
/* 39:47 */       super.a(parambug);
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   private void f()
/* 44:   */   {
/* 45:52 */     cee localcee = this.j.h.a;
/* 46:53 */     localcee.a(new mn(this.j.h, mo.c));
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwr
 * JD-Core Version:    0.7.0.1
 */