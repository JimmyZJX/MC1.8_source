package net.minecraft.src;
/*  1:   */ import java.util.LinkedList;
/*  2:   */ import java.util.List;
/*  3:   */ import java.util.Random;
/*  4:   */ 
/*  5:   */ public class bjm
/*  6:   */   extends bmv
/*  7:   */ {
/*  8:   */   public bjm() {}
/*  9:   */   
/* 10:   */   public bjm(World paramaqu, Random paramRandom, int paramInt1, int paramInt2)
/* 11:   */   {
/* 12:70 */     super(paramInt1, paramInt2);
/* 13:   */     
/* 14:72 */     bkf localbkf = new bkf(paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2);
/* 15:73 */     this.a.add(localbkf);
/* 16:74 */     localbkf.a(localbkf, this.a, paramRandom);
/* 17:   */     
/* 18:76 */     List localList = localbkf.e;
/* 19:77 */     while (!localList.isEmpty())
/* 20:   */     {
/* 21:78 */       int i = paramRandom.nextInt(localList.size());
/* 22:79 */       bms localbms = (bms)localList.remove(i);
/* 23:80 */       localbms.a(localbkf, this.a, paramRandom);
/* 24:   */     }
/* 25:83 */     c();
/* 26:84 */     a(paramaqu, paramRandom, 48, 70);
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjm
 * JD-Core Version:    0.7.0.1
 */