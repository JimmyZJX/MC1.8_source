package net.minecraft.src;
/*  1:   */ public class fa
/*  2:   */ {
/*  3:   */   protected final float a;
/*  4:   */   protected final float b;
/*  5:   */   protected final float c;
/*  6:   */   
/*  7:   */   public fa(float paramFloat1, float paramFloat2, float paramFloat3)
/*  8:   */   {
/*  9:13 */     this.a = paramFloat1;
/* 10:14 */     this.b = paramFloat2;
/* 11:15 */     this.c = paramFloat3;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public fa(fv paramfv)
/* 15:   */   {
/* 16:19 */     this.a = paramfv.e(0);
/* 17:20 */     this.b = paramfv.e(1);
/* 18:21 */     this.c = paramfv.e(2);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public fv a()
/* 22:   */   {
/* 23:25 */     fv localfv = new fv();
/* 24:26 */     localfv.a(new fs(this.a));
/* 25:27 */     localfv.a(new fs(this.b));
/* 26:28 */     localfv.a(new fs(this.c));
/* 27:29 */     return localfv;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public boolean equals(Object paramObject)
/* 31:   */   {
/* 32:34 */     if (!(paramObject instanceof fa)) {
/* 33:35 */       return false;
/* 34:   */     }
/* 35:37 */     fa localfa = (fa)paramObject;
/* 36:38 */     return (this.a == localfa.a) && (this.b == localfa.b) && (this.c == localfa.c);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public float b()
/* 40:   */   {
/* 41:42 */     return this.a;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public float c()
/* 45:   */   {
/* 46:46 */     return this.b;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public float d()
/* 50:   */   {
/* 51:50 */     return this.c;
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fa
 * JD-Core Version:    0.7.0.1
 */