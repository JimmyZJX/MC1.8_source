package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ public class xj
/*  4:   */   implements Predicate<Entity>
/*  5:   */ {
/*  6:   */   private final ItemStack a;
/*  7:   */   
/*  8:   */   public xj(ItemStack paramamj)
/*  9:   */   {
/* 10:42 */     this.a = paramamj;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean apply(Entity paramwv)
/* 14:   */   {
/* 15:47 */     if (!paramwv.ai()) {
/* 16:48 */       return false;
/* 17:   */     }
/* 18:50 */     if (!(paramwv instanceof EntityLiving)) {
/* 19:51 */       return false;
/* 20:   */     }
/* 21:53 */     EntityLiving localxm = (EntityLiving)paramwv;
/* 22:54 */     if (localxm.p(EntityMob.c(this.a)) != null) {
/* 23:55 */       return false;
/* 24:   */     }
/* 25:58 */     if ((localxm instanceof EntityMob)) {
/* 26:59 */       return ((EntityMob)localxm).bX();
/* 27:   */     }
/* 28:60 */     if ((localxm instanceof EntityArmorStand)) {
/* 29:61 */       return true;
/* 30:   */     }
/* 31:62 */     if ((localxm instanceof EntityPlayer)) {
/* 32:63 */       return true;
/* 33:   */     }
/* 34:66 */     return false;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xj
 * JD-Core Version:    0.7.0.1
 */