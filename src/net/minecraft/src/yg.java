package net.minecraft.src;
/*  1:   */ public class yg
/*  2:   */   extends yb
/*  3:   */ {
/*  4:   */   private final double a;
/*  5:   */   private final double b;
/*  6:   */   private String c;
/*  7:   */   
/*  8:   */   public yg(xy paramxy, String paramString, double paramDouble1, double paramDouble2, double paramDouble3)
/*  9:   */   {
/* 10:13 */     super(paramxy, paramString, paramDouble1);
/* 11:14 */     this.a = paramDouble2;
/* 12:15 */     this.b = paramDouble3;
/* 13:17 */     if (paramDouble2 > paramDouble3) {
/* 14:18 */       throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
/* 15:   */     }
/* 16:20 */     if (paramDouble1 < paramDouble2) {
/* 17:21 */       throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
/* 18:   */     }
/* 19:23 */     if (paramDouble1 > paramDouble3) {
/* 20:24 */       throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   public yg a(String paramString)
/* 25:   */   {
/* 26:37 */     this.c = paramString;
/* 27:38 */     return this;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String g()
/* 31:   */   {
/* 32:42 */     return this.c;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public double a(double paramDouble)
/* 36:   */   {
/* 37:47 */     paramDouble = MathUtils.clamp(paramDouble, this.a, this.b);
/* 38:   */     
/* 39:49 */     return paramDouble;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yg
 * JD-Core Version:    0.7.0.1
 */