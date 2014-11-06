package net.minecraft.src;
/*  1:   */ public class cnt
/*  2:   */   extends cnp<bdg>
/*  3:   */ {
/*  4:   */   public void a(bdg parambdg, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  5:   */   {
/*  6:12 */     cjm.glPushMatrix();
/*  7:13 */     cjm.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2, (float)paramDouble3 + 0.5F);
/*  8:14 */     a(parambdg.b(), paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*  9:15 */     cjm.glPopMatrix();
/* 10:   */   }
/* 11:   */   
/* 12:   */   public static void a(aqi paramaqi, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/* 13:   */   {
/* 14:19 */     Entity localwv = paramaqi.a(paramaqi.a());
/* 15:20 */     if (localwv != null)
/* 16:   */     {
/* 17:21 */       float f = 0.4375F;
/* 18:22 */       cjm.glTranslatef(0.0F, 0.4F, 0.0F);
/* 19:23 */       cjm.glRotatef((float)(paramaqi.e() + (paramaqi.d() - paramaqi.e()) * paramFloat) * 10.0F, 0.0F, 1.0F, 0.0F);
/* 20:24 */       cjm.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
/* 21:25 */       cjm.glTranslatef(0.0F, -0.4F, 0.0F);
/* 22:26 */       cjm.glScalef(f, f, f);
/* 23:27 */       localwv.setPositionAndAngles(paramDouble1, paramDouble2, paramDouble3, 0.0F, 0.0F);
/* 24:28 */       bsu.z().ae().a(localwv, 0.0D, 0.0D, 0.0D, 0.0F, paramFloat);
/* 25:   */     }
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnt
 * JD-Core Version:    0.7.0.1
 */