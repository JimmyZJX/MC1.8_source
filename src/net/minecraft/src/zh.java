package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class zh
/*  4:   */   extends GoalType
/*  5:   */ {
/*  6:   */   protected EntityMob a;
/*  7:   */   protected Entity b;
/*  8:   */   protected float c;
/*  9:   */   private int e;
/* 10:   */   private float f;
/* 11:   */   protected Class d;
/* 12:   */   
/* 13:   */   public zh(EntityMob paramxn, Class paramClass, float paramFloat)
/* 14:   */   {
/* 15:17 */     this.a = paramxn;
/* 16:18 */     this.d = paramClass;
/* 17:19 */     this.c = paramFloat;
/* 18:20 */     this.f = 0.02F;
/* 19:21 */     a(2);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public zh(EntityMob paramxn, Class paramClass, float paramFloat1, float paramFloat2)
/* 23:   */   {
/* 24:25 */     this.a = paramxn;
/* 25:26 */     this.d = paramClass;
/* 26:27 */     this.c = paramFloat1;
/* 27:28 */     this.f = paramFloat2;
/* 28:29 */     a(2);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean canStart()
/* 32:   */   {
/* 33:34 */     if (this.a.getRNG().nextFloat() >= this.f) {
/* 34:35 */       return false;
/* 35:   */     }
/* 36:38 */     if (this.a.u() != null) {
/* 37:39 */       this.b = this.a.u();
/* 38:   */     }
/* 39:40 */     if (this.d == EntityPlayer.class) {
/* 40:41 */       this.b = this.a.world.getNearestPlayer(this.a, (double)this.c);
/* 41:   */     } else {
/* 42:43 */       this.b = this.a.world.getNearestEntity(this.d, this.a.getAABB().expand(this.c, 3.0D, this.c), this.a);
/* 43:   */     }
/* 44:46 */     return this.b != null;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean canContinue()
/* 48:   */   {
/* 49:51 */     if (!this.b.ai()) {
/* 50:52 */       return false;
/* 51:   */     }
/* 52:54 */     if (this.a.h(this.b) > this.c * this.c) {
/* 53:55 */       return false;
/* 54:   */     }
/* 55:57 */     return this.e > 0;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void start()
/* 59:   */   {
/* 60:62 */     this.e = (40 + this.a.getRNG().nextInt(40));
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void stop()
/* 64:   */   {
/* 65:67 */     this.b = null;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void tick()
/* 69:   */   {
/* 70:72 */     this.a.p().a(this.b.xPos, this.b.yPos + this.b.getEyeHeight(), this.b.zPos, 10.0F, this.a.bP());
/* 71:73 */     this.e -= 1;
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zh
 * JD-Core Version:    0.7.0.1
 */