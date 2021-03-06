package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class BlockDirt
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:19 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("variant", avd.class);
/*  7:20 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("snowy");
/*  8:   */   
/*  9:   */   protected BlockDirt()
/* 10:   */   {
/* 11:23 */     super(Material.dirt);
/* 12:24 */     j(this.L.b().setData(a, avd.a).setData(b, Boolean.valueOf(false)));
/* 13:25 */     setCreativeTab(CreativeTabs.tabBlock);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/* 17:   */   {
/* 18:30 */     if (parambec.getData(a) == avd.c)
/* 19:   */     {
/* 20:31 */       BlockType localatr = paramard.getBlock(paramdt.up()).getType();
/* 21:32 */       parambec = parambec.setData(b, Boolean.valueOf((localatr == BlockList.aJ) || (localatr == BlockList.aH)));
/* 22:   */     }
/* 23:34 */     return parambec;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/* 27:   */   {
/* 28:39 */     paramList.add(new ItemStack(this, 1, avd.a.a()));
/* 29:40 */     paramList.add(new ItemStack(this, 1, avd.b.a()));
/* 30:41 */     paramList.add(new ItemStack(this, 1, avd.c.a()));
/* 31:   */   }
/* 32:   */   
/* 33:   */   public int j(World paramaqu, BlockPosition paramdt)
/* 34:   */   {
/* 35:46 */     Block localbec = paramaqu.getBlock(paramdt);
/* 36:47 */     if (localbec.getType() != this) {
/* 37:48 */       return 0;
/* 38:   */     }
/* 39:50 */     return ((avd)localbec.getData(a)).a();
/* 40:   */   }
/* 41:   */   
/* 42:   */   public Block instance(int paramInt)
/* 43:   */   {
/* 44:55 */     return instance().setData(a, avd.a(paramInt));
/* 45:   */   }
/* 46:   */   
/* 47:   */   public int c(Block parambec)
/* 48:   */   {
/* 49:61 */     return ((avd)parambec.getData(a)).a();
/* 50:   */   }
/* 51:   */   
/* 52:   */   protected bed e()
/* 53:   */   {
/* 54:66 */     return new bed(this, new IBlockData[] { a, b });
/* 55:   */   }
/* 56:   */   
/* 57:   */   public int a(Block parambec)
/* 58:   */   {
/* 59:71 */     avd localavd = (avd)parambec.getData(a);
/* 60:72 */     if (localavd == avd.c) {
/* 61:73 */       localavd = avd.a;
/* 62:   */     }
/* 63:75 */     return localavd.a();
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avc
 * JD-Core Version:    0.7.0.1
 */