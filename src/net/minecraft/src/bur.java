package net.minecraft.src;
/*  1:   */ public class bur
/*  2:   */   extends bug
/*  3:   */ {
/*  4:   */   private boolean o;
/*  5:   */   private String p;
/*  6:   */   private final bvb q;
/*  7:   */   
/*  8:   */   public bur(bvb parambvb, int paramInt1, int paramInt2, int paramInt3, String paramString, boolean paramBoolean)
/*  9:   */   {
/* 10:12 */     super(paramInt1, paramInt2, paramInt3, 150, 20, "");
/* 11:13 */     this.p = paramString;
/* 12:14 */     this.o = paramBoolean;
/* 13:15 */     this.j = c();
/* 14:16 */     this.q = parambvb;
/* 15:   */   }
/* 16:   */   
/* 17:   */   private String c()
/* 18:   */   {
/* 19:20 */     return cwc.a(this.p, new Object[0]) + ": " + (this.o ? cwc.a("gui.yes", new Object[0]) : cwc.a("gui.no", new Object[0]));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void b(boolean paramBoolean)
/* 23:   */   {
/* 24:24 */     this.o = paramBoolean;
/* 25:25 */     this.j = c();
/* 26:26 */     this.q.a(this.k, paramBoolean);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public boolean c(bsu parambsu, int paramInt1, int paramInt2)
/* 30:   */   {
/* 31:31 */     if (super.c(parambsu, paramInt1, paramInt2))
/* 32:   */     {
/* 33:32 */       this.o = (!this.o);
/* 34:33 */       this.j = c();
/* 35:34 */       this.q.a(this.k, this.o);
/* 36:35 */       return true;
/* 37:   */     }
/* 38:38 */     return false;
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bur
 * JD-Core Version:    0.7.0.1
 */