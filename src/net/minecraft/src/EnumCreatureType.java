package net.minecraft.src;
/*  1:   */ public enum EnumCreatureType
/*  2:   */ { MONSTER(aex.class,70,Material.air,false,false),
			  CREATURE(EntityAnimal.class,10,Material.air,true,true),
			  AMBIENT(EntityAmbientMob.class,15,Material.air,true,false),
			  WATER_CREATURE(EntityWaterMob.class,5,Material.water,true,false);
/*  3:   */   private final Class<?> e;
/*  4:   */   private final int f;
/*  5:   */   private final Material g;
/*  6:   */   private final boolean isPeaceful;
/*  7:   */   private final boolean isAnimal;
/*  8:   */   
/*  9:   */   private EnumCreatureType(Class<?> paramClass, int paramInt, Material parambof, boolean paramBoolean1, boolean isAnimal)
/* 10:   */   {
/* 11:29 */     this.e = paramClass;
/* 12:30 */     this.f = paramInt;
/* 13:31 */     this.g = parambof;
/* 14:32 */     this.isPeaceful = paramBoolean1;
/* 15:33 */     this.isAnimal = isAnimal;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public Class<?> getCreatureClass()
/* 19:   */   {
/* 20:37 */     return this.e;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int getMobCap()
/* 24:   */   {
/* 25:41 */     return this.f;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public boolean getIsPeaceful()
/* 29:   */   {
/* 30:49 */     return this.isPeaceful;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean getIsAnimal()
/* 34:   */   {
/* 35:53 */     return this.isAnimal;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xp
 * JD-Core Version:    0.7.0.1
 */