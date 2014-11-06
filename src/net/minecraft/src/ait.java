package net.minecraft.src;
/*  1:   */ class ait
/*  2:   */   extends ajk
/*  3:   */ {
/*  4:   */   ait(aiq paramaiq, vq paramvq, int paramInt1, int paramInt2, int paramInt3)
/*  5:   */   {
/*  6:65 */     super(paramvq, paramInt1, paramInt2, paramInt3);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(ItemStack paramamj)
/* 10:   */   {
/* 11:68 */     return (paramamj.getItem() == ItemList.dye) && (EnumDyeColor.fromIndex(paramamj.i()) == EnumDyeColor.BLUE);
/* 12:   */   }
/* 13:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ait
 * JD-Core Version:    0.7.0.1
 */