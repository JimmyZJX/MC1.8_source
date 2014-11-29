package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class chw
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   protected chw(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8: 9 */     super(paramaqu, paramDouble1, paramDouble2 - 0.125D, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  9:   */     
/* 10:11 */     this.ap = 0.4F;
/* 11:12 */     this.aq = 0.4F;
/* 12:13 */     this.ar = 0.7F;
/* 13:14 */     k(0);
/* 14:15 */     a(0.01F, 0.01F);
/* 15:   */     
/* 16:17 */     this.h *= (this.rng.nextFloat() * 0.6F + 0.2F);
/* 17:   */     
/* 18:19 */     this.xVelocity = (paramDouble4 * 0.0D);
/* 19:20 */     this.yVelocity = (paramDouble5 * 0.0D);
/* 20:21 */     this.zVelocity = (paramDouble6 * 0.0D);
/* 21:   */     
/* 22:23 */     this.g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void onUpdate()
/* 26:   */   {
/* 27:28 */     this.lastX = this.xPos;
/* 28:29 */     this.lastY = this.yPos;
/* 29:30 */     this.lastZ = this.zPos;
/* 30:   */     
/* 31:32 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/* 32:34 */     if (this.world.getBlock(new BlockPosition(this)).getType().getMaterial() != Material.water) {
/* 33:35 */       setDead();
/* 34:   */     }
/* 35:38 */     if (this.g-- <= 0) {
/* 36:39 */       setDead();
/* 37:   */     }
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     chw
 * JD-Core Version:    0.7.0.1
 */