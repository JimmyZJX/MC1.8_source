package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonArray;
/*  2:   */ import com.google.gson.JsonDeserializationContext;
/*  3:   */ import com.google.gson.JsonDeserializer;
/*  4:   */ import com.google.gson.JsonElement;
/*  5:   */ import com.google.gson.JsonObject;
/*  6:   */ import com.google.gson.JsonParseException;
/*  7:   */ import java.lang.reflect.Type;
/*  8:   */ import javax.vecmath.Vector3f;
/*  9:   */ 
/* 10:   */ class cmw
/* 11:   */   implements JsonDeserializer<cmv>
/* 12:   */ {
/* 13:25 */   private static final Vector3f a = new Vector3f(0.0F, 0.0F, 0.0F);
/* 14:26 */   private static final Vector3f b = new Vector3f(0.0F, 0.0F, 0.0F);
/* 15:27 */   private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);
/* 16:   */   
/* 17:   */   public cmv deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 18:   */   {
/* 19:31 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 20:   */     
/* 21:33 */     Vector3f localVector3f1 = a(localJsonObject, "rotation", a);
/* 22:   */     
/* 23:35 */     Vector3f localVector3f2 = a(localJsonObject, "translation", b);
/* 24:36 */     localVector3f2.scale(0.0625F);
/* 25:37 */     MathUtils.clamp(localVector3f2.x, -1.5D, 1.5D);
/* 26:38 */     MathUtils.clamp(localVector3f2.y, -1.5D, 1.5D);
/* 27:39 */     MathUtils.clamp(localVector3f2.z, -1.5D, 1.5D);
/* 28:   */     
/* 29:41 */     Vector3f localVector3f3 = a(localJsonObject, "scale", c);
/* 30:42 */     MathUtils.clamp(localVector3f3.x, -1.5D, 1.5D);
/* 31:43 */     MathUtils.clamp(localVector3f3.y, -1.5D, 1.5D);
/* 32:44 */     MathUtils.clamp(localVector3f3.z, -1.5D, 1.5D);
/* 33:   */     
/* 34:46 */     return new cmv(localVector3f1, localVector3f2, localVector3f3);
/* 35:   */   }
/* 36:   */   
/* 37:   */   private Vector3f a(JsonObject paramJsonObject, String paramString, Vector3f paramVector3f)
/* 38:   */   {
/* 39:50 */     if (!paramJsonObject.has(paramString)) {
/* 40:51 */       return paramVector3f;
/* 41:   */     }
/* 42:53 */     JsonArray localJsonArray = uh.t(paramJsonObject, paramString);
/* 43:54 */     if (localJsonArray.size() != 3) {
/* 44:55 */       throw new JsonParseException("Expected 3 " + paramString + " values, found: " + localJsonArray.size());
/* 45:   */     }
/* 46:58 */     float[] arrayOfFloat = new float[3];
/* 47:59 */     for (int i = 0; i < arrayOfFloat.length; i++) {
/* 48:60 */       arrayOfFloat[i] = uh.d(localJsonArray.get(i), paramString + "[" + i + "]");
/* 49:   */     }
/* 50:62 */     return new Vector3f(arrayOfFloat);
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmw
 * JD-Core Version:    0.7.0.1
 */