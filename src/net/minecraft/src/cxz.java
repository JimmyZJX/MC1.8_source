package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public enum cxz
/*  5:   */ { a("",0),b("",0),c("",0),d("",0),e("",0),f("",0),g("",0),h("",0),i("",0);
/*  6:   */   private static final Map j;
/*  7:   */   private static final Map k;
/*  8:   */   private final String l;
/*  9:   */   private final int m;
/* 10:   */   
/* 11:   */   private cxz(String paramString, int paramInt)
/* 12:   */   {
/* 13:24 */     this.l = paramString;
/* 14:25 */     this.m = paramInt;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String a()
/* 18:   */   {
/* 19:29 */     return this.l;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public int b()
/* 23:   */   {
/* 24:33 */     return this.m;
/* 25:   */   }
/* 26:   */   
/* 27:   */   static
/* 28:   */   {
/* 29:18 */     j = Maps.newHashMap();
/* 30:19 */     k = Maps.newHashMap();
/* 31:37 */     for (cxz localcxz : values())
/* 32:   */     {
/* 33:38 */       if ((j.containsKey(localcxz.a())) || (k.containsKey(Integer.valueOf(localcxz.b())))) {
/* 34:39 */         throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + localcxz);
/* 35:   */       }
/* 36:41 */       j.put(localcxz.a(), localcxz);
/* 37:42 */       k.put(Integer.valueOf(localcxz.b()), localcxz);
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   public static cxz a(String paramString)
/* 42:   */   {
/* 43:47 */     return (cxz)j.get(paramString);
/* 44:   */   }
/* 45:   */}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxz
 * JD-Core Version:    0.7.0.1
 */