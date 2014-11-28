package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class GoalSwim
/*  4:   */   extends GoalType
/*  5:   */ {
/*  6:   */   private EntityMob mob;
/*  7:   */   
/*  8:   */   public GoalSwim(EntityMob mob)
/*  9:   */   {
/* 10:11 */     this.mob = mob;
/* 11:12 */     a(4);
/* 12:13 */     ((aay)mob.getNavigator()).d(true);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean canStart()
/* 16:   */   {
/* 17:18 */     return (this.mob.isInWater()) || (this.mob.isInLava());
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void tick()
/* 21:   */   {
/* 22:23 */     if (this.mob.getRNG().nextFloat() < 0.8F) {
/* 23:24 */       this.mob.getJumpManager().jump();
/* 24:   */     }
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yy
 * JD-Core Version:    0.7.0.1
 */