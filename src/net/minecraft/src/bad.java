package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bad
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:15 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("type", bae.class);
/*  7:   */   
/*  8:   */   public bad()
/*  9:   */   {
/* 10:18 */     super(Material.rock);
/* 11:19 */     j(this.L.b().a(a, bae.a));
/* 12:20 */     setCreativeTab(CreativeTabs.tabBlock);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int a(Block parambec)
/* 16:   */   {
/* 17:25 */     return ((bae)parambec.getProperty(a)).a();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 21:   */   {
/* 22:30 */     for (bae localbae : bae.values()) {
/* 23:31 */       paramList.add(new ItemStack(paramalq, 1, localbae.a()));
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Block a(int paramInt)
/* 28:   */   {
/* 29:37 */     return instance().a(a, bae.a(paramInt));
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int c(Block parambec)
/* 33:   */   {
/* 34:43 */     return ((bae)parambec.getProperty(a)).a();
/* 35:   */   }
/* 36:   */   
/* 37:   */   protected bed e()
/* 38:   */   {
/* 39:48 */     return new bed(this, new IBlockData[] { a });
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bad
 * JD-Core Version:    0.7.0.1
 */