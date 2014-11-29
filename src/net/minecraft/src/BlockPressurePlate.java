package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class BlockPressurePlate
/*   4:    */   extends BlockType
/*   5:    */ {
/*   6:    */   protected BlockPressurePlate(Material parambof)
/*   7:    */   {
/*   8: 20 */     super(parambof);
/*   9: 21 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  10: 22 */     a(true);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  14:    */   {
/*  15: 27 */     d(paramard.getBlock(paramdt));
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected void d(Block parambec)
/*  19:    */   {
/*  20: 31 */     int i = e(parambec) > 0 ? 1 : 0;
/*  21: 32 */     float f = 0.0625F;
/*  22: 34 */     if (i != 0) {
/*  23: 35 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.03125F, 0.9375F);
/*  24:    */     } else {
/*  25: 37 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.0625F, 0.9375F);
/*  26:    */     }
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a(World paramaqu)
/*  30:    */   {
/*  31: 43 */     return 20;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  35:    */   {
/*  36: 49 */     return null;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean c()
/*  40:    */   {
/*  41: 54 */     return false;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean isOpaqueCube()
/*  45:    */   {
/*  46: 59 */     return false;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt)
/*  50:    */   {
/*  51: 64 */     return true;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  55:    */   {
/*  56: 69 */     return m(paramaqu, paramdt.down());
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, BlockType paramatr)
/*  60:    */   {
/*  61: 74 */     if (!m(paramaqu, paramdt.down()))
/*  62:    */     {
/*  63: 75 */       b(paramaqu, paramdt, parambec, 0);
/*  64: 76 */       paramaqu.g(paramdt);
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   private boolean m(World paramaqu, BlockPosition paramdt)
/*  69:    */   {
/*  70: 81 */     return (World.isFlatSurface(paramaqu, paramdt)) || ((paramaqu.getBlock(paramdt).getType() instanceof BlockFence));
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom) {}
/*  74:    */   
/*  75:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  76:    */   {
/*  77: 90 */     if (paramaqu.isClient) {
/*  78: 91 */       return;
/*  79:    */     }
/*  80: 94 */     int i = e(parambec);
/*  81: 95 */     if (i > 0) {
/*  82: 96 */       a(paramaqu, paramdt, parambec, i);
/*  83:    */     }
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/*  87:    */   {
/*  88:102 */     if (paramaqu.isClient) {
/*  89:103 */       return;
/*  90:    */     }
/*  91:106 */     int i = e(parambec);
/*  92:107 */     if (i == 0) {
/*  93:108 */       a(paramaqu, paramdt, parambec, i);
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected void a(World paramaqu, BlockPosition paramdt, Block parambec, int paramInt)
/*  98:    */   {
/*  99:113 */     int i = e(paramaqu, paramdt);
/* 100:114 */     int j = paramInt > 0 ? 1 : 0;
/* 101:115 */     int k = i > 0 ? 1 : 0;
/* 102:117 */     if (paramInt != i)
/* 103:    */     {
/* 104:118 */       parambec = a(parambec, i);
/* 105:119 */       paramaqu.setBlock(paramdt, parambec, 2);
/* 106:120 */       d(paramaqu, paramdt);
/* 107:121 */       paramaqu.b(paramdt, paramdt);
/* 108:    */     }
/* 109:124 */     if ((k == 0) && (j != 0)) {
/* 110:125 */       paramaqu.a(paramdt.getX() + 0.5D, paramdt.getY() + 0.1D, paramdt.getZ() + 0.5D, "random.click", 0.3F, 0.5F);
/* 111:126 */     } else if ((k != 0) && (j == 0)) {
/* 112:127 */       paramaqu.a(paramdt.getX() + 0.5D, paramdt.getY() + 0.1D, paramdt.getZ() + 0.5D, "random.click", 0.3F, 0.6F);
/* 113:    */     }
/* 114:130 */     if (k != 0) {
/* 115:131 */       paramaqu.a(paramdt, this, a(paramaqu));
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   protected AABB a(BlockPosition paramdt)
/* 120:    */   {
/* 121:136 */     float f = 0.125F;
/* 122:137 */     return new AABB(paramdt.getX() + 0.125F, paramdt.getY(), paramdt.getZ() + 0.125F, paramdt.getX() + 1 - 0.125F, paramdt.getY() + 0.25D, paramdt.getZ() + 1 - 0.125F);
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 126:    */   {
/* 127:142 */     if (e(parambec) > 0) {
/* 128:143 */       d(paramaqu, paramdt);
/* 129:    */     }
/* 130:146 */     super.b(paramaqu, paramdt, parambec);
/* 131:    */   }
/* 132:    */   
/* 133:    */   protected void d(World paramaqu, BlockPosition paramdt)
/* 134:    */   {
/* 135:150 */     paramaqu.c(paramdt, this);
/* 136:151 */     paramaqu.c(paramdt.down(), this);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public int getRedStoneSignal(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/* 140:    */   {
/* 141:156 */     return e(parambec);
/* 142:    */   }
/* 143:    */   
/* 144:    */   public int getStrongRedstoneSignal(IBlockAccess paramard, BlockPosition paramdt, Block block, EnumDirection dir)
/* 145:    */   {
/* 146:161 */     if (dir == EnumDirection.UP) {
/* 147:162 */       return e(block);
/* 148:    */     }
/* 149:165 */     return 0;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public boolean blockType_g()
/* 153:    */   {
/* 154:170 */     return true;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void h()
/* 158:    */   {
/* 159:175 */     float f1 = 0.5F;
/* 160:176 */     float f2 = 0.125F;
/* 161:177 */     float f3 = 0.5F;
/* 162:178 */     a(0.0F, 0.375F, 0.0F, 1.0F, 0.625F, 1.0F);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public int i()
/* 166:    */   {
/* 167:183 */     return 1;
/* 168:    */   }
/* 169:    */   
/* 170:    */   protected abstract int e(World paramaqu, BlockPosition paramdt);
/* 171:    */   
/* 172:    */   protected abstract int e(Block parambec);
/* 173:    */   
/* 174:    */   protected abstract Block a(Block parambec, int paramInt);
/* 175:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ath
 * JD-Core Version:    0.7.0.1
 */