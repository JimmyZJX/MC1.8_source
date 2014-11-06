package net.minecraft.src;
/*  1:   */ public class bpt
/*  2:   */ {
/*  3:   */   public final int a;
/*  4:   */   public final int b;
/*  5:   */   public final int c;
/*  6:   */   private final int j;
/*  7: 9 */   int d = -1;
/*  8:   */   float e;
/*  9:   */   float f;
/* 10:   */   float g;
/* 11:   */   bpt h;
/* 12:   */   public boolean i;
/* 13:   */   
/* 14:   */   public bpt(int paramInt1, int paramInt2, int paramInt3)
/* 15:   */   {
/* 16:15 */     this.a = paramInt1;
/* 17:16 */     this.b = paramInt2;
/* 18:17 */     this.c = paramInt3;
/* 19:   */     
/* 20:19 */     this.j = a(paramInt1, paramInt2, paramInt3);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public static int a(int paramInt1, int paramInt2, int paramInt3)
/* 24:   */   {
/* 25:23 */     return paramInt2 & 0xFF | (paramInt1 & 0x7FFF) << 8 | (paramInt3 & 0x7FFF) << 24 | (paramInt1 < 0 ? -2147483648 : 0) | (paramInt3 < 0 ? 32768 : 0);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public float a(bpt parambpt)
/* 29:   */   {
/* 30:27 */     float f1 = parambpt.a - this.a;
/* 31:28 */     float f2 = parambpt.b - this.b;
/* 32:29 */     float f3 = parambpt.c - this.c;
/* 33:30 */     return MathUtils.sqrt(f1 * f1 + f2 * f2 + f3 * f3);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public float b(bpt parambpt)
/* 37:   */   {
/* 38:34 */     float f1 = parambpt.a - this.a;
/* 39:35 */     float f2 = parambpt.b - this.b;
/* 40:36 */     float f3 = parambpt.c - this.c;
/* 41:37 */     return f1 * f1 + f2 * f2 + f3 * f3;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public boolean equals(Object paramObject)
/* 45:   */   {
/* 46:41 */     if ((paramObject instanceof bpt))
/* 47:   */     {
/* 48:42 */       bpt localbpt = (bpt)paramObject;
/* 49:43 */       return (this.j == localbpt.j) && (this.a == localbpt.a) && (this.b == localbpt.b) && (this.c == localbpt.c);
/* 50:   */     }
/* 51:45 */     return false;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public int hashCode()
/* 55:   */   {
/* 56:49 */     return this.j;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public boolean a()
/* 60:   */   {
/* 61:53 */     return this.d >= 0;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String toString()
/* 65:   */   {
/* 66:57 */     return this.a + ", " + this.b + ", " + this.c;
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpt
 * JD-Core Version:    0.7.0.1
 */