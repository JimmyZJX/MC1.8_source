package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import com.google.gson.JsonArray;
/*   3:    */ import com.google.gson.JsonDeserializationContext;
/*   4:    */ import com.google.gson.JsonDeserializer;
/*   5:    */ import com.google.gson.JsonElement;
/*   6:    */ import com.google.gson.JsonObject;
/*   7:    */ import com.google.gson.JsonParseException;
/*   8:    */ import java.lang.reflect.Type;
/*   9:    */ import java.util.EnumMap;
/*  10:    */ import java.util.Map;
/*  11:    */ import java.util.Map.Entry;
/*  12:    */ import javax.vecmath.Vector3f;
/*  13:    */ 
/*  14:    */ class clw
/*  15:    */   implements JsonDeserializer<clu>
/*  16:    */ {
/*  17:    */   public clu deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  18:    */   {
/*  19: 69 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/*  20: 70 */     Vector3f localVector3f1 = e(localJsonObject);
/*  21: 71 */     Vector3f localVector3f2 = d(localJsonObject);
/*  22: 72 */     clz localclz = a(localJsonObject);
/*  23: 73 */     Map localMap = a(paramJsonDeserializationContext, localJsonObject);
/*  24: 74 */     if ((localJsonObject.has("shade")) && (!uh.c(localJsonObject, "shade"))) {
/*  25: 75 */       throw new JsonParseException("Expected shade to be a Boolean");
/*  26:    */     }
/*  27: 77 */     boolean bool = uh.a(localJsonObject, "shade", true);
/*  28:    */     
/*  29: 79 */     return new clu(localVector3f1, localVector3f2, localMap, localclz, bool);
/*  30:    */   }
/*  31:    */   
/*  32:    */   private clz a(JsonObject paramJsonObject)
/*  33:    */   {
/*  34: 84 */     clz localclz = null;
/*  35: 85 */     if (paramJsonObject.has("rotation"))
/*  36:    */     {
/*  37: 86 */       JsonObject localJsonObject = uh.s(paramJsonObject, "rotation");
/*  38: 87 */       Vector3f localVector3f = a(localJsonObject, "origin");
/*  39: 88 */       localVector3f.scale(0.0625F);
/*  40: 89 */       EnumAxis localel = c(localJsonObject);
/*  41: 90 */       float f = b(localJsonObject);
/*  42: 91 */       boolean bool = uh.a(localJsonObject, "rescale", false);
/*  43:    */       
/*  44: 93 */       localclz = new clz(localVector3f, localel, f, bool);
/*  45:    */     }
/*  46: 95 */     return localclz;
/*  47:    */   }
/*  48:    */   
/*  49:    */   private float b(JsonObject paramJsonObject)
/*  50:    */   {
/*  51: 99 */     float f = uh.k(paramJsonObject, "angle");
/*  52:100 */     if ((f != 0.0F) && (MathUtils.abs(f) != 22.5F) && (MathUtils.abs(f) != 45.0F)) {
/*  53:101 */       throw new JsonParseException("Invalid rotation " + f + " found, only -45/-22.5/0/22.5/45 allowed");
/*  54:    */     }
/*  55:103 */     return f;
/*  56:    */   }
/*  57:    */   
/*  58:    */   private EnumAxis c(JsonObject paramJsonObject)
/*  59:    */   {
/*  60:107 */     String str = uh.h(paramJsonObject, "axis");
/*  61:108 */     EnumAxis localel = EnumAxis.a(str.toLowerCase());
/*  62:109 */     if (localel == null) {
/*  63:110 */       throw new JsonParseException("Invalid rotation axis: " + str);
/*  64:    */     }
/*  65:112 */     return localel;
/*  66:    */   }
/*  67:    */   
/*  68:    */   private Map a(JsonDeserializationContext paramJsonDeserializationContext, JsonObject paramJsonObject)
/*  69:    */   {
/*  70:116 */     Map localMap = b(paramJsonDeserializationContext, paramJsonObject);
/*  71:118 */     if (localMap.isEmpty()) {
/*  72:119 */       throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
/*  73:    */     }
/*  74:122 */     return localMap;
/*  75:    */   }
/*  76:    */   
/*  77:    */   private Map b(JsonDeserializationContext paramJsonDeserializationContext, JsonObject paramJsonObject)
/*  78:    */   {
/*  79:126 */     EnumMap localEnumMap = Maps.newEnumMap(EnumDirection.class);
/*  80:127 */     JsonObject localJsonObject = uh.s(paramJsonObject, "faces");
/*  81:128 */     for (Map.Entry localEntry : localJsonObject.entrySet())
/*  82:    */     {
/*  83:129 */       EnumDirection localej = a((String)localEntry.getKey());
/*  84:130 */       localEnumMap.put(localej, (clx)paramJsonDeserializationContext.deserialize((JsonElement)localEntry.getValue(), clx.class));
/*  85:    */     }
/*  86:132 */     return localEnumMap;
/*  87:    */   }
/*  88:    */   
/*  89:    */   private EnumDirection a(String paramString)
/*  90:    */   {
/*  91:136 */     EnumDirection localej = EnumDirection.a(paramString);
/*  92:137 */     if (localej == null) {
/*  93:138 */       throw new JsonParseException("Unknown facing: " + paramString);
/*  94:    */     }
/*  95:140 */     return localej;
/*  96:    */   }
/*  97:    */   
/*  98:    */   private Vector3f d(JsonObject paramJsonObject)
/*  99:    */   {
/* 100:144 */     Vector3f localVector3f = a(paramJsonObject, "to");
/* 101:145 */     if ((localVector3f.x < -16.0F) || (localVector3f.y < -16.0F) || (localVector3f.z < -16.0F) || (localVector3f.x > 32.0F) || (localVector3f.y > 32.0F) || (localVector3f.z > 32.0F)) {
/* 102:147 */       throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + localVector3f);
/* 103:    */     }
/* 104:149 */     return localVector3f;
/* 105:    */   }
/* 106:    */   
/* 107:    */   private Vector3f e(JsonObject paramJsonObject)
/* 108:    */   {
/* 109:153 */     Vector3f localVector3f = a(paramJsonObject, "from");
/* 110:154 */     if ((localVector3f.x < -16.0F) || (localVector3f.y < -16.0F) || (localVector3f.z < -16.0F) || (localVector3f.x > 32.0F) || (localVector3f.y > 32.0F) || (localVector3f.z > 32.0F)) {
/* 111:156 */       throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + localVector3f);
/* 112:    */     }
/* 113:158 */     return localVector3f;
/* 114:    */   }
/* 115:    */   
/* 116:    */   private Vector3f a(JsonObject paramJsonObject, String paramString)
/* 117:    */   {
/* 118:162 */     JsonArray localJsonArray = uh.t(paramJsonObject, paramString);
/* 119:163 */     if (localJsonArray.size() != 3) {
/* 120:164 */       throw new JsonParseException("Expected 3 " + paramString + " values, found: " + localJsonArray.size());
/* 121:    */     }
/* 122:167 */     float[] arrayOfFloat = new float[3];
/* 123:168 */     for (int i = 0; i < arrayOfFloat.length; i++) {
/* 124:169 */       arrayOfFloat[i] = uh.d(localJsonArray.get(i), paramString + "[" + i + "]");
/* 125:    */     }
/* 126:171 */     return new Vector3f(arrayOfFloat);
/* 127:    */   }
/* 128:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     clw
 * JD-Core Version:    0.7.0.1
 */