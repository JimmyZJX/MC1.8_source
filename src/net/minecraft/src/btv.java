package net.minecraft.src;
/*  1:   */ public class btv
/*  2:   */ {
/*  3:   */   float a;
/*  4:   */   private double f;
/*  5:   */   public int b;
/*  6:   */   public float c;
/*  7:12 */   public float d = 1.0F;
/*  8:   */   public float e;
/*  9:   */   private long g;
/* 10:   */   private long h;
/* 11:   */   private long i;
/* 12:18 */   private double j = 1.0D;
/* 13:   */   
/* 14:   */   public btv(float paramFloat)
/* 15:   */   {
/* 16:21 */     this.a = paramFloat;
/* 17:22 */     this.g = bsu.I();
/* 18:23 */     this.h = (System.nanoTime() / 1000000L);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a()
/* 22:   */   {
/* 23:27 */     long l1 = bsu.I();
/* 24:28 */     long l2 = l1 - this.g;
/* 25:29 */     long l3 = System.nanoTime() / 1000000L;
/* 26:30 */     double d1 = l3 / 1000.0D;
/* 27:32 */     if ((l2 > 1000L) || (l2 < 0L))
/* 28:   */     {
/* 29:33 */       this.f = d1;
/* 30:   */     }
/* 31:   */     else
/* 32:   */     {
/* 33:35 */       this.i += l2;
/* 34:36 */       if (this.i > 1000L)
/* 35:   */       {
/* 36:37 */         long l4 = l3 - this.h;
/* 37:   */         
/* 38:39 */         double d3 = this.i / l4;
/* 39:40 */         this.j += (d3 - this.j) * 0.2000000029802322D;
/* 40:   */         
/* 41:42 */         this.h = l3;
/* 42:43 */         this.i = 0L;
/* 43:   */       }
/* 44:45 */       if (this.i < 0L) {
/* 45:46 */         this.h = l3;
/* 46:   */       }
/* 47:   */     }
/* 48:49 */     this.g = l1;
/* 49:   */     
/* 50:51 */     double d2 = (d1 - this.f) * this.j;
/* 51:52 */     this.f = d1;
/* 52:   */     
/* 53:54 */     d2 = MathUtils.clamp(d2, 0.0D, 1.0D);
/* 54:   */     
/* 55:56 */     this.e = ((float)(this.e + d2 * this.d * this.a));
/* 56:   */     
/* 57:58 */     this.b = ((int)this.e);
/* 58:59 */     this.e -= this.b;
/* 59:60 */     if (this.b > 10) {
/* 60:61 */       this.b = 10;
/* 61:   */     }
/* 62:63 */     this.c = this.e;
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btv
 * JD-Core Version:    0.7.0.1
 */