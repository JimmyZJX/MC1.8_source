package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bcg
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 19 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("color", EnumDyeColor.class);
/*   7:    */   
/*   8:    */   protected bcg()
/*   9:    */   {
/*  10: 22 */     super(Material.r);
/*  11: 23 */     j(this.L.b().setData(a, EnumDyeColor.WHITE));
/*  12: 24 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*  13: 25 */     a(true);
/*  14: 26 */     setCreativeTab(CreativeTabs.tabDeco);
/*  15: 27 */     b(0);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean c()
/*  19:    */   {
/*  20: 32 */     return false;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean isOpaqueCube()
/*  24:    */   {
/*  25: 37 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void h()
/*  29:    */   {
/*  30: 42 */     b(0);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  34:    */   {
/*  35: 47 */     b(0);
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected void b(int paramInt)
/*  39:    */   {
/*  40: 51 */     int i = 0;
/*  41: 52 */     float f = 1 * (1 + i) / 16.0F;
/*  42: 53 */     a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  46:    */   {
/*  47: 58 */     return (super.c(paramaqu, paramdt)) && (d(paramaqu, paramdt));
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  51:    */   {
/*  52: 63 */     e(paramaqu, paramdt, parambec);
/*  53:    */   }
/*  54:    */   
/*  55:    */   private boolean e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  56:    */   {
/*  57: 67 */     if (!d(paramaqu, paramdt))
/*  58:    */     {
/*  59: 68 */       b(paramaqu, paramdt, parambec, 0);
/*  60: 69 */       paramaqu.g(paramdt);
/*  61: 70 */       return false;
/*  62:    */     }
/*  63: 72 */     return true;
/*  64:    */   }
/*  65:    */   
/*  66:    */   private boolean d(World paramaqu, BlockPosition paramdt)
/*  67:    */   {
/*  68: 76 */     return !paramaqu.isEmpty(paramdt.down());
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/*  72:    */   {
/*  73: 81 */     if (paramej == EnumDirection.UP) {
/*  74: 82 */       return true;
/*  75:    */     }
/*  76: 84 */     return super.a(paramard, paramdt, paramej);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public int a(Block parambec)
/*  80:    */   {
/*  81: 89 */     return ((EnumDyeColor)parambec.getData(a)).a();
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/*  85:    */   {
/*  86: 94 */     for (int i = 0; i < 16; i++) {
/*  87: 95 */       paramList.add(new ItemStack(paramalq, 1, i));
/*  88:    */     }
/*  89:    */   }
/*  90:    */   
/*  91:    */   public Block instance(int paramInt)
/*  92:    */   {
/*  93:101 */     return instance().setData(a, EnumDyeColor.b(paramInt));
/*  94:    */   }
/*  95:    */   
/*  96:    */   public int c(Block parambec)
/*  97:    */   {
/*  98:107 */     return ((EnumDyeColor)parambec.getData(a)).a();
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected bed e()
/* 102:    */   {
/* 103:112 */     return new bed(this, new IBlockData[] { a });
/* 104:    */   }
/* 105:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcg
 * JD-Core Version:    0.7.0.1
 */