package net.minecraft.src;
/*  1:   */ public class cry
/*  2:   */   extends cqz<EntityWolf>
/*  3:   */ {
/*  4:10 */   private static final oa a = new oa("textures/entity/wolf/wolf.png");
/*  5:11 */   private static final oa e = new oa("textures/entity/wolf/wolf_tame.png");
/*  6:12 */   private static final oa j = new oa("textures/entity/wolf/wolf_angry.png");
/*  7:   */   
/*  8:   */   public cry(cpt paramcpt, ccq paramccq, float paramFloat)
/*  9:   */   {
/* 10:15 */     super(paramcpt, paramccq, paramFloat);
/* 11:   */     
/* 12:17 */     a(new csz(this));
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected float b(EntityWolf paramacu, float paramFloat)
/* 16:   */   {
/* 17:22 */     return paramacu.cs();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(EntityWolf paramacu, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 21:   */   {
/* 22:28 */     if (paramacu.cr())
/* 23:   */     {
/* 24:29 */       float f = paramacu.c(paramFloat2) * paramacu.o(paramFloat2);
/* 25:30 */       cjm.c(f, f, f);
/* 26:   */     }
/* 27:33 */     super.a(paramacu, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected oa a(EntityWolf paramacu)
/* 31:   */   {
/* 32:38 */     if (paramacu.cj()) {
/* 33:39 */       return e;
/* 34:   */     }
/* 35:41 */     if (paramacu.ct()) {
/* 36:42 */       return j;
/* 37:   */     }
/* 38:44 */     return a;
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cry
 * JD-Core Version:    0.7.0.1
 */