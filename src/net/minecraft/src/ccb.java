package net.minecraft.src;
/*  1:   */ public class ccb
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   public cdy b;
/*  6:   */   public cdy c;
/*  7:   */   
/*  8:   */   public ccb()
/*  9:   */   {
/* 10:11 */     this.a = new cdy(this, 0, 0).b(64, 64);
/* 11:12 */     this.a.a(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
/* 12:13 */     this.a.c = 1.0F;
/* 13:14 */     this.a.d = 7.0F;
/* 14:15 */     this.a.e = 15.0F;
/* 15:   */     
/* 16:17 */     this.c = new cdy(this, 0, 0).b(64, 64);
/* 17:18 */     this.c.a(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
/* 18:19 */     this.c.c = 8.0F;
/* 19:20 */     this.c.d = 7.0F;
/* 20:21 */     this.c.e = 15.0F;
/* 21:   */     
/* 22:23 */     this.b = new cdy(this, 0, 19).b(64, 64);
/* 23:24 */     this.b.a(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
/* 24:25 */     this.b.c = 1.0F;
/* 25:26 */     this.b.d = 6.0F;
/* 26:27 */     this.b.e = 1.0F;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a()
/* 30:   */   {
/* 31:31 */     this.c.f = this.a.f;
/* 32:   */     
/* 33:33 */     this.a.a(0.0625F);
/* 34:34 */     this.c.a(0.0625F);
/* 35:35 */     this.b.a(0.0625F);
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccb
 * JD-Core Version:    0.7.0.1
 */