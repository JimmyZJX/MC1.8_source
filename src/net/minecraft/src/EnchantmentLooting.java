package net.minecraft.src;
/*  1:   */ public class EnchantmentLooting
/*  2:   */   extends Enchantment
/*  3:   */ {
/*  4:   */   protected EnchantmentLooting(int paramInt1, oa paramoa, int paramInt2, apg paramapg)
/*  5:   */   {
/*  6: 7 */     super(paramInt1, paramoa, paramInt2, paramapg);
/*  7: 9 */     if (paramapg == apg.h) {
/*  8:10 */       c("lootBonusDigger");
/*  9:11 */     } else if (paramapg == apg.i) {
/* 10:12 */       c("lootBonusFishing");
/* 11:   */     } else {
/* 12:14 */       c("lootBonus");
/* 13:   */     }
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int a(int paramInt)
/* 17:   */   {
/* 18:20 */     return 15 + (paramInt - 1) * 9;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int b(int paramInt)
/* 22:   */   {
/* 23:25 */     return super.a(paramInt) + 50;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int b()
/* 27:   */   {
/* 28:30 */     return 3;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean a(Enchantment paramapf)
/* 32:   */   {
/* 33:35 */     return (super.a(paramapf)) && (paramapf.B != s.B);
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aps
 * JD-Core Version:    0.7.0.1
 */