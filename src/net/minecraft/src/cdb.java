package net.minecraft.src;
/*  1:   */ public class cdb
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   
/*  6:   */   public cdb()
/*  7:   */   {
/*  8:11 */     this(0, 35, 64, 64);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public cdb(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 12:   */   {
/* 13:15 */     this.t = paramInt3;
/* 14:16 */     this.u = paramInt4;
/* 15:17 */     this.a = new cdy(this, paramInt1, paramInt2);
/* 16:18 */     this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
/* 17:19 */     this.a.a(0.0F, 0.0F, 0.0F);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 21:   */   {
/* 22:24 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 23:   */     
/* 24:26 */     this.a.a(paramFloat6);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 28:   */   {
/* 29:31 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 30:   */     
/* 31:33 */     this.a.g = (paramFloat4 / 57.295776F);
/* 32:34 */     this.a.f = (paramFloat5 / 57.295776F);
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdb
 * JD-Core Version:    0.7.0.1
 */