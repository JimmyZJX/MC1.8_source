package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class eg
/*  4:   */   implements eo
/*  5:   */ {
/*  6:   */   public final ItemStack a(dz paramdz, ItemStack paramamj)
/*  7:   */   {
/*  8:12 */     ItemStack localamj = b(paramdz, paramamj);
/*  9:   */     
/* 10:14 */     a(paramdz);
/* 11:15 */     a(paramdz, ave.b(paramdz.f()));
/* 12:   */     
/* 13:17 */     return localamj;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected ItemStack b(dz paramdz, ItemStack paramamj)
/* 17:   */   {
/* 18:21 */     EnumDirection localej = ave.b(paramdz.f());
/* 19:22 */     ex localex = ave.a(paramdz);
/* 20:   */     
/* 21:24 */     ItemStack localamj = paramamj.split(1);
/* 22:   */     
/* 23:26 */     a(paramdz.i(), localamj, 6, localej, localex);
/* 24:   */     
/* 25:28 */     return paramamj;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public static void a(World paramaqu, ItemStack paramamj, int paramInt, EnumDirection paramej, ex paramex)
/* 29:   */   {
/* 30:32 */     double d1 = paramex.a();
/* 31:33 */     double d2 = paramex.b();
/* 32:34 */     double d3 = paramex.c();
/* 33:36 */     if (paramej.getAxis() == EnumAxis.Y) {
/* 34:38 */       d2 -= 0.125D;
/* 35:   */     } else {
/* 36:41 */       d2 -= 0.15625D;
/* 37:   */     }
/* 38:44 */     EntityItem entityItem = new EntityItem(paramaqu, d1, d2, d3, paramamj);
/* 39:   */     
/* 40:46 */     double d4 = paramaqu.rng.nextDouble() * 0.1D + 0.2D;
/* 41:47 */     entityItem.xVelocity = (paramej.g() * d4);
/* 42:48 */     entityItem.yVelocity = 0.2000000029802322D;
/* 43:49 */     entityItem.zVelocity = (paramej.i() * d4);
/* 44:   */     
/* 45:51 */     entityItem.xVelocity += paramaqu.rng.nextGaussian() * 0.007499999832361937D * paramInt;
/* 46:52 */     entityItem.yVelocity += paramaqu.rng.nextGaussian() * 0.007499999832361937D * paramInt;
/* 47:53 */     entityItem.zVelocity += paramaqu.rng.nextGaussian() * 0.007499999832361937D * paramInt;
/* 48:   */     
/* 49:55 */     paramaqu.spawnEntity(entityItem);
/* 50:   */   }
/* 51:   */   
/* 52:   */   protected void a(dz paramdz)
/* 53:   */   {
/* 54:59 */     paramdz.i().playLevelEvent(1000, paramdz.d(), 0);
/* 55:   */   }
/* 56:   */   
/* 57:   */   protected void a(dz paramdz, EnumDirection paramej)
/* 58:   */   {
/* 59:63 */     paramdz.i().playLevelEvent(2000, paramdz.d(), a(paramej));
/* 60:   */   }
/* 61:   */   
/* 62:   */   private int a(EnumDirection paramej)
/* 63:   */   {
/* 64:67 */     return paramej.g() + 1 + (paramej.i() + 1) * 3;
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     eg
 * JD-Core Version:    0.7.0.1
 */