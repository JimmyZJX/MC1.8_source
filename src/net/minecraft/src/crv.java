package net.minecraft.src;
/*  1:   */ public class crv
/*  2:   */   extends cqz<EntityWitch>
/*  3:   */ {
/*  4:10 */   private static final oa a = new oa("textures/entity/witch.png");
/*  5:   */   
/*  6:   */   public crv(cpt paramcpt)
/*  7:   */   {
/*  8:13 */     super(paramcpt, new cdm(0.0F), 0.5F);
/*  9:   */     
/* 10:15 */     a(new csx(this));
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(EntityWitch paramagi, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:20 */     ((cdm)this.f).g = (paramagi.getHeldItemStack() != null);
/* 16:   */     
/* 17:22 */     super.a(paramagi, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 18:   */   }
/* 19:   */   
/* 20:   */   protected oa a(EntityWitch paramagi)
/* 21:   */   {
/* 22:27 */     return a;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void B_()
/* 26:   */   {
/* 27:32 */     cjm.glTranslatef(0.0F, 0.1875F, 0.0F);
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected void a(EntityWitch paramagi, float paramFloat)
/* 31:   */   {
/* 32:37 */     float f = 0.9375F;
/* 33:38 */     cjm.glScalef(f, f, f);
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crv
 * JD-Core Version:    0.7.0.1
 */