package net.minecraft.src;
/*  1:   */ public class EntityMooshroom
/*  2:   */   extends EntityCow
/*  3:   */ {
/*  4:   */   public EntityMooshroom(World paramaqu)
/*  5:   */   {
/*  6:14 */     super(paramaqu);
/*  7:15 */     a(0.9F, 1.3F);
/*  8:16 */     this.bl = BlockList.bw;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean onRightClickMob(EntityPlayer paramahd)
/* 12:   */   {
/* 13:21 */     ItemStack localamj = paramahd.inventory.getHeldItem();
/* 14:22 */     if ((localamj != null) && (localamj.getItem() == ItemList.z) && (getAge() >= 0))
/* 15:   */     {
/* 16:23 */       if (localamj.stackSize == 1)
/* 17:   */       {
/* 18:24 */         paramahd.inventory.a(paramahd.inventory.c, new ItemStack(ItemList.A));
/* 19:25 */         return true;
/* 20:   */       }
/* 21:28 */       if ((paramahd.inventory.a(new ItemStack(ItemList.A))) && (!paramahd.abilities.instabuild))
/* 22:   */       {
/* 23:29 */         paramahd.inventory.removeItems(paramahd.inventory.c, 1);
/* 24:30 */         return true;
/* 25:   */       }
/* 26:   */     }
/* 27:33 */     if ((localamj != null) && (localamj.getItem() == ItemList.shears) && (getAge() >= 0))
/* 28:   */     {
/* 29:34 */       setDead();
/* 30:35 */       this.world.a(EnumParticleEffect.EXPLOSION_LARGE, this.xPos, this.yPos + this.height / 2.0F, this.zPos, 0.0D, 0.0D, 0.0D, new int[0]);
/* 31:36 */       if (!this.world.isClient)
/* 32:   */       {
/* 33:37 */         EntityCow localabs = new EntityCow(this.world);
/* 34:38 */         localabs.setPositionAndAngles(this.xPos, this.yPos, this.zPos, this.yaw, this.pitch);
/* 35:39 */         localabs.h(getHealth());
/* 36:40 */         localabs.aG = this.aG;
/* 37:41 */         if (k_()) {
/* 38:42 */           localabs.a(aL());
/* 39:   */         }
/* 40:44 */         this.world.spawnEntity(localabs);
/* 41:45 */         for (int i = 0; i < 5; i++) {
/* 42:46 */           this.world.spawnEntity(new EntityItem(this.world, this.xPos, this.yPos + this.height, this.zPos, new ItemStack(BlockList.redMushroom)));
/* 43:   */         }
/* 44:48 */         localamj.a(1, paramahd);
/* 45:49 */         a("mob.sheep.shear", 1.0F, 1.0F);
/* 46:   */       }
/* 47:51 */       return true;
/* 48:   */     }
/* 49:53 */     return super.onRightClickMob(paramahd);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public EntityMooshroom c(EntityPassiveMob paramws)
/* 53:   */   {
/* 54:58 */     return new EntityMooshroom(this.world);
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abx
 * JD-Core Version:    0.7.0.1
 */