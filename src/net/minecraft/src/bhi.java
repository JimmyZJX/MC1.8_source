package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhi
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private auc a;
/*  7:   */   
/*  8:   */   public bhi(auc paramauc)
/*  9:   */   {
/* 10:14 */     this.a = paramauc;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 14:   */   {
/* 15:19 */     for (int i = 0; i < 64; i++)
/* 16:   */     {
/* 17:20 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 18:21 */       if ((paramaqu.d(localdt)) && ((!paramaqu.t.o()) || (localdt.getY() < 255)) && 
/* 19:22 */         (this.a.f(paramaqu, localdt, this.a.instance()))) {
/* 20:23 */         paramaqu.setBlock(localdt, this.a.instance(), 2);
/* 21:   */       }
/* 22:   */     }
/* 23:28 */     return true;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhi
 * JD-Core Version:    0.7.0.1
 */