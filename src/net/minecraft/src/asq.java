package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class asq
/*  5:   */   extends arm
/*  6:   */ {
/*  7:16 */   private static final bil aD = new bil(false);
/*  8:   */   
/*  9:   */   protected asq(int paramInt)
/* 10:   */   {
/* 11:19 */     super(paramInt);
/* 12:   */     
/* 13:21 */     this.au.add(new SpawnListEntry(EntityHorse.class, 1, 2, 6));
/* 14:   */     
/* 15:23 */     this.as.A = 1;
/* 16:24 */     this.as.B = 4;
/* 17:25 */     this.as.C = 20;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public bhc a(Random paramRandom)
/* 21:   */   {
/* 22:30 */     if (paramRandom.nextInt(5) > 0) {
/* 23:31 */       return aD;
/* 24:   */     }
/* 25:33 */     return this.aA;
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected arm d(int paramInt)
/* 29:   */   {
/* 30:38 */     asr localasr = new asr(paramInt, this);
/* 31:   */     
/* 32:40 */     localasr.ap = ((this.ap + 1.0F) * 0.5F);
/* 33:41 */     localasr.an = (this.an * 0.5F + 0.3F);
/* 34:42 */     localasr.ao = (this.ao * 0.5F + 1.2F);
/* 35:   */     
/* 36:44 */     return localasr;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 40:   */   {
/* 41:49 */     ag.a(avk.c);
/* 42:50 */     for (int i = 0; i < 7; i++)
/* 43:   */     {
/* 44:51 */       int j = paramRandom.nextInt(16) + 8;
/* 45:52 */       int k = paramRandom.nextInt(16) + 8;
/* 46:53 */       int m = paramRandom.nextInt(paramaqu.m(paramdt.offset(j, 0, k)).getY() + 32);
/* 47:54 */       ag.generate(paramaqu, paramRandom, paramdt.offset(j, m, k));
/* 48:   */     }
/* 49:56 */     super.a(paramaqu, paramRandom, paramdt);
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asq
 * JD-Core Version:    0.7.0.1
 */