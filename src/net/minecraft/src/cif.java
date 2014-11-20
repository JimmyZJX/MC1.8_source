package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cif
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   private Entity a;
/*  7:   */   private int ax;
/*  8:   */   private int ay;
/*  9:   */   private EnumParticleEffect az;
/* 10:   */   
/* 11:   */   public cif(World paramaqu, Entity paramwv, EnumParticleEffect paramew)
/* 12:   */   {
/* 13:15 */     super(paramaqu, paramwv.xPos, paramwv.getAABB().minY + paramwv.K / 2.0F, paramwv.zPos, paramwv.xVelocity, paramwv.yVelocity, paramwv.zVelocity);
/* 14:16 */     this.a = paramwv;
/* 15:17 */     this.ay = 3;
/* 16:18 */     this.az = paramew;
/* 17:19 */     onUpdate();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/* 21:   */   
/* 22:   */   public void onUpdate()
/* 23:   */   {
/* 24:28 */     for (int i = 0; i < 16; i++)
/* 25:   */     {
/* 26:29 */       double d1 = this.rng.nextFloat() * 2.0F - 1.0F;
/* 27:30 */       double d2 = this.rng.nextFloat() * 2.0F - 1.0F;
/* 28:31 */       double d3 = this.rng.nextFloat() * 2.0F - 1.0F;
/* 29:32 */       if (d1 * d1 + d2 * d2 + d3 * d3 <= 1.0D)
/* 30:   */       {
/* 31:35 */         double d4 = this.a.xPos + d1 * this.a.J / 4.0D;
/* 32:36 */         double d5 = this.a.getAABB().minY + this.a.K / 2.0F + d2 * this.a.K / 4.0D;
/* 33:37 */         double d6 = this.a.zPos + d3 * this.a.J / 4.0D;
/* 34:38 */         this.world.a(this.az, false, d4, d5, d6, d1, d2 + 0.2D, d3, new int[0]);
/* 35:   */       }
/* 36:   */     }
/* 37:40 */     this.ax += 1;
/* 38:41 */     if (this.ax >= this.ay) {
/* 39:42 */       setDead();
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int a()
/* 44:   */   {
/* 45:48 */     return 3;
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cif
 * JD-Core Version:    0.7.0.1
 */