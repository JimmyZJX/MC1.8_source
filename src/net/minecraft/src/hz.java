package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Iterators;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import java.util.Arrays;
/*   4:    */ import java.util.IllegalFormatException;
/*   5:    */ import java.util.Iterator;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.regex.Matcher;
/*   8:    */ import java.util.regex.Pattern;
/*   9:    */ 
/*  10:    */ public class hz
/*  11:    */   extends hj
/*  12:    */ {
/*  13:    */   private final String d;
/*  14:    */   private final Object[] e;
/*  15: 20 */   private final Object f = new Object();
/*  16: 21 */   private long g = -1L;
/*  17: 23 */   List<ho> b = Lists.newArrayList();
/*  18: 26 */   public static final Pattern c = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
/*  19:    */   
/*  20:    */   public hz(String paramString, Object... paramVarArgs)
/*  21:    */   {
/*  22: 29 */     this.d = paramString;
/*  23: 30 */     this.e = paramVarArgs;
/*  24: 32 */     for (Object localObject : paramVarArgs) {
/*  25: 33 */       if ((localObject instanceof ho)) {
/*  26: 34 */         ((ho)localObject).b().a(b());
/*  27:    */       }
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   synchronized void g()
/*  32:    */   {
/*  33: 41 */     synchronized (this.f)
/*  34:    */     {
/*  35: 42 */       long l = fi.a();
/*  36: 43 */       if (l == this.g) {
/*  37: 44 */         return;
/*  38:    */       }
/*  39: 46 */       this.g = l;
/*  40: 47 */       this.b.clear();
/*  41:    */     }
/*  42:    */     try
/*  43:    */     {
/*  44: 51 */       b(fi.a(this.d));
/*  45:    */     }
/*  46:    */     catch (ia localia1)
/*  47:    */     {
/*  48: 53 */       this.b.clear();
/*  49:    */       try
/*  50:    */       {
/*  51: 55 */         b(fi.b(this.d));
/*  52:    */       }
/*  53:    */       catch (ia localia2)
/*  54:    */       {
/*  55: 57 */         throw localia1;
/*  56:    */       }
/*  57:    */     }
/*  58:    */   }
/*  59:    */   
/*  60:    */   protected void b(String paramString)
/*  61:    */   {
/*  62: 63 */     int i = 0;
/*  63: 64 */     Matcher localMatcher = c.matcher(paramString);
/*  64:    */     
/*  65: 66 */     int j = 0;
/*  66: 67 */     int k = 0;
/*  67:    */     try
/*  68:    */     {
/*  69: 70 */       while (localMatcher.find(k))
/*  70:    */       {
/*  71: 71 */         int m = localMatcher.start();
/*  72: 72 */         int n = localMatcher.end();
/*  73: 75 */         if (m > k)
/*  74:    */         {
/*  75: 76 */           hy localObject1 = new hy(String.format(paramString.substring(k, m), new Object[0]));
/*  76: 77 */           ((hy)localObject1).b().a(b());
/*  77: 78 */           this.b.add(localObject1);
/*  78:    */         }
/*  79: 81 */         Object localObject1 = localMatcher.group(2);
/*  80: 82 */         String str = paramString.substring(m, n);
/*  81:    */         
/*  82: 85 */         if (("%".equals(localObject1)) && ("%%".equals(str)))
/*  83:    */         {
/*  84: 86 */           hy localObject2 = new hy("%");
/*  85: 87 */           ((hy)localObject2).b().a(b());
/*  86: 88 */           this.b.add(localObject2);
/*  87:    */         }
/*  88: 89 */         else if ("s".equals(localObject1))
/*  89:    */         {
/*  90: 90 */           String localObject2 = localMatcher.group(1);
/*  91: 91 */           int i1 = localObject2 != null ? Integer.parseInt((String)localObject2) - 1 : j++;
/*  92: 92 */           if (i1 < this.e.length) {
/*  93: 93 */             this.b.add(a(i1));
/*  94:    */           }
/*  95:    */         }
/*  96:    */         else
/*  97:    */         {
/*  98: 96 */           throw new ia(this, "Unsupported format: '" + str + "'");
/*  99:    */         }
/* 100: 99 */         k = n;
/* 101:    */       }
/* 102:103 */       if (k < paramString.length())
/* 103:    */       {
/* 104:104 */         hy localhy = new hy(String.format(paramString.substring(k), new Object[0]));
/* 105:105 */         localhy.b().a(b());
/* 106:106 */         this.b.add(localhy);
/* 107:    */       }
/* 108:    */     }
/* 109:    */     catch (IllegalFormatException localIllegalFormatException)
/* 110:    */     {
/* 111:109 */       throw new ia(this, localIllegalFormatException);
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   private ho a(int paramInt)
/* 116:    */   {
/* 117:114 */     if (paramInt >= this.e.length) {
/* 118:115 */       throw new ia(this, paramInt);
/* 119:    */     }
/* 120:118 */     Object localObject1 = this.e[paramInt];
/* 121:    */     ho localObject2;
/* 122:121 */     if ((localObject1 instanceof ho))
/* 123:    */     {
/* 124:122 */       localObject2 = (ho)localObject1;
/* 125:    */     }
/* 126:    */     else
/* 127:    */     {
/* 128:124 */       localObject2 = new hy(localObject1 == null ? "null" : localObject1.toString());
/* 129:125 */       ((ho)localObject2).b().a(b());
/* 130:    */     }
/* 131:128 */     return localObject2;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public ho a(hv paramhv)
/* 135:    */   {
/* 136:133 */     super.a(paramhv);
/* 137:135 */     for (Object localObject2 : this.e) {
/* 138:136 */       if ((localObject2 instanceof ho)) {
/* 139:137 */         ((ho)localObject2).b().a(b());
/* 140:    */       }
/* 141:    */     }
/* 142:141 */     if (this.g > -1L) {
/* 143:142 */       for (Iterator<ho> localIterator = this.b.iterator(); localIterator.hasNext();)
/* 144:    */       {
/* 145:142 */         ho localho = localIterator.next();
/* 146:143 */         localho.b().a(paramhv);
/* 147:    */       }
/* 148:    */     }
/* 149:147 */     return this;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public Iterator iterator()
/* 153:    */   {
/* 154:152 */     g();
/* 155:    */     
/* 156:154 */     return Iterators.concat(a(this.b), a(this.a));
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String e()
/* 160:    */   {
/* 161:159 */     g();
/* 162:    */     
/* 163:161 */     StringBuilder localStringBuilder = new StringBuilder();
/* 164:163 */     for (ho localho : this.b) {
/* 165:164 */       localStringBuilder.append(localho.e());
/* 166:    */     }
/* 167:167 */     return localStringBuilder.toString();
/* 168:    */   }
/* 169:    */   
/* 170:    */   public hz f()
/* 171:    */   {
/* 172:172 */     Object[] arrayOfObject = new Object[this.e.length];
/* 173:174 */     for (int i = 0; i < this.e.length; i++) {
/* 174:175 */       if ((this.e[i] instanceof ho)) {
/* 175:176 */         arrayOfObject[i] = ((ho)this.e[i]).f();
/* 176:    */       } else {
/* 177:178 */         arrayOfObject[i] = this.e[i];
/* 178:    */       }
/* 179:    */     }
/* 180:182 */     hz localhz = new hz(this.d, arrayOfObject);
/* 181:183 */     localhz.a(b().m());
/* 182:184 */     for (ho localho : a()) {
/* 183:185 */       localhz.a(localho.f());
/* 184:    */     }
/* 185:187 */     return localhz;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public boolean equals(Object paramObject)
/* 189:    */   {
/* 190:192 */     if (this == paramObject) {
/* 191:193 */       return true;
/* 192:    */     }
/* 193:196 */     if ((paramObject instanceof hz))
/* 194:    */     {
/* 195:197 */       hz localhz = (hz)paramObject;
/* 196:198 */       return (Arrays.equals(this.e, localhz.e)) && (this.d.equals(localhz.d)) && (super.equals(paramObject));
/* 197:    */     }
/* 198:201 */     return false;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public int hashCode()
/* 202:    */   {
/* 203:206 */     int i = super.hashCode();
/* 204:207 */     i = 31 * i + this.d.hashCode();
/* 205:208 */     i = 31 * i + Arrays.hashCode(this.e);
/* 206:209 */     return i;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public String toString()
/* 210:    */   {
/* 211:214 */     return "TranslatableComponent{key='" + this.d + '\'' + ", args=" + Arrays.toString(this.e) + ", siblings=" + this.a + ", style=" + b() + '}';
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String i()
/* 215:    */   {
/* 216:223 */     return this.d;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public Object[] j()
/* 220:    */   {
/* 221:227 */     return this.e;
/* 222:    */   }
/* 223:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hz
 * JD-Core Version:    0.7.0.1
 */