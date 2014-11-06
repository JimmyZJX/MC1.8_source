package net.minecraft.src;
/*  1:   */ import java.util.LinkedList;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bjk
/*  5:   */   extends bmv
/*  6:   */ {
/*  7:   */   public bjk() {}
/*  8:   */   
/*  9:   */   public bjk(World paramaqu, Random paramRandom, int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:14 */     super(paramInt1, paramInt2);
/* 12:   */     
/* 13:16 */     bji localbji = new bji(0, paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2);
/* 14:17 */     this.a.add(localbji);
/* 15:18 */     localbji.a(localbji, this.a, paramRandom);
/* 16:   */     
/* 17:20 */     c();
/* 18:21 */     a(paramaqu, paramRandom, 10);
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjk
 * JD-Core Version:    0.7.0.1
 */