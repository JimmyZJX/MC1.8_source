package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public enum hn
/*  5:   */ { a("",false),b("",false),c("",false),d("",false),e("",false),f("",false);
/*  6:   */   private static final Map<String,hn> g;
/*  7:   */   private final boolean h;
/*  8:   */   private final String i;
/*  9:   */   
/* 10:   */   private hn(String paramString, boolean paramBoolean)
/* 11:   */   {
/* 12:73 */     this.i = paramString;
/* 13:74 */     this.h = paramBoolean;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean a()
/* 17:   */   {
/* 18:78 */     return this.h;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String b()
/* 22:   */   {
/* 23:82 */     return this.i;
/* 24:   */   }
/* 25:   */   
/* 26:   */   static
/* 27:   */   {
/* 28:68 */     g = Maps.newHashMap();
/* 29:86 */     for (hn localhn : values()) {
/* 30:87 */       g.put(localhn.b(), localhn);
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   public static hn a(String paramString)
/* 35:   */   {
/* 36:92 */     return (hn)g.get(paramString);
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hn
 * JD-Core Version:    0.7.0.1
 */