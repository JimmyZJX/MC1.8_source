package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonDeserializationContext;
/*  2:   */ import com.google.gson.JsonDeserializer;
/*  3:   */ import com.google.gson.JsonElement;
/*  4:   */ import com.google.gson.JsonObject;
/*  5:   */ import java.lang.reflect.Type;
/*  6:   */ 
/*  7:   */ class cly
/*  8:   */   implements JsonDeserializer<clx>
/*  9:   */ {
/* 10:   */   public clx deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 11:   */   {
/* 12:31 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 13:   */     
/* 14:33 */     EnumDirection localej = c(localJsonObject);
/* 15:34 */     int i = a(localJsonObject);
/* 16:35 */     String str = b(localJsonObject);
/* 17:36 */     cma localcma = (cma)paramJsonDeserializationContext.deserialize(localJsonObject, cma.class);
/* 18:   */     
/* 19:38 */     return new clx(localej, i, str, localcma);
/* 20:   */   }
/* 21:   */   
/* 22:   */   protected int a(JsonObject paramJsonObject)
/* 23:   */   {
/* 24:42 */     return uh.a(paramJsonObject, "tintindex", -1);
/* 25:   */   }
/* 26:   */   
/* 27:   */   private String b(JsonObject paramJsonObject)
/* 28:   */   {
/* 29:46 */     return uh.h(paramJsonObject, "texture");
/* 30:   */   }
/* 31:   */   
/* 32:   */   private EnumDirection c(JsonObject paramJsonObject)
/* 33:   */   {
/* 34:51 */     String str = uh.a(paramJsonObject, "cullface", "");
/* 35:52 */     return EnumDirection.a(str);
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cly
 * JD-Core Version:    0.7.0.1
 */