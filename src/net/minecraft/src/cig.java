package net.minecraft.src;
/*  1:   */ public class cig
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   protected cig(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  5:   */   {
/*  6: 7 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  7: 8 */     this.xVelocity *= 0.300000011920929D;
/*  8: 9 */     this.yVelocity = (Math.random() * 0.2000000029802322D + 0.1000000014901161D);
/*  9:10 */     this.zVelocity *= 0.300000011920929D;
/* 10:   */     
/* 11:12 */     this.ap = 1.0F;
/* 12:13 */     this.aq = 1.0F;
/* 13:14 */     this.ar = 1.0F;
/* 14:15 */     k(19);
/* 15:16 */     a(0.01F, 0.01F);
/* 16:   */     
/* 17:18 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 18:   */     
/* 19:20 */     this.i = 0.0F;
/* 20:21 */     this.xVelocity = paramDouble4;
/* 21:22 */     this.yVelocity = paramDouble5;
/* 22:23 */     this.zVelocity = paramDouble6;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void onUpdate()
/* 26:   */   {
/* 27:28 */     this.lastX = this.xPos;
/* 28:29 */     this.lastY = this.yPos;
/* 29:30 */     this.lastZ = this.zPos;
/* 30:   */     
/* 31:32 */     this.yVelocity -= this.i;
/* 32:33 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/* 33:34 */     this.xVelocity *= 0.9800000190734863D;
/* 34:35 */     this.yVelocity *= 0.9800000190734863D;
/* 35:36 */     this.zVelocity *= 0.9800000190734863D;
/* 36:   */     
/* 37:38 */     int i = 60 - this.g;
/* 38:39 */     float f = i * 0.001F;
/* 39:40 */     a(f, f);
/* 40:41 */     k(19 + i % 4);
/* 41:43 */     if (this.g-- <= 0) {
/* 42:44 */       setDead();
/* 43:   */     }
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cig
 * JD-Core Version:    0.7.0.1
 */