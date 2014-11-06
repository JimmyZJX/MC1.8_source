package net.minecraft.src;
/*  1:   */ public class crp<T extends Entity>
/*  2:   */   extends cpu<T>
/*  3:   */ {
/*  4:   */   protected final Item a;
/*  5:   */   private final cqh e;
/*  6:   */   
/*  7:   */   public crp(cpt paramcpt, Item paramalq, cqh paramcqh)
/*  8:   */   {
/*  9:15 */     super(paramcpt);
/* 10:16 */     this.a = paramalq;
/* 11:17 */     this.e = paramcqh;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(T paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 15:   */   {
/* 16:22 */     cjm.glPushMatrix();
/* 17:   */     
/* 18:24 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 19:25 */     cjm.B();
/* 20:26 */     cjm.glScalef(0.5F, 0.5F, 0.5F);
/* 21:   */     
/* 22:28 */     cjm.glRotatef(-this.b.e, 0.0F, 1.0F, 0.0F);
/* 23:29 */     cjm.glRotatef(this.b.f, 1.0F, 0.0F, 0.0F);
/* 24:   */     
/* 25:31 */     a(cua.g);
/* 26:32 */     this.e.b(d(paramwv));
/* 27:   */     
/* 28:34 */     cjm.C();
/* 29:35 */     cjm.glPopMatrix();
/* 30:   */     
/* 31:37 */     super.a(paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public ItemStack d(T paramwv)
/* 35:   */   {
/* 36:41 */     return new ItemStack(this.a, 1, 0);
/* 37:   */   }
/* 38:   */   
/* 39:   */   protected oa a(T paramwv)
/* 40:   */   {
/* 41:46 */     return cua.g;
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crp
 * JD-Core Version:    0.7.0.1
 */