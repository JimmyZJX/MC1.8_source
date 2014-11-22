package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ public class aat
/*  4:   */   extends aaq
/*  5:   */ {
/*  6:   */   private EntityPet g;
/*  7:   */   
/*  8:   */   public aat(EntityPet paramxx, Class paramClass, boolean paramBoolean, Predicate paramPredicate)
/*  9:   */   {
/* 10:11 */     super(paramxx, paramClass, 10, paramBoolean, false, paramPredicate);
/* 11:12 */     this.g = paramxx;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean canStart()
/* 15:   */   {
/* 16:17 */     return (!this.g.cj()) && (super.canStart());
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aat
 * JD-Core Version:    0.7.0.1
 */