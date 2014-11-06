package net.minecraft.src;
/*  1:   */ public class crj
/*  2:   */   extends cqe<EntitySkeleton>
/*  3:   */ {
/*  4:11 */   private static final oa j = new oa("textures/entity/skeleton/skeleton.png");
/*  5:12 */   private static final oa k = new oa("textures/entity/skeleton/wither_skeleton.png");
/*  6:   */   
/*  7:   */   public crj(cpt paramcpt)
/*  8:   */   {
/*  9:15 */     super(paramcpt, new cdc(), 0.5F);
/* 10:   */     
/* 11:17 */     a(new csn(this));
/* 12:18 */     a(new crk(this, this));
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected void a(EntitySkeleton paramafw, float paramFloat)
/* 16:   */   {
/* 17:29 */     if (paramafw.ck() == 1) {
/* 18:30 */       cjm.glScalef(1.2F, 1.2F, 1.2F);
/* 19:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void B_()
/* 23:   */   {
/* 24:36 */     cjm.glTranslatef(0.09375F, 0.1875F, 0.0F);
/* 25:   */   }
/* 26:   */   
/* 27:   */   protected oa a(EntitySkeleton paramafw)
/* 28:   */   {
/* 29:41 */     if (paramafw.ck() == 1) {
/* 30:42 */       return k;
/* 31:   */     }
/* 32:44 */     return j;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crj
 * JD-Core Version:    0.7.0.1
 */