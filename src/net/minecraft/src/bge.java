package net.minecraft.src;
/*  1:   */ public class bge
/*  2:   */   extends bgd
/*  3:   */ {
/*  4:   */   public void b()
/*  5:   */   {
/*  6:14 */     this.c = new asc(arm.x, 0.0F);
/*  7:15 */     this.d = true;
/*  8:16 */     this.e = true;
/*  9:17 */     this.g = -1;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public Vec3 b(float paramFloat1, float paramFloat2)
/* 13:   */   {
/* 14:22 */     return new Vec3(0.2000000029802322D, 0.02999999932944775D, 0.02999999932944775D);
/* 15:   */   }
/* 16:   */   
/* 17:   */   protected void a()
/* 18:   */   {
/* 19:27 */     float f1 = 0.1F;
/* 20:28 */     for (int i = 0; i <= 15; i++)
/* 21:   */     {
/* 22:29 */       float f2 = 1.0F - i / 15.0F;
/* 23:30 */       this.f[i] = ((1.0F - f2) / (f2 * 3.0F + 1.0F) * (1.0F - f1) + f1);
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public bfe c()
/* 28:   */   {
/* 29:36 */     return new bgr(this.world, this.world.getWorldInfo().s(), this.world.J());
/* 30:   */   }
/* 31:   */   
/* 32:   */   public boolean d()
/* 33:   */   {
/* 34:41 */     return false;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public boolean a(int paramInt1, int paramInt2)
/* 38:   */   {
/* 39:46 */     return false;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public float a(long paramLong, float paramFloat)
/* 43:   */   {
/* 44:51 */     return 0.5F;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean e()
/* 48:   */   {
/* 49:56 */     return false;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public boolean b(int paramInt1, int paramInt2)
/* 53:   */   {
/* 54:61 */     return true;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public String k()
/* 58:   */   {
/* 59:66 */     return "Nether";
/* 60:   */   }
/* 61:   */   
/* 62:   */   public String l()
/* 63:   */   {
/* 64:71 */     return "_nether";
/* 65:   */   }
/* 66:   */   
/* 67:   */   public bfb r()
/* 68:   */   {
/* 69:76 */     return new bgf(this);
/* 70:   */   }
/* 71:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bge
 * JD-Core Version:    0.7.0.1
 */