package net.minecraft.src;
/*  1:   */ public class vu
/*  2:   */ {
/*  3:   */   private final EnumDifficulty a;
/*  4:   */   private final float b;
/*  5:   */   
/*  6:   */   public vu(EnumDifficulty paramvt, long paramLong1, long paramLong2, float paramFloat)
/*  7:   */   {
/*  8:18 */     this.a = paramvt;
/*  9:19 */     this.b = a(paramvt, paramLong1, paramLong2, paramFloat);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public float b()
/* 13:   */   {
/* 14:27 */     return this.b;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public float c()
/* 18:   */   {
/* 19:40 */     if (this.b < 2.0F) {
/* 20:41 */       return 0.0F;
/* 21:   */     }
/* 22:43 */     if (this.b > 4.0F) {
/* 23:44 */       return 1.0F;
/* 24:   */     }
/* 25:46 */     return (this.b - 2.0F) / 2.0F;
/* 26:   */   }
/* 27:   */   
/* 28:   */   private float a(EnumDifficulty paramvt, long paramLong1, long paramLong2, float paramFloat)
/* 29:   */   {
/* 30:50 */     if (paramvt == EnumDifficulty.PEACEFUL) {
/* 31:51 */       return 0.0F;
/* 32:   */     }
/* 33:54 */     int i = paramvt == EnumDifficulty.HARD ? 1 : 0;
/* 34:55 */     float f1 = 0.75F;
/* 35:   */     
/* 36:   */ 
/* 37:58 */     float f2 = MathUtils.clamp(((float)paramLong1 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
/* 38:59 */     f1 += f2;
/* 39:   */     
/* 40:61 */     float f3 = 0.0F;
/* 41:   */     
/* 42:   */ 
/* 43:64 */     f3 += MathUtils.clamp((float)paramLong2 / 3600000.0F, 0.0F, 1.0F) * (i != 0 ? 1.0F : 0.75F);
/* 44:65 */     f3 += MathUtils.clamp(paramFloat * 0.25F, 0.0F, f2);
/* 45:67 */     if (paramvt == EnumDifficulty.EASY) {
/* 46:68 */       f3 *= 0.5F;
/* 47:   */     }
/* 48:70 */     f1 += f3;
/* 49:   */     
/* 50:   */ 
/* 51:   */ 
/* 52:   */ 
/* 53:75 */     return paramvt.a() * f1;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     vu
 * JD-Core Version:    0.7.0.1
 */