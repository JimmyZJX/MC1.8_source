package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ class afn
/*  4:   */   implements Predicate<Entity>
/*  5:   */ {
/*  6:   */   afn(EntityHostileMob paramafm) {}
/*  7:   */   
/*  8:   */   public boolean apply(Entity paramwv)
/*  9:   */   {
/* 10:23 */     return ((paramwv instanceof EntityCreeper)) && (((EntityCreeper)paramwv).ck() > 0);
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afn
 * JD-Core Version:    0.7.0.1
 */