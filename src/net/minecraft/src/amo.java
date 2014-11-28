package net.minecraft.src;
/*  1:   */ public class amo
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public amo()
/*  5:   */   {
/*  6:11 */     setStackLimit(1);
/*  7:12 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/*  8:   */   }
/*  9:   */   
/* 10:   */   public ItemStack b(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 11:   */   {
/* 12:17 */     if (!paramahd.abilities.instabuild) {
/* 13:18 */       paramamj.stackSize -= 1;
/* 14:   */     }
/* 15:21 */     if (!paramaqu.isClient) {
/* 16:22 */       paramahd.bj();
/* 17:   */     }
/* 18:25 */     paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 19:26 */     if (paramamj.stackSize <= 0) {
/* 20:27 */       return new ItemStack(ItemList.aw);
/* 21:   */     }
/* 22:29 */     return paramamj;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public int d(ItemStack paramamj)
/* 26:   */   {
/* 27:34 */     return 32;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public ano e(ItemStack paramamj)
/* 31:   */   {
/* 32:39 */     return ano.c;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 36:   */   {
/* 37:44 */     paramahd.a(paramamj, d(paramamj));
/* 38:45 */     return paramamj;
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amo
 * JD-Core Version:    0.7.0.1
 */