package net.minecraft.src;
/*  1:   */ public class byu
/*  2:   */   extends byl
/*  3:   */ {
/*  4:13 */   private static final oa u = new oa("textures/gui/container/brewing_stand.png");
/*  5:   */   private final ahb v;
/*  6:   */   private vq w;
/*  7:   */   
/*  8:   */   public byu(ahb paramahb, vq paramvq)
/*  9:   */   {
/* 10:18 */     super(new aii(paramahb, paramvq));
/* 11:19 */     this.v = paramahb;
/* 12:20 */     this.w = paramvq;
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected void b(int paramInt1, int paramInt2)
/* 16:   */   {
/* 17:25 */     String str = this.w.e_().c();
/* 18:26 */     this.q.a(str, this.f / 2 - this.q.a(str) / 2, 6, 4210752);
/* 19:27 */     this.q.a(this.v.e_().c(), 8, this.g - 96 + 2, 4210752);
/* 20:   */   }
/* 21:   */   
/* 22:   */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 23:   */   {
/* 24:32 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 25:33 */     this.j.N().a(u);
/* 26:34 */     int i = (this.l - this.f) / 2;
/* 27:35 */     int j = (this.m - this.g) / 2;
/* 28:36 */     b(i, j, 0, 0, this.f, this.g);
/* 29:   */     
/* 30:38 */     int k = this.w.a_(0);
/* 31:39 */     if (k > 0)
/* 32:   */     {
/* 33:40 */       int m = (int)(28.0F * (1.0F - k / 400.0F));
/* 34:41 */       if (m > 0) {
/* 35:42 */         b(i + 97, j + 16, 176, 0, 9, m);
/* 36:   */       }
/* 37:45 */       int n = k / 2 % 7;
/* 38:47 */       switch (n)
/* 39:   */       {
/* 40:   */       case 6: 
/* 41:49 */         m = 0;
/* 42:50 */         break;
/* 43:   */       case 5: 
/* 44:52 */         m = 6;
/* 45:53 */         break;
/* 46:   */       case 4: 
/* 47:55 */         m = 11;
/* 48:56 */         break;
/* 49:   */       case 3: 
/* 50:58 */         m = 16;
/* 51:59 */         break;
/* 52:   */       case 2: 
/* 53:61 */         m = 20;
/* 54:62 */         break;
/* 55:   */       case 1: 
/* 56:64 */         m = 24;
/* 57:65 */         break;
/* 58:   */       case 0: 
/* 59:67 */         m = 29;
/* 60:   */       }
/* 61:71 */       if (m > 0) {
/* 62:72 */         b(i + 65, j + 14 + 29 - m, 185, 29 - m, 12, m);
/* 63:   */       }
/* 64:   */     }
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byu
 * JD-Core Version:    0.7.0.1
 */