package net.minecraft.src;
/*  1:   */ class aei
/*  2:   */   extends aqi
/*  3:   */ {
			  private final aeh a;
/*  4:   */   aei(aeh paramaeh) {a=paramaeh;}
/*  5:   */   
/*  6:   */   public void a(int paramInt)
/*  7:   */   {
/*  8:14 */     this.a.world.sendSignal(this.a, (byte)paramInt);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public World a()
/* 12:   */   {
/* 13:19 */     return this.a.world;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public BlockPosition b()
/* 17:   */   {
/* 18:24 */     return new BlockPosition(this.a);
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aei
 * JD-Core Version:    0.7.0.1
 */