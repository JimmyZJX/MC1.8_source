package net.minecraft.src;
/*  1:   */ public class cbw
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   public cdy b;
/*  6:   */   public cdy c;
/*  7:   */   
/*  8:   */   public cbw()
/*  9:   */   {
/* 10:11 */     this.t = 64;
/* 11:12 */     this.u = 64;
/* 12:   */     
/* 13:14 */     this.a = new cdy(this, 0, 0);
/* 14:15 */     this.a.a(-10.0F, 0.0F, -2.0F, 20, 40, 1, 0.0F);
/* 15:   */     
/* 16:17 */     this.b = new cdy(this, 44, 0);
/* 17:18 */     this.b.a(-1.0F, -30.0F, -1.0F, 2, 42, 2, 0.0F);
/* 18:   */     
/* 19:20 */     this.c = new cdy(this, 0, 42);
/* 20:21 */     this.c.a(-10.0F, -32.0F, -1.0F, 20, 2, 2, 0.0F);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a()
/* 24:   */   {
/* 25:25 */     this.a.d = -32.0F;
/* 26:26 */     this.a.a(0.0625F);
/* 27:27 */     this.b.a(0.0625F);
/* 28:28 */     this.c.a(0.0625F);
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cbw
 * JD-Core Version:    0.7.0.1
 */