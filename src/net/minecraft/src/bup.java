package net.minecraft.src;
/*  1:   */ public class bup
/*  2:   */   extends bug
/*  3:   */ {
/*  4:   */   public bup(int paramInt1, int paramInt2, int paramInt3)
/*  5:   */   {
/*  6: 8 */     super(paramInt1, paramInt2, paramInt3, 20, 20, "");
/*  7:   */   }
/*  8:   */   
/*  9:   */   public void a(bsu parambsu, int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:13 */     if (!this.m) {
/* 12:14 */       return;
/* 13:   */     }
/* 14:17 */     parambsu.N().a(bug.a);
/* 15:18 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 16:   */     
/* 17:20 */     int i = (paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g) ? 1 : 0;
/* 18:21 */     int j = 106;
/* 19:22 */     if (i != 0) {
/* 20:23 */       j += this.g;
/* 21:   */     }
/* 22:26 */     b(this.h, this.i, 0, j, this.f, this.g);
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bup
 * JD-Core Version:    0.7.0.1
 */