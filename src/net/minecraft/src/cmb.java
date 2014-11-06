package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonArray;
/*  2:   */ import com.google.gson.JsonDeserializationContext;
/*  3:   */ import com.google.gson.JsonDeserializer;
/*  4:   */ import com.google.gson.JsonElement;
/*  5:   */ import com.google.gson.JsonObject;
/*  6:   */ import com.google.gson.JsonParseException;
/*  7:   */ import java.lang.reflect.Type;
/*  8:   */ 
/*  9:   */ class cmb
/* 10:   */   implements JsonDeserializer<cma>
/* 11:   */ {
/* 12:   */   public cma deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 13:   */   {
/* 14:55 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 15:   */     
/* 16:57 */     float[] arrayOfFloat = b(localJsonObject);
/* 17:58 */     int i = a(localJsonObject);
/* 18:   */     
/* 19:60 */     return new cma(arrayOfFloat, i);
/* 20:   */   }
/* 21:   */   
/* 22:   */   protected int a(JsonObject paramJsonObject)
/* 23:   */   {
/* 24:64 */     int i = uh.a(paramJsonObject, "rotation", 0);
/* 25:66 */     if ((i < 0) || (i % 90 != 0) || (i / 90 > 3)) {
/* 26:67 */       throw new JsonParseException("Invalid rotation " + i + " found, only 0/90/180/270 allowed");
/* 27:   */     }
/* 28:70 */     return i;
/* 29:   */   }
/* 30:   */   
/* 31:   */   private float[] b(JsonObject paramJsonObject)
/* 32:   */   {
/* 33:75 */     if (!paramJsonObject.has("uv")) {
/* 34:76 */       return null;
/* 35:   */     }
/* 36:79 */     JsonArray localJsonArray = uh.t(paramJsonObject, "uv");
/* 37:80 */     if (localJsonArray.size() != 4) {
/* 38:81 */       throw new JsonParseException("Expected 4 uv values, found: " + localJsonArray.size());
/* 39:   */     }
/* 40:84 */     float[] arrayOfFloat = new float[4];
/* 41:85 */     for (int i = 0; i < arrayOfFloat.length; i++) {
/* 42:86 */       arrayOfFloat[i] = uh.d(localJsonArray.get(i), "uv[" + i + "]");
/* 43:   */     }
/* 44:89 */     return arrayOfFloat;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmb
 * JD-Core Version:    0.7.0.1
 */