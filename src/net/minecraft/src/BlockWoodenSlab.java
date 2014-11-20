package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class BlockWoodenSlab
/*   5:    */   extends BlockSlab
/*   6:    */ {
/*   7: 19 */   public static final BlockDataEnum b = BlockDataEnum.getInstance("variant", EnumWoodVariant.class);
/*   8:    */   
/*   9:    */   public BlockWoodenSlab()
/*  10:    */   {
/*  11: 22 */     super(Material.wood);
/*  12: 23 */     Block localbec = this.L.b();
/*  13: 24 */     if (!j()) {
/*  14: 25 */       localbec = localbec.a(half, EnumSlabHalf.BOTTOM);
/*  15:    */     }
/*  16: 27 */     j(localbec.a(b, EnumWoodVariant.OAK));
/*  17: 28 */     setCreativeTab(CreativeTabs.tabBlock);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  21:    */   {
/*  22: 34 */     return Item.fromProtoBlock(BlockList.bM);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  26:    */   {
/*  27: 39 */     return Item.fromProtoBlock(BlockList.bM);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String b(int paramInt)
/*  31:    */   {
/*  32: 44 */     return super.a() + "." + EnumWoodVariant.fromIndex(paramInt).c();
/*  33:    */   }
/*  34:    */   
/*  35:    */   public IBlockData<Enum<?>> l()
/*  36:    */   {
/*  37: 49 */     return b;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public Object a(ItemStack paramamj)
/*  41:    */   {
/*  42: 54 */     return EnumWoodVariant.fromIndex(paramamj.getDamage2() & 0x7);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/*  46:    */   {
/*  47: 59 */     if (paramalq == Item.fromProtoBlock(BlockList.bL)) {
/*  48: 60 */       return;
/*  49:    */     }
/*  50: 63 */     for (EnumWoodVariant localayx : EnumWoodVariant.values()) {
/*  51: 64 */       paramList.add(new ItemStack(paramalq, 1, localayx.getIndex()));
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public Block a(int paramInt)
/*  56:    */   {
/*  57: 70 */     Block localbec = instance().a(b, EnumWoodVariant.fromIndex(paramInt & 0x7));
/*  58: 72 */     if (!j()) {
/*  59: 73 */       localbec = localbec.a(half, (paramInt & 0x8) == 0 ? EnumSlabHalf.BOTTOM : EnumSlabHalf.TOP);
/*  60:    */     }
/*  61: 76 */     return localbec;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public int c(Block parambec)
/*  65:    */   {
/*  66: 81 */     int i = 0;
/*  67:    */     
/*  68: 83 */     i |= ((EnumWoodVariant)parambec.getProperty(b)).getIndex();
/*  69: 85 */     if ((!j()) && (parambec.getProperty(half) == EnumSlabHalf.TOP)) {
/*  70: 86 */       i |= 0x8;
/*  71:    */     }
/*  72: 89 */     return i;
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected bed e()
/*  76:    */   {
/*  77: 94 */     if (j()) {
/*  78: 95 */       return new bed(this, new IBlockData[] { b });
/*  79:    */     }
/*  80: 98 */     return new bed(this, new IBlockData[] { half, b });
/*  81:    */   }
/*  82:    */   
/*  83:    */   public int a(Block parambec)
/*  84:    */   {
/*  85:103 */     return ((EnumWoodVariant)parambec.getProperty(b)).getIndex();
/*  86:    */   }
/*  87:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcf
 * JD-Core Version:    0.7.0.1
 */