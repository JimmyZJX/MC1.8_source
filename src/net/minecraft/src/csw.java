package net.minecraft.src;
/*  1:   */ public class csw
/*  2:   */   implements csq<EntityIronGolem>
/*  3:   */ {
/*  4:   */   private final crt a;
/*  5:   */   
/*  6:   */   public csw(crt paramcrt)
/*  7:   */   {
/*  8:18 */     this.a = paramcrt;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(EntityIronGolem paramacq, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:23 */     if (paramacq.ck() == 0) {
/* 14:24 */       return;
/* 15:   */     }
/* 16:27 */     cll localcll = bsu.z().ab();
/* 17:   */     
/* 18:29 */     cjm.B();
/* 19:30 */     cjm.glPushMatrix();
/* 20:   */     
/* 21:   */ 
/* 22:   */ 
/* 23:34 */     cjm.glRotatef(5.0F + 180.0F * ((cdj)this.a.b()).c.f / 3.141593F, 1.0F, 0.0F, 0.0F);
/* 24:35 */     cjm.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 25:36 */     cjm.glTranslatef(-0.9375F, -0.625F, -0.9375F);
/* 26:37 */     float f = 0.5F;
/* 27:38 */     cjm.glScalef(f, -f, f);
/* 28:   */     
/* 29:40 */     int i = paramacq.b(paramFloat3);
/* 30:41 */     int j = i % 65536;
/* 31:42 */     int k = i / 65536;
/* 32:43 */     dax.glMultiTexCoord2f(dax.q, j / 1.0F, k / 1.0F);
/* 33:   */     
/* 34:45 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 35:46 */     this.a.a(cua.g);
/* 36:47 */     localcll.a(BlockList.redFlower.instance(), 1.0F);
/* 37:48 */     cjm.glPopMatrix();
/* 38:49 */     cjm.C();
/* 39:   */   }
/* 40:   */   
/* 41:   */   public boolean b()
/* 42:   */   {
/* 43:54 */     return false;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csw
 * JD-Core Version:    0.7.0.1
 */