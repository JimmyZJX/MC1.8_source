package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ class aan <T extends EntityLiving>
/*  4:   */   implements Predicate<EntityLiving>
/*  5:   */ {
			  private final aam<T> a;
/*  6:   */   aan(aam<T> paramaam) {a=paramaam;}
/*  7:   */   
/*  8:   */   public boolean apply(EntityLiving paramxm)
/*  9:   */   {
/* 10:43 */     double d = this.a.f();
/* 11:45 */     if (paramxm.aw()) {
/* 12:46 */       d *= 0.800000011920929D;
/* 13:   */     }
/* 14:48 */     if (paramxm.ay()) {
/* 15:49 */       return false;
/* 16:   */     }
/* 17:51 */     if (paramxm.g(aam.a(this.a)) > d) {
/* 18:52 */       return false;
/* 19:   */     }
/* 20:54 */     return aaw.a(aam.a(this.a), paramxm, false, true);
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aan
 * JD-Core Version:    0.7.0.1
 */