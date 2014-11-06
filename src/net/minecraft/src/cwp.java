package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.gson.JsonArray;
/*   3:    */ import com.google.gson.JsonDeserializationContext;
/*   4:    */ import com.google.gson.JsonElement;
/*   5:    */ import com.google.gson.JsonObject;
/*   6:    */ import com.google.gson.JsonParseException;
/*   7:    */ import com.google.gson.JsonPrimitive;
/*   8:    */ import com.google.gson.JsonSerializationContext;
/*   9:    */ import com.google.gson.JsonSerializer;
/*  10:    */ import java.lang.reflect.Type;
/*  11:    */ import java.util.ArrayList;
/*  13:    */ import org.apache.commons.lang3.Validate;
/*  14:    */ 
/*  15:    */ public class cwp
/*  16:    */   extends cwh<cwo>
/*  17:    */   implements JsonSerializer<cwo>
/*  18:    */ {
/*  19:    */   public cwo deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  20:    */   {
/*  21: 15 */     ArrayList<cwn> localArrayList = Lists.newArrayList();
/*  22: 16 */     JsonObject localJsonObject = uh.l(paramJsonElement, "metadata section");
/*  23: 17 */     int i = uh.a(localJsonObject, "frametime", 1);
/*  24: 18 */     if (i != 1) {
/*  25: 19 */       Validate.inclusiveBetween(1L, 2147483647L, i, "Invalid default frame time");
/*  26:    */     }
/*  27: 22 */     if (localJsonObject.has("frames")) {
/*  28:    */       try
/*  29:    */       {
/*  30: 24 */         JsonArray localJsonArray = uh.t(localJsonObject, "frames");
/*  31: 26 */         for (int k = 0; k < localJsonArray.size(); k++)
/*  32:    */         {
/*  33: 27 */           JsonElement localJsonElement = localJsonArray.get(k);
/*  34:    */           
/*  35: 29 */           cwn localcwn = a(k, localJsonElement);
/*  36: 30 */           if (localcwn != null) {
/*  37: 31 */             localArrayList.add(localcwn);
/*  38:    */           }
/*  39:    */         }
/*  40:    */       }
/*  41:    */       catch (ClassCastException localClassCastException)
/*  42:    */       {
/*  43: 35 */         throw new JsonParseException("Invalid animation->frames: expected array, was " + localJsonObject.get("frames"), localClassCastException);
/*  44:    */       }
/*  45:    */     }
/*  46: 39 */     int j = uh.a(localJsonObject, "width", -1);
/*  47: 40 */     int k = uh.a(localJsonObject, "height", -1);
/*  48: 42 */     if (j != -1) {
/*  49: 43 */       Validate.inclusiveBetween(1L, 2147483647L, j, "Invalid width");
/*  50:    */     }
/*  51: 45 */     if (k != -1) {
/*  52: 46 */       Validate.inclusiveBetween(1L, 2147483647L, k, "Invalid height");
/*  53:    */     }
/*  54: 49 */     boolean bool = uh.a(localJsonObject, "interpolate", false);
/*  55:    */     
/*  56: 51 */     return new cwo(localArrayList, j, k, i, bool);
/*  57:    */   }
/*  58:    */   
/*  59:    */   private cwn a(int paramInt, JsonElement paramJsonElement)
/*  60:    */   {
/*  61: 55 */     if (paramJsonElement.isJsonPrimitive()) {
/*  62: 56 */       return new cwn(uh.f(paramJsonElement, "frames[" + paramInt + "]"));
/*  63:    */     }
/*  64: 57 */     if (paramJsonElement.isJsonObject())
/*  65:    */     {
/*  66: 58 */       JsonObject localJsonObject = uh.l(paramJsonElement, "frames[" + paramInt + "]");
/*  67: 59 */       int i = uh.a(localJsonObject, "time", -1);
/*  68: 60 */       if (localJsonObject.has("time")) {
/*  69: 61 */         Validate.inclusiveBetween(1L, 2147483647L, i, "Invalid frame time");
/*  70:    */       }
/*  71: 63 */       int j = uh.m(localJsonObject, "index");
/*  72: 64 */       Validate.inclusiveBetween(0L, 2147483647L, j, "Invalid frame index");
/*  73: 65 */       return new cwn(j, i);
/*  74:    */     }
/*  75: 68 */     return null;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public JsonElement serialize(cwo paramcwo, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*  79:    */   {
/*  80: 74 */     JsonObject localJsonObject1 = new JsonObject();
/*  81:    */     
/*  82: 76 */     localJsonObject1.addProperty("frametime", Integer.valueOf(paramcwo.d()));
/*  83: 77 */     if (paramcwo.b() != -1) {
/*  84: 78 */       localJsonObject1.addProperty("width", Integer.valueOf(paramcwo.b()));
/*  85:    */     }
/*  86: 80 */     if (paramcwo.a() != -1) {
/*  87: 81 */       localJsonObject1.addProperty("height", Integer.valueOf(paramcwo.a()));
/*  88:    */     }
/*  89: 84 */     if (paramcwo.c() > 0)
/*  90:    */     {
/*  91: 85 */       JsonArray localJsonArray = new JsonArray();
/*  92: 86 */       for (int i = 0; i < paramcwo.c(); i++) {
/*  93: 87 */         if (paramcwo.b(i))
/*  94:    */         {
/*  95: 88 */           JsonObject localJsonObject2 = new JsonObject();
/*  96:    */           
/*  97: 90 */           localJsonObject2.addProperty("index", Integer.valueOf(paramcwo.c(i)));
/*  98: 91 */           localJsonObject2.addProperty("time", Integer.valueOf(paramcwo.a(i)));
/*  99:    */           
/* 100: 93 */           localJsonArray.add(localJsonObject2);
/* 101:    */         }
/* 102:    */         else
/* 103:    */         {
/* 104: 95 */           localJsonArray.add(new JsonPrimitive(Integer.valueOf(paramcwo.c(i))));
/* 105:    */         }
/* 106:    */       }
/* 107: 98 */       localJsonObject1.add("frames", localJsonArray);
/* 108:    */     }
/* 109:101 */     return localJsonObject1;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String a()
/* 113:    */   {
/* 114:106 */     return "animation";
/* 115:    */   }
/* 116:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwp
 * JD-Core Version:    0.7.0.1
 */