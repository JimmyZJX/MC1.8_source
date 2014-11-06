package net.minecraft.src;
/*  1:   */ public class chh
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   float a;
/*  5:   */   
/*  6:   */   protected chh(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3)
/*  7:   */   {
/*  8:12 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, 1.0F, paramFloat1, paramFloat2, paramFloat3);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected chh(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 12:   */   {
/* 13:16 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 14:17 */     this.xVelocity *= 0.1000000014901161D;
/* 15:18 */     this.yVelocity *= 0.1000000014901161D;
/* 16:19 */     this.zVelocity *= 0.1000000014901161D;
/* 17:21 */     if (paramFloat2 == 0.0F) {
/* 18:22 */       paramFloat2 = 1.0F;
/* 19:   */     }
/* 20:24 */     float f = (float)Math.random() * 0.4F + 0.6F;
/* 21:25 */     this.ap = (((float)(Math.random() * 0.2000000029802322D) + 0.8F) * paramFloat2 * f);
/* 22:26 */     this.aq = (((float)(Math.random() * 0.2000000029802322D) + 0.8F) * paramFloat3 * f);
/* 23:27 */     this.ar = (((float)(Math.random() * 0.2000000029802322D) + 0.8F) * paramFloat4 * f);
/* 24:28 */     this.h *= 0.75F;
/* 25:29 */     this.h *= paramFloat1;
/* 26:30 */     this.a = this.h;
/* 27:   */     
/* 28:32 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 29:33 */     this.g = ((int)(this.g * paramFloat1));
/* 30:34 */     this.T = false;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 34:   */   {
/* 35:39 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 36:40 */     f = MathUtils.clamp(f, 0.0F, 1.0F);
/* 37:   */     
/* 38:42 */     this.h = (this.a * f);
/* 39:43 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void onUpdate()
/* 43:   */   {
/* 44:48 */     this.lastX = this.xPos;
/* 45:49 */     this.lastY = this.yPos;
/* 46:50 */     this.lastZ = this.zPos;
/* 47:52 */     if (this.f++ >= this.g) {
/* 48:53 */       setDead();
/* 49:   */     }
/* 50:56 */     k(7 - this.f * 8 / this.g);
/* 51:   */     
/* 52:58 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 53:59 */     if (this.yPos == this.lastY)
/* 54:   */     {
/* 55:60 */       this.xVelocity *= 1.1D;
/* 56:61 */       this.zVelocity *= 1.1D;
/* 57:   */     }
/* 58:63 */     this.xVelocity *= 0.9599999785423279D;
/* 59:64 */     this.yVelocity *= 0.9599999785423279D;
/* 60:65 */     this.zVelocity *= 0.9599999785423279D;
/* 61:67 */     if (this.C)
/* 62:   */     {
/* 63:68 */       this.xVelocity *= 0.699999988079071D;
/* 64:69 */       this.zVelocity *= 0.699999988079071D;
/* 65:   */     }
/* 66:   */   }
/* 67:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     chh
 * JD-Core Version:    0.7.0.1
 */