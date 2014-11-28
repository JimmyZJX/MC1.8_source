package net.minecraft.src;
/*  1:   */ public class cgg
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   float a;
/*  5:   */   
/*  6:   */   protected cgg(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8:12 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 2.0F);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected cgg(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat)
/* 12:   */   {
/* 13:16 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 14:17 */     this.xVelocity *= 0.009999999776482582D;
/* 15:18 */     this.yVelocity *= 0.009999999776482582D;
/* 16:19 */     this.zVelocity *= 0.009999999776482582D;
/* 17:20 */     this.yVelocity += 0.1D;
/* 18:   */     
/* 19:22 */     this.h *= 0.75F;
/* 20:23 */     this.h *= paramFloat;
/* 21:24 */     this.a = this.h;
/* 22:   */     
/* 23:26 */     this.g = 16;
/* 24:27 */     this.T = false;
/* 25:   */     
/* 26:29 */     k(80);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 30:   */   {
/* 31:34 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 32:35 */     f = MathUtils.clamp(f, 0.0F, 1.0F);
/* 33:   */     
/* 34:37 */     this.h = (this.a * f);
/* 35:38 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void onUpdate()
/* 39:   */   {
/* 40:43 */     this.lastX = this.xPos;
/* 41:44 */     this.lastY = this.yPos;
/* 42:45 */     this.lastZ = this.zPos;
/* 43:47 */     if (this.f++ >= this.g) {
/* 44:48 */       setDead();
/* 45:   */     }
/* 46:51 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/* 47:52 */     if (this.yPos == this.lastY)
/* 48:   */     {
/* 49:53 */       this.xVelocity *= 1.1D;
/* 50:54 */       this.zVelocity *= 1.1D;
/* 51:   */     }
/* 52:56 */     this.xVelocity *= 0.8600000143051148D;
/* 53:57 */     this.yVelocity *= 0.8600000143051148D;
/* 54:58 */     this.zVelocity *= 0.8600000143051148D;
/* 55:60 */     if (this.C)
/* 56:   */     {
/* 57:61 */       this.xVelocity *= 0.699999988079071D;
/* 58:62 */       this.zVelocity *= 0.699999988079071D;
/* 59:   */     }
/* 60:   */   }
/* 61:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgg
 * JD-Core Version:    0.7.0.1
 */