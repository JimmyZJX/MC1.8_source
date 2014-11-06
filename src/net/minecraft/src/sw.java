package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonElement;
/*  2:   */ import com.google.gson.JsonObject;
/*  3:   */ import com.mojang.authlib.GameProfile;
/*  4:   */ import java.util.Date;
/*  5:   */ import java.util.UUID;
/*  6:   */ 
/*  7:   */ public class sw
/*  8:   */   extends rx
/*  9:   */ {
/* 10:   */   public sw(GameProfile paramGameProfile)
/* 11:   */   {
/* 12:11 */     this(paramGameProfile, null, null, null, null);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public sw(GameProfile paramGameProfile, Date paramDate1, String paramString1, Date paramDate2, String paramString2)
/* 16:   */   {
/* 17:15 */     super(paramGameProfile, paramDate2, paramString1, paramDate2, paramString2);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public sw(JsonObject paramJsonObject)
/* 21:   */   {
/* 22:19 */     super(b(paramJsonObject), paramJsonObject);
/* 23:   */   }
/* 24:   */   
/* 25:   */   protected void a(JsonObject paramJsonObject)
/* 26:   */   {
/* 27:24 */     if (f() == null) {
/* 28:25 */       return;
/* 29:   */     }
/* 30:27 */     paramJsonObject.addProperty("uuid", ((GameProfile)f()).getId() == null ? "" : ((GameProfile)f()).getId().toString());
/* 31:28 */     paramJsonObject.addProperty("name", ((GameProfile)f()).getName());
/* 32:29 */     super.a(paramJsonObject);
/* 33:   */   }
/* 34:   */   
/* 35:   */   private static GameProfile b(JsonObject paramJsonObject)
/* 36:   */   {
/* 37:33 */     if ((!paramJsonObject.has("uuid")) || (!paramJsonObject.has("name"))) {
/* 38:34 */       return null;
/* 39:   */     }
/* 40:36 */     String str = paramJsonObject.get("uuid").getAsString();
/* 41:   */     UUID localUUID;
/* 42:   */     try
/* 43:   */     {
/* 44:39 */       localUUID = UUID.fromString(str);
/* 45:   */     }
/* 46:   */     catch (Throwable localThrowable)
/* 47:   */     {
/* 48:41 */       return null;
/* 49:   */     }
/* 50:43 */     return new GameProfile(localUUID, paramJsonObject.get("name").getAsString());
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sw
 * JD-Core Version:    0.7.0.1
 */