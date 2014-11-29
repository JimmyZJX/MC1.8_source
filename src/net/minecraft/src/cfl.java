package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cfl
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   protected cfl(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8: 9 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  9:   */     
/* 10:11 */     this.ap = 1.0F;
/* 11:12 */     this.aq = 1.0F;
/* 12:13 */     this.ar = 1.0F;
/* 13:14 */     k(32);
/* 14:15 */     a(0.02F, 0.02F);
/* 15:   */     
/* 16:17 */     this.h *= (this.rng.nextFloat() * 0.6F + 0.2F);
/* 17:   */     
/* 18:19 */     this.xVelocity = (paramDouble4 * 0.2000000029802322D + (Math.random() * 2.0D - 1.0D) * 0.01999999955296516D);
/* 19:20 */     this.yVelocity = (paramDouble5 * 0.2000000029802322D + (Math.random() * 2.0D - 1.0D) * 0.01999999955296516D);
/* 20:21 */     this.zVelocity = (paramDouble6 * 0.2000000029802322D + (Math.random() * 2.0D - 1.0D) * 0.01999999955296516D);
/* 21:   */     
/* 22:23 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void onUpdate()
/* 26:   */   {
/* 27:28 */     this.lastX = this.xPos;
/* 28:29 */     this.lastY = this.yPos;
/* 29:30 */     this.lastZ = this.zPos;
/* 30:   */     
/* 31:32 */     this.yVelocity += 0.002D;
/* 32:33 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/* 33:34 */     this.xVelocity *= 0.8500000238418579D;
/* 34:35 */     this.yVelocity *= 0.8500000238418579D;
/* 35:36 */     this.zVelocity *= 0.8500000238418579D;
/* 36:38 */     if (this.world.getBlock(new BlockPosition(this)).getType().getMaterial() != Material.water) {
/* 37:39 */       setDead();
/* 38:   */     }
/* 39:42 */     if (this.g-- <= 0) {
/* 40:43 */       setDead();
/* 41:   */     }
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfl
 * JD-Core Version:    0.7.0.1
 */