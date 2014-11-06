package net.minecraft.src;
/*  1:   */ public class bfn
/*  2:   */ {
/*  3:   */   public final byte[] a;
/*  4:   */   private final int b;
/*  5:   */   private final int c;
/*  6:   */   
/*  7:   */   public bfn(byte[] paramArrayOfByte, int paramInt)
/*  8:   */   {
/*  9:15 */     this.a = paramArrayOfByte;
/* 10:16 */     this.b = paramInt;
/* 11:17 */     this.c = (paramInt + 4);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public int a(int paramInt1, int paramInt2, int paramInt3)
/* 15:   */   {
/* 16:21 */     int i = paramInt1 << this.c | paramInt3 << this.b | paramInt2;
/* 17:22 */     int j = i >> 1;
/* 18:23 */     int k = i & 0x1;
/* 19:25 */     if (k == 0) {
/* 20:26 */       return this.a[j] & 0xF;
/* 21:   */     }
/* 22:28 */     return this.a[j] >> 4 & 0xF;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfn
 * JD-Core Version:    0.7.0.1
 */