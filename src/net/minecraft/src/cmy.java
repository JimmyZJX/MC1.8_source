package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonDeserializationContext;
/*  2:   */ import com.google.gson.JsonDeserializer;
/*  3:   */ import com.google.gson.JsonElement;
/*  4:   */ import com.google.gson.JsonObject;
/*  5:   */ import java.lang.reflect.Type;
/*  6:   */ 
/*  7:   */ class cmy
/*  8:   */   implements JsonDeserializer<cmx>
/*  9:   */ {
/* 10:   */   public cmx deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 11:   */   {
/* 12:32 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 13:   */     
/* 14:34 */     cmv localcmv1 = cmv.a;
/* 15:35 */     cmv localcmv2 = cmv.a;
/* 16:36 */     cmv localcmv3 = cmv.a;
/* 17:37 */     cmv localcmv4 = cmv.a;
/* 18:39 */     if (localJsonObject.has("thirdperson")) {
/* 19:40 */       localcmv1 = (cmv)paramJsonDeserializationContext.deserialize(localJsonObject.get("thirdperson"), cmv.class);
/* 20:   */     }
/* 21:43 */     if (localJsonObject.has("firstperson")) {
/* 22:44 */       localcmv2 = (cmv)paramJsonDeserializationContext.deserialize(localJsonObject.get("firstperson"), cmv.class);
/* 23:   */     }
/* 24:47 */     if (localJsonObject.has("head")) {
/* 25:48 */       localcmv3 = (cmv)paramJsonDeserializationContext.deserialize(localJsonObject.get("head"), cmv.class);
/* 26:   */     }
/* 27:51 */     if (localJsonObject.has("gui")) {
/* 28:52 */       localcmv4 = (cmv)paramJsonDeserializationContext.deserialize(localJsonObject.get("gui"), cmv.class);
/* 29:   */     }
/* 30:55 */     return new cmx(localcmv1, localcmv2, localcmv3, localcmv4);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmy
 * JD-Core Version:    0.7.0.1
 */