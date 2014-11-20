package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cgj
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:14 */   private static final oa a = new oa("textures/entity/explosion.png");
/*  7:   */   private int ax;
/*  8:   */   private int ay;
/*  9:   */   private cug az;
/* 10:   */   private float aA;
/* 11:   */   
/* 12:   */   protected cgj(cug paramcug, World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 13:   */   {
/* 14:21 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 15:22 */     this.az = paramcug;
/* 16:23 */     this.ay = (6 + this.rng.nextInt(4));
/* 17:24 */     this.ap = (this.aq = this.ar = this.rng.nextFloat() * 0.6F + 0.4F);
/* 18:25 */     this.aA = (1.0F - (float)paramDouble4 * 0.5F);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 22:   */   {
/* 23:30 */     int i = (int)((this.ax + paramFloat1) * 15.0F / this.ay);
/* 24:31 */     if (i > 15) {
/* 25:32 */       return;
/* 26:   */     }
/* 27:34 */     this.az.a(a);
/* 28:   */     
/* 29:36 */     float f1 = i % 4 / 4.0F;
/* 30:37 */     float f2 = f1 + 0.24975F;
/* 31:38 */     float f3 = i / 4 / 4.0F;
/* 32:39 */     float f4 = f3 + 0.24975F;
/* 33:   */     
/* 34:41 */     float f5 = 2.0F * this.aA;
/* 35:   */     
/* 36:43 */     float f6 = (float)(this.lastX + (this.xPos - this.lastX) * paramFloat1 - au);
/* 37:44 */     float f7 = (float)(this.lastY + (this.yPos - this.lastY) * paramFloat1 - av);
/* 38:45 */     float f8 = (float)(this.lastZ + (this.zPos - this.lastZ) * paramFloat1 - aw);
/* 39:46 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 40:47 */     cjm.disableLighting();
/* 41:48 */     bss.a();
/* 42:49 */     paramciv.begin();
/* 43:50 */     paramciv.setColor(this.ap, this.aq, this.ar, 1.0F);
/* 44:51 */     paramciv.d(0.0F, 1.0F, 0.0F);
/* 45:52 */     paramciv.b(240);
/* 46:53 */     paramciv.addVertexWithUV(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/* 47:54 */     paramciv.addVertexWithUV(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/* 48:55 */     paramciv.addVertexWithUV(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/* 49:56 */     paramciv.addVertexWithUV(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/* 50:57 */     ckx.getInstance().draw();
/* 51:58 */     cjm.a(0.0F, 0.0F);
/* 52:59 */     cjm.enableLighting();
/* 53:   */   }
/* 54:   */   
/* 55:   */   public int b(float paramFloat)
/* 56:   */   {
/* 57:64 */     return 61680;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void onUpdate()
/* 61:   */   {
/* 62:69 */     this.lastX = this.xPos;
/* 63:70 */     this.lastY = this.yPos;
/* 64:71 */     this.lastZ = this.zPos;
/* 65:72 */     this.ax += 1;
/* 66:73 */     if (this.ax == this.ay) {
/* 67:74 */       setDead();
/* 68:   */     }
/* 69:   */   }
/* 70:   */   
/* 71:   */   public int a()
/* 72:   */   {
/* 73:80 */     return 3;
/* 74:   */   }
/* 75:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgj
 * JD-Core Version:    0.7.0.1
 */