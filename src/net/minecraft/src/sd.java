package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonObject;
/*  2:   */ import java.io.File;
/*  3:   */ import java.net.SocketAddress;
/*  4:   */ 
/*  5:   */ public class sd
/*  6:   */   extends ss
/*  7:   */ {
/*  8:   */   public sd(File paramFile)
/*  9:   */   {
/* 10:10 */     super(paramFile);
/* 11:   */   }
/* 12:   */   
/* 13:   */   protected sr a(JsonObject paramJsonObject)
/* 14:   */   {
/* 15:15 */     return new se(paramJsonObject);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean a(SocketAddress paramSocketAddress)
/* 19:   */   {
/* 20:19 */     String str = c(paramSocketAddress);
/* 21:20 */     return d(str);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public se b(SocketAddress paramSocketAddress)
/* 25:   */   {
/* 26:24 */     String str = c(paramSocketAddress);
/* 27:25 */     return (se)b(str);
/* 28:   */   }
/* 29:   */   
/* 30:   */   private String c(SocketAddress paramSocketAddress)
/* 31:   */   {
/* 32:29 */     String str = paramSocketAddress.toString();
/* 33:30 */     if (str.contains("/")) {
/* 34:31 */       str = str.substring(str.indexOf('/') + 1);
/* 35:   */     }
/* 36:33 */     if (str.contains(":")) {
/* 37:34 */       str = str.substring(0, str.indexOf(':'));
/* 38:   */     }
/* 39:36 */     return str;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sd
 * JD-Core Version:    0.7.0.1
 */