package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonDeserializationContext;
/*   2:    */ import com.google.gson.JsonDeserializer;
/*   3:    */ import com.google.gson.JsonElement;
/*   4:    */ import com.google.gson.JsonObject;
/*   5:    */ import com.google.gson.JsonSerializationContext;
/*   6:    */ import com.google.gson.JsonSerializer;
/*   7:    */ import java.lang.reflect.Type;
/*   8:    */ 
/*   9:    */ public class ns
/*  10:    */   implements JsonDeserializer<np>, JsonSerializer<np>
/*  11:    */ {
/*  12:    */   public np deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  13:    */   {
/*  14:163 */     JsonObject localJsonObject = uh.l(paramJsonElement, "status");
/*  15:164 */     np localnp = new np();
/*  16:166 */     if (localJsonObject.has("description")) {
/*  17:167 */       localnp.a((ho)paramJsonDeserializationContext.deserialize(localJsonObject.get("description"), ho.class));
/*  18:    */     }
/*  19:170 */     if (localJsonObject.has("players")) {
/*  20:171 */       localnp.a((nq)paramJsonDeserializationContext.deserialize(localJsonObject.get("players"), nq.class));
/*  21:    */     }
/*  22:174 */     if (localJsonObject.has("version")) {
/*  23:175 */       localnp.a((nt)paramJsonDeserializationContext.deserialize(localJsonObject.get("version"), nt.class));
/*  24:    */     }
/*  25:178 */     if (localJsonObject.has("favicon")) {
/*  26:179 */       localnp.a(uh.h(localJsonObject, "favicon"));
/*  27:    */     }
/*  28:182 */     return localnp;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public JsonElement serialize(np paramnp, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*  32:    */   {
/*  33:187 */     JsonObject localJsonObject = new JsonObject();
/*  34:189 */     if (paramnp.a() != null) {
/*  35:190 */       localJsonObject.add("description", paramJsonSerializationContext.serialize(paramnp.a()));
/*  36:    */     }
/*  37:193 */     if (paramnp.b() != null) {
/*  38:194 */       localJsonObject.add("players", paramJsonSerializationContext.serialize(paramnp.b()));
/*  39:    */     }
/*  40:197 */     if (paramnp.c() != null) {
/*  41:198 */       localJsonObject.add("version", paramJsonSerializationContext.serialize(paramnp.c()));
/*  42:    */     }
/*  43:201 */     if (paramnp.d() != null) {
/*  44:202 */       localJsonObject.addProperty("favicon", paramnp.d());
/*  45:    */     }
/*  46:205 */     return localJsonObject;
/*  47:    */   }
/*  48:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ns
 * JD-Core Version:    0.7.0.1
 */