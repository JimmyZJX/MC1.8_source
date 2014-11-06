package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class xf
/*  4:   */   implements Predicate<Entity>
/*  5:   */ {
/*  6:   */   public boolean apply(Entity entity)
/*  7:   */   {
/*  8:16 */     return entity.ai();
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xf
 * JD-Core Version:    0.7.0.1
 */