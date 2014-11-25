package net.minecraft.src;
/*   1:    */ public class bbp
/*   2:    */   extends ProtoBlock
/*   3:    */ {
/*   4: 25 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*   5: 26 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("open");
/*   6: 27 */   public static final BlockDataEnum M = BlockDataEnum.getInstance("half", bbr.class);
/*   7:    */   
/*   8:    */   protected bbp(Material parambof)
/*   9:    */   {
/*  10: 30 */     super(parambof);
/*  11: 31 */     j(this.L.b().a(a, EnumDirection.NORTH).a(b, Boolean.valueOf(false)).a(M, bbr.b));
/*  12: 32 */     float f1 = 0.5F;
/*  13: 33 */     float f2 = 1.0F;
/*  14: 34 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  15: 35 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean c()
/*  19:    */   {
/*  20: 40 */     return false;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean isOpaqueCube()
/*  24:    */   {
/*  25: 45 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt)
/*  29:    */   {
/*  30: 50 */     return !((Boolean)paramard.getBlock(paramdt).getProperty(b)).booleanValue();
/*  31:    */   }
/*  32:    */   
/*  33:    */   public AABB a(World paramaqu, BlockPosition paramdt)
/*  34:    */   {
/*  35: 55 */     a(paramaqu, paramdt);
/*  36: 56 */     return super.a(paramaqu, paramdt);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  40:    */   {
/*  41: 62 */     a(paramaqu, paramdt);
/*  42: 63 */     return super.a(paramaqu, paramdt, parambec);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  46:    */   {
/*  47: 68 */     d(paramard.getBlock(paramdt));
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void h()
/*  51:    */   {
/*  52: 73 */     float f = 0.1875F;
/*  53: 74 */     a(0.0F, 0.40625F, 0.0F, 1.0F, 0.59375F, 1.0F);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void d(Block parambec)
/*  57:    */   {
/*  58: 78 */     if (parambec.getProto() != this) {
/*  59: 79 */       return;
/*  60:    */     }
/*  61: 81 */     int i = parambec.getProperty(M) == bbr.a ? 1 : 0;
/*  62: 82 */     Boolean localBoolean = (Boolean)parambec.getProperty(b);
/*  63: 83 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/*  64:    */     
/*  65: 85 */     float f = 0.1875F;
/*  66: 86 */     if (i != 0) {
/*  67: 87 */       a(0.0F, 0.8125F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  68:    */     } else {
/*  69: 89 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.1875F, 1.0F);
/*  70:    */     }
/*  71: 92 */     if (localBoolean.booleanValue())
/*  72:    */     {
/*  73: 93 */       if (localej == EnumDirection.NORTH) {
/*  74: 94 */         a(0.0F, 0.0F, 0.8125F, 1.0F, 1.0F, 1.0F);
/*  75:    */       }
/*  76: 96 */       if (localej == EnumDirection.SOUTH) {
/*  77: 97 */         a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1875F);
/*  78:    */       }
/*  79: 99 */       if (localej == EnumDirection.WEST) {
/*  80:100 */         a(0.8125F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  81:    */       }
/*  82:102 */       if (localej == EnumDirection.EAST) {
/*  83:103 */         a(0.0F, 0.0F, 0.0F, 0.1875F, 1.0F, 1.0F);
/*  84:    */       }
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  89:    */   {
/*  90:110 */     if (this.material == Material.f) {
/*  91:111 */       return true;
/*  92:    */     }
/*  93:114 */     parambec = parambec.a(b);
/*  94:115 */     paramaqu.setBlock(paramdt, parambec, 2);
/*  95:    */     
/*  96:117 */     paramaqu.playLevelEvent(paramahd, ((Boolean)parambec.getProperty(b)).booleanValue() ? 1003 : 1006, paramdt, 0);
/*  97:118 */     return true;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 101:    */   {
/* 102:123 */     if (paramaqu.isClient) {
/* 103:124 */       return;
/* 104:    */     }
/* 105:127 */     BlockPosition localdt = paramdt.a(((EnumDirection)parambec.getProperty(a)).d());
/* 106:129 */     if (!c(paramaqu.getBlock(localdt).getProto()))
/* 107:    */     {
/* 108:130 */       paramaqu.g(paramdt);
/* 109:131 */       b(paramaqu, paramdt, parambec, 0);
/* 110:132 */       return;
/* 111:    */     }
/* 112:135 */     boolean bool1 = paramaqu.z(paramdt);
/* 113:136 */     if ((bool1) || (paramatr.protoBlock_g()))
/* 114:    */     {
/* 115:137 */       boolean bool2 = ((Boolean)parambec.getProperty(b)).booleanValue();
/* 116:139 */       if (bool2 != bool1)
/* 117:    */       {
/* 118:140 */         paramaqu.setBlock(paramdt, parambec.a(b, Boolean.valueOf(bool1)), 2);
/* 119:141 */         paramaqu.playLevelEvent(null, bool1 ? 1003 : 1006, paramdt, 0);
/* 120:    */       }
/* 121:    */     }
/* 122:    */   }
/* 123:    */   
/* 124:    */   public HitResult a(World paramaqu, BlockPosition paramdt, Vec3 parambrw1, Vec3 parambrw2)
/* 125:    */   {
/* 126:148 */     a(paramaqu, paramdt);
/* 127:149 */     return super.a(paramaqu, paramdt, parambrw1, parambrw2);
/* 128:    */   }
/* 129:    */   
/* 130:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 131:    */   {
/* 132:154 */     Block localbec = instance();
/* 133:155 */     if (paramej.k().c())
/* 134:    */     {
/* 135:156 */       localbec = localbec.a(a, paramej).a(b, Boolean.valueOf(false));
/* 136:157 */       localbec = localbec.a(M, paramFloat2 > 0.5F ? bbr.a : bbr.b);
/* 137:    */     }
/* 138:159 */     return localbec;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public boolean a(World paramaqu, BlockPosition paramdt, EnumDirection paramej)
/* 142:    */   {
/* 143:164 */     return (!paramej.k().b()) && (c(paramaqu.getBlock(paramdt.a(paramej.d())).getProto()));
/* 144:    */   }
/* 145:    */   
/* 146:    */   protected static EnumDirection b(int paramInt)
/* 147:    */   {
/* 148:168 */     switch (paramInt & 0x3)
/* 149:    */     {
/* 150:    */     case 0: 
/* 151:170 */       return EnumDirection.NORTH;
/* 152:    */     case 1: 
/* 153:172 */       return EnumDirection.SOUTH;
/* 154:    */     case 2: 
/* 155:174 */       return EnumDirection.WEST;
/* 156:    */     }
/* 157:177 */     return EnumDirection.EAST;
/* 158:    */   }
/* 159:    */   
/* 160:    */   protected static int a(EnumDirection paramej)
/* 161:    */   {
/* 162:182 */     switch (bbq.a[paramej.ordinal()])
/* 163:    */     {
/* 164:    */     case 1: 
/* 165:184 */       return 0;
/* 166:    */     case 2: 
/* 167:186 */       return 1;
/* 168:    */     case 3: 
/* 169:188 */       return 2;
/* 170:    */     }
/* 171:191 */     return 3;
/* 172:    */   }
/* 173:    */   
/* 174:    */   private static boolean c(ProtoBlock paramatr)
/* 175:    */   {
/* 176:196 */     return ((paramatr.material.isOpaque()) && (paramatr.isOpaqueCube())) || (paramatr == BlockList.glowstone) || ((paramatr instanceof BlockSlab)) || ((paramatr instanceof BlockStairs));
/* 177:    */   }
/* 178:    */   
/* 179:    */   public aql k()
/* 180:    */   {
/* 181:201 */     return aql.c;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public Block instance(int paramInt)
/* 185:    */   {
/* 186:206 */     return instance().a(a, b(paramInt)).a(b, Boolean.valueOf((paramInt & 0x4) != 0)).a(M, (paramInt & 0x8) == 0 ? bbr.b : bbr.a);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public int c(Block parambec)
/* 190:    */   {
/* 191:214 */     int i = 0;
/* 192:    */     
/* 193:216 */     i |= a((EnumDirection)parambec.getProperty(a));
/* 194:218 */     if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 195:219 */       i |= 0x4;
/* 196:    */     }
/* 197:222 */     if (parambec.getProperty(M) == bbr.a) {
/* 198:223 */       i |= 0x8;
/* 199:    */     }
/* 200:226 */     return i;
/* 201:    */   }
/* 202:    */   
/* 203:    */   protected bed e()
/* 204:    */   {
/* 205:231 */     return new bed(this, new IBlockData[] { a, b, M });
/* 206:    */   }
/* 207:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbp
 * JD-Core Version:    0.7.0.1
 */