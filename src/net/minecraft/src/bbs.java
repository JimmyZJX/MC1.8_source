package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bbs
/*   5:    */   extends ProtoBlock
/*   6:    */ {
/*   7: 23 */   public static final BlockDataBoolean a = BlockDataBoolean.a("powered");
/*   8: 24 */   public static final BlockDataBoolean b = BlockDataBoolean.a("suspended");
/*   9: 25 */   public static final BlockDataBoolean M = BlockDataBoolean.a("attached");
/*  10: 26 */   public static final BlockDataBoolean N = BlockDataBoolean.a("disarmed");
/*  11: 27 */   public static final BlockDataBoolean O = BlockDataBoolean.a("north");
/*  12: 28 */   public static final BlockDataBoolean P = BlockDataBoolean.a("east");
/*  13: 29 */   public static final BlockDataBoolean Q = BlockDataBoolean.a("south");
/*  14: 30 */   public static final BlockDataBoolean R = BlockDataBoolean.a("west");
/*  15:    */   
/*  16:    */   public bbs()
/*  17:    */   {
/*  18: 33 */     super(Material.q);
/*  19: 34 */     j(this.L.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)).a(Q, Boolean.valueOf(false)).a(R, Boolean.valueOf(false)));
/*  20: 35 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
/*  21: 36 */     a(true);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  25:    */   {
/*  26: 41 */     return parambec.a(O, Boolean.valueOf(c(paramard, paramdt, parambec, EnumDirection.NORTH))).a(P, Boolean.valueOf(c(paramard, paramdt, parambec, EnumDirection.EAST))).a(Q, Boolean.valueOf(c(paramard, paramdt, parambec, EnumDirection.SOUTH))).a(R, Boolean.valueOf(c(paramard, paramdt, parambec, EnumDirection.WEST)));
/*  27:    */   }
/*  28:    */   
/*  29:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  30:    */   {
/*  31: 51 */     return null;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public boolean c()
/*  35:    */   {
/*  36: 56 */     return false;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean isOpaqueCube()
/*  40:    */   {
/*  41: 61 */     return false;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public aql k()
/*  45:    */   {
/*  46: 66 */     return aql.d;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  50:    */   {
/*  51: 72 */     return ItemList.F;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  55:    */   {
/*  56: 77 */     return ItemList.F;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  60:    */   {
/*  61: 82 */     boolean bool1 = ((Boolean)parambec.getProperty(b)).booleanValue();
/*  62: 83 */     boolean bool2 = !World.isFlatSurface(paramaqu, paramdt.down());
/*  63: 85 */     if (bool1 != bool2)
/*  64:    */     {
/*  65: 86 */       b(paramaqu, paramdt, parambec, 0);
/*  66: 87 */       paramaqu.g(paramdt);
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  71:    */   {
/*  72: 93 */     Block localbec = paramard.getBlock(paramdt);
/*  73: 94 */     boolean bool1 = ((Boolean)localbec.getProperty(M)).booleanValue();
/*  74: 95 */     boolean bool2 = ((Boolean)localbec.getProperty(b)).booleanValue();
/*  75: 97 */     if (!bool2) {
/*  76: 98 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
/*  77: 99 */     } else if (!bool1) {
/*  78:100 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  79:    */     } else {
/*  80:102 */       a(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
/*  81:    */     }
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  85:    */   {
/*  86:108 */     parambec = parambec.a(b, Boolean.valueOf(!World.isFlatSurface(paramaqu, paramdt.down())));
/*  87:109 */     paramaqu.setBlock(paramdt, parambec, 3);
/*  88:110 */     e(paramaqu, paramdt, parambec);
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/*  92:    */   {
/*  93:115 */     e(paramaqu, paramdt, parambec.a(a, Boolean.valueOf(true)));
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd)
/*  97:    */   {
/*  98:120 */     if (paramaqu.isClient) {
/*  99:121 */       return;
/* 100:    */     }
/* 101:124 */     if ((paramahd.bY() != null) && (paramahd.bY().getItem() == ItemList.be)) {
/* 102:125 */       paramaqu.setBlock(paramdt, parambec.a(N, Boolean.valueOf(true)), 4);
/* 103:    */     }
/* 104:    */   }
/* 105:    */   
/* 106:    */   private void e(World paramaqu, BlockPosition paramdt, Block parambec)
/* 107:    */   {
/* 108:130 */     for (EnumDirection localej : new EnumDirection[] { EnumDirection.SOUTH, EnumDirection.WEST }) {
/* 109:131 */       for (int k = 1; k < 42; k++)
/* 110:    */       {
/* 111:132 */         BlockPosition localdt = paramdt.a(localej, k);
/* 112:133 */         Block localbec = paramaqu.getBlock(localdt);
/* 113:135 */         if (localbec.getProto() == BlockList.bR)
/* 114:    */         {
/* 115:136 */           if (localbec.getProperty(bbt.a) == localej.d()) {
/* 116:137 */             BlockList.bR.a(paramaqu, localdt, localbec, false, true, k, parambec);
/* 117:    */           }
/* 118:    */         }
/* 119:    */         else {
/* 120:141 */           if (localbec.getProto() != BlockList.tripwire) {
/* 121:    */             break;
/* 122:    */           }
/* 123:    */         }
/* 124:    */       }
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/* 129:    */   {
/* 130:150 */     if (paramaqu.isClient) {
/* 131:151 */       return;
/* 132:    */     }
/* 133:154 */     if (((Boolean)parambec.getProperty(a)).booleanValue()) {
/* 134:155 */       return;
/* 135:    */     }
/* 136:158 */     d(paramaqu, paramdt);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom) {}
/* 140:    */   
/* 141:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 142:    */   {
/* 143:167 */     if (paramaqu.isClient) {
/* 144:168 */       return;
/* 145:    */     }
/* 146:171 */     if (!((Boolean)paramaqu.getBlock(paramdt).getProperty(a)).booleanValue()) {
/* 147:172 */       return;
/* 148:    */     }
/* 149:175 */     d(paramaqu, paramdt);
/* 150:    */   }
/* 151:    */   
/* 152:    */   private void d(World paramaqu, BlockPosition paramdt)
/* 153:    */   {
/* 154:179 */     Block localbec = paramaqu.getBlock(paramdt);
/* 155:180 */     boolean bool1 = ((Boolean)localbec.getProperty(a)).booleanValue();
/* 156:181 */     boolean bool2 = false;
/* 157:    */     
/* 158:183 */     List<Entity> localList = paramaqu.b(null, new AABB(paramdt.getX() + this.B, paramdt.getY() + this.C, paramdt.getZ() + this.D, paramdt.getX() + this.E, paramdt.getY() + this.F, paramdt.getZ() + this.G));
/* 159:184 */     if (!localList.isEmpty()) {
/* 160:185 */       for (Entity localwv : localList) {
/* 161:186 */         if (!localwv.aH())
/* 162:    */         {
/* 163:187 */           bool2 = true;
/* 164:188 */           break;
/* 165:    */         }
/* 166:    */       }
/* 167:    */     }
/* 168:193 */     if (bool2 != bool1)
/* 169:    */     {
/* 170:194 */       localbec = localbec.a(a, Boolean.valueOf(bool2));
/* 171:195 */       paramaqu.setBlock(paramdt, localbec, 3);
/* 172:196 */       e(paramaqu, paramdt, localbec);
/* 173:    */     }
/* 174:199 */     if (bool2) {
/* 175:200 */       paramaqu.a(paramdt, this, a(paramaqu));
/* 176:    */     }
/* 177:    */   }
/* 178:    */   
/* 179:    */   public static boolean c(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/* 180:    */   {
/* 181:205 */     BlockPosition localdt = paramdt.a(paramej);
/* 182:206 */     Block localbec = paramard.getBlock(localdt);
/* 183:207 */     ProtoBlock localatr = localbec.getProto();
/* 184:209 */     if (localatr == BlockList.bR)
/* 185:    */     {
/* 186:210 */       EnumDirection localej = paramej.d();
/* 187:211 */       return localbec.getProperty(bbt.a) == localej;
/* 188:    */     }
/* 189:214 */     if (localatr == BlockList.tripwire)
/* 190:    */     {
/* 191:215 */       boolean bool1 = ((Boolean)parambec.getProperty(b)).booleanValue();
/* 192:216 */       boolean bool2 = ((Boolean)localbec.getProperty(b)).booleanValue();
/* 193:217 */       return bool1 == bool2;
/* 194:    */     }
/* 195:220 */     return false;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public Block a(int paramInt)
/* 199:    */   {
/* 200:225 */     return instance().a(a, Boolean.valueOf((paramInt & 0x1) > 0)).a(b, Boolean.valueOf((paramInt & 0x2) > 0)).a(M, Boolean.valueOf((paramInt & 0x4) > 0)).a(N, Boolean.valueOf((paramInt & 0x8) > 0));
/* 201:    */   }
/* 202:    */   
/* 203:    */   public int c(Block parambec)
/* 204:    */   {
/* 205:234 */     int i = 0;
/* 206:236 */     if (((Boolean)parambec.getProperty(a)).booleanValue()) {
/* 207:237 */       i |= 0x1;
/* 208:    */     }
/* 209:240 */     if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 210:241 */       i |= 0x2;
/* 211:    */     }
/* 212:244 */     if (((Boolean)parambec.getProperty(M)).booleanValue()) {
/* 213:245 */       i |= 0x4;
/* 214:    */     }
/* 215:248 */     if (((Boolean)parambec.getProperty(N)).booleanValue()) {
/* 216:249 */       i |= 0x8;
/* 217:    */     }
/* 218:252 */     return i;
/* 219:    */   }
/* 220:    */   
/* 221:    */   protected bed e()
/* 222:    */   {
/* 223:257 */     return new bed(this, new IBlockData[] { a, b, M, N, O, P, R, Q });
/* 224:    */   }
/* 225:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbs
 * JD-Core Version:    0.7.0.1
 */