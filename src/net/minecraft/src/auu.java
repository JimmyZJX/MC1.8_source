package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class auu
/*   4:    */   extends BlockMushroom
/*   5:    */   implements atz
/*   6:    */ {
/*   7: 18 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("age", 0, 7);
/*   8:    */   
/*   9:    */   protected auu()
/*  10:    */   {
/*  11: 21 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  12: 22 */     a(true);
/*  13: 23 */     float f = 0.5F;
/*  14: 24 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*  15: 25 */     setCreativeTab(null);
/*  16: 26 */     c(0.0F);
/*  17: 27 */     a(h);
/*  18: 28 */     J();
/*  19:    */   }
/*  20:    */   
/*  21:    */   protected boolean c(ProtoBlock paramatr)
/*  22:    */   {
/*  23: 33 */     return paramatr == BlockList.ak;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  27:    */   {
/*  28: 38 */     super.b(paramaqu, paramdt, parambec, paramRandom);
/*  29: 39 */     if (paramaqu.l(paramdt.up()) >= 9)
/*  30:    */     {
/*  31: 40 */       int i = ((Integer)parambec.getProperty(a)).intValue();
/*  32: 41 */       if (i < 7)
/*  33:    */       {
/*  34: 42 */         float f = a(this, paramaqu, paramdt);
/*  35: 44 */         if (paramRandom.nextInt((int)(25.0F / f) + 1) == 0) {
/*  36: 45 */           paramaqu.setBlock(paramdt, parambec.a(a, Integer.valueOf(i + 1)), 2);
/*  37:    */         }
/*  38:    */       }
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void g(World paramaqu, BlockPosition paramdt, Block parambec)
/*  43:    */   {
/*  44: 52 */     int i = ((Integer)parambec.getProperty(a)).intValue() + MathUtils.nextInt(paramaqu.rng, 2, 5);
/*  45: 53 */     if (i > 7) {
/*  46: 54 */       i = 7;
/*  47:    */     }
/*  48: 56 */     paramaqu.setBlock(paramdt, parambec.a(a, Integer.valueOf(i)), 2);
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected static float a(ProtoBlock paramatr, World paramaqu, BlockPosition paramdt)
/*  52:    */   {
/*  53: 60 */     float f1 = 1.0F;
/*  54:    */     
/*  55: 62 */     BlockPosition localdt1 = paramdt.down();
/*  56: 63 */     for (int i = -1; i <= 1; i++) {
/*  57: 64 */       for (int j = -1; j <= 1; j++)
/*  58:    */       {
/*  59: 65 */         float f2 = 0.0F;
/*  60:    */         
/*  61: 67 */         Block localObject = paramaqu.getBlock(localdt1.offset(i, 0, j));
/*  62: 68 */         if (((Block)localObject).getProto() == BlockList.ak)
/*  63:    */         {
/*  64: 69 */           f2 = 1.0F;
/*  65: 70 */           if (((Integer)((Block)localObject).getProperty(BlockFarmLand.a)).intValue() > 0) {
/*  66: 71 */             f2 = 3.0F;
/*  67:    */           }
/*  68:    */         }
/*  69: 75 */         if ((i != 0) || (j != 0)) {
/*  70: 76 */           f2 /= 4.0F;
/*  71:    */         }
/*  72: 79 */         f1 += f2;
/*  73:    */       }
/*  74:    */     }
/*  75: 83 */     BlockPosition localdt2 = paramdt.north();
/*  76: 84 */     BlockPosition localdt3 = paramdt.south();
/*  77: 85 */     BlockPosition localdt4 = paramdt.west();
/*  78: 86 */     Object localObject = paramdt.east();
/*  79:    */     
/*  80: 88 */     int k = (paramatr == paramaqu.getBlock(localdt4).getProto()) || (paramatr == paramaqu.getBlock((BlockPosition)localObject).getProto()) ? 1 : 0;
/*  81: 89 */     int m = (paramatr == paramaqu.getBlock(localdt2).getProto()) || (paramatr == paramaqu.getBlock(localdt3).getProto()) ? 1 : 0;
/*  82: 91 */     if ((k != 0) && (m != 0))
/*  83:    */     {
/*  84: 92 */       f1 /= 2.0F;
/*  85:    */     }
/*  86:    */     else
/*  87:    */     {
/*  88: 95 */       int n = (paramatr == paramaqu.getBlock(localdt4.north()).getProto()) || (paramatr == paramaqu.getBlock(((BlockPosition)localObject).north()).getProto()) || (paramatr == paramaqu.getBlock(((BlockPosition)localObject).south()).getProto()) || (paramatr == paramaqu.getBlock(localdt4.south()).getProto()) ? 1 : 0;
/*  89:100 */       if (n != 0) {
/*  90:101 */         f1 /= 2.0F;
/*  91:    */       }
/*  92:    */     }
/*  93:105 */     return f1;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean f(World paramaqu, BlockPosition paramdt, Block parambec)
/*  97:    */   {
/*  98:110 */     return ((paramaqu.k(paramdt) >= 8) || (paramaqu.hasDaylight(paramdt))) && (c(paramaqu.getBlock(paramdt.down()).getProto()));
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected Item j()
/* 102:    */   {
/* 103:114 */     return ItemList.N;
/* 104:    */   }
/* 105:    */   
/* 106:    */   protected Item l()
/* 107:    */   {
/* 108:118 */     return ItemList.O;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/* 112:    */   {
/* 113:128 */     super.a(paramaqu, paramdt, parambec, paramFloat, 0);
/* 114:130 */     if (paramaqu.isClient) {
/* 115:131 */       return;
/* 116:    */     }
/* 117:134 */     int i = ((Integer)parambec.getProperty(a)).intValue();
/* 118:135 */     if (i >= 7)
/* 119:    */     {
/* 120:137 */       int j = 3 + paramInt;
/* 121:138 */       for (int k = 0; k < j; k++) {
/* 122:139 */         if (paramaqu.rng.nextInt(15) <= i) {
/* 123:142 */           a(paramaqu, paramdt, new ItemStack(j(), 1, 0));
/* 124:    */         }
/* 125:    */       }
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 130:    */   {
/* 131:150 */     if (((Integer)parambec.getProperty(a)).intValue() == 7) {
/* 132:151 */       return l();
/* 133:    */     }
/* 134:154 */     return j();
/* 135:    */   }
/* 136:    */   
/* 137:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 138:    */   {
/* 139:159 */     return j();
/* 140:    */   }
/* 141:    */   
/* 142:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, boolean paramBoolean)
/* 143:    */   {
/* 144:164 */     return ((Integer)parambec.getProperty(a)).intValue() < 7;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public boolean a(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/* 148:    */   {
/* 149:169 */     return true;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void b(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/* 153:    */   {
/* 154:174 */     g(paramaqu, paramdt, parambec);
/* 155:    */   }
/* 156:    */   
/* 157:    */   public Block a(int paramInt)
/* 158:    */   {
/* 159:179 */     return instance().a(a, Integer.valueOf(paramInt));
/* 160:    */   }
/* 161:    */   
/* 162:    */   public int c(Block parambec)
/* 163:    */   {
/* 164:185 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 165:    */   }
/* 166:    */   
/* 167:    */   protected bed e()
/* 168:    */   {
/* 169:190 */     return new bed(this, new IBlockData[] { a });
/* 170:    */   }
/* 171:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     auu
 * JD-Core Version:    0.7.0.1
 */