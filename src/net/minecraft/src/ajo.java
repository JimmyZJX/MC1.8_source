package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicates;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ final class ajo
/*  5:   */   extends eg
/*  6:   */ {
/*  7:   */   protected ItemStack b(dz paramdz, ItemStack paramamj)
/*  8:   */   {
/*  9:40 */     BlockPosition localdt = paramdz.d().a(ave.b(paramdz.f()));
/* 10:   */     
/* 11:42 */     int i = localdt.getX();
/* 12:43 */     int j = localdt.getY();
/* 13:44 */     int k = localdt.getZ();
/* 14:45 */     AABB localbrt = new AABB(i, j, k, i + 1, j + 1, k + 1);
/* 15:46 */     List localList = paramdz.i().a(EntityLiving.class, localbrt, Predicates.and(xe.d, new xj(paramamj)));
/* 16:48 */     if (localList.size() > 0)
/* 17:   */     {
/* 18:49 */       EntityLiving localxm = (EntityLiving)localList.get(0);
/* 19:50 */       int m = (localxm instanceof EntityPlayer) ? 1 : 0;
/* 20:51 */       int n = EntityMob.getSlot(paramamj);
/* 21:52 */       ItemStack localamj = paramamj.k();
/* 22:53 */       localamj.stackSize = 1;
/* 23:54 */       localxm.setItemStack(n - m, localamj);
/* 24:55 */       if ((localxm instanceof EntityMob)) {
/* 25:56 */         ((EntityMob)localxm).setDropChance(n, 2.0F);
/* 26:   */       }
/* 27:58 */       paramamj.stackSize -= 1;
/* 28:59 */       return paramamj;
/* 29:   */     }
/* 30:61 */     return super.b(paramdz, paramamj);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajo
 * JD-Core Version:    0.7.0.1
 */