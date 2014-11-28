package net.minecraft.src;
/*  1:   */ public class MoveManager
/*  2:   */ {
/*  3:   */   protected EntityMob mob;
/*  4:   */   protected double targetX;
/*  5:   */   protected double targetY;
/*  6:   */   protected double targetZ;
/*  7:   */   protected double speed;
/*  8:   */   protected boolean active;
/*  9:   */   
/* 10:   */   public MoveManager(EntityMob mob)
/* 11:   */   {
/* 12:21 */     this.mob = mob;
/* 13:22 */     this.targetX = mob.xPos;
/* 14:23 */     this.targetY = mob.yPos;
/* 15:24 */     this.targetZ = mob.zPos;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean isActive()
/* 19:   */   {
/* 20:28 */     return this.active;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public double getSpeed()
/* 24:   */   {
/* 25:32 */     return this.speed;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setTarget(double x, double y, double z, double paramDouble4)
/* 29:   */   {
/* 30:36 */     this.targetX = x;
/* 31:37 */     this.targetY = y;
/* 32:38 */     this.targetZ = z;
/* 33:39 */     this.speed = paramDouble4;
/* 34:40 */     this.active = true;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void tick()
/* 38:   */   {
/* 39:44 */     this.mob.m(0.0F);
/* 40:45 */     if (!this.active) {
/* 41:46 */       return;
/* 42:   */     }
/* 43:48 */     this.active = false;
/* 44:   */     
/* 45:50 */     int footY = MathUtils.floor(this.mob.getAABB().minY + 0.5D);
/* 46:   */     
/* 47:52 */     double dx = this.targetX - this.mob.xPos;
/* 48:53 */     double dz = this.targetZ - this.mob.zPos;
/* 49:54 */     double dy = this.targetY - footY;
/* 50:55 */     double dist2 = dx * dx + dy * dy + dz * dz;
/* 51:56 */     if (dist2 < 2.500000277905201E-007D) {
/* 52:57 */       return;
/* 53:   */     }
/* 54:60 */     float angle = (float)(Math.atan2(dz, dx) * 180.0D / 3.141592741012573D) - 90.0F;
/* 55:   */     
/* 56:62 */     this.mob.yaw = turnWithLimit(this.mob.yaw, angle, 30.0F);
/* 57:63 */     this.mob.j((float)(this.speed * this.mob.getAttribute(MobAttribute.movementSpeed).e()));
/* 58:65 */     if ((dy > 0.0D) && (dx * dx + dz * dz < 1.0D)) {
/* 59:66 */       this.mob.getJumpManager().jump();
/* 60:   */     }
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected float turnWithLimit(float oldValue, float target, float limit)
/* 64:   */   {
/* 65:71 */     float dAngle = MathUtils.wrapDegrees(target - oldValue);
/* 66:72 */     if (dAngle > limit) {
/* 67:73 */       dAngle = limit;
/* 68:   */     }
/* 69:75 */     if (dAngle < -limit) {
/* 70:76 */       dAngle = -limit;
/* 71:   */     }
/* 72:78 */     float res = oldValue + dAngle;
/* 73:79 */     if (res < 0.0F) {
/* 74:80 */       res += 360.0F;
/* 75:81 */     } else if (res > 360.0F) {
/* 76:82 */       res -= 360.0F;
/* 77:   */     }
/* 78:84 */     return res;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public double getTargetX()
/* 82:   */   {
/* 83:88 */     return this.targetX;
/* 84:   */   }
/* 85:   */   
/* 86:   */   public double getTargetY()
/* 87:   */   {
/* 88:92 */     return this.targetY;
/* 89:   */   }
/* 90:   */   
/* 91:   */   public double getTargetZ()
/* 92:   */   {
/* 93:96 */     return this.targetZ;
/* 94:   */   }
/* 95:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yn
 * JD-Core Version:    0.7.0.1
 */