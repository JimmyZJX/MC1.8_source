package net.minecraft.src;
/*  1:   */ public class cpx
/*  2:   */   extends cpu<ahl>
/*  3:   */ {
/*  4:   */   private float a;
/*  5:   */   
/*  6:   */   public cpx(cpt paramcpt, float paramFloat)
/*  7:   */   {
/*  8:17 */     super(paramcpt);
/*  9:18 */     this.a = paramFloat;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(ahl paramahl, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 13:   */   {
/* 14:23 */     cjm.glPushMatrix();
/* 15:   */     
/* 16:25 */     c(paramahl);
/* 17:   */     
/* 18:27 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 19:28 */     cjm.B();
/* 20:29 */     float f1 = this.a;
/* 21:30 */     cjm.glScalef(f1 / 1.0F, f1 / 1.0F, f1 / 1.0F);
/* 22:   */     
/* 23:32 */     cue localcue = bsu.z().af().a().a(ItemList.bL);
/* 24:33 */     ckx localckx = ckx.getInstance();
/* 25:34 */     VertexBuffer localciv = localckx.getBuffer();
/* 26:   */     
/* 27:36 */     float f2 = localcue.e();
/* 28:37 */     float f3 = localcue.f();
/* 29:38 */     float f4 = localcue.g();
/* 30:39 */     float f5 = localcue.h();
/* 31:   */     
/* 32:41 */     float f6 = 1.0F;
/* 33:42 */     float f7 = 0.5F;
/* 34:43 */     float f8 = 0.25F;
/* 35:   */     
/* 36:45 */     cjm.glRotatef(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
/* 37:46 */     cjm.glRotatef(-this.b.f, 1.0F, 0.0F, 0.0F);
/* 38:47 */     localciv.begin();
/* 39:48 */     localciv.d(0.0F, 1.0F, 0.0F);
/* 40:49 */     localciv.addVertexWithUV(0.0F - f7, 0.0F - f8, 0.0D, f2, f5);
/* 41:50 */     localciv.addVertexWithUV(f6 - f7, 0.0F - f8, 0.0D, f3, f5);
/* 42:51 */     localciv.addVertexWithUV(f6 - f7, 1.0F - f8, 0.0D, f3, f4);
/* 43:52 */     localciv.addVertexWithUV(0.0F - f7, 1.0F - f8, 0.0D, f2, f4);
/* 44:53 */     localckx.draw();
/* 45:   */     
/* 46:55 */     cjm.C();
/* 47:56 */     cjm.glPopMatrix();
/* 48:   */     
/* 49:58 */     super.a(paramahl, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 50:   */   }
/* 51:   */   
/* 52:   */   protected oa a(ahl paramahl)
/* 53:   */   {
/* 54:63 */     return cua.g;
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpx
 * JD-Core Version:    0.7.0.1
 */