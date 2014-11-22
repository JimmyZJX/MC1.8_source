package net.minecraft.src;
/*  1:   */ public class zu
/*  2:   */   extends GoalType
/*  3:   */ {
/*  4:   */   private EntityWalkingMob b;
/*  5:   */   protected double a;
/*  6:   */   private double c;
/*  7:   */   private double d;
/*  8:   */   private double e;
/*  9:   */   
/* 10:   */   public zu(EntityWalkingMob paramxu, double paramDouble)
/* 11:   */   {
/* 12:14 */     this.b = paramxu;
/* 13:15 */     this.a = paramDouble;
/* 14:16 */     a(1);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean canStart()
/* 18:   */   {
/* 19:21 */     if ((this.b.bc() == null) && (!this.b.au())) {
/* 20:22 */       return false;
/* 21:   */     }
/* 22:24 */     Vec3 localbrw = abf.a(this.b, 5, 4);
/* 23:25 */     if (localbrw == null) {
/* 24:26 */       return false;
/* 25:   */     }
/* 26:28 */     this.c = localbrw.x;
/* 27:29 */     this.d = localbrw.y;
/* 28:30 */     this.e = localbrw.z;
/* 29:31 */     return true;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void start()
/* 33:   */   {
/* 34:36 */     this.b.getNavigator().a(this.c, this.d, this.e, this.a);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public boolean canContinue()
/* 38:   */   {
/* 39:41 */     return !this.b.getNavigator().m();
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zu
 * JD-Core Version:    0.7.0.1
 */