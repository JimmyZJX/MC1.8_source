package net.minecraft.src;
/*  1:   */ import com.google.common.base.Objects;
/*  2:   */ import com.google.common.base.Objects.ToStringHelper;
/*  3:   */ import com.google.common.collect.Maps;
/*  4:   */ import com.google.gson.Gson;
/*  5:   */ import java.util.Map;
/*  6:   */ 
/*  7:   */ public class czs
/*  8:   */ {
/*  9:10 */   private static final Gson a = new Gson();
/* 10:   */   private final String b;
/* 11:   */   private String c;
/* 12:   */   private Map d;
/* 13:   */   
/* 14:   */   public czs(String paramString1, String paramString2)
/* 15:   */   {
/* 16:20 */     this.b = paramString1;
/* 17:21 */     this.c = paramString2;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public czs(String paramString)
/* 21:   */   {
/* 22:25 */     this(paramString, null);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void a(String paramString)
/* 26:   */   {
/* 27:29 */     this.c = paramString;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String a()
/* 31:   */   {
/* 32:33 */     return this.c == null ? this.b : this.c;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void a(String paramString1, String paramString2)
/* 36:   */   {
/* 37:37 */     if (this.d == null) {
/* 38:38 */       this.d = Maps.newHashMap();
/* 39:   */     }
/* 40:40 */     if (this.d.size() > 50) {
/* 41:41 */       throw new IllegalArgumentException("Metadata payload is full, cannot add more to it!");
/* 42:   */     }
/* 43:43 */     if (paramString1 == null) {
/* 44:44 */       throw new IllegalArgumentException("Metadata payload key cannot be null!");
/* 45:   */     }
/* 46:46 */     if (paramString1.length() > 255) {
/* 47:47 */       throw new IllegalArgumentException("Metadata payload key is too long!");
/* 48:   */     }
/* 49:49 */     if (paramString2 == null) {
/* 50:50 */       throw new IllegalArgumentException("Metadata payload value cannot be null!");
/* 51:   */     }
/* 52:52 */     if (paramString2.length() > 255) {
/* 53:53 */       throw new IllegalArgumentException("Metadata payload value is too long!");
/* 54:   */     }
/* 55:56 */     this.d.put(paramString1, paramString2);
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String b()
/* 59:   */   {
/* 60:60 */     if ((this.d == null) || (this.d.isEmpty())) {
/* 61:61 */       return null;
/* 62:   */     }
/* 63:64 */     return a.toJson(this.d);
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String c()
/* 67:   */   {
/* 68:68 */     return this.b;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public String toString()
/* 72:   */   {
/* 73:73 */     return Objects.toStringHelper(this).add("name", this.b).add("description", this.c).add("data", b()).toString();
/* 74:   */   }
/* 75:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czs
 * JD-Core Version:    0.7.0.1
 */