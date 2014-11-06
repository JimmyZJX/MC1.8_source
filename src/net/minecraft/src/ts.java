package net.minecraft.src;
/*  2:   */ 
/*  3:   */ final class ts
/*  4:   */   implements tv
/*  5:   */ {
/*  6:   */   public String a(int paramInt)
/*  7:   */   {
/*  8:70 */     double d1 = paramInt / 20.0D;
/*  9:71 */     double d2 = d1 / 60.0D;
/* 10:72 */     double d3 = d2 / 60.0D;
/* 11:73 */     double d4 = d3 / 24.0D;
/* 12:74 */     double d5 = d4 / 365.0D;
/* 13:76 */     if (d5 > 0.5D) {
/* 14:77 */       return tq.n().format(d5) + " y";
/* 15:   */     }
/* 16:78 */     if (d4 > 0.5D) {
/* 17:79 */       return tq.n().format(d4) + " d";
/* 18:   */     }
/* 19:80 */     if (d3 > 0.5D) {
/* 20:81 */       return tq.n().format(d3) + " h";
/* 21:   */     }
/* 22:82 */     if (d2 > 0.5D) {
/* 23:83 */       return tq.n().format(d2) + " m";
/* 24:   */     }
/* 25:85 */     return d1 + " s";
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ts
 * JD-Core Version:    0.7.0.1
 */