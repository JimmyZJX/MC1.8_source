package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.gson.JsonDeserializationContext;
/*   4:    */ import com.google.gson.JsonDeserializer;
/*   5:    */ import com.google.gson.JsonElement;
/*   6:    */ import com.google.gson.JsonObject;
/*   7:    */ import com.google.gson.JsonParseException;
/*   8:    */ import java.lang.reflect.Type;
/*   9:    */ import java.util.ArrayList;
/*  10:    */ import java.util.HashMap;
/*  11:    */ import java.util.List;
/*  12:    */ import java.util.Map;
/*  13:    */ import java.util.Map.Entry;
/*  14:    */ import org.apache.commons.lang3.StringUtils;
/*  15:    */ 
/*  16:    */ public class cmf
/*  17:    */   implements JsonDeserializer<cmc>
/*  18:    */ {
/*  19:    */   public cmc deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  20:    */   {
/*  21:200 */     JsonObject localJsonObject1 = paramJsonElement.getAsJsonObject();
/*  22:    */     
/*  23:202 */     List localList = a(paramJsonDeserializationContext, localJsonObject1);
/*  24:203 */     String str = c(localJsonObject1);
/*  25:    */     
/*  26:205 */     boolean bool1 = StringUtils.isEmpty(str);
/*  27:206 */     boolean bool2 = localList.isEmpty();
/*  28:207 */     if ((bool2) && (bool1)) {
/*  29:208 */       throw new JsonParseException("BlockModel requires either elements or parent, found neither");
/*  30:    */     }
/*  31:211 */     if ((!bool1) && (!bool2)) {
/*  32:212 */       throw new JsonParseException("BlockModel requires either elements or parent, found both");
/*  33:    */     }
/*  34:215 */     Map localMap = b(localJsonObject1);
/*  35:216 */     boolean bool3 = a(localJsonObject1);
/*  36:    */     
/*  37:218 */     cmx localcmx = cmx.a;
/*  38:219 */     if (localJsonObject1.has("display"))
/*  39:    */     {
/*  40:220 */       JsonObject localJsonObject2 = uh.s(localJsonObject1, "display");
/*  41:221 */       localcmx = (cmx)paramJsonDeserializationContext.deserialize(localJsonObject2, cmx.class);
/*  42:    */     }
/*  43:224 */     if (bool2) {
/*  44:225 */       return new cmc(new oa(str), localMap, bool3, true, localcmx);
/*  45:    */     }
/*  46:227 */     return new cmc(localList, localMap, bool3, true, localcmx);
/*  47:    */   }
/*  48:    */   
/*  49:    */   private Map b(JsonObject paramJsonObject)
/*  50:    */   {
/*  51:232 */     HashMap localHashMap = Maps.newHashMap();
/*  52:234 */     if (paramJsonObject.has("textures"))
/*  53:    */     {
/*  54:235 */       JsonObject localJsonObject = paramJsonObject.getAsJsonObject("textures");
/*  55:236 */       for (Map.Entry localEntry : localJsonObject.entrySet()) {
/*  56:237 */         localHashMap.put(localEntry.getKey(), ((JsonElement)localEntry.getValue()).getAsString());
/*  57:    */       }
/*  58:    */     }
/*  59:241 */     return localHashMap;
/*  60:    */   }
/*  61:    */   
/*  62:    */   private String c(JsonObject paramJsonObject)
/*  63:    */   {
/*  64:245 */     return uh.a(paramJsonObject, "parent", "");
/*  65:    */   }
/*  66:    */   
/*  67:    */   protected boolean a(JsonObject paramJsonObject)
/*  68:    */   {
/*  69:249 */     return uh.a(paramJsonObject, "ambientocclusion", true);
/*  70:    */   }
/*  71:    */   
/*  72:    */   protected List a(JsonDeserializationContext paramJsonDeserializationContext, JsonObject paramJsonObject)
/*  73:    */   {
/*  74:253 */     ArrayList localArrayList = Lists.newArrayList();
/*  75:255 */     if (paramJsonObject.has("elements")) {
/*  76:256 */       for (JsonElement localJsonElement : uh.t(paramJsonObject, "elements")) {
/*  77:257 */         localArrayList.add((clu)paramJsonDeserializationContext.deserialize(localJsonElement, clu.class));
/*  78:    */       }
/*  79:    */     }
/*  80:260 */     return localArrayList;
/*  81:    */   }
/*  82:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmf
 * JD-Core Version:    0.7.0.1
 */