package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class awj
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 24 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*   7:    */   private final boolean b;
/*   8:    */   private static boolean M;
/*   9:    */   
/*  10:    */   protected awj(boolean paramBoolean)
/*  11:    */   {
/*  12: 30 */     super(Material.rock);
/*  13: 31 */     j(this.L.b().a(a, EnumDirection.NORTH));
/*  14: 32 */     this.b = paramBoolean;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  18:    */   {
/*  19: 38 */     return Item.fromProtoBlock(BlockList.al);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  23:    */   {
/*  24: 43 */     e(paramaqu, paramdt, parambec);
/*  25:    */   }
/*  26:    */   
/*  27:    */   private void e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  28:    */   {
/*  29: 47 */     if (paramaqu.isClient) {
/*  30: 48 */       return;
/*  31:    */     }
/*  32: 51 */     ProtoBlock localatr1 = paramaqu.getBlock(paramdt.north()).getProto();
/*  33: 52 */     ProtoBlock localatr2 = paramaqu.getBlock(paramdt.south()).getProto();
/*  34: 53 */     ProtoBlock localatr3 = paramaqu.getBlock(paramdt.west()).getProto();
/*  35: 54 */     ProtoBlock localatr4 = paramaqu.getBlock(paramdt.east()).getProto();
/*  36:    */     
/*  37: 56 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/*  38: 58 */     if ((localej == EnumDirection.NORTH) && (localatr1.m()) && (!localatr2.m())) {
/*  39: 59 */       localej = EnumDirection.SOUTH;
/*  40: 60 */     } else if ((localej == EnumDirection.SOUTH) && (localatr2.m()) && (!localatr1.m())) {
/*  41: 61 */       localej = EnumDirection.NORTH;
/*  42: 62 */     } else if ((localej == EnumDirection.WEST) && (localatr3.m()) && (!localatr4.m())) {
/*  43: 63 */       localej = EnumDirection.EAST;
/*  44: 64 */     } else if ((localej == EnumDirection.EAST) && (localatr4.m()) && (!localatr3.m())) {
/*  45: 65 */       localej = EnumDirection.WEST;
/*  46:    */     }
/*  47: 68 */     paramaqu.setBlock(paramdt, parambec.a(a, localej), 2);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  51:    */   {
/*  52: 73 */     if (!this.b) {
/*  53: 74 */       return;
/*  54:    */     }
/*  55: 77 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/*  56:    */     
/*  57: 79 */     double d1 = paramdt.getX() + 0.5D;
/*  58: 80 */     double d2 = paramdt.getY() + paramRandom.nextDouble() * 6.0D / 16.0D;
/*  59: 81 */     double d3 = paramdt.getZ() + 0.5D;
/*  60: 82 */     double d4 = 0.52D;
/*  61: 83 */     double d5 = paramRandom.nextDouble() * 0.6D - 0.3D;
/*  62: 85 */     switch (awk.a[localej.ordinal()])
/*  63:    */     {
/*  64:    */     case 1: 
/*  65: 87 */       paramaqu.a(EnumParticleEffect.l, d1 - d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*  66: 88 */       paramaqu.a(EnumParticleEffect.A, d1 - d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*  67: 89 */       break;
/*  68:    */     case 2: 
/*  69: 91 */       paramaqu.a(EnumParticleEffect.l, d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*  70: 92 */       paramaqu.a(EnumParticleEffect.A, d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*  71: 93 */       break;
/*  72:    */     case 3: 
/*  73: 95 */       paramaqu.a(EnumParticleEffect.l, d1 + d5, d2, d3 - d4, 0.0D, 0.0D, 0.0D, new int[0]);
/*  74: 96 */       paramaqu.a(EnumParticleEffect.A, d1 + d5, d2, d3 - d4, 0.0D, 0.0D, 0.0D, new int[0]);
/*  75: 97 */       break;
/*  76:    */     case 4: 
/*  77: 99 */       paramaqu.a(EnumParticleEffect.l, d1 + d5, d2, d3 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
/*  78:100 */       paramaqu.a(EnumParticleEffect.A, d1 + d5, d2, d3 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
/*  79:    */     }
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  83:    */   {
/*  84:107 */     if (paramaqu.isClient) {
/*  85:108 */       return true;
/*  86:    */     }
/*  87:111 */     bcm localbcm = paramaqu.s(paramdt);
/*  88:112 */     if ((localbcm instanceof bdc)) {
/*  89:113 */       paramahd.a((vq)localbcm);
/*  90:    */     }
/*  91:116 */     return true;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public static void a(boolean paramBoolean, World paramaqu, BlockPosition paramdt)
/*  95:    */   {
/*  96:120 */     Block localbec = paramaqu.getBlock(paramdt);
/*  97:121 */     bcm localbcm = paramaqu.s(paramdt);
/*  98:    */     
/*  99:123 */     M = true;
/* 100:125 */     if (paramBoolean)
/* 101:    */     {
/* 102:126 */       paramaqu.setBlock(paramdt, BlockList.am.instance().a(a, localbec.getProperty(a)), 3);
/* 103:127 */       paramaqu.setBlock(paramdt, BlockList.am.instance().a(a, localbec.getProperty(a)), 3);
/* 104:    */     }
/* 105:    */     else
/* 106:    */     {
/* 107:129 */       paramaqu.setBlock(paramdt, BlockList.al.instance().a(a, localbec.getProperty(a)), 3);
/* 108:130 */       paramaqu.setBlock(paramdt, BlockList.al.instance().a(a, localbec.getProperty(a)), 3);
/* 109:    */     }
/* 110:132 */     M = false;
/* 111:134 */     if (localbcm != null)
/* 112:    */     {
/* 113:135 */       localbcm.D();
/* 114:136 */       paramaqu.a(paramdt, localbcm);
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public bcm a(World paramaqu, int paramInt)
/* 119:    */   {
/* 120:142 */     return new bdc();
/* 121:    */   }
/* 122:    */   
/* 123:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 124:    */   {
/* 125:147 */     return instance().a(a, paramxm.aO().d());
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/* 129:    */   {
/* 130:152 */     paramaqu.setBlock(paramdt, parambec.a(a, paramxm.aO().d()), 2);
/* 131:154 */     if (paramamj.s())
/* 132:    */     {
/* 133:155 */       bcm localbcm = paramaqu.s(paramdt);
/* 134:156 */       if ((localbcm instanceof bdc)) {
/* 135:157 */         ((bdc)localbcm).a(paramamj.q());
/* 136:    */       }
/* 137:    */     }
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 141:    */   {
/* 142:164 */     if (!M)
/* 143:    */     {
/* 144:165 */       bcm localbcm = paramaqu.s(paramdt);
/* 145:166 */       if ((localbcm instanceof bdc))
/* 146:    */       {
/* 147:167 */         vs.a(paramaqu, paramdt, (bdc)localbcm);
/* 148:    */         
/* 149:169 */         paramaqu.e(paramdt, this);
/* 150:    */       }
/* 151:    */     }
/* 152:172 */     super.b(paramaqu, paramdt, parambec);
/* 153:    */   }
/* 154:    */   
/* 155:    */   public boolean N()
/* 156:    */   {
/* 157:177 */     return true;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public int l(World paramaqu, BlockPosition paramdt)
/* 161:    */   {
/* 162:182 */     return aib.a(paramaqu.s(paramdt));
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 166:    */   {
/* 167:187 */     return Item.fromProtoBlock(BlockList.al);
/* 168:    */   }
/* 169:    */   
/* 170:    */   public int b()
/* 171:    */   {
/* 172:192 */     return 3;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public Block b(Block parambec)
/* 176:    */   {
/* 177:197 */     return instance().a(a, EnumDirection.SOUTH);
/* 178:    */   }
/* 179:    */   
/* 180:    */   public Block instance(int paramInt)
/* 181:    */   {
/* 182:202 */     EnumDirection localej = EnumDirection.a(paramInt);
/* 183:203 */     if (localej.k() == EnumAxis.Y) {
/* 184:204 */       localej = EnumDirection.NORTH;
/* 185:    */     }
/* 186:206 */     return instance().a(a, localej);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public int c(Block parambec)
/* 190:    */   {
/* 191:212 */     return ((EnumDirection)parambec.getProperty(a)).a();
/* 192:    */   }
/* 193:    */   
/* 194:    */   protected bed e()
/* 195:    */   {
/* 196:217 */     return new bed(this, new IBlockData[] { a });
/* 197:    */   }
/* 198:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awj
 * JD-Core Version:    0.7.0.1
 */