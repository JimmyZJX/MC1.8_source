package net.minecraft.src;
/*  1:   */ public class bgh
/*  2:   */   extends bgd
/*  3:   */ {
/*  4:   */   public void b()
/*  5:   */   {
/*  6:14 */     this.c = new asc(arm.y, 0.0F);
/*  7:15 */     this.g = 1;
/*  8:16 */     this.e = true;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public IChunkProvider c()
/* 12:   */   {
/* 13:21 */     return new EndChunkProvider(this.world, this.world.J());
/* 14:   */   }
/* 15:   */   
/* 16:   */   public float a(long paramLong, float paramFloat)
/* 17:   */   {
/* 18:26 */     return 0.0F;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public float[] a(float paramFloat1, float paramFloat2)
/* 22:   */   {
/* 23:31 */     return null;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public Vec3 b(float paramFloat1, float paramFloat2)
/* 27:   */   {
/* 28:36 */     int i = 10518688;
/* 29:37 */     float f1 = MathUtils.cos(paramFloat1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
/* 30:38 */     f1 = MathUtils.clamp(f1, 0.0F, 1.0F);
/* 31:   */     
/* 32:40 */     float f2 = (i >> 16 & 0xFF) / 255.0F;
/* 33:41 */     float f3 = (i >> 8 & 0xFF) / 255.0F;
/* 34:42 */     float f4 = (i & 0xFF) / 255.0F;
/* 35:43 */     f2 *= (f1 * 0.0F + 0.15F);
/* 36:44 */     f3 *= (f1 * 0.0F + 0.15F);
/* 37:45 */     f4 *= (f1 * 0.0F + 0.15F);
/* 38:   */     
/* 39:47 */     return new Vec3(f2, f3, f4);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean g()
/* 43:   */   {
/* 44:52 */     return false;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean e()
/* 48:   */   {
/* 49:57 */     return false;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public boolean d()
/* 53:   */   {
/* 54:62 */     return false;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public float f()
/* 58:   */   {
/* 59:67 */     return 8.0F;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public boolean a(int paramInt1, int paramInt2)
/* 63:   */   {
/* 64:72 */     return this.world.c(new BlockPosition(paramInt1, 0, paramInt2)).getMaterial().c();
/* 65:   */   }
/* 66:   */   
/* 67:   */   public BlockPosition h()
/* 68:   */   {
/* 69:77 */     return new BlockPosition(100, 50, 0);
/* 70:   */   }
/* 71:   */   
/* 72:   */   public int i()
/* 73:   */   {
/* 74:82 */     return 50;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public boolean b(int paramInt1, int paramInt2)
/* 78:   */   {
/* 79:87 */     return true;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public String k()
/* 83:   */   {
/* 84:92 */     return "The End";
/* 85:   */   }
/* 86:   */   
/* 87:   */   public String l()
/* 88:   */   {
/* 89:97 */     return "_end";
/* 90:   */   }
/* 91:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgh
 * JD-Core Version:    0.7.0.1
 */