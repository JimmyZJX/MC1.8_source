package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class bbf
/*   5:    */   extends BlockSlab
/*   6:    */ {
/*   7: 21 */   public static final BlockDataBoolean b = BlockDataBoolean.a("seamless");
/*   8: 22 */   public static final BlockDataEnum M = BlockDataEnum.getInstance("variant", bbg.class);
/*   9:    */   
/*  10:    */   public bbf()
/*  11:    */   {
/*  12: 25 */     super(Material.rock);
/*  13: 26 */     Block localbec = this.L.b();
/*  14: 27 */     if (j()) {
/*  15: 28 */       localbec = localbec.a(b, Boolean.valueOf(false));
/*  16:    */     } else {
/*  17: 30 */       localbec = localbec.a(half, EnumSlabHalf.BOTTOM);
/*  18:    */     }
/*  19: 32 */     j(localbec.a(M, bbg.a));
/*  20: 33 */     setCreativeTab(CreativeTabs.tabBlock);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  24:    */   {
/*  25: 39 */     return Item.fromProtoBlock(BlockList.U);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  29:    */   {
/*  30: 44 */     return Item.fromProtoBlock(BlockList.U);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String b(int paramInt)
/*  34:    */   {
/*  35: 49 */     return super.a() + "." + bbg.a(paramInt).c();
/*  36:    */   }
/*  37:    */   
/*  38:    */   public IBlockData<Enum<?>> l()
/*  39:    */   {
/*  40: 54 */     return M;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Object a(ItemStack paramamj)
/*  44:    */   {
/*  45: 59 */     return bbg.a(paramamj.getDamage2() & 0x7);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/*  49:    */   {
/*  50: 64 */     if (paramalq == Item.fromProtoBlock(BlockList.T)) {
/*  51: 65 */       return;
/*  52:    */     }
/*  53: 68 */     for (bbg localbbg : bbg.values()) {
/*  54: 69 */       if (localbbg != bbg.c) {
/*  55: 72 */         paramList.add(new ItemStack(paramalq, 1, localbbg.a()));
/*  56:    */       }
/*  57:    */     }
/*  58:    */   }
/*  59:    */   
/*  60:    */   public Block a(int paramInt)
/*  61:    */   {
/*  62: 78 */     Block localbec = instance().a(M, bbg.a(paramInt & 0x7));
/*  63: 80 */     if (j()) {
/*  64: 81 */       localbec = localbec.a(b, Boolean.valueOf((paramInt & 0x8) != 0));
/*  65:    */     } else {
/*  66: 83 */       localbec = localbec.a(half, (paramInt & 0x8) == 0 ? EnumSlabHalf.BOTTOM : EnumSlabHalf.TOP);
/*  67:    */     }
/*  68: 86 */     return localbec;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public int c(Block parambec)
/*  72:    */   {
/*  73: 91 */     int i = 0;
/*  74:    */     
/*  75: 93 */     i |= ((bbg)parambec.getProperty(M)).a();
/*  76: 95 */     if (j())
/*  77:    */     {
/*  78: 96 */       if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/*  79: 97 */         i |= 0x8;
/*  80:    */       }
/*  81:    */     }
/*  82:100 */     else if (parambec.getProperty(half) == EnumSlabHalf.TOP) {
/*  83:101 */       i |= 0x8;
/*  84:    */     }
/*  85:105 */     return i;
/*  86:    */   }
/*  87:    */   
/*  88:    */   protected bed e()
/*  89:    */   {
/*  90:110 */     if (j()) {
/*  91:111 */       return new bed(this, new IBlockData[] { b, M });
/*  92:    */     }
/*  93:114 */     return new bed(this, new IBlockData[] { half, M });
/*  94:    */   }
/*  95:    */   
/*  96:    */   public int a(Block parambec)
/*  97:    */   {
/*  98:119 */     return ((bbg)parambec.getProperty(M)).a();
/*  99:    */   }
/* 100:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbf
 * JD-Core Version:    0.7.0.1
 */