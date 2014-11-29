package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class ava
/*   4:    */   extends avb
/*   5:    */ {
/*   6:    */   protected final boolean M;
/*   7:    */   
/*   8:    */   protected ava(boolean paramBoolean)
/*   9:    */   {
/*  10: 22 */     super(Material.q);
/*  11: 23 */     this.M = paramBoolean;
/*  12: 24 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean isOpaqueCube()
/*  16:    */   {
/*  17: 29 */     return false;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  21:    */   {
/*  22: 34 */     if (World.isFlatSurface(paramaqu, paramdt.down())) {
/*  23: 35 */       return super.c(paramaqu, paramdt);
/*  24:    */     }
/*  25: 38 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean d(World paramaqu, BlockPosition paramdt)
/*  29:    */   {
/*  30: 42 */     if (World.isFlatSurface(paramaqu, paramdt.down())) {
/*  31: 43 */       return true;
/*  32:    */     }
/*  33: 46 */     return false;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom) {}
/*  37:    */   
/*  38:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  39:    */   {
/*  40: 55 */     if (b((IBlockAccess)paramaqu, paramdt, parambec)) {
/*  41: 56 */       return;
/*  42:    */     }
/*  43: 59 */     boolean bool = e(paramaqu, paramdt, parambec);
/*  44: 60 */     if ((this.M) && (!bool))
/*  45:    */     {
/*  46: 61 */       paramaqu.setBlock(paramdt, k(parambec), 2);
/*  47:    */     }
/*  48: 62 */     else if (!this.M)
/*  49:    */     {
/*  50: 65 */       paramaqu.setBlock(paramdt, e(parambec), 2);
/*  51: 66 */       if (!bool) {
/*  52: 67 */         paramaqu.a(paramdt, e(parambec).getType(), m(parambec), -1);
/*  53:    */       }
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/*  58:    */   {
/*  59: 75 */     return paramej.getAxis() != EnumAxis.Y;
/*  60:    */   }
/*  61:    */   
/*  62:    */   protected boolean l(Block parambec)
/*  63:    */   {
/*  64: 79 */     return this.M;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int getStrongRedstoneSignal(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/*  68:    */   {
/*  69: 84 */     return getRedStoneSignal(paramard, paramdt, parambec, paramej);
/*  70:    */   }
/*  71:    */   
/*  72:    */   public int getRedStoneSignal(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/*  73:    */   {
/*  74: 89 */     if (!l(parambec)) {
/*  75: 90 */       return 0;
/*  76:    */     }
/*  77: 93 */     if (parambec.getData(facing) == paramej) {
/*  78: 94 */       return a(paramard, paramdt, parambec);
/*  79:    */     }
/*  80: 97 */     return 0;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, BlockType paramatr)
/*  84:    */   {
/*  85:102 */     if (d(paramaqu, paramdt))
/*  86:    */     {
/*  87:103 */       g(paramaqu, paramdt, parambec);
/*  88:104 */       return;
/*  89:    */     }
/*  90:107 */     b(paramaqu, paramdt, parambec, 0);
/*  91:108 */     paramaqu.g(paramdt);
/*  92:109 */     for (EnumDirection localej : EnumDirection.values()) {
/*  93:110 */       paramaqu.c(paramdt.offset(localej), this);
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected void g(World paramaqu, BlockPosition paramdt, Block parambec)
/*  98:    */   {
/*  99:115 */     if (b((IBlockAccess)paramaqu, paramdt, parambec)) {
/* 100:116 */       return;
/* 101:    */     }
/* 102:119 */     boolean bool = e(paramaqu, paramdt, parambec);
/* 103:120 */     if (((this.M) && (!bool)) || ((!this.M) && (bool) && (!paramaqu.a(paramdt, this))))
/* 104:    */     {
/* 105:121 */       int i = -1;
/* 106:124 */       if (i(paramaqu, paramdt, parambec)) {
/* 107:125 */         i = -3;
/* 108:126 */       } else if (this.M) {
/* 109:127 */         i = -2;
/* 110:    */       }
/* 111:130 */       paramaqu.a(paramdt, this, d(parambec), i);
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt, Block parambec)
/* 116:    */   {
/* 117:135 */     return false;
/* 118:    */   }
/* 119:    */   
/* 120:    */   protected boolean e(World paramaqu, BlockPosition paramdt, Block parambec)
/* 121:    */   {
/* 122:139 */     return f(paramaqu, paramdt, parambec) > 0;
/* 123:    */   }
/* 124:    */   
/* 125:    */   protected int f(World paramaqu, BlockPosition paramdt, Block parambec)
/* 126:    */   {
/* 127:143 */     EnumDirection localej = (EnumDirection)parambec.getData(facing);
/* 128:    */     
/* 129:145 */     BlockPosition localdt = paramdt.offset(localej);
/* 130:146 */     int i = paramaqu.c(localdt, localej);
/* 131:147 */     if (i >= 15) {
/* 132:148 */       return i;
/* 133:    */     }
/* 134:151 */     Block localbec = paramaqu.getBlock(localdt);
/* 135:152 */     return Math.max(i, localbec.getType() == BlockList.redstoneWire ? ((Integer)localbec.getData(BlockRedstoneWire.power)).intValue() : 0);
/* 136:    */   }
/* 137:    */   
/* 138:    */   protected int c(IBlockAccess paramard, BlockPosition paramdt, Block parambec)
/* 139:    */   {
/* 140:156 */     EnumDirection localej1 = (EnumDirection)parambec.getData(facing);
/* 141:157 */     EnumDirection localej2 = localej1.cw();
/* 142:158 */     EnumDirection localej3 = localej1.ccw();
/* 143:159 */     return Math.max(c(paramard, paramdt.offset(localej2), localej2), c(paramard, paramdt.offset(localej3), localej3));
/* 144:    */   }
/* 145:    */   
/* 146:    */   protected int c(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 147:    */   {
/* 148:163 */     Block localbec = paramard.getBlock(paramdt);
/* 149:164 */     BlockType localatr = localbec.getType();
/* 150:165 */     if (c(localatr))
/* 151:    */     {
/* 152:166 */       if (localatr == BlockList.redstoneWire) {
/* 153:167 */         return ((Integer)localbec.getData(BlockRedstoneWire.power)).intValue();
/* 154:    */       }
/* 155:169 */       return paramard.getStrongRedstoneSignal(paramdt, paramej);
/* 156:    */     }
/* 157:172 */     return 0;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public boolean blockType_g()
/* 161:    */   {
/* 162:177 */     return true;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 166:    */   {
/* 167:182 */     return instance().setData(facing, paramxm.aO().opposite());
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/* 171:    */   {
/* 172:187 */     if (e(paramaqu, paramdt, parambec)) {
/* 173:188 */       paramaqu.a(paramdt, this, 1);
/* 174:    */     }
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/* 178:    */   {
/* 179:194 */     h(paramaqu, paramdt, parambec);
/* 180:    */   }
/* 181:    */   
/* 182:    */   protected void h(World paramaqu, BlockPosition paramdt, Block parambec)
/* 183:    */   {
/* 184:198 */     EnumDirection localej = (EnumDirection)parambec.getData(facing);
/* 185:199 */     BlockPosition localdt = paramdt.offset(localej.opposite());
/* 186:    */     
/* 187:201 */     paramaqu.d(localdt, this);
/* 188:202 */     paramaqu.a(localdt, this, localej);
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void d(World paramaqu, BlockPosition paramdt, Block parambec)
/* 192:    */   {
/* 193:207 */     if (this.M) {
/* 194:208 */       for (EnumDirection localej : EnumDirection.values()) {
/* 195:209 */         paramaqu.c(paramdt.offset(localej), this);
/* 196:    */       }
/* 197:    */     }
/* 198:212 */     super.d(paramaqu, paramdt, parambec);
/* 199:    */   }
/* 200:    */   
/* 201:    */   public boolean c()
/* 202:    */   {
/* 203:217 */     return false;
/* 204:    */   }
/* 205:    */   
/* 206:    */   protected boolean c(BlockType paramatr)
/* 207:    */   {
/* 208:228 */     return paramatr.blockType_g();
/* 209:    */   }
/* 210:    */   
/* 211:    */   protected int a(IBlockAccess paramard, BlockPosition paramdt, Block parambec)
/* 212:    */   {
/* 213:232 */     return 15;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public static boolean d(BlockType paramatr)
/* 217:    */   {
/* 218:236 */     return (BlockList.unpoweredRepeater.e(paramatr)) || (BlockList.unpowered_comparator.e(paramatr));
/* 219:    */   }
/* 220:    */   
/* 221:    */   public boolean e(BlockType paramatr)
/* 222:    */   {
/* 223:240 */     return (paramatr == e(instance()).getType()) || (paramatr == k(instance()).getType());
/* 224:    */   }
/* 225:    */   
/* 226:    */   public boolean i(World paramaqu, BlockPosition paramdt, Block parambec)
/* 227:    */   {
/* 228:244 */     EnumDirection localej = ((EnumDirection)parambec.getData(facing)).opposite();
/* 229:245 */     BlockPosition localdt = paramdt.offset(localej);
/* 230:247 */     if (d(paramaqu.getBlock(localdt).getType())) {
/* 231:248 */       return paramaqu.getBlock(localdt).getData(facing) != localej;
/* 232:    */     }
/* 233:250 */     return false;
/* 234:    */   }
/* 235:    */   
/* 236:    */   protected int m(Block parambec)
/* 237:    */   {
/* 238:254 */     return d(parambec);
/* 239:    */   }
/* 240:    */   
/* 241:    */   protected abstract int d(Block parambec);
/* 242:    */   
/* 243:    */   protected abstract Block e(Block parambec);
/* 244:    */   
/* 245:    */   protected abstract Block k(Block parambec);
/* 246:    */   
/* 247:    */   public boolean b(BlockType paramatr)
/* 248:    */   {
/* 249:265 */     return e(paramatr);
/* 250:    */   }
/* 251:    */   
/* 252:    */   public aql k()
/* 253:    */   {
/* 254:270 */     return aql.c;
/* 255:    */   }
/* 256:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ava
 * JD-Core Version:    0.7.0.1
 */