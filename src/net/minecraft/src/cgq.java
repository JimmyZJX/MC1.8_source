package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cgq
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   private float a;
/*  7:   */   
/*  8:   */   protected cgq(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  9:   */   {
/* 10:13 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 11:14 */     this.xVelocity *= 0.800000011920929D;
/* 12:15 */     this.yVelocity *= 0.800000011920929D;
/* 13:16 */     this.zVelocity *= 0.800000011920929D;
/* 14:17 */     this.yVelocity = (this.random.nextFloat() * 0.4F + 0.05F);
/* 15:   */     
/* 16:19 */     this.ap = (this.aq = this.ar = 1.0F);
/* 17:20 */     this.h *= (this.random.nextFloat() * 2.0F + 0.2F);
/* 18:21 */     this.a = this.h;
/* 19:   */     
/* 20:23 */     this.g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
/* 21:24 */     this.T = false;
/* 22:25 */     k(49);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public int b(float paramFloat)
/* 26:   */   {
/* 27:30 */     float f = (this.f + paramFloat) / this.g;
/* 28:31 */     f = MathUtils.clamp(f, 0.0F, 1.0F);
/* 29:32 */     int i = super.b(paramFloat);
/* 30:   */     
/* 31:34 */     int j = 240;
/* 32:35 */     int k = i >> 16 & 0xFF;
/* 33:36 */     return j | k << 16;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public float c(float paramFloat)
/* 37:   */   {
/* 38:41 */     return 1.0F;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 42:   */   {
/* 43:46 */     float f = (this.f + paramFloat1) / this.g;
/* 44:47 */     this.h = (this.a * (1.0F - f * f));
/* 45:48 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void onUpdate()
/* 49:   */   {
/* 50:53 */     this.lastX = this.xPos;
/* 51:54 */     this.lastY = this.yPos;
/* 52:55 */     this.lastZ = this.zPos;
/* 53:57 */     if (this.f++ >= this.g) {
/* 54:58 */       setDead();
/* 55:   */     }
/* 56:60 */     float f = this.f / this.g;
/* 57:61 */     if (this.random.nextFloat() > f) {
/* 58:62 */       this.world.a(ew.l, this.xPos, this.yPos, this.zPos, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 59:   */     }
/* 60:65 */     this.yVelocity -= 0.03D;
/* 61:66 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 62:67 */     this.xVelocity *= 0.9990000128746033D;
/* 63:68 */     this.yVelocity *= 0.9990000128746033D;
/* 64:69 */     this.zVelocity *= 0.9990000128746033D;
/* 65:71 */     if (this.C)
/* 66:   */     {
/* 67:72 */       this.xVelocity *= 0.699999988079071D;
/* 68:73 */       this.zVelocity *= 0.699999988079071D;
/* 69:   */     }
/* 70:   */   }
/* 71:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgq
 * JD-Core Version:    0.7.0.1
 */