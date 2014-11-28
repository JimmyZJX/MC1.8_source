package net.minecraft.src;
/*  1:   */ public class JumpManager
/*  2:   */ {
/*  3:   */   private EntityMob mob;
/*  4:   */   protected boolean active;
/*  5:   */   
/*  6:   */   public JumpManager(EntityMob mob)
/*  7:   */   {
/*  8:10 */     this.mob = mob;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void jump()
/* 12:   */   {
/* 13:14 */     this.active = true;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void tick()
/* 17:   */   {
/* 18:18 */     this.mob.setJumping(this.active);
/* 19:19 */     this.active = false;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yl
 * JD-Core Version:    0.7.0.1
 */