package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cgc
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   private float a;
/*  7:   */   
/*  8:   */   protected cgc(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  9:   */   {
/* 10:12 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 11:13 */     this.xVelocity = (this.xVelocity * 0.009999999776482582D + paramDouble4);
/* 12:14 */     this.yVelocity = (this.yVelocity * 0.009999999776482582D + paramDouble5);
/* 13:15 */     this.zVelocity = (this.zVelocity * 0.009999999776482582D + paramDouble6);
/* 14:16 */     paramDouble1 += (this.random.nextFloat() - this.random.nextFloat()) * 0.05F;
/* 15:17 */     paramDouble2 += (this.random.nextFloat() - this.random.nextFloat()) * 0.05F;
/* 16:18 */     paramDouble3 += (this.random.nextFloat() - this.random.nextFloat()) * 0.05F;
/* 17:   */     
/* 18:20 */     this.a = this.h;
/* 19:21 */     this.ap = (this.aq = this.ar = 1.0F);
/* 20:   */     
/* 21:23 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4);
/* 22:24 */     this.T = true;
/* 23:25 */     k(48);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 27:   */   {
/* 28:30 */     float f = (this.f + paramFloat1) / this.g;
/* 29:31 */     this.h = (this.a * (1.0F - f * f * 0.5F));
/* 30:32 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public int b(float paramFloat)
/* 34:   */   {
/* 35:37 */     float f = (this.f + paramFloat) / this.g;
/* 36:38 */     f = MathUtils.clamp(f, 0.0F, 1.0F);
/* 37:39 */     int i = super.b(paramFloat);
/* 38:   */     
/* 39:41 */     int j = i & 0xFF;
/* 40:42 */     int k = i >> 16 & 0xFF;
/* 41:43 */     j += (int)(f * 15.0F * 16.0F);
/* 42:44 */     if (j > 240) {
/* 43:45 */       j = 240;
/* 44:   */     }
/* 45:47 */     return j | k << 16;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public float c(float paramFloat)
/* 49:   */   {
/* 50:52 */     float f1 = (this.f + paramFloat) / this.g;
/* 51:53 */     f1 = MathUtils.clamp(f1, 0.0F, 1.0F);
/* 52:54 */     float f2 = super.c(paramFloat);
/* 53:   */     
/* 54:56 */     return f2 * f1 + (1.0F - f1);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void onUpdate()
/* 58:   */   {
/* 59:61 */     this.lastX = this.xPos;
/* 60:62 */     this.lastY = this.yPos;
/* 61:63 */     this.lastZ = this.zPos;
/* 62:65 */     if (this.f++ >= this.g) {
/* 63:66 */       setDead();
/* 64:   */     }
/* 65:69 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 66:70 */     this.xVelocity *= 0.9599999785423279D;
/* 67:71 */     this.yVelocity *= 0.9599999785423279D;
/* 68:72 */     this.zVelocity *= 0.9599999785423279D;
/* 69:74 */     if (this.C)
/* 70:   */     {
/* 71:75 */       this.xVelocity *= 0.699999988079071D;
/* 72:76 */       this.zVelocity *= 0.699999988079071D;
/* 73:   */     }
/* 74:   */   }
/* 75:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgc
 * JD-Core Version:    0.7.0.1
 */