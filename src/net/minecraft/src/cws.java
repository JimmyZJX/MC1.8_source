package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonDeserializationContext;
/*  2:   */ import com.google.gson.JsonElement;
/*  3:   */ import com.google.gson.JsonObject;
/*  4:   */ import com.google.gson.JsonParseException;
/*  5:   */ import java.lang.reflect.Type;
/*  6:   */ import org.apache.commons.lang3.Validate;
/*  7:   */ 
/*  8:   */ public class cws
/*  9:   */   extends cwh<cwr>
/* 10:   */ {
/* 11:   */   public cwr deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/* 12:   */   {
/* 13:16 */     JsonObject localJsonObject1 = paramJsonElement.getAsJsonObject();
/* 14:17 */     float[] arrayOfFloat1 = new float[256];
/* 15:18 */     float[] arrayOfFloat2 = new float[256];
/* 16:19 */     float[] arrayOfFloat3 = new float[256];
/* 17:20 */     float f1 = 1.0F;
/* 18:21 */     float f2 = 0.0F;
/* 19:22 */     float f3 = 0.0F;
/* 20:24 */     if (localJsonObject1.has("characters"))
/* 21:   */     {
/* 22:25 */       if (!localJsonObject1.get("characters").isJsonObject()) {
/* 23:26 */         throw new JsonParseException("Invalid font->characters: expected object, was " + localJsonObject1.get("characters"));
/* 24:   */       }
/* 25:29 */       JsonObject localJsonObject2 = localJsonObject1.getAsJsonObject("characters");
/* 26:31 */       if (localJsonObject2.has("default"))
/* 27:   */       {
/* 28:32 */         if (!localJsonObject2.get("default").isJsonObject()) {
/* 29:33 */           throw new JsonParseException("Invalid font->characters->default: expected object, was " + localJsonObject2.get("default"));
/* 30:   */         }
/* 31:35 */         JsonObject localJsonObject3 = localJsonObject2.getAsJsonObject("default");
/* 32:   */         
/* 33:37 */         f1 = uh.a(localJsonObject3, "width", f1);
/* 34:38 */         Validate.inclusiveBetween(0.0D, 3.402823466385289E+038D, f1, "Invalid default width");
/* 35:39 */         f2 = uh.a(localJsonObject3, "spacing", f2);
/* 36:40 */         Validate.inclusiveBetween(0.0D, 3.402823466385289E+038D, f2, "Invalid default spacing");
/* 37:41 */         f3 = uh.a(localJsonObject3, "left", f2);
/* 38:42 */         Validate.inclusiveBetween(0.0D, 3.402823466385289E+038D, f3, "Invalid default left");
/* 39:   */       }
/* 40:45 */       for (int i = 0; i < 256; i++)
/* 41:   */       {
/* 42:46 */         JsonElement localJsonElement = localJsonObject2.get(Integer.toString(i));
/* 43:47 */         float f4 = f1;
/* 44:48 */         float f5 = f2;
/* 45:49 */         float f6 = f3;
/* 46:51 */         if (localJsonElement != null)
/* 47:   */         {
/* 48:52 */           JsonObject localJsonObject4 = uh.l(localJsonElement, "characters[" + i + "]");
/* 49:53 */           f4 = uh.a(localJsonObject4, "width", f1);
/* 50:54 */           Validate.inclusiveBetween(0.0D, 3.402823466385289E+038D, f4, "Invalid width");
/* 51:55 */           f5 = uh.a(localJsonObject4, "spacing", f2);
/* 52:56 */           Validate.inclusiveBetween(0.0D, 3.402823466385289E+038D, f5, "Invalid spacing");
/* 53:57 */           f6 = uh.a(localJsonObject4, "left", f3);
/* 54:58 */           Validate.inclusiveBetween(0.0D, 3.402823466385289E+038D, f6, "Invalid left");
/* 55:   */         }
/* 56:61 */         arrayOfFloat1[i] = f4;
/* 57:62 */         arrayOfFloat2[i] = f5;
/* 58:63 */         arrayOfFloat3[i] = f6;
/* 59:   */       }
/* 60:   */     }
/* 61:67 */     return new cwr(arrayOfFloat1, arrayOfFloat3, arrayOfFloat2);
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String a()
/* 65:   */   {
/* 66:72 */     return "font";
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cws
 * JD-Core Version:    0.7.0.1
 */