package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import org.apache.commons.lang3.StringUtils;
/*   5:    */ import org.apache.logging.log4j.LogManager;
/*   6:    */ import org.apache.logging.log4j.Logger;
/*   7:    */ import org.lwjgl.input.Keyboard;
/*   8:    */ import org.lwjgl.input.Mouse;
/*   9:    */ 
/*  10:    */ public class bvx
/*  11:    */   extends bxf
/*  12:    */ {
/*  13: 23 */   private static final Logger f = LogManager.getLogger();
/*  14: 29 */   private String g = "";
/*  15: 30 */   private int h = -1;
/*  16:    */   private boolean i;
/*  17:    */   private boolean r;
/*  18:    */   private int s;
/*  19: 34 */   private List<String> t = Lists.newArrayList();
/*  20:    */   protected bul a;
/*  21: 36 */   private String u = "";
/*  22:    */   
/*  23:    */   public bvx() {}
/*  24:    */   
/*  25:    */   public bvx(String paramString)
/*  26:    */   {
/*  27: 42 */     this.u = paramString;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void b()
/*  31:    */   {
/*  32: 47 */     Keyboard.enableRepeatEvents(true);
/*  33:    */     
/*  34: 49 */     this.h = this.j.q.d().c().size();
/*  35: 50 */     this.a = new bul(0, this.q, 4, this.m - 12, this.l - 4, 12);
/*  36: 51 */     this.a.f(100);
/*  37: 52 */     this.a.a(false);
/*  38: 53 */     this.a.b(true);
/*  39: 54 */     this.a.a(this.u);
/*  40: 55 */     this.a.d(false);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void m()
/*  44:    */   {
/*  45: 60 */     Keyboard.enableRepeatEvents(false);
/*  46:    */     
/*  47: 62 */     this.j.q.d().d();
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void e()
/*  51:    */   {
/*  52: 67 */     this.a.a();
/*  53:    */   }
/*  54:    */   
/*  55:    */   protected void a(char paramChar, int paramInt)
/*  56:    */   {
/*  57: 72 */     this.r = false;
/*  58: 74 */     if (paramInt == 15) {
/*  59: 75 */       a();
/*  60:    */     } else {
/*  61: 77 */       this.i = false;
/*  62:    */     }
/*  63: 80 */     if (paramInt == 1)
/*  64:    */     {
/*  65: 81 */       this.j.a((bxf)null);
/*  66:    */     }
/*  67: 82 */     else if ((paramInt == 28) || (paramInt == 156))
/*  68:    */     {
/*  69: 83 */       String str = this.a.b().trim();
/*  70: 85 */       if (str.length() > 0) {
/*  71: 86 */         f(str);
/*  72:    */       }
/*  73: 89 */       this.j.a((bxf)null);
/*  74:    */     }
/*  75: 90 */     else if (paramInt == 200)
/*  76:    */     {
/*  77: 91 */       b(-1);
/*  78:    */     }
/*  79: 92 */     else if (paramInt == 208)
/*  80:    */     {
/*  81: 93 */       b(1);
/*  82:    */     }
/*  83: 94 */     else if (paramInt == 201)
/*  84:    */     {
/*  85: 95 */       this.j.q.d().b(this.j.q.d().i() - 1);
/*  86:    */     }
/*  87: 96 */     else if (paramInt == 209)
/*  88:    */     {
/*  89: 97 */       this.j.q.d().b(-this.j.q.d().i() + 1);
/*  90:    */     }
/*  91:    */     else
/*  92:    */     {
/*  93: 99 */       this.a.a(paramChar, paramInt);
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void k()
/*  98:    */   {
/*  99:105 */     super.k();
/* 100:    */     
/* 101:107 */     int j = Mouse.getEventDWheel();
/* 102:109 */     if (j != 0)
/* 103:    */     {
/* 104:110 */       if (j > 1) {
/* 105:111 */         j = 1;
/* 106:    */       }
/* 107:113 */       if (j < -1) {
/* 108:114 */         j = -1;
/* 109:    */       }
/* 110:116 */       if (!r()) {
/* 111:117 */         j *= 7;
/* 112:    */       }
/* 113:119 */       this.j.q.d().b(j);
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 118:    */   {
/* 119:125 */     if (paramInt3 == 0)
/* 120:    */     {
/* 121:126 */       ho localho = this.j.q.d().a(Mouse.getX(), Mouse.getY());
/* 122:127 */       if (a(localho)) {
/* 123:128 */         return;
/* 124:    */       }
/* 125:    */     }
/* 126:132 */     this.a.a(paramInt1, paramInt2, paramInt3);
/* 127:133 */     super.a(paramInt1, paramInt2, paramInt3);
/* 128:    */   }
/* 129:    */   
/* 130:    */   protected void a(String paramString, boolean paramBoolean)
/* 131:    */   {
/* 132:138 */     if (paramBoolean) {
/* 133:139 */       this.a.a(paramString);
/* 134:    */     } else {
/* 135:141 */       this.a.b(paramString);
/* 136:    */     }
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void a()
/* 140:    */   {
/* 141:    */     
/* 142:    */     String str;
/* 143:146 */     if (this.i)
/* 144:    */     {
/* 145:147 */       this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
/* 146:148 */       if (this.s >= this.t.size()) {
/* 147:149 */         this.s = 0;
/* 148:    */       }
/* 149:    */     }
/* 150:    */     else
/* 151:    */     {
/* 152:152 */       int j = this.a.a(-1, this.a.i(), false);
/* 153:    */       
/* 154:154 */       this.t.clear();
/* 155:155 */       this.s = 0;
/* 156:156 */       String localObject = this.a.b().substring(j).toLowerCase();
/* 157:157 */       str = this.a.b().substring(0, this.a.i());
/* 158:    */       
/* 159:159 */       a(str, (String)localObject);
/* 160:161 */       if (this.t.isEmpty()) {
/* 161:162 */         return;
/* 162:    */       }
/* 163:165 */       this.i = true;
/* 164:    */       
/* 165:167 */       this.a.b(j - this.a.i());
/* 166:    */     }
/* 167:170 */     if (this.t.size() > 1)
/* 168:    */     {
/* 169:171 */       StringBuilder localStringBuilder = new StringBuilder();
/* 170:173 */       for (Iterator<String> localObject = this.t.iterator(); localObject.hasNext();)
/* 171:    */       {
/* 172:173 */         str = (String)(localObject).next();
/* 173:174 */         if (localStringBuilder.length() > 0) {
/* 174:175 */           localStringBuilder.append(", ");
/* 175:    */         }
/* 176:177 */         localStringBuilder.append(str);
/* 177:    */       }
/* 178:180 */       this.j.q.d().a(new hy(localStringBuilder.toString()), 1);
/* 179:    */     }
/* 180:183 */     this.a.b((String)this.t.get(this.s++));
/* 181:    */   }
/* 182:    */   
/* 183:    */   private void a(String paramString1, String paramString2)
/* 184:    */   {
/* 185:187 */     if (paramString1.length() < 1) {
/* 186:188 */       return;
/* 187:    */     }
/* 188:191 */     BlockPosition localdt = null;
/* 189:192 */     if ((this.j.s != null) && (this.j.s.a == brv.BLOCK)) {
/* 190:193 */       localdt = this.j.s.a();
/* 191:    */     }
/* 192:196 */     this.j.h.a.a(new lt(paramString1, localdt));
/* 193:197 */     this.r = true;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void b(int paramInt)
/* 197:    */   {
/* 198:201 */     int j = this.h + paramInt;
/* 199:202 */     int k = this.j.q.d().c().size();
/* 200:    */     
/* 201:204 */     j = MathUtils.clamp(j, 0, k);
/* 202:205 */     if (j == this.h) {
/* 203:206 */       return;
/* 204:    */     }
/* 205:209 */     if (j == k)
/* 206:    */     {
/* 207:210 */       this.h = k;
/* 208:211 */       this.a.a(this.g);
/* 209:212 */       return;
/* 210:    */     }
/* 211:213 */     if (this.h == k) {
/* 212:214 */       this.g = this.a.b();
/* 213:    */     }
/* 214:217 */     this.a.a((String)this.j.q.d().c().get(j));
/* 215:218 */     this.h = j;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 219:    */   {
/* 220:223 */     a(2, this.m - 14, this.l - 2, this.m - 2, -2147483648);
/* 221:224 */     this.a.g();
/* 222:    */     
/* 223:226 */     ho localho = this.j.q.d().a(Mouse.getX(), Mouse.getY());
/* 224:227 */     if ((localho != null) && (localho.b().i() != null)) {
/* 225:228 */       a(localho, paramInt1, paramInt2);
/* 226:    */     }
/* 227:231 */     super.a(paramInt1, paramInt2, paramFloat);
/* 228:    */   }
/* 229:    */   
/* 230:    */   public void a(String[] paramArrayOfString)
/* 231:    */   {
/* 232:235 */     if (this.r)
/* 233:    */     {
/* 234:236 */       this.i = false;
/* 235:237 */       this.t.clear();
/* 236:239 */       for (String localObject2 : paramArrayOfString) {
/* 237:240 */         if (localObject2.length() > 0) {
/* 238:241 */           this.t.add(localObject2);
/* 239:    */         }
/* 240:    */       }
/* 241:245 */       String localString = this.a.b().substring(this.a.a(-1, this.a.i(), false));
/* 242:246 */       String str = StringUtils.getCommonPrefix(paramArrayOfString);
/* 243:248 */       if ((str.length() > 0) && (!localString.equalsIgnoreCase(str)))
/* 244:    */       {
/* 245:249 */         this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
/* 246:250 */         this.a.b(str);
/* 247:    */       }
/* 248:251 */       else if (this.t.size() > 0)
/* 249:    */       {
/* 250:252 */         this.i = true;
/* 251:253 */         a();
/* 252:    */       }
/* 253:    */     }
/* 254:    */   }
/* 255:    */   
/* 256:    */   public boolean d()
/* 257:    */   {
/* 258:260 */     return false;
/* 259:    */   }
/* 260:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvx
 * JD-Core Version:    0.7.0.1
 */