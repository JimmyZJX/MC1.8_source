package net.minecraft.src;
/*  1:   */ public class aab
/*  2:   */   extends GoalType
/*  3:   */ {
/*  4:   */   private EntityWalkingMob a;
/*  5:   */   
/*  6:   */   public aab(EntityWalkingMob paramxu)
/*  7:   */   {
/*  8:10 */     this.a = paramxu;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean canStart()
/* 12:   */   {
/* 13:15 */     return this.a.world.w();
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void start()
/* 17:   */   {
/* 18:20 */     ((aay)this.a.getNavigator()).e(true);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void stop()
/* 22:   */   {
/* 23:25 */     ((aay)this.a.getNavigator()).e(false);
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aab
 * JD-Core Version:    0.7.0.1
 */