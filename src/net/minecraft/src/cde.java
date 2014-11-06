package net.minecraft.src;
/*  1:   */ public class cde
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   cdy a;
/*  5:   */   cdy b;
/*  6:   */   cdy c;
/*  7:   */   cdy d;
/*  8:   */   
/*  9:   */   public cde(int paramInt)
/* 10:   */   {
/* 11:11 */     this.a = new cdy(this, 0, paramInt);
/* 12:12 */     this.a.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
/* 13:13 */     if (paramInt > 0)
/* 14:   */     {
/* 15:14 */       this.a = new cdy(this, 0, paramInt);
/* 16:15 */       this.a.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
/* 17:   */       
/* 18:17 */       this.b = new cdy(this, 32, 0);
/* 19:18 */       this.b.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
/* 20:   */       
/* 21:20 */       this.c = new cdy(this, 32, 4);
/* 22:21 */       this.c.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
/* 23:   */       
/* 24:23 */       this.d = new cdy(this, 32, 8);
/* 25:24 */       this.d.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
/* 26:   */     }
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 30:   */   {
/* 31:30 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 32:   */     
/* 33:32 */     this.a.a(paramFloat6);
/* 34:33 */     if (this.b != null)
/* 35:   */     {
/* 36:34 */       this.b.a(paramFloat6);
/* 37:35 */       this.c.a(paramFloat6);
/* 38:36 */       this.d.a(paramFloat6);
/* 39:   */     }
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cde
 * JD-Core Version:    0.7.0.1
 */