package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class cxo
/*  4:   */   implements cxe
/*  5:   */ {
/*  6:   */   private final int a;
/*  7:   */   private final List<cxq> b;
/*  8:   */   private final cxe c;
/*  9:   */   
/* 10:   */   public cxo(List<cxq> paramList)
/* 11:   */   {
/* 12:20 */     this.b = paramList;
/* 13:21 */     this.a = WeightedRandom.getTotalWeight(paramList);
/* 14:22 */     this.c = paramList.get(0).b;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public List<clt> a(EnumDirection paramej)
/* 18:   */   {
/* 19:27 */     return this.c.a(paramej);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<clt> a()
/* 23:   */   {
/* 24:32 */     return this.c.a();
/* 25:   */   }
/* 26:   */   
/* 27:   */   public boolean b()
/* 28:   */   {
/* 29:37 */     return this.c.b();
/* 30:   */   }
/* 31:   */   
/* 32:   */   public boolean c()
/* 33:   */   {
/* 34:42 */     return this.c.c();
/* 35:   */   }
/* 36:   */   
/* 37:   */   public boolean d()
/* 38:   */   {
/* 39:47 */     return this.c.d();
/* 40:   */   }
/* 41:   */   
/* 42:   */   public cue e()
/* 43:   */   {
/* 44:52 */     return this.c.e();
/* 45:   */   }
/* 46:   */   
/* 47:   */   public cmx f()
/* 48:   */   {
/* 49:57 */     return this.c.f();
/* 50:   */   }
/* 51:   */   
/* 52:   */   public cxe a(long paramLong)
/* 53:   */   {
/* 54:61 */     return ((cxq)WeightedRandom.getRandomItem(this.b, Math.abs((int)paramLong >> 16) % this.a)).b;
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxo
 * JD-Core Version:    0.7.0.1
 */