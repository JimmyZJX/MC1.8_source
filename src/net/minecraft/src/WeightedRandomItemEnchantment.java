package net.minecraft.src;
/*  1:   */ public class WeightedRandomItemEnchantment
/*  2:   */   extends WeightedRandomItem
/*  3:   */ {
/*  4:   */   public final Enchantment enchantment;
/*  5:   */   public final int level;
/*  6:   */   
/*  7:   */   public WeightedRandomItemEnchantment(Enchantment paramapf, int paramInt)
/*  8:   */   {
/*  9:10 */     super(paramapf.d());
/* 10:11 */     this.enchantment = paramapf;
/* 11:12 */     this.level = paramInt;
/* 12:   */   }
/* 13:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apo
 * JD-Core Version:    0.7.0.1
 */