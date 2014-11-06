package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ald
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public ald()
/*  7:   */   {
/*  8:10 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean f(ItemStack paramamj)
/* 12:   */   {
/* 13:15 */     return true;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 17:   */   {
/* 18:20 */     if (!paramahd.by.d) {
/* 19:21 */       paramamj.stackSize -= 1;
/* 20:   */     }
/* 21:23 */     paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
/* 22:24 */     if (!paramaqu.isClient) {
/* 23:25 */       paramaqu.spawnEntity(new ahu(paramaqu, paramahd));
/* 24:   */     }
/* 25:27 */     paramahd.b(StatList.J[Item.b(this)]);
/* 26:28 */     return paramamj;
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ald
 * JD-Core Version:    0.7.0.1
 */