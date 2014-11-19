package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public enum EnumDirection
/*   6:    */   implements va
/*   7:    */ { DOWN(0,1,-1,"down",em.b,EnumAxis.Y,new fd(0,-1,0)),
				UP(1,0,-1,"up",em.a,EnumAxis.Y,new fd(0,1,0)),
				NORTH(2,3,2,"north",em.b,EnumAxis.Z,new fd(0,0,-1)),
				SOUTH(3,2,0,"south",em.a,EnumAxis.Z,new fd(0,0,1)),
				WEST(4,5,1,"west",em.b,EnumAxis.X,new fd(-1,0,0)),
				EAST(5,4,3,"east",em.a,EnumAxis.X,new fd(1,0,0));
/*   8:    */   private final int g;
/*   9:    */   private final int h;
/*  10:    */   private final int i;
/*  11:    */   private final String j;
/*  12:    */   private final EnumAxis k;
/*  13:    */   private final em l;
/*  14:    */   private final fd m;
/*  15:    */   private static final EnumDirection[] n;
/*  16:    */   private static final EnumDirection[] o;
/*  17:    */   private static final Map<String,EnumDirection> p;
/*  18:    */   
/*  19:    */   static
/*  20:    */   {
/*  21: 31 */     n = new EnumDirection[6];
/*  22: 32 */     o = new EnumDirection[4];
/*  23: 33 */     p = Maps.newHashMap();
/*  24: 36 */     for (EnumDirection localej : values())
/*  25:    */     {
/*  26: 37 */       n[localej.g] = localej;
/*  27: 39 */       if (localej.k().c()) {
/*  28: 40 */         o[localej.i] = localej;
/*  29:    */       }
/*  30: 43 */       p.put(localej.j().toLowerCase(), localej);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   private EnumDirection(int paramInt1, int paramInt2, int paramInt3, String paramString, em paramem, EnumAxis paramel, fd paramfd)
/*  35:    */   {
/*  36: 48 */     this.g = paramInt1;
/*  37: 49 */     this.i = paramInt3;
/*  38: 50 */     this.h = paramInt2;
/*  39: 51 */     this.j = paramString;
/*  40: 52 */     this.k = paramel;
/*  41: 53 */     this.l = paramem;
/*  42: 54 */     this.m = paramfd;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public int a()
/*  46:    */   {
/*  47: 58 */     return this.g;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public int b()
/*  51:    */   {
/*  52: 62 */     return this.i;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public em c()
/*  56:    */   {
/*  57: 66 */     return this.l;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public EnumDirection d()
/*  61:    */   {
/*  62: 70 */     return a(this.h);
/*  63:    */   }
/*  64:    */   
/*  65:    */   public EnumDirection a(EnumAxis paramel)
/*  66:    */   {
/*  67: 74 */     switch (ek.a[paramel.ordinal()])
/*  68:    */     {
/*  69:    */     case 1: 
/*  70: 76 */       if ((this == WEST) || (this == EAST)) {
/*  71: 77 */         return this;
/*  72:    */       }
/*  73: 79 */       return n();
/*  74:    */     case 2: 
/*  75: 82 */       if ((this == UP) || (this == DOWN)) {
/*  76: 83 */         return this;
/*  77:    */       }
/*  78: 85 */       return e();
/*  79:    */     case 3: 
/*  80: 88 */       if ((this == NORTH) || (this == SOUTH)) {
/*  81: 89 */         return this;
/*  82:    */       }
/*  83: 91 */       return p();
/*  84:    */     }
/*  85: 94 */     throw new IllegalStateException("Unable to get CW facing for axis " + paramel);
/*  86:    */   }
/*  87:    */   
/*  88:    */   public EnumDirection e()
/*  89:    */   {
/*  90:124 */     switch (ek.b[ordinal()])
/*  91:    */     {
/*  92:    */     case 1: 
/*  93:126 */       return EAST;
/*  94:    */     case 2: 
/*  95:128 */       return SOUTH;
/*  96:    */     case 3: 
/*  97:130 */       return WEST;
/*  98:    */     case 4: 
/*  99:132 */       return NORTH;
/* 100:    */     }
/* 101:134 */     throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
/* 102:    */   }
/* 103:    */   
/* 104:    */   private EnumDirection n()
/* 105:    */   {
/* 106:139 */     switch (ek.b[ordinal()])
/* 107:    */     {
/* 108:    */     case 5: 
/* 109:141 */       return NORTH;
/* 110:    */     case 1: 
/* 111:143 */       return DOWN;
/* 112:    */     case 6: 
/* 113:145 */       return SOUTH;
/* 114:    */     case 3: 
/* 115:147 */       return UP;
/* 116:    */     }
/* 117:149 */     throw new IllegalStateException("Unable to get X-rotated facing of " + this);
/* 118:    */   }
/* 119:    */   
/* 120:    */   private EnumDirection p()
/* 121:    */   {
/* 122:169 */     switch (ek.b[ordinal()])
/* 123:    */     {
/* 124:    */     case 5: 
/* 125:171 */       return EAST;
/* 126:    */     case 2: 
/* 127:173 */       return DOWN;
/* 128:    */     case 6: 
/* 129:175 */       return WEST;
/* 130:    */     case 4: 
/* 131:177 */       return UP;
/* 132:    */     }
/* 133:179 */     throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
/* 134:    */   }
/* 135:    */   
/* 136:    */   public EnumDirection f()
/* 137:    */   {
/* 138:199 */     switch (ek.b[ordinal()])
/* 139:    */     {
/* 140:    */     case 1: 
/* 141:201 */       return WEST;
/* 142:    */     case 2: 
/* 143:203 */       return NORTH;
/* 144:    */     case 3: 
/* 145:205 */       return EAST;
/* 146:    */     case 4: 
/* 147:207 */       return SOUTH;
/* 148:    */     }
/* 149:209 */     throw new IllegalStateException("Unable to get CCW facing of " + this);
/* 150:    */   }
/* 151:    */   
/* 152:    */   public int g()
/* 153:    */   {
/* 154:214 */     if (this.k == EnumAxis.X) {
/* 155:215 */       return this.l.a();
/* 156:    */     }
/* 157:217 */     return 0;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public int h()
/* 161:    */   {
/* 162:222 */     if (this.k == EnumAxis.Y) {
/* 163:223 */       return this.l.a();
/* 164:    */     }
/* 165:225 */     return 0;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public int i()
/* 169:    */   {
/* 170:230 */     if (this.k == EnumAxis.Z) {
/* 171:231 */       return this.l.a();
/* 172:    */     }
/* 173:233 */     return 0;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String j()
/* 177:    */   {
/* 178:238 */     return this.j;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public EnumAxis k()
/* 182:    */   {
/* 183:242 */     return this.k;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public static EnumDirection a(String paramString)
/* 187:    */   {
/* 188:247 */     if (paramString == null) {
/* 189:248 */       return null;
/* 190:    */     }
/* 191:250 */     return (EnumDirection)p.get(paramString.toLowerCase());
/* 192:    */   }
/* 193:    */   
/* 194:    */   public static EnumDirection a(int paramInt)
/* 195:    */   {
/* 196:254 */     return n[MathUtils.abs(paramInt % n.length)];
/* 197:    */   }
/* 198:    */   
/* 199:    */   public static EnumDirection b(int paramInt)
/* 200:    */   {
/* 201:258 */     return o[MathUtils.abs(paramInt % o.length)];
/* 202:    */   }
/* 203:    */   
/* 204:    */   public static EnumDirection a(double paramDouble)
/* 205:    */   {
/* 206:262 */     return b(MathUtils.floor(paramDouble / 90.0D + 0.5D) & 0x3);
/* 207:    */   }
/* 208:    */   
/* 209:    */   public static EnumDirection a(Random paramRandom)
/* 210:    */   {
/* 211:266 */     return values()[paramRandom.nextInt(values().length)];
/* 212:    */   }
/* 213:    */   
/* 214:    */   public static EnumDirection a(float paramFloat1, float paramFloat2, float paramFloat3)
/* 215:    */   {
/* 216:283 */     EnumDirection localObject = NORTH;
/* 217:284 */     float f1 = 1.4E-45F;
/* 218:285 */     for (EnumDirection localej : values())
/* 219:    */     {
/* 220:286 */       float f2 = paramFloat1 * localej.m.getX() + paramFloat2 * localej.m.getY() + paramFloat3 * localej.m.getZ();
/* 221:288 */       if (f2 > f1)
/* 222:    */       {
/* 223:289 */         f1 = f2;
/* 224:290 */         localObject = localej;
/* 225:    */       }
/* 226:    */     }
/* 227:293 */     return localObject;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public String toString()
/* 231:    */   {
/* 232:298 */     return this.j;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public String toString2()
/* 236:    */   {
/* 237:303 */     return this.j;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public fd m()
/* 241:    */   {
/* 242:396 */     return this.m;
/* 243:    */   }
/* 244:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ej
 * JD-Core Version:    0.7.0.1
 */