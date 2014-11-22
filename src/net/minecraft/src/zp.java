package net.minecraft.src;
/*  1:   */ public class zp
/*  2:   */   extends GoalType
/*  3:   */ {
/*  4:   */   private EntityWalkingMob a;
/*  5:   */   private EntityLiving b;
/*  6:   */   private double c;
/*  7:   */   private double d;
/*  8:   */   private double e;
/*  9:   */   private double f;
/* 10:   */   private float g;
/* 11:   */   
/* 12:   */   public zp(EntityWalkingMob paramxu, double paramDouble, float paramFloat)
/* 13:   */   {
/* 14:17 */     this.a = paramxu;
/* 15:18 */     this.f = paramDouble;
/* 16:19 */     this.g = paramFloat;
/* 17:20 */     a(1);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean canStart()
/* 21:   */   {
/* 22:25 */     this.b = this.a.u();
/* 23:26 */     if (this.b == null) {
/* 24:27 */       return false;
/* 25:   */     }
/* 26:29 */     if (this.b.h(this.a) > this.g * this.g) {
/* 27:30 */       return false;
/* 28:   */     }
/* 29:32 */     Vec3 localbrw = abf.a(this.a, 16, 7, new Vec3(this.b.xPos, this.b.yPos, this.b.zPos));
/* 30:33 */     if (localbrw == null) {
/* 31:34 */       return false;
/* 32:   */     }
/* 33:36 */     this.c = localbrw.x;
/* 34:37 */     this.d = localbrw.y;
/* 35:38 */     this.e = localbrw.z;
/* 36:39 */     return true;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean canContinue()
/* 40:   */   {
/* 41:44 */     return (!this.a.getNavigator().m()) && (this.b.ai()) && (this.b.h(this.a) < this.g * this.g);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void stop()
/* 45:   */   {
/* 46:49 */     this.b = null;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void start()
/* 50:   */   {
/* 51:54 */     this.a.getNavigator().a(this.c, this.d, this.e, this.f);
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zp
 * JD-Core Version:    0.7.0.1
 */