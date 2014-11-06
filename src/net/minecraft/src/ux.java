package net.minecraft.src;
/*  1:   */ public final class ux
/*  2:   */   implements Comparable<ux>
/*  3:   */ {
/*  4:   */   public double a;
/*  5:   */   public double b;
/*  6:   */   public String c;
/*  7:   */   
/*  8:   */   public ux(String paramString, double paramDouble1, double paramDouble2)
/*  9:   */   {
/* 10:26 */     this.c = paramString;
/* 11:27 */     this.a = paramDouble1;
/* 12:28 */     this.b = paramDouble2;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int compareTo(ux paramux)
/* 16:   */   {
/* 17:33 */     if (paramux.a < this.a) {
/* 18:34 */       return -1;
/* 19:   */     }
/* 20:36 */     if (paramux.a > this.a) {
/* 21:37 */       return 1;
/* 22:   */     }
/* 23:39 */     return paramux.c.compareTo(this.c);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int a()
/* 27:   */   {
/* 28:43 */     return (this.c.hashCode() & 0xAAAAAA) + 4473924;
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ux
 * JD-Core Version:    0.7.0.1
 */