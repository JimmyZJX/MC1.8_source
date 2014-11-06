package net.minecraft.src;
/*  1:   */ public class crb
/*  2:   */   extends cqz<EntityOcelot>
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/cat/black.png");
/*  5:10 */   private static final oa e = new oa("textures/entity/cat/ocelot.png");
/*  6:11 */   private static final oa j = new oa("textures/entity/cat/red.png");
/*  7:12 */   private static final oa k = new oa("textures/entity/cat/siamese.png");
/*  8:   */   
/*  9:   */   public crb(cpt paramcpt, ccq paramccq, float paramFloat)
/* 10:   */   {
/* 11:15 */     super(paramcpt, paramccq, paramFloat);
/* 12:   */   }
/* 13:   */   
/* 14:   */   protected oa a(EntityOcelot paramaby)
/* 15:   */   {
/* 16:20 */     switch (paramaby.cr())
/* 17:   */     {
/* 18:   */     case 0: 
/* 19:   */     default: 
/* 20:23 */       return e;
/* 21:   */     case 1: 
/* 22:25 */       return a;
/* 23:   */     case 2: 
/* 24:27 */       return j;
/* 25:   */     }
/* 26:29 */     //return k;
/* 27:   */   }
/* 28:   */   
/* 29:   */   protected void a(EntityOcelot paramaby, float paramFloat)
/* 30:   */   {
/* 31:35 */     super.a(paramaby, paramFloat);
/* 32:36 */     if (paramaby.cj()) {
/* 33:37 */       cjm.glScalef(0.8F, 0.8F, 0.8F);
/* 34:   */     }
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crb
 * JD-Core Version:    0.7.0.1
 */