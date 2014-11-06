package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class bfb
/*   5:    */ {
/*   6: 13 */   private final List<bez> a = Lists.newArrayList();
/*   7: 14 */   private double b = 0.0D;
/*   8: 15 */   private double c = 0.0D;
/*   9: 16 */   private double d = 60000000.0D;
/*  10: 17 */   private double e = this.d;
/*  11:    */   private long f;
/*  12:    */   private long g;
/*  13: 20 */   private int h = 29999984;
/*  14: 21 */   private double i = 0.2D;
/*  15: 22 */   private double j = 5.0D;
/*  16: 23 */   private int k = 15;
/*  17: 24 */   private int l = 5;
/*  18:    */   
/*  19:    */   public boolean a(BlockPosition paramdt)
/*  20:    */   {
/*  21: 27 */     return (paramdt.getX() + 1 > b()) && (paramdt.getX() < d()) && (paramdt.getZ() + 1 > c()) && (paramdt.getZ() < e());
/*  22:    */   }
/*  23:    */   
/*  24:    */   public boolean a(ChunkID paramaqm)
/*  25:    */   {
/*  26: 31 */     return (paramaqm.e() > b()) && (paramaqm.c() < d()) && (paramaqm.f() > c()) && (paramaqm.d() < e());
/*  27:    */   }
/*  28:    */   
/*  29:    */   public boolean a(AABB parambrt)
/*  30:    */   {
/*  31: 39 */     return (parambrt.maxX > b()) && (parambrt.minX < d()) && (parambrt.maxZ > c()) && (parambrt.minZ < e());
/*  32:    */   }
/*  33:    */   
/*  34:    */   public double a(Entity paramwv)
/*  35:    */   {
/*  36: 43 */     return b(paramwv.xPos, paramwv.zPos);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public double b(double paramDouble1, double paramDouble2)
/*  40:    */   {
/*  41: 47 */     double d1 = paramDouble2 - c();
/*  42: 48 */     double d2 = e() - paramDouble2;
/*  43: 49 */     double d3 = paramDouble1 - b();
/*  44: 50 */     double d4 = d() - paramDouble1;
/*  45: 51 */     double d5 = Math.min(d3, d4);
/*  46: 52 */     d5 = Math.min(d5, d1);
/*  47: 53 */     return Math.min(d5, d2);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public bfa a()
/*  51:    */   {
/*  52: 57 */     if (this.e < this.d) {
/*  53: 58 */       return bfa.b;
/*  54:    */     }
/*  55: 59 */     if (this.e > this.d) {
/*  56: 60 */       return bfa.a;
/*  57:    */     }
/*  58: 62 */     return bfa.c;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public double b()
/*  62:    */   {
/*  63: 67 */     double d1 = f() - h() / 2.0D;
/*  64: 68 */     if (d1 < -this.h) {
/*  65: 69 */       d1 = -this.h;
/*  66:    */     }
/*  67: 71 */     return d1;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public double c()
/*  71:    */   {
/*  72: 75 */     double d1 = g() - h() / 2.0D;
/*  73: 76 */     if (d1 < -this.h) {
/*  74: 77 */       d1 = -this.h;
/*  75:    */     }
/*  76: 79 */     return d1;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public double d()
/*  80:    */   {
/*  81: 83 */     double d1 = f() + h() / 2.0D;
/*  82: 84 */     if (d1 > this.h) {
/*  83: 85 */       d1 = this.h;
/*  84:    */     }
/*  85: 87 */     return d1;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public double e()
/*  89:    */   {
/*  90: 91 */     double d1 = g() + h() / 2.0D;
/*  91: 92 */     if (d1 > this.h) {
/*  92: 93 */       d1 = this.h;
/*  93:    */     }
/*  94: 95 */     return d1;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public double f()
/*  98:    */   {
/*  99: 99 */     return this.b;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public double g()
/* 103:    */   {
/* 104:103 */     return this.c;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void c(double paramDouble1, double paramDouble2)
/* 108:    */   {
/* 109:107 */     this.b = paramDouble1;
/* 110:108 */     this.c = paramDouble2;
/* 111:110 */     for (bez localbez : k()) {
/* 112:111 */       localbez.a(this, paramDouble1, paramDouble2);
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public double h()
/* 117:    */   {
/* 118:116 */     if (a() != bfa.c)
/* 119:    */     {
/* 120:117 */       double d1 = (float)(System.currentTimeMillis() - this.g) / (float)(this.f - this.g);
/* 121:118 */       if (d1 >= 1.0D) {
/* 122:119 */         a(this.e);
/* 123:    */       } else {
/* 124:121 */         return this.d + (this.e - this.d) * d1;
/* 125:    */       }
/* 126:    */     }
/* 127:125 */     return this.d;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public long i()
/* 131:    */   {
/* 132:129 */     if (a() != bfa.c) {
/* 133:130 */       return this.f - System.currentTimeMillis();
/* 134:    */     }
/* 135:132 */     return 0L;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public double j()
/* 139:    */   {
/* 140:137 */     return this.e;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void a(double paramDouble)
/* 144:    */   {
/* 145:141 */     this.d = paramDouble;
/* 146:142 */     this.e = paramDouble;
/* 147:143 */     this.f = System.currentTimeMillis();
/* 148:144 */     this.g = this.f;
/* 149:146 */     for (bez localbez : k()) {
/* 150:147 */       localbez.a(this, paramDouble);
/* 151:    */     }
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void a(double paramDouble1, double paramDouble2, long paramLong)
/* 155:    */   {
/* 156:152 */     this.d = paramDouble1;
/* 157:153 */     this.e = paramDouble2;
/* 158:154 */     this.g = System.currentTimeMillis();
/* 159:155 */     this.f = (this.g + paramLong);
/* 160:157 */     for (bez localbez : k()) {
/* 161:158 */       localbez.a(this, paramDouble1, paramDouble2, paramLong);
/* 162:    */     }
/* 163:    */   }
/* 164:    */   
/* 165:    */   protected List<bez> k()
/* 166:    */   {
/* 167:163 */     return Lists.newArrayList(this.a);
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void a(bez parambez)
/* 171:    */   {
/* 172:167 */     this.a.add(parambez);
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void a(int paramInt)
/* 176:    */   {
/* 177:175 */     this.h = paramInt;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public int l()
/* 181:    */   {
/* 182:179 */     return this.h;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public double m()
/* 186:    */   {
/* 187:183 */     return this.j;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void b(double paramDouble)
/* 191:    */   {
/* 192:187 */     this.j = paramDouble;
/* 193:189 */     for (bez localbez : k()) {
/* 194:190 */       localbez.c(this, paramDouble);
/* 195:    */     }
/* 196:    */   }
/* 197:    */   
/* 198:    */   public double n()
/* 199:    */   {
/* 200:195 */     return this.i;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void c(double paramDouble)
/* 204:    */   {
/* 205:199 */     this.i = paramDouble;
/* 206:201 */     for (bez localbez : k()) {
/* 207:202 */       localbez.b(this, paramDouble);
/* 208:    */     }
/* 209:    */   }
/* 210:    */   
/* 211:    */   public double o()
/* 212:    */   {
/* 213:207 */     if (this.f == this.g) {
/* 214:208 */       return 0.0D;
/* 215:    */     }
/* 216:210 */     return Math.abs(this.d - this.e) / (this.f - this.g);
/* 217:    */   }
/* 218:    */   
/* 219:    */   public int p()
/* 220:    */   {
/* 221:214 */     return this.k;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void b(int paramInt)
/* 225:    */   {
/* 226:218 */     this.k = paramInt;
/* 227:220 */     for (bez localbez : k()) {
/* 228:221 */       localbez.a(this, paramInt);
/* 229:    */     }
/* 230:    */   }
/* 231:    */   
/* 232:    */   public int q()
/* 233:    */   {
/* 234:226 */     return this.l;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public void c(int paramInt)
/* 238:    */   {
/* 239:230 */     this.l = paramInt;
/* 240:232 */     for (bez localbez : k()) {
/* 241:233 */       localbez.b(this, paramInt);
/* 242:    */     }
/* 243:    */   }
/* 244:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfb
 * JD-Core Version:    0.7.0.1
 */