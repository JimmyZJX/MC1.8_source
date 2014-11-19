package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ave
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 25 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing");
/*   7: 26 */   public static final BlockDataBoolean b = BlockDataBoolean.a("triggered");
/*   8: 28 */   public static final ei M = new ei(new eg());
/*   9: 30 */   protected Random N = new Random();
/*  10:    */   
/*  11:    */   protected ave()
/*  12:    */   {
/*  13: 33 */     super(Material.rock);
/*  14: 34 */     j(this.L.b().a(a, EnumDirection.NORTH).a(b, Boolean.valueOf(false)));
/*  15: 35 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public int a(World paramaqu)
/*  19:    */   {
/*  20: 40 */     return 4;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  24:    */   {
/*  25: 45 */     super.c(paramaqu, paramdt, parambec);
/*  26: 46 */     e(paramaqu, paramdt, parambec);
/*  27:    */   }
/*  28:    */   
/*  29:    */   private void e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  30:    */   {
/*  31: 50 */     if (paramaqu.isClient) {
/*  32: 51 */       return;
/*  33:    */     }
/*  34: 54 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/*  35: 55 */     boolean bool1 = paramaqu.getBlock(paramdt.north()).getProto().m();
/*  36: 56 */     boolean bool2 = paramaqu.getBlock(paramdt.south()).getProto().m();
/*  37: 57 */     if ((localej == EnumDirection.NORTH) && (bool1) && (!bool2))
/*  38:    */     {
/*  39: 58 */       localej = EnumDirection.SOUTH;
/*  40:    */     }
/*  41: 59 */     else if ((localej == EnumDirection.SOUTH) && (bool2) && (!bool1))
/*  42:    */     {
/*  43: 60 */       localej = EnumDirection.NORTH;
/*  44:    */     }
/*  45:    */     else
/*  46:    */     {
/*  47: 62 */       boolean bool3 = paramaqu.getBlock(paramdt.west()).getProto().m();
/*  48: 63 */       boolean bool4 = paramaqu.getBlock(paramdt.east()).getProto().m();
/*  49: 64 */       if ((localej == EnumDirection.WEST) && (bool3) && (!bool4)) {
/*  50: 65 */         localej = EnumDirection.EAST;
/*  51: 66 */       } else if ((localej == EnumDirection.EAST) && (bool4) && (!bool3)) {
/*  52: 67 */         localej = EnumDirection.WEST;
/*  53:    */       }
/*  54:    */     }
/*  55: 71 */     paramaqu.setBlock(paramdt, parambec.a(a, localej).a(b, Boolean.valueOf(false)), 2);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  59:    */   {
/*  60: 76 */     if (paramaqu.isClient) {
/*  61: 77 */       return true;
/*  62:    */     }
/*  63: 80 */     bcm localbcm = paramaqu.s(paramdt);
/*  64: 81 */     if ((localbcm instanceof bcx)) {
/*  65: 82 */       paramahd.a((vq)localbcm);
/*  66:    */     }
/*  67: 85 */     return true;
/*  68:    */   }
/*  69:    */   
/*  70:    */   protected void d(World paramaqu, BlockPosition paramdt)
/*  71:    */   {
/*  72: 89 */     ea localea = new ea(paramaqu, paramdt);
/*  73: 90 */     bcx localbcx = (bcx)localea.h();
/*  74: 91 */     if (localbcx == null) {
/*  75: 92 */       return;
/*  76:    */     }
/*  77: 95 */     int i = localbcx.m();
/*  78: 96 */     if (i < 0)
/*  79:    */     {
/*  80: 97 */       paramaqu.playLevelEvent(1001, paramdt, 0);
/*  81: 98 */       return;
/*  82:    */     }
/*  83:101 */     ItemStack localamj1 = localbcx.a(i);
/*  84:102 */     eo localeo = a(localamj1);
/*  85:104 */     if (localeo != eo.a)
/*  86:    */     {
/*  87:105 */       ItemStack localamj2 = localeo.a(localea, localamj1);
/*  88:    */       
/*  89:107 */       localbcx.a(i, localamj2.stackSize == 0 ? null : localamj2);
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected eo a(ItemStack paramamj)
/*  94:    */   {
/*  95:112 */     return (eo)M.a(paramamj == null ? null : paramamj.getItem());
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  99:    */   {
/* 100:117 */     int i = (paramaqu.z(paramdt)) || (paramaqu.z(paramdt.up())) ? 1 : 0;
/* 101:118 */     boolean bool = ((Boolean)parambec.getProperty(b)).booleanValue();
/* 102:120 */     if ((i != 0) && (!bool))
/* 103:    */     {
/* 104:121 */       paramaqu.a(paramdt, this, a(paramaqu));
/* 105:122 */       paramaqu.setBlock(paramdt, parambec.a(b, Boolean.valueOf(true)), 4);
/* 106:    */     }
/* 107:123 */     else if ((i == 0) && (bool))
/* 108:    */     {
/* 109:124 */       paramaqu.setBlock(paramdt, parambec.a(b, Boolean.valueOf(false)), 4);
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 114:    */   {
/* 115:130 */     if (!paramaqu.isClient) {
/* 116:131 */       d(paramaqu, paramdt);
/* 117:    */     }
/* 118:    */   }
/* 119:    */   
/* 120:    */   public bcm a(World paramaqu, int paramInt)
/* 121:    */   {
/* 122:137 */     return new bcx();
/* 123:    */   }
/* 124:    */   
/* 125:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 126:    */   {
/* 127:142 */     return instance().a(a, bdq.a(paramaqu, paramdt, paramxm)).a(b, Boolean.valueOf(false));
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/* 131:    */   {
/* 132:147 */     paramaqu.setBlock(paramdt, parambec.a(a, bdq.a(paramaqu, paramdt, paramxm)), 2);
/* 133:149 */     if (paramamj.s())
/* 134:    */     {
/* 135:150 */       bcm localbcm = paramaqu.s(paramdt);
/* 136:151 */       if ((localbcm instanceof bcx)) {
/* 137:152 */         ((bcx)localbcm).a(paramamj.q());
/* 138:    */       }
/* 139:    */     }
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 143:    */   {
/* 144:159 */     bcm localbcm = paramaqu.s(paramdt);
/* 145:160 */     if ((localbcm instanceof bcx))
/* 146:    */     {
/* 147:161 */       vs.a(paramaqu, paramdt, (bcx)localbcm);
/* 148:    */       
/* 149:163 */       paramaqu.e(paramdt, this);
/* 150:    */     }
/* 151:165 */     super.b(paramaqu, paramdt, parambec);
/* 152:    */   }
/* 153:    */   
/* 154:    */   public static ex a(dz paramdz)
/* 155:    */   {
/* 156:169 */     EnumDirection localej = b(paramdz.f());
/* 157:    */     
/* 158:171 */     double d1 = paramdz.a() + 0.7D * localej.g();
/* 159:172 */     double d2 = paramdz.b() + 0.7D * localej.h();
/* 160:173 */     double d3 = paramdz.c() + 0.7D * localej.i();
/* 161:    */     
/* 162:175 */     return new ey(d1, d2, d3);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public static EnumDirection b(int paramInt)
/* 166:    */   {
/* 167:179 */     return EnumDirection.a(paramInt & 0x7);
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean N()
/* 171:    */   {
/* 172:184 */     return true;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public int l(World paramaqu, BlockPosition paramdt)
/* 176:    */   {
/* 177:189 */     return aib.a(paramaqu.s(paramdt));
/* 178:    */   }
/* 179:    */   
/* 180:    */   public int b()
/* 181:    */   {
/* 182:194 */     return 3;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public Block b(Block parambec)
/* 186:    */   {
/* 187:199 */     return instance().a(a, EnumDirection.SOUTH);
/* 188:    */   }
/* 189:    */   
/* 190:    */   public Block a(int paramInt)
/* 191:    */   {
/* 192:204 */     return instance().a(a, b(paramInt)).a(b, Boolean.valueOf((paramInt & 0x8) > 0));
/* 193:    */   }
/* 194:    */   
/* 195:    */   public int c(Block parambec)
/* 196:    */   {
/* 197:211 */     int i = 0;
/* 198:    */     
/* 199:213 */     i |= ((EnumDirection)parambec.getProperty(a)).a();
/* 200:215 */     if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 201:216 */       i |= 0x8;
/* 202:    */     }
/* 203:219 */     return i;
/* 204:    */   }
/* 205:    */   
/* 206:    */   protected bed e()
/* 207:    */   {
/* 208:224 */     return new bed(this, new IBlockData[] { a, b });
/* 209:    */   }
/* 210:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ave
 * JD-Core Version:    0.7.0.1
 */