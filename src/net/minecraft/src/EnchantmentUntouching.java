package net.minecraft.src;
/*  1:   */ public class EnchantmentUntouching
/*  2:   */   extends Enchantment
/*  3:   */ {
/*  4:   */   protected EnchantmentUntouching(int paramInt1, oa paramoa, int paramInt2)
/*  5:   */   {
/*  6: 9 */     super(paramInt1, paramoa, paramInt2, apg.h);
/*  7:   */     
/*  8:11 */     c("untouching");
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a(int paramInt)
/* 12:   */   {
/* 13:16 */     return 15;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int b(int paramInt)
/* 17:   */   {
/* 18:21 */     return super.a(paramInt) + 50;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int b()
/* 22:   */   {
/* 23:26 */     return 1;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean a(Enchantment paramapf)
/* 27:   */   {
/* 28:31 */     return (super.a(paramapf)) && (paramapf.B != u.B);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean a(ItemStack paramamj)
/* 32:   */   {
/* 33:36 */     if (paramamj.getItem() == ItemList.be) {
/* 34:37 */       return true;
/* 35:   */     }
/* 36:39 */     return super.a(paramamj);
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apw
 * JD-Core Version:    0.7.0.1
 */