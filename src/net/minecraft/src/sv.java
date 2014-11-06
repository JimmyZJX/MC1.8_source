package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonObject;
/*  2:   */ import com.mojang.authlib.GameProfile;
/*  3:   */ import java.io.File;
/*  6:   */ 
/*  7:   */ public class sv
/*  8:   */   extends ss<sw>
/*  9:   */ {
/* 10:   */   public sv(File paramFile)
/* 11:   */   {
/* 12:10 */     super(paramFile);
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected sr a(JsonObject paramJsonObject)
/* 16:   */   {
/* 17:15 */     return new sw(paramJsonObject);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a(GameProfile paramGameProfile)
/* 21:   */   {
/* 22:19 */     return d(paramGameProfile);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String[] a()
/* 26:   */   {
/* 27:24 */     String[] arrayOfString = new String[e().size()];
/* 28:25 */     int i = 0;
/* 29:26 */     for (sw localsw : e().values()) {
/* 30:27 */       arrayOfString[(i++)] = ((GameProfile)localsw.f()).getName();
/* 31:   */     }
/* 32:29 */     return arrayOfString;
/* 33:   */   }
/* 34:   */   
/* 35:   */   protected String b(GameProfile paramGameProfile)
/* 36:   */   {
/* 37:34 */     return paramGameProfile.getId().toString();
/* 38:   */   }
/* 39:   */   
/* 40:   */   public GameProfile a(String paramString)
/* 41:   */   {
/* 42:38 */     for (sw localsw : e().values()) {
/* 43:39 */       if (paramString.equalsIgnoreCase(((GameProfile)localsw.f()).getName())) {
/* 44:40 */         return (GameProfile)localsw.f();
/* 45:   */       }
/* 46:   */     }
/* 47:43 */     return null;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sv
 * JD-Core Version:    0.7.0.1
 */