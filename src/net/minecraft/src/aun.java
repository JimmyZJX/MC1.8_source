package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class aun
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:16 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("color", EnumDyeColor.class);
/*  7:   */   
/*  8:   */   public aun(Material parambof)
/*  9:   */   {
/* 10:19 */     super(parambof);
/* 11:20 */     j(this.L.b().setData(a, EnumDyeColor.WHITE));
/* 12:21 */     setCreativeTab(CreativeTabs.tabBlock);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int a(Block parambec)
/* 16:   */   {
/* 17:26 */     return ((EnumDyeColor)parambec.getData(a)).a();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 21:   */   {
/* 22:31 */     for (EnumDyeColor localakv : EnumDyeColor.values()) {
/* 23:32 */       paramList.add(new ItemStack(paramalq, 1, localakv.a()));
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public MapColor g(Block parambec)
/* 28:   */   {
/* 29:38 */     return ((EnumDyeColor)parambec.getData(a)).e();
/* 30:   */   }
/* 31:   */   
/* 32:   */   public Block instance(int paramInt)
/* 33:   */   {
/* 34:43 */     return instance().setData(a, EnumDyeColor.b(paramInt));
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int c(Block parambec)
/* 38:   */   {
/* 39:49 */     return ((EnumDyeColor)parambec.getData(a)).a();
/* 40:   */   }
/* 41:   */   
/* 42:   */   protected bed e()
/* 43:   */   {
/* 44:54 */     return new bed(this, new IBlockData[] { a });
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aun
 * JD-Core Version:    0.7.0.1
 */