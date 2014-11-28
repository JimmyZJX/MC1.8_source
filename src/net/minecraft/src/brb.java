package net.minecraft.src;
/*  1:   */ public class brb
/*  2:   */   implements Comparable<brb>
/*  3:   */ {
/*  4:   */   private final String a;
/*  5:   */   private final String b;
/*  6:   */   private final long c;
/*  7:   */   private final long d;
/*  8:   */   private final boolean e;
/*  9:   */   private final EnumGameMode f;
/* 10:   */   private final boolean g;
/* 11:   */   private final boolean h;
/* 12:   */   
/* 13:   */   public brb(String paramString1, String paramString2, long paramLong1, long paramLong2, EnumGameMode paramarc, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/* 14:   */   {
/* 15:16 */     this.a = paramString1;
/* 16:17 */     this.b = paramString2;
/* 17:18 */     this.c = paramLong1;
/* 18:19 */     this.d = paramLong2;
/* 19:20 */     this.f = paramarc;
/* 20:21 */     this.e = paramBoolean1;
/* 21:22 */     this.g = paramBoolean2;
/* 22:23 */     this.h = paramBoolean3;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String a()
/* 26:   */   {
/* 27:27 */     return this.a;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String b()
/* 31:   */   {
/* 32:31 */     return this.b;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public long c()
/* 36:   */   {
/* 37:35 */     return this.d;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public boolean d()
/* 41:   */   {
/* 42:39 */     return this.e;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public long e()
/* 46:   */   {
/* 47:43 */     return this.c;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public int compareTo(brb parambrb)
/* 51:   */   {
/* 52:48 */     if (this.c < parambrb.c) {
/* 53:49 */       return 1;
/* 54:   */     }
/* 55:51 */     if (this.c > parambrb.c) {
/* 56:52 */       return -1;
/* 57:   */     }
/* 58:54 */     return this.a.compareTo(parambrb.a);
/* 59:   */   }
/* 60:   */   
/* 61:   */   public EnumGameMode f()
/* 62:   */   {
/* 63:58 */     return this.f;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public boolean g()
/* 67:   */   {
/* 68:62 */     return this.g;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public boolean h()
/* 72:   */   {
/* 73:66 */     return this.h;
/* 74:   */   }
/* 75:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     brb
 * JD-Core Version:    0.7.0.1
 */