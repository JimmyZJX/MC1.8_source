package net.minecraft.src;
/*   1:    */ public class AABB
/*   2:    */ {
/*   3:    */   public final double minX;
/*   4:    */   public final double minY;
/*   5:    */   public final double minZ;
/*   6:    */   public final double maxX;
/*   7:    */   public final double maxY;
/*   8:    */   public final double maxZ;
/*   9:    */   
/*  10:    */   public AABB(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  11:    */   {
/*  12: 11 */     this.minX = Math.min(paramDouble1, paramDouble4);
/*  13: 12 */     this.minY = Math.min(paramDouble2, paramDouble5);
/*  14: 13 */     this.minZ = Math.min(paramDouble3, paramDouble6);
/*  15: 14 */     this.maxX = Math.max(paramDouble1, paramDouble4);
/*  16: 15 */     this.maxY = Math.max(paramDouble2, paramDouble5);
/*  17: 16 */     this.maxZ = Math.max(paramDouble3, paramDouble6);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public AABB(BlockPosition paramdt1, BlockPosition paramdt2)
/*  21:    */   {
/*  22: 20 */     this.minX = paramdt1.getX();
/*  23: 21 */     this.minY = paramdt1.getY();
/*  24: 22 */     this.minZ = paramdt1.getZ();
/*  25: 23 */     this.maxX = paramdt2.getX();
/*  26: 24 */     this.maxY = paramdt2.getY();
/*  27: 25 */     this.maxZ = paramdt2.getZ();
/*  28:    */   }
/*  29:    */   
/*  30:    */   public AABB addCoord(double paramDouble1, double paramDouble2, double paramDouble3)
/*  31:    */   {
/*  32: 29 */     double d1 = this.minX;
/*  33: 30 */     double d2 = this.minY;
/*  34: 31 */     double d3 = this.minZ;
/*  35: 32 */     double d4 = this.maxX;
/*  36: 33 */     double d5 = this.maxY;
/*  37: 34 */     double d6 = this.maxZ;
/*  38: 36 */     if (paramDouble1 < 0.0D) {
/*  39: 37 */       d1 += paramDouble1;
/*  40: 38 */     } else if (paramDouble1 > 0.0D) {
/*  41: 39 */       d4 += paramDouble1;
/*  42:    */     }
/*  43: 42 */     if (paramDouble2 < 0.0D) {
/*  44: 43 */       d2 += paramDouble2;
/*  45: 44 */     } else if (paramDouble2 > 0.0D) {
/*  46: 45 */       d5 += paramDouble2;
/*  47:    */     }
/*  48: 48 */     if (paramDouble3 < 0.0D) {
/*  49: 49 */       d3 += paramDouble3;
/*  50: 50 */     } else if (paramDouble3 > 0.0D) {
/*  51: 51 */       d6 += paramDouble3;
/*  52:    */     }
/*  53: 54 */     return new AABB(d1, d2, d3, d4, d5, d6);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public AABB expand(double paramDouble1, double paramDouble2, double paramDouble3)
/*  57:    */   {
/*  58: 58 */     double d1 = this.minX - paramDouble1;
/*  59: 59 */     double d2 = this.minY - paramDouble2;
/*  60: 60 */     double d3 = this.minZ - paramDouble3;
/*  61: 61 */     double d4 = this.maxX + paramDouble1;
/*  62: 62 */     double d5 = this.maxY + paramDouble2;
/*  63: 63 */     double d6 = this.maxZ + paramDouble3;
/*  64:    */     
/*  65: 65 */     return new AABB(d1, d2, d3, d4, d5, d6);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public AABB a(AABB parambrt)
/*  69:    */   {
/*  70: 69 */     double d1 = Math.min(this.minX, parambrt.minX);
/*  71: 70 */     double d2 = Math.min(this.minY, parambrt.minY);
/*  72: 71 */     double d3 = Math.min(this.minZ, parambrt.minZ);
/*  73: 72 */     double d4 = Math.max(this.maxX, parambrt.maxX);
/*  74: 73 */     double d5 = Math.max(this.maxY, parambrt.maxY);
/*  75: 74 */     double d6 = Math.max(this.maxZ, parambrt.maxZ);
/*  76:    */     
/*  77: 76 */     return new AABB(d1, d2, d3, d4, d5, d6);
/*  78:    */   }
/*  79:    */   
/*  80:    */   public static AABB a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  81:    */   {
/*  82: 80 */     double d1 = Math.min(paramDouble1, paramDouble4);
/*  83: 81 */     double d2 = Math.min(paramDouble2, paramDouble5);
/*  84: 82 */     double d3 = Math.min(paramDouble3, paramDouble6);
/*  85: 83 */     double d4 = Math.max(paramDouble1, paramDouble4);
/*  86: 84 */     double d5 = Math.max(paramDouble2, paramDouble5);
/*  87: 85 */     double d6 = Math.max(paramDouble3, paramDouble6);
/*  88:    */     
/*  89: 87 */     return new AABB(d1, d2, d3, d4, d5, d6);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public AABB offset(double paramDouble1, double paramDouble2, double paramDouble3)
/*  93:    */   {
/*  94: 91 */     return new AABB(this.minX + paramDouble1, this.minY + paramDouble2, this.minZ + paramDouble3, this.maxX + paramDouble1, this.maxY + paramDouble2, this.maxZ + paramDouble3);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public double a(AABB parambrt, double paramDouble)
/*  98:    */   {
/*  99: 96 */     if ((parambrt.maxY <= this.minY) || (parambrt.minY >= this.maxY) || (parambrt.maxZ <= this.minZ) || (parambrt.minZ >= this.maxZ)) {
/* 100: 97 */       return paramDouble;
/* 101:    */     }
/* 102:    */     double d1;
/* 103:101 */     if ((paramDouble > 0.0D) && (parambrt.maxX <= this.minX))
/* 104:    */     {
/* 105:102 */       d1 = this.minX - parambrt.maxX;
/* 106:103 */       if (d1 < paramDouble) {
/* 107:104 */         paramDouble = d1;
/* 108:    */       }
/* 109:    */     }
/* 110:106 */     else if ((paramDouble < 0.0D) && (parambrt.minX >= this.maxX))
/* 111:    */     {
/* 112:107 */       d1 = this.maxX - parambrt.minX;
/* 113:108 */       if (d1 > paramDouble) {
/* 114:109 */         paramDouble = d1;
/* 115:    */       }
/* 116:    */     }
/* 117:113 */     return paramDouble;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public double b(AABB parambrt, double paramDouble)
/* 121:    */   {
/* 122:118 */     if ((parambrt.maxX <= this.minX) || (parambrt.minX >= this.maxX) || (parambrt.maxZ <= this.minZ) || (parambrt.minZ >= this.maxZ)) {
/* 123:119 */       return paramDouble;
/* 124:    */     }
/* 125:    */     double d1;
/* 126:123 */     if ((paramDouble > 0.0D) && (parambrt.maxY <= this.minY))
/* 127:    */     {
/* 128:124 */       d1 = this.minY - parambrt.maxY;
/* 129:125 */       if (d1 < paramDouble) {
/* 130:126 */         paramDouble = d1;
/* 131:    */       }
/* 132:    */     }
/* 133:128 */     else if ((paramDouble < 0.0D) && (parambrt.minY >= this.maxY))
/* 134:    */     {
/* 135:129 */       d1 = this.maxY - parambrt.minY;
/* 136:130 */       if (d1 > paramDouble) {
/* 137:131 */         paramDouble = d1;
/* 138:    */       }
/* 139:    */     }
/* 140:135 */     return paramDouble;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public double c(AABB parambrt, double paramDouble)
/* 144:    */   {
/* 145:140 */     if ((parambrt.maxX <= this.minX) || (parambrt.minX >= this.maxX) || (parambrt.maxY <= this.minY) || (parambrt.minY >= this.maxY)) {
/* 146:141 */       return paramDouble;
/* 147:    */     }
/* 148:    */     double d1;
/* 149:145 */     if ((paramDouble > 0.0D) && (parambrt.maxZ <= this.minZ))
/* 150:    */     {
/* 151:146 */       d1 = this.minZ - parambrt.maxZ;
/* 152:147 */       if (d1 < paramDouble) {
/* 153:148 */         paramDouble = d1;
/* 154:    */       }
/* 155:    */     }
/* 156:150 */     else if ((paramDouble < 0.0D) && (parambrt.minZ >= this.maxZ))
/* 157:    */     {
/* 158:151 */       d1 = this.maxZ - parambrt.minZ;
/* 159:152 */       if (d1 > paramDouble) {
/* 160:153 */         paramDouble = d1;
/* 161:    */       }
/* 162:    */     }
/* 163:157 */     return paramDouble;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public boolean intersectsWith(AABB parambrt)
/* 167:    */   {
/* 168:161 */     if ((parambrt.maxX <= this.minX) || (parambrt.minX >= this.maxX)) {
/* 169:162 */       return false;
/* 170:    */     }
/* 171:164 */     if ((parambrt.maxY <= this.minY) || (parambrt.minY >= this.maxY)) {
/* 172:165 */       return false;
/* 173:    */     }
/* 174:167 */     if ((parambrt.maxZ <= this.minZ) || (parambrt.minZ >= this.maxZ)) {
/* 175:168 */       return false;
/* 176:    */     }
/* 177:170 */     return true;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public boolean a(Vec3 parambrw)
/* 181:    */   {
/* 182:200 */     if ((parambrw.x <= this.minX) || (parambrw.x >= this.maxX)) {
/* 183:201 */       return false;
/* 184:    */     }
/* 185:203 */     if ((parambrw.y <= this.minY) || (parambrw.y >= this.maxY)) {
/* 186:204 */       return false;
/* 187:    */     }
/* 188:206 */     if ((parambrw.z <= this.minZ) || (parambrw.z >= this.maxZ)) {
/* 189:207 */       return false;
/* 190:    */     }
/* 191:209 */     return true;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public double a()
/* 195:    */   {
/* 196:213 */     double d1 = this.maxX - this.minX;
/* 197:214 */     double d2 = this.maxY - this.minY;
/* 198:215 */     double d3 = this.maxZ - this.minZ;
/* 199:216 */     return (d1 + d2 + d3) / 3.0D;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public AABB contract(double paramDouble1, double paramDouble2, double paramDouble3)
/* 203:    */   {
/* 204:220 */     double d1 = this.minX + paramDouble1;
/* 205:221 */     double d2 = this.minY + paramDouble2;
/* 206:222 */     double d3 = this.minZ + paramDouble3;
/* 207:223 */     double d4 = this.maxX - paramDouble1;
/* 208:224 */     double d5 = this.maxY - paramDouble2;
/* 209:225 */     double d6 = this.maxZ - paramDouble3;
/* 210:    */     
/* 211:227 */     return new AABB(d1, d2, d3, d4, d5, d6);
/* 212:    */   }
/* 213:    */   
/* 214:    */   public HitResult a(Vec3 parambrw1, Vec3 parambrw2)
/* 215:    */   {
/* 216:231 */     Vec3 localbrw1 = parambrw1.a(parambrw2, this.minX);
/* 217:232 */     Vec3 localbrw2 = parambrw1.a(parambrw2, this.maxX);
/* 218:    */     
/* 219:234 */     Vec3 localbrw3 = parambrw1.b(parambrw2, this.minY);
/* 220:235 */     Vec3 localbrw4 = parambrw1.b(parambrw2, this.maxY);
/* 221:    */     
/* 222:237 */     Vec3 localbrw5 = parambrw1.c(parambrw2, this.minZ);
/* 223:238 */     Vec3 localbrw6 = parambrw1.c(parambrw2, this.maxZ);
/* 224:240 */     if (!b(localbrw1)) {
/* 225:241 */       localbrw1 = null;
/* 226:    */     }
/* 227:243 */     if (!b(localbrw2)) {
/* 228:244 */       localbrw2 = null;
/* 229:    */     }
/* 230:246 */     if (!c(localbrw3)) {
/* 231:247 */       localbrw3 = null;
/* 232:    */     }
/* 233:249 */     if (!c(localbrw4)) {
/* 234:250 */       localbrw4 = null;
/* 235:    */     }
/* 236:252 */     if (!d(localbrw5)) {
/* 237:253 */       localbrw5 = null;
/* 238:    */     }
/* 239:255 */     if (!d(localbrw6)) {
/* 240:256 */       localbrw6 = null;
/* 241:    */     }
/* 242:259 */     Vec3 localbrw7 = null;
/* 243:261 */     if (localbrw1 != null) {
/* 244:262 */       localbrw7 = localbrw1;
/* 245:    */     }
/* 246:264 */     if ((localbrw2 != null) && ((localbrw7 == null) || (parambrw1.dist2(localbrw2) < parambrw1.dist2(localbrw7)))) {
/* 247:265 */       localbrw7 = localbrw2;
/* 248:    */     }
/* 249:267 */     if ((localbrw3 != null) && ((localbrw7 == null) || (parambrw1.dist2(localbrw3) < parambrw1.dist2(localbrw7)))) {
/* 250:268 */       localbrw7 = localbrw3;
/* 251:    */     }
/* 252:270 */     if ((localbrw4 != null) && ((localbrw7 == null) || (parambrw1.dist2(localbrw4) < parambrw1.dist2(localbrw7)))) {
/* 253:271 */       localbrw7 = localbrw4;
/* 254:    */     }
/* 255:273 */     if ((localbrw5 != null) && ((localbrw7 == null) || (parambrw1.dist2(localbrw5) < parambrw1.dist2(localbrw7)))) {
/* 256:274 */       localbrw7 = localbrw5;
/* 257:    */     }
/* 258:276 */     if ((localbrw6 != null) && ((localbrw7 == null) || (parambrw1.dist2(localbrw6) < parambrw1.dist2(localbrw7)))) {
/* 259:277 */       localbrw7 = localbrw6;
/* 260:    */     }
/* 261:280 */     if (localbrw7 == null) {
/* 262:281 */       return null;
/* 263:    */     }
/* 264:284 */     EnumDirection localej = null;
/* 265:286 */     if (localbrw7 == localbrw1) {
/* 266:287 */       localej = EnumDirection.WEST;
/* 267:288 */     } else if (localbrw7 == localbrw2) {
/* 268:289 */       localej = EnumDirection.EAST;
/* 269:290 */     } else if (localbrw7 == localbrw3) {
/* 270:291 */       localej = EnumDirection.DOWN;
/* 271:292 */     } else if (localbrw7 == localbrw4) {
/* 272:293 */       localej = EnumDirection.UP;
/* 273:294 */     } else if (localbrw7 == localbrw5) {
/* 274:295 */       localej = EnumDirection.NORTH;
/* 275:    */     } else {
/* 276:297 */       localej = EnumDirection.SOUTH;
/* 277:    */     }
/* 278:300 */     return new HitResult(localbrw7, localej);
/* 279:    */   }
/* 280:    */   
/* 281:    */   private boolean b(Vec3 parambrw)
/* 282:    */   {
/* 283:304 */     if (parambrw == null) {
/* 284:305 */       return false;
/* 285:    */     }
/* 286:307 */     return (parambrw.y >= this.minY) && (parambrw.y <= this.maxY) && (parambrw.z >= this.minZ) && (parambrw.z <= this.maxZ);
/* 287:    */   }
/* 288:    */   
/* 289:    */   private boolean c(Vec3 parambrw)
/* 290:    */   {
/* 291:311 */     if (parambrw == null) {
/* 292:312 */       return false;
/* 293:    */     }
/* 294:314 */     return (parambrw.x >= this.minX) && (parambrw.x <= this.maxX) && (parambrw.z >= this.minZ) && (parambrw.z <= this.maxZ);
/* 295:    */   }
/* 296:    */   
/* 297:    */   private boolean d(Vec3 parambrw)
/* 298:    */   {
/* 299:318 */     if (parambrw == null) {
/* 300:319 */       return false;
/* 301:    */     }
/* 302:321 */     return (parambrw.x >= this.minX) && (parambrw.x <= this.maxX) && (parambrw.y >= this.minY) && (parambrw.y <= this.maxY);
/* 303:    */   }
/* 304:    */   
/* 305:    */   public String toString()
/* 306:    */   {
/* 307:325 */     return "box[" + this.minX + ", " + this.minY + ", " + this.minZ + " -> " + this.maxX + ", " + this.maxY + ", " + this.maxZ + "]";
/* 308:    */   }
/* 309:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     brt
 * JD-Core Version:    0.7.0.1
 */