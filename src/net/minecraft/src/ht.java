package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class ht
/*  4:   */   extends hj
/*  5:   */ {
/*  6:   */   private final String b;
/*  7:   */   private final String c;
/*  8:12 */   private String d = "";
/*  9:   */   
/* 10:   */   public ht(String paramString1, String paramString2)
/* 11:   */   {
/* 12:15 */     this.b = paramString1;
/* 13:16 */     this.c = paramString2;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String g()
/* 17:   */   {
/* 18:20 */     return this.b;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String h()
/* 22:   */   {
/* 23:24 */     return this.c;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void b(String paramString)
/* 27:   */   {
/* 28:28 */     this.d = paramString;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String e()
/* 32:   */   {
/* 33:33 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 34:34 */     if ((localMinecraftServer != null) && (localMinecraftServer.N()) && (vb.b(this.d)))
/* 35:   */     {
/* 36:35 */       bsd localbsd = localMinecraftServer.a(0).Z();
/* 37:36 */       bry localbry = localbsd.b(this.c);
/* 38:37 */       if (localbsd.b(this.b, localbry))
/* 39:   */       {
/* 40:38 */         bsa localbsa = localbsd.c(this.b, localbry);
/* 41:39 */         b(String.format("%d", new Object[] { Integer.valueOf(localbsa.c()) }));
/* 42:   */       }
/* 43:   */       else
/* 44:   */       {
/* 45:41 */         this.d = "";
/* 46:   */       }
/* 47:   */     }
/* 48:44 */     return this.d;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public ht f()
/* 52:   */   {
/* 53:49 */     ht localht = new ht(this.b, this.c);
/* 54:50 */     localht.b(this.d);
/* 55:51 */     localht.a(b().m());
/* 56:52 */     for (ho localho : a()) {
/* 57:53 */       localht.a(localho.f());
/* 58:   */     }
/* 59:55 */     return localht;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public boolean equals(Object paramObject)
/* 63:   */   {
/* 64:60 */     if (this == paramObject) {
/* 65:61 */       return true;
/* 66:   */     }
/* 67:64 */     if ((paramObject instanceof ht))
/* 68:   */     {
/* 69:65 */       ht localht = (ht)paramObject;
/* 70:66 */       return (this.b.equals(localht.b)) && (this.c.equals(localht.c)) && (super.equals(paramObject));
/* 71:   */     }
/* 72:69 */     return false;
/* 73:   */   }
/* 74:   */   
/* 75:   */   public String toString()
/* 76:   */   {
/* 77:74 */     return "ScoreComponent{name='" + this.b + '\'' + "objective='" + this.c + '\'' + ", siblings=" + this.a + ", style=" + b() + '}';
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ht
 * JD-Core Version:    0.7.0.1
 */