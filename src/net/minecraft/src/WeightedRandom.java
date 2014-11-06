package net.minecraft.src;
/*  1:   */ import java.util.Collection;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class WeightedRandom
/*  5:   */ {
/*  6:   */   public static int getTotalWeight(Collection<? extends WeightedRandomItem> paramCollection)
/*  7:   */   {
/*  8: 8 */     int i = 0;
/*  9: 9 */     for (WeightedRandomItem item : paramCollection) {
/* 10:10 */       i += item.weight;
/* 11:   */     }
/* 12:12 */     return i;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public static <T extends WeightedRandomItem> T getRandomItem(Random paramRandom, Collection<T> paramCollection, int paramInt)
/* 16:   */   {
/* 17:16 */     if (paramInt <= 0) {
/* 18:17 */       throw new IllegalArgumentException();
/* 19:   */     }
/* 20:20 */     int i = paramRandom.nextInt(paramInt);
/* 21:21 */     return getRandomItem(paramCollection, i);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public static <T extends WeightedRandomItem> T getRandomItem(Collection<T> paramCollection, int paramInt)
/* 25:   */   {
/* 26:25 */     for (T item : paramCollection)
/* 27:   */     {
/* 28:26 */       paramInt -= item.weight;
/* 29:27 */       if (paramInt < 0) {
/* 30:28 */         return item;
/* 31:   */       }
/* 32:   */     }
/* 33:31 */     return null;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public static <T extends WeightedRandomItem> T getRandomItem(Random paramRandom, Collection<T> paramCollection)
/* 37:   */   {
/* 38:35 */     return getRandomItem(paramRandom, paramCollection, getTotalWeight(paramCollection));
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     vj
 * JD-Core Version:    0.7.0.1
 */