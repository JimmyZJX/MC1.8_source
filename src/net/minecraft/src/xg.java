package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class xg
/*  4:   */   implements Predicate<Entity>
/*  5:   */ {
/*  6:   */   public boolean apply(Entity entity)
/*  7:   */   {
/*  8:22 */     return (entity.ai()) && (entity.rider == null) && (entity.vehicle == null);
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xg
 * JD-Core Version:    0.7.0.1
 */