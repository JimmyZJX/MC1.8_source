package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonArray;
/*   2:    */ import com.google.gson.JsonDeserializationContext;
/*   3:    */ import com.google.gson.JsonDeserializer;
/*   4:    */ import com.google.gson.JsonElement;
/*   5:    */ import com.google.gson.JsonObject;
/*   6:    */ import com.google.gson.JsonSerializationContext;
/*   7:    */ import com.google.gson.JsonSerializer;
/*   8:    */ import com.mojang.authlib.GameProfile;
/*   9:    */ import java.lang.reflect.Type;
/*  10:    */ import java.util.UUID;
/*  11:    */ 
/*  12:    */ public class nr
/*  13:    */   implements JsonDeserializer<nq>, JsonSerializer<nq>
/*  14:    */ {
/*  15:    */   public nq deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  16:    */   {
/*  17: 81 */     JsonObject localJsonObject1 = uh.l(paramJsonElement, "players");
/*  18: 82 */     nq localnq = new nq(uh.m(localJsonObject1, "max"), uh.m(localJsonObject1, "online"));
/*  19: 84 */     if (uh.d(localJsonObject1, "sample"))
/*  20:    */     {
/*  21: 85 */       JsonArray localJsonArray = uh.t(localJsonObject1, "sample");
/*  22: 86 */       if (localJsonArray.size() > 0)
/*  23:    */       {
/*  24: 87 */         GameProfile[] arrayOfGameProfile = new GameProfile[localJsonArray.size()];
/*  25: 88 */         for (int i = 0; i < arrayOfGameProfile.length; i++)
/*  26:    */         {
/*  27: 89 */           JsonObject localJsonObject2 = uh.l(localJsonArray.get(i), "player[" + i + "]");
/*  28: 90 */           String str = uh.h(localJsonObject2, "id");
/*  29: 91 */           arrayOfGameProfile[i] = new GameProfile(UUID.fromString(str), uh.h(localJsonObject2, "name"));
/*  30:    */         }
/*  31: 93 */         localnq.a(arrayOfGameProfile);
/*  32:    */       }
/*  33:    */     }
/*  34: 97 */     return localnq;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public JsonElement serialize(nq paramnq, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*  38:    */   {
/*  39:102 */     JsonObject localJsonObject1 = new JsonObject();
/*  40:    */     
/*  41:104 */     localJsonObject1.addProperty("max", Integer.valueOf(paramnq.a()));
/*  42:105 */     localJsonObject1.addProperty("online", Integer.valueOf(paramnq.b()));
/*  43:107 */     if ((paramnq.c() != null) && (paramnq.c().length > 0))
/*  44:    */     {
/*  45:108 */       JsonArray localJsonArray = new JsonArray();
/*  46:110 */       for (int i = 0; i < paramnq.c().length; i++)
/*  47:    */       {
/*  48:111 */         JsonObject localJsonObject2 = new JsonObject();
/*  49:112 */         UUID localUUID = paramnq.c()[i].getId();
/*  50:113 */         localJsonObject2.addProperty("id", localUUID == null ? "" : localUUID.toString());
/*  51:114 */         localJsonObject2.addProperty("name", paramnq.c()[i].getName());
/*  52:115 */         localJsonArray.add(localJsonObject2);
/*  53:    */       }
/*  54:118 */       localJsonObject1.add("sample", localJsonArray);
/*  55:    */     }
/*  56:121 */     return localJsonObject1;
/*  57:    */   }
/*  58:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     nr
 * JD-Core Version:    0.7.0.1
 */