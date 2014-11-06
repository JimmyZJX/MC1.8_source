package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class asa
/*  5:   */   extends arm
/*  6:   */ {
/*  7:   */   public asa(int paramInt)
/*  8:   */   {
/*  9:12 */     super(paramInt);
/* 10:   */     
/* 11:   */ 
/* 12:15 */     this.au.clear();
/* 13:16 */     this.ak = BlockList.sand.instance();
/* 14:17 */     this.al = BlockList.sand.instance();
/* 15:   */     
/* 16:19 */     this.as.A = -999;
/* 17:20 */     this.as.D = 2;
/* 18:21 */     this.as.F = 50;
/* 19:22 */     this.as.G = 10;
/* 20:   */     
/* 21:24 */     this.au.clear();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 25:   */   {
/* 26:29 */     super.a(paramaqu, paramRandom, paramdt);
/* 27:31 */     if (paramRandom.nextInt(1000) == 0)
/* 28:   */     {
/* 29:32 */       int i = paramRandom.nextInt(16) + 8;
/* 30:33 */       int j = paramRandom.nextInt(16) + 8;
/* 31:34 */       BlockPosition localdt = paramaqu.m(paramdt.offset(i, 0, j)).up();
/* 32:   */       
/* 33:36 */       new bhn().generate(paramaqu, paramRandom, localdt);
/* 34:   */     }
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asa
 * JD-Core Version:    0.7.0.1
 */