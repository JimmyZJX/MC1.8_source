package net.minecraft.src;
/*  1:   */ public class aiu
/*  2:   */   extends ajk
/*  3:   */ {
/*  4:   */   public aiu(vq paramvq, int paramInt1, int paramInt2, int paramInt3)
/*  5:   */   {
/*  6:10 */     super(paramvq, paramInt1, paramInt2, paramInt3);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(ItemStack paramamj)
/* 10:   */   {
/* 11:15 */     return (bdc.c(paramamj)) || (c_(paramamj));
/* 12:   */   }
/* 13:   */   
/* 14:   */   public int b(ItemStack paramamj)
/* 15:   */   {
/* 16:20 */     return c_(paramamj) ? 1 : super.b(paramamj);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public static boolean c_(ItemStack paramamj)
/* 20:   */   {
/* 21:24 */     return (paramamj != null) && (paramamj.getItem() != null) && (paramamj.getItem() == ItemList.aw);
/* 22:   */   }
/* 23:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aiu
 * JD-Core Version:    0.7.0.1
 */