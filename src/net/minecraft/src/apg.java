package net.minecraft.src;
/*  1:   */ public enum apg
/*  2:   */ { a, b, c, d, e, f, g, h, i, j, k; // TODO: BROKEN
/*  3:   */   public boolean a(Item paramalq)
/*  4:   */   {
/*  5:21 */     if (this == a) {
/*  6:22 */       return true;
/*  7:   */     }
/*  8:24 */     if ((this == j) && (paramalq.m())) {
/*  9:25 */       return true;
/* 10:   */     }
/* 11:28 */     if ((paramalq instanceof ItemArmor))
/* 12:   */     {
/* 13:29 */       if (this == b) {
/* 14:30 */         return true;
/* 15:   */       }
/* 16:32 */       ItemArmor localajn = (ItemArmor)paramalq;
/* 17:33 */       if (localajn.b == 0) {
/* 18:34 */         return this == f;
/* 19:   */       }
/* 20:36 */       if (localajn.b == 2) {
/* 21:37 */         return this == d;
/* 22:   */       }
/* 23:39 */       if (localajn.b == 1) {
/* 24:40 */         return this == e;
/* 25:   */       }
/* 26:42 */       if (localajn.b == 3) {
/* 27:43 */         return this == c;
/* 28:   */       }
/* 29:45 */       return false;
/* 30:   */     }
/* 31:46 */     if ((paramalq instanceof ItemSword)) {
/* 32:47 */       return this == g;
/* 33:   */     }
/* 34:48 */     if ((paramalq instanceof ItemTool)) {
/* 35:49 */       return this == h;
/* 36:   */     }
/* 37:50 */     if ((paramalq instanceof ItemBow)) {
/* 38:51 */       return this == k;
/* 39:   */     }
/* 40:52 */     if ((paramalq instanceof ItemFishingRod)) {
/* 41:53 */       return this == i;
/* 42:   */     }
/* 43:55 */     return false;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apg
 * JD-Core Version:    0.7.0.1
 */