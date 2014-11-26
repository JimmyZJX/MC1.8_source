package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class atp
/*   4:    */   extends avb
/*   5:    */ {
/*   6: 25 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("part", atq.class);
/*   7: 26 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("occupied");
/*   8:    */   
/*   9:    */   public atp()
/*  10:    */   {
/*  11: 29 */     super(Material.n);
/*  12: 30 */     j(this.L.b().setData(a, atq.FOOT).setData(b, Boolean.valueOf(false)));
/*  13: 31 */     j();
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  17:    */   {
/*  18: 36 */     if (paramaqu.isClient) {
/*  19: 37 */       return true;
/*  20:    */     }
/*  21: 40 */     if (parambec.getProperty(a) != atq.HEAD)
/*  22:    */     {
/*  23: 42 */       paramdt = paramdt.offset((EnumDirection)parambec.getProperty(N));
/*  24: 43 */       parambec = paramaqu.getBlock(paramdt);
/*  25: 44 */       if (parambec.getProto() != this) {
/*  26: 45 */         return true;
/*  27:    */       }
/*  28:    */     }
/*  29: 49 */     if ((!paramaqu.t.e()) || (paramaqu.b(paramdt) == arm.x))
/*  30:    */     {
/*  31: 51 */       paramaqu.g(paramdt);
/*  32:    */       
/*  33:    */ 
/*  34: 54 */       BlockPosition localObject = paramdt.offset(((EnumDirection)parambec.getProperty(N)).d());
/*  35: 55 */       if (paramaqu.getBlock((BlockPosition)localObject).getProto() == this) {
/*  36: 56 */         paramaqu.g((BlockPosition)localObject);
/*  37:    */       }
/*  38: 59 */       paramaqu.a(null, paramdt.getX() + 0.5D, paramdt.getY() + 0.5D, paramdt.getZ() + 0.5D, 5.0F, true, true);
/*  39: 60 */       return true;
/*  40:    */     }
/*  41: 63 */     if (((Boolean)parambec.getProperty(b)).booleanValue())
/*  42:    */     {
/*  43: 64 */       EntityPlayer localObject = e(paramaqu, paramdt);
/*  44: 65 */       if (localObject == null)
/*  45:    */       {
/*  46: 66 */         parambec = parambec.setData(b, Boolean.valueOf(false));
/*  47: 67 */         paramaqu.setBlock(paramdt, parambec, 4);
/*  48:    */       }
/*  49:    */       else
/*  50:    */       {
/*  51: 69 */         paramahd.b(new hz("tile.bed.occupied", new Object[0]));
/*  52: 70 */         return true;
/*  53:    */       }
/*  54:    */     }
/*  55: 74 */     Object localObject = paramahd.a(paramdt);
/*  56: 75 */     if (localObject == ahf.a)
/*  57:    */     {
/*  58: 76 */       parambec = parambec.setData(b, Boolean.valueOf(true));
/*  59: 77 */       paramaqu.setBlock(paramdt, parambec, 4);
/*  60: 78 */       return true;
/*  61:    */     }
/*  62: 81 */     if (localObject == ahf.c) {
/*  63: 82 */       paramahd.b(new hz("tile.bed.noSleep", new Object[0]));
/*  64: 83 */     } else if (localObject == ahf.f) {
/*  65: 84 */       paramahd.b(new hz("tile.bed.notSafe", new Object[0]));
/*  66:    */     }
/*  67: 86 */     return true;
/*  68:    */   }
/*  69:    */   
/*  70:    */   private EntityPlayer e(World paramaqu, BlockPosition paramdt)
/*  71:    */   {
/*  72: 91 */     for (EntityPlayer localahd : paramaqu.playerList) {
/*  73: 92 */       if ((localahd.bI()) && (localahd.bv.equals(paramdt))) {
/*  74: 93 */         return localahd;
/*  75:    */       }
/*  76:    */     }
/*  77: 97 */     return null;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean isOpaqueCube()
/*  81:    */   {
/*  82:102 */     return false;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public boolean c()
/*  86:    */   {
/*  87:107 */     return false;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  91:    */   {
/*  92:112 */     j();
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  96:    */   {
/*  97:117 */     EnumDirection localej = (EnumDirection)parambec.getProperty(N);
/*  98:119 */     if (parambec.getProperty(a) == atq.HEAD)
/*  99:    */     {
/* 100:120 */       if (paramaqu.getBlock(paramdt.offset(localej.d())).getProto() != this) {
/* 101:121 */         paramaqu.g(paramdt);
/* 102:    */       }
/* 103:    */     }
/* 104:124 */     else if (paramaqu.getBlock(paramdt.offset(localej)).getProto() != this)
/* 105:    */     {
/* 106:125 */       paramaqu.g(paramdt);
/* 107:126 */       if (!paramaqu.isClient) {
/* 108:127 */         b(paramaqu, paramdt, parambec, 0);
/* 109:    */       }
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 114:    */   {
/* 115:136 */     if (parambec.getProperty(a) == atq.HEAD) {
/* 116:137 */       return null;
/* 117:    */     }
/* 118:139 */     return ItemList.ba;
/* 119:    */   }
/* 120:    */   
/* 121:    */   private void j()
/* 122:    */   {
/* 123:143 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public static BlockPosition a(World paramaqu, BlockPosition paramdt, int paramInt)
/* 127:    */   {
/* 128:148 */     EnumDirection localej = (EnumDirection)paramaqu.getBlock(paramdt).getProperty(N);
/* 129:    */     
/* 130:    */ 
/* 131:151 */     int i = paramdt.getX();
/* 132:152 */     int j = paramdt.getY();
/* 133:153 */     int k = paramdt.getZ();
/* 134:156 */     for (int m = 0; m <= 1; m++)
/* 135:    */     {
/* 136:157 */       int n = i - localej.g() * m - 1;
/* 137:158 */       int i1 = k - localej.i() * m - 1;
/* 138:159 */       int i2 = n + 2;
/* 139:160 */       int i3 = i1 + 2;
/* 140:162 */       for (int i4 = n; i4 <= i2; i4++) {
/* 141:163 */         for (int i5 = i1; i5 <= i3; i5++)
/* 142:    */         {
/* 143:164 */           BlockPosition localdt = new BlockPosition(i4, j, i5);
/* 144:165 */           if (d(paramaqu, localdt)) {
/* 145:166 */             if (paramInt > 0) {
/* 146:167 */               paramInt--;
/* 147:    */             } else {
/* 148:170 */               return localdt;
/* 149:    */             }
/* 150:    */           }
/* 151:    */         }
/* 152:    */       }
/* 153:    */     }
/* 154:176 */     return null;
/* 155:    */   }
/* 156:    */   
/* 157:    */   protected static boolean d(World paramaqu, BlockPosition paramdt)
/* 158:    */   {
/* 159:180 */     return (World.isFlatSurface(paramaqu, paramdt.down())) && (!paramaqu.getBlock(paramdt).getProto().getMaterial().a()) && (!paramaqu.getBlock(paramdt.up()).getProto().getMaterial().a());
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/* 163:    */   {
/* 164:187 */     if (parambec.getProperty(a) == atq.FOOT) {
/* 165:188 */       super.a(paramaqu, paramdt, parambec, paramFloat, 0);
/* 166:    */     }
/* 167:    */   }
/* 168:    */   
/* 169:    */   public int i()
/* 170:    */   {
/* 171:194 */     return 1;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public aql k()
/* 175:    */   {
/* 176:199 */     return aql.c;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 180:    */   {
/* 181:204 */     return ItemList.ba;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd)
/* 185:    */   {
/* 186:211 */     if ((paramahd.by.d) && 
/* 187:212 */       (parambec.getProperty(a) == atq.HEAD))
/* 188:    */     {
/* 189:213 */       BlockPosition localdt = paramdt.offset(((EnumDirection)parambec.getProperty(N)).d());
/* 190:214 */       if (paramaqu.getBlock(localdt).getProto() == this) {
/* 191:215 */         paramaqu.g(localdt);
/* 192:    */       }
/* 193:    */     }
/* 194:    */   }
/* 195:    */   
/* 196:    */   public Block instance(int paramInt)
/* 197:    */   {
/* 198:223 */     EnumDirection localej = EnumDirection.b(paramInt);
/* 199:224 */     if ((paramInt & 0x8) > 0) {
/* 200:225 */       return instance().setData(a, atq.HEAD).setData(N, localej).setData(b, Boolean.valueOf((paramInt & 0x4) > 0));
/* 201:    */     }
/* 202:230 */     return instance().setData(a, atq.FOOT).setData(N, localej);
/* 203:    */   }
/* 204:    */   
/* 205:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/* 206:    */   {
/* 207:238 */     if (parambec.getProperty(a) == atq.FOOT)
/* 208:    */     {
/* 209:239 */       Block localbec = paramard.getBlock(paramdt.offset((EnumDirection)parambec.getProperty(N)));
/* 210:240 */       if (localbec.getProto() == this) {
/* 211:241 */         parambec = parambec.setData(b, localbec.getProperty(b));
/* 212:    */       }
/* 213:    */     }
/* 214:245 */     return parambec;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public int c(Block parambec)
/* 218:    */   {
/* 219:250 */     int i = 0;
/* 220:    */     
/* 221:252 */     i |= ((EnumDirection)parambec.getProperty(N)).b();
/* 222:254 */     if (parambec.getProperty(a) == atq.HEAD)
/* 223:    */     {
/* 224:255 */       i |= 0x8;
/* 225:257 */       if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 226:258 */         i |= 0x4;
/* 227:    */       }
/* 228:    */     }
/* 229:262 */     return i;
/* 230:    */   }
/* 231:    */   
/* 232:    */   protected bed e()
/* 233:    */   {
/* 234:267 */     return new bed(this, new IBlockData[] { N, a, b });
/* 235:    */   }
/* 236:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     atp
 * JD-Core Version:    0.7.0.1
 */