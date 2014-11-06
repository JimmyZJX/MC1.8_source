package net.minecraft.src;
/*  1:   */ public class crt
/*  2:   */   extends cqz<EntityIronGolem>
/*  3:   */ {
/*  4:10 */   private static final oa a = new oa("textures/entity/iron_golem.png");
/*  5:   */   
/*  6:   */   public crt(cpt paramcpt)
/*  7:   */   {
/*  8:13 */     super(paramcpt, new cdj(), 0.5F);
/*  9:   */     
/* 10:15 */     a(new csw(this));
/* 11:   */   }
/* 12:   */   
/* 13:   */   protected oa a(EntityIronGolem paramacq)
/* 14:   */   {
/* 15:20 */     return a;
/* 16:   */   }
/* 17:   */   
/* 18:   */   protected void a(EntityIronGolem paramacq, float paramFloat1, float paramFloat2, float paramFloat3)
/* 19:   */   {
/* 20:25 */     super.a(paramacq, paramFloat1, paramFloat2, paramFloat3);
/* 21:26 */     if (paramacq.az < 0.01D) {
/* 22:27 */       return;
/* 23:   */     }
/* 24:30 */     float f1 = 13.0F;
/* 25:31 */     float f2 = paramacq.aA - paramacq.az * (1.0F - paramFloat3) + 6.0F;
/* 26:32 */     float f3 = (Math.abs(f2 % f1 - f1 * 0.5F) - f1 * 0.25F) / (f1 * 0.25F);
/* 27:33 */     cjm.glRotatef(6.5F * f3, 0.0F, 0.0F, 1.0F);
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crt
 * JD-Core Version:    0.7.0.1
 */