package net.minecraft.src;
/*  1:   */ public class ajy
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public ajy()
/*  5:   */   {
/*  6:12 */     setTabToDisplayOn(CreativeTabs.tabBrewing);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 10:   */   {
/* 11:17 */     HitResult localbru = a(paramaqu, paramahd, true);
/* 12:18 */     if (localbru == null) {
/* 13:19 */       return paramamj;
/* 14:   */     }
/* 15:22 */     if (localbru.a == brv.BLOCK)
/* 16:   */     {
/* 17:23 */       BlockPosition localdt = localbru.a();
/* 18:25 */       if (!paramaqu.a(paramahd, localdt)) {
/* 19:26 */         return paramamj;
/* 20:   */       }
/* 21:28 */       if (!paramahd.a(localdt.offset(localbru.b), localbru.b, paramamj)) {
/* 22:29 */         return paramamj;
/* 23:   */       }
/* 24:31 */       if (paramaqu.getBlock(localdt).getProto().getMaterial() == Material.water)
/* 25:   */       {
/* 26:32 */         paramamj.stackSize -= 1;
/* 27:33 */         paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 28:34 */         if (paramamj.stackSize <= 0) {
/* 29:35 */           return new ItemStack(ItemList.potion);
/* 30:   */         }
/* 31:37 */         if (!paramahd.bg.a(new ItemStack(ItemList.potion))) {
/* 32:38 */           paramahd.a(new ItemStack(ItemList.potion, 1, 0), false);
/* 33:   */         }
/* 34:   */       }
/* 35:   */     }
/* 36:44 */     return paramamj;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajy
 * JD-Core Version:    0.7.0.1
 */