package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Sets;
/*  2:   */ import com.google.gson.JsonDeserializationContext;
/*  3:   */ import com.google.gson.JsonElement;
/*  4:   */ import com.google.gson.JsonObject;
/*  5:   */ import com.google.gson.JsonParseException;

/*  6:   */ import java.lang.reflect.Type;
/*  7:   */ import java.util.HashSet;
import java.util.Map;
/* 10:   */ 
/* 11:   */ public class cwv
/* 12:   */   extends cwh<cwu>
/* 13:   */ {
/* 14:   */   public cwu deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 15:   */   {
/* 16:19 */     JsonObject localJsonObject1 = paramJsonElement.getAsJsonObject();
/* 17:20 */     HashSet<cwd> localHashSet = Sets.newHashSet();
/* 18:22 */     for (Map.Entry<String,JsonElement> localEntry : localJsonObject1.entrySet())
/* 19:   */     {
/* 20:23 */       String str1 = (String)localEntry.getKey();
/* 21:24 */       JsonObject localJsonObject2 = uh.l((JsonElement)localEntry.getValue(), "language");
/* 22:25 */       String str2 = uh.h(localJsonObject2, "region");
/* 23:26 */       String str3 = uh.h(localJsonObject2, "name");
/* 24:27 */       boolean bool = uh.a(localJsonObject2, "bidirectional", false);
/* 25:29 */       if (str2.isEmpty()) {
/* 26:30 */         throw new JsonParseException("Invalid language->'" + str1 + "'->region: empty value");
/* 27:   */       }
/* 28:33 */       if (str3.isEmpty()) {
/* 29:34 */         throw new JsonParseException("Invalid language->'" + str1 + "'->name: empty value");
/* 30:   */       }
/* 31:37 */       if (!localHashSet.add(new cwd(str1, str2, str3, bool))) {
/* 32:38 */         throw new JsonParseException("Duplicate language->'" + str1 + "' defined");
/* 33:   */       }
/* 34:   */     }
/* 35:42 */     return new cwu(localHashSet);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String a()
/* 39:   */   {
/* 40:47 */     return "language";
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwv
 * JD-Core Version:    0.7.0.1
 */