package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  4:   */ 
/*  5:   */ public enum bsg
/*  6:   */ { ALWAYS("always",0),NEVER("never",1),
			  HIDE_FOR_OTHER_TEAMS("hideForOtherTeams",2),
			  HIDE_FOR_OWN_TEAM("hideForOwnTeam",3);
/*  7:   */   private static Map<String,bsg> g;
/*  8:   */   public final String e;
/*  9:   */   public final int f;
/* 10:   */   
/* 11:   */   static
/* 12:   */   {
/* 13:41 */     g = Maps.newHashMap();
/* 14:44 */     for (bsg localbsg : values()) {
/* 15:45 */       g.put(localbsg.e, localbsg);
/* 16:   */     }
/* 17:   */   }
/* 18:   */   
/* 19:   */   public static String[] a()
/* 20:   */   {
/* 21:50 */     return g.keySet().toArray(new String[g.size()]);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public static bsg a(String paramString)
/* 25:   */   {
/* 26:54 */     return g.get(paramString);
/* 27:   */   }
/* 28:   */   
/* 29:   */   private bsg(String paramString, int paramInt)
/* 30:   */   {
/* 31:61 */     this.e = paramString;
/* 32:62 */     this.f = paramInt;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsg
 * JD-Core Version:    0.7.0.1
 */