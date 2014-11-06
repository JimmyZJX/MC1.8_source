package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonArray;
/*   2:    */ import com.google.gson.JsonElement;
/*   3:    */ import com.google.gson.JsonObject;
/*   4:    */ import com.google.gson.JsonPrimitive;
/*   5:    */ import com.google.gson.JsonSyntaxException;
/*   6:    */ import org.apache.commons.lang3.StringUtils;
/*   7:    */ 
/*   8:    */ public class uh
/*   9:    */ {
/*  10:    */   public static boolean a(JsonObject paramJsonObject, String paramString)
/*  11:    */   {
/*  12: 12 */     if (!f(paramJsonObject, paramString)) {
/*  13: 13 */       return false;
/*  14:    */     }
/*  15: 15 */     return paramJsonObject.getAsJsonPrimitive(paramString).isString();
/*  16:    */   }
/*  17:    */   
/*  18:    */   public static boolean a(JsonElement paramJsonElement)
/*  19:    */   {
/*  20: 19 */     if (!paramJsonElement.isJsonPrimitive()) {
/*  21: 20 */       return false;
/*  22:    */     }
/*  23: 22 */     return paramJsonElement.getAsJsonPrimitive().isString();
/*  24:    */   }
/*  25:    */   
/*  26:    */   public static boolean c(JsonObject paramJsonObject, String paramString)
/*  27:    */   {
/*  28: 40 */     if (!f(paramJsonObject, paramString)) {
/*  29: 41 */       return false;
/*  30:    */     }
/*  31: 43 */     return paramJsonObject.getAsJsonPrimitive(paramString).isBoolean();
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static boolean d(JsonObject paramJsonObject, String paramString)
/*  35:    */   {
/*  36: 54 */     if (!g(paramJsonObject, paramString)) {
/*  37: 55 */       return false;
/*  38:    */     }
/*  39: 57 */     if (!paramJsonObject.get(paramString).isJsonArray()) {
/*  40: 58 */       return false;
/*  41:    */     }
/*  42: 60 */     return true;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public static boolean f(JsonObject paramJsonObject, String paramString)
/*  46:    */   {
/*  47: 74 */     if (!g(paramJsonObject, paramString)) {
/*  48: 75 */       return false;
/*  49:    */     }
/*  50: 77 */     if (!paramJsonObject.get(paramString).isJsonPrimitive()) {
/*  51: 78 */       return false;
/*  52:    */     }
/*  53: 80 */     return true;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public static boolean g(JsonObject paramJsonObject, String paramString)
/*  57:    */   {
/*  58: 84 */     if (paramJsonObject == null) {
/*  59: 85 */       return false;
/*  60:    */     }
/*  61: 87 */     if (paramJsonObject.get(paramString) == null) {
/*  62: 88 */       return false;
/*  63:    */     }
/*  64: 90 */     return true;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public static String a(JsonElement paramJsonElement, String paramString)
/*  68:    */   {
/*  69: 94 */     if (paramJsonElement.isJsonPrimitive()) {
/*  70: 95 */       return paramJsonElement.getAsString();
/*  71:    */     }
/*  72: 97 */     throw new JsonSyntaxException("Expected " + paramString + " to be a string, was " + d(paramJsonElement));
/*  73:    */   }
/*  74:    */   
/*  75:    */   public static String h(JsonObject paramJsonObject, String paramString)
/*  76:    */   {
/*  77:102 */     if (paramJsonObject.has(paramString)) {
/*  78:103 */       return a(paramJsonObject.get(paramString), paramString);
/*  79:    */     }
/*  80:105 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a string");
/*  81:    */   }
/*  82:    */   
/*  83:    */   public static String a(JsonObject paramJsonObject, String paramString1, String paramString2)
/*  84:    */   {
/*  85:110 */     if (paramJsonObject.has(paramString1)) {
/*  86:111 */       return a(paramJsonObject.get(paramString1), paramString1);
/*  87:    */     }
/*  88:113 */     return paramString2;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public static boolean b(JsonElement paramJsonElement, String paramString)
/*  92:    */   {
/*  93:118 */     if (paramJsonElement.isJsonPrimitive()) {
/*  94:119 */       return paramJsonElement.getAsBoolean();
/*  95:    */     }
/*  96:121 */     throw new JsonSyntaxException("Expected " + paramString + " to be a Boolean, was " + d(paramJsonElement));
/*  97:    */   }
/*  98:    */   
/*  99:    */   public static boolean i(JsonObject paramJsonObject, String paramString)
/* 100:    */   {
/* 101:126 */     if (paramJsonObject.has(paramString)) {
/* 102:127 */       return b(paramJsonObject.get(paramString), paramString);
/* 103:    */     }
/* 104:129 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a Boolean");
/* 105:    */   }
/* 106:    */   
/* 107:    */   public static boolean a(JsonObject paramJsonObject, String paramString, boolean paramBoolean)
/* 108:    */   {
/* 109:134 */     if (paramJsonObject.has(paramString)) {
/* 110:135 */       return b(paramJsonObject.get(paramString), paramString);
/* 111:    */     }
/* 112:137 */     return paramBoolean;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public static float d(JsonElement paramJsonElement, String paramString)
/* 116:    */   {
/* 117:166 */     if ((paramJsonElement.isJsonPrimitive()) && (paramJsonElement.getAsJsonPrimitive().isNumber())) {
/* 118:167 */       return paramJsonElement.getAsFloat();
/* 119:    */     }
/* 120:169 */     throw new JsonSyntaxException("Expected " + paramString + " to be a Float, was " + d(paramJsonElement));
/* 121:    */   }
/* 122:    */   
/* 123:    */   public static float k(JsonObject paramJsonObject, String paramString)
/* 124:    */   {
/* 125:174 */     if (paramJsonObject.has(paramString)) {
/* 126:175 */       return d(paramJsonObject.get(paramString), paramString);
/* 127:    */     }
/* 128:177 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a Float");
/* 129:    */   }
/* 130:    */   
/* 131:    */   public static float a(JsonObject paramJsonObject, String paramString, float paramFloat)
/* 132:    */   {
/* 133:182 */     if (paramJsonObject.has(paramString)) {
/* 134:183 */       return d(paramJsonObject.get(paramString), paramString);
/* 135:    */     }
/* 136:185 */     return paramFloat;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public static int f(JsonElement paramJsonElement, String paramString)
/* 140:    */   {
/* 141:214 */     if ((paramJsonElement.isJsonPrimitive()) && (paramJsonElement.getAsJsonPrimitive().isNumber())) {
/* 142:215 */       return paramJsonElement.getAsInt();
/* 143:    */     }
/* 144:217 */     throw new JsonSyntaxException("Expected " + paramString + " to be a Int, was " + d(paramJsonElement));
/* 145:    */   }
/* 146:    */   
/* 147:    */   public static int m(JsonObject paramJsonObject, String paramString)
/* 148:    */   {
/* 149:222 */     if (paramJsonObject.has(paramString)) {
/* 150:223 */       return f(paramJsonObject.get(paramString), paramString);
/* 151:    */     }
/* 152:225 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a Int");
/* 153:    */   }
/* 154:    */   
/* 155:    */   public static int a(JsonObject paramJsonObject, String paramString, int paramInt)
/* 156:    */   {
/* 157:230 */     if (paramJsonObject.has(paramString)) {
/* 158:231 */       return f(paramJsonObject.get(paramString), paramString);
/* 159:    */     }
/* 160:233 */     return paramInt;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public static JsonObject l(JsonElement paramJsonElement, String paramString)
/* 164:    */   {
/* 165:358 */     if (paramJsonElement.isJsonObject()) {
/* 166:359 */       return paramJsonElement.getAsJsonObject();
/* 167:    */     }
/* 168:361 */     throw new JsonSyntaxException("Expected " + paramString + " to be a JsonObject, was " + d(paramJsonElement));
/* 169:    */   }
/* 170:    */   
/* 171:    */   public static JsonObject s(JsonObject paramJsonObject, String paramString)
/* 172:    */   {
/* 173:366 */     if (paramJsonObject.has(paramString)) {
/* 174:367 */       return l(paramJsonObject.get(paramString), paramString);
/* 175:    */     }
/* 176:369 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a JsonObject");
/* 177:    */   }
/* 178:    */   
/* 179:    */   public static JsonObject a(JsonObject paramJsonObject1, String paramString, JsonObject paramJsonObject2)
/* 180:    */   {
/* 181:374 */     if (paramJsonObject1.has(paramString)) {
/* 182:375 */       return l(paramJsonObject1.get(paramString), paramString);
/* 183:    */     }
/* 184:377 */     return paramJsonObject2;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public static JsonArray m(JsonElement paramJsonElement, String paramString)
/* 188:    */   {
/* 189:382 */     if (paramJsonElement.isJsonArray()) {
/* 190:383 */       return paramJsonElement.getAsJsonArray();
/* 191:    */     }
/* 192:385 */     throw new JsonSyntaxException("Expected " + paramString + " to be a JsonArray, was " + d(paramJsonElement));
/* 193:    */   }
/* 194:    */   
/* 195:    */   public static JsonArray t(JsonObject paramJsonObject, String paramString)
/* 196:    */   {
/* 197:390 */     if (paramJsonObject.has(paramString)) {
/* 198:391 */       return m(paramJsonObject.get(paramString), paramString);
/* 199:    */     }
/* 200:393 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a JsonArray");
/* 201:    */   }
/* 202:    */   
/* 203:    */   public static JsonArray a(JsonObject paramJsonObject, String paramString, JsonArray paramJsonArray)
/* 204:    */   {
/* 205:398 */     if (paramJsonObject.has(paramString)) {
/* 206:399 */       return m(paramJsonObject.get(paramString), paramString);
/* 207:    */     }
/* 208:401 */     return paramJsonArray;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public static String d(JsonElement paramJsonElement)
/* 212:    */   {
/* 213:406 */     String str = StringUtils.abbreviateMiddle(String.valueOf(paramJsonElement), "...", 10);
/* 214:407 */     if (paramJsonElement == null) {
/* 215:408 */       return "null (missing)";
/* 216:    */     }
/* 217:410 */     if (paramJsonElement.isJsonNull()) {
/* 218:411 */       return "null (json)";
/* 219:    */     }
/* 220:413 */     if (paramJsonElement.isJsonArray()) {
/* 221:414 */       return "an array (" + str + ")";
/* 222:    */     }
/* 223:416 */     if (paramJsonElement.isJsonObject()) {
/* 224:417 */       return "an object (" + str + ")";
/* 225:    */     }
/* 226:419 */     if (paramJsonElement.isJsonPrimitive())
/* 227:    */     {
/* 228:420 */       JsonPrimitive localJsonPrimitive = paramJsonElement.getAsJsonPrimitive();
/* 229:421 */       if (localJsonPrimitive.isNumber()) {
/* 230:422 */         return "a number (" + str + ")";
/* 231:    */       }
/* 232:424 */       if (localJsonPrimitive.isBoolean()) {
/* 233:425 */         return "a boolean (" + str + ")";
/* 234:    */       }
/* 235:    */     }
/* 236:428 */     return str;
/* 237:    */   }
/* 238:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     uh
 * JD-Core Version:    0.7.0.1
 */