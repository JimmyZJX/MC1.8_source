package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bbl
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 23 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", new bbm());
/*   7:    */   
/*   8:    */   protected bbl()
/*   9:    */   {
/*  10: 31 */     super(Material.q);
/*  11: 32 */     j(this.L.b().a(a, EnumDirection.UP));
/*  12: 33 */     a(true);
/*  13: 34 */     setCreativeTab(CreativeTabs.tabDeco);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  17:    */   {
/*  18: 40 */     return null;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean c()
/*  22:    */   {
/*  23: 45 */     return false;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public boolean isOpaqueCube()
/*  27:    */   {
/*  28: 50 */     return false;
/*  29:    */   }
/*  30:    */   
/*  31:    */   private boolean d(World paramaqu, BlockPosition paramdt)
/*  32:    */   {
/*  33: 54 */     if (World.isFlatSurface(paramaqu, paramdt)) {
/*  34: 55 */       return true;
/*  35:    */     }
/*  36: 57 */     ProtoBlock localatr = paramaqu.getBlock(paramdt).getProto();
/*  37: 58 */     return ((localatr instanceof avv)) || (localatr == BlockList.w) || (localatr == BlockList.bZ) || (localatr == BlockList.cG);
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  41:    */   {
/*  42: 63 */     for (EnumDirection localej : a.getValues()) {
/*  43: 64 */       if (b(paramaqu, paramdt, localej)) {
/*  44: 65 */         return true;
/*  45:    */       }
/*  46:    */     }
/*  47: 69 */     return false;
/*  48:    */   }
/*  49:    */   
/*  50:    */   private boolean b(World paramaqu, BlockPosition paramdt, EnumDirection paramej)
/*  51:    */   {
/*  52: 73 */     BlockPosition localdt = paramdt.a(paramej.d());
/*  53:    */     
/*  54: 75 */     boolean bool = paramej.k().c();
/*  55: 76 */     return ((bool) && (paramaqu.d(localdt, true))) || ((paramej.equals(EnumDirection.UP)) && (d(paramaqu, localdt)));
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  59:    */   {
/*  60: 81 */     if (b(paramaqu, paramdt, paramej)) {
/*  61: 82 */       return instance().a(a, paramej);
/*  62:    */     }
/*  63: 85 */     for (EnumDirection localej : en.HORIZONTAL) {
/*  64: 86 */       if (paramaqu.d(paramdt.a(localej.d()), true)) {
/*  65: 87 */         return instance().a(a, localej);
/*  66:    */       }
/*  67:    */     }
/*  68: 91 */     return instance();
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  72:    */   {
/*  73: 96 */     f(paramaqu, paramdt, parambec);
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  77:    */   {
/*  78:101 */     e(paramaqu, paramdt, parambec);
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected boolean e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  82:    */   {
/*  83:105 */     if (!f(paramaqu, paramdt, parambec)) {
/*  84:106 */       return true;
/*  85:    */     }
/*  86:109 */     EnumDirection localej1 = (EnumDirection)parambec.getProperty(a);
/*  87:110 */     EnumAxis localel = localej1.k();
/*  88:111 */     EnumDirection localej2 = localej1.d();
/*  89:    */     
/*  90:113 */     int i = 0;
/*  91:114 */     if ((localel.c()) && (!paramaqu.d(paramdt.a(localej2), true))) {
/*  92:115 */       i = 1;
/*  93:116 */     } else if ((localel.b()) && (!d(paramaqu, paramdt.a(localej2)))) {
/*  94:117 */       i = 1;
/*  95:    */     }
/*  96:120 */     if (i != 0)
/*  97:    */     {
/*  98:121 */       b(paramaqu, paramdt, parambec, 0);
/*  99:122 */       paramaqu.g(paramdt);
/* 100:123 */       return true;
/* 101:    */     }
/* 102:126 */     return false;
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected boolean f(World paramaqu, BlockPosition paramdt, Block parambec)
/* 106:    */   {
/* 107:130 */     if ((parambec.getProto() == this) && 
/* 108:131 */       (b(paramaqu, paramdt, (EnumDirection)parambec.getProperty(a)))) {
/* 109:132 */       return true;
/* 110:    */     }
/* 111:136 */     if (paramaqu.getBlock(paramdt).getProto() == this)
/* 112:    */     {
/* 113:137 */       b(paramaqu, paramdt, parambec, 0);
/* 114:138 */       paramaqu.g(paramdt);
/* 115:    */     }
/* 116:141 */     return false;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public HitResult a(World paramaqu, BlockPosition paramdt, Vec3 parambrw1, Vec3 parambrw2)
/* 120:    */   {
/* 121:146 */     EnumDirection localej = (EnumDirection)paramaqu.getBlock(paramdt).getProperty(a);
/* 122:    */     
/* 123:148 */     float f = 0.15F;
/* 124:149 */     if (localej == EnumDirection.EAST)
/* 125:    */     {
/* 126:150 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 127:    */     }
/* 128:151 */     else if (localej == EnumDirection.WEST)
/* 129:    */     {
/* 130:152 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 131:    */     }
/* 132:153 */     else if (localej == EnumDirection.SOUTH)
/* 133:    */     {
/* 134:154 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 135:    */     }
/* 136:155 */     else if (localej == EnumDirection.NORTH)
/* 137:    */     {
/* 138:156 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/* 139:    */     }
/* 140:    */     else
/* 141:    */     {
/* 142:158 */       f = 0.1F;
/* 143:159 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/* 144:    */     }
/* 145:162 */     return super.a(paramaqu, paramdt, parambrw1, parambrw2);
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 149:    */   {
/* 150:167 */     EnumDirection localej1 = (EnumDirection)parambec.getProperty(a);
/* 151:168 */     double d1 = paramdt.getX() + 0.5D;
/* 152:169 */     double d2 = paramdt.getY() + 0.7D;
/* 153:170 */     double d3 = paramdt.getZ() + 0.5D;
/* 154:171 */     double d4 = 0.22D;
/* 155:172 */     double d5 = 0.27D;
/* 156:174 */     if (localej1.k().c())
/* 157:    */     {
/* 158:175 */       EnumDirection localej2 = localej1.d();
/* 159:176 */       paramaqu.a(EnumParticleEffect.l, d1 + d5 * localej2.g(), d2 + d4, d3 + d5 * localej2.i(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 160:177 */       paramaqu.a(EnumParticleEffect.A, d1 + d5 * localej2.g(), d2 + d4, d3 + d5 * localej2.i(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 161:    */     }
/* 162:    */     else
/* 163:    */     {
/* 164:179 */       paramaqu.a(EnumParticleEffect.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 165:180 */       paramaqu.a(EnumParticleEffect.A, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 166:    */     }
/* 167:    */   }
/* 168:    */   
/* 169:    */   public aql k()
/* 170:    */   {
/* 171:186 */     return aql.c;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public Block a(int paramInt)
/* 175:    */   {
/* 176:191 */     Block localbec = instance();
/* 177:192 */     switch (paramInt)
/* 178:    */     {
/* 179:    */     case 1: 
/* 180:194 */       localbec = localbec.a(a, EnumDirection.EAST);
/* 181:195 */       break;
/* 182:    */     case 2: 
/* 183:197 */       localbec = localbec.a(a, EnumDirection.WEST);
/* 184:198 */       break;
/* 185:    */     case 3: 
/* 186:200 */       localbec = localbec.a(a, EnumDirection.SOUTH);
/* 187:201 */       break;
/* 188:    */     case 4: 
/* 189:203 */       localbec = localbec.a(a, EnumDirection.NORTH);
/* 190:204 */       break;
/* 191:    */     case 5: 
/* 192:    */     default: 
/* 193:207 */       localbec = localbec.a(a, EnumDirection.UP);
/* 194:    */     }
/* 195:211 */     return localbec;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public int c(Block parambec)
/* 199:    */   {
/* 200:216 */     int i = 0;
/* 201:218 */     switch (bbn.a[((EnumDirection)parambec.getProperty(a)).ordinal()])
/* 202:    */     {
/* 203:    */     case 1: 
/* 204:220 */       i |= 0x1;
/* 205:221 */       break;
/* 206:    */     case 2: 
/* 207:223 */       i |= 0x2;
/* 208:224 */       break;
/* 209:    */     case 3: 
/* 210:226 */       i |= 0x3;
/* 211:227 */       break;
/* 212:    */     case 4: 
/* 213:229 */       i |= 0x4;
/* 214:230 */       break;
/* 215:    */     case 5: 
/* 216:    */     case 6: 
/* 217:    */     default: 
/* 218:234 */       i |= 0x5;
/* 219:    */     }
/* 220:238 */     return i;
/* 221:    */   }
/* 222:    */   
/* 223:    */   protected bed e()
/* 224:    */   {
/* 225:243 */     return new bed(this, new IBlockData[] { a });
/* 226:    */   }
/* 227:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbl
 * JD-Core Version:    0.7.0.1
 */