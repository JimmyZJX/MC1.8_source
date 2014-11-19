package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bgt
/*  4:   */ {
/*  5:11 */   protected int a = 8;
/*  6:12 */   protected Random b = new Random();
/*  7:   */   protected World c;
/*  8:   */   
/*  9:   */   public void a(IChunkProvider parambfe, World paramaqu, int paramInt1, int paramInt2, bgk parambgk)
/* 10:   */   {
/* 11:16 */     int i = this.a;
/* 12:17 */     this.c = paramaqu;
/* 13:   */     
/* 14:19 */     this.b.setSeed(paramaqu.J());
/* 15:20 */     long l1 = this.b.nextLong();
/* 16:21 */     long l2 = this.b.nextLong();
/* 17:23 */     for (int j = paramInt1 - i; j <= paramInt1 + i; j++) {
/* 18:24 */       for (int k = paramInt2 - i; k <= paramInt2 + i; k++)
/* 19:   */       {
/* 20:25 */         long l3 = j * l1;
/* 21:26 */         long l4 = k * l2;
/* 22:27 */         this.b.setSeed(l3 ^ l4 ^ paramaqu.J());
/* 23:28 */         a(paramaqu, j, k, paramInt1, paramInt2, parambgk);
/* 24:   */       }
/* 25:   */     }
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected void a(World paramaqu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, bgk parambgk) {}
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgt
 * JD-Core Version:    0.7.0.1
 */