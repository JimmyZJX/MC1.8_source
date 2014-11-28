package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class EnchantmentDurability
/*  4:   */   extends Enchantment
/*  5:   */ {
/*  6:   */   protected EnchantmentDurability(int paramInt1, oa paramoa, int paramInt2)
/*  7:   */   {
/*  8:11 */     super(paramInt1, paramoa, paramInt2, apg.j);
/*  9:   */     
/* 10:13 */     c("durability");
/* 11:   */   }
/* 12:   */   
/* 13:   */   public int a(int paramInt)
/* 14:   */   {
/* 15:18 */     return 5 + (paramInt - 1) * 8;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int b(int paramInt)
/* 19:   */   {
/* 20:23 */     return super.a(paramInt) + 50;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int getHighestLevel()
/* 24:   */   {
/* 25:28 */     return 3;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public boolean a(ItemStack paramamj)
/* 29:   */   {
/* 30:33 */     if (paramamj.e()) {
/* 31:34 */       return true;
/* 32:   */     }
/* 33:36 */     return super.a(paramamj);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public static boolean a(ItemStack paramamj, int paramInt, Random paramRandom)
/* 37:   */   {
/* 38:40 */     if (((paramamj.getItem() instanceof ItemArmor)) && (paramRandom.nextFloat() < 0.6F)) {
/* 39:41 */       return false;
/* 40:   */     }
/* 41:43 */     return paramRandom.nextInt(paramInt + 1) > 0;
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apd
 * JD-Core Version:    0.7.0.1
 */