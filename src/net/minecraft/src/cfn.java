package net.minecraft.src;
/*  1:   */ public class cfn
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   float a;
/*  5:   */   
/*  6:   */   protected cfn(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8:10 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 1.0F);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected cfn(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat)
/* 12:   */   {
/* 13:16 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 14:17 */     this.xVelocity *= 0.1000000014901161D;
/* 15:18 */     this.yVelocity *= 0.1000000014901161D;
/* 16:19 */     this.zVelocity *= 0.1000000014901161D;
/* 17:20 */     this.xVelocity += paramDouble4 * 0.4D;
/* 18:21 */     this.yVelocity += paramDouble5 * 0.4D;
/* 19:22 */     this.zVelocity += paramDouble6 * 0.4D;
/* 20:   */     
/* 21:24 */     this.ap = (this.aq = this.ar = (float)(Math.random() * 0.300000011920929D + 0.6000000238418579D));
/* 22:25 */     this.h *= 0.75F;
/* 23:26 */     this.h *= paramFloat;
/* 24:27 */     this.a = this.h;
/* 25:   */     
/* 26:29 */     this.g = ((int)(6.0D / (Math.random() * 0.8D + 0.6D)));
/* 27:30 */     this.g = ((int)(this.g * paramFloat));
/* 28:31 */     this.T = false;
/* 29:   */     
/* 30:33 */     k(65);
/* 31:34 */     onUpdate();
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 35:   */   {
/* 36:39 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 37:40 */     f = MathUtils.clamp(f, 0.0F, 1.0F);
/* 38:   */     
/* 39:42 */     this.h = (this.a * f);
/* 40:43 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void onUpdate()
/* 44:   */   {
/* 45:48 */     this.lastX = this.xPos;
/* 46:49 */     this.lastY = this.yPos;
/* 47:50 */     this.lastZ = this.zPos;
/* 48:52 */     if (this.f++ >= this.g) {
/* 49:53 */       setDead();
/* 50:   */     }
/* 51:56 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/* 52:57 */     this.aq = ((float)(this.aq * 0.96D));
/* 53:58 */     this.ar = ((float)(this.ar * 0.9D));
/* 54:   */     
/* 55:60 */     this.xVelocity *= 0.699999988079071D;
/* 56:61 */     this.yVelocity *= 0.699999988079071D;
/* 57:62 */     this.zVelocity *= 0.699999988079071D;
/* 58:63 */     this.yVelocity -= 0.01999999955296516D;
/* 59:65 */     if (this.C)
/* 60:   */     {
/* 61:66 */       this.xVelocity *= 0.699999988079071D;
/* 62:67 */       this.zVelocity *= 0.699999988079071D;
/* 63:   */     }
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfn
 * JD-Core Version:    0.7.0.1
 */