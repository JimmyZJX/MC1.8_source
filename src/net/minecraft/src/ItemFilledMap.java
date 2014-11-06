package net.minecraft.src;
/*   1:    */ import com.google.common.collect.HashMultiset;
/*   2:    */ import com.google.common.collect.Iterables;
/*   3:    */ import com.google.common.collect.Multiset;
/*   4:    */ import com.google.common.collect.Multisets;
/*   5:    */ import java.util.List;
/*   6:    */ 
/*   7:    */ public class ItemFilledMap
/*   8:    */   extends ake
/*   9:    */ {
/*  10:    */   protected ItemFilledMap()
/*  11:    */   {
/*  12: 30 */     a(true);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public static MapInfo a(int paramInt, World paramaqu)
/*  16:    */   {
/*  17: 34 */     String str = "map_" + paramInt;
/*  18: 35 */     MapInfo localbqe = (MapInfo)paramaqu.a(MapInfo.class, str);
/*  19: 37 */     if (localbqe == null)
/*  20:    */     {
/*  21: 38 */       localbqe = new MapInfo(str);
/*  22:    */       
/*  23: 40 */       paramaqu.a(str, localbqe);
/*  24:    */     }
/*  25: 43 */     return localbqe;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public MapInfo a(ItemStack paramamj, World paramaqu)
/*  29:    */   {
/*  30: 47 */     String str = "map_" + paramamj.i();
/*  31: 48 */     MapInfo localbqe = (MapInfo)paramaqu.a(MapInfo.class, str);
/*  32: 50 */     if ((localbqe == null) && (!paramaqu.isClient))
/*  33:    */     {
/*  34: 51 */       paramamj.b(paramaqu.b("map"));
/*  35: 52 */       str = "map_" + paramamj.i();
/*  36: 53 */       localbqe = new MapInfo(str);
/*  37:    */       
/*  38: 55 */       localbqe.scale = 3;
/*  39: 56 */       localbqe.a(paramaqu.getWorldInfo().c(), paramaqu.getWorldInfo().e(), localbqe.scale);
/*  40: 57 */       localbqe.dimension = ((byte)paramaqu.t.q());
/*  41:    */       
/*  42: 59 */       localbqe.c();
/*  43:    */       
/*  44: 61 */       paramaqu.a(str, localbqe);
/*  45:    */     }
/*  46: 64 */     return localbqe;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(World paramaqu, Entity paramwv, MapInfo parambqe)
/*  50:    */   {
/*  51: 68 */     if ((paramaqu.t.q() != parambqe.dimension) || (!(paramwv instanceof EntityPlayer))) {
/*  52: 70 */       return;
/*  53:    */     }
/*  54: 73 */     int i = 1 << parambqe.scale;
/*  55: 74 */     int j = parambqe.xCenter;
/*  56: 75 */     int k = parambqe.zCenter;
/*  57:    */     
/*  58: 77 */     int m = MathUtils.floor(paramwv.xPos - j) / i + 64;
/*  59: 78 */     int n = MathUtils.floor(paramwv.zPos - k) / i + 64;
/*  60: 79 */     int i1 = 128 / i;
/*  61: 81 */     if (paramaqu.t.o()) {
/*  62: 82 */       i1 /= 2;
/*  63:    */     }
/*  64: 85 */     bqf localbqf = parambqe.a((EntityPlayer)paramwv);
/*  65: 86 */     localbqf.b += 1;
/*  66:    */     
/*  67: 88 */     int i2 = 0;
/*  68: 89 */     for (int i3 = m - i1 + 1; i3 < m + i1; i3++) {
/*  69: 90 */       if (((i3 & 0xF) == (localbqf.b & 0xF)) || (i2 != 0))
/*  70:    */       {
/*  71: 94 */         i2 = 0;
/*  72: 95 */         double d1 = 0.0D;
/*  73: 96 */         for (int i4 = n - i1 - 1; i4 < n + i1; i4++) {
/*  74: 97 */           if ((i3 >= 0) && (i4 >= -1) && (i3 < 128) && (i4 < 128))
/*  75:    */           {
/*  76:101 */             int i5 = i3 - m;
/*  77:102 */             int i6 = i4 - n;
/*  78:    */             
/*  79:104 */             int i7 = i5 * i5 + i6 * i6 > (i1 - 2) * (i1 - 2) ? 1 : 0;
/*  80:    */             
/*  81:106 */             int i8 = (j / i + i3 - 64) * i;
/*  82:107 */             int i9 = (k / i + i4 - 64) * i;
/*  83:    */             
/*  84:109 */             HashMultiset localHashMultiset = HashMultiset.create();
/*  85:    */             
/*  86:111 */             Chunk localbfh = paramaqu.getChunk(new BlockPosition(i8, 0, i9));
/*  87:112 */             if (!localbfh.f())
/*  88:    */             {
/*  89:115 */               int i10 = i8 & 0xF;
/*  90:116 */               int i11 = i9 & 0xF;
/*  91:117 */               int i12 = 0;
/*  92:    */               
/*  93:119 */               double d2 = 0.0D;
/*  94:    */               int i13;
/*  95:    */               int i16;
/*  96:120 */               if (paramaqu.t.o())
/*  97:    */               {
/*  98:121 */                 i13 = i8 + i9 * 231871;
/*  99:122 */                 i13 = i13 * i13 * 31287121 + i13 * 11;
/* 100:124 */                 if ((i13 >> 20 & 0x1) == 0) {
/* 101:125 */                   localHashMultiset.add(BlockList.dirt.g(BlockList.dirt.instance().a(BlockDirt.a, avd.a)), 10);
/* 102:    */                 } else {
/* 103:127 */                   localHashMultiset.add(BlockList.stone.g(BlockList.stone.instance().a(bba.a, EnumStoneVariants.STONE)), 100);
/* 104:    */                 }
/* 105:130 */                 d2 = 100.0D;
/* 106:    */               }
/* 107:    */               else
/* 108:    */               {
/* 109:132 */                 for (i13 = 0; i13 < i; i13++) {
/* 110:133 */                   for (int i14 = 0; i14 < i; i14++)
/* 111:    */                   {
/* 112:134 */                     int i15 = localbfh.getHeight(i13 + i10, i14 + i11) + 1;
/* 113:135 */                     Block localObject = BlockList.air.instance();
/* 114:137 */                     if (i15 > 1)
/* 115:    */                     {
/* 116:    */                       do
/* 117:    */                       {
/* 118:139 */                         i15--;
/* 119:140 */                         localObject = localbfh.g(new BlockPosition(i13 + i10, i15, i14 + i11));
/* 120:141 */                       } while ((((Block)localObject).getProto().g((Block)localObject) == MapColor.b) && (i15 > 0));
/* 121:143 */                       if ((i15 > 0) && (((Block)localObject).getProto().getMaterial().isLiquid()))
/* 122:    */                       {
/* 123:144 */                         i16 = i15 - 1;
/* 124:    */                         ProtoBlock localatr;
/* 125:    */                         do
/* 126:    */                         {
/* 127:147 */                           localatr = localbfh.getBlockAtWorldCoord(i13 + i10, i16--, i14 + i11);
/* 128:148 */                           i12++;
/* 129:149 */                         } while ((i16 > 0) && (localatr.getMaterial().isLiquid()));
/* 130:    */                       }
/* 131:    */                     }
/* 132:153 */                     d2 += i15 / (i * i);
/* 133:    */                     
/* 134:155 */                     localHashMultiset.add(((Block)localObject).getProto().g((Block)localObject));
/* 135:    */                   }
/* 136:    */                 }
/* 137:    */               }
/* 138:159 */               i12 /= i * i;
/* 139:    */               
/* 140:161 */               double d3 = (d2 - d1) * 4.0D / (i + 4) + ((i3 + i4 & 0x1) - 0.5D) * 0.4D;
/* 141:162 */               int i15 = 1;
/* 142:163 */               if (d3 > 0.6D) {
/* 143:164 */                 i15 = 2;
/* 144:    */               }
/* 145:166 */               if (d3 < -0.6D) {
/* 146:167 */                 i15 = 0;
/* 147:    */               }
/* 148:170 */               Object localObject = (MapColor)Iterables.getFirst(Multisets.copyHighestCountFirst(localHashMultiset), MapColor.b);
/* 149:172 */               if (localObject == MapColor.n)
/* 150:    */               {
/* 151:173 */                 d3 = i12 * 0.1D + (i3 + i4 & 0x1) * 0.2D;
/* 152:174 */                 i15 = 1;
/* 153:175 */                 if (d3 < 0.5D) {
/* 154:176 */                   i15 = 2;
/* 155:    */                 }
/* 156:178 */                 if (d3 > 0.9D) {
/* 157:179 */                   i15 = 0;
/* 158:    */                 }
/* 159:    */               }
/* 160:183 */               d1 = d2;
/* 161:185 */               if (i4 >= 0) {
/* 162:188 */                 if (i5 * i5 + i6 * i6 < i1 * i1) {
/* 163:191 */                   if ((i7 == 0) || ((i3 + i4 & 0x1) != 0))
/* 164:    */                   {
/* 165:194 */                     i16 = parambqe.content[(i3 + i4 * 128)];
/* 166:195 */                     byte i17 = (byte)(((MapColor)localObject).M * 4 + i15);
/* 167:196 */                     if (i16 != i17)
/* 168:    */                     {
/* 169:197 */                       parambqe.content[(i3 + i4 * 128)] = i17;
/* 170:198 */                       parambqe.a(i3, i4);
/* 171:199 */                       i2 = 1;
/* 172:    */                     }
/* 173:    */                   }
/* 174:    */                 }
/* 175:    */               }
/* 176:    */             }
/* 177:    */           }
/* 178:    */         }
/* 179:    */       }
/* 180:    */     }
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void a(ItemStack paramamj, World paramaqu, Entity paramwv, int paramInt, boolean paramBoolean)
/* 184:    */   {
/* 185:207 */     if (paramaqu.isClient) {
/* 186:208 */       return;
/* 187:    */     }
/* 188:211 */     MapInfo localbqe = a(paramamj, paramaqu);
/* 189:212 */     if ((paramwv instanceof EntityPlayer))
/* 190:    */     {
/* 191:213 */       EntityPlayer localahd = (EntityPlayer)paramwv;
/* 192:214 */       localbqe.a(localahd, paramamj);
/* 193:    */     }
/* 194:217 */     if (paramBoolean) {
/* 195:218 */       a(paramaqu, paramwv, localbqe);
/* 196:    */     }
/* 197:    */   }
/* 198:    */   
/* 199:    */   public id<ik> c(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 200:    */   {
/* 201:225 */     return a(paramamj, paramaqu).a(paramamj, paramaqu, paramahd);
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void d(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 205:    */   {
/* 206:230 */     if ((paramamj.hasTagCompound()) && (paramamj.getTagCompound().getBoolean("map_is_scaling")))
/* 207:    */     {
/* 208:231 */       MapInfo localbqe1 = ItemList.filledMap.a(paramamj, paramaqu);
/* 209:232 */       paramamj.b(paramaqu.b("map"));
/* 210:233 */       MapInfo localbqe2 = new MapInfo("map_" + paramamj.i());
/* 211:    */       
/* 212:235 */       localbqe2.scale = ((byte)(localbqe1.scale + 1));
/* 213:236 */       if (localbqe2.scale > 4) {
/* 214:237 */         localbqe2.scale = 4;
/* 215:    */       }
/* 216:240 */       localbqe2.a(localbqe1.xCenter, localbqe1.zCenter, localbqe2.scale);
/* 217:241 */       localbqe2.dimension = localbqe1.dimension;
/* 218:242 */       localbqe2.c();
/* 219:243 */       paramaqu.a("map_" + paramamj.i(), localbqe2);
/* 220:    */     }
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void a(ItemStack paramamj, EntityPlayer paramahd, List paramList, boolean paramBoolean)
/* 224:    */   {
/* 225:249 */     MapInfo localbqe = a(paramamj, paramahd.world);
/* 226:251 */     if (paramBoolean) {
/* 227:252 */       if (localbqe == null)
/* 228:    */       {
/* 229:253 */         paramList.add("Unknown map");
/* 230:    */       }
/* 231:    */       else
/* 232:    */       {
/* 233:255 */         paramList.add("Scaling at 1:" + (1 << localbqe.scale));
/* 234:256 */         paramList.add("(Level " + localbqe.scale + "/" + 4 + ")");
/* 235:    */       }
/* 236:    */     }
/* 237:    */   }
/* 238:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amn
 * JD-Core Version:    0.7.0.1
 */