package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class baf
/*   5:    */   extends BlockMushroom
/*   6:    */   implements atz
/*   7:    */ {
/*   8: 18 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("type", EnumWoodVariant.class);
/*   9: 19 */   public static final BlockDataInteger b = BlockDataInteger.getInstance("stage", 0, 1);
/*  10:    */   
/*  11:    */   protected baf()
/*  12:    */   {
/*  13: 24 */     j(this.L.b().a(a, EnumWoodVariant.OAK).a(b, Integer.valueOf(0)));
/*  14: 25 */     float f = 0.4F;
/*  15: 26 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*  16: 27 */     setCreativeTab(CreativeTabs.tabDeco);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  20:    */   {
/*  21: 32 */     if (paramaqu.isClient) {
/*  22: 33 */       return;
/*  23:    */     }
/*  24: 36 */     super.b(paramaqu, paramdt, parambec, paramRandom);
/*  25: 38 */     if ((paramaqu.l(paramdt.up()) >= 9) && 
/*  26: 39 */       (paramRandom.nextInt(7) == 0)) {
/*  27: 40 */       d(paramaqu, paramdt, parambec, paramRandom);
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void d(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  32:    */   {
/*  33: 46 */     if (((Integer)parambec.getProperty(b)).intValue() == 0) {
/*  34: 47 */       paramaqu.setBlock(paramdt, parambec.a(b), 4);
/*  35:    */     } else {
/*  36: 49 */       e(paramaqu, paramdt, parambec, paramRandom);
/*  37:    */     }
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void e(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  41:    */   {
/*  42: 54 */     Object localObject = paramRandom.nextInt(10) == 0 ? new bhd(true) : new bir(true);
/*  43:    */     
/*  44: 56 */     int i = 0;
/*  45: 57 */     int j = 0;
/*  46: 58 */     int k = 0;
/*  47: 60 */     switch (bag.a[((EnumWoodVariant)parambec.getProperty(a)).ordinal()])
/*  48:    */     {
/*  49:    */     case 1: 
/*  50: 63 */       for (i = 0; i >= -1; i--) {
/*  51: 64 */         for (j = 0; j >= -1; j--) {
/*  52: 65 */           if ((a(paramaqu, paramdt.offset(i, 0, j), EnumWoodVariant.SPRUCE)) && (a(paramaqu, paramdt.offset(i + 1, 0, j), EnumWoodVariant.SPRUCE)) && (a(paramaqu, paramdt.offset(i, 0, j + 1), EnumWoodVariant.SPRUCE)) && (a(paramaqu, paramdt.offset(i + 1, 0, j + 1), EnumWoodVariant.SPRUCE)))
/*  53:    */           {
/*  54: 66 */             localObject = new bib(false, paramRandom.nextBoolean());
/*  55: 67 */             k = 1;
/*  56:    */             break label235;
/*  57:    */           }
/*  58:    */         }
/*  59:    */       }
/*  60: 74 */       if (k == 0)
/*  61:    */       {
/*  62: 75 */         i = j = 0;
/*  63: 76 */         localObject = new bio(true);
/*  64:    */       }
/*  65:    */       break;
/*  66:    */     case 2: 
/*  67: 81 */       localObject = new bhf(true, false);
/*  68: 82 */       break;
/*  69:    */     case 3: 
/*  70: 85 */       for (i = 0; i >= -1; i--) {
/*  71: 86 */         for (j = 0; j >= -1; j--) {
/*  72: 87 */           if ((a(paramaqu, paramdt.offset(i, 0, j), EnumWoodVariant.JUNGLE)) && (a(paramaqu, paramdt.offset(i + 1, 0, j), EnumWoodVariant.JUNGLE)) && (a(paramaqu, paramdt.offset(i, 0, j + 1), EnumWoodVariant.JUNGLE)) && (a(paramaqu, paramdt.offset(i + 1, 0, j + 1), EnumWoodVariant.JUNGLE)))
/*  73:    */           {
/*  74: 88 */             localObject = new bia(true, 10, 20, EnumWoodVariant.JUNGLE.getIndex(), EnumWoodVariant.JUNGLE.getIndex());
/*  75: 89 */             k = 1;
/*  76:    */             break label423;
/*  77:    */           }
/*  78:    */         }
/*  79:    */       }
/*  80: 96 */       if (k == 0)
/*  81:    */       {
/*  82: 97 */         i = j = 0;
/*  83: 98 */         localObject = new bir(true, 4 + paramRandom.nextInt(7), EnumWoodVariant.JUNGLE.getIndex(), EnumWoodVariant.JUNGLE.getIndex(), false);
/*  84:    */       }
/*  85:    */       break;
/*  86:    */     case 4: 
/*  87:103 */       localObject = new bil(true);
/*  88:    */       
/*  89:105 */       break;
/*  90:    */     case 5: 
/*  91:    */       label235:
/*  92:108 */       for (i = 0; i >= -1; i--) {
/*  93:109 */         for (j = 0; j >= -1; j--) {
/*  94:110 */           if ((a(paramaqu, paramdt.offset(i, 0, j), EnumWoodVariant.DARK_OAK)) && (a(paramaqu, paramdt.offset(i + 1, 0, j), EnumWoodVariant.DARK_OAK)) && (a(paramaqu, paramdt.offset(i, 0, j + 1), EnumWoodVariant.DARK_OAK)) && (a(paramaqu, paramdt.offset(i + 1, 0, j + 1), EnumWoodVariant.DARK_OAK)))
/*  95:    */           {
/*  96:111 */             localObject = new DarkOakGenerator(true);
/*  97:112 */             k = 1;
/*  98:    */             break label616;
/*  99:    */           }
/* 100:    */         }
/* 101:    */       }
/* 102:    */       label423:
/* 103:    */       label616:
/* 104:119 */       if (k == 0) {
/* 105:120 */         return;
/* 106:    */       }
/* 107:    */       break;
/* 108:    */     }
/* 109:129 */     Block localbec = BlockList.air.instance();
/* 110:130 */     if (k != 0)
/* 111:    */     {
/* 112:131 */       paramaqu.setBlock(paramdt.offset(i, 0, j), localbec, 4);
/* 113:132 */       paramaqu.setBlock(paramdt.offset(i + 1, 0, j), localbec, 4);
/* 114:133 */       paramaqu.setBlock(paramdt.offset(i, 0, j + 1), localbec, 4);
/* 115:134 */       paramaqu.setBlock(paramdt.offset(i + 1, 0, j + 1), localbec, 4);
/* 116:    */     }
/* 117:    */     else
/* 118:    */     {
/* 119:136 */       paramaqu.setBlock(paramdt, localbec, 4);
/* 120:    */     }
/* 121:139 */     if (!((TerrainGenerator)localObject).generate(paramaqu, paramRandom, paramdt.offset(i, 0, j))) {
/* 122:140 */       if (k != 0)
/* 123:    */       {
/* 124:141 */         paramaqu.setBlock(paramdt.offset(i, 0, j), parambec, 4);
/* 125:142 */         paramaqu.setBlock(paramdt.offset(i + 1, 0, j), parambec, 4);
/* 126:143 */         paramaqu.setBlock(paramdt.offset(i, 0, j + 1), parambec, 4);
/* 127:144 */         paramaqu.setBlock(paramdt.offset(i + 1, 0, j + 1), parambec, 4);
/* 128:    */       }
/* 129:    */       else
/* 130:    */       {
/* 131:146 */         paramaqu.setBlock(paramdt, parambec, 4);
/* 132:    */       }
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   public boolean a(World paramaqu, BlockPosition paramdt, EnumWoodVariant paramayx)
/* 137:    */   {
/* 138:152 */     Block localbec = paramaqu.getBlock(paramdt);
/* 139:153 */     return (localbec.getProto() == this) && (localbec.getProperty(a) == paramayx);
/* 140:    */   }
/* 141:    */   
/* 142:    */   public int a(Block parambec)
/* 143:    */   {
/* 144:158 */     return ((EnumWoodVariant)parambec.getProperty(a)).getIndex();
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 148:    */   {
/* 149:163 */     for (EnumWoodVariant localayx : EnumWoodVariant.values()) {
/* 150:164 */       paramList.add(new ItemStack(paramalq, 1, localayx.getIndex()));
/* 151:    */     }
/* 152:    */   }
/* 153:    */   
/* 154:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, boolean paramBoolean)
/* 155:    */   {
/* 156:170 */     return true;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public boolean a(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/* 160:    */   {
/* 161:175 */     return paramaqu.rng.nextFloat() < 0.45D;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void b(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/* 165:    */   {
/* 166:180 */     d(paramaqu, paramdt, parambec, paramRandom);
/* 167:    */   }
/* 168:    */   
/* 169:    */   public Block a(int paramInt)
/* 170:    */   {
/* 171:185 */     return instance().a(a, EnumWoodVariant.fromIndex(paramInt & 0x7)).a(b, Integer.valueOf((paramInt & 0x8) >> 3));
/* 172:    */   }
/* 173:    */   
/* 174:    */   public int c(Block parambec)
/* 175:    */   {
/* 176:192 */     int i = 0;
/* 177:    */     
/* 178:194 */     i |= ((EnumWoodVariant)parambec.getProperty(a)).getIndex();
/* 179:195 */     i |= ((Integer)parambec.getProperty(b)).intValue() << 3;
/* 180:    */     
/* 181:197 */     return i;
/* 182:    */   }
/* 183:    */   
/* 184:    */   protected bed e()
/* 185:    */   {
/* 186:202 */     return new bed(this, new IBlockData[] { a, b });
/* 187:    */   }
/* 188:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     baf
 * JD-Core Version:    0.7.0.1
 */