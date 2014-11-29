package net.minecraft.src;
/*  1:   */ public class ahn
/*  2:   */   extends ahl
/*  3:   */ {
/*  4:12 */   public int e = 1;
/*  5:   */   
/*  6:   */   public ahn(World paramaqu)
/*  7:   */   {
/*  8:15 */     super(paramaqu);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public ahn(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 12:   */   {
/* 13:19 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public ahn(World paramaqu, EntityLiving paramxm, double paramDouble1, double paramDouble2, double paramDouble3)
/* 17:   */   {
/* 18:23 */     super(paramaqu, paramxm, paramDouble1, paramDouble2, paramDouble3);
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected void a(HitResult parambru)
/* 22:   */   {
/* 23:28 */     if (!this.world.isClient)
/* 24:   */     {
/* 25:29 */       if (parambru.d != null)
/* 26:   */       {
/* 27:30 */         parambru.d.receiveDamage(DamageSource.fromFire(this, this.a), 6.0F);
/* 28:31 */         a(this.a, parambru.d);
/* 29:   */       }
/* 30:33 */       boolean bool = this.world.getGameRules().getBoolean("mobGriefing");
/* 31:34 */       this.world.a(null, this.xPos, this.yPos, this.zPos, this.e, bool, bool);
/* 32:35 */       setDead();
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 37:   */   {
/* 38:41 */     super.writeEntityToNBT(paramfn);
/* 39:42 */     paramfn.setInt("ExplosionPower", this.e);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 43:   */   {
/* 44:47 */     super.readEntityFromNBT(paramfn);
/* 45:48 */     if (paramfn.hasKey("ExplosionPower", 99)) {
/* 46:49 */       this.e = paramfn.getInteger("ExplosionPower");
/* 47:   */     }
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahn
 * JD-Core Version:    0.7.0.1
 */