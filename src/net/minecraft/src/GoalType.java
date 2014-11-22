package net.minecraft.src;
/*  1:   */ public abstract class GoalType
/*  2:   */ {
/*  3:   */   private int a;
/*  4:   */   
/*  5:   */   public abstract boolean canStart();
/*  6:   */   
/*  7:   */   public boolean canContinue()
/*  8:   */   {
/*  9: 9 */     return canStart();
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean inhibitsOtherGoal()
/* 13:   */   {
/* 14:13 */     return true;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void start() {}
/* 18:   */   
/* 19:   */   public void stop() {}
/* 20:   */   
/* 21:   */   public void tick() {}
/* 22:   */   
/* 23:   */   public void a(int paramInt)
/* 24:   */   {
/* 25:26 */     this.a = paramInt;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public int j()
/* 29:   */   {
/* 30:30 */     return this.a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zb
 * JD-Core Version:    0.7.0.1
 */