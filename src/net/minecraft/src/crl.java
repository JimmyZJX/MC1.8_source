package net.minecraft.src;
/*  1:   */ public class crl
/*  2:   */   extends cqz<EntitySlime>
/*  3:   */ {
/*  4:10 */   private static final oa a = new oa("textures/entity/slime/slime.png");
/*  5:   */   
/*  6:   */   public crl(cpt paramcpt, ccq paramccq, float paramFloat)
/*  7:   */   {
/*  8:13 */     super(paramcpt, paramccq, paramFloat);
/*  9:   */     
/* 10:15 */     a(new css(this));
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(EntitySlime paramafy, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:20 */     this.c = (0.25F * paramafy.ck());
/* 16:21 */     super.a(paramafy, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(EntitySlime paramafy, float paramFloat)
/* 20:   */   {
/* 21:26 */     float f1 = paramafy.ck();
/* 22:27 */     float f2 = (paramafy.c + (paramafy.b - paramafy.c) * paramFloat) / (f1 * 0.5F + 1.0F);
/* 23:28 */     float f3 = 1.0F / (f2 + 1.0F);
/* 24:29 */     cjm.glScalef(f3 * f1, 1.0F / f3 * f1, f3 * f1);
/* 25:   */   }
/* 26:   */   
/* 27:   */   protected oa a(EntitySlime paramafy)
/* 28:   */   {
/* 29:34 */     return a;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crl
 * JD-Core Version:    0.7.0.1
 */