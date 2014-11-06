package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class cxm
/*  4:   */   implements cxe
/*  5:   */ {
/*  6:   */   protected final List<clt> a;
/*  7:   */   protected final List<List<clt>> b;
/*  8:   */   protected final boolean c;
/*  9:   */   protected final boolean d;
/* 10:   */   protected final cue e;
/* 11:   */   protected final cmx f;
/* 12:   */   
/* 13:   */   public cxm(List<clt> paramList1, List<List<clt>> paramList2, boolean paramBoolean1, boolean paramBoolean2, cue paramcue, cmx paramcmx)
/* 14:   */   {
/* 15:22 */     this.a = paramList1;
/* 16:23 */     this.b = paramList2;
/* 17:24 */     this.c = paramBoolean1;
/* 18:25 */     this.d = paramBoolean2;
/* 19:26 */     this.e = paramcue;
/* 20:27 */     this.f = paramcmx;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public List<clt> a(EnumDirection paramej)
/* 24:   */   {
/* 25:32 */     return this.b.get(paramej.ordinal());
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<clt> a()
/* 29:   */   {
/* 30:37 */     return this.a;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean b()
/* 34:   */   {
/* 35:42 */     return this.c;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public boolean c()
/* 39:   */   {
/* 40:47 */     return this.d;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public boolean d()
/* 44:   */   {
/* 45:52 */     return false;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public cue e()
/* 49:   */   {
/* 50:57 */     return this.e;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public cmx f()
/* 54:   */   {
/* 55:62 */     return this.f;
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxm
 * JD-Core Version:    0.7.0.1
 */