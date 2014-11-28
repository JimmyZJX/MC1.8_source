package net.minecraft.src;
/*  1:   */ public class ItemShears
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public ItemShears()
/*  5:   */   {
/*  6:13 */     setStackLimit(1);
/*  7:14 */     setMaxDamage(238);
/*  8:15 */     setTabToDisplayOn(CreativeTabs.tabTools);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean a(ItemStack paramamj, World paramaqu, ProtoBlock paramatr, BlockPosition paramdt, EntityLiving paramxm)
/* 12:   */   {
/* 13:20 */     if ((paramatr.getMaterial() == Material.leaves) || (paramatr == BlockList.web) || (paramatr == BlockList.tallgrass) || (paramatr == BlockList.vine) || (paramatr == BlockList.tripwire) || (paramatr == BlockList.wool))
/* 14:   */     {
/* 15:21 */       paramamj.a(1, paramxm);
/* 16:22 */       return true;
/* 17:   */     }
/* 18:24 */     return super.a(paramamj, paramaqu, paramatr, paramdt, paramxm);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public boolean canHarvestBlock(ProtoBlock paramatr)
/* 22:   */   {
/* 23:29 */     return (paramatr == BlockList.web) || (paramatr == BlockList.redstoneWire) || (paramatr == BlockList.tripwire);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public float getStrVsBlock(ItemStack paramamj, ProtoBlock paramatr)
/* 27:   */   {
/* 28:34 */     if ((paramatr == BlockList.web) || (paramatr.getMaterial() == Material.leaves)) {
/* 29:35 */       return 15.0F;
/* 30:   */     }
/* 31:37 */     if (paramatr == BlockList.wool) {
/* 32:38 */       return 5.0F;
/* 33:   */     }
/* 34:40 */     return super.getStrVsBlock(paramamj, paramatr);
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     and
 * JD-Core Version:    0.7.0.1
 */