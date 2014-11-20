package net.minecraft.src;
/*  1:   */ public class cru
/*  2:   */   extends cqz<EntityVillager>
/*  3:   */ {
/*  4:10 */   private static final oa a = new oa("textures/entity/villager/villager.png");
/*  5:11 */   private static final oa e = new oa("textures/entity/villager/farmer.png");
/*  6:12 */   private static final oa j = new oa("textures/entity/villager/librarian.png");
/*  7:13 */   private static final oa k = new oa("textures/entity/villager/priest.png");
/*  8:14 */   private static final oa l = new oa("textures/entity/villager/smith.png");
/*  9:15 */   private static final oa m = new oa("textures/entity/villager/butcher.png");
/* 10:   */   
/* 11:   */   public cru(cpt paramcpt)
/* 12:   */   {
/* 13:18 */     super(paramcpt, new cdk(0.0F), 0.5F);
/* 14:   */     
/* 15:20 */     a(new csh(b().a));
/* 16:   */   }
/* 17:   */   
/* 18:   */   public cdk b()
/* 19:   */   {
/* 20:25 */     return (cdk)super.b();
/* 21:   */   }
/* 22:   */   
/* 23:   */   protected oa a(EntityVillager paramagp)
/* 24:   */   {
/* 25:30 */     switch (paramagp.getProfession())
/* 26:   */     {
/* 27:   */     case 0: 
/* 28:32 */       return e;
/* 29:   */     case 1: 
/* 30:34 */       return j;
/* 31:   */     case 2: 
/* 32:36 */       return k;
/* 33:   */     case 3: 
/* 34:38 */       return l;
/* 35:   */     case 4: 
/* 36:40 */       return m;
/* 37:   */     }
/* 38:42 */     return a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void a(EntityVillager paramagp, float paramFloat)
/* 42:   */   {
/* 43:48 */     float f = 0.9375F;
/* 44:49 */     if (paramagp.getAge() < 0)
/* 45:   */     {
/* 46:50 */       f = (float)(f * 0.5D);
/* 47:51 */       this.c = 0.25F;
/* 48:   */     }
/* 49:   */     else
/* 50:   */     {
/* 51:53 */       this.c = 0.5F;
/* 52:   */     }
/* 53:55 */     cjm.glScalef(f, f, f);
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cru
 * JD-Core Version:    0.7.0.1
 */