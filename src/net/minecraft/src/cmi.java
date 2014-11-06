package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.gson.JsonDeserializationContext;
/*   3:    */ import com.google.gson.JsonDeserializer;
/*   4:    */ import com.google.gson.JsonElement;
/*   5:    */ import com.google.gson.JsonObject;

/*   6:    */ import java.lang.reflect.Type;
/*   7:    */ import java.util.ArrayList;
/*   8:    */ import java.util.List;
import java.util.Map;
/*  10:    */ 
/*  11:    */ public class cmi
/*  12:    */   implements JsonDeserializer<cmh>
/*  13:    */ {
/*  14:    */   public cmh deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  15:    */   {
/*  16:222 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/*  17:    */     
/*  18:224 */     List<cmm> localList = a(paramJsonDeserializationContext, localJsonObject);
/*  19:    */     
/*  20:226 */     return new cmh(localList);
/*  21:    */   }
/*  22:    */   
/*  23:    */   protected List<cmm> a(JsonDeserializationContext paramJsonDeserializationContext, JsonObject paramJsonObject)
/*  24:    */   {
/*  25:230 */     JsonObject localJsonObject = uh.s(paramJsonObject, "variants");
/*  26:    */     
/*  27:232 */     ArrayList<cmm> localArrayList = Lists.newArrayList();
/*  28:233 */     for (Map.Entry<String,JsonElement> localEntry : localJsonObject.entrySet()) {
/*  29:234 */       localArrayList.add(a(paramJsonDeserializationContext, localEntry));
/*  30:    */     }
/*  31:237 */     return localArrayList;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected cmm a(JsonDeserializationContext paramJsonDeserializationContext, Map.Entry<String,JsonElement> paramEntry)
/*  35:    */   {
/*  36:241 */     String str = paramEntry.getKey();
/*  37:    */     
/*  38:243 */     ArrayList<cmk> localArrayList = Lists.newArrayList();
/*  39:244 */     JsonElement localJsonElement1 = (JsonElement)paramEntry.getValue();
/*  40:245 */     if (localJsonElement1.isJsonArray()) {
/*  41:246 */       for (JsonElement localJsonElement2 : localJsonElement1.getAsJsonArray()) {
/*  42:247 */         localArrayList.add((cmk)paramJsonDeserializationContext.deserialize(localJsonElement2, cmk.class));
/*  43:    */       }
/*  44:    */     } else {
/*  45:250 */       localArrayList.add((cmk)paramJsonDeserializationContext.deserialize(localJsonElement1, cmk.class));
/*  46:    */     }
/*  47:253 */     return new cmm(str, localArrayList);
/*  48:    */   }
/*  49:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmi
 * JD-Core Version:    0.7.0.1
 */