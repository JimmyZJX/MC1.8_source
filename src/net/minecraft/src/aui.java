package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class aui
/*   5:    */   extends ProtoBlock
/*   6:    */ {
/*   7: 27 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("level", 0, 3);
/*   8:    */   
/*   9:    */   public aui()
/*  10:    */   {
/*  11: 33 */     super(Material.f);
/*  12: 34 */     j(this.L.b().setData(a, Integer.valueOf(0)));
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List<AABB> paramList, Entity paramwv)
/*  16:    */   {
/*  17: 39 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
/*  18: 40 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  19: 41 */     float f = 0.125F;
/*  20: 42 */     a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  21: 43 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  22: 44 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  23: 45 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  24: 46 */     a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  25: 47 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  26: 48 */     a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  27: 49 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  28:    */     
/*  29: 51 */     h();
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void h()
/*  33:    */   {
/*  34: 56 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean c()
/*  38:    */   {
/*  39: 61 */     return false;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean isOpaqueCube()
/*  43:    */   {
/*  44: 66 */     return false;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/*  48:    */   {
/*  49: 71 */     int i = ((Integer)parambec.getData(a)).intValue();
/*  50: 72 */     float f = paramdt.getY() + (6.0F + 3 * i) / 16.0F;
/*  51: 74 */     if ((!paramaqu.isClient) && (paramwv.au()) && (i > 0) && (paramwv.getAABB().minY <= f))
/*  52:    */     {
/*  53: 75 */       paramwv.N();
/*  54:    */       
/*  55: 77 */       a(paramaqu, paramdt, parambec, i - 1);
/*  56:    */     }
/*  57:    */   }
/*  58:    */   
/*  59:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  60:    */   {
/*  61: 83 */     if (paramaqu.isClient) {
/*  62: 84 */       return true;
/*  63:    */     }
/*  64: 87 */     ItemStack localamj = paramahd.bg.h();
/*  65: 88 */     if (localamj == null) {
/*  66: 89 */       return true;
/*  67:    */     }
/*  68: 92 */     int i = ((Integer)parambec.getData(a)).intValue();
/*  69: 93 */     Item localalq = localamj.getItem();
/*  70: 94 */     if (localalq == ItemList.ax)
/*  71:    */     {
/*  72: 95 */       if (i < 3)
/*  73:    */       {
/*  74: 96 */         if (!paramahd.abilities.instabuild) {
/*  75: 97 */           paramahd.bg.a(paramahd.bg.c, new ItemStack(ItemList.aw));
/*  76:    */         }
/*  77:100 */         a(paramaqu, paramdt, parambec, 3);
/*  78:    */       }
/*  79:102 */       return true;
/*  80:    */     }
/*  81:    */     Object localObject;
/*  82:105 */     if (localalq == ItemList.bA)
/*  83:    */     {
/*  84:106 */       if (i > 0)
/*  85:    */       {
/*  86:107 */         if (!paramahd.abilities.instabuild)
/*  87:    */         {
/*  88:108 */           localObject = new ItemStack(ItemList.potion, 1, 0);
/*  89:109 */           if (!paramahd.bg.a((ItemStack)localObject)) {
/*  90:110 */             paramaqu.spawnEntity(new EntityItem(paramaqu, paramdt.getX() + 0.5D, paramdt.getY() + 1.5D, paramdt.getZ() + 0.5D, (ItemStack)localObject));
/*  91:111 */           } else if ((paramahd instanceof qw)) {
/*  92:112 */             ((qw)paramahd).a(paramahd.bh);
/*  93:    */           }
/*  94:115 */           localamj.stackSize -= 1;
/*  95:116 */           if (localamj.stackSize <= 0) {
/*  96:117 */             paramahd.bg.a(paramahd.bg.c, null);
/*  97:    */           }
/*  98:    */         }
/*  99:121 */         a(paramaqu, paramdt, parambec, i - 1);
/* 100:    */       }
/* 101:123 */       return true;
/* 102:    */     }
/* 103:126 */     if ((i > 0) && ((localalq instanceof ItemArmor)))
/* 104:    */     {
/* 105:127 */       localObject = (ItemArmor)localalq;
/* 106:128 */       if ((((ItemArmor)localObject).w_() == EnumArmorMaterial.LEATHER) && (((ItemArmor)localObject).d_(localamj)))
/* 107:    */       {
/* 108:129 */         ((ItemArmor)localObject).c(localamj);
/* 109:130 */         a(paramaqu, paramdt, parambec, i - 1);
/* 110:131 */         return true;
/* 111:    */       }
/* 112:    */     }
/* 113:135 */     if ((i > 0) && ((localalq instanceof ajs)) && 
/* 114:136 */       (bci.c(localamj) > 0))
/* 115:    */     {
/* 116:137 */       localObject = localamj.k();
/* 117:138 */       ((ItemStack)localObject).stackSize = 1;
/* 118:139 */       bci.e((ItemStack)localObject);
/* 119:141 */       if ((localamj.stackSize > 1) || (paramahd.abilities.instabuild))
/* 120:    */       {
/* 121:143 */         if (!paramahd.bg.a((ItemStack)localObject)) {
/* 122:144 */           paramaqu.spawnEntity(new EntityItem(paramaqu, paramdt.getX() + 0.5D, paramdt.getY() + 1.5D, paramdt.getZ() + 0.5D, (ItemStack)localObject));
/* 123:145 */         } else if ((paramahd instanceof qw)) {
/* 124:146 */           ((qw)paramahd).a(paramahd.bh);
/* 125:    */         }
/* 126:148 */         if (!paramahd.abilities.instabuild) {
/* 127:149 */           localamj.stackSize -= 1;
/* 128:    */         }
/* 129:    */       }
/* 130:    */       else
/* 131:    */       {
/* 132:153 */         paramahd.bg.a(paramahd.bg.c, (ItemStack)localObject);
/* 133:    */       }
/* 134:156 */       if (!paramahd.abilities.instabuild) {
/* 135:157 */         a(paramaqu, paramdt, parambec, i - 1);
/* 136:    */       }
/* 137:159 */       return true;
/* 138:    */     }
/* 139:163 */     return false;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, int paramInt)
/* 143:    */   {
/* 144:167 */     paramaqu.setBlock(paramdt, parambec.setData(a, Integer.valueOf(MathUtils.clamp(paramInt, 0, 3))), 2);
/* 145:168 */     paramaqu.e(paramdt, this);
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void k(World paramaqu, BlockPosition paramdt)
/* 149:    */   {
/* 150:173 */     if (paramaqu.rng.nextInt(20) != 1) {
/* 151:174 */       return;
/* 152:    */     }
/* 153:177 */     Block localbec = paramaqu.getBlock(paramdt);
/* 154:178 */     if (((Integer)localbec.getData(a)).intValue() < 3) {
/* 155:179 */       paramaqu.setBlock(paramdt, localbec.a(a), 2);
/* 156:    */     }
/* 157:    */   }
/* 158:    */   
/* 159:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 160:    */   {
/* 161:186 */     return ItemList.bG;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 165:    */   {
/* 166:191 */     return ItemList.bG;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public boolean N()
/* 170:    */   {
/* 171:196 */     return true;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public int l(World paramaqu, BlockPosition paramdt)
/* 175:    */   {
/* 176:201 */     return ((Integer)paramaqu.getBlock(paramdt).getData(a)).intValue();
/* 177:    */   }
/* 178:    */   
/* 179:    */   public Block instance(int paramInt)
/* 180:    */   {
/* 181:206 */     return instance().setData(a, Integer.valueOf(paramInt));
/* 182:    */   }
/* 183:    */   
/* 184:    */   public int c(Block parambec)
/* 185:    */   {
/* 186:212 */     return ((Integer)parambec.getData(a)).intValue();
/* 187:    */   }
/* 188:    */   
/* 189:    */   protected bed e()
/* 190:    */   {
/* 191:217 */     return new bed(this, new IBlockData[] { a });
/* 192:    */   }
/* 193:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aui
 * JD-Core Version:    0.7.0.1
 */