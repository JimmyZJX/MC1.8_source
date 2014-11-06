package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cch
/*  4:   */   extends ccq
/*  5:   */ {
/*  6:   */   cdy a;
/*  7:12 */   cdy[] b = new cdy[9];
/*  8:   */   
/*  9:   */   public cch()
/* 10:   */   {
/* 11:15 */     int i = -16;
/* 12:16 */     this.a = new cdy(this, 0, 0);
/* 13:17 */     this.a.a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
/* 14:18 */     this.a.d += 24 + i;
/* 15:   */     
/* 16:20 */     Random localRandom = new Random(1660L);
/* 17:21 */     for (int j = 0; j < this.b.length; j++)
/* 18:   */     {
/* 19:22 */       this.b[j] = new cdy(this, 0, 0);
/* 20:   */       
/* 21:24 */       float f1 = ((j % 3 - j / 3 % 2 * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
/* 22:25 */       float f2 = (j / 3 / 2.0F * 2.0F - 1.0F) * 5.0F;
/* 23:26 */       int k = localRandom.nextInt(7) + 8;
/* 24:27 */       this.b[j].a(-1.0F, 0.0F, -1.0F, 2, k, 2);
/* 25:   */       
/* 26:29 */       this.b[j].c = f1;
/* 27:30 */       this.b[j].e = f2;
/* 28:31 */       this.b[j].d = (31 + i);
/* 29:   */     }
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 33:   */   {
/* 34:37 */     for (int i = 0; i < this.b.length; i++) {
/* 35:38 */       this.b[i].f = (0.2F * MathUtils.sin(paramFloat3 * 0.3F + i) + 0.4F);
/* 36:   */     }
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 40:   */   {
/* 41:44 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 42:   */     
/* 43:46 */     cjm.glPushMatrix();
/* 44:47 */     cjm.glTranslatef(0.0F, 0.6F, 0.0F);
/* 45:   */     
/* 46:49 */     this.a.a(paramFloat6);
/* 47:50 */     for (cdy localcdy : this.b) {
/* 48:51 */       localcdy.a(paramFloat6);
/* 49:   */     }
/* 50:54 */     cjm.glPopMatrix();
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cch
 * JD-Core Version:    0.7.0.1
 */