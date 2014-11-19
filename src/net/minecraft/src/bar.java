package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bar
/*  5:   */   extends awt
/*  6:   */ {
/*  7:20 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("color", EnumDyeColor.class);
/*  8:   */   
/*  9:   */   public bar(Material parambof)
/* 10:   */   {
/* 11:23 */     super(parambof, false);
/* 12:24 */     j(this.L.b().a(a, EnumDyeColor.WHITE));
/* 13:25 */     setCreativeTab(CreativeTabs.tabBlock);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int a(Block parambec)
/* 17:   */   {
/* 18:30 */     return ((EnumDyeColor)parambec.getProperty(a)).a();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 22:   */   {
/* 23:35 */     for (EnumDyeColor localakv : EnumDyeColor.values()) {
/* 24:36 */       paramList.add(new ItemStack(paramalq, 1, localakv.a()));
/* 25:   */     }
/* 26:   */   }
/* 27:   */   
/* 28:   */   public MapColor g(Block parambec)
/* 29:   */   {
/* 30:42 */     return ((EnumDyeColor)parambec.getProperty(a)).e();
/* 31:   */   }
/* 32:   */   
/* 33:   */   public aql k()
/* 34:   */   {
/* 35:47 */     return aql.d;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public int a(Random paramRandom)
/* 39:   */   {
/* 40:52 */     return 0;
/* 41:   */   }
/* 42:   */   
/* 43:   */   protected boolean G()
/* 44:   */   {
/* 45:57 */     return true;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public boolean isOpaqueCube()
/* 49:   */   {
/* 50:62 */     return false;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public Block a(int paramInt)
/* 54:   */   {
/* 55:67 */     return instance().a(a, EnumDyeColor.b(paramInt));
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/* 59:   */   {
/* 60:73 */     if (!paramaqu.isClient) {
/* 61:74 */       BlockBeacon.d(paramaqu, paramdt);
/* 62:   */     }
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 66:   */   {
/* 67:80 */     if (!paramaqu.isClient) {
/* 68:81 */       BlockBeacon.d(paramaqu, paramdt);
/* 69:   */     }
/* 70:   */   }
/* 71:   */   
/* 72:   */   public int c(Block parambec)
/* 73:   */   {
/* 74:87 */     return ((EnumDyeColor)parambec.getProperty(a)).a();
/* 75:   */   }
/* 76:   */   
/* 77:   */   protected bed e()
/* 78:   */   {
/* 79:92 */     return new bed(this, new IBlockData[] { a });
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bar
 * JD-Core Version:    0.7.0.1
 */