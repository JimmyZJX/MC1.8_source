package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonDeserializationContext;
/*  2:   */ import com.google.gson.JsonElement;
/*  3:   */ import com.google.gson.JsonObject;
/*  4:   */ import com.google.gson.JsonParseException;
/*  5:   */ import com.google.gson.JsonSerializationContext;
/*  6:   */ import com.google.gson.JsonSerializer;
/*  7:   */ import java.lang.reflect.Type;
/*  8:   */ 
/*  9:   */ public class cwy
/* 10:   */   extends cwh<cwx>
/* 11:   */   implements JsonSerializer<cwx>
/* 12:   */ {
/* 13:   */   public cwx deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 14:   */   {
/* 15:13 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 16:14 */     ho localho = (ho)paramJsonDeserializationContext.deserialize(localJsonObject.get("description"), ho.class);
/* 17:15 */     if (localho == null) {
/* 18:16 */       throw new JsonParseException("Invalid/missing description!");
/* 19:   */     }
/* 20:18 */     int i = uh.m(localJsonObject, "pack_format");
/* 21:19 */     return new cwx(localho, i);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public JsonElement serialize(cwx paramcwx, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/* 25:   */   {
/* 26:24 */     JsonObject localJsonObject = new JsonObject();
/* 27:   */     
/* 28:26 */     localJsonObject.addProperty("pack_format", Integer.valueOf(paramcwx.b()));
/* 29:27 */     localJsonObject.add("description", paramJsonSerializationContext.serialize(paramcwx.a()));
/* 30:   */     
/* 31:29 */     return localJsonObject;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String a()
/* 35:   */   {
/* 36:34 */     return "pack";
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwy
 * JD-Core Version:    0.7.0.1
 */