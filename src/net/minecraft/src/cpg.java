package net.minecraft.src;
/*  1:   */ import org.lwjgl.opengl.GL11;
/*  2:   */ 
/*  3:   */ public class cpg
/*  4:   */   extends cpu<ahj>
/*  5:   */ {
/*  6:13 */   private static final oa a = new oa("textures/entity/arrow.png");
/*  7:   */   
/*  8:   */   public cpg(cpt paramcpt)
/*  9:   */   {
/* 10:16 */     super(paramcpt);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(ahj paramahj, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:21 */     c(paramahj);
/* 16:   */     
/* 17:23 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 18:24 */     cjm.glPushMatrix();
/* 19:   */     
/* 20:26 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 21:27 */     cjm.glRotatef(paramahj.lastYaw + (paramahj.yaw - paramahj.lastYaw) * paramFloat2 - 90.0F, 0.0F, 1.0F, 0.0F);
/* 22:28 */     cjm.glRotatef(paramahj.lastPitch + (paramahj.pitch - paramahj.lastPitch) * paramFloat2, 0.0F, 0.0F, 1.0F);
/* 23:   */     
/* 24:30 */     ckx localckx = ckx.getInstance();
/* 25:31 */     VertexBuffer localciv = localckx.getBuffer();
/* 26:   */     
/* 27:33 */     int i = 0;
/* 28:   */     
/* 29:35 */     float f1 = 0.0F;
/* 30:36 */     float f2 = 0.5F;
/* 31:37 */     float f3 = (0 + i * 10) / 32.0F;
/* 32:38 */     float f4 = (5 + i * 10) / 32.0F;
/* 33:   */     
/* 34:40 */     float f5 = 0.0F;
/* 35:41 */     float f6 = 0.15625F;
/* 36:42 */     float f7 = (5 + i * 10) / 32.0F;
/* 37:43 */     float f8 = (10 + i * 10) / 32.0F;
/* 38:44 */     float f9 = 0.05625F;
/* 39:45 */     cjm.B();
/* 40:46 */     float f10 = paramahj.b - paramFloat2;
/* 41:47 */     if (f10 > 0.0F)
/* 42:   */     {
/* 43:48 */       float f11 = -MathUtils.sin(f10 * 3.0F) * f10;
/* 44:49 */       cjm.glRotatef(f11, 0.0F, 0.0F, 1.0F);
/* 45:   */     }
/* 46:51 */     cjm.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
/* 47:52 */     cjm.glScalef(f9, f9, f9);
/* 48:   */     
/* 49:54 */     cjm.glTranslatef(-4.0F, 0.0F, 0.0F);
/* 50:   */     
/* 51:56 */     GL11.glNormal3f(f9, 0.0F, 0.0F);
/* 52:57 */     localciv.begin();
/* 53:58 */     localciv.addVertexWithUV(-7.0D, -2.0D, -2.0D, f5, f7);
/* 54:59 */     localciv.addVertexWithUV(-7.0D, -2.0D, 2.0D, f6, f7);
/* 55:60 */     localciv.addVertexWithUV(-7.0D, 2.0D, 2.0D, f6, f8);
/* 56:61 */     localciv.addVertexWithUV(-7.0D, 2.0D, -2.0D, f5, f8);
/* 57:62 */     localckx.draw();
/* 58:   */     
/* 59:64 */     GL11.glNormal3f(-f9, 0.0F, 0.0F);
/* 60:65 */     localciv.begin();
/* 61:66 */     localciv.addVertexWithUV(-7.0D, 2.0D, -2.0D, f5, f7);
/* 62:67 */     localciv.addVertexWithUV(-7.0D, 2.0D, 2.0D, f6, f7);
/* 63:68 */     localciv.addVertexWithUV(-7.0D, -2.0D, 2.0D, f6, f8);
/* 64:69 */     localciv.addVertexWithUV(-7.0D, -2.0D, -2.0D, f5, f8);
/* 65:70 */     localckx.draw();
/* 66:72 */     for (int j = 0; j < 4; j++)
/* 67:   */     {
/* 68:73 */       cjm.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 69:74 */       GL11.glNormal3f(0.0F, 0.0F, f9);
/* 70:75 */       localciv.begin();
/* 71:76 */       localciv.addVertexWithUV(-8.0D, -2.0D, 0.0D, f1, f3);
/* 72:77 */       localciv.addVertexWithUV(8.0D, -2.0D, 0.0D, f2, f3);
/* 73:78 */       localciv.addVertexWithUV(8.0D, 2.0D, 0.0D, f2, f4);
/* 74:79 */       localciv.addVertexWithUV(-8.0D, 2.0D, 0.0D, f1, f4);
/* 75:80 */       localckx.draw();
/* 76:   */     }
/* 77:83 */     cjm.C();
/* 78:84 */     cjm.glPopMatrix();
/* 79:   */     
/* 80:86 */     super.a(paramahj, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 81:   */   }
/* 82:   */   
/* 83:   */   protected oa a(ahj paramahj)
/* 84:   */   {
/* 85:91 */     return a;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpg
 * JD-Core Version:    0.7.0.1
 */