package net.minecraft.src;
/*  1:   */ public class alo
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   protected EnumToolMaterial a;
/*  5:   */   
/*  6:   */   public alo(EnumToolMaterial paramami)
/*  7:   */   {
/*  8:17 */     this.a = paramami;
/*  9:18 */     this.maxStackSize = 1;
/* 10:19 */     setMaxDamage(paramami.getMaxUses());
/* 11:20 */     setTabToDisplayOn(CreativeTabs.tabTools);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 15:   */   {
/* 16:25 */     if (!paramahd.a(paramdt.a(paramej), paramej, paramamj)) {
/* 17:26 */       return false;
/* 18:   */     }
/* 19:29 */     Block localbec = paramaqu.getBlock(paramdt);
/* 20:30 */     ProtoBlock localatr = localbec.getProto();
/* 21:32 */     if ((paramej != EnumDirection.DOWN) && (paramaqu.getBlock(paramdt.up()).getProto().getMaterial() == Material.air))
/* 22:   */     {
/* 23:33 */       if (localatr == BlockList.grass) {
/* 24:34 */         return a(paramamj, paramahd, paramaqu, paramdt, BlockList.ak.instance());
/* 25:   */       }
/* 26:35 */       if (localatr == BlockList.dirt) {
/* 27:36 */         switch (alp.a[((avd)localbec.getProperty(BlockDirt.a)).ordinal()])
/* 28:   */         {
/* 29:   */         case 1: 
/* 30:38 */           return a(paramamj, paramahd, paramaqu, paramdt, BlockList.ak.instance());
/* 31:   */         case 2: 
/* 32:40 */           return a(paramamj, paramahd, paramaqu, paramdt, BlockList.dirt.instance().a(BlockDirt.a, avd.a));
/* 33:   */         }
/* 34:   */       }
/* 35:   */     }
/* 36:45 */     return false;
/* 37:   */   }
/* 38:   */   
/* 39:   */   protected boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, Block parambec)
/* 40:   */   {
/* 41:49 */     paramaqu.a(paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F, parambec.getProto().H.c(), (parambec.getProto().H.d() + 1.0F) / 2.0F, parambec.getProto().H.e() * 0.8F);
/* 42:51 */     if (paramaqu.isClient) {
/* 43:52 */       return true;
/* 44:   */     }
/* 45:54 */     paramaqu.setBlock(paramdt, parambec);
/* 46:55 */     paramamj.a(1, paramahd);
/* 47:   */     
/* 48:57 */     return true;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public boolean v_()
/* 52:   */   {
/* 53:62 */     return true;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String g()
/* 57:   */   {
/* 58:66 */     return this.a.toString();
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alo
 * JD-Core Version:    0.7.0.1
 */