package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class yt
/*   5:    */   extends GoalType
/*   6:    */ {
/*   7:    */   private EntityAnimal d;
/*   8:    */   World a;
/*   9:    */   private EntityAnimal e;
/*  10:    */   int b;
/*  11:    */   double c;
/*  12:    */   
/*  13:    */   public yt(EntityAnimal paramabq, double paramDouble)
/*  14:    */   {
/*  15: 26 */     this.d = paramabq;
/*  16: 27 */     this.a = paramabq.world;
/*  17: 28 */     this.c = paramDouble;
/*  18: 29 */     a(3);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean canStart()
/*  22:    */   {
/*  23: 34 */     if (!this.d.cp()) {
/*  24: 35 */       return false;
/*  25:    */     }
/*  26: 37 */     this.e = f();
/*  27: 38 */     return this.e != null;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean canContinue()
/*  31:    */   {
/*  32: 43 */     return (this.e.ai()) && (this.e.cp()) && (this.b < 60);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void stop()
/*  36:    */   {
/*  37: 48 */     this.e = null;
/*  38: 49 */     this.b = 0;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void tick()
/*  42:    */   {
/*  43: 54 */     this.d.p().a(this.e, 10.0F, this.d.bP());
/*  44: 55 */     this.d.getNavigator().a(this.e, this.c);
/*  45: 56 */     this.b += 1;
/*  46: 57 */     if ((this.b >= 60) && (this.d.h(this.e) < 9.0D)) {
/*  47: 58 */       g();
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   private EntityAnimal f()
/*  52:    */   {
/*  53: 63 */     float f = 8.0F;
/*  54: 64 */     List<? extends EntityAnimal> localList = this.a.getEntityList(this.d.getClass(), this.d.getAABB().expand(f, f, f));
/*  55: 65 */     double d1 = 1.7976931348623157E+308D;
/*  56: 66 */     EntityAnimal localObject = null;
/*  57: 67 */     for (EntityAnimal localabq : localList) {
/*  58: 68 */       if ((this.d.a(localabq)) && (this.d.h(localabq) < d1))
/*  59:    */       {
/*  60: 69 */         localObject = localabq;
/*  61: 70 */         d1 = this.d.h(localabq);
/*  62:    */       }
/*  63:    */     }
/*  64: 73 */     return localObject;
/*  65:    */   }
/*  66:    */   
/*  67:    */   private void g()
/*  68:    */   {
/*  69: 77 */     EntityPassiveMob localws = this.d.getBaby((EntityPassiveMob)this.e);
/*  70: 78 */     if (localws == null) {
/*  71: 79 */       return;
/*  72:    */     }
/*  73: 82 */     EntityPlayer localahd = this.d.co();
/*  74: 83 */     if ((localahd == null) && (this.e.co() != null)) {
/*  75: 84 */       localahd = this.e.co();
/*  76:    */     }
/*  77: 87 */     if (localahd != null)
/*  78:    */     {
/*  79: 88 */       localahd.increaseStat(StatList.A);
/*  80: 90 */       if ((this.d instanceof EntityCow)) {
/*  81: 91 */         localahd.increaseStat(AchievementList.H);
/*  82:    */       }
/*  83:    */     }
/*  84: 95 */     this.d.setAge(6000);
/*  85: 96 */     this.e.setAge(6000);
/*  86: 97 */     this.d.cq();
/*  87: 98 */     this.e.cq();
/*  88: 99 */     localws.setAge(-24000);
/*  89:100 */     localws.setPositionAndAngles(this.d.xPos, this.d.yPos, this.d.zPos, 0.0F, 0.0F);
/*  90:101 */     this.a.spawnEntity(localws);
/*  91:    */     
/*  92:103 */     Random localRandom = this.d.getRNG();
/*  93:104 */     for (int i = 0; i < 7; i++)
/*  94:    */     {
/*  95:105 */       double d1 = localRandom.nextGaussian() * 0.02D;
/*  96:106 */       double d2 = localRandom.nextGaussian() * 0.02D;
/*  97:107 */       double d3 = localRandom.nextGaussian() * 0.02D;
/*  98:108 */       this.a.a(EnumParticleEffect.HEART, this.d.xPos + localRandom.nextFloat() * this.d.width * 2.0F - this.d.width, this.d.yPos + 0.5D + localRandom.nextFloat() * this.d.height, this.d.zPos + localRandom.nextFloat() * this.d.width * 2.0F - this.d.width, d1, d2, d3, new int[0]);
/*  99:    */     }
/* 100:111 */     if (this.a.getGameRules().getBoolean("doMobLoot")) {
/* 101:112 */       this.a.spawnEntity(new EntityExperienceOrb(this.a, this.d.xPos, this.d.yPos, this.d.zPos, localRandom.nextInt(7) + 1));
/* 102:    */     }
/* 103:    */   }
/* 104:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yt
 * JD-Core Version:    0.7.0.1
 */