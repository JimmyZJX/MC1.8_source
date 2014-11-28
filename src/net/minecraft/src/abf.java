package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class abf
/*  4:   */ {
/*  5:12 */   private static Vec3 a = new Vec3(0.0D, 0.0D, 0.0D);
/*  6:   */   
/*  7:   */   public static Vec3 a(EntityWalkingMob paramxu, int paramInt1, int paramInt2)
/*  8:   */   {
/*  9:15 */     return c(paramxu, paramInt1, paramInt2, null);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public static Vec3 a(EntityWalkingMob paramxu, int paramInt1, int paramInt2, Vec3 parambrw)
/* 13:   */   {
/* 14:19 */     a = parambrw.substract(paramxu.xPos, paramxu.yPos, paramxu.zPos);
/* 15:20 */     return c(paramxu, paramInt1, paramInt2, a);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public static Vec3 b(EntityWalkingMob paramxu, int paramInt1, int paramInt2, Vec3 parambrw)
/* 19:   */   {
/* 20:24 */     a = new Vec3(paramxu.xPos, paramxu.yPos, paramxu.zPos).substract(parambrw);
/* 21:25 */     return c(paramxu, paramInt1, paramInt2, a);
/* 22:   */   }
/* 23:   */   
/* 24:   */   private static Vec3 c(EntityWalkingMob paramxu, int paramInt1, int paramInt2, Vec3 parambrw)
/* 25:   */   {
/* 26:29 */     Random localRandom = paramxu.getRNG();
/* 27:30 */     int i = 0;
/* 28:31 */     int j = 0;int k = 0;int m = 0;
/* 29:32 */     float f1 = -99999.0F;
/* 30:   */     int n;
/* 31:35 */     if (paramxu.ci())
/* 32:   */     {
/* 33:36 */       double d1 = paramxu.cf().dist2(MathUtils.floor(paramxu.xPos), MathUtils.floor(paramxu.yPos), MathUtils.floor(paramxu.zPos)) + 4.0D;
/* 34:37 */       double d2 = paramxu.cg() + paramInt1;
/* 35:38 */       n = d1 < d2 * d2 ? 1 : 0;
/* 36:   */     }
/* 37:   */     else
/* 38:   */     {
/* 39:40 */       n = 0;
/* 40:   */     }
/* 41:44 */     for (int i1 = 0; i1 < 10; i1++)
/* 42:   */     {
/* 43:45 */       int i2 = localRandom.nextInt(2 * paramInt1 + 1) - paramInt1;
/* 44:46 */       int i3 = localRandom.nextInt(2 * paramInt2 + 1) - paramInt2;
/* 45:47 */       int i4 = localRandom.nextInt(2 * paramInt1 + 1) - paramInt1;
/* 46:49 */       if ((parambrw == null) || (i2 * parambrw.x + i4 * parambrw.z >= 0.0D))
/* 47:   */       {
/* 48:53 */         if ((paramxu.ci()) && (paramInt1 > 1))
/* 49:   */         {
/* 50:54 */           BlockPosition localdt = paramxu.cf();
/* 51:55 */           if (paramxu.xPos > localdt.getX()) {
/* 52:56 */             i2 -= localRandom.nextInt(paramInt1 / 2);
/* 53:   */           } else {
/* 54:58 */             i2 += localRandom.nextInt(paramInt1 / 2);
/* 55:   */           }
/* 56:60 */           if (paramxu.zPos > localdt.getZ()) {
/* 57:61 */             i4 -= localRandom.nextInt(paramInt1 / 2);
/* 58:   */           } else {
/* 59:63 */             i4 += localRandom.nextInt(paramInt1 / 2);
/* 60:   */           }
/* 61:   */         }
/* 62:67 */         i2 += MathUtils.floor(paramxu.xPos);
/* 63:68 */         i3 += MathUtils.floor(paramxu.yPos);
/* 64:69 */         i4 += MathUtils.floor(paramxu.zPos);
/* 65:   */         
/* 66:71 */         BlockPosition localdt = new BlockPosition(i2, i3, i4);
/* 67:73 */         if ((n == 0) || (paramxu.d(localdt)))
/* 68:   */         {
/* 69:76 */           float f2 = paramxu.a(localdt);
/* 70:77 */           if (f2 > f1)
/* 71:   */           {
/* 72:78 */             f1 = f2;
/* 73:79 */             j = i2;
/* 74:80 */             k = i3;
/* 75:81 */             m = i4;
/* 76:82 */             i = 1;
/* 77:   */           }
/* 78:   */         }
/* 79:   */       }
/* 80:   */     }
/* 81:85 */     if (i != 0) {
/* 82:86 */       return new Vec3(j, k, m);
/* 83:   */     }
/* 84:89 */     return null;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abf
 * JD-Core Version:    0.7.0.1
 */