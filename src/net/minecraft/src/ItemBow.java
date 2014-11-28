package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class ItemBow
/*  4:   */   extends Item
/*  5:   */ {
/*  6:11 */   public static final String[] a = { "pulling_0", "pulling_1", "pulling_2" };
/*  7:   */   
/*  8:   */   public ItemBow()
/*  9:   */   {
/* 10:20 */     this.maxStackSize = 1;
/* 11:21 */     setMaxDamage(384);
/* 12:22 */     setTabToDisplayOn(CreativeTabs.tabCombat);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(ItemStack stack, World world, EntityPlayer paramahd, int paramInt)
/* 16:   */   {
/* 17:27 */     int i = (paramahd.abilities.instabuild) || (aph.a(Enchantment.infinity.id, stack) > 0) ? 1 : 0;
/* 18:29 */     if ((i != 0) || (paramahd.bg.b(ItemList.arrow)))
/* 19:   */     {
/* 20:30 */       int j = d(stack) - paramInt;
/* 21:31 */       float f = j / 20.0F;
/* 22:32 */       f = (f * f + f * 2.0F) / 3.0F;
/* 23:33 */       if (f < 0.1D) {
/* 24:34 */         return;
/* 25:   */       }
/* 26:36 */       if (f > 1.0F) {
/* 27:37 */         f = 1.0F;
/* 28:   */       }
/* 29:40 */       EntityArrow localahj = new EntityArrow(world, paramahd, f * 2.0F);
/* 30:41 */       if (f == 1.0F) {
/* 31:42 */         localahj.a(true);
/* 32:   */       }
/* 33:44 */       int k = aph.a(Enchantment.v.id, stack);
/* 34:45 */       if (k > 0) {
/* 35:46 */         localahj.b(localahj.j() + k * 0.5D + 0.5D);
/* 36:   */       }
/* 37:48 */       int m = aph.a(Enchantment.w.id, stack);
/* 38:49 */       if (m > 0) {
/* 39:50 */         localahj.a(m);
/* 40:   */       }
/* 41:52 */       if (aph.a(Enchantment.x.id, stack) > 0) {
/* 42:53 */         localahj.e(100);
/* 43:   */       }
/* 44:55 */       stack.a(1, paramahd);
/* 45:   */       
/* 46:57 */       world.a(paramahd, "random.bow", 1.0F, 1.0F / (random.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
/* 47:58 */       if (i != 0) {
/* 48:59 */         localahj.a = 2;
/* 49:   */       } else {
/* 50:61 */         paramahd.bg.a(ItemList.arrow);
/* 51:   */       }
/* 52:63 */       paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 53:64 */       if (!world.isClient) {
/* 54:65 */         world.spawnEntity(localahj);
/* 55:   */       }
/* 56:   */     }
/* 57:   */   }
/* 58:   */   
/* 59:   */   public ItemStack b(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 60:   */   {
/* 61:72 */     return paramamj;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public int d(ItemStack paramamj)
/* 65:   */   {
/* 66:77 */     return 72000;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public ano e(ItemStack paramamj)
/* 70:   */   {
/* 71:82 */     return ano.e;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 75:   */   {
/* 76:87 */     if ((paramahd.abilities.instabuild) || (paramahd.bg.b(ItemList.arrow))) {
/* 77:88 */       paramahd.a(paramamj, d(paramamj));
/* 78:   */     }
/* 79:90 */     return paramamj;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public int getItemEnchantability()
/* 83:   */   {
/* 84:95 */     return 1;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajz
 * JD-Core Version:    0.7.0.1
 */