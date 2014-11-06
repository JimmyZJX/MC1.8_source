package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.HashMap;
/*  3:   */ 
/*  4:   */ public class xr
/*  5:   */ {
/*  6:14 */   private static final HashMap<Class<? extends EntityMob>,xo> a = Maps.newHashMap();
/*  7:   */   
/*  8:   */   public static xo a(Class<? extends EntityMob> paramClass)
/*  9:   */   {
/* 10:17 */     return a.get(paramClass);
/* 11:   */   }
/* 12:   */   
/* 13:   */   static
/* 14:   */   {
/* 15:22 */     a.put(EntityBat.class, xo.ON_GROUND);
/* 16:23 */     a.put(EntityChicken.class, xo.ON_GROUND);
/* 17:24 */     a.put(EntityCow.class, xo.ON_GROUND);
/* 18:25 */     a.put(EntityHorse.class, xo.ON_GROUND);
/* 19:26 */     a.put(EntityMooshroom.class, xo.ON_GROUND);
/* 20:27 */     a.put(EntityOcelot.class, xo.ON_GROUND);
/* 21:28 */     a.put(EntityPig.class, xo.ON_GROUND);
/* 22:29 */     a.put(EntityRabbit.class, xo.ON_GROUND);
/* 23:30 */     a.put(EntitySheep.class, xo.ON_GROUND);
/* 24:31 */     a.put(EntitySnowGolem.class, xo.ON_GROUND);
/* 25:32 */     a.put(EntitySquid.class, xo.IN_WATER);
/* 26:33 */     a.put(EntityIronGolem.class, xo.ON_GROUND);
/* 27:34 */     a.put(EntityWolf.class, xo.ON_GROUND);
/* 28:   */     
/* 29:36 */     a.put(EntityVillager.class, xo.ON_GROUND);
/* 30:   */     
/* 31:38 */     a.put(EntityEnderDragon.class, xo.ON_GROUND);
/* 32:39 */     a.put(EntityWither.class, xo.ON_GROUND);
/* 33:   */     
/* 34:41 */     a.put(EntityBlaze.class, xo.ON_GROUND);
/* 35:42 */     a.put(aeo.class, xo.ON_GROUND);
/* 36:43 */     a.put(EntityCreeper.class, xo.ON_GROUND);
/* 37:44 */     a.put(EntityEnderman.class, xo.ON_GROUND);
/* 38:45 */     a.put(EntityEndermite.class, xo.ON_GROUND);
/* 39:46 */     a.put(EntityGhast.class, xo.ON_GROUND);
/* 40:47 */     a.put(EntityGiant.class, xo.ON_GROUND);
/* 41:48 */     a.put(EntityGuardian.class, xo.IN_WATER);
/* 42:49 */     a.put(EntityLavaSlime.class, xo.ON_GROUND);
/* 43:50 */     a.put(EntityZombiePigman.class, xo.ON_GROUND);
/* 44:51 */     a.put(EntitySilverfish.class, xo.ON_GROUND);
/* 45:52 */     a.put(EntitySkeleton.class, xo.ON_GROUND);
/* 46:53 */     a.put(EntitySlime.class, xo.ON_GROUND);
/* 47:54 */     a.put(EntitySpider.class, xo.ON_GROUND);
/* 48:55 */     a.put(EntityWitch.class, xo.ON_GROUND);
/* 49:56 */     a.put(EntityZombie.class, xo.ON_GROUND);
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xr
 * JD-Core Version:    0.7.0.1
 */