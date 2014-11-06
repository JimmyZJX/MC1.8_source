package net.minecraft.src;
/*  1:   */ public class ars
/*  2:   */ {
/*  3:19 */   public float[] a = new float[256];
/*  4:20 */   public arm[] b = new arm[256];
/*  5:   */   public int c;
/*  6:   */   public int d;
/*  7:   */   public long e;
/*  8:   */   
/*  9:   */   public ars(arr paramarr, int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:25 */     this.c = paramInt1;
/* 12:26 */     this.d = paramInt2;
/* 13:27 */     arr.a(paramarr).a(this.a, paramInt1 << 4, paramInt2 << 4, 16, 16);
/* 14:28 */     arr.a(paramarr).a(this.b, paramInt1 << 4, paramInt2 << 4, 16, 16, false);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public arm a(int paramInt1, int paramInt2)
/* 18:   */   {
/* 19:32 */     return this.b[(paramInt1 & 0xF | (paramInt2 & 0xF) << 4)];
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ars
 * JD-Core Version:    0.7.0.1
 */