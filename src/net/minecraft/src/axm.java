package net.minecraft.src;
/*  1:   */ public abstract class axm
/*  2:   */   extends baa
/*  3:   */ {
/*  4:18 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("axis", axo.class);
/*  5:   */   
/*  6:   */   public axm()
/*  7:   */   {
/*  8:21 */     super(Material.wood);
/*  9:22 */     setCreativeTab(CreativeTabs.tabBlock);
/* 10:23 */     c(2.0F);
/* 11:24 */     a(f);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 15:   */   {
/* 16:29 */     int i = 4;
/* 17:30 */     int j = i + 1;
/* 18:32 */     if (!paramaqu.a(paramdt.offset(-j, -j, -j), paramdt.offset(j, j, j))) {
/* 19:33 */       return;
/* 20:   */     }
/* 21:36 */     for (BlockPosition localdt : BlockPosition.a(paramdt.offset(-i, -i, -i), paramdt.offset(i, i, i)))
/* 22:   */     {
/* 23:37 */       Block localbec = paramaqu.getBlock(localdt);
/* 24:38 */       if ((localbec.getType().getMaterial() == Material.leaves) && 
/* 25:39 */         (!((Boolean)localbec.getData(BlockLeaves.b)).booleanValue())) {
/* 26:40 */         paramaqu.setBlock(localdt, localbec.setData(BlockLeaves.b, Boolean.valueOf(true)), 4);
/* 27:   */       }
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 32:   */   {
/* 33:51 */     return super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm).setData(a, axo.a(paramej.getAxis()));
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axm
 * JD-Core Version:    0.7.0.1
 */