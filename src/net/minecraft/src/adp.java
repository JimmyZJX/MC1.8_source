package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class adp
/*  4:   */   extends WeightedRandomItem
/*  5:   */ {
/*  6:   */   private final ItemStack b;
/*  7:   */   private float c;
/*  8:   */   private boolean d;
/*  9:   */   
/* 10:   */   public adp(ItemStack paramamj, int paramInt)
/* 11:   */   {
/* 12:15 */     super(paramInt);
/* 13:16 */     this.b = paramamj;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public ItemStack a(Random paramRandom)
/* 17:   */   {
/* 18:20 */     ItemStack localamj = this.b.k();
/* 19:22 */     if (this.c > 0.0F)
/* 20:   */     {
/* 21:23 */       int i = (int)(this.c * this.b.j());
/* 22:24 */       int j = localamj.j() - paramRandom.nextInt(paramRandom.nextInt(i) + 1);
/* 23:25 */       if (j > i) {
/* 24:26 */         j = i;
/* 25:   */       }
/* 26:28 */       if (j < 1) {
/* 27:29 */         j = 1;
/* 28:   */       }
/* 29:31 */       localamj.b(j);
/* 30:   */     }
/* 31:34 */     if (this.d) {
/* 32:35 */       aph.randomEnchant(paramRandom, localamj, 30);
/* 33:   */     }
/* 34:38 */     return localamj;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public adp a(float paramFloat)
/* 38:   */   {
/* 39:42 */     this.c = paramFloat;
/* 40:43 */     return this;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public adp a()
/* 44:   */   {
/* 45:47 */     this.d = true;
/* 46:48 */     return this;
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adp
 * JD-Core Version:    0.7.0.1
 */