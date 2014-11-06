package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public enum hs
/*  5:   */ { a("",false),b("",false),c("",false),d("",false); // TODO: BROKEN
/*  6:   */   private static final Map<String,hs> e;
/*  7:   */   private final boolean f;
/*  8:   */   private final String g;
/*  9:   */   
/* 10:   */   private hs(String paramString, boolean paramBoolean)
/* 11:   */   {
/* 12:72 */     this.g = paramString;
/* 13:73 */     this.f = paramBoolean;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean a()
/* 17:   */   {
/* 18:77 */     return this.f;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String b()
/* 22:   */   {
/* 23:81 */     return this.g;
/* 24:   */   }
/* 25:   */   
/* 26:   */   static
/* 27:   */   {
/* 28:67 */     e = Maps.newHashMap();
/* 29:85 */     for (hs localhs : values()) {
/* 30:86 */       e.put(localhs.b(), localhs);
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   public static hs a(String paramString)
/* 35:   */   {
/* 36:91 */     return (hs)e.get(paramString);
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hs
 * JD-Core Version:    0.7.0.1
 */