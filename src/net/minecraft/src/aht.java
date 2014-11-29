package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class aht
/*  4:   */   extends ahr
/*  5:   */ {
/*  6:   */   public aht(World paramaqu, EntityLiving paramxm)
/*  7:   */   {
/*  8:15 */     super(paramaqu, paramxm);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public aht(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 12:   */   {
/* 13:19 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void a(HitResult parambru)
/* 17:   */   {
/* 18:24 */     EntityLiving localxm = n();
/* 19:26 */     if (parambru.d != null) {
/* 20:27 */       parambru.d.receiveDamage(DamageSource.a(this, localxm), 0.0F);
/* 21:   */     }
/* 22:30 */     for (int i = 0; i < 32; i++) {
/* 23:31 */       this.world.a(EnumParticleEffect.y, this.xPos, this.yPos + this.rng.nextDouble() * 2.0D, this.zPos, this.rng.nextGaussian(), 0.0D, this.rng.nextGaussian(), new int[0]);
/* 24:   */     }
/* 25:34 */     if (!this.world.isClient)
/* 26:   */     {
/* 27:35 */       if ((localxm instanceof qw))
/* 28:   */       {
/* 29:36 */         qw localqw = (qw)localxm;
/* 30:38 */         if ((localqw.a.a().g()) && (localqw.world == this.world) && (!localqw.bI()))
/* 31:   */         {
/* 32:39 */           if ((this.rng.nextFloat() < 0.05F) && (this.world.getGameRules().getBoolean("doMobSpawning")))
/* 33:   */           {
/* 34:40 */             EntityEndermite endermite = new EntityEndermite(this.world);
/* 35:41 */             endermite.a(true);
/* 36:42 */             endermite.setPositionAndAngles(localxm.xPos, localxm.yPos, localxm.zPos, localxm.yaw, localxm.pitch);
/* 37:43 */             this.world.spawnEntity(endermite);
/* 38:   */           }
/* 39:46 */           if (localxm.av()) {
/* 40:47 */             localxm.mount((Entity)null);
/* 41:   */           }
/* 42:49 */           localxm.setPosition(this.xPos, this.yPos, this.zPos);
/* 43:50 */           localxm.fallDistance = 0.0F;
/* 44:51 */           localxm.receiveDamage(DamageSource.fall, 5.0F);
/* 45:   */         }
/* 46:   */       }
/* 47:54 */       setDead();
/* 48:   */     }
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void onUpdate()
/* 52:   */   {
/* 53:60 */     EntityLiving localxm = n();
/* 54:61 */     if ((localxm != null) && ((localxm instanceof EntityPlayer)) && (!localxm.ai())) {
/* 55:62 */       setDead();
/* 56:   */     } else {
/* 57:64 */       super.onUpdate();
/* 58:   */     }
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aht
 * JD-Core Version:    0.7.0.1
 */