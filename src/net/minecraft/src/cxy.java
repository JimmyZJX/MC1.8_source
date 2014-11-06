package net.minecraft.src;
/*  1:   */ public class cxy
/*  2:   */   extends cxt
/*  3:   */ {
/*  4:   */   public static cxy a(oa paramoa, float paramFloat)
/*  5:   */   {
/*  6:12 */     return new cxy(paramoa, 0.25F, paramFloat, false, 0, cyf.a, 0.0F, 0.0F, 0.0F);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public static cxy a(oa paramoa)
/* 10:   */   {
/* 11:16 */     return new cxy(paramoa, 1.0F, 1.0F, false, 0, cyf.a, 0.0F, 0.0F, 0.0F);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public static cxy a(oa paramoa, float paramFloat1, float paramFloat2, float paramFloat3)
/* 15:   */   {
/* 16:20 */     return new cxy(paramoa, 4.0F, 1.0F, false, 0, cyf.b, paramFloat1, paramFloat2, paramFloat3);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public cxy(oa paramoa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
/* 20:   */   {
/* 21:24 */     this(paramoa, paramFloat1, paramFloat2, false, 0, cyf.b, paramFloat3, paramFloat4, paramFloat5);
/* 22:   */   }
/* 23:   */   
/* 24:   */   private cxy(oa paramoa, float paramFloat1, float paramFloat2, boolean paramBoolean, int paramInt, cyf paramcyf, float paramFloat3, float paramFloat4, float paramFloat5)
/* 25:   */   {
/* 26:28 */     super(paramoa);
/* 27:29 */     this.b = paramFloat1;
/* 28:30 */     this.c = paramFloat2;
/* 29:31 */     this.d = paramFloat3;
/* 30:32 */     this.e = paramFloat4;
/* 31:33 */     this.f = paramFloat5;
/* 32:34 */     this.g = paramBoolean;
/* 33:35 */     this.h = paramInt;
/* 34:36 */     this.i = paramcyf;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxy
 * JD-Core Version:    0.7.0.1
 */