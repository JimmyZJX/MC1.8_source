package net.minecraft.src;
/*  1:   */ public class bff
/*  2:   */ {
/*  3:   */   private final byte[] a;
/*  4:   */   
/*  5:   */   public bff()
/*  6:   */   {
/*  7: 9 */     this.a = new byte[2048];
/*  8:   */   }
/*  9:   */   
/* 10:   */   public bff(byte[] paramArrayOfByte)
/* 11:   */   {
/* 12:13 */     this.a = paramArrayOfByte;
/* 13:15 */     if (paramArrayOfByte.length != 2048) {
/* 14:16 */       throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + paramArrayOfByte.length);
/* 15:   */     }
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int a(int paramInt1, int paramInt2, int paramInt3)
/* 19:   */   {
/* 20:21 */     return a(b(paramInt1, paramInt2, paramInt3));
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 24:   */   {
/* 25:25 */     a(b(paramInt1, paramInt2, paramInt3), paramInt4);
/* 26:   */   }
/* 27:   */   
/* 28:   */   private int b(int paramInt1, int paramInt2, int paramInt3)
/* 29:   */   {
/* 30:29 */     return paramInt2 << 8 | paramInt3 << 4 | paramInt1;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public int a(int paramInt)
/* 34:   */   {
/* 35:33 */     int i = c(paramInt);
/* 36:35 */     if (b(paramInt)) {
/* 37:36 */       return this.a[i] & 0xF;
/* 38:   */     }
/* 39:38 */     return this.a[i] >> 4 & 0xF;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a(int paramInt1, int paramInt2)
/* 43:   */   {
/* 44:43 */     int i = c(paramInt1);
/* 45:45 */     if (b(paramInt1)) {
/* 46:46 */       this.a[i] = ((byte)(this.a[i] & 0xF0 | paramInt2 & 0xF));
/* 47:   */     } else {
/* 48:48 */       this.a[i] = ((byte)(this.a[i] & 0xF | (paramInt2 & 0xF) << 4));
/* 49:   */     }
/* 50:   */   }
/* 51:   */   
/* 52:   */   private boolean b(int paramInt)
/* 53:   */   {
/* 54:53 */     return (paramInt & 0x1) == 0;
/* 55:   */   }
/* 56:   */   
/* 57:   */   private int c(int paramInt)
/* 58:   */   {
/* 59:57 */     return paramInt >> 1;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public byte[] a()
/* 63:   */   {
/* 64:61 */     return this.a;
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bff
 * JD-Core Version:    0.7.0.1
 */