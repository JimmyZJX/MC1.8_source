package net.minecraft.src;
/*  1:   */ public class bzq
/*  2:   */   implements buv
/*  3:   */ {
/*  4:   */   private final bsu a;
/*  5:   */   
/*  6:   */   public bzq()
/*  7:   */   {
/*  8:11 */     this.a = bsu.z();
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/* 12:   */   {
/* 13:16 */     int i = paramInt3 + paramInt5 / 2 - this.a.k.a / 2;
/* 14:17 */     this.a.k.a(cwc.a("lanServer.scanning", new Object[0]), this.a.m.l / 2 - this.a.k.a(cwc.a("lanServer.scanning", new Object[0])) / 2, i, 16777215);
/* 15:   */     String str;
/* 16:19 */     switch ((int)(bsu.I() / 300L % 4L))
/* 17:   */     {
/* 18:   */     case 0: 
/* 19:   */     default: 
/* 20:22 */       str = "O o o";
/* 21:23 */       break;
/* 22:   */     case 1: 
/* 23:   */     case 3: 
/* 24:26 */       str = "o O o";
/* 25:27 */       break;
/* 26:   */     case 2: 
/* 27:29 */       str = "o o O";
/* 28:   */     }
/* 29:32 */     this.a.k.a(str, this.a.m.l / 2 - this.a.k.a(str) / 2, i + this.a.k.a, 8421504);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(int paramInt1, int paramInt2, int paramInt3) {}
/* 33:   */   
/* 34:   */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 35:   */   {
/* 36:41 */     return false;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzq
 * JD-Core Version:    0.7.0.1
 */