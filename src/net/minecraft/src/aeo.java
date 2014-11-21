package net.minecraft.src;
/*  1:   */ public class aeo
/*  2:   */   extends EntitySpider
/*  3:   */ {
/*  4:   */   public aeo(World paramaqu)
/*  5:   */   {
/*  6:17 */     super(paramaqu);
/*  7:18 */     a(0.7F, 0.5F);
/*  8:   */   }
/*  9:   */   
/* 10:   */   protected void aW()
/* 11:   */   {
/* 12:23 */     super.aW();
/* 13:   */     
/* 14:25 */     a(afs.a).a(12.0D);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean r(Entity paramwv)
/* 18:   */   {
/* 19:30 */     if (super.r(paramwv))
/* 20:   */     {
/* 21:31 */       if ((paramwv instanceof EntityLiving))
/* 22:   */       {
/* 23:32 */         int i = 0;
/* 24:33 */         if (this.world.getDifficulty() == EnumDifficulty.NORMAL) {
/* 25:34 */           i = 7;
/* 26:35 */         } else if (this.world.getDifficulty() == EnumDifficulty.HARD) {
/* 27:36 */           i = 15;
/* 28:   */         }
/* 29:39 */         if (i > 0) {
/* 30:40 */           ((EntityLiving)paramwv).c(new PotionEffect(Potion.poison.id, i * 20, 0));
/* 31:   */         }
/* 32:   */       }
/* 33:44 */       return true;
/* 34:   */     }
/* 35:46 */     return false;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 39:   */   {
/* 40:53 */     return paramxq;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public float getEyeHeight()
/* 44:   */   {
/* 45:58 */     return 0.45F;
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aeo
 * JD-Core Version:    0.7.0.1
 */