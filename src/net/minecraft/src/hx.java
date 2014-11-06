package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonDeserializationContext;
/*   2:    */ import com.google.gson.JsonDeserializer;
/*   3:    */ import com.google.gson.JsonElement;
/*   4:    */ import com.google.gson.JsonObject;
/*   5:    */ import com.google.gson.JsonPrimitive;
/*   6:    */ import com.google.gson.JsonSerializationContext;
/*   7:    */ import com.google.gson.JsonSerializer;
/*   8:    */ import java.lang.reflect.Type;
/*   9:    */ 
/*  10:    */ public class hx
/*  11:    */   implements JsonDeserializer<hv>, JsonSerializer<hv>
/*  12:    */ {
/*  13:    */   public hv deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  14:    */   {
/*  15:278 */     if (paramJsonElement.isJsonObject())
/*  16:    */     {
/*  17:279 */       hv localhv = new hv();
/*  18:280 */       JsonObject localJsonObject1 = paramJsonElement.getAsJsonObject();
/*  19:281 */       if (localJsonObject1 == null) {
/*  20:282 */         return null;
/*  21:    */       }
/*  22:284 */       if (localJsonObject1.has("bold")) {
/*  23:285 */         hv.a(localhv, Boolean.valueOf(localJsonObject1.get("bold").getAsBoolean()));
/*  24:    */       }
/*  25:287 */       if (localJsonObject1.has("italic")) {
/*  26:288 */         hv.b(localhv, Boolean.valueOf(localJsonObject1.get("italic").getAsBoolean()));
/*  27:    */       }
/*  28:290 */       if (localJsonObject1.has("underlined")) {
/*  29:291 */         hv.c(localhv, Boolean.valueOf(localJsonObject1.get("underlined").getAsBoolean()));
/*  30:    */       }
/*  31:293 */       if (localJsonObject1.has("strikethrough")) {
/*  32:294 */         hv.d(localhv, Boolean.valueOf(localJsonObject1.get("strikethrough").getAsBoolean()));
/*  33:    */       }
/*  34:296 */       if (localJsonObject1.has("obfuscated")) {
/*  35:297 */         hv.e(localhv, Boolean.valueOf(localJsonObject1.get("obfuscated").getAsBoolean()));
/*  36:    */       }
/*  37:299 */       if (localJsonObject1.has("color")) {
/*  38:300 */         hv.a(localhv, (a)paramJsonDeserializationContext.deserialize(localJsonObject1.get("color"), a.class));
/*  39:    */       }
/*  40:302 */       if (localJsonObject1.has("insertion")) {
/*  41:303 */         hv.a(localhv, localJsonObject1.get("insertion").getAsString());
/*  42:    */       }
/*  43:    */       JsonObject localJsonObject2;
/*  44:    */       JsonPrimitive localJsonPrimitive;
/*  45:    */       Object localObject1;
/*  46:    */       Object localObject2;
/*  47:306 */       if (localJsonObject1.has("clickEvent"))
/*  48:    */       {
/*  49:307 */         localJsonObject2 = localJsonObject1.getAsJsonObject("clickEvent");
/*  50:308 */         if (localJsonObject2 != null)
/*  51:    */         {
/*  52:309 */           localJsonPrimitive = localJsonObject2.getAsJsonPrimitive("action");
/*  53:310 */           localObject1 = localJsonPrimitive == null ? null : hn.a(localJsonPrimitive.getAsString());
/*  54:    */           
/*  55:312 */           localObject2 = localJsonObject2.getAsJsonPrimitive("value");
/*  56:313 */           String str = localObject2 == null ? null : ((JsonPrimitive)localObject2).getAsString();
/*  57:315 */           if ((localObject1 != null) && (str != null) && (((hn)localObject1).a())) {
/*  58:316 */             hv.a(localhv, new hm((hn)localObject1, str));
/*  59:    */           }
/*  60:    */         }
/*  61:    */       }
/*  62:321 */       if (localJsonObject1.has("hoverEvent"))
/*  63:    */       {
/*  64:322 */         localJsonObject2 = localJsonObject1.getAsJsonObject("hoverEvent");
/*  65:323 */         if (localJsonObject2 != null)
/*  66:    */         {
/*  67:324 */           localJsonPrimitive = localJsonObject2.getAsJsonPrimitive("action");
/*  68:325 */           localObject1 = localJsonPrimitive == null ? null : hs.a(localJsonPrimitive.getAsString());
/*  69:    */           
/*  70:327 */           localObject2 = (ho)paramJsonDeserializationContext.deserialize(localJsonObject2.get("value"), ho.class);
/*  71:329 */           if ((localObject1 != null) && (localObject2 != null) && (((hs)localObject1).a())) {
/*  72:330 */             hv.a(localhv, new hr((hs)localObject1, (ho)localObject2));
/*  73:    */           }
/*  74:    */         }
/*  75:    */       }
/*  76:335 */       return localhv;
/*  77:    */     }
/*  78:338 */     return null;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public JsonElement serialize(hv paramhv, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*  82:    */   {
/*  83:344 */     if (paramhv.g()) {
/*  84:345 */       return null;
/*  85:    */     }
/*  86:347 */     JsonObject localJsonObject1 = new JsonObject();
/*  87:349 */     if (hv.b(paramhv) != null) {
/*  88:350 */       localJsonObject1.addProperty("bold", hv.b(paramhv));
/*  89:    */     }
/*  90:352 */     if (hv.c(paramhv) != null) {
/*  91:353 */       localJsonObject1.addProperty("italic", hv.c(paramhv));
/*  92:    */     }
/*  93:355 */     if (hv.d(paramhv) != null) {
/*  94:356 */       localJsonObject1.addProperty("underlined", hv.d(paramhv));
/*  95:    */     }
/*  96:358 */     if (hv.e(paramhv) != null) {
/*  97:359 */       localJsonObject1.addProperty("strikethrough", hv.e(paramhv));
/*  98:    */     }
/*  99:361 */     if (hv.f(paramhv) != null) {
/* 100:362 */       localJsonObject1.addProperty("obfuscated", hv.f(paramhv));
/* 101:    */     }
/* 102:364 */     if (hv.g(paramhv) != null) {
/* 103:365 */       localJsonObject1.add("color", paramJsonSerializationContext.serialize(hv.g(paramhv)));
/* 104:    */     }
/* 105:367 */     if (hv.h(paramhv) != null) {
/* 106:368 */       localJsonObject1.add("insertion", paramJsonSerializationContext.serialize(hv.h(paramhv)));
/* 107:    */     }
/* 108:    */     JsonObject localJsonObject2;
/* 109:371 */     if (hv.i(paramhv) != null)
/* 110:    */     {
/* 111:372 */       localJsonObject2 = new JsonObject();
/* 112:373 */       localJsonObject2.addProperty("action", hv.i(paramhv).a().b());
/* 113:374 */       localJsonObject2.addProperty("value", hv.i(paramhv).b());
/* 114:375 */       localJsonObject1.add("clickEvent", localJsonObject2);
/* 115:    */     }
/* 116:378 */     if (hv.j(paramhv) != null)
/* 117:    */     {
/* 118:379 */       localJsonObject2 = new JsonObject();
/* 119:380 */       localJsonObject2.addProperty("action", hv.j(paramhv).a().b());
/* 120:381 */       localJsonObject2.add("value", paramJsonSerializationContext.serialize(hv.j(paramhv).b()));
/* 121:382 */       localJsonObject1.add("hoverEvent", localJsonObject2);
/* 122:    */     }
/* 123:385 */     return localJsonObject1;
/* 124:    */   }
/* 125:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hx
 * JD-Core Version:    0.7.0.1
 */