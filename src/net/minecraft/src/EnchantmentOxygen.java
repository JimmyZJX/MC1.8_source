package net.minecraft.src;
/*  1:   */ public class EnchantmentOxygen
/*  2:   */   extends Enchantment
/*  3:   */ {
/*  4:   */   public EnchantmentOxygen(int paramInt1, oa paramoa, int paramInt2)
/*  5:   */   {
/*  6: 7 */     super(paramInt1, paramoa, paramInt2, apg.f);
/*  7: 8 */     c("oxygen");
/*  8:   */   }
/*  9:   */   
/* 10:   */   public int a(int paramInt)
/* 11:   */   {
/* 12:13 */     return 10 * paramInt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int b(int paramInt)
/* 16:   */   {
/* 17:18 */     return a(paramInt) + 30;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public int getHighestLevel()
/* 21:   */   {
/* 22:23 */     return 3;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apt
 * JD-Core Version:    0.7.0.1
 */