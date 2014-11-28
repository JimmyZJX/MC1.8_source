package net.minecraft.src;
/*  1:   */ public class EntityGiant
/*  2:   */   extends EntityHostileMob
/*  3:   */ {
/*  4:   */   public EntityGiant(World paramaqu)
/*  5:   */   {
/*  6:10 */     super(paramaqu);
/*  7:11 */     a(this.width * 6.0F, this.height * 6.0F);
/*  8:   */   }
/*  9:   */   
/* 10:   */   public float getEyeHeight()
/* 11:   */   {
/* 12:16 */     return 10.440001F;
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected void aW()
/* 16:   */   {
/* 17:21 */     super.aW();
/* 18:   */     
/* 19:23 */     getAttribute(MobAttribute.maxHealth).a(100.0D);
/* 20:24 */     getAttribute(MobAttribute.movementSpeed).a(0.5D);
/* 21:25 */     getAttribute(MobAttribute.attackDamage).a(50.0D);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public float a(BlockPosition paramdt)
/* 25:   */   {
/* 26:30 */     return this.world.o(paramdt) - 0.5F;
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aff
 * JD-Core Version:    0.7.0.1
 */