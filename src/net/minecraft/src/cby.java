package net.minecraft.src;
/*  1:   */ public class cby
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   private cdy[] a;
/*  5:   */   private cdy b;
/*  6:   */   
/*  7:   */   public cby()
/*  8:   */   {
/*  9:12 */     this.a = new cdy[12];
/* 10:14 */     for (int i = 0; i < this.a.length; i++)
/* 11:   */     {
/* 12:15 */       this.a[i] = new cdy(this, 0, 16);
/* 13:16 */       this.a[i].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
/* 14:   */     }
/* 15:19 */     this.b = new cdy(this, 0, 0);
/* 16:20 */     this.b.a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 20:   */   {
/* 21:29 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 22:   */     
/* 23:31 */     this.b.a(paramFloat6);
/* 24:32 */     for (int i = 0; i < this.a.length; i++) {
/* 25:33 */       this.a[i].a(paramFloat6);
/* 26:   */     }
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 30:   */   {
/* 31:39 */     float f = paramFloat3 * 3.141593F * -0.1F;
/* 32:40 */     for (int i = 0; i < 4; i++)
/* 33:   */     {
/* 34:41 */       this.a[i].d = (-2.0F + MathUtils.cos((i * 2 + paramFloat3) * 0.25F));
/* 35:42 */       this.a[i].c = (MathUtils.cos(f) * 9.0F);
/* 36:43 */       this.a[i].e = (MathUtils.sin(f) * 9.0F);
/* 37:44 */       f += 1.570796F;
/* 38:   */     }
/* 39:47 */     f = 0.7853982F + paramFloat3 * 3.141593F * 0.03F;
/* 40:48 */     for (int i = 4; i < 8; i++)
/* 41:   */     {
/* 42:49 */       this.a[i].d = (2.0F + MathUtils.cos((i * 2 + paramFloat3) * 0.25F));
/* 43:50 */       this.a[i].c = (MathUtils.cos(f) * 7.0F);
/* 44:51 */       this.a[i].e = (MathUtils.sin(f) * 7.0F);
/* 45:52 */       f += 1.570796F;
/* 46:   */     }
/* 47:55 */     f = 0.4712389F + paramFloat3 * 3.141593F * -0.05F;
/* 48:56 */     for (int i = 8; i < 12; i++)
/* 49:   */     {
/* 50:57 */       this.a[i].d = (11.0F + MathUtils.cos((i * 1.5F + paramFloat3) * 0.5F));
/* 51:58 */       this.a[i].c = (MathUtils.cos(f) * 5.0F);
/* 52:59 */       this.a[i].e = (MathUtils.sin(f) * 5.0F);
/* 53:60 */       f += 1.570796F;
/* 54:   */     }
/* 55:63 */     this.b.g = (paramFloat4 / 57.295776F);
/* 56:64 */     this.b.f = (paramFloat5 / 57.295776F);
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cby
 * JD-Core Version:    0.7.0.1
 */