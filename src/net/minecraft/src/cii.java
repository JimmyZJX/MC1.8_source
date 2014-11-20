package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cii
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   protected cii(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  7:   */   {
/*  8:13 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  9:14 */     this.xVelocity *= 0.300000011920929D;
/* 10:15 */     this.yVelocity = (Math.random() * 0.2000000029802322D + 0.1000000014901161D);
/* 11:16 */     this.zVelocity *= 0.300000011920929D;
/* 12:   */     
/* 13:18 */     this.ap = 1.0F;
/* 14:19 */     this.aq = 1.0F;
/* 15:20 */     this.ar = 1.0F;
/* 16:21 */     k(19 + this.rng.nextInt(4));
/* 17:22 */     a(0.01F, 0.01F);
/* 18:23 */     this.i = 0.06F;
/* 19:   */     
/* 20:25 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void onUpdate()
/* 24:   */   {
/* 25:30 */     this.lastX = this.xPos;
/* 26:31 */     this.lastY = this.yPos;
/* 27:32 */     this.lastZ = this.zPos;
/* 28:   */     
/* 29:34 */     this.yVelocity -= this.i;
/* 30:35 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 31:36 */     this.xVelocity *= 0.9800000190734863D;
/* 32:37 */     this.yVelocity *= 0.9800000190734863D;
/* 33:38 */     this.zVelocity *= 0.9800000190734863D;
/* 34:40 */     if (this.g-- <= 0) {
/* 35:41 */       setDead();
/* 36:   */     }
/* 37:44 */     if (this.C)
/* 38:   */     {
/* 39:45 */       if (Math.random() < 0.5D) {
/* 40:46 */         setDead();
/* 41:   */       }
/* 42:48 */       this.xVelocity *= 0.699999988079071D;
/* 43:49 */       this.zVelocity *= 0.699999988079071D;
/* 44:   */     }
/* 45:52 */     BlockPosition localdt = new BlockPosition(this);
/* 46:53 */     Block localbec = this.world.getBlock(localdt);
/* 47:54 */     ProtoBlock localatr = localbec.getProto();
/* 48:55 */     localatr.a(this.world, localdt);
/* 49:56 */     Material localbof = localbec.getProto().getMaterial();
/* 50:57 */     if ((localbof.isLiquid()) || (localbof.a()))
/* 51:   */     {
/* 52:58 */       double d1 = 0.0D;
/* 53:59 */       if ((localbec.getProto() instanceof BlockLiquid)) {
/* 54:60 */         d1 = 1.0F - BlockLiquid.b(((Integer)localbec.getProperty(BlockLiquid.level)).intValue());
/* 55:   */       } else {
/* 56:62 */         d1 = localatr.C();
/* 57:   */       }
/* 58:64 */       double d2 = MathUtils.floor(this.yPos) + d1;
/* 59:65 */       if (this.yPos < d2) {
/* 60:66 */         setDead();
/* 61:   */       }
/* 62:   */     }
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cii
 * JD-Core Version:    0.7.0.1
 */