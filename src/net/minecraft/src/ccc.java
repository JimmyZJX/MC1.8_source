package net.minecraft.src;
/*  1:   */ public class ccc
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   public cdy b;
/*  6:   */   public cdy c;
/*  7:   */   public cdy d;
/*  8:   */   public cdy e;
/*  9:   */   public cdy f;
/* 10:   */   public cdy g;
/* 11:   */   public cdy h;
/* 12:   */   
/* 13:   */   public ccc()
/* 14:   */   {
/* 15:12 */     int i = 16;
/* 16:13 */     this.a = new cdy(this, 0, 0);
/* 17:14 */     this.a.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
/* 18:15 */     this.a.a(0.0F, -1 + i, -4.0F);
/* 19:   */     
/* 20:17 */     this.g = new cdy(this, 14, 0);
/* 21:18 */     this.g.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
/* 22:19 */     this.g.a(0.0F, -1 + i, -4.0F);
/* 23:   */     
/* 24:21 */     this.h = new cdy(this, 14, 4);
/* 25:22 */     this.h.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
/* 26:23 */     this.h.a(0.0F, -1 + i, -4.0F);
/* 27:   */     
/* 28:25 */     this.b = new cdy(this, 0, 9);
/* 29:26 */     this.b.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
/* 30:27 */     this.b.a(0.0F, i, 0.0F);
/* 31:   */     
/* 32:29 */     this.c = new cdy(this, 26, 0);
/* 33:30 */     this.c.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
/* 34:31 */     this.c.a(-2.0F, 3 + i, 1.0F);
/* 35:   */     
/* 36:33 */     this.d = new cdy(this, 26, 0);
/* 37:34 */     this.d.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
/* 38:35 */     this.d.a(1.0F, 3 + i, 1.0F);
/* 39:   */     
/* 40:37 */     this.e = new cdy(this, 24, 13);
/* 41:38 */     this.e.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
/* 42:39 */     this.e.a(-4.0F, -3 + i, 0.0F);
/* 43:   */     
/* 44:41 */     this.f = new cdy(this, 24, 13);
/* 45:42 */     this.f.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
/* 46:43 */     this.f.a(4.0F, -3 + i, 0.0F);
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 50:   */   {
/* 51:48 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 52:50 */     if (this.r)
/* 53:   */     {
/* 54:51 */       float f1 = 2.0F;
/* 55:52 */       cjm.glPushMatrix();
/* 56:53 */       cjm.glTranslatef(0.0F, 5.0F * paramFloat6, 2.0F * paramFloat6);
/* 57:54 */       this.a.a(paramFloat6);
/* 58:55 */       this.g.a(paramFloat6);
/* 59:56 */       this.h.a(paramFloat6);
/* 60:57 */       cjm.glPopMatrix();
/* 61:58 */       cjm.glPushMatrix();
/* 62:59 */       cjm.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/* 63:60 */       cjm.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/* 64:61 */       this.b.a(paramFloat6);
/* 65:62 */       this.c.a(paramFloat6);
/* 66:63 */       this.d.a(paramFloat6);
/* 67:64 */       this.e.a(paramFloat6);
/* 68:65 */       this.f.a(paramFloat6);
/* 69:66 */       cjm.glPopMatrix();
/* 70:   */     }
/* 71:   */     else
/* 72:   */     {
/* 73:68 */       this.a.a(paramFloat6);
/* 74:69 */       this.g.a(paramFloat6);
/* 75:70 */       this.h.a(paramFloat6);
/* 76:71 */       this.b.a(paramFloat6);
/* 77:72 */       this.c.a(paramFloat6);
/* 78:73 */       this.d.a(paramFloat6);
/* 79:74 */       this.e.a(paramFloat6);
/* 80:75 */       this.f.a(paramFloat6);
/* 81:   */     }
/* 82:   */   }
/* 83:   */   
/* 84:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 85:   */   {
/* 86:81 */     this.a.f = (paramFloat5 / 57.295776F);
/* 87:82 */     this.a.g = (paramFloat4 / 57.295776F);
/* 88:   */     
/* 89:84 */     this.g.f = this.a.f;
/* 90:85 */     this.g.g = this.a.g;
/* 91:   */     
/* 92:87 */     this.h.f = this.a.f;
/* 93:88 */     this.h.g = this.a.g;
/* 94:   */     
/* 95:90 */     this.b.f = 1.570796F;
/* 96:   */     
/* 97:92 */     this.c.f = (MathUtils.cos(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 98:93 */     this.d.f = (MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F) * 1.4F * paramFloat2);
/* 99:94 */     this.e.h = paramFloat3;
/* :0:95 */     this.f.h = (-paramFloat3);
/* :1:   */   }
/* :2:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccc
 * JD-Core Version:    0.7.0.1
 */