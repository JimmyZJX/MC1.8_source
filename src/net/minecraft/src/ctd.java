package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonElement;
/*   2:    */ import com.google.gson.JsonObject;
/*   3:    */ import org.lwjgl.opengl.GL14;
/*   4:    */ 
/*   5:    */ public class ctd
/*   6:    */ {
/*   7: 10 */   private static ctd a = null;
/*   8:    */   private final int b;
/*   9:    */   private final int c;
/*  10:    */   private final int d;
/*  11:    */   private final int e;
/*  12:    */   private final int f;
/*  13:    */   private final boolean g;
/*  14:    */   private final boolean h;
/*  15:    */   
/*  16:    */   private ctd(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  17:    */   {
/*  18: 21 */     this.g = paramBoolean1;
/*  19:    */     
/*  20: 23 */     this.b = paramInt1;
/*  21: 24 */     this.d = paramInt2;
/*  22:    */     
/*  23: 26 */     this.c = paramInt3;
/*  24: 27 */     this.e = paramInt4;
/*  25:    */     
/*  26: 29 */     this.h = paramBoolean2;
/*  27: 30 */     this.f = paramInt5;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public ctd()
/*  31:    */   {
/*  32: 34 */     this(false, true, 1, 0, 1, 0, 32774);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public ctd(int paramInt1, int paramInt2, int paramInt3)
/*  36:    */   {
/*  37: 38 */     this(false, false, paramInt1, paramInt2, paramInt1, paramInt2, paramInt3);
/*  38:    */   }
/*  39:    */   
/*  40:    */   public ctd(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  41:    */   {
/*  42: 42 */     this(true, false, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a()
/*  46:    */   {
/*  47: 46 */     if (equals(a)) {
/*  48: 47 */       return;
/*  49:    */     }
/*  50: 50 */     if ((a == null) || (this.h != a.b()))
/*  51:    */     {
/*  52: 51 */       a = this;
/*  53: 52 */       if (this.h)
/*  54:    */       {
/*  55: 53 */         cjm.disableBlend();
/*  56: 54 */         return;
/*  57:    */       }
/*  58: 56 */       cjm.enableBlend();
/*  59:    */     }
/*  60: 59 */     GL14.glBlendEquation(this.f);
/*  61: 61 */     if (this.g) {
/*  62: 62 */       cjm.glBlendFuncSeparate(this.b, this.d, this.c, this.e);
/*  63:    */     } else {
/*  64: 64 */       cjm.glBlendFunc(this.b, this.d);
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean equals(Object paramObject)
/*  69:    */   {
/*  70: 70 */     if (this == paramObject) {
/*  71: 71 */       return true;
/*  72:    */     }
/*  73: 73 */     if (!(paramObject instanceof ctd)) {
/*  74: 74 */       return false;
/*  75:    */     }
/*  76: 77 */     ctd localctd = (ctd)paramObject;
/*  77: 79 */     if (this.f != localctd.f) {
/*  78: 80 */       return false;
/*  79:    */     }
/*  80: 82 */     if (this.e != localctd.e) {
/*  81: 83 */       return false;
/*  82:    */     }
/*  83: 85 */     if (this.d != localctd.d) {
/*  84: 86 */       return false;
/*  85:    */     }
/*  86: 88 */     if (this.h != localctd.h) {
/*  87: 89 */       return false;
/*  88:    */     }
/*  89: 91 */     if (this.g != localctd.g) {
/*  90: 92 */       return false;
/*  91:    */     }
/*  92: 94 */     if (this.c != localctd.c) {
/*  93: 95 */       return false;
/*  94:    */     }
/*  95: 97 */     if (this.b != localctd.b) {
/*  96: 98 */       return false;
/*  97:    */     }
/*  98:101 */     return true;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public int hashCode()
/* 102:    */   {
/* 103:106 */     int i = this.b;
/* 104:107 */     i = 31 * i + this.c;
/* 105:108 */     i = 31 * i + this.d;
/* 106:109 */     i = 31 * i + this.e;
/* 107:110 */     i = 31 * i + this.f;
/* 108:111 */     i = 31 * i + (this.g ? 1 : 0);
/* 109:112 */     i = 31 * i + (this.h ? 1 : 0);
/* 110:113 */     return i;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean b()
/* 114:    */   {
/* 115:117 */     return this.h;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public static ctd a(JsonObject paramJsonObject)
/* 119:    */   {
/* 120:121 */     if (paramJsonObject == null) {
/* 121:122 */       return new ctd();
/* 122:    */     }
/* 123:124 */     int i = 32774;
/* 124:125 */     int j = 1;
/* 125:126 */     int k = 0;
/* 126:127 */     int m = 1;
/* 127:128 */     int n = 0;
/* 128:129 */     int i1 = 1;
/* 129:130 */     int i2 = 0;
/* 130:132 */     if (uh.a(paramJsonObject, "func"))
/* 131:    */     {
/* 132:133 */       i = a(paramJsonObject.get("func").getAsString());
/* 133:134 */       if (i != 32774) {
/* 134:135 */         i1 = 0;
/* 135:    */       }
/* 136:    */     }
/* 137:139 */     if (uh.a(paramJsonObject, "srcrgb"))
/* 138:    */     {
/* 139:140 */       j = b(paramJsonObject.get("srcrgb").getAsString());
/* 140:141 */       if (j != 1) {
/* 141:142 */         i1 = 0;
/* 142:    */       }
/* 143:    */     }
/* 144:146 */     if (uh.a(paramJsonObject, "dstrgb"))
/* 145:    */     {
/* 146:147 */       k = b(paramJsonObject.get("dstrgb").getAsString());
/* 147:148 */       if (k != 0) {
/* 148:149 */         i1 = 0;
/* 149:    */       }
/* 150:    */     }
/* 151:153 */     if (uh.a(paramJsonObject, "srcalpha"))
/* 152:    */     {
/* 153:154 */       m = b(paramJsonObject.get("srcalpha").getAsString());
/* 154:155 */       if (m != 1) {
/* 155:156 */         i1 = 0;
/* 156:    */       }
/* 157:158 */       i2 = 1;
/* 158:    */     }
/* 159:161 */     if (uh.a(paramJsonObject, "dstalpha"))
/* 160:    */     {
/* 161:162 */       n = b(paramJsonObject.get("dstalpha").getAsString());
/* 162:163 */       if (n != 0) {
/* 163:164 */         i1 = 0;
/* 164:    */       }
/* 165:166 */       i2 = 1;
/* 166:    */     }
/* 167:170 */     if (i1 != 0) {
/* 168:171 */       return new ctd();
/* 169:    */     }
/* 170:175 */     if (i2 != 0) {
/* 171:176 */       return new ctd(j, k, m, n, i);
/* 172:    */     }
/* 173:178 */     return new ctd(j, k, i);
/* 174:    */   }
/* 175:    */   
/* 176:    */   private static int a(String paramString)
/* 177:    */   {
/* 178:183 */     String str = paramString.trim().toLowerCase();
/* 179:185 */     if (str.equals("add")) {
/* 180:186 */       return 32774;
/* 181:    */     }
/* 182:187 */     if (str.equals("subtract")) {
/* 183:188 */       return 32778;
/* 184:    */     }
/* 185:189 */     if (str.equals("reversesubtract")) {
/* 186:190 */       return 32779;
/* 187:    */     }
/* 188:191 */     if (str.equals("reverse_subtract")) {
/* 189:192 */       return 32779;
/* 190:    */     }
/* 191:193 */     if (str.equals("min")) {
/* 192:194 */       return 32775;
/* 193:    */     }
/* 194:195 */     if (str.equals("max")) {
/* 195:196 */       return 32776;
/* 196:    */     }
/* 197:199 */     return 32774;
/* 198:    */   }
/* 199:    */   
/* 200:    */   private static int b(String paramString)
/* 201:    */   {
/* 202:203 */     String str = paramString.trim().toLowerCase();
/* 203:204 */     str = str.replaceAll("_", "");
/* 204:205 */     str = str.replaceAll("one", "1");
/* 205:206 */     str = str.replaceAll("zero", "0");
/* 206:207 */     str = str.replaceAll("minus", "-");
/* 207:209 */     if (str.equals("0")) {
/* 208:210 */       return 0;
/* 209:    */     }
/* 210:211 */     if (str.equals("1")) {
/* 211:212 */       return 1;
/* 212:    */     }
/* 213:213 */     if (str.equals("srccolor")) {
/* 214:214 */       return 768;
/* 215:    */     }
/* 216:215 */     if (str.equals("1-srccolor")) {
/* 217:216 */       return 769;
/* 218:    */     }
/* 219:217 */     if (str.equals("dstcolor")) {
/* 220:218 */       return 774;
/* 221:    */     }
/* 222:219 */     if (str.equals("1-dstcolor")) {
/* 223:220 */       return 775;
/* 224:    */     }
/* 225:221 */     if (str.equals("srcalpha")) {
/* 226:222 */       return 770;
/* 227:    */     }
/* 228:223 */     if (str.equals("1-srcalpha")) {
/* 229:224 */       return 771;
/* 230:    */     }
/* 231:225 */     if (str.equals("dstalpha")) {
/* 232:226 */       return 772;
/* 233:    */     }
/* 234:227 */     if (str.equals("1-dstalpha")) {
/* 235:228 */       return 773;
/* 236:    */     }
/* 237:230 */     return -1;
/* 238:    */   }
/* 239:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctd
 * JD-Core Version:    0.7.0.1
 */