package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class csd
/*  5:   */   implements csq
/*  6:   */ {
/*  7:   */   private final cqv a;
/*  8:   */   
/*  9:   */   public csd(cqv paramcqv)
/* 10:   */   {
/* 11:19 */     this.a = paramcqv;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 15:   */   {
/* 16:24 */     int i = paramxm.bu();
/* 17:25 */     if (i <= 0) {
/* 18:26 */       return;
/* 19:   */     }
/* 20:28 */     EntityArrow localahj = new EntityArrow(paramxm.world, paramxm.xPos, paramxm.yPos, paramxm.zPos);
/* 21:29 */     Random localRandom = new Random(paramxm.getID());
/* 22:30 */     bss.a();
/* 23:31 */     for (int j = 0; j < i; j++)
/* 24:   */     {
/* 25:32 */       cjm.glPushMatrix();
/* 26:33 */       cdy localcdy = this.a.b().a(localRandom);
/* 27:34 */       cdt localcdt = (cdt)localcdy.l.get(localRandom.nextInt(localcdy.l.size()));
/* 28:35 */       localcdy.c(0.0625F);
/* 29:36 */       float f1 = localRandom.nextFloat();
/* 30:37 */       float f2 = localRandom.nextFloat();
/* 31:38 */       float f3 = localRandom.nextFloat();
/* 32:39 */       float f4 = (localcdt.a + (localcdt.d - localcdt.a) * f1) / 16.0F;
/* 33:40 */       float f5 = (localcdt.b + (localcdt.e - localcdt.b) * f2) / 16.0F;
/* 34:41 */       float f6 = (localcdt.c + (localcdt.f - localcdt.c) * f3) / 16.0F;
/* 35:42 */       cjm.glTranslatef(f4, f5, f6);
/* 36:43 */       f1 = f1 * 2.0F - 1.0F;
/* 37:44 */       f2 = f2 * 2.0F - 1.0F;
/* 38:45 */       f3 = f3 * 2.0F - 1.0F;
/* 39:   */       
/* 40:47 */       f1 *= -1.0F;
/* 41:48 */       f2 *= -1.0F;
/* 42:49 */       f3 *= -1.0F;
/* 43:   */       
/* 44:51 */       float f7 = MathUtils.sqrt(f1 * f1 + f3 * f3);
/* 45:52 */       localahj.lastYaw = (localahj.yaw = (float)(Math.atan2(f1, f3) * 180.0D / 3.141592741012573D));
/* 46:53 */       localahj.lastPitch = (localahj.pitch = (float)(Math.atan2(f2, f7) * 180.0D / 3.141592741012573D));
/* 47:54 */       double d1 = 0.0D;
/* 48:55 */       double d2 = 0.0D;
/* 49:56 */       double d3 = 0.0D;
/* 50:57 */       this.a.d().a(localahj, d1, d2, d3, 0.0F, paramFloat3);
/* 51:58 */       cjm.glPopMatrix();
/* 52:   */     }
/* 53:60 */     bss.b();
/* 54:   */   }
/* 55:   */   
/* 56:   */   public boolean b()
/* 57:   */   {
/* 58:65 */     return false;
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csd
 * JD-Core Version:    0.7.0.1
 */