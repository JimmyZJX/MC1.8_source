package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bba
/*  5:   */   extends ProtoBlock
/*  6:   */ {
/*  7:17 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("variant", EnumStoneVariants.class);
/*  8:   */   
/*  9:   */   public bba()
/* 10:   */   {
/* 11:20 */     super(Material.rock);
/* 12:21 */     j(this.L.b().a(a, EnumStoneVariants.STONE));
/* 13:22 */     setCreativeTab(CreativeTabs.tabBlock);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 17:   */   {
/* 18:28 */     if (parambec.getProperty(a) == EnumStoneVariants.STONE) {
/* 19:29 */       return Item.fromProtoBlock(BlockList.cobblestone);
/* 20:   */     }
/* 21:31 */     return Item.fromProtoBlock(BlockList.stone);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public int a(Block parambec)
/* 25:   */   {
/* 26:36 */     return ((EnumStoneVariants)parambec.getProperty(a)).a();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 30:   */   {
/* 31:41 */     for (EnumStoneVariants localbbb : EnumStoneVariants.values()) {
/* 32:42 */       paramList.add(new ItemStack(paramalq, 1, localbbb.a()));
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public Block instance(int paramInt)
/* 37:   */   {
/* 38:48 */     return instance().a(a, EnumStoneVariants.a(paramInt));
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int c(Block parambec)
/* 42:   */   {
/* 43:54 */     return ((EnumStoneVariants)parambec.getProperty(a)).a();
/* 44:   */   }
/* 45:   */   
/* 46:   */   protected bed e()
/* 47:   */   {
/* 48:59 */     return new bed(this, new IBlockData[] { a });
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bba
 * JD-Core Version:    0.7.0.1
 */