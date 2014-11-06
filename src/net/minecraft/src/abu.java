package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class abu
/*  4:   */   implements Predicate<Entity>
/*  5:   */ {
/*  6:   */   public boolean apply(Entity paramwv)
/*  7:   */   {
/*  8:50 */     return ((paramwv instanceof EntityHorse)) && (((EntityHorse)paramwv).cy());
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abu
 * JD-Core Version:    0.7.0.1
 */