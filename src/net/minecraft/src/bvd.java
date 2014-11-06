package net.minecraft.src;
/*   1:    */ public class bvd
/*   2:    */   implements buv
/*   3:    */ {
/*   4:    */   private final bsu a;
/*   5:    */   private final bub b;
/*   6:    */   private final bub c;
/*   7:    */   private bub d;
/*   8:    */   
/*   9:    */   public bvd(bub parambub1, bub parambub2)
/*  10:    */   {
/*  11:280 */     this.a = bsu.z();
/*  12:281 */     this.b = parambub1;
/*  13:282 */     this.c = parambub2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public bub a()
/*  17:    */   {
/*  18:286 */     return this.b;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public bub b()
/*  22:    */   {
/*  23:290 */     return this.c;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*  27:    */   {
/*  28:295 */     a(this.b, paramInt3, paramInt6, paramInt7, false);
/*  29:296 */     a(this.c, paramInt3, paramInt6, paramInt7, false);
/*  30:    */   }
/*  31:    */   
/*  32:    */   private void a(bub parambub, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*  33:    */   {
/*  34:300 */     if (parambub == null) {
/*  35:301 */       return;
/*  36:    */     }
/*  37:304 */     if ((parambub instanceof bug)) {
/*  38:305 */       a((bug)parambub, paramInt1, paramInt2, paramInt3, paramBoolean);
/*  39:306 */     } else if ((parambub instanceof bul)) {
/*  40:307 */       a((bul)parambub, paramInt1, paramBoolean);
/*  41:308 */     } else if ((parambub instanceof buo)) {
/*  42:309 */       a((buo)parambub, paramInt1, paramInt2, paramInt3, paramBoolean);
/*  43:    */     }
/*  44:    */   }
/*  45:    */   
/*  46:    */   private void a(bug parambug, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*  47:    */   {
/*  48:314 */     parambug.i = paramInt1;
/*  49:315 */     if (!paramBoolean) {
/*  50:316 */       parambug.a(this.a, paramInt2, paramInt3);
/*  51:    */     }
/*  52:    */   }
/*  53:    */   
/*  54:    */   private void a(bul parambul, int paramInt, boolean paramBoolean)
/*  55:    */   {
/*  56:321 */     parambul.f = paramInt;
/*  57:322 */     if (!paramBoolean) {
/*  58:323 */       parambul.g();
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   private void a(buo parambuo, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*  63:    */   {
/*  64:328 */     parambuo.h = paramInt1;
/*  65:329 */     if (!paramBoolean) {
/*  66:330 */       parambuo.a(this.a, paramInt2, paramInt3);
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(int paramInt1, int paramInt2, int paramInt3)
/*  71:    */   {
/*  72:336 */     a(this.b, paramInt3, 0, 0, true);
/*  73:337 */     a(this.c, paramInt3, 0, 0, true);
/*  74:    */   }
/*  75:    */   
/*  76:    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  77:    */   {
/*  78:342 */     boolean bool1 = a(this.b, paramInt2, paramInt3, paramInt4);
/*  79:343 */     boolean bool2 = a(this.c, paramInt2, paramInt3, paramInt4);
/*  80:344 */     return (bool1) || (bool2);
/*  81:    */   }
/*  82:    */   
/*  83:    */   private boolean a(bub parambub, int paramInt1, int paramInt2, int paramInt3)
/*  84:    */   {
/*  85:348 */     if (parambub == null) {
/*  86:349 */       return false;
/*  87:    */     }
/*  88:352 */     if ((parambub instanceof bug)) {
/*  89:353 */       return a((bug)parambub, paramInt1, paramInt2, paramInt3);
/*  90:    */     }
/*  91:354 */     if ((parambub instanceof bul)) {
/*  92:355 */       a((bul)parambub, paramInt1, paramInt2, paramInt3);
/*  93:    */     }
/*  94:357 */     return false;
/*  95:    */   }
/*  96:    */   
/*  97:    */   private boolean a(bug parambug, int paramInt1, int paramInt2, int paramInt3)
/*  98:    */   {
/*  99:361 */     boolean bool = parambug.c(this.a, paramInt1, paramInt2);
/* 100:362 */     if (bool) {
/* 101:363 */       this.d = parambug;
/* 102:    */     }
/* 103:365 */     return bool;
/* 104:    */   }
/* 105:    */   
/* 106:    */   private void a(bul parambul, int paramInt1, int paramInt2, int paramInt3)
/* 107:    */   {
/* 108:369 */     parambul.a(paramInt1, paramInt2, paramInt3);
/* 109:370 */     if (parambul.m()) {
/* 110:371 */       this.d = parambul;
/* 111:    */     }
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 115:    */   {
/* 116:377 */     b(this.b, paramInt2, paramInt3, paramInt4);
/* 117:378 */     b(this.c, paramInt2, paramInt3, paramInt4);
/* 118:    */   }
/* 119:    */   
/* 120:    */   private void b(bub parambub, int paramInt1, int paramInt2, int paramInt3)
/* 121:    */   {
/* 122:382 */     if (parambub == null) {
/* 123:383 */       return;
/* 124:    */     }
/* 125:386 */     if ((parambub instanceof bug)) {
/* 126:387 */       b((bug)parambub, paramInt1, paramInt2, paramInt3);
/* 127:    */     }
/* 128:    */   }
/* 129:    */   
/* 130:    */   private void b(bug parambug, int paramInt1, int paramInt2, int paramInt3)
/* 131:    */   {
/* 132:392 */     parambug.a(paramInt1, paramInt2);
/* 133:    */   }
				static bub a(bvd arg0) {return arg0.d;}
/* 134:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvd
 * JD-Core Version:    0.7.0.1
 */