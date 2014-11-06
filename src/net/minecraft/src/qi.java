package net.minecraft.src;
/*  1:   */ public class qi
/*  2:   */ {
/*  3:   */   private final int a;
/*  4:   */   private final BlockPosition b;
/*  5:   */   private int c;
/*  6:   */   private int d;
/*  7:   */   
/*  8:   */   public qi(int paramInt, BlockPosition paramdt)
/*  9:   */   {
/* 10:12 */     this.a = paramInt;
/* 11:13 */     this.b = paramdt;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public BlockPosition b()
/* 15:   */   {
/* 16:21 */     return this.b;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(int paramInt)
/* 20:   */   {
/* 21:25 */     if (paramInt > 10) {
/* 22:26 */       paramInt = 10;
/* 23:   */     }
/* 24:28 */     this.c = paramInt;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public int c()
/* 28:   */   {
/* 29:32 */     return this.c;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void b(int paramInt)
/* 33:   */   {
/* 34:36 */     this.d = paramInt;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int d()
/* 38:   */   {
/* 39:40 */     return this.d;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qi
 * JD-Core Version:    0.7.0.1
 */