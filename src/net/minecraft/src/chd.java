package net.minecraft.src;
/*  1:   */ public class chd
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   float a;
/*  5:   */   
/*  6:   */   protected chd(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8:13 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  9:   */     
/* 10:15 */     float f = 2.5F;
/* 11:16 */     this.xVelocity *= 0.1000000014901161D;
/* 12:17 */     this.yVelocity *= 0.1000000014901161D;
/* 13:18 */     this.zVelocity *= 0.1000000014901161D;
/* 14:19 */     this.xVelocity += paramDouble4;
/* 15:20 */     this.yVelocity += paramDouble5;
/* 16:21 */     this.zVelocity += paramDouble6;
/* 17:   */     
/* 18:23 */     this.ap = (this.aq = this.ar = 1.0F - (float)(Math.random() * 0.300000011920929D));
/* 19:24 */     this.h *= 0.75F;
/* 20:25 */     this.h *= f;
/* 21:26 */     this.a = this.h;
/* 22:   */     
/* 23:28 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.3D)));
/* 24:29 */     this.g = ((int)(this.g * f));
/* 25:30 */     this.T = false;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 29:   */   {
/* 30:35 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 31:36 */     f = MathUtils.clamp(f, 0.0F, 1.0F);
/* 32:   */     
/* 33:38 */     this.h = (this.a * f);
/* 34:39 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void onUpdate()
/* 38:   */   {
/* 39:44 */     this.lastX = this.xPos;
/* 40:45 */     this.lastY = this.yPos;
/* 41:46 */     this.lastZ = this.zPos;
/* 42:48 */     if (this.f++ >= this.g) {
/* 43:49 */       setDead();
/* 44:   */     }
/* 45:52 */     k(7 - this.f * 8 / this.g);
/* 46:   */     
/* 47:54 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 48:55 */     this.xVelocity *= 0.9599999785423279D;
/* 49:56 */     this.yVelocity *= 0.9599999785423279D;
/* 50:57 */     this.zVelocity *= 0.9599999785423279D;
/* 51:58 */     EntityPlayer localahd = this.world.a(this, 2.0D);
/* 52:59 */     if ((localahd != null) && 
/* 53:60 */       (this.yPos > localahd.getAABB().minY))
/* 54:   */     {
/* 55:61 */       this.yPos += (localahd.getAABB().minY - this.yPos) * 0.2D;
/* 56:62 */       this.yVelocity += (localahd.yVelocity - this.yVelocity) * 0.2D;
/* 57:63 */       b(this.xPos, this.yPos, this.zPos);
/* 58:   */     }
/* 59:67 */     if (this.C)
/* 60:   */     {
/* 61:68 */       this.xVelocity *= 0.699999988079071D;
/* 62:69 */       this.zVelocity *= 0.699999988079071D;
/* 63:   */     }
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     chd
 * JD-Core Version:    0.7.0.1
 */