package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class aky
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public aky()
/*  7:   */   {
/*  8:10 */     this.maxStackSize = 16;
/*  9:11 */     setTabToDisplayOn(CreativeTabs.tabMaterials);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 13:   */   {
/* 14:16 */     if (!paramahd.by.d) {
/* 15:17 */       paramamj.stackSize -= 1;
/* 16:   */     }
/* 17:19 */     paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
/* 18:20 */     if (!paramaqu.isClient) {
/* 19:21 */       paramaqu.spawnEntity(new ahs(paramaqu, paramahd));
/* 20:   */     }
/* 21:23 */     paramahd.b(StatList.J[Item.b(this)]);
/* 22:24 */     return paramamj;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aky
 * JD-Core Version:    0.7.0.1
 */