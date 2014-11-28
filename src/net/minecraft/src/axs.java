package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class axs
/*  5:   */   extends ProtoBlock
/*  6:   */ {
/*  7:20 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("variant", EnumMonsterEggVariants.class);
/*  8:   */   
/*  9:   */   public axs()
/* 10:   */   {
/* 11:23 */     super(Material.B);
/* 12:24 */     j(this.L.b().setData(a, EnumMonsterEggVariants.a));
/* 13:25 */     c(0.0F);
/* 14:26 */     setCreativeTab(CreativeTabs.tabDeco);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int a(Random paramRandom)
/* 18:   */   {
/* 19:31 */     return 0;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public static boolean d(Block parambec)
/* 23:   */   {
/* 24:35 */     ProtoBlock localatr = parambec.getProto();
/* 25:   */     
/* 26:37 */     return (parambec == BlockList.stone.instance().setData(bba.a, EnumStoneVariants.STONE)) || (localatr == BlockList.cobblestone) || (localatr == BlockList.stoneBrick);
/* 27:   */   }
/* 28:   */   
/* 29:   */   protected ItemStack i(Block parambec)
/* 30:   */   {
/* 31:42 */     switch (axt.a[((EnumMonsterEggVariants)parambec.getData(a)).ordinal()])
/* 32:   */     {
/* 33:   */     case 1: 
/* 34:44 */       return new ItemStack(BlockList.cobblestone);
/* 35:   */     case 2: 
/* 36:46 */       return new ItemStack(BlockList.stoneBrick);
/* 37:   */     case 3: 
/* 38:48 */       return new ItemStack(BlockList.stoneBrick, 1, bbd.b.a());
/* 39:   */     case 4: 
/* 40:50 */       return new ItemStack(BlockList.stoneBrick, 1, bbd.c.a());
/* 41:   */     case 5: 
/* 42:52 */       return new ItemStack(BlockList.stoneBrick, 1, bbd.d.a());
/* 43:   */     }
/* 44:54 */     return new ItemStack(BlockList.stone);
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/* 48:   */   {
/* 49:60 */     if ((!paramaqu.isClient) && (paramaqu.getGameRules().getBoolean("doTileDrops")))
/* 50:   */     {
/* 51:61 */       EntitySilverfish localaft = new EntitySilverfish(paramaqu);
/* 52:62 */       localaft.setPositionAndAngles(paramdt.getX() + 0.5D, paramdt.getY(), paramdt.getZ() + 0.5D, 0.0F, 0.0F);
/* 53:63 */       paramaqu.spawnEntity(localaft);
/* 54:   */       
/* 55:65 */       localaft.y();
/* 56:   */     }
/* 57:   */   }
/* 58:   */   
/* 59:   */   public int j(World paramaqu, BlockPosition paramdt)
/* 60:   */   {
/* 61:71 */     Block localbec = paramaqu.getBlock(paramdt);
/* 62:72 */     return localbec.getProto().c(localbec);
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 66:   */   {
/* 67:77 */     for (EnumMonsterEggVariants localaxu : EnumMonsterEggVariants.values()) {
/* 68:78 */       paramList.add(new ItemStack(paramalq, 1, localaxu.a()));
/* 69:   */     }
/* 70:   */   }
/* 71:   */   
/* 72:   */   public Block instance(int paramInt)
/* 73:   */   {
/* 74:84 */     return instance().setData(a, EnumMonsterEggVariants.a(paramInt));
/* 75:   */   }
/* 76:   */   
/* 77:   */   public int c(Block parambec)
/* 78:   */   {
/* 79:90 */     return ((EnumMonsterEggVariants)parambec.getData(a)).a();
/* 80:   */   }
/* 81:   */   
/* 82:   */   protected bed e()
/* 83:   */   {
/* 84:95 */     return new bed(this, new IBlockData[] { a });
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axs
 * JD-Core Version:    0.7.0.1
 */