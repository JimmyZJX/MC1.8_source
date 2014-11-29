package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agc
/*   4:    */   extends MoveManager
/*   5:    */ {
/*   6:    */   private float g;
/*   7:    */   private int h;
/*   8:    */   private EntitySlime i;
/*   9:    */   private boolean j;
/*  10:    */   
/*  11:    */   public agc(EntitySlime paramafy)
/*  12:    */   {
/*  13:310 */     super(paramafy);
/*  14:311 */     this.i = paramafy;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(float paramFloat, boolean paramBoolean)
/*  18:    */   {
/*  19:315 */     this.g = paramFloat;
/*  20:316 */     this.j = paramBoolean;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(double paramDouble)
/*  24:    */   {
/*  25:320 */     this.speed = paramDouble;
/*  26:321 */     this.active = true;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void tick()
/*  30:    */   {
/*  31:326 */     this.mob.yaw = turnWithLimit(this.mob.yaw, this.g, 30.0F);
/*  32:327 */     this.mob.aI = this.mob.yaw;
/*  33:328 */     this.mob.aG = this.mob.yaw;
/*  34:330 */     if (!this.active)
/*  35:    */     {
/*  36:331 */       this.mob.m(0.0F);
/*  37:332 */       return;
/*  38:    */     }
/*  39:334 */     this.active = false;
/*  40:336 */     if (this.mob.landing)
/*  41:    */     {
/*  42:337 */       this.mob.j((float)(this.speed * this.mob.getAttribute(MobAttribute.movementSpeed).e()));
/*  43:338 */       if (this.h-- <= 0)
/*  44:    */       {
/*  45:339 */         this.h = this.i.ce();
/*  46:340 */         if (this.j) {
/*  47:341 */           this.h /= 3;
/*  48:    */         }
/*  49:343 */         this.i.getJumpManager().jump();
/*  50:344 */         if (this.i.cl()) {
/*  51:345 */           this.i.a(this.i.ci(), this.i.bA(), ((this.i.getRNG().nextFloat() - this.i.getRNG().nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*  52:    */         }
/*  53:    */       }
/*  54:    */       else
/*  55:    */       {
/*  56:348 */         this.i.aX = (this.i.aY = 0.0F);
/*  57:349 */         this.mob.j(0.0F);
/*  58:    */       }
/*  59:    */     }
/*  60:    */     else
/*  61:    */     {
/*  62:352 */       this.mob.j((float)(this.speed * this.mob.getAttribute(MobAttribute.movementSpeed).e()));
/*  63:    */     }
/*  64:    */   }
/*  65:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agc
 * JD-Core Version:    0.7.0.1
 */