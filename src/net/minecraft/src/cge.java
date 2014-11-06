package net.minecraft.src;
/*  1:   */ public class cge
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:17 */   private static final oa a = new oa("textures/particle/footprint.png");
/*  5:   */   private int ax;
/*  6:   */   private int ay;
/*  7:   */   private cug az;
/*  8:   */   
/*  9:   */   protected cge(cug paramcug, World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 10:   */   {
/* 11:23 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 12:24 */     this.az = paramcug;
/* 13:25 */     this.xVelocity = (this.yVelocity = this.zVelocity = 0.0D);
/* 14:26 */     this.ay = 200;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 18:   */   {
/* 19:31 */     float f1 = (this.ax + paramFloat1) / this.ay;
/* 20:32 */     f1 *= f1;
/* 21:   */     
/* 22:34 */     float f2 = 2.0F - f1 * 2.0F;
/* 23:35 */     if (f2 > 1.0F) {
/* 24:36 */       f2 = 1.0F;
/* 25:   */     }
/* 26:38 */     f2 *= 0.2F;
/* 27:   */     
/* 28:40 */     cjm.disableLighting();
/* 29:41 */     float f3 = 0.125F;
/* 30:   */     
/* 31:43 */     float f4 = (float)(this.xPos - au);
/* 32:44 */     float f5 = (float)(this.yPos - av);
/* 33:45 */     float f6 = (float)(this.zPos - aw);
/* 34:   */     
/* 35:47 */     float f7 = this.world.o(new BlockPosition(this));
/* 36:   */     
/* 37:49 */     this.az.a(a);
/* 38:50 */     cjm.enableBlend();
/* 39:51 */     cjm.glBlendFunc(770, 771);
/* 40:   */     
/* 41:53 */     paramciv.begin();
/* 42:54 */     paramciv.setColor(f7, f7, f7, f2);
/* 43:55 */     paramciv.addVertexWithUV(f4 - f3, f5, f6 + f3, 0.0D, 1.0D);
/* 44:56 */     paramciv.addVertexWithUV(f4 + f3, f5, f6 + f3, 1.0D, 1.0D);
/* 45:57 */     paramciv.addVertexWithUV(f4 + f3, f5, f6 - f3, 1.0D, 0.0D);
/* 46:58 */     paramciv.addVertexWithUV(f4 - f3, f5, f6 - f3, 0.0D, 0.0D);
/* 47:59 */     ckx.getInstance().draw();
/* 48:   */     
/* 49:61 */     cjm.disableBlend();
/* 50:62 */     cjm.enableLighting();
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void onUpdate()
/* 54:   */   {
/* 55:67 */     this.ax += 1;
/* 56:68 */     if (this.ax == this.ay) {
/* 57:69 */       setDead();
/* 58:   */     }
/* 59:   */   }
/* 60:   */   
/* 61:   */   public int a()
/* 62:   */   {
/* 63:75 */     return 3;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cge
 * JD-Core Version:    0.7.0.1
 */