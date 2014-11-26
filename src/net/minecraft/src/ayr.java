package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class ayr
/*  4:   */   extends axm
/*  5:   */ {
/*  6:14 */   public static final BlockDataEnum<EnumWoodVariant> b = BlockDataEnum.getInstance("variant", EnumWoodVariant.class, new ays());
/*  7:   */   
/*  8:   */   public ayr()
/*  9:   */   {
/* 10:22 */     j(this.L.b().setData(b, EnumWoodVariant.OAK).setData(a, axo.Y));
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 14:   */   {
/* 15:27 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.OAK.getIndex()));
/* 16:28 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.SPRUCE.getIndex()));
/* 17:29 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.BIRCH.getIndex()));
/* 18:30 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.JUNGLE.getIndex()));
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Block instance(int paramInt)
/* 22:   */   {
/* 23:35 */     Block localbec = instance().setData(b, EnumWoodVariant.fromIndex((paramInt & 0x3) % 4));
/* 24:38 */     switch (paramInt & 0xC)
/* 25:   */     {
/* 26:   */     case 0: 
/* 27:40 */       localbec = localbec.setData(a, axo.Y);
/* 28:41 */       break;
/* 29:   */     case 4: 
/* 30:43 */       localbec = localbec.setData(a, axo.X);
/* 31:44 */       break;
/* 32:   */     case 8: 
/* 33:46 */       localbec = localbec.setData(a, axo.Z);
/* 34:47 */       break;
/* 35:   */     default: 
/* 36:49 */       localbec = localbec.setData(a, axo.NONE);
/* 37:   */     }
/* 38:53 */     return localbec;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int c(Block parambec)
/* 42:   */   {
/* 43:58 */     int i = 0;
/* 44:   */     
/* 45:60 */     i |= ((EnumWoodVariant)parambec.getProperty(b)).getIndex();
/* 46:62 */     switch (ayt.a[((axo)parambec.getProperty(a)).ordinal()])
/* 47:   */     {
/* 48:   */     case 1: 
/* 49:64 */       i |= 0x4;
/* 50:65 */       break;
/* 51:   */     case 2: 
/* 52:67 */       i |= 0x8;
/* 53:68 */       break;
/* 54:   */     case 3: 
/* 55:70 */       i |= 0xC;
/* 56:   */     }
/* 57:74 */     return i;
/* 58:   */   }
/* 59:   */   
/* 60:   */   protected bed e()
/* 61:   */   {
/* 62:79 */     return new bed(this, new IBlockData[] { b, a });
/* 63:   */   }
/* 64:   */   
/* 65:   */   protected ItemStack i(Block parambec)
/* 66:   */   {
/* 67:84 */     return new ItemStack(Item.fromProtoBlock(this), 1, ((EnumWoodVariant)parambec.getProperty(b)).getIndex());
/* 68:   */   }
/* 69:   */   
/* 70:   */   public int a(Block parambec)
/* 71:   */   {
/* 72:89 */     return ((EnumWoodVariant)parambec.getProperty(b)).getIndex();
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayr
 * JD-Core Version:    0.7.0.1
 */