package net.minecraft.src;
/*  1:   */ import java.util.regex.Matcher;
/*  2:   */ import java.util.regex.Pattern;
/*  3:   */ import org.apache.commons.lang3.StringUtils;
/*  4:   */ 
/*  5:   */ public class vb
/*  6:   */ {
/*  7:10 */   private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
/*  8:   */   
/*  9:   */   public static String a(int paramInt)
/* 10:   */   {
/* 11:13 */     int i = paramInt / 20;
/* 12:14 */     int j = i / 60;
/* 13:15 */     i %= 60;
/* 14:17 */     if (i < 10) {
/* 15:18 */       return j + ":0" + i;
/* 16:   */     }
/* 17:20 */     return j + ":" + i;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public static String a(String paramString)
/* 21:   */   {
/* 22:24 */     return a.matcher(paramString).replaceAll("");
/* 23:   */   }
/* 24:   */   
/* 25:   */   public static boolean b(String paramString)
/* 26:   */   {
/* 27:28 */     return StringUtils.isEmpty(paramString);
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     vb
 * JD-Core Version:    0.7.0.1
 */