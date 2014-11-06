package net.minecraft.src;
/*   1:    */ import com.google.gson.Gson;
/*   2:    */ import com.google.gson.GsonBuilder;
/*   3:    */ import com.google.gson.JsonArray;
/*   4:    */ import com.google.gson.JsonDeserializationContext;
/*   5:    */ import com.google.gson.JsonDeserializer;
/*   6:    */ import com.google.gson.JsonElement;
/*   7:    */ import com.google.gson.JsonObject;
/*   8:    */ import com.google.gson.JsonParseException;
/*   9:    */ import com.google.gson.JsonPrimitive;
/*  10:    */ import com.google.gson.JsonSerializationContext;
/*  11:    */ import com.google.gson.JsonSerializer;

/*  12:    */ import java.lang.reflect.Type;
/*  13:    */ import java.util.Iterator;
import java.util.Map;
/*  16:    */ 
/*  17:    */ public class hp
/*  18:    */   implements JsonDeserializer<ho>, JsonSerializer<ho>
/*  19:    */ {
/*  20:    */   private static final Gson a;
/*  21:    */   
/*  22:    */   static
/*  23:    */   {
/*  24: 34 */     GsonBuilder localGsonBuilder = new GsonBuilder();
/*  25: 35 */     localGsonBuilder.registerTypeHierarchyAdapter(ho.class, new hp());
/*  26: 36 */     localGsonBuilder.registerTypeHierarchyAdapter(hv.class, new hx());
/*  27: 37 */     localGsonBuilder.registerTypeAdapterFactory(new ut());
/*  28: 38 */     a = localGsonBuilder.create();
/*  29:    */   }
/*  30:    */   
/*  31:    */   public ho deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  32:    */   {
/*  33: 43 */     if (paramJsonElement.isJsonPrimitive()) {
/*  34: 45 */       return new hy(paramJsonElement.getAsString());
/*  35:    */     }
/*  36:    */     Object localObject1;
/*  37:    */     ho localObject2;
/*  38:    */     Object localObject3;
/*  39:    */     
/*  40: 46 */     if (paramJsonElement.isJsonObject())
/*  41:    */     {
/*  42: 47 */       localObject1 = paramJsonElement.getAsJsonObject();
/*  43: 50 */       if (((JsonObject)localObject1).has("text"))
/*  44:    */       {
/*  45: 51 */         localObject2 = new hy(((JsonObject)localObject1).get("text").getAsString());
/*  46:    */       }
/*  47: 52 */       else if (((JsonObject)localObject1).has("translate"))
/*  48:    */       {
/*  49: 53 */         localObject3 = ((JsonObject)localObject1).get("translate").getAsString();
/*  50: 55 */         if (((JsonObject)localObject1).has("with"))
/*  51:    */         {
/*  52: 56 */           JsonArray localJsonArray = ((JsonObject)localObject1).getAsJsonArray("with");
/*  53: 57 */           Object[] localObject4 = new Object[localJsonArray.size()];
/*  54: 59 */           for (int j = 0; j < localObject4.length; j++)
/*  55:    */           {
/*  56: 60 */             localObject4[j] = deserialize(localJsonArray.get(j), paramType, paramJsonDeserializationContext);
/*  57: 62 */             if ((localObject4[j] instanceof hy))
/*  58:    */             {
/*  59: 63 */               hy localhy = (hy)localObject4[j];
/*  60: 64 */               if ((localhy.b().g()) && (localhy.a().isEmpty())) {
/*  61: 65 */                 localObject4[j] = localhy.g();
/*  62:    */               }
/*  63:    */             }
/*  64:    */           }
/*  65: 70 */           localObject2 = new hz((String)localObject3, (Object[])localObject4);
/*  66:    */         }
/*  67:    */         else
/*  68:    */         {
/*  69: 72 */           localObject2 = new hz((String)localObject3, new Object[0]);
/*  70:    */         }
/*  71:    */       }
/*  72: 74 */       else if (((JsonObject)localObject1).has("score"))
/*  73:    */       {
/*  74: 75 */         localObject3 = ((JsonObject)localObject1).getAsJsonObject("score");
/*  75: 76 */         if ((((JsonObject)localObject3).has("name")) && (((JsonObject)localObject3).has("objective")))
/*  76:    */         {
/*  77: 77 */           localObject2 = new ht(uh.h((JsonObject)localObject3, "name"), uh.h((JsonObject)localObject3, "objective"));
/*  78: 78 */           if (((JsonObject)localObject3).has("value")) {
/*  79: 79 */             ((ht)localObject2).b(uh.h((JsonObject)localObject3, "value"));
/*  80:    */           }
/*  81:    */         }
/*  82:    */         else
/*  83:    */         {
/*  84: 82 */           throw new JsonParseException("A score component needs a least a name and an objective");
/*  85:    */         }
/*  86:    */       }
/*  87: 84 */       else if (((JsonObject)localObject1).has("selector"))
/*  88:    */       {
/*  89: 85 */         localObject2 = new hu(uh.h((JsonObject)localObject1, "selector"));
/*  90:    */       }
/*  91:    */       else
/*  92:    */       {
/*  93: 87 */         throw new JsonParseException("Don't know how to turn " + paramJsonElement.toString() + " into a Component");
/*  94:    */       }
/*  95: 90 */       if (((JsonObject)localObject1).has("extra"))
/*  96:    */       {
/*  97: 91 */         localObject3 = ((JsonObject)localObject1).getAsJsonArray("extra");
/*  98: 93 */         if (((JsonArray)localObject3).size() > 0) {
/*  99: 94 */           for (int i = 0; i < ((JsonArray)localObject3).size(); i++) {
/* 100: 95 */             ((ho)localObject2).a(deserialize(((JsonArray)localObject3).get(i), paramType, paramJsonDeserializationContext));
/* 101:    */           }
/* 102:    */         } else {
/* 103: 98 */           throw new JsonParseException("Unexpected empty array of components");
/* 104:    */         }
/* 105:    */       }
/* 106:102 */       ((ho)localObject2).a((hv)paramJsonDeserializationContext.deserialize(paramJsonElement, hv.class));
/* 107:    */       
/* 108:104 */       return localObject2;
/* 109:    */     }
/* 110:105 */     if (paramJsonElement.isJsonArray())
/* 111:    */     {
/* 112:107 */       localObject1 = paramJsonElement.getAsJsonArray();
/* 113:108 */       localObject2 = null;
/* 114:110 */       for (localObject3 = ((JsonArray)localObject1).iterator(); ((Iterator)localObject3).hasNext();)
/* 115:    */       {
/* 116:110 */         JsonElement localJsonElement = (JsonElement)((Iterator)localObject3).next();
/* 117:111 */         ho localObject4 = deserialize(localJsonElement, localJsonElement.getClass(), paramJsonDeserializationContext);
/* 118:112 */         if (localObject2 == null) {
/* 119:113 */           localObject2 = localObject4;
/* 120:    */         } else {
/* 121:115 */           ((ho)localObject2).a((ho)localObject4);
/* 122:    */         }
/* 123:    */       }
/* 124:119 */       return localObject2;
/* 125:    */     }
/* 126:121 */     throw new JsonParseException("Don't know how to turn " + paramJsonElement.toString() + " into a Component");
/* 127:    */   }
/* 128:    */   
/* 129:    */   private void a(hv paramhv, JsonObject paramJsonObject, JsonSerializationContext paramJsonSerializationContext)
/* 130:    */   {
/* 131:126 */     JsonElement localJsonElement = paramJsonSerializationContext.serialize(paramhv);
/* 132:128 */     if (localJsonElement.isJsonObject())
/* 133:    */     {
/* 134:129 */       JsonObject localJsonObject = (JsonObject)localJsonElement;
/* 135:130 */       for (Map.Entry localEntry : localJsonObject.entrySet()) {
/* 136:131 */         paramJsonObject.add((String)localEntry.getKey(), (JsonElement)localEntry.getValue());
/* 137:    */       }
/* 138:    */     }
/* 139:    */   }
/* 140:    */   
/* 141:    */   public JsonElement serialize(ho paramho, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/* 142:    */   {
/* 143:138 */     if (((paramho instanceof hy)) && (paramho.b().g()) && (paramho.a().isEmpty())) {
/* 144:139 */       return new JsonPrimitive(((hy)paramho).g());
/* 145:    */     }
/* 146:142 */     JsonObject localJsonObject = new JsonObject();
/* 147:144 */     if (!paramho.b().g()) {
/* 148:145 */       a(paramho.b(), localJsonObject, paramJsonSerializationContext);
/* 149:    */     }
/* 150:    */     Object localObject1;
/* 151:    */     Object localObject2;
/* 152:    */     Object localObject3;
/* 153:148 */     if (!paramho.a().isEmpty())
/* 154:    */     {
/* 155:149 */       localObject1 = new JsonArray();
/* 156:151 */       for (localObject2 = paramho.a().iterator(); ((Iterator)localObject2).hasNext();)
/* 157:    */       {
/* 158:151 */         localObject3 = (ho)((Iterator)localObject2).next();
/* 159:152 */         ((JsonArray)localObject1).add(serialize((ho)localObject3, localObject3.getClass(), paramJsonSerializationContext));
/* 160:    */       }
/* 161:155 */       localJsonObject.add("extra", (JsonElement)localObject1);
/* 162:    */     }
/* 163:158 */     if ((paramho instanceof hy))
/* 164:    */     {
/* 165:159 */       localJsonObject.addProperty("text", ((hy)paramho).g());
/* 166:    */     }
/* 167:160 */     else if ((paramho instanceof hz))
/* 168:    */     {
/* 169:161 */       localObject1 = (hz)paramho;
/* 170:162 */       localJsonObject.addProperty("translate", ((hz)localObject1).i());
/* 171:164 */       if ((((hz)localObject1).j() != null) && (((hz)localObject1).j().length > 0))
/* 172:    */       {
/* 173:165 */         localObject2 = new JsonArray();
/* 174:167 */         for (Object localObject4 : ((hz)localObject1).j()) {
/* 175:168 */           if ((localObject4 instanceof ho)) {
/* 176:169 */             ((JsonArray)localObject2).add(serialize((ho)localObject4, localObject4.getClass(), paramJsonSerializationContext));
/* 177:    */           } else {
/* 178:171 */             ((JsonArray)localObject2).add(new JsonPrimitive(String.valueOf(localObject4)));
/* 179:    */           }
/* 180:    */         }
/* 181:175 */         localJsonObject.add("with", (JsonElement)localObject2);
/* 182:    */       }
/* 183:    */     }
/* 184:177 */     else if ((paramho instanceof ht))
/* 185:    */     {
/* 186:178 */       localObject1 = (ht)paramho;
/* 187:179 */       localObject2 = new JsonObject();
/* 188:180 */       ((JsonObject)localObject2).addProperty("name", ((ht)localObject1).g());
/* 189:181 */       ((JsonObject)localObject2).addProperty("objective", ((ht)localObject1).h());
/* 190:182 */       ((JsonObject)localObject2).addProperty("value", ((ht)localObject1).e());
/* 191:183 */       localJsonObject.add("score", (JsonElement)localObject2);
/* 192:    */     }
/* 193:184 */     else if ((paramho instanceof hu))
/* 194:    */     {
/* 195:185 */       localObject1 = (hu)paramho;
/* 196:186 */       localJsonObject.addProperty("selector", ((hu)localObject1).g());
/* 197:    */     }
/* 198:    */     else
/* 199:    */     {
/* 200:188 */       throw new IllegalArgumentException("Don't know how to serialize " + paramho + " as a Component");
/* 201:    */     }
/* 202:191 */     return localJsonObject;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public static String a(ho paramho)
/* 206:    */   {
/* 207:195 */     return a.toJson(paramho);
/* 208:    */   }
/* 209:    */   
/* 210:    */   public static ho a(String paramString)
/* 211:    */   {
/* 212:199 */     return (ho)a.fromJson(paramString, ho.class);
/* 213:    */   }
/* 214:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hp
 * JD-Core Version:    0.7.0.1
 */