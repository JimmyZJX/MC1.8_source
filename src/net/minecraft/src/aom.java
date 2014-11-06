package net.minecraft.src;
/*  1:   */ public class aom
/*  2:   */   extends aos
/*  3:   */ {
/*  4:   */   public aom()
/*  5:   */   {
/*  6:14 */     super(3, 3, new ItemStack[] { new ItemStack(ItemList.aK), new ItemStack(ItemList.aK), new ItemStack(ItemList.aK), new ItemStack(ItemList.aK), new ItemStack(ItemList.filledMap, 0, 32767), new ItemStack(ItemList.aK), new ItemStack(ItemList.aK), new ItemStack(ItemList.aK), new ItemStack(ItemList.aK) }, new ItemStack(ItemList.bV, 0, 0));
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(ain paramain, World paramaqu)
/* 10:   */   {
/* 11:26 */     if (!super.a(paramain, paramaqu)) {
/* 12:27 */       return false;
/* 13:   */     }
/* 14:29 */     ItemStack localObject = null;
/* 15:31 */     for (int i = 0; (i < paramain.n_()) && (localObject == null); i++)
/* 16:   */     {
/* 17:32 */       ItemStack localamj = paramain.a(i);
/* 18:33 */       if ((localamj != null) && (localamj.getItem() == ItemList.filledMap)) {
/* 19:34 */         localObject = localamj;
/* 20:   */       }
/* 21:   */     }
/* 22:38 */     if (localObject == null) {
/* 23:39 */       return false;
/* 24:   */     }
/* 25:41 */     bqe localbqe = ItemList.filledMap.a(localObject, paramaqu);
/* 26:42 */     if (localbqe == null) {
/* 27:43 */       return false;
/* 28:   */     }
/* 29:45 */     return localbqe.scale < 4;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public ItemStack a(ain paramain)
/* 33:   */   {
/* 34:51 */     ItemStack localObject = null;
/* 35:53 */     for (int i = 0; (i < paramain.n_()) && (localObject == null); i++)
/* 36:   */     {
/* 37:54 */       ItemStack localamj = paramain.a(i);
/* 38:55 */       if ((localamj != null) && (localamj.getItem() == ItemList.filledMap)) {
/* 39:56 */         localObject = localamj;
/* 40:   */       }
/* 41:   */     }
/* 42:60 */     localObject = ((ItemStack)localObject).k();
/* 43:61 */     ((ItemStack)localObject).stackSize = 1;
/* 44:63 */     if (((ItemStack)localObject).getTagCompound() == null) {
/* 45:64 */       ((ItemStack)localObject).setTagCompound(new NBTTagCompound());
/* 46:   */     }
/* 47:66 */     ((ItemStack)localObject).getTagCompound().setBoolean("map_is_scaling", true);
/* 48:   */     
/* 49:68 */     return localObject;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aom
 * JD-Core Version:    0.7.0.1
 */