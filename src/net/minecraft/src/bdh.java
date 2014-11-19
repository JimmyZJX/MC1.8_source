package net.minecraft.src;
/*  1:   */ class bdh
/*  2:   */   extends aqi
/*  3:   */ {
			  private final bdg a;
/*  4:   */   bdh(bdg parambdg) {a=parambdg;}
/*  5:   */   
/*  6:   */   public void a(int paramInt)
/*  7:   */   {
/*  8:16 */     this.a.world.c(this.a.pos, BlockList.mobSpawner, paramInt, 0);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public World a()
/* 12:   */   {
/* 13:21 */     return this.a.world;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public BlockPosition b()
/* 17:   */   {
/* 18:26 */     return this.a.pos;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(aqj paramaqj)
/* 22:   */   {
/* 23:31 */     super.a(paramaqj);
/* 24:32 */     if (a() != null) {
/* 25:33 */       a().h(this.a.pos);
/* 26:   */     }
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdh
 * JD-Core Version:    0.7.0.1
 */