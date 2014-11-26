package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bay
/*   5:    */   extends BlockMushroom
/*   6:    */   implements atz
/*   7:    */ {
/*   8: 23 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("age", 0, 7);
/*   9: 24 */   public static final BlockDataDirection b = BlockDataDirection.getInstance("facing", new baz());
/*  10:    */   private final ProtoBlock M;
/*  11:    */   
/*  12:    */   protected bay(ProtoBlock paramatr)
/*  13:    */   {
/*  14: 34 */     j(this.L.b().setData(a, Integer.valueOf(0)).setData(b, EnumDirection.UP));
/*  15: 35 */     this.M = paramatr;
/*  16: 36 */     a(true);
/*  17: 37 */     float f = 0.125F;
/*  18: 38 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*  19: 39 */     setCreativeTab(null);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  23:    */   {
/*  24: 44 */     parambec = parambec.setData(b, EnumDirection.UP);
/*  25: 45 */     for (EnumDirection localej : en.HORIZONTAL) {
/*  26: 46 */       if (paramard.getBlock(paramdt.offset(localej)).getProto() == this.M)
/*  27:    */       {
/*  28: 47 */         parambec = parambec.setData(b, localej);
/*  29: 48 */         break;
/*  30:    */       }
/*  31:    */     }
/*  32: 51 */     return parambec;
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected boolean c(ProtoBlock paramatr)
/*  36:    */   {
/*  37: 56 */     return paramatr == BlockList.ak;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  41:    */   {
/*  42: 61 */     super.b(paramaqu, paramdt, parambec, paramRandom);
/*  43: 62 */     if (paramaqu.l(paramdt.up()) < 9) {
/*  44: 63 */       return;
/*  45:    */     }
/*  46: 66 */     float f = auu.a(this, paramaqu, paramdt);
/*  47: 67 */     if (paramRandom.nextInt((int)(25.0F / f) + 1) == 0)
/*  48:    */     {
/*  49: 68 */       int i = ((Integer)parambec.getProperty(a)).intValue();
/*  50: 69 */       if (i < 7)
/*  51:    */       {
/*  52: 70 */         parambec = parambec.setData(a, Integer.valueOf(i + 1));
/*  53: 71 */         paramaqu.setBlock(paramdt, parambec, 2);
/*  54:    */       }
/*  55:    */       else
/*  56:    */       {
/*  57: 73 */         for (Iterator<EnumDirection> localObject = en.HORIZONTAL.iterator(); localObject.hasNext();)
/*  58:    */         {
/*  59: 73 */           EnumDirection localej = localObject.next();
/*  60: 74 */           if (paramaqu.getBlock(paramdt.offset(localej)).getProto() == this.M) {
/*  61: 75 */             return;
/*  62:    */           }
/*  63:    */         }
/*  64: 79 */         paramdt = paramdt.offset(en.HORIZONTAL.getRandomDirection(paramRandom));
/*  65:    */         
/*  66: 81 */         ProtoBlock localObject = paramaqu.getBlock(paramdt.down()).getProto();
/*  67: 82 */         if ((paramaqu.getBlock(paramdt).getProto().material == Material.air) && ((localObject == BlockList.ak) || (localObject == BlockList.dirt) || (localObject == BlockList.grass))) {
/*  68: 83 */           paramaqu.setBlock(paramdt, this.M.instance());
/*  69:    */         }
/*  70:    */       }
/*  71:    */     }
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void g(World paramaqu, BlockPosition paramdt, Block parambec)
/*  75:    */   {
/*  76: 90 */     int i = ((Integer)parambec.getProperty(a)).intValue() + MathUtils.nextInt(paramaqu.rng, 2, 5);
/*  77: 91 */     paramaqu.setBlock(paramdt, parambec.setData(a, Integer.valueOf(Math.min(7, i))), 2);
/*  78:    */   }
/*  79:    */   
/*  80:    */   public int h(Block parambec)
/*  81:    */   {
/*  82: 96 */     if (parambec.getProto() != this) {
/*  83: 97 */       return super.h(parambec);
/*  84:    */     }
/*  85:100 */     int i = ((Integer)parambec.getProperty(a)).intValue();
/*  86:101 */     int j = i * 32;
/*  87:102 */     int k = 255 - i * 8;
/*  88:103 */     int m = i * 4;
/*  89:104 */     return j << 16 | k << 8 | m;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, int paramInt)
/*  93:    */   {
/*  94:109 */     return h(paramard.getBlock(paramdt));
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void h()
/*  98:    */   {
/*  99:114 */     float f = 0.125F;
/* 100:115 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/* 104:    */   {
/* 105:120 */     this.F = ((((Integer)paramard.getBlock(paramdt).getProperty(a)).intValue() * 2 + 2) / 16.0F);
/* 106:121 */     float f = 0.125F;
/* 107:122 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, (float)this.F, 0.5F + f);
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/* 111:    */   {
/* 112:130 */     super.a(paramaqu, paramdt, parambec, paramFloat, paramInt);
/* 113:132 */     if (paramaqu.isClient) {
/* 114:133 */       return;
/* 115:    */     }
/* 116:136 */     Item localalq = j();
/* 117:137 */     if (localalq == null) {
/* 118:138 */       return;
/* 119:    */     }
/* 120:141 */     int i = ((Integer)parambec.getProperty(a)).intValue();
/* 121:142 */     for (int j = 0; j < 3; j++) {
/* 122:143 */       if (paramaqu.rng.nextInt(15) <= i) {
/* 123:146 */         a(paramaqu, paramdt, new ItemStack(localalq));
/* 124:    */       }
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   protected Item j()
/* 129:    */   {
/* 130:152 */     if (this.M == BlockList.pumpkin) {
/* 131:153 */       return ItemList.bg;
/* 132:    */     }
/* 133:156 */     if (this.M == BlockList.bk) {
/* 134:157 */       return ItemList.bh;
/* 135:    */     }
/* 136:160 */     return null;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 140:    */   {
/* 141:166 */     return null;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 145:    */   {
/* 146:171 */     Item localalq = j();
/* 147:    */     
/* 148:173 */     return localalq != null ? localalq : null;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, boolean paramBoolean)
/* 152:    */   {
/* 153:178 */     return ((Integer)parambec.getProperty(a)).intValue() != 7;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public boolean a(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/* 157:    */   {
/* 158:183 */     return true;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void b(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/* 162:    */   {
/* 163:188 */     g(paramaqu, paramdt, parambec);
/* 164:    */   }
/* 165:    */   
/* 166:    */   public Block instance(int paramInt)
/* 167:    */   {
/* 168:193 */     return instance().setData(a, Integer.valueOf(paramInt));
/* 169:    */   }
/* 170:    */   
/* 171:    */   public int c(Block parambec)
/* 172:    */   {
/* 173:199 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 174:    */   }
/* 175:    */   
/* 176:    */   protected bed e()
/* 177:    */   {
/* 178:204 */     return new bed(this, new IBlockData[] { a, b });
/* 179:    */   }
/* 180:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bay
 * JD-Core Version:    0.7.0.1
 */