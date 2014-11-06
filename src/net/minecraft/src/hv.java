package net.minecraft.src;
/*   1:    */ public class hv
/*   2:    */ {
/*   3:    */   private hv a;
/*   4:    */   private a b;
/*   5:    */   private Boolean c;
/*   6:    */   private Boolean d;
/*   7:    */   private Boolean e;
/*   8:    */   private Boolean f;
/*   9:    */   private Boolean g;
/*  10:    */   private hm h;
/*  11:    */   private hr i;
/*  12:    */   private String j;
/*  13:    */   
/*  14:    */   public a a()
/*  15:    */   {
/*  16: 24 */     return this.b == null ? o().a() : this.b;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean b()
/*  20:    */   {
/*  21: 28 */     return this.c == null ? o().b() : this.c.booleanValue();
/*  22:    */   }
/*  23:    */   
/*  24:    */   public boolean c()
/*  25:    */   {
/*  26: 32 */     return this.d == null ? o().c() : this.d.booleanValue();
/*  27:    */   }
/*  28:    */   
/*  29:    */   public boolean d()
/*  30:    */   {
/*  31: 36 */     return this.f == null ? o().d() : this.f.booleanValue();
/*  32:    */   }
/*  33:    */   
/*  34:    */   public boolean e()
/*  35:    */   {
/*  36: 40 */     return this.e == null ? o().e() : this.e.booleanValue();
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean f()
/*  40:    */   {
/*  41: 44 */     return this.g == null ? o().f() : this.g.booleanValue();
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean g()
/*  45:    */   {
/*  46: 48 */     return (this.c == null) && (this.d == null) && (this.f == null) && (this.e == null) && (this.g == null) && (this.b == null) && (this.h == null) && (this.i == null);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public hm h()
/*  50:    */   {
/*  51: 52 */     return this.h == null ? o().h() : this.h;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public hr i()
/*  55:    */   {
/*  56: 56 */     return this.i == null ? o().i() : this.i;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String j()
/*  60:    */   {
/*  61: 60 */     return this.j == null ? o().j() : this.j;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public hv a(a parama)
/*  65:    */   {
/*  66: 64 */     this.b = parama;
/*  67: 65 */     return this;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public hv a(Boolean paramBoolean)
/*  71:    */   {
/*  72: 69 */     this.c = paramBoolean;
/*  73: 70 */     return this;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public hv b(Boolean paramBoolean)
/*  77:    */   {
/*  78: 74 */     this.d = paramBoolean;
/*  79: 75 */     return this;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public hv c(Boolean paramBoolean)
/*  83:    */   {
/*  84: 79 */     this.f = paramBoolean;
/*  85: 80 */     return this;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public hv d(Boolean paramBoolean)
/*  89:    */   {
/*  90: 84 */     this.e = paramBoolean;
/*  91: 85 */     return this;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public hv e(Boolean paramBoolean)
/*  95:    */   {
/*  96: 89 */     this.g = paramBoolean;
/*  97: 90 */     return this;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public hv a(hm paramhm)
/* 101:    */   {
/* 102: 94 */     this.h = paramhm;
/* 103: 95 */     return this;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public hv a(hr paramhr)
/* 107:    */   {
/* 108: 99 */     this.i = paramhr;
/* 109:100 */     return this;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public hv a(String paramString)
/* 113:    */   {
/* 114:104 */     this.j = paramString;
/* 115:105 */     return this;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public hv a(hv paramhv)
/* 119:    */   {
/* 120:109 */     this.a = paramhv;
/* 121:110 */     return this;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String k()
/* 125:    */   {
/* 126:114 */     if (g())
/* 127:    */     {
/* 128:115 */       if (this.a != null) {
/* 129:116 */         return this.a.k();
/* 130:    */       }
/* 131:118 */       return "";
/* 132:    */     }
/* 133:122 */     StringBuilder localStringBuilder = new StringBuilder();
/* 134:124 */     if (a() != null) {
/* 135:125 */       localStringBuilder.append(a());
/* 136:    */     }
/* 137:128 */     if (b()) {
/* 138:129 */       localStringBuilder.append(net.minecraft.src.a.r);
/* 139:    */     }
/* 140:131 */     if (c()) {
/* 141:132 */       localStringBuilder.append(net.minecraft.src.a.u);
/* 142:    */     }
/* 143:134 */     if (e()) {
/* 144:135 */       localStringBuilder.append(net.minecraft.src.a.t);
/* 145:    */     }
/* 146:137 */     if (f()) {
/* 147:138 */       localStringBuilder.append(net.minecraft.src.a.q);
/* 148:    */     }
/* 149:140 */     if (d()) {
/* 150:141 */       localStringBuilder.append(net.minecraft.src.a.s);
/* 151:    */     }
/* 152:144 */     return localStringBuilder.toString();
/* 153:    */   }
/* 154:    */   
/* 155:    */   private hv o()
/* 156:    */   {
/* 157:148 */     return this.a == null ? k : this.a;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String toString()
/* 161:    */   {
/* 162:168 */     return "Style{hasParent=" + (this.a != null) + ", color=" + this.b + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + h() + ", hoverEvent=" + i() + ", insertion=" + j() + '}';
/* 163:    */   }
/* 164:    */   
/* 165:    */   public boolean equals(Object paramObject)
/* 166:    */   {
/* 167:183 */     if (this == paramObject) {
/* 168:184 */       return true;
/* 169:    */     }
/* 170:186 */     if ((paramObject instanceof hv))
/* 171:    */     {
/* 172:187 */       hv localhv = (hv)paramObject;
/* 173:    */       
/* 174:189 */       return (b() == localhv.b()) && (a() == localhv.a()) && (c() == localhv.c()) && (f() == localhv.f()) && (d() == localhv.d()) && (e() == localhv.e()) && (h() != null ? h().equals(localhv.h()) : localhv.h() == null) && (i() != null ? i().equals(localhv.i()) : localhv.i() == null) && (j() != null ? j().equals(localhv.j()) : localhv.j() == null);
/* 175:    */     }
/* 176:200 */     return false;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public int hashCode()
/* 180:    */   {
/* 181:205 */     int m = this.b.hashCode();
/* 182:206 */     m = 31 * m + this.c.hashCode();
/* 183:207 */     m = 31 * m + this.d.hashCode();
/* 184:208 */     m = 31 * m + this.e.hashCode();
/* 185:209 */     m = 31 * m + this.f.hashCode();
/* 186:210 */     m = 31 * m + this.g.hashCode();
/* 187:211 */     m = 31 * m + this.h.hashCode();
/* 188:212 */     m = 31 * m + this.i.hashCode();
/* 189:213 */     m = 31 * m + this.j.hashCode();
/* 190:214 */     return m;
/* 191:    */   }
/* 192:    */   
/* 193:217 */   private static final hv k = new hw();
/* 194:    */   
/* 195:    */   public hv m()
/* 196:    */   {
/* 197:244 */     hv localhv = new hv();
/* 198:245 */     localhv.c = this.c;
/* 199:246 */     localhv.d = this.d;
/* 200:247 */     localhv.f = this.f;
/* 201:248 */     localhv.e = this.e;
/* 202:249 */     localhv.g = this.g;
/* 203:250 */     localhv.b = this.b;
/* 204:251 */     localhv.h = this.h;
/* 205:252 */     localhv.i = this.i;
/* 206:253 */     localhv.a = this.a;
/* 207:254 */     localhv.j = this.j;
/* 208:255 */     return localhv;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public hv n()
/* 212:    */   {
/* 213:259 */     hv localhv = new hv();
/* 214:    */     
/* 215:261 */     localhv.a(Boolean.valueOf(b()));
/* 216:262 */     localhv.b(Boolean.valueOf(c()));
/* 217:263 */     localhv.c(Boolean.valueOf(d()));
/* 218:264 */     localhv.d(Boolean.valueOf(e()));
/* 219:265 */     localhv.e(Boolean.valueOf(f()));
/* 220:266 */     localhv.a(a());
/* 221:267 */     localhv.a(h());
/* 222:268 */     localhv.a(i());
/* 223:269 */     localhv.a(j());
/* 224:    */     
/* 225:271 */     return localhv;
/* 226:    */   }
				static Boolean a(hv arg0, Boolean arg1) {return arg0.c=arg1;}
				static Boolean b(hv arg0, Boolean arg1) {return arg0.d=arg1;}
				static Boolean c(hv arg0, Boolean arg1) {return arg0.e=arg1;}
				static Boolean d(hv arg0, Boolean arg1) {return arg0.f=arg1;}
				static Boolean e(hv arg0, Boolean arg1) {return arg0.g=arg1;}
				static a a(hv arg0, a arg1) {return arg0.b=arg1;}
				static String a(hv arg0, String arg1) {return arg0.j=arg1;}
				static hm a(hv arg0, hm arg1) {return arg0.h=arg1;}
				static hr a(hv arg0, hr arg1) {return arg0.i=arg1;}
				static Boolean b(hv arg0) {return arg0.c;}
				static Boolean c(hv arg0) {return arg0.d;}
				static Boolean d(hv arg0) {return arg0.e;}
				static Boolean e(hv arg0) {return arg0.f;}
				static Boolean f(hv arg0) {return arg0.g;}
				static a g(hv arg0) {return arg0.b;}
				static String h(hv arg0) {return arg0.j;}
				static hm i(hv arg0) {return arg0.h;}
				static hr j(hv arg0) {return arg0.i;}
/* 227:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hv
 * JD-Core Version:    0.7.0.1
 */