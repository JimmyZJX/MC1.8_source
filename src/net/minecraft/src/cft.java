package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cft
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   private float a;
/*  7:   */   private double ax;
/*  8:   */   private double ay;
/*  9:   */   private double az;
/* 10:   */   
/* 11:   */   protected cft(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 12:   */   {
/* 13:11 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 14:   */     
/* 15:13 */     this.xVelocity = paramDouble4;
/* 16:14 */     this.yVelocity = paramDouble5;
/* 17:15 */     this.zVelocity = paramDouble6;
/* 18:16 */     this.ax = paramDouble1;
/* 19:17 */     this.ay = paramDouble2;
/* 20:18 */     this.az = paramDouble3;
/* 21:19 */     this.xPos = (this.lastX = paramDouble1 + paramDouble4);
/* 22:20 */     this.yPos = (this.lastY = paramDouble2 + paramDouble5);
/* 23:21 */     this.zPos = (this.lastZ = paramDouble3 + paramDouble6);
/* 24:   */     
/* 25:23 */     float f = this.random.nextFloat() * 0.6F + 0.4F;
/* 26:24 */     this.a = (this.h = this.random.nextFloat() * 0.5F + 0.2F);
/* 27:25 */     this.ap = (this.aq = this.ar = 1.0F * f);
/* 28:26 */     this.aq *= 0.9F;
/* 29:27 */     this.ap *= 0.9F;
/* 30:   */     
/* 31:29 */     this.g = ((int)(Math.random() * 10.0D) + 30);
/* 32:30 */     this.T = true;
/* 33:31 */     k((int)(Math.random() * 26.0D + 1.0D + 224.0D));
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int b(float paramFloat)
/* 37:   */   {
/* 38:36 */     int i = super.b(paramFloat);
/* 39:   */     
/* 40:38 */     float f = this.f / this.g;
/* 41:39 */     f *= f;
/* 42:40 */     f *= f;
/* 43:   */     
/* 44:42 */     int j = i & 0xFF;
/* 45:43 */     int k = i >> 16 & 0xFF;
/* 46:44 */     k += (int)(f * 15.0F * 16.0F);
/* 47:45 */     if (k > 240) {
/* 48:46 */       k = 240;
/* 49:   */     }
/* 50:48 */     return j | k << 16;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public float c(float paramFloat)
/* 54:   */   {
/* 55:53 */     float f1 = super.c(paramFloat);
/* 56:54 */     float f2 = this.f / this.g;
/* 57:55 */     f2 *= f2;
/* 58:56 */     f2 *= f2;
/* 59:57 */     return f1 * (1.0F - f2) + f2;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void onUpdate()
/* 63:   */   {
/* 64:62 */     this.lastX = this.xPos;
/* 65:63 */     this.lastY = this.yPos;
/* 66:64 */     this.lastZ = this.zPos;
/* 67:   */     
/* 68:66 */     float f1 = this.f / this.g;
/* 69:67 */     f1 = 1.0F - f1;
/* 70:   */     
/* 71:69 */     float f2 = 1.0F - f1;
/* 72:70 */     f2 *= f2;
/* 73:71 */     f2 *= f2;
/* 74:72 */     this.xPos = (this.ax + this.xVelocity * f1);
/* 75:73 */     this.yPos = (this.ay + this.yVelocity * f1 - f2 * 1.2F);
/* 76:74 */     this.zPos = (this.az + this.zVelocity * f1);
/* 77:76 */     if (this.f++ >= this.g) {
/* 78:77 */       setDead();
/* 79:   */     }
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cft
 * JD-Core Version:    0.7.0.1
 */