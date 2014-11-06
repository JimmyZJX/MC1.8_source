package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ class aar
/*  4:   */   implements Predicate<EntityLiving>
/*  5:   */ {
			  private final Predicate<EntityLiving> a;
			  private final aaq b;
/*  6:   */   aar(aaq paramaaq, Predicate<EntityLiving> paramPredicate) {a=paramPredicate;b=paramaaq;}
/*  7:   */   
/*  8:   */   public boolean apply(EntityLiving paramxm)
/*  9:   */   {
/* 10:40 */     if ((this.a != null) && (!this.a.apply(paramxm))) {
/* 11:41 */       return false;
/* 12:   */     }
/* 13:43 */     if ((paramxm instanceof EntityPlayer))
/* 14:   */     {
/* 15:44 */       double d = this.b.f();
/* 16:46 */       if (paramxm.aw()) {
/* 17:47 */         d *= 0.800000011920929D;
/* 18:   */       }
/* 19:49 */       if (paramxm.ay())
/* 20:   */       {
/* 21:50 */         float f = ((EntityPlayer)paramxm).bX();
/* 22:51 */         if (f < 0.1F) {
/* 23:52 */           f = 0.1F;
/* 24:   */         }
/* 25:54 */         d *= 0.7F * f;
/* 26:   */       }
/* 27:56 */       if (paramxm.g(this.b.e) > d) {
/* 28:57 */         return false;
/* 29:   */       }
/* 30:   */     }
/* 31:60 */     return this.b.a(paramxm, false);
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aar
 * JD-Core Version:    0.7.0.1
 */