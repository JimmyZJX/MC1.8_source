package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonObject;
/*  2:   */ import com.mojang.authlib.GameProfile;
/*  3:   */ import java.io.File;
/*  6:   */ 
/*  7:   */ public class sx
/*  8:   */   extends ss<sy>
/*  9:   */ {
/* 10:   */   public sx(File paramFile)
/* 11:   */   {
/* 12:10 */     super(paramFile);
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected sr a(JsonObject paramJsonObject)
/* 16:   */   {
/* 17:15 */     return new sy(paramJsonObject);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String[] a()
/* 21:   */   {
/* 22:24 */     String[] arrayOfString = new String[e().size()];
/* 23:25 */     int i = 0;
/* 24:26 */     for (sy localsy : e().values()) {
/* 25:27 */       arrayOfString[(i++)] = ((GameProfile)localsy.f()).getName();
/* 26:   */     }
/* 27:29 */     return arrayOfString;
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected String b(GameProfile paramGameProfile)
/* 31:   */   {
/* 32:34 */     return paramGameProfile.getId().toString();
/* 33:   */   }
/* 34:   */   
/* 35:   */   public GameProfile a(String paramString)
/* 36:   */   {
/* 37:38 */     for (sy localsy : e().values()) {
/* 38:39 */       if (paramString.equalsIgnoreCase(((GameProfile)localsy.f()).getName())) {
/* 39:40 */         return (GameProfile)localsy.f();
/* 40:   */       }
/* 41:   */     }
/* 42:43 */     return null;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sx
 * JD-Core Version:    0.7.0.1
 */