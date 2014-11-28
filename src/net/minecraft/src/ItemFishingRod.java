package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ItemFishingRod
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public ItemFishingRod()
/*  7:   */   {
/*  8:13 */     setMaxDamage(64);
/*  9:14 */     setStackLimit(1);
/* 10:15 */     setTabToDisplayOn(CreativeTabs.tabTools);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean v_()
/* 14:   */   {
/* 15:20 */     return true;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean e()
/* 19:   */   {
/* 20:25 */     return true;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 24:   */   {
/* 25:30 */     if (paramahd.bE != null)
/* 26:   */     {
/* 27:31 */       int i = paramahd.bE.l();
/* 28:32 */       paramamj.a(i, paramahd);
/* 29:33 */       paramahd.bv();
/* 30:   */     }
/* 31:   */     else
/* 32:   */     {
/* 33:35 */       paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
/* 34:36 */       if (!paramaqu.isClient) {
/* 35:37 */         paramaqu.spawnEntity(new EntityFishHook(paramaqu, paramahd));
/* 36:   */       }
/* 37:39 */       paramahd.bv();
/* 38:40 */       paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 39:   */     }
/* 40:42 */     return paramamj;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public boolean f_(ItemStack paramamj)
/* 44:   */   {
/* 45:47 */     return super.f_(paramamj);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int getItemEnchantability()
/* 49:   */   {
/* 50:52 */     return 1;
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alj
 * JD-Core Version:    0.7.0.1
 */