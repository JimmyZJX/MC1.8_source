package net.minecraft.src;
/*  1:   */ public class wf
/*  2:   */ {
/*  3:   */   private final wh a;
/*  4:   */   private final int b;
/*  5:   */   private final float c;
/*  6:   */   private final float d;
/*  7:   */   private final String e;
/*  8:   */   private final float f;
/*  9:   */   
/* 10:   */   public wf(wh paramwh, int paramInt, float paramFloat1, float paramFloat2, String paramString, float paramFloat3)
/* 11:   */   {
/* 12:15 */     this.a = paramwh;
/* 13:16 */     this.b = paramInt;
/* 14:17 */     this.c = paramFloat2;
/* 15:18 */     this.d = paramFloat1;
/* 16:19 */     this.e = paramString;
/* 17:20 */     this.f = paramFloat3;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public wh a()
/* 21:   */   {
/* 22:24 */     return this.a;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public float c()
/* 26:   */   {
/* 27:32 */     return this.c;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public boolean f()
/* 31:   */   {
/* 32:44 */     return this.a.j() instanceof EntityLiving;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String g()
/* 36:   */   {
/* 37:48 */     return this.e;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public ho h()
/* 41:   */   {
/* 42:52 */     return a().j() == null ? null : a().j().e_();
/* 43:   */   }
/* 44:   */   
/* 45:   */   public float i()
/* 46:   */   {
/* 47:56 */     if (this.a == wh.j) {
/* 48:57 */       return 3.4028235E+38F;
/* 49:   */     }
/* 50:59 */     return this.f;
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wf
 * JD-Core Version:    0.7.0.1
 */