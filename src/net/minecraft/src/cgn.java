package net.minecraft.src;
/*  1:   */ public class cgn
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   private Entity a;
/*  5:   */   private Entity ax;
/*  6:   */   private int ay;
/*  7:   */   private int az;
/*  8:   */   private float aA;
/*  9:16 */   private cpt aB = bsu.z().ae();
/* 10:   */   
/* 11:   */   public cgn(World paramaqu, Entity paramwv1, Entity paramwv2, float paramFloat)
/* 12:   */   {
/* 13:19 */     super(paramaqu, paramwv1.xPos, paramwv1.yPos, paramwv1.zPos, paramwv1.xVelocity, paramwv1.yVelocity, paramwv1.zVelocity);
/* 14:20 */     this.a = paramwv1;
/* 15:21 */     this.ax = paramwv2;
/* 16:22 */     this.az = 3;
/* 17:23 */     this.aA = paramFloat;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 21:   */   {
/* 22:28 */     float f = (this.ay + paramFloat1) / this.az;
/* 23:29 */     f *= f;
/* 24:   */     
/* 25:31 */     double d1 = this.a.xPos;
/* 26:32 */     double d2 = this.a.yPos;
/* 27:33 */     double d3 = this.a.zPos;
/* 28:   */     
/* 29:35 */     double d4 = this.ax.P + (this.ax.xPos - this.ax.P) * paramFloat1;
/* 30:36 */     double d5 = this.ax.Q + (this.ax.yPos - this.ax.Q) * paramFloat1 + this.aA;
/* 31:37 */     double d6 = this.ax.R + (this.ax.zPos - this.ax.R) * paramFloat1;
/* 32:   */     
/* 33:39 */     double d7 = d1 + (d4 - d1) * f;
/* 34:40 */     double d8 = d2 + (d5 - d2) * f;
/* 35:41 */     double d9 = d3 + (d6 - d3) * f;
/* 36:   */     
/* 37:43 */     int i = b(paramFloat1);
/* 38:44 */     int j = i % 65536;
/* 39:45 */     int k = i / 65536;
/* 40:46 */     dax.glMultiTexCoord2f(dax.q, j / 1.0F, k / 1.0F);
/* 41:47 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 42:   */     
/* 43:49 */     d7 -= au;
/* 44:50 */     d8 -= av;
/* 45:51 */     d9 -= aw;
/* 46:   */     
/* 47:53 */     this.aB.a(this.a, (float)d7, (float)d8, (float)d9, this.a.yaw, paramFloat1);
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void onUpdate()
/* 51:   */   {
/* 52:58 */     this.ay += 1;
/* 53:59 */     if (this.ay == this.az) {
/* 54:60 */       setDead();
/* 55:   */     }
/* 56:   */   }
/* 57:   */   
/* 58:   */   public int a()
/* 59:   */   {
/* 60:66 */     return 3;
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgn
 * JD-Core Version:    0.7.0.1
 */