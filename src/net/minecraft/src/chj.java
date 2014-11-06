package net.minecraft.src;
/*  1:   */ public class chj
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   float a;
/*  5:   */   
/*  6:   */   private chj(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8:10 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 1.0F);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected chj(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat)
/* 12:   */   {
/* 13:16 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 14:17 */     this.xVelocity *= 0.1000000014901161D;
/* 15:18 */     this.yVelocity *= 0.1000000014901161D;
/* 16:19 */     this.zVelocity *= 0.1000000014901161D;
/* 17:20 */     this.xVelocity += paramDouble4;
/* 18:21 */     this.yVelocity += paramDouble5;
/* 19:22 */     this.zVelocity += paramDouble6;
/* 20:   */     
/* 21:24 */     this.ap = (this.aq = this.ar = (float)(Math.random() * 0.300000011920929D));
/* 22:25 */     this.h *= 0.75F;
/* 23:26 */     this.h *= paramFloat;
/* 24:27 */     this.a = this.h;
/* 25:   */     
/* 26:29 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 27:30 */     this.g = ((int)(this.g * paramFloat));
/* 28:31 */     this.T = false;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 32:   */   {
/* 33:36 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 34:37 */     f = MathUtils.clamp(f, 0.0F, 1.0F);
/* 35:   */     
/* 36:39 */     this.h = (this.a * f);
/* 37:40 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void onUpdate()
/* 41:   */   {
/* 42:45 */     this.lastX = this.xPos;
/* 43:46 */     this.lastY = this.yPos;
/* 44:47 */     this.lastZ = this.zPos;
/* 45:49 */     if (this.f++ >= this.g) {
/* 46:50 */       setDead();
/* 47:   */     }
/* 48:53 */     k(7 - this.f * 8 / this.g);
/* 49:   */     
/* 50:55 */     this.yVelocity += 0.004D;
/* 51:56 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 52:57 */     if (this.yPos == this.lastY)
/* 53:   */     {
/* 54:58 */       this.xVelocity *= 1.1D;
/* 55:59 */       this.zVelocity *= 1.1D;
/* 56:   */     }
/* 57:61 */     this.xVelocity *= 0.9599999785423279D;
/* 58:62 */     this.yVelocity *= 0.9599999785423279D;
/* 59:63 */     this.zVelocity *= 0.9599999785423279D;
/* 60:65 */     if (this.C)
/* 61:   */     {
/* 62:66 */       this.xVelocity *= 0.699999988079071D;
/* 63:67 */       this.zVelocity *= 0.699999988079071D;
/* 64:   */     }
/* 65:   */   }
			  chj(World arg0, double arg1, double arg2, double arg3, double arg4, double arg5, double arg6, chk arg7) {this(arg0,arg1,arg2,arg3,arg4,arg5,arg6);}
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     chj
 * JD-Core Version:    0.7.0.1
 */