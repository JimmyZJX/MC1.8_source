package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonDeserializationContext;
/*   2:    */ import com.google.gson.JsonDeserializer;
/*   3:    */ import com.google.gson.JsonElement;
/*   4:    */ import com.google.gson.JsonObject;
/*   5:    */ import com.google.gson.JsonSerializationContext;
/*   6:    */ import com.google.gson.JsonSerializer;
/*   7:    */ import com.mojang.authlib.GameProfile;
/*   8:    */ import java.lang.reflect.Type;
/*   9:    */ import java.text.ParseException;
/*  11:    */ import java.util.Date;
/*  12:    */ import java.util.UUID;
/*  13:    */ 
/*  14:    */ class sc
/*  15:    */   implements JsonDeserializer<sb>, JsonSerializer<sb>
/*  16:    */ {
				private final ry a;
/*  17:    */   private sc(ry paramry) {a=paramry;}
/*  18:    */   
/*  19:    */   public JsonElement serialize(sb paramsb, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*  20:    */   {
/*  21:200 */     JsonObject localJsonObject = new JsonObject();
/*  22:201 */     localJsonObject.addProperty("name", paramsb.a().getName());
/*  23:202 */     UUID localUUID = paramsb.a().getId();
/*  24:203 */     localJsonObject.addProperty("uuid", localUUID == null ? "" : localUUID.toString());
/*  25:204 */     localJsonObject.addProperty("expiresOn", ry.a.format(paramsb.b()));
/*  26:205 */     return localJsonObject;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public sb deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  30:    */   {
/*  31:210 */     if (paramJsonElement.isJsonObject())
/*  32:    */     {
/*  33:211 */       JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/*  34:212 */       JsonElement localJsonElement1 = localJsonObject.get("name");
/*  35:213 */       JsonElement localJsonElement2 = localJsonObject.get("uuid");
/*  36:214 */       JsonElement localJsonElement3 = localJsonObject.get("expiresOn");
/*  37:215 */       if ((localJsonElement1 == null) || (localJsonElement2 == null)) {
/*  38:216 */         return null;
/*  39:    */       }
/*  40:218 */       String str1 = localJsonElement2.getAsString();
/*  41:219 */       String str2 = localJsonElement1.getAsString();
/*  42:220 */       Date localDate = null;
/*  43:221 */       if (localJsonElement3 != null) {
/*  44:    */         try
/*  45:    */         {
/*  46:223 */           localDate = ry.a.parse(localJsonElement3.getAsString());
/*  47:    */         }
/*  48:    */         catch (ParseException localParseException)
/*  49:    */         {
/*  50:225 */           localDate = null;
/*  51:    */         }
/*  52:    */       }
/*  53:228 */       if ((str2 == null) || (str1 == null)) {
/*  54:229 */         return null;
/*  55:    */       }
/*  56:    */       UUID localUUID;
/*  57:    */       try
/*  58:    */       {
/*  59:233 */         localUUID = UUID.fromString(str1);
/*  60:    */       }
/*  61:    */       catch (Throwable localThrowable)
/*  62:    */       {
/*  63:235 */         return null;
/*  64:    */       }
/*  65:237 */       sb localsb = new sb(this.a, new GameProfile(localUUID, str2), localDate, null);
/*  66:238 */       return localsb;
/*  67:    */     }
/*  68:240 */     return null;
/*  69:    */   }
				sc(ry arg0, rz arg1) {this(arg0);}
/*  70:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sc
 * JD-Core Version:    0.7.0.1
 */