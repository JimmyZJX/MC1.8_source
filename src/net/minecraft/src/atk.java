package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class atk
/*   5:    */ {
/*   6:    */   private final World b;
/*   7:    */   private final BlockPosition c;
/*   8:    */   private final ati d;
/*   9:    */   private Block e;
/*  10:    */   private final boolean f;
/*  11: 42 */   private final List<BlockPosition> g = Lists.newArrayList();
				private final ati a;
/*  12:    */   
/*  13:    */   public atk(ati paramati, World paramaqu, BlockPosition paramdt, Block parambec)
/*  14:    */   {
				  a=paramati;
/*  15: 45 */     this.b = paramaqu;
/*  16: 46 */     this.c = paramdt;
/*  17: 47 */     this.e = parambec;
/*  18: 48 */     this.d = ((ati)parambec.getProto());
/*  19: 49 */     EnumRailState localatl = (EnumRailState)parambec.getProperty(paramati.l());
/*  20: 50 */     this.f = this.d.a;
/*  21: 51 */     a(localatl);
/*  22:    */   }
/*  23:    */   
/*  24:    */   private void a(EnumRailState paramatl)
/*  25:    */   {
/*  26: 55 */     this.g.clear();
/*  27: 56 */     switch (atj.a[paramatl.ordinal()])
/*  28:    */     {
/*  29:    */     case 1: 
/*  30: 58 */       this.g.add(this.c.north());
/*  31: 59 */       this.g.add(this.c.south());
/*  32: 60 */       break;
/*  33:    */     case 2: 
/*  34: 62 */       this.g.add(this.c.west());
/*  35: 63 */       this.g.add(this.c.east());
/*  36: 64 */       break;
/*  37:    */     case 3: 
/*  38: 66 */       this.g.add(this.c.west());
/*  39: 67 */       this.g.add(this.c.east().up());
/*  40: 68 */       break;
/*  41:    */     case 4: 
/*  42: 70 */       this.g.add(this.c.west().up());
/*  43: 71 */       this.g.add(this.c.east());
/*  44: 72 */       break;
/*  45:    */     case 5: 
/*  46: 74 */       this.g.add(this.c.north().up());
/*  47: 75 */       this.g.add(this.c.south());
/*  48: 76 */       break;
/*  49:    */     case 6: 
/*  50: 78 */       this.g.add(this.c.north());
/*  51: 79 */       this.g.add(this.c.south().up());
/*  52: 80 */       break;
/*  53:    */     case 7: 
/*  54: 82 */       this.g.add(this.c.east());
/*  55: 83 */       this.g.add(this.c.south());
/*  56: 84 */       break;
/*  57:    */     case 8: 
/*  58: 86 */       this.g.add(this.c.west());
/*  59: 87 */       this.g.add(this.c.south());
/*  60: 88 */       break;
/*  61:    */     case 9: 
/*  62: 90 */       this.g.add(this.c.west());
/*  63: 91 */       this.g.add(this.c.north());
/*  64: 92 */       break;
/*  65:    */     case 10: 
/*  66: 94 */       this.g.add(this.c.east());
/*  67: 95 */       this.g.add(this.c.north());
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   private void c()
/*  72:    */   {
/*  73:101 */     for (int i = 0; i < this.g.size(); i++)
/*  74:    */     {
/*  75:102 */       atk localatk = b((BlockPosition)this.g.get(i));
/*  76:103 */       if ((localatk == null) || (!localatk.a(this))) {
/*  77:104 */         this.g.remove(i--);
/*  78:    */       } else {
/*  79:106 */         this.g.set(i, localatk.c);
/*  80:    */       }
/*  81:    */     }
/*  82:    */   }
/*  83:    */   
/*  84:    */   private boolean a(BlockPosition paramdt)
/*  85:    */   {
/*  86:112 */     return (ati.d(this.b, paramdt)) || (ati.d(this.b, paramdt.up())) || (ati.d(this.b, paramdt.down()));
/*  87:    */   }
/*  88:    */   
/*  89:    */   private atk b(BlockPosition paramdt)
/*  90:    */   {
/*  91:117 */     BlockPosition localdt = paramdt;
/*  92:118 */     Block localbec = this.b.getBlock(localdt);
/*  93:119 */     if (ati.d(localbec)) {
/*  94:120 */       return new atk(this.a, this.b, localdt, localbec);
/*  95:    */     }
/*  96:123 */     localdt = paramdt.up();
/*  97:124 */     localbec = this.b.getBlock(localdt);
/*  98:125 */     if (ati.d(localbec)) {
/*  99:126 */       return new atk(this.a, this.b, localdt, localbec);
/* 100:    */     }
/* 101:129 */     localdt = paramdt.down();
/* 102:130 */     localbec = this.b.getBlock(localdt);
/* 103:131 */     if (ati.d(localbec)) {
/* 104:132 */       return new atk(this.a, this.b, localdt, localbec);
/* 105:    */     }
/* 106:135 */     return null;
/* 107:    */   }
/* 108:    */   
/* 109:    */   private boolean a(atk paramatk)
/* 110:    */   {
/* 111:139 */     return c(paramatk.c);
/* 112:    */   }
/* 113:    */   
/* 114:    */   private boolean c(BlockPosition paramdt)
/* 115:    */   {
/* 116:143 */     for (int i = 0; i < this.g.size(); i++)
/* 117:    */     {
/* 118:144 */       BlockPosition localdt = (BlockPosition)this.g.get(i);
/* 119:145 */       if ((localdt.getX() == paramdt.getX()) && (localdt.getZ() == paramdt.getZ())) {
/* 120:146 */         return true;
/* 121:    */       }
/* 122:    */     }
/* 123:149 */     return false;
/* 124:    */   }
/* 125:    */   
/* 126:    */   protected int a()
/* 127:    */   {
/* 128:153 */     int i = 0;
/* 129:155 */     for (EnumDirection localej : en.HORIZONTAL) {
/* 130:156 */       if (a(this.c.a(localej))) {
/* 131:157 */         i++;
/* 132:    */       }
/* 133:    */     }
/* 134:161 */     return i;
/* 135:    */   }
/* 136:    */   
/* 137:    */   private boolean b(atk paramatk)
/* 138:    */   {
/* 139:165 */     return (a(paramatk)) || (this.g.size() != 2);
/* 140:    */   }
/* 141:    */   
/* 142:    */   private void c(atk paramatk)
/* 143:    */   {
/* 144:169 */     this.g.add(paramatk.c);
/* 145:    */     
/* 146:171 */     BlockPosition localdt1 = this.c.north();
/* 147:172 */     BlockPosition localdt2 = this.c.south();
/* 148:173 */     BlockPosition localdt3 = this.c.west();
/* 149:174 */     BlockPosition localdt4 = this.c.east();
/* 150:    */     
/* 151:176 */     boolean bool1 = c(localdt1);
/* 152:177 */     boolean bool2 = c(localdt2);
/* 153:178 */     boolean bool3 = c(localdt3);
/* 154:179 */     boolean bool4 = c(localdt4);
/* 155:    */     
/* 156:181 */     EnumRailState localatl = null;
/* 157:183 */     if ((bool1) || (bool2)) {
/* 158:184 */       localatl = EnumRailState.a;
/* 159:    */     }
/* 160:186 */     if ((bool3) || (bool4)) {
/* 161:187 */       localatl = EnumRailState.b;
/* 162:    */     }
/* 163:189 */     if (!this.f)
/* 164:    */     {
/* 165:190 */       if ((bool2) && (bool4) && (!bool1) && (!bool3)) {
/* 166:191 */         localatl = EnumRailState.g;
/* 167:    */       }
/* 168:193 */       if ((bool2) && (bool3) && (!bool1) && (!bool4)) {
/* 169:194 */         localatl = EnumRailState.h;
/* 170:    */       }
/* 171:196 */       if ((bool1) && (bool3) && (!bool2) && (!bool4)) {
/* 172:197 */         localatl = EnumRailState.i;
/* 173:    */       }
/* 174:199 */       if ((bool1) && (bool4) && (!bool2) && (!bool3)) {
/* 175:200 */         localatl = EnumRailState.j;
/* 176:    */       }
/* 177:    */     }
/* 178:203 */     if (localatl == EnumRailState.a)
/* 179:    */     {
/* 180:204 */       if (ati.d(this.b, localdt1.up())) {
/* 181:205 */         localatl = EnumRailState.e;
/* 182:    */       }
/* 183:207 */       if (ati.d(this.b, localdt2.up())) {
/* 184:208 */         localatl = EnumRailState.f;
/* 185:    */       }
/* 186:    */     }
/* 187:211 */     if (localatl == EnumRailState.b)
/* 188:    */     {
/* 189:212 */       if (ati.d(this.b, localdt4.up())) {
/* 190:213 */         localatl = EnumRailState.c;
/* 191:    */       }
/* 192:215 */       if (ati.d(this.b, localdt3.up())) {
/* 193:216 */         localatl = EnumRailState.d;
/* 194:    */       }
/* 195:    */     }
/* 196:220 */     if (localatl == null) {
/* 197:221 */       localatl = EnumRailState.a;
/* 198:    */     }
/* 199:224 */     this.e = this.e.a(this.d.l(), localatl);
/* 200:225 */     this.b.setBlock(this.c, this.e, 3);
/* 201:    */   }
/* 202:    */   
/* 203:    */   private boolean d(BlockPosition paramdt)
/* 204:    */   {
/* 205:229 */     atk localatk = b(paramdt);
/* 206:230 */     if (localatk == null) {
/* 207:231 */       return false;
/* 208:    */     }
/* 209:234 */     localatk.c();
/* 210:235 */     return localatk.b(this);
/* 211:    */   }
/* 212:    */   
/* 213:    */   public atk a(boolean paramBoolean1, boolean paramBoolean2)
/* 214:    */   {
/* 215:239 */     BlockPosition localdt1 = this.c.north();
/* 216:240 */     BlockPosition localdt2 = this.c.south();
/* 217:241 */     BlockPosition localdt3 = this.c.west();
/* 218:242 */     BlockPosition localdt4 = this.c.east();
/* 219:    */     
/* 220:244 */     boolean bool1 = d(localdt1);
/* 221:245 */     boolean bool2 = d(localdt2);
/* 222:246 */     boolean bool3 = d(localdt3);
/* 223:247 */     boolean bool4 = d(localdt4);
/* 224:    */     
/* 225:249 */     EnumRailState localatl = null;
/* 226:251 */     if (((bool1) || (bool2)) && (!bool3) && (!bool4)) {
/* 227:252 */       localatl = EnumRailState.a;
/* 228:    */     }
/* 229:254 */     if (((bool3) || (bool4)) && (!bool1) && (!bool2)) {
/* 230:255 */       localatl = EnumRailState.b;
/* 231:    */     }
/* 232:258 */     if (!this.f)
/* 233:    */     {
/* 234:259 */       if ((bool2) && (bool4) && (!bool1) && (!bool3)) {
/* 235:260 */         localatl = EnumRailState.g;
/* 236:    */       }
/* 237:262 */       if ((bool2) && (bool3) && (!bool1) && (!bool4)) {
/* 238:263 */         localatl = EnumRailState.h;
/* 239:    */       }
/* 240:265 */       if ((bool1) && (bool3) && (!bool2) && (!bool4)) {
/* 241:266 */         localatl = EnumRailState.i;
/* 242:    */       }
/* 243:268 */       if ((bool1) && (bool4) && (!bool2) && (!bool3)) {
/* 244:269 */         localatl = EnumRailState.j;
/* 245:    */       }
/* 246:    */     }
/* 247:272 */     if (localatl == null)
/* 248:    */     {
/* 249:273 */       if ((bool1) || (bool2)) {
/* 250:274 */         localatl = EnumRailState.a;
/* 251:    */       }
/* 252:276 */       if ((bool3) || (bool4)) {
/* 253:277 */         localatl = EnumRailState.b;
/* 254:    */       }
/* 255:280 */       if (!this.f) {
/* 256:281 */         if (paramBoolean1)
/* 257:    */         {
/* 258:282 */           if ((bool2) && (bool4)) {
/* 259:283 */             localatl = EnumRailState.g;
/* 260:    */           }
/* 261:285 */           if ((bool3) && (bool2)) {
/* 262:286 */             localatl = EnumRailState.h;
/* 263:    */           }
/* 264:288 */           if ((bool4) && (bool1)) {
/* 265:289 */             localatl = EnumRailState.j;
/* 266:    */           }
/* 267:291 */           if ((bool1) && (bool3)) {
/* 268:292 */             localatl = EnumRailState.i;
/* 269:    */           }
/* 270:    */         }
/* 271:    */         else
/* 272:    */         {
/* 273:295 */           if ((bool1) && (bool3)) {
/* 274:296 */             localatl = EnumRailState.i;
/* 275:    */           }
/* 276:298 */           if ((bool4) && (bool1)) {
/* 277:299 */             localatl = EnumRailState.j;
/* 278:    */           }
/* 279:301 */           if ((bool3) && (bool2)) {
/* 280:302 */             localatl = EnumRailState.h;
/* 281:    */           }
/* 282:304 */           if ((bool2) && (bool4)) {
/* 283:305 */             localatl = EnumRailState.g;
/* 284:    */           }
/* 285:    */         }
/* 286:    */       }
/* 287:    */     }
/* 288:311 */     if (localatl == EnumRailState.a)
/* 289:    */     {
/* 290:312 */       if (ati.d(this.b, localdt1.up())) {
/* 291:313 */         localatl = EnumRailState.e;
/* 292:    */       }
/* 293:315 */       if (ati.d(this.b, localdt2.up())) {
/* 294:316 */         localatl = EnumRailState.f;
/* 295:    */       }
/* 296:    */     }
/* 297:319 */     if (localatl == EnumRailState.b)
/* 298:    */     {
/* 299:320 */       if (ati.d(this.b, localdt4.up())) {
/* 300:321 */         localatl = EnumRailState.c;
/* 301:    */       }
/* 302:323 */       if (ati.d(this.b, localdt3.up())) {
/* 303:324 */         localatl = EnumRailState.d;
/* 304:    */       }
/* 305:    */     }
/* 306:328 */     if (localatl == null) {
/* 307:329 */       localatl = EnumRailState.a;
/* 308:    */     }
/* 309:332 */     a(localatl);
/* 310:333 */     this.e = this.e.a(this.d.l(), localatl);
/* 311:335 */     if ((paramBoolean2) || (this.b.getBlock(this.c) != this.e))
/* 312:    */     {
/* 313:336 */       this.b.setBlock(this.c, this.e, 3);
/* 314:338 */       for (int i = 0; i < this.g.size(); i++)
/* 315:    */       {
/* 316:339 */         atk localatk = b((BlockPosition)this.g.get(i));
/* 317:340 */         if (localatk != null)
/* 318:    */         {
/* 319:343 */           localatk.c();
/* 320:345 */           if (localatk.b(this)) {
/* 321:346 */             localatk.c(this);
/* 322:    */           }
/* 323:    */         }
/* 324:    */       }
/* 325:    */     }
/* 326:351 */     return this;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public Block b()
/* 330:    */   {
/* 331:355 */     return this.e;
/* 332:    */   }
/* 333:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     atk
 * JD-Core Version:    0.7.0.1
 */