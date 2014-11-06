package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonArray;
/*  2:   */ import com.google.gson.JsonDeserializationContext;
/*  3:   */ import com.google.gson.JsonDeserializer;
/*  4:   */ import com.google.gson.JsonElement;
/*  5:   */ import com.google.gson.JsonObject;
/*  6:   */ import java.lang.reflect.Type;
/*  8:   */ import org.apache.commons.lang3.Validate;
/*  9:   */ 
/* 10:   */ public class cyd
/* 11:   */   implements JsonDeserializer<cya>
/* 12:   */ {
/* 13:   */   public cya deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 14:   */   {
/* 15:12 */     JsonObject localJsonObject1 = uh.l(paramJsonElement, "entry");
/* 16:13 */     cya localcya = new cya();
/* 17:   */     
/* 18:15 */     localcya.a(uh.a(localJsonObject1, "replace", false));
/* 19:   */     
/* 20:17 */     cxz localcxz = cxz.a(uh.a(localJsonObject1, "category", cxz.a.a()));
/* 21:18 */     localcya.a(localcxz);
/* 22:19 */     Validate.notNull(localcxz, "Invalid category", new Object[0]);
/* 23:21 */     if (localJsonObject1.has("sounds"))
/* 24:   */     {
/* 25:22 */       JsonArray localJsonArray = uh.t(localJsonObject1, "sounds");
/* 26:23 */       for (int i = 0; i < localJsonArray.size(); i++)
/* 27:   */       {
/* 28:24 */         JsonElement localJsonElement = localJsonArray.get(i);
/* 29:25 */         cyb localcyb = new cyb();
/* 30:27 */         if (uh.a(localJsonElement))
/* 31:   */         {
/* 32:28 */           localcyb.a(uh.a(localJsonElement, "sound"));
/* 33:   */         }
/* 34:   */         else
/* 35:   */         {
/* 36:30 */           JsonObject localJsonObject2 = uh.l(localJsonElement, "sound");
/* 37:31 */           localcyb.a(uh.h(localJsonObject2, "name"));
/* 38:33 */           if (localJsonObject2.has("type"))
/* 39:   */           {
/* 40:34 */             EnumFileEvent localcyc = EnumFileEvent.a(uh.h(localJsonObject2, "type"));
/* 41:35 */             Validate.notNull(localcyc, "Invalid type", new Object[0]);
/* 42:36 */             localcyb.a(localcyc);
/* 43:   */           }
/* 44:   */           float f;
/* 45:39 */           if (localJsonObject2.has("volume"))
/* 46:   */           {
/* 47:40 */             f = uh.k(localJsonObject2, "volume");
/* 48:41 */             Validate.isTrue(f > 0.0F, "Invalid volume", new Object[0]);
/* 49:42 */             localcyb.a(f);
/* 50:   */           }
/* 51:45 */           if (localJsonObject2.has("pitch"))
/* 52:   */           {
/* 53:46 */             f = uh.k(localJsonObject2, "pitch");
/* 54:47 */             Validate.isTrue(f > 0.0F, "Invalid pitch", new Object[0]);
/* 55:48 */             localcyb.b(f);
/* 56:   */           }
/* 57:51 */           if (localJsonObject2.has("weight"))
/* 58:   */           {
/* 59:52 */             int j = uh.m(localJsonObject2, "weight");
/* 60:53 */             Validate.isTrue(j > 0, "Invalid weight", new Object[0]);
/* 61:54 */             localcyb.a(j);
/* 62:   */           }
/* 63:57 */           if (localJsonObject2.has("stream")) {
/* 64:58 */             localcyb.a(uh.i(localJsonObject2, "stream"));
/* 65:   */           }
/* 66:   */         }
/* 67:62 */         localcya.a().add(localcyb);
/* 68:   */       }
/* 69:   */     }
/* 70:66 */     return localcya;
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyd
 * JD-Core Version:    0.7.0.1
 */