package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class aga
/*   4:    */   extends GoalType
/*   5:    */ {
/*   6:    */   private EntitySlime a;
/*   7:    */   
/*   8:    */   public aga(EntitySlime paramafy)
/*   9:    */   {
/*  10:440 */     this.a = paramafy;
/*  11:441 */     a(5);
/*  12:442 */     ((aay)paramafy.getNavigator()).d(true);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean canStart()
/*  16:    */   {
/*  17:447 */     return (this.a.V()) || (this.a.ab());
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void tick()
/*  21:    */   {
/*  22:452 */     if (this.a.getRNG().nextFloat() < 0.8F) {
/*  23:453 */       this.a.r().a();
/*  24:    */     }
/*  25:455 */     ((agc)this.a.q()).a(1.2D);
/*  26:    */   }
/*  27:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aga
 * JD-Core Version:    0.7.0.1
 */