package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cgl
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   private int a;
/*  7:   */   private int ax;
/*  8:   */   
/*  9:   */   protected cgl(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 10:   */   {
/* 11:13 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 12:14 */     this.ax = 8;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/* 16:   */   
/* 17:   */   public void onUpdate()
/* 18:   */   {
/* 19:24 */     for (int i = 0; i < 6; i++)
/* 20:   */     {
/* 21:25 */       double d1 = this.xPos + (this.random.nextDouble() - this.random.nextDouble()) * 4.0D;
/* 22:26 */       double d2 = this.yPos + (this.random.nextDouble() - this.random.nextDouble()) * 4.0D;
/* 23:27 */       double d3 = this.zPos + (this.random.nextDouble() - this.random.nextDouble()) * 4.0D;
/* 24:28 */       this.world.a(ew.b, d1, d2, d3, this.a / this.ax, 0.0D, 0.0D, new int[0]);
/* 25:   */     }
/* 26:30 */     this.a += 1;
/* 27:31 */     if (this.a == this.ax) {
/* 28:32 */       setDead();
/* 29:   */     }
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int a()
/* 33:   */   {
/* 34:38 */     return 1;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgl
 * JD-Core Version:    0.7.0.1
 */