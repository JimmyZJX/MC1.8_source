package net.minecraft.src;
/*  1:   */ public class cck
/*  2:   */   extends cdb
/*  3:   */ {
/*  4:   */   private final cdy b;
/*  5:   */   
/*  6:   */   public cck()
/*  7:   */   {
/*  8:10 */     super(0, 0, 64, 64);
/*  9:   */     
/* 10:12 */     this.b = new cdy(this, 32, 0);
/* 11:13 */     this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F);
/* 12:14 */     this.b.a(0.0F, 0.0F, 0.0F);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 16:   */   {
/* 17:19 */     super.a(paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 18:   */     
/* 19:21 */     this.b.a(paramFloat6);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 23:   */   {
/* 24:26 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 25:   */     
/* 26:28 */     this.b.g = this.a.g;
/* 27:29 */     this.b.f = this.a.f;
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cck
 * JD-Core Version:    0.7.0.1
 */