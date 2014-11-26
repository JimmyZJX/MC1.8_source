package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class azq
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:15 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("type", azr.class);
/*  7:   */   
/*  8:   */   public azq()
/*  9:   */   {
/* 10:18 */     super(Material.rock);
/* 11:19 */     j(this.L.b().setData(a, azr.a));
/* 12:20 */     setCreativeTab(CreativeTabs.tabBlock);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int a(Block parambec)
/* 16:   */   {
/* 17:25 */     return ((azr)parambec.getProperty(a)).a();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 21:   */   {
/* 22:30 */     for (azr localazr : azr.values()) {
/* 23:31 */       paramList.add(new ItemStack(paramalq, 1, localazr.a()));
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Block instance(int paramInt)
/* 28:   */   {
/* 29:37 */     return instance().setData(a, azr.a(paramInt));
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int c(Block parambec)
/* 33:   */   {
/* 34:43 */     return ((azr)parambec.getProperty(a)).a();
/* 35:   */   }
/* 36:   */   
/* 37:   */   protected bed e()
/* 38:   */   {
/* 39:48 */     return new bed(this, new IBlockData[] { a });
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azq
 * JD-Core Version:    0.7.0.1
 */