package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class ayi
/*  4:   */   extends axm
/*  5:   */ {
/*  6:14 */   public static final BlockDataEnum b = BlockDataEnum.getInstance("variant", EnumWoodVariant.class, new ayj());
/*  7:   */   
/*  8:   */   public ayi()
/*  9:   */   {
/* 10:22 */     j(this.L.b().a(b, EnumWoodVariant.ACACIA).a(a, axo.Y));
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 14:   */   {
/* 15:27 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.ACACIA.getIndex() - 4));
/* 16:28 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.DARK_OAK.getIndex() - 4));
/* 17:   */   }
/* 18:   */   
/* 19:   */   public Block a(int paramInt)
/* 20:   */   {
/* 21:33 */     Block localbec = instance().a(b, EnumWoodVariant.fromIndex((paramInt & 0x3) + 4));
/* 22:36 */     switch (paramInt & 0xC)
/* 23:   */     {
/* 24:   */     case 0: 
/* 25:38 */       localbec = localbec.a(a, axo.Y);
/* 26:39 */       break;
/* 27:   */     case 4: 
/* 28:41 */       localbec = localbec.a(a, axo.X);
/* 29:42 */       break;
/* 30:   */     case 8: 
/* 31:44 */       localbec = localbec.a(a, axo.Z);
/* 32:45 */       break;
/* 33:   */     default: 
/* 34:47 */       localbec = localbec.a(a, axo.NONE);
/* 35:   */     }
/* 36:51 */     return localbec;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public int c(Block parambec)
/* 40:   */   {
/* 41:56 */     int i = 0;
/* 42:   */     
/* 43:58 */     i |= ((EnumWoodVariant)parambec.getProperty(b)).getIndex() - 4;
/* 44:60 */     switch (ayk.a[((axo)parambec.getProperty(a)).ordinal()])
/* 45:   */     {
/* 46:   */     case 1: 
/* 47:62 */       i |= 0x4;
/* 48:63 */       break;
/* 49:   */     case 2: 
/* 50:65 */       i |= 0x8;
/* 51:66 */       break;
/* 52:   */     case 3: 
/* 53:68 */       i |= 0xC;
/* 54:   */     }
/* 55:72 */     return i;
/* 56:   */   }
/* 57:   */   
/* 58:   */   protected bed e()
/* 59:   */   {
/* 60:77 */     return new bed(this, new IBlockData[] { b, a });
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected ItemStack i(Block parambec)
/* 64:   */   {
/* 65:82 */     return new ItemStack(Item.fromProtoBlock(this), 1, ((EnumWoodVariant)parambec.getProperty(b)).getIndex() - 4);
/* 66:   */   }
/* 67:   */   
/* 68:   */   public int a(Block parambec)
/* 69:   */   {
/* 70:87 */     return ((EnumWoodVariant)parambec.getProperty(b)).getIndex() - 4;
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayi
 * JD-Core Version:    0.7.0.1
 */