package net.minecraft.src;
/*  1:   */ public class cdt
/*  2:   */ {
/*  3:   */   private cdi[] h;
/*  4:   */   private ccu[] i;
/*  5:   */   public final float a;
/*  6:   */   public final float b;
/*  7:   */   public final float c;
/*  8:   */   public final float d;
/*  9:   */   public final float e;
/* 10:   */   public final float f;
/* 11:   */   public String g;
/* 12:   */   
/* 13:   */   public cdt(cdy paramcdy, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, int paramInt5, float paramFloat4)
/* 14:   */   {
/* 15:14 */     this(paramcdy, paramInt1, paramInt2, paramFloat1, paramFloat2, paramFloat3, paramInt3, paramInt4, paramInt5, paramFloat4, paramcdy.i);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public cdt(cdy paramcdy, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, int paramInt5, float paramFloat4, boolean paramBoolean)
/* 19:   */   {
/* 20:18 */     this.a = paramFloat1;
/* 21:19 */     this.b = paramFloat2;
/* 22:20 */     this.c = paramFloat3;
/* 23:21 */     this.d = (paramFloat1 + paramInt3);
/* 24:22 */     this.e = (paramFloat2 + paramInt4);
/* 25:23 */     this.f = (paramFloat3 + paramInt5);
/* 26:24 */     this.h = new cdi[8];
/* 27:25 */     this.i = new ccu[6];
/* 28:   */     
/* 29:27 */     float f1 = paramFloat1 + paramInt3;
/* 30:28 */     float f2 = paramFloat2 + paramInt4;
/* 31:29 */     float f3 = paramFloat3 + paramInt5;
/* 32:   */     
/* 33:31 */     paramFloat1 -= paramFloat4;
/* 34:32 */     paramFloat2 -= paramFloat4;
/* 35:33 */     paramFloat3 -= paramFloat4;
/* 36:34 */     f1 += paramFloat4;
/* 37:35 */     f2 += paramFloat4;
/* 38:36 */     f3 += paramFloat4;
/* 39:38 */     if (paramBoolean)
/* 40:   */     {
/* 41:39 */       float f4 = f1;
/* 42:40 */       f1 = paramFloat1;
/* 43:41 */       paramFloat1 = f4;
/* 44:   */     }
/* 45:44 */     cdi localcdi1 = new cdi(paramFloat1, paramFloat2, paramFloat3, 0.0F, 0.0F);
/* 46:45 */     cdi localcdi2 = new cdi(f1, paramFloat2, paramFloat3, 0.0F, 8.0F);
/* 47:46 */     cdi localcdi3 = new cdi(f1, f2, paramFloat3, 8.0F, 8.0F);
/* 48:47 */     cdi localcdi4 = new cdi(paramFloat1, f2, paramFloat3, 8.0F, 0.0F);
/* 49:   */     
/* 50:49 */     cdi localcdi5 = new cdi(paramFloat1, paramFloat2, f3, 0.0F, 0.0F);
/* 51:50 */     cdi localcdi6 = new cdi(f1, paramFloat2, f3, 0.0F, 8.0F);
/* 52:51 */     cdi localcdi7 = new cdi(f1, f2, f3, 8.0F, 8.0F);
/* 53:52 */     cdi localcdi8 = new cdi(paramFloat1, f2, f3, 8.0F, 0.0F);
/* 54:   */     
/* 55:54 */     this.h[0] = localcdi1;
/* 56:55 */     this.h[1] = localcdi2;
/* 57:56 */     this.h[2] = localcdi3;
/* 58:57 */     this.h[3] = localcdi4;
/* 59:58 */     this.h[4] = localcdi5;
/* 60:59 */     this.h[5] = localcdi6;
/* 61:60 */     this.h[6] = localcdi7;
/* 62:61 */     this.h[7] = localcdi8;
/* 63:   */     
/* 64:63 */     this.i[0] = new ccu(new cdi[] { localcdi6, localcdi2, localcdi3, localcdi7 }, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt5, paramInt2 + paramInt5 + paramInt4, paramcdy.a, paramcdy.b);
/* 65:64 */     this.i[1] = new ccu(new cdi[] { localcdi1, localcdi5, localcdi8, localcdi4 }, paramInt1, paramInt2 + paramInt5, paramInt1 + paramInt5, paramInt2 + paramInt5 + paramInt4, paramcdy.a, paramcdy.b);
/* 66:   */     
/* 67:66 */     this.i[2] = new ccu(new cdi[] { localcdi6, localcdi5, localcdi1, localcdi2 }, paramInt1 + paramInt5, paramInt2, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, paramcdy.a, paramcdy.b);
/* 68:67 */     this.i[3] = new ccu(new cdi[] { localcdi3, localcdi4, localcdi8, localcdi7 }, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt3, paramInt2, paramcdy.a, paramcdy.b);
/* 69:   */     
/* 70:69 */     this.i[4] = new ccu(new cdi[] { localcdi2, localcdi1, localcdi4, localcdi3 }, paramInt1 + paramInt5, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5 + paramInt4, paramcdy.a, paramcdy.b);
/* 71:70 */     this.i[5] = new ccu(new cdi[] { localcdi5, localcdi6, localcdi7, localcdi8 }, paramInt1 + paramInt5 + paramInt3 + paramInt5, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt5 + paramInt3, paramInt2 + paramInt5 + paramInt4, paramcdy.a, paramcdy.b);
/* 72:72 */     if (paramBoolean) {
/* 73:73 */       for (int j = 0; j < this.i.length; j++) {
/* 74:74 */         this.i[j].a();
/* 75:   */       }
/* 76:   */     }
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void a(VertexBuffer paramciv, float paramFloat)
/* 80:   */   {
/* 81:80 */     for (int j = 0; j < this.i.length; j++) {
/* 82:81 */       this.i[j].a(paramciv, paramFloat);
/* 83:   */     }
/* 84:   */   }
/* 85:   */   
/* 86:   */   public cdt a(String paramString)
/* 87:   */   {
/* 88:86 */     this.g = paramString;
/* 89:87 */     return this;
/* 90:   */   }
/* 91:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdt
 * JD-Core Version:    0.7.0.1
 */