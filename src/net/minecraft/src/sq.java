package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonElement;
/*  2:   */ import com.google.gson.JsonObject;
/*  3:   */ import com.mojang.authlib.GameProfile;
/*  4:   */ import java.util.UUID;
/*  5:   */ 
/*  6:   */ public class sq
/*  7:   */   extends sr
/*  8:   */ {
/*  9:   */   private final int a;
/* 10:   */   
/* 11:   */   public sq(GameProfile paramGameProfile, int paramInt)
/* 12:   */   {
/* 13:13 */     super(paramGameProfile);
/* 14:14 */     this.a = paramInt;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public sq(JsonObject paramJsonObject)
/* 18:   */   {
/* 19:18 */     super(b(paramJsonObject), paramJsonObject);
/* 20:19 */     this.a = (paramJsonObject.has("level") ? paramJsonObject.get("level").getAsInt() : 0);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int a()
/* 24:   */   {
/* 25:23 */     return this.a;
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected void a(JsonObject paramJsonObject)
/* 29:   */   {
/* 30:28 */     if (f() == null) {
/* 31:29 */       return;
/* 32:   */     }
/* 33:31 */     paramJsonObject.addProperty("uuid", ((GameProfile)f()).getId() == null ? "" : ((GameProfile)f()).getId().toString());
/* 34:32 */     paramJsonObject.addProperty("name", ((GameProfile)f()).getName());
/* 35:33 */     super.a(paramJsonObject);
/* 36:34 */     paramJsonObject.addProperty("level", Integer.valueOf(this.a));
/* 37:   */   }
/* 38:   */   
/* 39:   */   private static GameProfile b(JsonObject paramJsonObject)
/* 40:   */   {
/* 41:38 */     if ((!paramJsonObject.has("uuid")) || (!paramJsonObject.has("name"))) {
/* 42:39 */       return null;
/* 43:   */     }
/* 44:41 */     String str = paramJsonObject.get("uuid").getAsString();
/* 45:   */     UUID localUUID;
/* 46:   */     try
/* 47:   */     {
/* 48:44 */       localUUID = UUID.fromString(str);
/* 49:   */     }
/* 50:   */     catch (Throwable localThrowable)
/* 51:   */     {
/* 52:46 */       return null;
/* 53:   */     }
/* 54:48 */     return new GameProfile(localUUID, paramJsonObject.get("name").getAsString());
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sq
 * JD-Core Version:    0.7.0.1
 */