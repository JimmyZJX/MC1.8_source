package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonElement;
/*  2:   */ import com.google.gson.JsonObject;
/*  3:   */ import java.util.Date;
/*  4:   */ 
/*  5:   */ public class se
/*  6:   */   extends rx
/*  7:   */ {
/*  8:   */   public se(String paramString)
/*  9:   */   {
/* 10: 9 */     this(paramString, null, null, null, null);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public se(String paramString1, Date paramDate1, String paramString2, Date paramDate2, String paramString3)
/* 14:   */   {
/* 15:13 */     super(paramString1, paramDate1, paramString2, paramDate2, paramString3);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public se(JsonObject paramJsonObject)
/* 19:   */   {
/* 20:17 */     super(b(paramJsonObject), paramJsonObject);
/* 21:   */   }
/* 22:   */   
/* 23:   */   private static String b(JsonObject paramJsonObject)
/* 24:   */   {
/* 25:21 */     return paramJsonObject.has("ip") ? paramJsonObject.get("ip").getAsString() : null;
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected void a(JsonObject paramJsonObject)
/* 29:   */   {
/* 30:26 */     if (f() == null) {
/* 31:27 */       return;
/* 32:   */     }
/* 33:29 */     paramJsonObject.addProperty("ip", (String)f());
/* 34:30 */     super.a(paramJsonObject);
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     se
 * JD-Core Version:    0.7.0.1
 */