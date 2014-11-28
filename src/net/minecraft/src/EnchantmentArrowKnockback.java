package net.minecraft.src;
/*  1:   */ public class EnchantmentArrowKnockback
/*  2:   */   extends Enchantment
/*  3:   */ {
/*  4:   */   public EnchantmentArrowKnockback(int paramInt1, oa paramoa, int paramInt2)
/*  5:   */   {
/*  6: 7 */     super(paramInt1, paramoa, paramInt2, apg.k);
/*  7: 8 */     c("arrowKnockback");
/*  8:   */   }
/*  9:   */   
/* 10:   */   public int a(int paramInt)
/* 11:   */   {
/* 12:13 */     return 12 + (paramInt - 1) * 20;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int b(int paramInt)
/* 16:   */   {
/* 17:18 */     return a(paramInt) + 25;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public int getHighestLevel()
/* 21:   */   {
/* 22:23 */     return 2;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apb
 * JD-Core Version:    0.7.0.1
 */