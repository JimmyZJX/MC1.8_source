package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonDeserializationContext;
/*   2:    */ import com.google.gson.JsonDeserializer;
/*   3:    */ import com.google.gson.JsonElement;
/*   4:    */ import com.google.gson.JsonObject;
/*   5:    */ import com.google.gson.JsonParseException;
/*   6:    */ import java.lang.reflect.Type;
/*   7:    */ 
/*   8:    */ public class cml
/*   9:    */   implements JsonDeserializer<cmk>
/*  10:    */ {
/*  11:    */   public cmk deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  12:    */   {
/*  13:178 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/*  14:    */     
/*  15:180 */     String str = b(localJsonObject);
/*  16:181 */     cxf localcxf = a(localJsonObject);
/*  17:182 */     boolean bool = d(localJsonObject);
/*  18:183 */     int i = c(localJsonObject);
/*  19:    */     
/*  20:185 */     return new cmk(a(str), localcxf, bool, i);
/*  21:    */   }
/*  22:    */   
/*  23:    */   private oa a(String paramString)
/*  24:    */   {
/*  25:189 */     oa localoa = new oa(paramString);
/*  26:190 */     localoa = new oa(localoa.b(), "block/" + localoa.a());
/*  27:191 */     return localoa;
/*  28:    */   }
/*  29:    */   
/*  30:    */   private boolean d(JsonObject paramJsonObject)
/*  31:    */   {
/*  32:195 */     return uh.a(paramJsonObject, "uvlock", false);
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected cxf a(JsonObject paramJsonObject)
/*  36:    */   {
/*  37:199 */     int i = uh.a(paramJsonObject, "x", 0);
/*  38:200 */     int j = uh.a(paramJsonObject, "y", 0);
/*  39:    */     
/*  40:202 */     cxf localcxf = cxf.a(i, j);
/*  41:203 */     if (localcxf == null) {
/*  42:204 */       throw new JsonParseException("Invalid BlockModelRotation x: " + i + ", y: " + j);
/*  43:    */     }
/*  44:206 */     return localcxf;
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected String b(JsonObject paramJsonObject)
/*  48:    */   {
/*  49:210 */     return uh.h(paramJsonObject, "model");
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected int c(JsonObject paramJsonObject)
/*  53:    */   {
/*  54:214 */     return uh.a(paramJsonObject, "weight", 1);
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cml
 * JD-Core Version:    0.7.0.1
 */