package net.minecraft.src;
/*  1:   */ public class aqt
/*  2:   */ {
/*  3: 4 */   private static int[] a = new int[65536];
/*  4:   */   
/*  5:   */   public static void a(int[] paramArrayOfInt)
/*  6:   */   {
/*  7: 7 */     a = paramArrayOfInt;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public static int a(double paramDouble1, double paramDouble2)
/* 11:   */   {
/* 12:11 */     paramDouble2 *= paramDouble1;
/* 13:12 */     int i = (int)((1.0D - paramDouble1) * 255.0D);
/* 14:13 */     int j = (int)((1.0D - paramDouble2) * 255.0D);
/* 15:14 */     int k = j << 8 | i;
/* 16:15 */     if (k > a.length) {
/* 17:16 */       return -65281;
/* 18:   */     }
/* 19:18 */     return a[k];
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqt
 * JD-Core Version:    0.7.0.1
 */