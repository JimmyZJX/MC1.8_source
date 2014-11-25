package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class ayl
/*   5:    */   extends BlockSlab
/*   6:    */ {
/*   7: 21 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("seamless");
/*   8: 22 */   public static final BlockDataEnum M = BlockDataEnum.getInstance("variant", aym.class);
/*   9:    */   
/*  10:    */   public ayl()
/*  11:    */   {
/*  12: 25 */     super(Material.rock);
/*  13: 26 */     Block localbec = this.L.b();
/*  14: 27 */     if (j()) {
/*  15: 28 */       localbec = localbec.a(b, Boolean.valueOf(false));
/*  16:    */     } else {
/*  17: 30 */       localbec = localbec.a(half, EnumSlabHalf.BOTTOM);
/*  18:    */     }
/*  19: 32 */     j(localbec.a(M, aym.a));
/*  20: 33 */     setCreativeTab(CreativeTabs.tabBlock);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  24:    */   {
/*  25: 39 */     return Item.fromProtoBlock(BlockList.cP);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  29:    */   {
/*  30: 44 */     return Item.fromProtoBlock(BlockList.cP);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String b(int paramInt)
/*  34:    */   {
/*  35: 49 */     return super.a() + "." + aym.a(paramInt).c();
/*  36:    */   }
/*  37:    */   
/*  38:    */   public IBlockData l()
/*  39:    */   {
/*  40: 54 */     return M;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Object a(ItemStack paramamj)
/*  44:    */   {
/*  45: 59 */     return aym.a(paramamj.getDamage2() & 0x7);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/*  49:    */   {
/*  50: 64 */     if (paramalq == Item.fromProtoBlock(BlockList.cO)) {
/*  51: 65 */       return;
/*  52:    */     }
/*  53: 68 */     for (aym localaym : aym.values()) {
/*  54: 69 */       paramList.add(new ItemStack(paramalq, 1, localaym.a()));
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Block instance(int paramInt)
/*  59:    */   {
/*  60: 75 */     Block localbec = instance().a(M, aym.a(paramInt & 0x7));
/*  61: 77 */     if (j()) {
/*  62: 78 */       localbec = localbec.a(b, Boolean.valueOf((paramInt & 0x8) != 0));
/*  63:    */     } else {
/*  64: 80 */       localbec = localbec.a(half, (paramInt & 0x8) == 0 ? EnumSlabHalf.BOTTOM : EnumSlabHalf.TOP);
/*  65:    */     }
/*  66: 83 */     return localbec;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public int c(Block parambec)
/*  70:    */   {
/*  71: 88 */     int i = 0;
/*  72:    */     
/*  73: 90 */     i |= ((aym)parambec.getProperty(M)).a();
/*  74: 92 */     if (j())
/*  75:    */     {
/*  76: 93 */       if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/*  77: 94 */         i |= 0x8;
/*  78:    */       }
/*  79:    */     }
/*  80: 97 */     else if (parambec.getProperty(half) == EnumSlabHalf.TOP) {
/*  81: 98 */       i |= 0x8;
/*  82:    */     }
/*  83:102 */     return i;
/*  84:    */   }
/*  85:    */   
/*  86:    */   protected bed e()
/*  87:    */   {
/*  88:107 */     if (j()) {
/*  89:108 */       return new bed(this, new IBlockData[] { b, M });
/*  90:    */     }
/*  91:111 */     return new bed(this, new IBlockData[] { half, M });
/*  92:    */   }
/*  93:    */   
/*  94:    */   public int a(Block parambec)
/*  95:    */   {
/*  96:116 */     return ((aym)parambec.getProperty(M)).a();
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayl
 * JD-Core Version:    0.7.0.1
 */