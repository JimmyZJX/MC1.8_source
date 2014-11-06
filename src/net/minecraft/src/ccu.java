package net.minecraft.src;
/*  1:   */ public class ccu
/*  2:   */ {
/*  3:   */   public cdi[] a;
/*  4:   */   public int b;
/*  5:   */   private boolean c;
/*  6:   */   
/*  7:   */   public ccu(cdi[] paramArrayOfcdi)
/*  8:   */   {
/*  9:13 */     this.a = paramArrayOfcdi;
/* 10:14 */     this.b = paramArrayOfcdi.length;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public ccu(cdi[] paramArrayOfcdi, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:18 */     this(paramArrayOfcdi);
/* 16:   */     
/* 17:20 */     float f1 = 0.0F / paramFloat1;
/* 18:21 */     float f2 = 0.0F / paramFloat2;
/* 19:22 */     paramArrayOfcdi[0] = paramArrayOfcdi[0].a(paramInt3 / paramFloat1 - f1, paramInt2 / paramFloat2 + f2);
/* 20:23 */     paramArrayOfcdi[1] = paramArrayOfcdi[1].a(paramInt1 / paramFloat1 + f1, paramInt2 / paramFloat2 + f2);
/* 21:24 */     paramArrayOfcdi[2] = paramArrayOfcdi[2].a(paramInt1 / paramFloat1 + f1, paramInt4 / paramFloat2 - f2);
/* 22:25 */     paramArrayOfcdi[3] = paramArrayOfcdi[3].a(paramInt3 / paramFloat1 - f1, paramInt4 / paramFloat2 - f2);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void a()
/* 26:   */   {
/* 27:38 */     cdi[] arrayOfcdi = new cdi[this.a.length];
/* 28:39 */     for (int i = 0; i < this.a.length; i++) {
/* 29:40 */       arrayOfcdi[i] = this.a[(this.a.length - i - 1)];
/* 30:   */     }
/* 31:42 */     this.a = arrayOfcdi;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a(VertexBuffer paramciv, float paramFloat)
/* 35:   */   {
/* 36:46 */     Vec3 localbrw1 = this.a[1].a.subtract(this.a[0].a);
/* 37:47 */     Vec3 localbrw2 = this.a[1].a.subtract(this.a[2].a);
/* 38:48 */     Vec3 localbrw3 = localbrw2.cross(localbrw1).normalize();
/* 39:   */     
/* 40:50 */     paramciv.begin();
/* 41:51 */     if (this.c) {
/* 42:52 */       paramciv.d(-(float)localbrw3.x, -(float)localbrw3.y, -(float)localbrw3.z);
/* 43:   */     } else {
/* 44:54 */       paramciv.d((float)localbrw3.x, (float)localbrw3.y, (float)localbrw3.z);
/* 45:   */     }
/* 46:57 */     for (int i = 0; i < 4; i++)
/* 47:   */     {
/* 48:58 */       cdi localcdi = this.a[i];
/* 49:59 */       paramciv.addVertexWithUV(localcdi.a.x * paramFloat, localcdi.a.y * paramFloat, localcdi.a.z * paramFloat, localcdi.b, localcdi.c);
/* 50:   */     }
/* 51:61 */     ckx.getInstance().draw();
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccu
 * JD-Core Version:    0.7.0.1
 */