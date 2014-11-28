package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class alc
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public alc()
/*  7:   */   {
/*  8:10 */     this.maxStackSize = 16;
/*  9:11 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 13:   */   {
/* 14:16 */     if (paramahd.abilities.instabuild) {
/* 15:17 */       return paramamj;
/* 16:   */     }
/* 17:20 */     paramamj.stackSize -= 1;
/* 18:21 */     paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
/* 19:22 */     if (!paramaqu.isClient) {
/* 20:23 */       paramaqu.spawnEntity(new aht(paramaqu, paramahd));
/* 21:   */     }
/* 22:25 */     paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 23:26 */     return paramamj;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alc
 * JD-Core Version:    0.7.0.1
 */