package net.minecraft.src;
/*  1:   */ public enum EnumGameMode
/*  2:   */ { NOT_SET(-1,""),SURVIVAL(0,"survival"),CREATIVE(1,"creative"),ADVENTURE(2,"adventure"),SPECTATOR(3,"spectator");
/*  3:   */   int f;
/*  4:   */   String g;
/*  5:   */   
/*  6:   */   private EnumGameMode(int paramInt, String paramString)
/*  7:   */   {
/*  8:19 */     this.f = paramInt;
/*  9:20 */     this.g = paramString;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:24 */     return this.f;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String b()
/* 18:   */   {
/* 19:28 */     return this.g;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setPlayerAbilities(PlayerAbilities abilities)
/* 23:   */   {
/* 24:32 */     if (this == CREATIVE)
/* 25:   */     {
/* 26:33 */       abilities.mayfly = true;
/* 27:34 */       abilities.instabuild = true;
/* 28:35 */       abilities.invulnerable = true;
/* 29:   */     }
/* 30:36 */     else if (this == SPECTATOR)
/* 31:   */     {
/* 32:37 */       abilities.mayfly = true;
/* 33:38 */       abilities.instabuild = false;
/* 34:39 */       abilities.invulnerable = true;
/* 35:40 */       abilities.flying = true;
/* 36:   */     }
/* 37:   */     else
/* 38:   */     {
/* 39:42 */       abilities.mayfly = false;
/* 40:43 */       abilities.instabuild = false;
/* 41:44 */       abilities.invulnerable = false;
/* 42:45 */       abilities.flying = false;
/* 43:   */     }
/* 44:47 */     abilities.mayBuild = (!noBuild());
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean noBuild()
/* 48:   */   {
/* 49:51 */     return (this == ADVENTURE) || (this == SPECTATOR);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public boolean d()
/* 53:   */   {
/* 54:55 */     return this == CREATIVE;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public boolean e()
/* 58:   */   {
/* 59:59 */     return (this == SURVIVAL) || (this == ADVENTURE);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public static EnumGameMode a(int paramInt)
/* 63:   */   {
/* 64:63 */     for (EnumGameMode localarc : values()) {
/* 65:64 */       if (localarc.f == paramInt) {
/* 66:65 */         return localarc;
/* 67:   */       }
/* 68:   */     }
/* 69:68 */     return SURVIVAL;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public static EnumGameMode a(String paramString)
/* 73:   */   {
/* 74:72 */     for (EnumGameMode localarc : values()) {
/* 75:73 */       if (localarc.g.equals(paramString)) {
/* 76:74 */         return localarc;
/* 77:   */       }
/* 78:   */     }
/* 79:77 */     return SURVIVAL;
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arc
 * JD-Core Version:    0.7.0.1
 */