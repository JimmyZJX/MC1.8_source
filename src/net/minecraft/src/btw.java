package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import com.mojang.util.UUIDTypeAdapter;
/*  3:   */ import java.util.UUID;
/*  4:   */ 
/*  5:   */ public class btw
/*  6:   */ {
/*  7:   */   private final String a;
/*  8:   */   private final String b;
/*  9:   */   private final String c;
/* 10:   */   private final btx d;
/* 11:   */   
/* 12:   */   public btw(String paramString1, String paramString2, String paramString3, String paramString4)
/* 13:   */   {
/* 14:18 */     this.a = paramString1;
/* 15:19 */     this.b = paramString2;
/* 16:20 */     this.c = paramString3;
/* 17:21 */     this.d = btx.a(paramString4);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String a()
/* 21:   */   {
/* 22:25 */     return "token:" + this.c + ":" + this.b;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String b()
/* 26:   */   {
/* 27:29 */     return this.b;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String c()
/* 31:   */   {
/* 32:33 */     return this.a;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String d()
/* 36:   */   {
/* 37:37 */     return this.c;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public GameProfile e()
/* 41:   */   {
/* 42:   */     try
/* 43:   */     {
/* 44:42 */       UUID localUUID = UUIDTypeAdapter.fromString(b());
/* 45:43 */       return new GameProfile(localUUID, c());
/* 46:   */     }
/* 47:   */     catch (IllegalArgumentException localIllegalArgumentException) {}
/* 48:45 */     return new GameProfile(null, c());
/* 49:   */   }
/* 50:   */   
/* 51:   */   public btx f()
/* 52:   */   {
/* 53:50 */     return this.d;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btw
 * JD-Core Version:    0.7.0.1
 */