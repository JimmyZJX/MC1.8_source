package net.minecraft.src;
/*  1:   */ public class PlayerAbilities
/*  2:   */ {
/*  3:   */   public boolean invulnerable;
/*  4:   */   public boolean flying;
/*  5:   */   public boolean mayfly;
/*  6:   */   public boolean instabuild;
/*  7:11 */   public boolean mayBuild = true;
/*  8:12 */   private float flySpeed = 0.05F;
/*  9:13 */   private float walkSpeed = 0.1F;
/* 10:   */   
/* 11:   */   public void a(NBTTagCompound tag)
/* 12:   */   {
/* 13:16 */     NBTTagCompound tagAbilities = new NBTTagCompound();
/* 14:   */     
/* 15:18 */     tagAbilities.setBoolean("invulnerable", this.invulnerable);
/* 16:19 */     tagAbilities.setBoolean("flying", this.flying);
/* 17:20 */     tagAbilities.setBoolean("mayfly", this.mayfly);
/* 18:21 */     tagAbilities.setBoolean("instabuild", this.instabuild);
/* 19:22 */     tagAbilities.setBoolean("mayBuild", this.mayBuild);
/* 20:23 */     tagAbilities.setFloat("flySpeed", this.flySpeed);
/* 21:24 */     tagAbilities.setFloat("walkSpeed", this.walkSpeed);
/* 22:25 */     tag.setNBT("abilities", tagAbilities);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void b(NBTTagCompound tag)
/* 26:   */   {
/* 27:29 */     if (tag.hasKey("abilities", 10))
/* 28:   */     {
/* 29:30 */       NBTTagCompound tagAbilities = tag.getCompoundTag("abilities");
/* 30:   */       
/* 31:32 */       this.invulnerable = tagAbilities.getBoolean("invulnerable");
/* 32:33 */       this.flying = tagAbilities.getBoolean("flying");
/* 33:34 */       this.mayfly = tagAbilities.getBoolean("mayfly");
/* 34:35 */       this.instabuild = tagAbilities.getBoolean("instabuild");
/* 35:37 */       if (tagAbilities.hasKey("flySpeed", 99))
/* 36:   */       {
/* 37:38 */         this.flySpeed = tagAbilities.getFloat("flySpeed");
/* 38:39 */         this.walkSpeed = tagAbilities.getFloat("walkSpeed");
/* 39:   */       }
/* 40:41 */       if (tagAbilities.hasKey("mayBuild", 1)) {
/* 41:42 */         this.mayBuild = tagAbilities.getBoolean("mayBuild");
/* 42:   */       }
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   public float getFlySpeed()
/* 47:   */   {
/* 48:48 */     return this.flySpeed;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setFlySpeed(float paramFloat)
/* 52:   */   {
/* 53:52 */     this.flySpeed = paramFloat;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public float getWalkSpeed()
/* 57:   */   {
/* 58:56 */     return this.walkSpeed;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setWalkSpeed(float paramFloat)
/* 62:   */   {
/* 63:60 */     this.walkSpeed = paramFloat;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aha
 * JD-Core Version:    0.7.0.1
 */