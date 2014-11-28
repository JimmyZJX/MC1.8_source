package net.minecraft.src;
/*  1:   */ public class cgu
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   float a;
/*  5:   */   
/*  6:   */   protected cgu(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8:12 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 2.0F);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected cgu(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat)
/* 12:   */   {
/* 13:16 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 14:17 */     this.xVelocity *= 0.009999999776482582D;
/* 15:18 */     this.yVelocity *= 0.009999999776482582D;
/* 16:19 */     this.zVelocity *= 0.009999999776482582D;
/* 17:20 */     this.yVelocity += 0.2D;
/* 18:   */     
/* 19:22 */     this.ap = (MathUtils.sin(((float)paramDouble4 + 0.0F) * 3.141593F * 2.0F) * 0.65F + 0.35F);
/* 20:23 */     this.aq = (MathUtils.sin(((float)paramDouble4 + 0.3333333F) * 3.141593F * 2.0F) * 0.65F + 0.35F);
/* 21:24 */     this.ar = (MathUtils.sin(((float)paramDouble4 + 0.6666667F) * 3.141593F * 2.0F) * 0.65F + 0.35F);
/* 22:   */     
/* 23:26 */     this.h *= 0.75F;
/* 24:27 */     this.h *= paramFloat;
/* 25:28 */     this.a = this.h;
/* 26:   */     
/* 27:30 */     this.g = 6;
/* 28:31 */     this.T = false;
/* 29:   */     
/* 30:33 */     k(64);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 34:   */   {
/* 35:38 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 36:39 */     f = MathUtils.clamp(f, 0.0F, 1.0F);
/* 37:   */     
/* 38:41 */     this.h = (this.a * f);
/* 39:42 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void onUpdate()
/* 43:   */   {
/* 44:47 */     this.lastX = this.xPos;
/* 45:48 */     this.lastY = this.yPos;
/* 46:49 */     this.lastZ = this.zPos;
/* 47:51 */     if (this.f++ >= this.g) {
/* 48:52 */       setDead();
/* 49:   */     }
/* 50:55 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/* 51:56 */     if (this.yPos == this.lastY)
/* 52:   */     {
/* 53:57 */       this.xVelocity *= 1.1D;
/* 54:58 */       this.zVelocity *= 1.1D;
/* 55:   */     }
/* 56:60 */     this.xVelocity *= 0.660000026226044D;
/* 57:61 */     this.yVelocity *= 0.660000026226044D;
/* 58:62 */     this.zVelocity *= 0.660000026226044D;
/* 59:64 */     if (this.C)
/* 60:   */     {
/* 61:65 */       this.xVelocity *= 0.699999988079071D;
/* 62:66 */       this.zVelocity *= 0.699999988079071D;
/* 63:   */     }
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgu
 * JD-Core Version:    0.7.0.1
 */