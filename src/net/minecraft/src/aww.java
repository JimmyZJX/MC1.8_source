package net.minecraft.src;
/*  1:   */ public class aww
/*  2:   */   extends baa
/*  3:   */ {
/*  4:   */   public aww()
/*  5:   */   {
/*  6:16 */     super(Material.grass);
/*  7:17 */     j(this.L.b().setData(M, EnumAxis.Y));
/*  8:18 */     setCreativeTab(CreativeTabs.tabBlock);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public Block instance(int paramInt)
/* 12:   */   {
/* 13:23 */     EnumAxis localel = EnumAxis.Y;
/* 14:24 */     int i = paramInt & 0xC;
/* 15:25 */     if (i == 4) {
/* 16:26 */       localel = EnumAxis.X;
/* 17:27 */     } else if (i == 8) {
/* 18:28 */       localel = EnumAxis.Z;
/* 19:   */     }
/* 20:30 */     return instance().setData(M, localel);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int c(Block parambec)
/* 24:   */   {
/* 25:36 */     int i = 0;
/* 26:   */     
/* 27:38 */     EnumAxis localel = (EnumAxis)parambec.getProperty(M);
/* 28:39 */     if (localel == EnumAxis.X) {
/* 29:40 */       i |= 0x4;
/* 30:41 */     } else if (localel == EnumAxis.Z) {
/* 31:42 */       i |= 0x8;
/* 32:   */     }
/* 33:45 */     return i;
/* 34:   */   }
/* 35:   */   
/* 36:   */   protected bed e()
/* 37:   */   {
/* 38:50 */     return new bed(this, new IBlockData[] { M });
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected ItemStack i(Block parambec)
/* 42:   */   {
/* 43:55 */     return new ItemStack(Item.fromProtoBlock(this), 1, 0);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 47:   */   {
/* 48:60 */     return super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm).setData(M, paramej.k());
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aww
 * JD-Core Version:    0.7.0.1
 */