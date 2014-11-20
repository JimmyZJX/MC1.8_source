package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class chf
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   private float a;
/*  7:   */   private double ax;
/*  8:   */   private double ay;
/*  9:   */   private double az;
/* 10:   */   
/* 11:   */   protected chf(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 12:   */   {
/* 13:12 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 14:   */     
/* 15:14 */     this.xVelocity = paramDouble4;
/* 16:15 */     this.yVelocity = paramDouble5;
/* 17:16 */     this.zVelocity = paramDouble6;
/* 18:17 */     this.ax = (this.xPos = paramDouble1);
/* 19:18 */     this.ay = (this.yPos = paramDouble2);
/* 20:19 */     this.az = (this.zPos = paramDouble3);
/* 21:   */     
/* 22:21 */     float f = this.rng.nextFloat() * 0.6F + 0.4F;
/* 23:22 */     this.a = (this.h = this.rng.nextFloat() * 0.2F + 0.5F);
/* 24:23 */     this.ap = (this.aq = this.ar = 1.0F * f);
/* 25:24 */     this.aq *= 0.3F;
/* 26:25 */     this.ap *= 0.9F;
/* 27:   */     
/* 28:27 */     this.g = ((int)(Math.random() * 10.0D) + 40);
/* 29:28 */     this.T = true;
/* 30:29 */     k((int)(Math.random() * 8.0D));
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 34:   */   {
/* 35:34 */     float f = (this.f + paramFloat1) / this.g;
/* 36:35 */     f = 1.0F - f;
/* 37:36 */     f *= f;
/* 38:37 */     f = 1.0F - f;
/* 39:38 */     this.h = (this.a * f);
/* 40:39 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int b(float paramFloat)
/* 44:   */   {
/* 45:44 */     int i = super.b(paramFloat);
/* 46:   */     
/* 47:46 */     float f = this.f / this.g;
/* 48:47 */     f *= f;
/* 49:48 */     f *= f;
/* 50:   */     
/* 51:50 */     int j = i & 0xFF;
/* 52:51 */     int k = i >> 16 & 0xFF;
/* 53:52 */     k += (int)(f * 15.0F * 16.0F);
/* 54:53 */     if (k > 240) {
/* 55:54 */       k = 240;
/* 56:   */     }
/* 57:56 */     return j | k << 16;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public float c(float paramFloat)
/* 61:   */   {
/* 62:61 */     float f1 = super.c(paramFloat);
/* 63:62 */     float f2 = this.f / this.g;
/* 64:63 */     f2 = f2 * f2 * f2 * f2;
/* 65:64 */     return f1 * (1.0F - f2) + f2;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void onUpdate()
/* 69:   */   {
/* 70:69 */     this.lastX = this.xPos;
/* 71:70 */     this.lastY = this.yPos;
/* 72:71 */     this.lastZ = this.zPos;
/* 73:   */     
/* 74:73 */     float f1 = this.f / this.g;
/* 75:74 */     float f2 = f1;
/* 76:75 */     f1 = -f1 + f1 * f1 * 2.0F;
/* 77:76 */     f1 = 1.0F - f1;
/* 78:   */     
/* 79:78 */     this.xPos = (this.ax + this.xVelocity * f1);
/* 80:79 */     this.yPos = (this.ay + this.yVelocity * f1 + (1.0F - f2));
/* 81:80 */     this.zPos = (this.az + this.zVelocity * f1);
/* 82:82 */     if (this.f++ >= this.g) {
/* 83:83 */       setDead();
/* 84:   */     }
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     chf
 * JD-Core Version:    0.7.0.1
 */