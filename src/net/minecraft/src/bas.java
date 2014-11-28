package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bas
/*  4:   */   extends bbj
/*  5:   */ {
/*  6:18 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("color", EnumDyeColor.class);
/*  7:   */   
/*  8:   */   public bas()
/*  9:   */   {
/* 10:21 */     super(Material.s, false);
/* 11:22 */     j(this.L.b().setData(b, Boolean.valueOf(false)).setData(M, Boolean.valueOf(false)).setData(N, Boolean.valueOf(false)).setData(O, Boolean.valueOf(false)).setData(a, EnumDyeColor.WHITE));
/* 12:23 */     setCreativeTab(CreativeTabs.tabDeco);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int a(Block parambec)
/* 16:   */   {
/* 17:28 */     return ((EnumDyeColor)parambec.getData(a)).a();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/* 21:   */   {
/* 22:33 */     for (int i = 0; i < EnumDyeColor.values().length; i++) {
/* 23:34 */       paramList.add(new ItemStack(paramalq, 1, i));
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public aql k()
/* 28:   */   {
/* 29:40 */     return aql.d;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public Block instance(int paramInt)
/* 33:   */   {
/* 34:45 */     return instance().setData(a, EnumDyeColor.b(paramInt));
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int c(Block parambec)
/* 38:   */   {
/* 39:51 */     return ((EnumDyeColor)parambec.getData(a)).a();
/* 40:   */   }
/* 41:   */   
/* 42:   */   protected bed e()
/* 43:   */   {
/* 44:56 */     return new bed(this, new IBlockData[] { b, M, O, N, a });
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/* 48:   */   {
/* 49:61 */     if (!paramaqu.isClient) {
/* 50:62 */       BlockBeacon.d(paramaqu, paramdt);
/* 51:   */     }
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 55:   */   {
/* 56:68 */     if (!paramaqu.isClient) {
/* 57:69 */       BlockBeacon.d(paramaqu, paramdt);
/* 58:   */     }
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bas
 * JD-Core Version:    0.7.0.1
 */