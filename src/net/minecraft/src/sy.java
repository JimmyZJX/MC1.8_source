package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonElement;
/*  2:   */ import com.google.gson.JsonObject;
/*  3:   */ import com.mojang.authlib.GameProfile;
/*  4:   */ import java.util.UUID;
/*  5:   */ 
/*  6:   */ public class sy
/*  7:   */   extends sr
/*  8:   */ {
/*  9:   */   public sy(GameProfile paramGameProfile)
/* 10:   */   {
/* 11:10 */     super(paramGameProfile);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public sy(JsonObject paramJsonObject)
/* 15:   */   {
/* 16:14 */     super(b(paramJsonObject), paramJsonObject);
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(JsonObject paramJsonObject)
/* 20:   */   {
/* 21:19 */     if (f() == null) {
/* 22:20 */       return;
/* 23:   */     }
/* 24:22 */     paramJsonObject.addProperty("uuid", ((GameProfile)f()).getId() == null ? "" : ((GameProfile)f()).getId().toString());
/* 25:23 */     paramJsonObject.addProperty("name", ((GameProfile)f()).getName());
/* 26:24 */     super.a(paramJsonObject);
/* 27:   */   }
/* 28:   */   
/* 29:   */   private static GameProfile b(JsonObject paramJsonObject)
/* 30:   */   {
/* 31:28 */     if ((!paramJsonObject.has("uuid")) || (!paramJsonObject.has("name"))) {
/* 32:29 */       return null;
/* 33:   */     }
/* 34:31 */     String str = paramJsonObject.get("uuid").getAsString();
/* 35:   */     UUID localUUID;
/* 36:   */     try
/* 37:   */     {
/* 38:34 */       localUUID = UUID.fromString(str);
/* 39:   */     }
/* 40:   */     catch (Throwable localThrowable)
/* 41:   */     {
/* 42:36 */       return null;
/* 43:   */     }
/* 44:38 */     return new GameProfile(localUUID, paramJsonObject.get("name").getAsString());
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sy
 * JD-Core Version:    0.7.0.1
 */