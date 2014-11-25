package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class ayw
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:15 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("variant", EnumWoodVariant.class);
/*  7:   */   
/*  8:   */   public ayw()
/*  9:   */   {
/* 10:18 */     super(Material.wood);
/* 11:19 */     j(this.L.b().a(a, EnumWoodVariant.OAK));
/* 12:20 */     setCreativeTab(CreativeTabs.tabBlock);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int a(Block parambec)
/* 16:   */   {
/* 17:25 */     return ((EnumWoodVariant)parambec.getProperty(a)).getIndex();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/* 21:   */   {
/* 22:30 */     for (EnumWoodVariant localayx : EnumWoodVariant.values()) {
/* 23:31 */       paramList.add(new ItemStack(paramalq, 1, localayx.getIndex()));
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Block instance(int paramInt)
/* 28:   */   {
/* 29:37 */     return instance().a(a, EnumWoodVariant.fromIndex(paramInt));
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int c(Block parambec)
/* 33:   */   {
/* 34:43 */     return ((EnumWoodVariant)parambec.getProperty(a)).getIndex();
/* 35:   */   }
/* 36:   */   
/* 37:   */   protected bed e()
/* 38:   */   {
/* 39:48 */     return new bed(this, new IBlockData[] { a });
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayw
 * JD-Core Version:    0.7.0.1
 */