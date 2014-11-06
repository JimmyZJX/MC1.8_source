package net.minecraft.src;
/*  1:   */ public class v
/*  2:   */ {
/*  3:   */   public static boolean a(char paramChar)
/*  4:   */   {
/*  5:35 */     return (paramChar != '§') && (paramChar >= ' ') && (paramChar != '');
/*  6:   */   }
/*  7:   */   
/*  8:38 */   public static final char[] a = { '/', '\n', '\r', '\t', '\000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':' };
/*  9:   */   
/* 10:   */   public static String a(String paramString)
/* 11:   */   {
/* 12:47 */     StringBuilder localStringBuilder = new StringBuilder();
/* 13:49 */     for (char c : paramString.toCharArray()) {
/* 14:50 */       if (a(c)) {
/* 15:51 */         localStringBuilder.append(c);
/* 16:   */       }
/* 17:   */     }
/* 18:55 */     return localStringBuilder.toString();
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     v
 * JD-Core Version:    0.7.0.1
 */