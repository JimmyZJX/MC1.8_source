package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class ayg
/*   5:    */   extends BlockLeaves
/*   6:    */ {
/*   7: 20 */   public static final BlockDataEnum P = BlockDataEnum.getInstance("variant", EnumWoodVariant.class, new ayh());
/*   8:    */   
/*   9:    */   public ayg()
/*  10:    */   {
/*  11: 31 */     j(this.L.b().setData(P, EnumWoodVariant.ACACIA).setData(b, Boolean.valueOf(true)).setData(a, Boolean.valueOf(true)));
/*  12:    */   }
/*  13:    */   
/*  14:    */   protected void a(World paramaqu, BlockPosition paramdt, Block parambec, int paramInt)
/*  15:    */   {
/*  16: 36 */     if ((parambec.getData(P) == EnumWoodVariant.DARK_OAK) && (paramaqu.rng.nextInt(paramInt) == 0)) {
/*  17: 37 */       a(paramaqu, paramdt, new ItemStack(ItemList.apple, 1, 0));
/*  18:    */     }
/*  19:    */   }
/*  20:    */   
/*  21:    */   public int a(Block parambec)
/*  22:    */   {
/*  23: 43 */     return ((EnumWoodVariant)parambec.getData(P)).getIndex();
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int j(World paramaqu, BlockPosition paramdt)
/*  27:    */   {
/*  28: 48 */     Block localbec = paramaqu.getBlock(paramdt);
/*  29: 49 */     return localbec.getProto().c(localbec) & 0x3;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/*  33:    */   {
/*  34: 54 */     paramList.add(new ItemStack(paramalq, 1, 0));
/*  35: 55 */     paramList.add(new ItemStack(paramalq, 1, 1));
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected ItemStack i(Block parambec)
/*  39:    */   {
/*  40: 60 */     return new ItemStack(Item.fromProtoBlock(this), 1, ((EnumWoodVariant)parambec.getData(P)).getIndex() - 4);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Block instance(int paramInt)
/*  44:    */   {
/*  45: 65 */     return instance().setData(P, b(paramInt)).setData(a, Boolean.valueOf((paramInt & 0x4) == 0)).setData(b, Boolean.valueOf((paramInt & 0x8) > 0));
/*  46:    */   }
/*  47:    */   
/*  48:    */   public int c(Block parambec)
/*  49:    */   {
/*  50: 73 */     int i = 0;
/*  51:    */     
/*  52: 75 */     i |= ((EnumWoodVariant)parambec.getData(P)).getIndex() - 4;
/*  53: 77 */     if (!((Boolean)parambec.getData(a)).booleanValue()) {
/*  54: 78 */       i |= 0x4;
/*  55:    */     }
/*  56: 81 */     if (((Boolean)parambec.getData(b)).booleanValue()) {
/*  57: 82 */       i |= 0x8;
/*  58:    */     }
/*  59: 85 */     return i;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public EnumWoodVariant b(int paramInt)
/*  63:    */   {
/*  64: 90 */     return EnumWoodVariant.fromIndex((paramInt & 0x3) + 4);
/*  65:    */   }
/*  66:    */   
/*  67:    */   protected bed e()
/*  68:    */   {
/*  69: 95 */     return new bed(this, new IBlockData[] { P, b, a });
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void a(World paramaqu, EntityPlayer paramahd, BlockPosition paramdt, Block parambec, bcm parambcm)
/*  73:    */   {
/*  74:100 */     if ((!paramaqu.isClient) && (paramahd.bY() != null) && (paramahd.bY().getItem() == ItemList.shears))
/*  75:    */     {
/*  76:101 */       paramahd.increaseStat(StatList.H[ProtoBlock.a(this)]);
/*  77:    */       
/*  78:    */ 
/*  79:104 */       a(paramaqu, paramdt, new ItemStack(Item.fromProtoBlock(this), 1, ((EnumWoodVariant)parambec.getData(P)).getIndex() - 4));
/*  80:105 */       return;
/*  81:    */     }
/*  82:108 */     super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/*  83:    */   }
/*  84:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayg
 * JD-Core Version:    0.7.0.1
 */