package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import com.google.gson.JsonArray;
/*  3:   */ import com.google.gson.JsonDeserializationContext;
/*  4:   */ import com.google.gson.JsonElement;
/*  5:   */ import com.google.gson.JsonObject;
/*  6:   */ import com.google.gson.JsonParseException;
/*  7:   */ import java.lang.reflect.Type;
/*  8:   */ import java.util.ArrayList;
/* 10:   */ 
/* 11:   */ public class cxc
/* 12:   */   extends cwh<cxb>
/* 13:   */ {
/* 14:   */   public cxb deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 15:   */   {
/* 16:14 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 17:15 */     boolean bool1 = uh.a(localJsonObject, "blur", false);
/* 18:16 */     boolean bool2 = uh.a(localJsonObject, "clamp", false);
/* 19:   */     
/* 20:18 */     ArrayList<Integer> localArrayList = Lists.newArrayList();
/* 21:19 */     if (localJsonObject.has("mipmaps")) {
/* 22:   */       try
/* 23:   */       {
/* 24:21 */         JsonArray localJsonArray = localJsonObject.getAsJsonArray("mipmaps");
/* 25:23 */         for (int i = 0; i < localJsonArray.size(); i++)
/* 26:   */         {
/* 27:24 */           JsonElement localJsonElement = localJsonArray.get(i);
/* 28:26 */           if (localJsonElement.isJsonPrimitive()) {
/* 29:   */             try
/* 30:   */             {
/* 31:28 */               localArrayList.add(Integer.valueOf(localJsonElement.getAsInt()));
/* 32:   */             }
/* 33:   */             catch (NumberFormatException localNumberFormatException)
/* 34:   */             {
/* 35:30 */               throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + localJsonElement, localNumberFormatException);
/* 36:   */             }
/* 37:32 */           } else if (localJsonElement.isJsonObject()) {
/* 38:33 */             throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + localJsonElement);
/* 39:   */           }
/* 40:   */         }
/* 41:   */       }
/* 42:   */       catch (ClassCastException localClassCastException)
/* 43:   */       {
/* 44:39 */         throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + localJsonObject.get("mipmaps"), localClassCastException);
/* 45:   */       }
/* 46:   */     }
/* 47:42 */     return new cxb(bool1, bool2, localArrayList);
/* 48:   */   }
/* 49:   */   
/* 50:   */   public String a()
/* 51:   */   {
/* 52:47 */     return "texture";
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxc
 * JD-Core Version:    0.7.0.1
 */