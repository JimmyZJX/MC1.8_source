package net.minecraft.src;
/*  1:   */ public class cxk
/*  2:   */   implements cvl
/*  3:   */ {
/*  4:   */   private ez a;
/*  5:   */   private final cua b;
/*  6:   */   private final clc c;
/*  7:   */   private cxe d;
/*  8:   */   
/*  9:   */   public cxk(cua paramcua)
/* 10:   */   {
/* 11:16 */     this.b = paramcua;
/* 12:17 */     this.c = new clc(this);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(cvk paramcvk)
/* 16:   */   {
/* 17:22 */     cxh localcxh = new cxh(paramcvk, this.b, this.c);
/* 18:23 */     this.a = localcxh.a();
/* 19:24 */     this.d = ((cxe)this.a.a(cxh.a));
/* 20:25 */     this.c.c();
/* 21:   */   }
/* 22:   */   
/* 23:   */   public cxe a(cxl paramcxl)
/* 24:   */   {
/* 25:29 */     if (paramcxl == null) {
/* 26:30 */       return this.d;
/* 27:   */     }
/* 28:33 */     cxe localcxe = (cxe)this.a.a(paramcxl);
/* 29:34 */     return localcxe == null ? this.d : localcxe;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public cxe a()
/* 33:   */   {
/* 34:38 */     return this.d;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public cua b()
/* 38:   */   {
/* 39:42 */     return this.b;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public clc c()
/* 43:   */   {
/* 44:46 */     return this.c;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxk
 * JD-Core Version:    0.7.0.1
 */