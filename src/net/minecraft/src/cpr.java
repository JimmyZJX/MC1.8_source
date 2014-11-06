package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cpr
/*  4:   */   extends cqz<EntityEnderman>
/*  5:   */ {
/*  6:13 */   private static final oa a = new oa("textures/entity/enderman/enderman.png");
/*  7:   */   private ccf e;
/*  8:15 */   private Random j = new Random();
/*  9:   */   
/* 10:   */   public cpr(cpt paramcpt)
/* 11:   */   {
/* 12:18 */     super(paramcpt, new ccf(0.0F), 0.5F);
/* 13:19 */     this.e = ((ccf)this.f);
/* 14:   */     
/* 15:21 */     a(new csl(this));
/* 16:22 */     a(new csf(this));
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(EntityEnderman paramaer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 20:   */   {
/* 21:28 */     this.e.a = (paramaer.ck().getProto().getMaterial() != Material.air);
/* 22:29 */     this.e.b = paramaer.cm();
/* 23:31 */     if (paramaer.cm())
/* 24:   */     {
/* 25:32 */       double d = 0.02D;
/* 26:33 */       paramDouble1 += this.j.nextGaussian() * d;
/* 27:34 */       paramDouble3 += this.j.nextGaussian() * d;
/* 28:   */     }
/* 29:37 */     super.a(paramaer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected oa a(EntityEnderman paramaer)
/* 33:   */   {
/* 34:42 */     return a;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpr
 * JD-Core Version:    0.7.0.1
 */