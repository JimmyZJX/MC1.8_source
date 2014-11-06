package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class axr
/*  4:   */   extends atg
/*  5:   */ {
/*  6:   */   protected axr()
/*  7:   */   {
/*  8:17 */     super(Material.rock);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public bcm a(World paramaqu, int paramInt)
/* 12:   */   {
/* 13:22 */     return new bdg();
/* 14:   */   }
/* 15:   */   
/* 16:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 17:   */   {
/* 18:28 */     return null;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int a(Random paramRandom)
/* 22:   */   {
/* 23:33 */     return 0;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/* 27:   */   {
/* 28:38 */     super.a(paramaqu, paramdt, parambec, paramFloat, paramInt);
/* 29:   */     
/* 30:   */ 
/* 31:41 */     int i = 15 + paramaqu.rng.nextInt(15) + paramaqu.rng.nextInt(15);
/* 32:42 */     b(paramaqu, paramdt, i);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public boolean c()
/* 36:   */   {
/* 37:47 */     return false;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public int b()
/* 41:   */   {
/* 42:52 */     return 3;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public aql k()
/* 46:   */   {
/* 47:57 */     return aql.c;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public Item b(World paramaqu, BlockPosition paramdt)
/* 51:   */   {
/* 52:62 */     return null;
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axr
 * JD-Core Version:    0.7.0.1
 */