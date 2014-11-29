package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ayy
/*   4:    */   extends awt
/*   5:    */ {
/*   6: 23 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("axis", EnumAxis.class, new EnumAxis[] { EnumAxis.X, EnumAxis.Z });
/*   7:    */   
/*   8:    */   public ayy()
/*   9:    */   {
/*  10: 31 */     super(Material.E, false);
/*  11: 32 */     j(this.L.b().setData(a, EnumAxis.X));
/*  12: 33 */     a(true);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void b(World world, BlockPosition pos, Block parambec, Random paramRandom)
/*  16:    */   {
/*  17: 38 */     super.b(world, pos, parambec, paramRandom);
/*  18: 40 */     if ((world.t.d()) && (world.getGameRules().getBoolean("doMobSpawning")) && (paramRandom.nextInt(2000) < world.getDifficulty().a()))
/*  19:    */     {
/*  20: 42 */       int i = pos.getY();
/*  21: 43 */       BlockPosition pos1 = pos;
/*  22: 44 */       while ((!World.isFlatSurface(world, pos1)) && (pos1.getY() > 0)) {
/*  23: 45 */         pos1 = pos1.down();
/*  24:    */       }
/*  25: 47 */       if ((i > 0) && (!world.getBlock(pos1.up()).getType().blocksMovement()))
/*  26:    */       {
/*  27: 49 */         Entity localwv = anl.a(world, 57, pos1.getX() + 0.5D, pos1.getY() + 1.1D, pos1.getZ() + 0.5D);
/*  28: 50 */         if (localwv != null) {
/*  29: 51 */           localwv.aj = localwv.ar();
/*  30:    */         }
/*  31:    */       }
/*  32:    */     }
/*  33:    */   }
/*  34:    */   
/*  35:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  36:    */   {
/*  37: 60 */     return null;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  41:    */   {
/*  42: 65 */     EnumAxis localel = (EnumAxis)paramard.getBlock(paramdt).getData(a);
/*  43:    */     
/*  44: 67 */     float f1 = 0.125F;
/*  45: 68 */     float f2 = 0.125F;
/*  46: 70 */     if (localel == EnumAxis.X) {
/*  47: 71 */       f1 = 0.5F;
/*  48:    */     }
/*  49: 73 */     if (localel == EnumAxis.Z) {
/*  50: 74 */       f2 = 0.5F;
/*  51:    */     }
/*  52: 77 */     a(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, 1.0F, 0.5F + f2);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public static int a(EnumAxis paramel)
/*  56:    */   {
/*  57: 81 */     if (paramel == EnumAxis.X) {
/*  58: 82 */       return 1;
/*  59:    */     }
/*  60: 84 */     if (paramel == EnumAxis.Z) {
/*  61: 85 */       return 2;
/*  62:    */     }
/*  63: 87 */     return 0;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean isOpaqueCube()
/*  67:    */   {
/*  68: 92 */     return false;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean d(World paramaqu, BlockPosition paramdt)
/*  72:    */   {
/*  73: 96 */     ayz localayz1 = new ayz(paramaqu, paramdt, EnumAxis.X);
/*  74: 97 */     if ((localayz1.b()) && (ayz.a(localayz1) == 0))
/*  75:    */     {
/*  76: 98 */       localayz1.c();
/*  77: 99 */       return true;
/*  78:    */     }
/*  79:102 */     ayz localayz2 = new ayz(paramaqu, paramdt, EnumAxis.Z);
/*  80:103 */     if ((localayz2.b()) && (ayz.a(localayz2) == 0))
/*  81:    */     {
/*  82:104 */       localayz2.c();
/*  83:105 */       return true;
/*  84:    */     }
/*  85:108 */     return false;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, BlockType paramatr)
/*  89:    */   {
/*  90:113 */     EnumAxis localel = (EnumAxis)parambec.getData(a);
/*  91:    */     ayz localayz;
/*  92:115 */     if (localel == EnumAxis.X)
/*  93:    */     {
/*  94:116 */       localayz = new ayz(paramaqu, paramdt, EnumAxis.X);
/*  95:117 */       if ((!localayz.b()) || (ayz.a(localayz) < ayz.b(localayz) * ayz.c(localayz))) {
/*  96:118 */         paramaqu.setBlock(paramdt, BlockList.air.instance());
/*  97:    */       }
/*  98:    */     }
/*  99:120 */     else if (localel == EnumAxis.Z)
/* 100:    */     {
/* 101:121 */       localayz = new ayz(paramaqu, paramdt, EnumAxis.Z);
/* 102:122 */       if ((!localayz.b()) || (ayz.a(localayz) < ayz.b(localayz) * ayz.c(localayz))) {
/* 103:123 */         paramaqu.setBlock(paramdt, BlockList.air.instance());
/* 104:    */       }
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 109:    */   {
/* 110:131 */     EnumAxis localel = null;
/* 111:132 */     Block localbec = paramard.getBlock(paramdt);
/* 112:133 */     if (paramard.getBlock(paramdt).getType() == this)
/* 113:    */     {
/* 114:134 */       localel = (EnumAxis)localbec.getData(a);
/* 115:136 */       if (localel == null) {
/* 116:137 */         return false;
/* 117:    */       }
/* 118:139 */       if ((localel == EnumAxis.Z) && (paramej != EnumDirection.EAST) && (paramej != EnumDirection.WEST)) {
/* 119:140 */         return false;
/* 120:    */       }
/* 121:142 */       if ((localel == EnumAxis.X) && (paramej != EnumDirection.SOUTH) && (paramej != EnumDirection.NORTH)) {
/* 122:143 */         return false;
/* 123:    */       }
/* 124:    */     }
/* 125:147 */     int i = (paramard.getBlock(paramdt.west()).getType() == this) && (paramard.getBlock(paramdt.west(2)).getType() != this) ? 1 : 0;
/* 126:148 */     int j = (paramard.getBlock(paramdt.east()).getType() == this) && (paramard.getBlock(paramdt.east(2)).getType() != this) ? 1 : 0;
/* 127:    */     
/* 128:150 */     int k = (paramard.getBlock(paramdt.north()).getType() == this) && (paramard.getBlock(paramdt.north(2)).getType() != this) ? 1 : 0;
/* 129:151 */     int m = (paramard.getBlock(paramdt.south()).getType() == this) && (paramard.getBlock(paramdt.south(2)).getType() != this) ? 1 : 0;
/* 130:    */     
/* 131:153 */     int n = (i != 0) || (j != 0) || (localel == EnumAxis.X) ? 1 : 0;
/* 132:154 */     int i1 = (k != 0) || (m != 0) || (localel == EnumAxis.Z) ? 1 : 0;
/* 133:156 */     if ((n != 0) && (paramej == EnumDirection.WEST)) {
/* 134:157 */       return true;
/* 135:    */     }
/* 136:159 */     if ((n != 0) && (paramej == EnumDirection.EAST)) {
/* 137:160 */       return true;
/* 138:    */     }
/* 139:162 */     if ((i1 != 0) && (paramej == EnumDirection.NORTH)) {
/* 140:163 */       return true;
/* 141:    */     }
/* 142:165 */     if ((i1 != 0) && (paramej == EnumDirection.SOUTH)) {
/* 143:166 */       return true;
/* 144:    */     }
/* 145:169 */     return false;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public int a(Random paramRandom)
/* 149:    */   {
/* 150:174 */     return 0;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public aql k()
/* 154:    */   {
/* 155:179 */     return aql.d;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/* 159:    */   {
/* 160:184 */     if ((paramwv.vehicle == null) && (paramwv.rider == null)) {
/* 161:185 */       paramwv.aq();
/* 162:    */     }
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 166:    */   {
/* 167:191 */     if (paramRandom.nextInt(100) == 0) {
/* 168:192 */       paramaqu.a(paramdt.getX() + 0.5D, paramdt.getY() + 0.5D, paramdt.getZ() + 0.5D, "portal.portal", 0.5F, paramRandom.nextFloat() * 0.4F + 0.8F, false);
/* 169:    */     }
/* 170:195 */     for (int i = 0; i < 4; i++)
/* 171:    */     {
/* 172:196 */       double d1 = paramdt.getX() + paramRandom.nextFloat();
/* 173:197 */       double d2 = paramdt.getY() + paramRandom.nextFloat();
/* 174:198 */       double d3 = paramdt.getZ() + paramRandom.nextFloat();
/* 175:199 */       double d4 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 176:200 */       double d5 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 177:201 */       double d6 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 178:    */       
/* 179:203 */       int j = paramRandom.nextInt(2) * 2 - 1;
/* 180:204 */       if ((paramaqu.getBlock(paramdt.west()).getType() == this) || (paramaqu.getBlock(paramdt.east()).getType() == this))
/* 181:    */       {
/* 182:205 */         d3 = paramdt.getZ() + 0.5D + 0.25D * j;
/* 183:206 */         d6 = paramRandom.nextFloat() * 2.0F * j;
/* 184:    */       }
/* 185:    */       else
/* 186:    */       {
/* 187:208 */         d1 = paramdt.getX() + 0.5D + 0.25D * j;
/* 188:209 */         d4 = paramRandom.nextFloat() * 2.0F * j;
/* 189:    */       }
/* 190:212 */       paramaqu.a(EnumParticleEffect.y, d1, d2, d3, d4, d5, d6, new int[0]);
/* 191:    */     }
/* 192:    */   }
/* 193:    */   
/* 194:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 195:    */   {
/* 196:218 */     return null;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public Block instance(int paramInt)
/* 200:    */   {
/* 201:223 */     return instance().setData(a, (paramInt & 0x3) == 2 ? EnumAxis.Z : EnumAxis.X);
/* 202:    */   }
/* 203:    */   
/* 204:    */   public int c(Block parambec)
/* 205:    */   {
/* 206:229 */     return a((EnumAxis)parambec.getData(a));
/* 207:    */   }
/* 208:    */   
/* 209:    */   protected bed e()
/* 210:    */   {
/* 211:234 */     return new bed(this, new IBlockData[] { a });
/* 212:    */   }
/* 213:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayy
 * JD-Core Version:    0.7.0.1
 */