package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Stack;
/*   3:    */ import java.util.regex.Matcher;
/*   4:    */ import java.util.regex.Pattern;

/*   5:    */ import org.apache.logging.log4j.LogManager;
/*   6:    */ import org.apache.logging.log4j.Logger;
/*   7:    */ 
/*   8:    */ public class gg
/*   9:    */ {
/*  10: 14 */   private static final Logger a = LogManager.getLogger();
/*  11: 19 */   private static final Pattern b = Pattern.compile("\\[[-+\\d|,\\s]+\\]");
/*  12:    */   
/*  13:    */   public static NBTTagCompound a(String paramString) throws gf
/*  14:    */   {
/*  15: 22 */     paramString = paramString.trim();
/*  16: 24 */     if (!paramString.startsWith("{")) {
/*  17: 25 */       throw new gf("Invalid tag encountered, expected '{' as first char.");
/*  18:    */     }
/*  19: 28 */     if (b(paramString) != 1) {
/*  20: 29 */       throw new gf("Encountered multiple top tags, only one expected");
/*  21:    */     }
/*  22: 32 */     return (NBTTagCompound)a("tag", paramString).a();
/*  23:    */   }
/*  24:    */   
/*  25:    */   static int b(String paramString) throws gf
/*  26:    */   {
/*  27: 36 */     int i = 0;
/*  28: 37 */     int j = 0;
/*  29: 38 */     Stack localStack = new Stack();
/*  30:    */     
/*  31: 40 */     int k = 0;
/*  32: 41 */     while (k < paramString.length())
/*  33:    */     {
/*  34: 42 */       char c = paramString.charAt(k);
/*  35: 43 */       if (c == '"')
/*  36:    */       {
/*  37: 44 */         if (b(paramString, k))
/*  38:    */         {
/*  39: 45 */           if (j == 0) {
/*  40: 46 */             throw new gf("Illegal use of \\\": " + paramString);
/*  41:    */           }
/*  42:    */         }
/*  43:    */         else {
/*  44: 49 */           j = j == 0 ? 1 : 0;
/*  45:    */         }
/*  46:    */       }
/*  47: 51 */       else if (j == 0) {
/*  48: 52 */         if ((c == '{') || (c == '['))
/*  49:    */         {
/*  50: 53 */           if (localStack.isEmpty()) {
/*  51: 54 */             i++;
/*  52:    */           }
/*  53: 56 */           localStack.push(Character.valueOf(c));
/*  54:    */         }
/*  55:    */         else
/*  56:    */         {
/*  57: 57 */           if ((c == '}') && ((localStack.isEmpty()) || (((Character)localStack.pop()).charValue() != '{'))) {
/*  58: 58 */             throw new gf("Unbalanced curly brackets {}: " + paramString);
/*  59:    */           }
/*  60: 59 */           if ((c == ']') && ((localStack.isEmpty()) || (((Character)localStack.pop()).charValue() != '['))) {
/*  61: 60 */             throw new gf("Unbalanced square brackets []: " + paramString);
/*  62:    */           }
/*  63:    */         }
/*  64:    */       }
/*  65: 63 */       k++;
/*  66:    */     }
/*  67: 65 */     if (j != 0) {
/*  68: 66 */       throw new gf("Unbalanced quotation: " + paramString);
/*  69:    */     }
/*  70: 68 */     if (!localStack.isEmpty()) {
/*  71: 69 */       throw new gf("Unbalanced brackets: " + paramString);
/*  72:    */     }
/*  73: 72 */     if ((i == 0) && (!paramString.isEmpty())) {
/*  74: 73 */       i = 1;
/*  75:    */     }
/*  76: 76 */     return i;
/*  77:    */   }
/*  78:    */   
/*  79:    */   static gh a(String... paramVarArgs) throws gf
/*  80:    */   {
/*  81: 80 */     return a(paramVarArgs[0], paramVarArgs[1]);
/*  82:    */   }
/*  83:    */   
/*  84:    */   static gh a(String paramString1, String paramString2) throws gf
/*  85:    */   {
/*  86: 84 */     paramString2 = paramString2.trim();
/*  87:    */     gh localObject;
/*  88:    */     String str;
/*  89:    */     int i;
/*  90: 86 */     if (paramString2.startsWith("{"))
/*  91:    */     {
/*  92: 87 */       paramString2 = paramString2.substring(1, paramString2.length() - 1);
/*  93:    */       
/*  94: 89 */       localObject = new gi(paramString1);
/*  95: 90 */       while (paramString2.length() > 0)
/*  96:    */       {
/*  97: 91 */         str = b(paramString2, true);
/*  98: 92 */         if (str.length() > 0)
/*  99:    */         {
/* 100: 93 */           boolean bool = false;
/* 101: 94 */           ((gi)localObject).b.add(a(str, bool));
/* 102:    */         }
/* 103: 97 */         if (paramString2.length() < str.length() + 1) {
/* 104:    */           break;
/* 105:    */         }
/* 106:101 */         i = paramString2.charAt(str.length());
/* 107:102 */         if ((i != 44) && (i != 123) && (i != 125) && (i != 91) && (i != 93)) {
/* 108:103 */           throw new gf("Unexpected token '" + i + "' at: " + paramString2.substring(str.length()));
/* 109:    */         }
/* 110:105 */         paramString2 = paramString2.substring(str.length() + 1);
/* 111:    */       }
/* 112:108 */       return localObject;
/* 113:    */     }
/* 114:109 */     if ((paramString2.startsWith("[")) && (!b.matcher(paramString2).matches()))
/* 115:    */     {
/* 116:110 */       paramString2 = paramString2.substring(1, paramString2.length() - 1);
/* 117:    */       
/* 118:112 */       localObject = new gj(paramString1);
/* 119:113 */       while (paramString2.length() > 0)
/* 120:    */       {
/* 121:114 */         str = b(paramString2, false);
/* 122:115 */         if (str.length() > 0)
/* 123:    */         {
/* 124:116 */           boolean i1 = true;
/* 125:117 */           ((gj)localObject).b.add(a(str, i1));
/* 126:    */         }
/* 127:120 */         if (paramString2.length() < str.length() + 1) {
/* 128:    */           break;
/* 129:    */         }
/* 130:124 */         char c = paramString2.charAt(str.length());
/* 131:125 */         if ((c != ',') && (c != '{') && (c != '}') && (c != '[') && (c != ']')) {
/* 132:126 */           throw new gf("Unexpected token '" + c + "' at: " + paramString2.substring(str.length()));
/* 133:    */         }
/* 134:128 */         paramString2 = paramString2.substring(str.length() + 1);
/* 135:    */       }
/* 136:131 */       return localObject;
/* 137:    */     }
/* 138:134 */     return new gk(paramString1, paramString2);
/* 139:    */   }
/* 140:    */   
/* 141:    */   private static gh a(String paramString, boolean paramBoolean) throws gf
/* 142:    */   {
/* 143:138 */     String str1 = c(paramString, paramBoolean);
/* 144:139 */     String str2 = d(paramString, paramBoolean);
/* 145:140 */     return a(new String[] { str1, str2 });
/* 146:    */   }
/* 147:    */   
/* 148:    */   private static String b(String paramString, boolean paramBoolean) throws gf
/* 149:    */   {
/* 150:146 */     int i = a(paramString, ':');
/* 151:147 */     int j = a(paramString, ',');
/* 152:149 */     if (paramBoolean)
/* 153:    */     {
/* 154:150 */       if (i == -1) {
/* 155:151 */         throw new gf("Unable to locate name/value separator for string: " + paramString);
/* 156:    */       }
/* 157:153 */       if ((j != -1) && (j < i)) {
/* 158:154 */         throw new gf("Name error at: " + paramString);
/* 159:    */       }
/* 160:    */     }
/* 161:157 */     else if ((i == -1) || (i > j))
/* 162:    */     {
/* 163:158 */       i = -1;
/* 164:    */     }
/* 165:162 */     return a(paramString, i);
/* 166:    */   }
/* 167:    */   
/* 168:    */   private static String a(String paramString, int paramInt) throws gf
/* 169:    */   {
/* 170:166 */     Stack localStack = new Stack();
/* 171:167 */     int i = paramInt + 1;
/* 172:168 */     int j = 0;
/* 173:169 */     int k = 0;
/* 174:170 */     int m = 0;
/* 175:171 */     int n = 0;
/* 176:173 */     while (i < paramString.length())
/* 177:    */     {
/* 178:174 */       char c = paramString.charAt(i);
/* 179:176 */       if (c == '"')
/* 180:    */       {
/* 181:177 */         if (b(paramString, i))
/* 182:    */         {
/* 183:178 */           if (j == 0) {
/* 184:179 */             throw new gf("Illegal use of \\\": " + paramString);
/* 185:    */           }
/* 186:    */         }
/* 187:    */         else
/* 188:    */         {
/* 189:182 */           j = j == 0 ? 1 : 0;
/* 190:183 */           if ((j != 0) && (m == 0)) {
/* 191:184 */             k = 1;
/* 192:    */           }
/* 193:186 */           if (j == 0) {
/* 194:187 */             n = i;
/* 195:    */           }
/* 196:    */         }
/* 197:    */       }
/* 198:190 */       else if (j == 0) {
/* 199:191 */         if ((c == '{') || (c == '['))
/* 200:    */         {
/* 201:192 */           localStack.push(Character.valueOf(c));
/* 202:    */         }
/* 203:    */         else
/* 204:    */         {
/* 205:193 */           if ((c == '}') && ((localStack.isEmpty()) || (((Character)localStack.pop()).charValue() != '{'))) {
/* 206:194 */             throw new gf("Unbalanced curly brackets {}: " + paramString);
/* 207:    */           }
/* 208:195 */           if ((c == ']') && ((localStack.isEmpty()) || (((Character)localStack.pop()).charValue() != '['))) {
/* 209:196 */             throw new gf("Unbalanced square brackets []: " + paramString);
/* 210:    */           }
/* 211:197 */           if ((c == ',') && 
/* 212:198 */             (localStack.isEmpty())) {
/* 213:199 */             return paramString.substring(0, i);
/* 214:    */           }
/* 215:    */         }
/* 216:    */       }
/* 217:203 */       if (!Character.isWhitespace(c))
/* 218:    */       {
/* 219:204 */         if ((j == 0) && (k != 0) && (n != i)) {
/* 220:205 */           return paramString.substring(0, n + 1);
/* 221:    */         }
/* 222:207 */         m = 1;
/* 223:    */       }
/* 224:210 */       i++;
/* 225:    */     }
/* 226:213 */     return paramString.substring(0, i);
/* 227:    */   }
/* 228:    */   
/* 229:    */   private static String c(String paramString, boolean paramBoolean) throws gf
/* 230:    */   {
/* 231:218 */     if (paramBoolean)
/* 232:    */     {
/* 233:219 */       paramString = paramString.trim();
/* 234:220 */       if ((paramString.startsWith("{")) || (paramString.startsWith("["))) {
/* 235:221 */         return "";
/* 236:    */       }
/* 237:    */     }
/* 238:225 */     int i = a(paramString, ':');
/* 239:226 */     if (i == -1)
/* 240:    */     {
/* 241:227 */       if (paramBoolean) {
/* 242:228 */         return "";
/* 243:    */       }
/* 244:230 */       throw new gf("Unable to locate name/value separator for string: " + paramString);
/* 245:    */     }
/* 246:232 */     return paramString.substring(0, i).trim();
/* 247:    */   }
/* 248:    */   
/* 249:    */   private static String d(String paramString, boolean paramBoolean) throws gf
/* 250:    */   {
/* 251:236 */     if (paramBoolean)
/* 252:    */     {
/* 253:237 */       paramString = paramString.trim();
/* 254:238 */       if ((paramString.startsWith("{")) || (paramString.startsWith("["))) {
/* 255:239 */         return paramString;
/* 256:    */       }
/* 257:    */     }
/* 258:243 */     int i = a(paramString, ':');
/* 259:244 */     if (i == -1)
/* 260:    */     {
/* 261:245 */       if (paramBoolean) {
/* 262:246 */         return paramString;
/* 263:    */       }
/* 264:248 */       throw new gf("Unable to locate name/value separator for string: " + paramString);
/* 265:    */     }
/* 266:250 */     return paramString.substring(i + 1).trim();
/* 267:    */   }
/* 268:    */   
/* 269:    */   private static int a(String paramString, char paramChar)
/* 270:    */   {
/* 271:254 */     int i = 0;
/* 272:255 */     int j = 1;
/* 273:256 */     while (i < paramString.length())
/* 274:    */     {
/* 275:257 */       char c = paramString.charAt(i);
/* 276:258 */       if (c == '"')
/* 277:    */       {
/* 278:259 */         if (!b(paramString, i)) {
/* 279:260 */           j = j == 0 ? 1 : 0;
/* 280:    */         }
/* 281:    */       }
/* 282:262 */       else if (j != 0)
/* 283:    */       {
/* 284:263 */         if (c == paramChar) {
/* 285:264 */           return i;
/* 286:    */         }
/* 287:266 */         if ((c == '{') || (c == '[')) {
/* 288:267 */           return -1;
/* 289:    */         }
/* 290:    */       }
/* 291:270 */       i++;
/* 292:    */     }
/* 293:272 */     return -1;
/* 294:    */   }
/* 295:    */   
/* 296:    */   private static boolean b(String paramString, int paramInt)
/* 297:    */   {
/* 298:276 */     return (paramInt > 0) && (paramString.charAt(paramInt - 1) == '\\') && (!b(paramString, paramInt - 1));
/* 299:    */   }
/* 300:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gg
 * JD-Core Version:    0.7.0.1
 */