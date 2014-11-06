package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public enum bsl
/*  5:   */ { a("integer"),b("hearts"); // TODO: BROKEN
/*  6:   */   private static final Map<String,bsl> c;
/*  7:   */   private final String d;
/*  8:   */   
/*  9:   */   static
/* 10:   */   {
/* 11:50 */     c = Maps.newHashMap();
/* 12:54 */     for (bsl localbsl : values()) {
/* 13:55 */       c.put(localbsl.a(), localbsl);
/* 14:   */     }
/* 15:   */   }
/* 16:   */   
/* 17:   */   private bsl(String paramString)
/* 18:   */   {
/* 19:60 */     this.d = paramString;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String a()
/* 23:   */   {
/* 24:64 */     return this.d;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public static bsl a(String paramString)
/* 28:   */   {
/* 29:68 */     bsl localbsl = c.get(paramString);
/* 30:69 */     return localbsl == null ? a : localbsl;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsl
 * JD-Core Version:    0.7.0.1
 */