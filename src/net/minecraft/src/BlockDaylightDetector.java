package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class BlockDaylightDetector
/*   5:    */   extends atg
/*   6:    */ {
/*   7: 27 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("power", 0, 15);
/*   8:    */   private final boolean b;
/*   9:    */   
/*  10:    */   public BlockDaylightDetector(boolean paramBoolean)
/*  11:    */   {
/*  12: 32 */     super(Material.wood);
/*  13: 33 */     this.b = paramBoolean;
/*  14:    */     
/*  15: 35 */     j(this.L.b().setData(a, Integer.valueOf(0)));
/*  16: 36 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
/*  17: 37 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  18:    */     
/*  19: 39 */     c(0.2F);
/*  20: 40 */     a(f);
/*  21: 41 */     setName("daylightDetector");
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  25:    */   {
/*  26: 46 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/*  30:    */   {
/*  31: 51 */     return ((Integer)parambec.getProperty(a)).intValue();
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void d(World paramaqu, BlockPosition paramdt)
/*  35:    */   {
/*  36: 55 */     if (paramaqu.t.o()) {
/*  37: 56 */       return;
/*  38:    */     }
/*  39: 59 */     Block localbec = paramaqu.getBlock(paramdt);
/*  40: 60 */     int i = paramaqu.getLightLevel(EnumSkyBlock.SKY, paramdt) - paramaqu.ab();
/*  41: 61 */     float f1 = paramaqu.d(1.0F);
/*  42:    */     
/*  43:    */ 
/*  44: 64 */     float f2 = f1 < 3.141593F ? 0.0F : 6.283186F;
/*  45: 65 */     f1 += (f2 - f1) * 0.2F;
/*  46:    */     
/*  47: 67 */     i = Math.round(i * MathUtils.cos(f1));
/*  48: 68 */     i = MathUtils.clamp(i, 0, 15);
/*  49: 70 */     if (this.b) {
/*  50: 71 */       i = 15 - i;
/*  51:    */     }
/*  52: 74 */     if (((Integer)localbec.getProperty(a)).intValue() != i) {
/*  53: 75 */       paramaqu.setBlock(paramdt, localbec.setData(a, Integer.valueOf(i)), 3);
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  58:    */   {
/*  59: 81 */     if (paramahd.cm())
/*  60:    */     {
/*  61: 82 */       if (paramaqu.isClient) {
/*  62: 83 */         return true;
/*  63:    */       }
/*  64: 85 */       if (this.b)
/*  65:    */       {
/*  66: 86 */         paramaqu.setBlock(paramdt, BlockList.cl.instance().setData(a, parambec.getProperty(a)), 4);
/*  67: 87 */         BlockList.cl.d(paramaqu, paramdt);
/*  68:    */       }
/*  69:    */       else
/*  70:    */       {
/*  71: 89 */         paramaqu.setBlock(paramdt, BlockList.cm.instance().setData(a, parambec.getProperty(a)), 4);
/*  72: 90 */         BlockList.cm.d(paramaqu, paramdt);
/*  73:    */       }
/*  74: 92 */       return true;
/*  75:    */     }
/*  76: 94 */     return super.a(paramaqu, paramdt, parambec, paramahd, paramej, paramFloat1, paramFloat2, paramFloat3);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  80:    */   {
/*  81:100 */     return Item.fromProtoBlock(BlockList.cl);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  85:    */   {
/*  86:105 */     return Item.fromProtoBlock(BlockList.cl);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public boolean isOpaqueCube()
/*  90:    */   {
/*  91:114 */     return false;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public boolean c()
/*  95:    */   {
/*  96:119 */     return false;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public int b()
/* 100:    */   {
/* 101:124 */     return 3;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean protoBlock_g()
/* 105:    */   {
/* 106:129 */     return true;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public bcm a(World paramaqu, int paramInt)
/* 110:    */   {
/* 111:134 */     return new bcw();
/* 112:    */   }
/* 113:    */   
/* 114:    */   public Block instance(int paramInt)
/* 115:    */   {
/* 116:139 */     return instance().setData(a, Integer.valueOf(paramInt));
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int c(Block parambec)
/* 120:    */   {
/* 121:144 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 122:    */   }
/* 123:    */   
/* 124:    */   protected bed e()
/* 125:    */   {
/* 126:149 */     return new bed(this, new IBlockData[] { a });
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 130:    */   {
/* 131:154 */     if (!this.b) {
/* 132:157 */       super.a(paramalq, paramakf, paramList);
/* 133:    */     }
/* 134:    */   }
/* 135:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     auv
 * JD-Core Version:    0.7.0.1
 */