package net.minecraft.src;
/*  1:   */ public class EnchantmentDigging
/*  2:   */   extends Enchantment
/*  3:   */ {
/*  4:   */   protected EnchantmentDigging(int paramInt1, oa paramoa, int paramInt2)
/*  5:   */   {
/*  6: 9 */     super(paramInt1, paramoa, paramInt2, apg.h);
/*  7:   */     
/*  8:11 */     c("digging");
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a(int paramInt)
/* 12:   */   {
/* 13:16 */     return 1 + 10 * (paramInt - 1);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int b(int paramInt)
/* 17:   */   {
/* 18:21 */     return super.a(paramInt) + 50;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int getHighestLevel()
/* 22:   */   {
/* 23:26 */     return 5;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean a(ItemStack paramamj)
/* 27:   */   {
/* 28:31 */     if (paramamj.getItem() == ItemList.shears) {
/* 29:32 */       return true;
/* 30:   */     }
/* 31:34 */     return super.a(paramamj);
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ape
 * JD-Core Version:    0.7.0.1
 */