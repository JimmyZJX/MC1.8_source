package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonObject;
/*  2:   */ import com.mojang.authlib.GameProfile;
/*  3:   */ import java.io.File;
/*  6:   */ 
/*  7:   */ public class sp
/*  8:   */   extends ss<sq>
/*  9:   */ {
/* 10:   */   public sp(File paramFile)
/* 11:   */   {
/* 12:11 */     super(paramFile);
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected sr a(JsonObject paramJsonObject)
/* 16:   */   {
/* 17:16 */     return new sq(paramJsonObject);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String[] a()
/* 21:   */   {
/* 22:21 */     String[] arrayOfString = new String[e().size()];
/* 23:22 */     int i = 0;
/* 24:23 */     for (sq localsq : e().values()) {
/* 25:24 */       arrayOfString[(i++)] = ((GameProfile)localsq.f()).getName();
/* 26:   */     }
/* 27:26 */     return arrayOfString;
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected String b(GameProfile paramGameProfile)
/* 31:   */   {
/* 32:39 */     return paramGameProfile.getId().toString();
/* 33:   */   }
/* 34:   */   
/* 35:   */   public GameProfile a(String paramString)
/* 36:   */   {
/* 37:43 */     for (sq localsq : e().values()) {
/* 38:44 */       if (paramString.equalsIgnoreCase(((GameProfile)localsq.f()).getName())) {
/* 39:45 */         return (GameProfile)localsq.f();
/* 40:   */       }
/* 41:   */     }
/* 42:48 */     return null;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sp
 * JD-Core Version:    0.7.0.1
 */