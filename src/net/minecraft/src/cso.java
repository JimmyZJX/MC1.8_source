package net.minecraft.src;
/*  1:   */ public class cso
/*  2:   */   implements csq<EntityMooshroom>
/*  3:   */ {
/*  4:   */   private final cra a;
/*  5:   */   
/*  6:   */   public cso(cra paramcra)
/*  7:   */   {
/*  8:16 */     this.a = paramcra;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(EntityMooshroom paramabx, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:21 */     if ((paramabx.i_()) || (paramabx.ay())) {
/* 14:22 */       return;
/* 15:   */     }
/* 16:25 */     cll localcll = bsu.z().ab();
/* 17:   */     
/* 18:27 */     this.a.a(cua.g);
/* 19:28 */     cjm.o();
/* 20:29 */     cjm.glPushMatrix();
/* 21:30 */     cjm.glScalef(1.0F, -1.0F, 1.0F);
/* 22:   */     
/* 23:32 */     cjm.glTranslatef(0.2F, 0.35F, 0.5F);
/* 24:33 */     cjm.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
/* 25:   */     
/* 26:35 */     cjm.glPushMatrix();
/* 27:36 */     cjm.glTranslatef(-0.5F, -0.5F, 0.5F);
/* 28:37 */     localcll.a(BlockList.redMushroom.instance(), 1.0F);
/* 29:38 */     cjm.glPopMatrix();
/* 30:   */     
/* 31:40 */     cjm.glPushMatrix();
/* 32:41 */     cjm.glTranslatef(0.1F, 0.0F, -0.6F);
/* 33:42 */     cjm.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
/* 34:43 */     cjm.glTranslatef(-0.5F, -0.5F, 0.5F);
/* 35:44 */     localcll.a(BlockList.redMushroom.instance(), 1.0F);
/* 36:45 */     cjm.glPopMatrix();
/* 37:46 */     cjm.glPopMatrix();
/* 38:   */     
/* 39:48 */     cjm.glPushMatrix();
/* 40:49 */     ((ccv)this.a.b()).a.c(0.0625F);
/* 41:50 */     cjm.glScalef(1.0F, -1.0F, 1.0F);
/* 42:51 */     cjm.glTranslatef(0.0F, 0.7F, -0.2F);
/* 43:52 */     cjm.glRotatef(12.0F, 0.0F, 1.0F, 0.0F);
/* 44:53 */     cjm.glTranslatef(-0.5F, -0.5F, 0.5F);
/* 45:54 */     localcll.a(BlockList.redMushroom.instance(), 1.0F);
/* 46:55 */     cjm.glPopMatrix();
/* 47:   */     
/* 48:57 */     cjm.p();
/* 49:   */   }
/* 50:   */   
/* 51:   */   public boolean b()
/* 52:   */   {
/* 53:62 */     return true;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cso
 * JD-Core Version:    0.7.0.1
 */