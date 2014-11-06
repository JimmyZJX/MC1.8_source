package net.minecraft.src;
/*  1:   */ public class cma
/*  2:   */ {
/*  3:   */   public float[] a;
/*  4:   */   public final int b;
/*  5:   */   
/*  6:   */   public cma(float[] paramArrayOfFloat, int paramInt)
/*  7:   */   {
/*  8:14 */     this.a = paramArrayOfFloat;
/*  9:15 */     this.b = paramInt;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public float a(int paramInt)
/* 13:   */   {
/* 14:20 */     if (this.a == null) {
/* 15:21 */       throw new NullPointerException("uvs");
/* 16:   */     }
/* 17:23 */     int i = d(paramInt);
/* 18:24 */     return (i == 0) || (i == 1) ? this.a[0] : this.a[2];
/* 19:   */   }
/* 20:   */   
/* 21:   */   public float b(int paramInt)
/* 22:   */   {
/* 23:29 */     if (this.a == null) {
/* 24:30 */       throw new NullPointerException("uvs");
/* 25:   */     }
/* 26:32 */     int i = d(paramInt);
/* 27:33 */     return (i == 0) || (i == 3) ? this.a[1] : this.a[3];
/* 28:   */   }
/* 29:   */   
/* 30:   */   private int d(int paramInt)
/* 31:   */   {
/* 32:37 */     return (paramInt + this.b / 90) % 4;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public int c(int paramInt)
/* 36:   */   {
/* 37:41 */     return (paramInt + (4 - this.b / 90)) % 4;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(float[] paramArrayOfFloat)
/* 41:   */   {
/* 42:45 */     if (this.a == null) {
/* 43:46 */       this.a = paramArrayOfFloat;
/* 44:   */     }
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cma
 * JD-Core Version:    0.7.0.1
 */