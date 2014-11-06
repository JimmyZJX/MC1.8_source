package net.minecraft.src;
/*  1:   */ public class w
/*  2:   */ {
/*  3:   */   public static x a()
/*  4:   */   {
/*  5:13 */     String str = System.getProperty("os.name").toLowerCase();
/*  6:14 */     if (str.contains("win")) {
/*  7:15 */       return x.c;
/*  8:   */     }
/*  9:17 */     if (str.contains("mac")) {
/* 10:18 */       return x.d;
/* 11:   */     }
/* 12:20 */     if (str.contains("solaris")) {
/* 13:21 */       return x.b;
/* 14:   */     }
/* 15:23 */     if (str.contains("sunos")) {
/* 16:24 */       return x.b;
/* 17:   */     }
/* 18:26 */     if (str.contains("linux")) {
/* 19:27 */       return x.a;
/* 20:   */     }
/* 21:29 */     if (str.contains("unix")) {
/* 22:30 */       return x.a;
/* 23:   */     }
/* 24:32 */     return x.e;
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     w
 * JD-Core Version:    0.7.0.1
 */