package net.minecraft.src;
/*  1:   */ public class aqp
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
/* 15:14 */     return a[(j << 8 | i)];
/* 16:   */   }
/* 17:   */   
/* 18:   */   public static int a()
/* 19:   */   {
/* 20:18 */     return 6396257;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public static int b()
/* 24:   */   {
/* 25:22 */     return 8431445;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public static int c()
/* 29:   */   {
/* 30:26 */     return 4764952;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqp
 * JD-Core Version:    0.7.0.1
 */