package net.minecraft.src;
/*  1:   */ public class yn
/*  2:   */ {
/*  3:   */   protected EntityMob a;
/*  4:   */   protected double b;
/*  5:   */   protected double c;
/*  6:   */   protected double d;
/*  7:   */   protected double e;
/*  8:   */   protected boolean f;
/*  9:   */   
/* 10:   */   public yn(EntityMob paramxn)
/* 11:   */   {
/* 12:21 */     this.a = paramxn;
/* 13:22 */     this.b = paramxn.xPos;
/* 14:23 */     this.c = paramxn.yPos;
/* 15:24 */     this.d = paramxn.zPos;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean a()
/* 19:   */   {
/* 20:28 */     return this.f;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public double b()
/* 24:   */   {
/* 25:32 */     return this.e;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/* 29:   */   {
/* 30:36 */     this.b = paramDouble1;
/* 31:37 */     this.c = paramDouble2;
/* 32:38 */     this.d = paramDouble3;
/* 33:39 */     this.e = paramDouble4;
/* 34:40 */     this.f = true;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void c()
/* 38:   */   {
/* 39:44 */     this.a.m(0.0F);
/* 40:45 */     if (!this.f) {
/* 41:46 */       return;
/* 42:   */     }
/* 43:48 */     this.f = false;
/* 44:   */     
/* 45:50 */     int i = MathUtils.floor(this.a.getAABB().minY + 0.5D);
/* 46:   */     
/* 47:52 */     double d1 = this.b - this.a.xPos;
/* 48:53 */     double d2 = this.d - this.a.zPos;
/* 49:54 */     double d3 = this.c - i;
/* 50:55 */     double d4 = d1 * d1 + d3 * d3 + d2 * d2;
/* 51:56 */     if (d4 < 2.500000277905201E-007D) {
/* 52:57 */       return;
/* 53:   */     }
/* 54:60 */     float f1 = (float)(Math.atan2(d2, d1) * 180.0D / 3.141592741012573D) - 90.0F;
/* 55:   */     
/* 56:62 */     this.a.yaw = a(this.a.yaw, f1, 30.0F);
/* 57:63 */     this.a.j((float)(this.e * this.a.a(afs.d).e()));
/* 58:65 */     if ((d3 > 0.0D) && (d1 * d1 + d2 * d2 < 1.0D)) {
/* 59:66 */       this.a.r().a();
/* 60:   */     }
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected float a(float paramFloat1, float paramFloat2, float paramFloat3)
/* 64:   */   {
/* 65:71 */     float f1 = MathUtils.wrapDegrees(paramFloat2 - paramFloat1);
/* 66:72 */     if (f1 > paramFloat3) {
/* 67:73 */       f1 = paramFloat3;
/* 68:   */     }
/* 69:75 */     if (f1 < -paramFloat3) {
/* 70:76 */       f1 = -paramFloat3;
/* 71:   */     }
/* 72:78 */     float f2 = paramFloat1 + f1;
/* 73:79 */     if (f2 < 0.0F) {
/* 74:80 */       f2 += 360.0F;
/* 75:81 */     } else if (f2 > 360.0F) {
/* 76:82 */       f2 -= 360.0F;
/* 77:   */     }
/* 78:84 */     return f2;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public double d()
/* 82:   */   {
/* 83:88 */     return this.b;
/* 84:   */   }
/* 85:   */   
/* 86:   */   public double e()
/* 87:   */   {
/* 88:92 */     return this.c;
/* 89:   */   }
/* 90:   */   
/* 91:   */   public double f()
/* 92:   */   {
/* 93:96 */     return this.d;
/* 94:   */   }
/* 95:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yn
 * JD-Core Version:    0.7.0.1
 */