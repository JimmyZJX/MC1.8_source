package net.minecraft.src;
/*  1:   */ public class uz
/*  2:   */ {
/*  3:   */   private float a;
/*  4:   */   private float b;
/*  5:   */   private float c;
/*  6:   */   
/*  7:   */   public float a(float paramFloat1, float paramFloat2)
/*  8:   */   {
/*  9: 9 */     this.a += paramFloat1;
/* 10:   */     
/* 11:11 */     paramFloat1 = (this.a - this.b) * paramFloat2;
/* 12:12 */     this.c += (paramFloat1 - this.c) * 0.5F;
/* 13:13 */     if (((paramFloat1 > 0.0F) && (paramFloat1 > this.c)) || ((paramFloat1 < 0.0F) && (paramFloat1 < this.c))) {
/* 14:14 */       paramFloat1 = this.c;
/* 15:   */     }
/* 16:16 */     this.b += paramFloat1;
/* 17:   */     
/* 18:18 */     return paramFloat1;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a()
/* 22:   */   {
/* 23:22 */     this.a = 0.0F;
/* 24:23 */     this.b = 0.0F;
/* 25:24 */     this.c = 0.0F;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     uz
 * JD-Core Version:    0.7.0.1
 */