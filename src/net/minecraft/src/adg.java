package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class adg
/*  4:   */   implements Predicate<Entity>
/*  5:   */ {
/*  6:   */   public boolean apply(Entity paramwv)
/*  7:   */   {
/*  8:56 */     return ((paramwv instanceof EntityLiving)) && (((EntityLiving)paramwv).by() != xs.b);
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adg
 * JD-Core Version:    0.7.0.1
 */