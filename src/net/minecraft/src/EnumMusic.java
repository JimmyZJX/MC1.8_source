package net.minecraft.src;
/*  1:   */ public enum EnumMusic
/*  2:   */ { a(new oa("minecraft:music.menu"),20,600),
			  b(new oa("minecraft:music.game"),12000,24000),
			  c(new oa("minecraft:music.game.creative"),1200,3600),
			  d(new oa("minecraft:music.game.end.credits"),2147483647,2147483647),
			  e(new oa("minecraft:music.game.nether"),1200,3600),
			  f(new oa("minecraft:music.game.end.dragon"),0,0),
			  g(new oa("minecraft:music.game.end"),6000,24000);
/*  3:   */   private final oa h;
/*  4:   */   private final int i;
/*  5:   */   private final int j;
/*  6:   */   
/*  7:   */   private EnumMusic(oa paramoa, int paramInt1, int paramInt2)
/*  8:   */   {
/*  9:60 */     this.h = paramoa;
/* 10:61 */     this.i = paramInt1;
/* 11:62 */     this.j = paramInt2;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public oa a()
/* 15:   */   {
/* 16:66 */     return this.h;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public int b()
/* 20:   */   {
/* 21:70 */     return this.i;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public int c()
/* 25:   */   {
/* 26:74 */     return this.j;
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyy
 * JD-Core Version:    0.7.0.1
 */