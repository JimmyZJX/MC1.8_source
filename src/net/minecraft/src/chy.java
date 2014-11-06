package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class chy
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   protected chy(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8: 7 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  9:   */     
/* 10: 9 */     float f = this.random.nextFloat() * 0.1F + 0.2F;
/* 11:10 */     this.ap = f;
/* 12:11 */     this.aq = f;
/* 13:12 */     this.ar = f;
/* 14:13 */     k(0);
/* 15:14 */     a(0.02F, 0.02F);
/* 16:   */     
/* 17:16 */     this.h *= (this.random.nextFloat() * 0.6F + 0.5F);
/* 18:   */     
/* 19:18 */     this.xVelocity *= 0.01999999955296516D;
/* 20:19 */     this.yVelocity *= 0.01999999955296516D;
/* 21:20 */     this.zVelocity *= 0.01999999955296516D;
/* 22:   */     
/* 23:22 */     this.g = ((int)(20.0D / (Math.random() * 0.8D + 0.2D)));
/* 24:23 */     this.T = true;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void onUpdate()
/* 28:   */   {
/* 29:28 */     this.lastX = this.xPos;
/* 30:29 */     this.lastY = this.yPos;
/* 31:30 */     this.lastZ = this.zPos;
/* 32:   */     
/* 33:32 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 34:33 */     this.xVelocity *= 0.99D;
/* 35:34 */     this.yVelocity *= 0.99D;
/* 36:35 */     this.zVelocity *= 0.99D;
/* 37:37 */     if (this.g-- <= 0) {
/* 38:38 */       setDead();
/* 39:   */     }
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     chy
 * JD-Core Version:    0.7.0.1
 */