package net.minecraft.src;
/*  1:   */ public class cqa
/*  2:   */   extends cqz<EntityGiant>
/*  3:   */ {
/*  4:12 */   private static final oa a = new oa("textures/entity/zombie/zombie.png");
/*  5:   */   private float e;
/*  6:   */   
/*  7:   */   public cqa(cpt paramcpt, ccq paramccq, float paramFloat1, float paramFloat2)
/*  8:   */   {
/*  9:16 */     super(paramcpt, paramccq, paramFloat1 * paramFloat2);
/* 10:   */     
/* 11:18 */     this.e = paramFloat2;
/* 12:   */     
/* 13:20 */     a(new csn(this));
/* 14:21 */     a(new cqb(this, this));
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void B_()
/* 18:   */   {
/* 19:32 */     cjm.glTranslatef(0.0F, 0.1875F, 0.0F);
/* 20:   */   }
/* 21:   */   
/* 22:   */   protected void a(EntityGiant paramaff, float paramFloat)
/* 23:   */   {
/* 24:37 */     cjm.glScalef(this.e, this.e, this.e);
/* 25:   */   }
/* 26:   */   
/* 27:   */   protected oa a(EntityGiant paramaff)
/* 28:   */   {
/* 29:42 */     return a;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqa
 * JD-Core Version:    0.7.0.1
 */