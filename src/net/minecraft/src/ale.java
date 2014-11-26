package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ale
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public ale()
/*  7:   */   {
/*  8:12 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 12:   */   {
/* 13:17 */     if (paramaqu.isClient) {
/* 14:18 */       return true;
/* 15:   */     }
/* 16:21 */     paramdt = paramdt.offset(paramej);
/* 17:23 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 18:24 */       return false;
/* 19:   */     }
/* 20:27 */     if (paramaqu.getBlock(paramdt).getProto().getMaterial() == Material.air)
/* 21:   */     {
/* 22:28 */       paramaqu.a(paramdt.getX() + 0.5D, paramdt.getY() + 0.5D, paramdt.getZ() + 0.5D, "item.fireCharge.use", 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
/* 23:29 */       paramaqu.setBlock(paramdt, BlockList.fire.instance());
/* 24:   */     }
/* 25:31 */     if (!paramahd.by.d) {
/* 26:32 */       paramamj.stackSize -= 1;
/* 27:   */     }
/* 28:34 */     return true;
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ale
 * JD-Core Version:    0.7.0.1
 */