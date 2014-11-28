package net.minecraft.src;
/*  1:   */ public class akc
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public akc()
/*  5:   */   {
/*  6:10 */     setTabToDisplayOn(CreativeTabs.tabTransport);
/*  7:11 */     setStackLimit(1);
/*  8:12 */     setMaxDamage(25);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean v_()
/* 12:   */   {
/* 13:17 */     return true;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean e()
/* 17:   */   {
/* 18:22 */     return true;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 22:   */   {
/* 23:27 */     if ((paramahd.av()) && ((paramahd.vehicle instanceof EntityPig)))
/* 24:   */     {
/* 25:28 */       EntityPig localaca = (EntityPig)paramahd.vehicle;
/* 26:30 */       if ((localaca.ck().h()) && (paramamj.j() - paramamj.getDamage2() >= 7))
/* 27:   */       {
/* 28:31 */         localaca.ck().g();
/* 29:32 */         paramamj.a(7, paramahd);
/* 30:34 */         if (paramamj.stackSize == 0)
/* 31:   */         {
/* 32:35 */           ItemStack localamj = new ItemStack(ItemList.fishingRod);
/* 33:36 */           localamj.setTagCompound(paramamj.getTagCompound());
/* 34:37 */           return localamj;
/* 35:   */         }
/* 36:   */       }
/* 37:   */     }
/* 38:41 */     paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 39:   */     
/* 40:43 */     return paramamj;
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akc
 * JD-Core Version:    0.7.0.1
 */