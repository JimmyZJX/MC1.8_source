package net.minecraft.src;
/*  1:   */ public class buw
/*  2:   */   extends bug
/*  3:   */ {
/*  4:   */   private final btr o;
/*  5:   */   
/*  6:   */   public buw(int paramInt1, int paramInt2, int paramInt3, String paramString)
/*  7:   */   {
/*  8:10 */     this(paramInt1, paramInt2, paramInt3, null, paramString);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public buw(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
/* 12:   */   {
/* 13:14 */     super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString);
/* 14:15 */     this.o = null;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public buw(int paramInt1, int paramInt2, int paramInt3, btr parambtr, String paramString)
/* 18:   */   {
/* 19:19 */     super(paramInt1, paramInt2, paramInt3, 150, 20, paramString);
/* 20:20 */     this.o = parambtr;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public btr c()
/* 24:   */   {
/* 25:24 */     return this.o;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buw
 * JD-Core Version:    0.7.0.1
 */